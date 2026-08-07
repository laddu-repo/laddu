package com.laddu100

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.base64Decode
import com.lagradost.cloudstream3.network.CloudflareKiller
import com.lagradost.cloudstream3.utils.*
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.api.Log
import com.lagradost.nicehttp.NiceResponse
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import org.jsoup.nodes.Element
import java.net.URI
import java.net.URLDecoder
import java.net.URLEncoder
import java.util.concurrent.ConcurrentHashMap

/**
 * Cinemalux - Movie & TV download provider (v3).
 *
 * Site: cinemalux.click (WordPress / Dooplay theme)
 *
 * Verified chain (all probed live, zero guesswork):
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
 * Reliability layers (patterns from Moviesmod / VegaMovies / CineStream):
 *   - CloudflareKiller interceptor: tpi.li / linkstore / luxedrive can 403/503 on phone
 *     networks even though desktop curl passes -> cfGet() retries with CF bypass.
 *   - Manual redirect resolution: linkstore -> luxedrive is a 301; resolveFinalUrl()
 *     walks Location headers explicitly instead of relying on the HTTP client.
 *   - Episode data = JSON array serialized from a data class (same proven pattern as
 *     Moviesmod's newEpisode(list) + parseJson<ArrayList<...>>(data)).
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

    // CF bypass for hosts that challenge the phone's requests (tpi.li, linkstore, luxedrive)
    private val cfKiller by lazy { CloudflareKiller() }
    private val cfMutex = Mutex()

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
        val doc = cfGet(url).document
        val items = doc.select("article.item").mapNotNull { it.toSearchResult() }
        return newHomePageResponse(request.name, items)
    }

    // ------------------------------------------------------------------ search

    override suspend fun search(query: String): List<SearchResponse> {
        val encoded = URLEncoder.encode(query, "UTF-8")
        val doc = cfGet("$mainUrl/?s=$encoded").document
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
        val doc = cfGet(url).document

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
                newEpisode(listOf(b.toVariant())) {
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
     */
    private fun extractButtons(doc: org.jsoup.nodes.Document): List<CinemaluxButton> {
        val out = mutableListOf<CinemaluxButton>()
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
     * Decode the shortener and read the pack's episode list page (linkstore.zip/{id}/)
     * to get REAL episode numbers + names. Episodes with the same (season, episode)
     * from different quality packs are merged into one episode with all variants.
     */
    private suspend fun resolveSeriesEpisodes(
        buttons: List<CinemaluxButton>,
        poster: String?,
    ): List<Episode> {
        val results = buttons.map { b ->
            runCatching { resolvePack(b) }.getOrElse { PackResult.PackFailed(seasonOf(b.label), b) }
        }

        val bySeasonEp = mutableMapOf<SeasonEpKey, MutableList<CinemaluxVariant>>()
        val fallbackEpisodes = mutableListOf<Episode>()
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
                    newEpisode(listOf(res.button.toVariant())) {
                        this.season = res.season
                        this.episode = 1
                        this.name = res.button.displayName
                        this.posterUrl = poster
                    }
                )
            }
        }

        val episodes = mutableListOf<Episode>()

        bySeasonEp.toSortedMap().forEach { (seasonEp, variants) ->
            val qualities = variants.mapNotNull { it.qualityTag }.distinct()
            episodes.add(
                newEpisode(variants) {
                    this.season = seasonEp.season
                    this.episode = seasonEp.episode
                    this.name = "Episode ${seasonEp.episode}" +
                        if (qualities.isNotEmpty()) " [${qualities.joinToString("/")}]" else ""
                    this.posterUrl = poster
                }
            )
        }

        singleEpisodes.forEach { (season, b) ->
            episodes.add(
                newEpisode(listOf(b.toVariant())) {
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

    private fun seasonOf(label: String): Int =
        Regex("""Season\s*(\d+)""", RegexOption.IGNORE_CASE)
            .find(label)?.groupValues?.get(1)?.toIntOrNull() ?: 1

    /** Decode one pack button: tpi.li -> dest -> episode list (or single file). */
    private suspend fun resolvePack(b: CinemaluxButton): PackResult {
        val season = seasonOf(b.label)
        val quality = b.label.replace(Regex("""Season\s*\d+\s*-\s*""", RegexOption.IGNORE_CASE), "")
            .replace(Regex("""\([\d.]+\s*MB/EP\)|\([\d.]+\s*GB/EP\)"""), "")
            .trim().ifBlank { b.label }

        val dest = decodeTpiUrl(b.href) ?: return PackResult.PackFailed(season, b)

        return try {
            if (isPackPage(dest)) {
                val doc = cfGet(dest).document
                val rows = doc.select("a[href*='drive.linkstore.zip/file/']")
                if (rows.isEmpty()) {
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

        return variants.amap { v -> resolveVariant(v, callback) }.any { it }
    }

    /** Parse episode data: JSON array of variants, with legacy pipe fallback. */
    private fun parseVariants(data: String): List<CinemaluxVariant>? {
        var clean = when {
            data.startsWith("$mainUrl/") -> data.removePrefix("$mainUrl/")
            data.startsWith("/") -> data.removePrefix("/")
            else -> data
        }
        try {
            val decoded = URLDecoder.decode(clean, "UTF-8")
            if (decoded != clean) clean = decoded
        } catch (e: Exception) { /* keep as-is */ }

        // JSON array of variants (newEpisode auto-serializes CinemaluxVariant via AppUtils)
        if (clean.trimStart().startsWith("[")) {
            try {
                val parsed = parseJson<ArrayList<CinemaluxVariant>>(clean)
                val out = parsed.filter { !it.url.isNullOrBlank() }
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
            val doc = cfGet(packUrl).document
            val rows = doc.select("a[href*='drive.linkstore.zip/file/']")
            return rows.amap { row ->
                val href = row.attr("href").ifBlank { return@amap false }
                val label = row.selectFirst("span")?.text()?.trim()?.ifBlank { null }
                    ?: "Episode"
                resolveFileLinks(href, CinemaluxVariant(href, v.quality, v.lang, null, label), callback)
            }.any { it }
        } catch (e: Exception) {
            Log.d("Cinemalux", "pack links failed: ${e.message}")
            false
        }
    }

    /**
     * drive.linkstore.zip/file/{id} -> luxedrive -> instant CDN -> direct video URL.
     * Handles the linkstore->luxedrive 301 via resolveFinalUrl() and retries with
     * CloudflareKiller when a host challenges the request.
     */
    private suspend fun resolveFileLinks(
        driveUrl: String,
        v: CinemaluxVariant,
        callback: (ExtractorLink) -> Unit,
    ): Boolean {
        DirectCache.get(driveUrl)?.let { direct ->
            emitLink(driveUrl, v, direct, callback)
            return true
        }

        // 1. resolve redirects (linkstore.zip -> luxedrive.dad) explicitly; on failure
        //    fall back to the original URL (cfGet follows redirects by default)
        val resolved = resolveFinalUrl(driveUrl) ?: driveUrl
        val page = try {
            cfGet(resolved).text
        } catch (e: Exception) {
            Log.d("Cinemalux", "luxedrive fetch failed: ${e.message}")
            return false
        }
        val fileTitle = Regex("""file-title">\s*([^<]+)""").find(page)?.groupValues?.get(1)?.trim()

        // 2. Instant DL mirror href (works without any cookie)
        val instantUrl = Regex("""https://[a-zA-Z0-9-]+\.ultra-fast-r2-cdn\.workers\.dev/\?token=[^"'\s]+""")
            .find(page)?.value
            ?: Regex("""href=['"](https://[^'"]*ultra-fast-r2-cdn[^'"]*)['"]""")
                .find(page)?.groupValues?.get(1)

        if (instantUrl == null) {
            Log.d("Cinemalux", "no instant mirror for $driveUrl (title=$fileTitle)")
            return false
        }

        // 3. resolve instant page redirects + read the direct video URL
        val instantFinal = resolveFinalUrl(instantUrl) ?: instantUrl
        val instantPage = try {
            cfGet(instantFinal).text
        } catch (e: Exception) {
            Log.d("Cinemalux", "instant page failed: ${e.message}")
            return false
        }
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

        val name = if (!generic && v.label != null) {
            v.label
        } else {
            fileTitle?.substringBeforeLast('.')?.trim()?.ifBlank { null }
                ?: v.label?.ifBlank { null }
                ?: "Download"
        }

        val quality = getQualityFromName(listOfNotNull(v.label, v.quality, fileTitle).joinToString(" "))

        callback(
            newExtractorLink("Cinemalux", name, direct, ExtractorLinkType.VIDEO) {
                this.quality = quality
                this.referer = driveUrl
                this.headers = mapOf(
                    "User-Agent" to "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/124.0.0.0",
                    "Referer" to driveUrl,
                )
            }
        )
    }

    // ------------------------------------------------------------------ helpers

    /** GET with Cloudflare bypass: try plain, retry with CloudflareKiller on 403/503. */
    private suspend fun cfGet(
        url: String,
        headers: Map<String, String> = this.headers,
        allowRedirects: Boolean = true,
    ): NiceResponse {
        val response = app.get(url, headers = headers, allowRedirects = allowRedirects, timeout = 30_000L)
        if (response.code !in listOf(403, 503)) return response

        return cfMutex.withLock {
            val retry = app.get(
                url,
                headers = headers,
                interceptor = cfKiller,
                allowRedirects = allowRedirects,
                timeout = 30_000L,
            )
            if (retry.code in listOf(403, 503)) {
                cfKiller.savedCookies.clear()
                app.get(
                    url,
                    headers = headers,
                    interceptor = cfKiller,
                    allowRedirects = allowRedirects,
                    timeout = 30_000L,
                )
            } else {
                retry
            }
        }
    }

    /** Walk redirect chains explicitly using HEAD + Location (VegaMovies pattern). */
    private suspend fun resolveFinalUrl(startUrl: String): String? {
        var currentUrl = startUrl
        var loopCount = 0
        val maxRedirects = 7

        while (loopCount < maxRedirects) {
            try {
                val res = app.head(currentUrl, headers = headers, allowRedirects = false, timeout = 2_500L)
                if (res.code == 200 || res.code in 300..399) {
                    val location = res.headers["location"] ?: res.headers["Location"]
                    if (location.isNullOrEmpty()) break
                    currentUrl = if (location.startsWith("http")) location
                    else getBaseUrl(currentUrl) + location
                } else {
                    return null
                }
                loopCount++
            } catch (e: Exception) {
                return null
            }
        }
        return currentUrl
    }

    private fun getBaseUrl(url: String): String = try {
        val uri = URI(url)
        "${uri.scheme}://${uri.host}"
    } catch (e: Exception) {
        url
    }

    // ------------------------------------------------------------------ tpi.li decode

    /**
     * tpi.li pages embed the real destination base64-encoded inside a hidden form
     * token: token = {hex}{code}0708{base64(destUrl)}. Cached per code.
     */
    private suspend fun decodeTpiUrl(tpiUrl: String): String? {
        TpiCache.get(tpiUrl)?.let { return it }

        val dest = try {
            val page = cfGet(tpiUrl).text
            val token = Regex("""name="token" value="([^"]+)"""").find(page)?.groupValues?.get(1)
                ?: null
            if (token == null) {
                null
            } else {
                token.substringAfter("0708", "").takeIf { it.isNotBlank() }
                    ?.let { decodeToUrl(it) }
                    ?: run {
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

    private data class SeasonEpKey(val season: Int, val episode: Int) : Comparable<SeasonEpKey> {
        override fun compareTo(other: SeasonEpKey): Int {
            val s = season.compareTo(other.season)
            return if (s != 0) s else episode.compareTo(other.episode)
        }
    }

    private sealed class PackResult {
        data class PackList(val season: Int, val variants: List<CinemaluxVariant>) : PackResult()
        data class PackSingle(val season: Int, val button: CinemaluxButton) : PackResult()
        data class PackFailed(val season: Int, val button: CinemaluxButton) : PackResult()
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
