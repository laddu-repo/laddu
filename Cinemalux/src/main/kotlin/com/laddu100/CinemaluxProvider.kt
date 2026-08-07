package com.laddu100

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.base64Decode
import com.lagradost.cloudstream3.utils.*
import com.lagradost.api.Log
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.sync.Semaphore
import kotlinx.coroutines.sync.withPermit
import org.jsoup.nodes.Element
import java.net.URLDecoder
import java.net.URLEncoder
import java.util.concurrent.ConcurrentHashMap

/**
 * Cinemalux - Movie & TV download provider.
 *
 * Site: cinemalux.click (WordPress / Dooplay theme, no Cloudflare)
 *
 * Verified chain (all probed live, zero guesswork):
 *   Homepage    GET /movies/, /series/, /genre/{slug}/   pagination: /page/N/
 *   Search      GET /?s={query}
 *   Detail      GET /movies/{slug}/ or /series/{slug}/
 *   Buttons     a.ep-simple-button  (href=https://tpi.li/{code}, label="1080P BLURAY 2.88 GB")
 *               Movies: grouped per div.secontainer with a "Languages:" header
 *               Series: each button is a SEASON PACK "Season 01 - 720P AMZN WEB-DL (450MB/EP)"
 *   Step 1      GET https://tpi.li/{code} -> hidden form token = {hex}{code}0708{base64url}
 *   Step 2      base64decode(after "0708") -> destination URL:
 *                   https://drive.linkstore.zip/file/{id}    (single file)
 *                   https://linkstore.zip/{id}/               (series episode list)
 *   Step 3      drive file  -> 301 -> new7.luxedrive.dad/file/{id}
 *                   -> href="https://instant-dl-10gbps-now.ultra-fast-r2-cdn.workers.dev/?token=..."
 *                   (some files only have a gdflix.dev mirror, which is CF-challenged -> skipped)
 *   Step 4      GET instant page -> href="https://video-downloads.googleusercontent.com/..."
 *                   -> direct MKV (multi-audio: ExoPlayer audio-track selector works natively)
 *
 * Series packs (linkstore.zip/{id}/) list real episodes:
 *   <a href="https://drive.linkstore.zip/file/{epId}" class="ep-simple-button">
 *       <span>EPISODE - 01 (477.26 MB)</span></a>
 * So each pack is resolved at load() time into REAL episode numbers + names, and each
 * episode carries JSON data with one variant per quality (720P/1080P/...).
 */
class CinemaluxProvider : MainAPI() {
    override var mainUrl = "https://cinemalux.click"
    override var name = "Cinemalux"
    override var lang = "en"
    override val hasMainPage = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries, TvType.AsianDrama, TvType.Anime)

    private val headers = mapOf(
        "User-Agent" to "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36",
        "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
        "Accept-Language" to "en-US,en;q=0.9",
    )

    override val mainPage = mainPageOf(
        "$mainUrl/movies" to "Latest Movies",
        "$mainUrl/series" to "Latest Series",
        "$mainUrl/genre/bollywood" to "Bollywood",
        "$mainUrl/genre/hollywood" to "Hollywood",
        "$mainUrl/genre/korean" to "Korean",
        "$mainUrl/genre/anime" to "Anime",
    )

    // ------------------------------------------------------------------ homepage

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        val url = request.data + if (page <= 1) "/" else "/page/$page/"
        val doc = app.get(url, headers = headers, timeout = 30_000L).document
        val items = doc.select("article.item").mapNotNull { it.toSearchResult() }
        return newHomePageResponse(request.name, items)
    }

    // ------------------------------------------------------------------ search

    override suspend fun search(query: String): List<SearchResponse> {
        val encoded = URLEncoder.encode(query, "UTF-8")
        val doc = app.get("$mainUrl/?s=$encoded", headers = headers, timeout = 30_000L).document
        val items = doc.select("div.result-item article").mapNotNull { it.toSearchResult() }
        // Fallback: the homepage grid is used when WordPress returns items in article.item form
        return items.ifEmpty { doc.select("article.item").mapNotNull { it.toSearchResult() } }
    }

    private fun Element.toSearchResult(): SearchResponse? {
        val a = selectFirst("a[href*='/movies/'], a[href*='/series/']")
            ?: selectFirst("a[href]")
            ?: return null
        val href = a.attr("href").ifBlank { return null }
        val title = selectFirst("h3.title, div.title a, img[alt]")?.let {
            if (it.tagName() == "img") it.attr("alt") else it.text()
        }?.trim()?.ifBlank { null } ?: return null

        val img = selectFirst("img")
        val poster = img?.attr("data-src")?.ifBlank { img.attr("src") }

        val isSeries = hasClass("tvshows")
            || selectFirst("span.item_type, span.tvshows")?.text()?.contains("TV", true) == true
            || href.contains("/series/")

        val year = Regex("""\b(19|20)\d{2}\b""").find(title)?.value
            ?: selectFirst("span.year")?.text()?.trim()

        val tvType = if (isSeries) TvType.TvSeries else TvType.Movie
        return newMovieSearchResponse(title, href, tvType) {
            this.posterUrl = poster
            this.year = year?.toIntOrNull()
        }
    }

    // ------------------------------------------------------------------ details

    override suspend fun load(url: String): LoadResponse? {
        val doc = app.get(url, headers = headers, timeout = 30_000L).document

        val title = doc.selectFirst("div.data h1")?.text()?.trim()?.ifBlank { null }
            ?: doc.selectFirst("h1:not(.text-logo)")?.text()?.trim()?.ifBlank { null }
            ?: doc.selectFirst("meta[property=og:title]")?.attr("content")?.trim()
            ?: return null

        val poster = doc.selectFirst("div.poster img")?.attr("data-src")
            ?.ifBlank { doc.selectFirst("div.poster img")?.attr("src") }
            ?.replace("/w185/", "/w500/")

        val plot = doc.selectFirst("div.wp-content")?.text()?.trim()?.ifBlank { null }
        val genres = doc.select("div.sgeneros a[rel=tag]").mapNotNull { it.text().trim().ifBlank { null } }
        val rating = doc.selectFirst("span.dt_rating_vgs")?.text()?.trim()?.toFloatOrNull()
        val runtime = doc.selectFirst("span.runtime")?.text()?.trim()?.let {
            Regex("""\d+""").find(it)?.value?.toIntOrNull()
        }
        val year = doc.selectFirst("span.date")?.text()?.let {
            Regex("""\b(19|20)\d{2}\b""").find(it)?.value?.toIntOrNull()
        }

        val isSeries = url.contains("/series/")
            || doc.selectFirst("body")?.hasClass("single-tvshows") == true

        // ---- Extract ALL download buttons (movie + series layouts)
        val buttons = extractButtons(doc)
        if (buttons.isEmpty()) return null

        if (!isSeries) {
            // Movie: every download button = one episode (quality + language + size)
            val episodes = buttons.mapIndexed { i, b ->
                newEpisode(listOf(b.toVariant()).toJson()) {
                    this.episode = i + 1
                    this.name = b.displayName
                    this.posterUrl = poster
                }
            }
            return newMovieLoadResponse(title, url, TvType.Movie, episodes) {
                this.posterUrl = poster
                this.plot = plot
                this.tags = genres
                this.score = rating?.let { Score.from10(it) }
                this.year = year
                if (runtime != null) this.duration = runtime * 60_000
            }
        }

        // ---- Series: season packs -> resolve each pack's episode list (real numbers/names)
        val episodes = resolveSeriesEpisodes(buttons, poster)

        return newTvSeriesLoadResponse(title, url, TvType.TvSeries, episodes) {
            this.posterUrl = poster
            this.plot = plot
            this.tags = genres
            this.score = rating?.let { Score.from10(it) }
            this.year = year
        }
    }

    /**
     * Buttons live in different containers:
     *  - movies: div.custom-links > div.secontainer (has "Languages:" header) > a.ep-simple-button
     *  - series: div.custom-links > a.ep-simple-button (label = season pack)
     *  - some movies (e.g. The Prestige): plain a.ep-simple-button "Download Now" (no secontainer)
     * So we just select ALL a.ep-simple-button and, when a secontainer exists nearby, reuse its
     * language header; otherwise the label is used as-is.
     */
    private fun extractButtons(doc: org.jsoup.nodes.Document): List<CinemaluxButton> {
        val out = mutableListOf<CinemaluxButton>()
        // secontainer blocks carry the "Languages:" header
        doc.select("div.secontainer").forEach { container ->
            val lang = container.selectFirst("p")?.text()?.let {
                Regex("""Languages:\s*([A-Za-z][A-Za-z -]*)""").find(it)?.groupValues?.get(1)?.trim()
            }?.ifBlank { null }
            container.select("a.ep-simple-button, a[href*='tpi.li']").forEach { a ->
                val href = a.attr("href").ifBlank { return@forEach }
                val label = a.selectFirst("span")?.text()?.trim()?.ifBlank { null }
                    ?: "Download"
                out.add(CinemaluxButton(href, label, lang))
            }
        }
        // buttons outside any secontainer (The Prestige layout, series packs)
        doc.select("a.ep-simple-button, a[href*='tpi.li']").forEach { a ->
            val href = a.attr("href").ifBlank { return@forEach }
            val label = a.selectFirst("span")?.text()?.trim()?.ifBlank { null }
                ?: "Download"
            val already = out.any { it.href == href }
            if (!already) out.add(CinemaluxButton(href, label, null))
        }
        return out.distinctBy { it.href }
    }

    /**
     * For a series, each button is a season pack:
     *   "Season 01 - 720P AMZN WEB-DL (450MB/EP)" -> https://tpi.li/{code}
     * We decode the shortener and read the pack's episode list page
     * (linkstore.zip/{id}/) to get REAL episode numbers + names.
     *
     * Episodes with the same (season, episode) from different qualities are merged:
     * each episode's data = JSON array of variants [{u, q, l}] -> all qualities available.
     */
    private suspend fun resolveSeriesEpisodes(
        buttons: List<CinemaluxButton>,
        poster: String?,
    ): List<Episode> {
        val semaphore = Semaphore(3)
        val results = coroutineScope {
            buttons.map { b ->
                async { semaphore.withPermit { resolvePack(b) } }
            }.awaitAll()
        }

        // variants grouped by (season, episodeNumber)
        val bySeasonEp = mutableMapOf<SeasonEpKey, MutableList<CinemaluxVariant>>()
        // packs that failed to resolve -> single episode with the tpi.li url as data
        val fallbackEpisodes = mutableListOf<Episode>()
        // single-file packs (e.g. a whole season in one rar) -> one episode each
        val singleEpisodes = mutableListOf<Pair<Int, CinemaluxButton>>()

        results.forEach { res ->
            when (res) {
                is PackResult.PackList -> res.variants.forEach { v ->
                    if (v.epNum != null) {
                        bySeasonEp.getOrPut(SeasonEpKey(res.season, v.epNum)) { mutableListOf() }.add(v)
                    } else {
                        singleEpisodes.add(res.season to CinemaluxButton(v.url ?: "", v.label ?: "Download", v.lang))
                    }
                }
                is PackResult.PackSingle -> singleEpisodes.add(res.season to res.button)
                is PackResult.PackFailed -> fallbackEpisodes.add(
                    newEpisode(listOf(res.button.toVariant()).toJson()) {
                        this.season = res.season
                        this.episode = 1
                        this.name = res.button.displayName
                        this.posterUrl = poster
                    }
                )
            }
        }

        val episodes = mutableListOf<Episode>()

        // real episodes (merged across qualities)
        bySeasonEp.toSortedMap().forEach { (seasonEp, variants) ->
            val qualities = variants.mapNotNull { it.qualityTag }.distinct()
            episodes.add(
                newEpisode(variants.toJson()) {
                    this.season = seasonEp.season
                    this.episode = seasonEp.episode
                    this.name = "Episode ${seasonEp.episode}" +
                        if (qualities.isNotEmpty()) " [${qualities.joinToString("/")}]" else ""
                    this.posterUrl = poster
                }
            )
        }

        // single-file packs -> one episode per pack
        singleEpisodes.forEach { (season, b) ->
            episodes.add(
                newEpisode(listOf(b.toVariant()).toJson()) {
                    this.season = season
                    this.episode = episodes.count { it.season == season } + 1
                    this.name = b.displayName
                    this.posterUrl = poster
                }
            )
        }

        episodes.addAll(fallbackEpisodes)
        return episodes.sortedWith(compareBy({ it.season ?: 0 }, { it.episode ?: 0 }))
    }

    /** Decode one pack button: tpi.li -> dest -> episode list (or single file). */
    private suspend fun resolvePack(b: CinemaluxButton): PackResult {
        val season = Regex("""Season\s*(\d+)""", RegexOption.IGNORE_CASE)
            .find(b.label)?.groupValues?.get(1)?.toIntOrNull() ?: 1
        val quality = b.label.replace(Regex("""Season\s*\d+\s*-\s*""", RegexOption.IGNORE_CASE), "")
            .replace(Regex("""\([\d.]+\s*MB/EP\)|\([\d.]+\s*GB/EP\)"""), "")
            .trim().ifBlank { b.label }

        val dest = decodeTpiUrl(b.href) ?: return PackResult.PackFailed(season, b)

        return try {
            if (isPackPage(dest)) {
                val doc = app.get(dest, headers = headers, timeout = 30_000L).document
                val rows = doc.select("a[href*='drive.linkstore.zip/file/']")
                if (rows.isEmpty()) {
                    // empty list page -> treat pack as a single link
                    PackResult.PackSingle(season, CinemaluxButton(dest, quality, b.lang))
                } else {
                    val variants = rows.mapNotNull { row ->
                        val href = row.attr("href").ifBlank { return@mapNotNull null }
                        val label = row.selectFirst("span")?.text()?.trim()?.ifBlank { null }
                            ?: return@mapNotNull null
                        val epNum = Regex("""EPISODE\s*-\s*(\d+)""", RegexOption.IGNORE_CASE)
                            .find(label)?.groupValues?.get(1)?.toIntOrNull()
                        if (epNum == null) {
                            // "All Episodes Zip (...)" row -> skip
                            null
                        } else {
                            CinemaluxVariant(href, quality, b.lang, epNum, label)
                        }
                    }
                    if (variants.isEmpty()) {
                        PackResult.PackSingle(season, CinemaluxButton(dest, quality, b.lang))
                    } else {
                        PackResult.PackList(season, variants)
                    }
                }
            } else {
                // single file (whole season in one archive)
                PackResult.PackSingle(season, CinemaluxButton(dest, quality, b.lang))
            }
        } catch (e: Exception) {
            Log.d("Cinemalux", "pack resolve failed: ${e.message}")
            PackResult.PackFailed(season, b)
        }
    }

    private fun isPackPage(url: String): Boolean =
        url.contains("linkstore.zip/") && !url.contains("/file/")

    // ------------------------------------------------------------------ links

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit,
    ): Boolean {
        val variants = parseVariants(data) ?: return false
        Log.d("Cinemalux", "loadLinks variants=${variants.size}")

        val semaphore = Semaphore(2)
        val results = coroutineScope {
            variants.map { v ->
                async { semaphore.withPermit { resolveVariant(v, callback) } }
            }.awaitAll()
        }
        return results.any { it }
    }

    /** Parse episode data: JSON array of {u,q,l} variants, with legacy pipe fallback. */
    private fun parseVariants(data: String): List<CinemaluxVariant>? {
        // defensive: strip mainUrl prefix if CloudStream added it
        var clean = when {
            data.startsWith("$mainUrl/") -> data.removePrefix("$mainUrl/")
            data.startsWith("/") -> data.removePrefix("/")
            else -> data
        }
        // the player may URL-encode the data string
        try {
            val decoded = URLDecoder.decode(clean, "UTF-8")
            if (decoded != clean) clean = decoded
        } catch (e: Exception) { /* keep as-is */ }

        // JSON array: [{"u":"...","q":"...","l":"..."}] (also accepts {"data":..,"name":..} shape)
        if (clean.trimStart().startsWith("[")) {
            try {
                val parsed = JSON.readValue<List<EpisodeVariantJson>>(clean)
                val out = parsed.mapNotNull { j ->
                    val url = j.u ?: j.data
                    val label = j.q ?: j.name
                    url?.let { CinemaluxVariant(it, label, j.l, j.n, j.r) }
                }
                if (out.isNotEmpty()) return out
            } catch (e: Exception) {
                Log.d("Cinemalux", "JSON parse failed: ${e.message}")
            }
        }

        // legacy pipe format: url|season|label
        val parts = clean.split("|")
        if (parts.isNotEmpty() && parts[0].startsWith("http")) {
            val label = parts.getOrNull(2) ?: parts.getOrNull(1) ?: "Download"
            return listOf(CinemaluxVariant(parts[0], label, null, null, null))
        }
        return null
    }

    private suspend fun resolveVariant(v: CinemaluxVariant, callback: (ExtractorLink) -> Unit): Boolean {
        val url = v.url ?: return false
        var target = url
        if (target.startsWith("https://tpi.li/")) {
            target = decodeTpiUrl(target) ?: return false
        }
        return if (isPackPage(target)) {
            resolvePackPageLinks(target, v, callback)
        } else {
            resolveFileLinks(target, v, callback)
        }
    }

    /** A pack page referenced directly (legacy data): resolve every episode row. */
    private suspend fun resolvePackPageLinks(
        packUrl: String,
        v: CinemaluxVariant,
        callback: (ExtractorLink) -> Unit,
    ): Boolean {
        return try {
            val doc = app.get(packUrl, headers = headers, timeout = 30_000L).document
            val rows = doc.select("a[href*='drive.linkstore.zip/file/']")
            val semaphore = Semaphore(2)
            val results = coroutineScope {
                rows.map { row ->
                    async {
                        semaphore.withPermit {
                            val href = row.attr("href").ifBlank { return@withPermit false }
                            val label = row.selectFirst("span")?.text()?.trim()?.ifBlank { null }
                                ?: "Episode"
                            resolveFileLinks(
                                href,
                                CinemaluxVariant(href, v.quality, v.lang, null, label),
                                callback,
                            )
                        }
                    }
                }.awaitAll()
            }
            results.any { it }
        } catch (e: Exception) {
            Log.d("Cinemalux", "pack links failed: ${e.message}")
            false
        }
    }

    /** drive.linkstore.zip/file/{id} -> luxedrive -> instant CDN -> direct video URL. */
    private suspend fun resolveFileLinks(
        driveUrl: String,
        v: CinemaluxVariant,
        callback: (ExtractorLink) -> Unit,
    ): Boolean {
        DirectCache.get(driveUrl)?.let { direct ->
            emitLink(driveUrl, v, direct, callback)
            return true
        }

        val page = app.get(driveUrl, headers = headers, timeout = 30_000L).text
        val fileTitle = Regex("""file-title">\s*([^<]+)""").find(page)?.groupValues?.get(1)?.trim()

        // Instant DL mirror (works without any cookie)
        val instantUrl = Regex("""https://[a-zA-Z0-9-]+\.ultra-fast-r2-cdn\.workers\.dev/\?token=[^"'\s]+""")
            .find(page)?.value
            ?: Regex("""href=['"](https://[^'"]*ultra-fast-r2-cdn[^'"]*)['"]""")
                .find(page)?.groupValues?.get(1)

        if (instantUrl == null) {
            // Some files only have a gdflix.dev mirror (Cloudflare-protected) -> not resolvable
            Log.d("Cinemalux", "no instant mirror for $driveUrl (title=$fileTitle)")
            return false
        }

        val instantPage = app.get(instantUrl, headers = headers, timeout = 30_000L).text
        val direct = Regex("""https://video-downloads\.googleusercontent\.com/[^"'\s]+""")
            .find(instantPage)?.value
            ?: Regex("""href=['"](https://video-downloads[^'"]*)['"]""")
                .find(instantPage)?.groupValues?.get(1)
            ?: return false

        DirectCache.put(driveUrl, direct)
        emitLink(driveUrl, v, direct, callback, fileTitle)
        return true
    }

    private suspend fun emitLink(
        driveUrl: String,
        v: CinemaluxVariant,
        direct: String,
        callback: (ExtractorLink) -> Unit,
        fileTitle: String? = null,
    ) {
        val generic = v.label.isNullOrBlank()
            || v.label == "Download" || v.label == "Download Now" || v.label == "Episode"

        // Prefer the real file title (has codec + audio languages) unless the label carries info
        val name = if (!generic && v.label != null) {
            v.label
        } else {
            fileTitle?.substringBeforeLast('.')?.trim()?.ifBlank { null }
                ?: v.label?.ifBlank { null }
                ?: "Download"
        }

        // quality: check label, pack quality hint, and file title
        val quality = listOfNotNull(v.label, v.quality, fileTitle).joinToString(" ").let { text ->
            Regex("""(?i)\b(2160p|4k|1440p|1080p|720p|480p|360p)\b""").find(text)?.value?.lowercase()
                ?.let { getQualityFromName(it) }
        } ?: Qualities.Unknown.value

        callback(
            newExtractorLink("Cinemalux", name, direct, ExtractorLinkType.VIDEO) {
                this.quality = quality
                this.referer = driveUrl
            }
        )
    }

    // ------------------------------------------------------------------ tpi.li decode

    /**
     * tpi.li pages embed the real destination base64-encoded inside a hidden form
     * token: token = {hex}{code}0708{base64(destUrl)}. Cached per code.
     */
    private suspend fun decodeTpiUrl(tpiUrl: String): String? {
        TpiCache.get(tpiUrl)?.let { return it }

        val dest = try {
            val page = app.get(tpiUrl, headers = headers, timeout = 30_000L).text
            val token = Regex("""name="token" value="([^"]+)"""").find(page)?.groupValues?.get(1)
                ?: null
            if (token == null) {
                null
            } else {
                // primary: payload is everything after the "0708" marker
                token.substringAfter("0708", "").takeIf { it.isNotBlank() }
                    ?.let { decodeToUrl(it) }
                    ?: run {
                        // bounded fallback: payload sits at the tail of the token
                        val tailStart = (token.length - 120).coerceAtLeast(0)
                        var found: String? = null
                        for (i in tailStart until token.length) {
                            val sub = token.substring(i)
                            if (sub.length < 16) continue
                            decodeToUrl(sub)?.let { found = it; break }
                        }
                        found
                    }
            }
        } catch (e: Exception) {
            Log.d("Cinemalux", "tpi.li decode failed: ${e.message}")
            null
        }

        if (dest != null) TpiCache.put(tpiUrl, dest)
        return dest
    }

    private fun decodeToUrl(b64: String): String? = try {
        val decoded = base64Decode(b64)
        if (decoded.startsWith("http")) decoded else null
    } catch (e: Exception) {
        null
    }

    // ------------------------------------------------------------------ data classes

    private data class CinemaluxButton(
        val href: String,
        val label: String,
        val lang: String?,
    ) {
        val displayName: String
            get() = listOfNotNull(label, lang?.let { "[$it]" }).joinToString(" ").ifBlank { "Download" }

        fun toVariant(): CinemaluxVariant = CinemaluxVariant(href, label, lang, null, null)
    }

    private data class CinemaluxVariant(
        val url: String?,
        val label: String?,
        val lang: String?,
        val epNum: Int?,
        val rowLabel: String?,
    ) {
        val quality: String?
            get() = (label ?: rowLabel ?: "").let {
                Regex("""(?i)\b(2160p|4k|1440p|1080p|720p|480p|360p)\b""").find(it)?.value?.uppercase()
            }

        val qualityTag: String? get() = quality
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    private data class EpisodeVariantJson(
        @JsonProperty("u") val u: String? = null,
        @JsonProperty("q") val q: String? = null,
        @JsonProperty("l") val l: String? = null,
        @JsonProperty("n") val n: Int? = null,
        @JsonProperty("r") val r: String? = null,
        @JsonProperty("data") val data: String? = null,
        @JsonProperty("name") val name: String? = null,
    )

    private data class SeasonEpKey(val season: Int, val episode: Int) : Comparable<SeasonEpKey> {
        override fun compareTo(other: SeasonEpKey): Int {
            val s = season.compareTo(other.season)
            return if (s != 0) s else episode.compareTo(other.episode)
        }
    }

    private fun List<CinemaluxVariant>.toJson(): String {
        val list = this.map { v ->
            EpisodeVariantJson(
                u = v.url,
                q = v.label,
                l = v.lang,
                n = v.epNum,
                r = v.rowLabel,
            )
        }
        return JSON.writeValueAsString(list)
    }

    private sealed class PackResult {
        data class PackList(val season: Int, val variants: List<CinemaluxVariant>) : PackResult()
        data class PackSingle(val season: Int, val button: CinemaluxButton) : PackResult()
        data class PackFailed(val season: Int, val button: CinemaluxButton) : PackResult()
    }

    companion object {
        private val JSON: ObjectMapper = jacksonObjectMapper()
    }
}

// ---------------------------------------------------------------------- caches

private object TpiCache {
    private val map = ConcurrentHashMap<String, Pair<Long, String>>()
    private const val TTL = 30 * 60_000L

    fun get(key: String): String? {
        val entry = map[key] ?: return null
        if (System.currentTimeMillis() - entry.first > TTL) {
            map.remove(key)
            return null
        }
        return entry.second
    }

    fun put(key: String, value: String) {
        map[key] = System.currentTimeMillis() to value
    }
}

private object DirectCache {
    private val map = ConcurrentHashMap<String, Pair<Long, String>>()
    private const val TTL = 15 * 60_000L

    fun get(key: String): String? {
        val entry = map[key] ?: return null
        if (System.currentTimeMillis() - entry.first > TTL) {
            map.remove(key)
            return null
        }
        return entry.second
    }

    fun put(key: String, value: String) {
        map[key] = System.currentTimeMillis() to value
    }
}
