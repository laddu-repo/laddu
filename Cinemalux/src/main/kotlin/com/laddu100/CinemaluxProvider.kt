package com.laddu100

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*
import com.lagradost.cloudstream3.base64Decode
import com.lagradost.api.Log
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.sync.Semaphore
import kotlinx.coroutines.sync.withPermit
import org.jsoup.nodes.Element
import java.net.URLEncoder
import java.util.concurrent.ConcurrentHashMap

/**
 * Cinemalux - Movie & TV download provider.
 *
 * Site: cinemalux.click (WordPress / Dooplay theme, no Cloudflare)
 *
 * Verified chain (all probed live):
 *   Search      GET https://cinemalux.click/?s={query}
 *   Homepage    GET /movies/, /series/, /genre/{slug}/  (pagination: /page/N/)
 *   Detail      GET /movies/{slug}/ or /series/{slug}/
 *   Download    div.custom-links > div.secontainer (Languages header)
 *                   > div.ep-button-container > a.ep-simple-button (href=https://tpi.li/{code})
 *                   > span = "1080P BLURAY 2.88 GB"
 *   Step 1      GET https://tpi.li/{code}  -> hidden form token = {prefix}0708{base64url}
 *   Step 2      base64decode(part after 0708) -> https://drive.linkstore.zip/file/{id}
 *                                 (series packs: https://linkstore.zip/{id}/ episode list)
 *   Step 3      GET (follows to new7.luxedrive.dad/file/{id})
 *                   -> href="https://instant-dl-10gbps-now.ultra-fast-r2-cdn.workers.dev/?token=..."
 *   Step 4      GET instant page -> href="https://video-downloads.googleusercontent.com/..."
 *                   -> direct MKV (multi-audio: ExoPlayer shows audio tracks natively)
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

        // type detection: class badges / item_type / url path
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

        // NOTE: the page has a logo <h1 class="text-logo"> first — the real title is in div.data
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

        // Download buttons: div.custom-links > div.secontainer (each has a Languages header)
        val containers = doc.select("div.custom-links div.secontainer")
        val buttons = containers.mapNotNull { container ->
            val lang = container.selectFirst("p")?.text()?.let {
                Regex("""Languages:\s*([A-Za-z][A-Za-z -]*)""").find(it)?.groupValues?.get(1)?.trim()
            }?.ifBlank { null }
            val links = container.select("div.ep-button-container a.ep-simple-button")
                .mapNotNull { a ->
                    val href = a.attr("href").ifBlank { return@mapNotNull null }
                    val label = a.selectFirst("span")?.text()?.trim()?.ifBlank { null } ?: return@mapNotNull null
                    CinemaluxButton(href, label, lang)
                }
            links
        }.flatten()

        if (buttons.isEmpty()) return null

        if (!isSeries) {
            // Movie: every download button = one episode (quality + language + size)
            val episodes = buttons.mapIndexed { i, b ->
                newEpisode("${b.href}|0|${b.label}") {
                    this.episode = i + 1
                    this.name = listOfNotNull(b.label, b.lang?.let { "[$it]" }).joinToString(" ")
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

        // Series: buttons are season packs "Season NN - QUALITY"
        val seasonMap = sortedMapOf<Int, MutableList<CinemaluxButton>>()
        buttons.forEach { b ->
            val season = Regex("""Season\s*(\d+)""", RegexOption.IGNORE_CASE)
                .find(b.label)?.groupValues?.get(1)?.toIntOrNull() ?: 1
            val quality = b.label.replace(Regex("""Season\s*\d+\s*-\s*""", RegexOption.IGNORE_CASE), "")
                .ifBlank { b.label }
            seasonMap.getOrPut(season) { mutableListOf() }.add(b.copy(label = quality))
        }

        val episodes = mutableListOf<Episode>()
        seasonMap.forEach { (season, buttonsInSeason) ->
            buttonsInSeason.forEachIndexed { i, b ->
                episodes.add(
                    newEpisode("${b.href}|$season|${b.label}") {
                        this.season = season
                        this.episode = i + 1
                        this.name = listOfNotNull(b.label, b.lang?.let { "[$it]" }).joinToString(" ")
                        this.posterUrl = poster
                    }
                )
            }
        }

        return newTvSeriesLoadResponse(title, url, TvType.TvSeries, episodes) {
            this.posterUrl = poster
            this.plot = plot
            this.tags = genres
            this.score = rating?.let { Score.from10(it) }
            this.year = year
        }
    }

    // ------------------------------------------------------------------ links

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit,
    ): Boolean {
        // Defensive: CloudStream may have mainUrl-prefixed the data string
        val cleanData = when {
            data.startsWith("$mainUrl/") -> data.removePrefix("$mainUrl/")
            data.startsWith("/") -> data.removePrefix("/")
            else -> data
        }
        Log.d("Cinemalux", "loadLinks data=$cleanData")

        val parts = cleanData.split("|")
        if (parts.size < 3) return false
        val tpiUrl = parts[0]
        if (!tpiUrl.startsWith("https://tpi.li/")) return false

        val dest = decodeTpiUrl(tpiUrl) ?: return false
        Log.d("Cinemalux", "decoded dest=$dest")

        return try {
            when {
                // Series pack: linkstore.zip/{id}/ -> episode list page
                dest.contains("linkstore.zip/") && !dest.contains("/file/") -> {
                    resolveSeriesPack(dest, callback)
                }
                // Movie/single file: drive.linkstore.zip/file/{id}
                else -> {
                    resolveLuxeDriveFile(dest, null, callback)
                }
            }
        } catch (e: Exception) {
            Log.d("Cinemalux", "loadLinks failed: ${e.message}")
            false
        }
    }

    /**
     * tpi.li pages embed the real destination base64-encoded inside a hidden
     * form token: token = {hex}{2026}{alias}0708{base64(destUrl)}.
     */
    private suspend fun decodeTpiUrl(tpiUrl: String): String? {
        val page = app.get(tpiUrl, headers = headers, timeout = 30_000L).text
        val token = Regex("""name="token" value="([^"]+)"""").find(page)?.groupValues?.get(1)
            ?: return null
        // known marker: base64 payload is everything after "0708"
        token.substringAfter("0708", "").takeIf { it.isNotBlank() }?.let {
            decodeToUrl(it)?.let { d -> return d }
        }
        // bounded fallback: the payload sits at the tail of the token, so only scan
        // the last 120 chars instead of every prefix (avoids O(n^2) false positives)
        val tailStart = (token.length - 120).coerceAtLeast(0)
        for (i in tailStart until token.length) {
            val sub = token.substring(i)
            if (sub.length < 16) continue
            decodeToUrl(sub)?.let { return it }
        }
        return null
    }

    private fun decodeToUrl(b64: String): String? = try {
        val decoded = base64Decode(b64)
        if (decoded.startsWith("http")) decoded else null
    } catch (e: Exception) {
        null
    }

    /** Series pack page: linkstore.zip/{id}/ -> list of drive.linkstore.zip/file/{epId} */
    private suspend fun resolveSeriesPack(
        dest: String,
        callback: (ExtractorLink) -> Unit,
    ): Boolean {
        val doc = app.get(dest, headers = headers, timeout = 30_000L).document
        val rows = doc.select("a[href*='drive.linkstore.zip/file/']")
        if (rows.isEmpty()) return false

        // bounded parallelism: a season pack can have 20+ episodes
        val semaphore = Semaphore(4)
        val results = coroutineScope {
            rows.map { row ->
                async {
                    semaphore.withPermit {
                        val href = row.attr("href").ifBlank { return@withPermit false }
                        val label = row.selectFirst("span")?.text()?.trim()?.ifBlank { null }
                            ?: "Episode"
                        resolveLuxeDriveFile(href, label, callback)
                    }
                }
            }.awaitAll()
        }
        return results.any { it }
    }

    /** drive.linkstore.zip/file/{id} -> luxedrive page -> instant CDN -> direct video URL */
    private suspend fun resolveLuxeDriveFile(
        driveUrl: String,
        label: String?,
        callback: (ExtractorLink) -> Unit,
    ): Boolean {
        // cache resolved direct URLs (tokens are long-lived enough within a session)
        DirectCache.get(driveUrl)?.let { direct ->
            emitLink(driveUrl, label, direct, callback)
            return true
        }

        val page = app.get(driveUrl, headers = headers, timeout = 30_000L).text
        // Instant DL mirror
        val instantUrl = Regex("""https://[a-zA-Z0-9-]+\.ultra-fast-r2-cdn\.workers\.dev/\?token=[^"'\s]+""")
            .find(page)?.value
            ?: Regex("""href=['"](https://[^'"]*ultra-fast-r2-cdn[^'"]*)['"]""")
                .find(page)?.groupValues?.get(1)
            ?: return false

        val instantPage = app.get(instantUrl, headers = headers, timeout = 30_000L).text
        val direct = Regex("""https://video-downloads\.googleusercontent\.com/[^"'\s]+""")
            .find(instantPage)?.value
            ?: Regex("""href=['"](https://video-downloads[^'"]*)['"]""")
                .find(instantPage)?.groupValues?.get(1)
            ?: return false

        DirectCache.put(driveUrl, direct)
        emitLink(driveUrl, label, direct, callback)
        return true
    }

    private suspend fun emitLink(
        driveUrl: String,
        label: String?,
        direct: String,
        callback: (ExtractorLink) -> Unit,
    ) {
        val display = label?.ifBlank { null } ?: "Download"
        callback(
            newExtractorLink("Cinemalux", display, direct, ExtractorLinkType.VIDEO) {
                // getQualityFromName maps "4k"/"1080p"/etc to the resolution Int (Qualities)
                this.quality = parseQuality(label)?.let { getQualityFromName(it) } ?: Qualities.Unknown.value
                this.referer = driveUrl
            }
        )
    }

    private fun parseQuality(label: String?): String? {
        val text = label ?: return null
        return Regex("""(?i)\b(4k|2160p|1440p|1080p|720p|480p|360p)\b""").find(text)?.value?.lowercase()
    }

    private data class CinemaluxButton(
        val href: String,
        val label: String,
        val lang: String?,
    )
}

// ---------------------------------------------------------------------- cache

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
