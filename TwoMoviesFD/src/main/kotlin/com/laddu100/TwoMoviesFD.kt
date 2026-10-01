package com.laddu100

import android.util.Base64
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.AppUtils.toJson
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.M3u8Helper
import com.lagradost.cloudstream3.utils.newExtractorLink
import com.lagradost.cloudstream3.utils.loadExtractor
import com.lagradost.cloudstream3.network.WebViewResolver
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import org.jsoup.nodes.Element
import java.net.URLEncoder

class TwoMoviesFD : MainAPI() {
    override var mainUrl = "https://2moviesfd.shop"
    override var name = "2MoviesFD"
    override var lang = "hi"
    override val hasMainPage = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)

    private val headers = mapOf(
        "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36",
        "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
    )

    private val papaHeaders = mapOf(
        "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36",
        "Accept" to "application/json, text/plain, */*",
    )

    private val providers = listOf("byse", "streamtape", "doodstream", "streamhg")

    override val mainPage = mainPageOf(
        "latest" to "Latest",
        "Movies" to "Movies",
        "TV-Shows" to "TV Shows",
        "list/dual-audio-movies" to "Dual Audio Movies",
        "list/multi-audio-movies" to "Multi Audio Movies",
        "list/dual-audio-tv-shows" to "Dual Audio TV",
    )

    data class PapaCard(val shortId: String, val quality: String, val size: String, val audio: String)
    data class LinkData(val cards: List<PapaCard>, val title: String, val isTv: Boolean)

    // ── Fix URL: prepend mainUrl to relative URLs ──
    private fun fixUrl(href: String): String {
        return when {
            href.startsWith("http") -> href
            href.startsWith("/") -> "$mainUrl$href"
            else -> "$mainUrl/$href"
        }
    }

    // ── Main Page ──
    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        // request.data holds the path (e.g. "latest", "Movies", "list/dual-audio-movies")
        val url = if (page > 1) "$mainUrl/${request.data}?&page=$page" else "$mainUrl/${request.data}"
        val doc = try {
            app.get(url, headers = headers, timeout = 30).document
        } catch (e: Exception) {
            println("2MoviesFD: getMainPage '$url' failed - ${e.message}")
            return newHomePageResponse(request.name, emptyList(), hasNext = false)
        }
        val home = doc.select("a.movie-card").mapNotNull { it.toSearch() }
        // Detect a real next page from the pagination widget (no hard-coded cap).
        val hasNext = doc.select("a.pagination-link:not(.disabled):not(.dots):not(.active)")
            .any { it.text().trim().toIntOrNull()?.let { n -> n > page } == true } ||
            doc.selectFirst("a.pagination-link.next:not(.disabled)") != null
        return newHomePageResponse(request.name, home, hasNext = hasNext)
    }

    // ── Search ──
    override suspend fun search(query: String): List<SearchResponse> {
        if (query.isBlank()) return emptyList()
        return try {
            val doc = app.get(
                "$mainUrl/latest?search=${URLEncoder.encode(query, "UTF-8")}",
                headers = headers, timeout = 30
            ).document
            doc.select("a.movie-card").mapNotNull { it.toSearch() }
        } catch (e: Exception) {
            println("2MoviesFD: search '$query' failed - ${e.message}")
            emptyList()
        }
    }

    // ── toSearch: use attr("href") + fixUrl instead of absUrl ──
    private fun Element.toSearch(): SearchResponse? {
        val rawHref = attr("href").trim()
        if (rawHref.isBlank()) return null
        val href = fixUrl(rawHref)
        val title = selectFirst("h3.movie-title")?.text()?.trim() ?: return null
        val poster = selectFirst("img")?.let {
            val src = it.attr("data-src").ifBlank { it.attr("src") }
            if (src.isBlank() || src.endsWith("placeholder.webp")) "" else fixUrl(src)
        } ?: ""
        val quality = selectFirst(".badge-quality")?.text()?.trim()
        val isTv = href.contains("/season/", true) ||
                   title.contains("Season", true) ||
                   title.contains("Web Series", true)
        return if (isTv) {
            newTvSeriesSearchResponse(title, href, TvType.TvSeries) {
                this.posterUrl = poster
                if (!quality.isNullOrBlank()) this.quality = getQualityFromString(quality)
            }
        } else {
            newMovieSearchResponse(title, href, TvType.Movie) {
                this.posterUrl = poster
                if (!quality.isNullOrBlank()) this.quality = getQualityFromString(quality)
            }
        }
    }

    // ── Load ──
    override suspend fun load(url: String): LoadResponse? {
        val doc = try { app.get(url, headers = headers).document } catch (e: Exception) { return null }

        val title = doc.selectFirst("h1")?.text()?.trim()
            ?: doc.selectFirst("title")?.text()?.substringBefore(" - ")?.trim()
            ?: return null

        val poster = doc.selectFirst("img[src*=posters]")?.let {
            val src = it.attr("data-src").ifBlank { it.attr("src") }
            fixUrl(src)
        } ?: ""

        // Real selectors discovered from the live HTML (no hallucination):
        //   .details-plot  -> synopsis text
        //   a[href*=year/] -> release year
        //   .details-metrics -> TMDB rating
        val plot = doc.selectFirst(".details-plot, .movie-description, .description, .synopsis, .plot")?.text()?.trim()
        val genres = doc.select("a[href*=genre/]").map { it.text().trim() }.filter { it.isNotBlank() }
        val year = doc.selectFirst("a[href*=year/]")?.text()?.trim()?.toIntOrNull()
        val isTv = url.contains("/season/", true) || title.contains("Season", true) || title.contains("Web Series", true)

        // Parse ALL download buttons with base64-encoded papa-drive links
        val cards = mutableListOf<PapaCard>()
        val seenIds = mutableSetOf<String>()

        doc.select(".download-btn-dynamic").forEach { btn ->
            val onclick = btn.attr("onclick")
            val b64Match = Regex("handleDownload\\('([^']+)'\\)").find(onclick) ?: return@forEach
            try {
                val papaUrl = String(Base64.decode(b64Match.groupValues[1], Base64.DEFAULT), Charsets.UTF_8)
                val shortId = Regex("/f/([A-Za-z0-9_-]+)").find(papaUrl)?.groupValues?.get(1) ?: return@forEach
                if (seenIds.contains(shortId)) return@forEach
                seenIds.add(shortId)

                // FIX: the real parent is .download-card. The old selector fell back to
                // the button's own <div>, so .quality-header was never found and quality
                // was always empty.
                val card = btn.closest(".download-card")
                val quality = card?.selectFirst(".quality-header img")?.attr("alt")?.trim()
                    ?: card?.selectFirst("img[alt*=p]")?.attr("alt")?.trim()
                    ?: ""

                // Audio tracks live in .audio-info inside the same download card.
                val audio = card?.select(".audio-tag")?.map { it.text().trim() }
                    ?.filter { it.isNotBlank() }?.joinToString(", ") ?: ""

                val sizeText = btn.text().trim()
                val size = Regex("""\[([0-9.]+\s*(?:GB|MB|KB))\]""", RegexOption.IGNORE_CASE).find(sizeText)?.groupValues?.get(1) ?: ""
                cards.add(PapaCard(shortId, quality, size, audio))
            } catch (_: Exception) {}
        }

        println("2MoviesFD: Found ${cards.size} cards for '$title' (isTv=$isTv)")

        val data = LinkData(cards, title, isTv).toJson()

        return if (isTv) {
            newTvSeriesLoadResponse(title, url, TvType.TvSeries, listOf(
                newEpisode(data) { this.episode = 1; this.name = "Complete Season" }
            )) {
                this.posterUrl = poster
                this.plot = plot
                this.tags = genres
                if (year != null) this.year = year
            }
        } else {
            newMovieLoadResponse(title, url, TvType.Movie, data) {
                this.posterUrl = poster
                this.plot = plot
                this.tags = genres
                if (year != null) this.year = year
            }
        }
    }

    // ── Load Links ──
    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        val ld = try { parseJson<LinkData>(data) } catch (_: Exception) { return false }
        if (ld.cards.isEmpty()) {
            println("2MoviesFD: No cards found in loadLinks data")
            return false
        }

        var found = false

        coroutineScope {
            ld.cards.map { card ->
                async {
                    try {
                        // Step 1: Resolve papa-drive short ID → long ID
                        val shortUrl = "https://papa-drive.shop/f/${card.shortId}"
                        val resp = app.get(shortUrl, headers = papaHeaders, allowRedirects = true)
                        val longId = Regex("/file/([A-Za-z0-9_-]+)").find(resp.url)?.groupValues?.get(1)
                        if (longId == null) {
                            println("2MoviesFD: Failed to resolve longId for ${card.shortId}")
                            return@async
                        }

                        // Step 2: Poll all 4 providers concurrently
                        val results = providers.map { provider ->
                            async {
                                try { pollProvider(longId, provider) } catch (_: Exception) { null }
                            }
                        }.awaitAll().mapNotNull { it }

                        println("2MoviesFD: ${results.size}/${providers.size} providers ready for ${card.quality}")

                        // Step 3: Resolve each embed URL.
                        // NOTE: loadExtractor() routes by domain — Byse URLs go to
                        // ByseExtractor, StreamTape/DoodStream use built-in extractors,
                        // StreamHG goes to StreamHGExtractor. Each extractor sets its
                        // own link name; the label here is only a fallback hint.
                        for ((providerName, embedUrl) in results) {
                            try {
                                loadExtractor(embedUrl, "https://papa-drive.shop/", subtitleCallback, callback)
                                found = true
                            } catch (e: Exception) {
                                println("2MoviesFD: loadExtractor failed for $providerName - ${e.message}")
                            }
                        }
                    } catch (e: Exception) {
                        println("2MoviesFD: Card ${card.shortId} failed - ${e.message}")
                    }
                }
            }.awaitAll()
        }

        println("2MoviesFD: loadLinks result: $found")
        return found
    }

    private suspend fun pollProvider(longId: String, provider: String): Pair<String, String>? {
        val base = "https://papa-drive.shop/file/$longId/watch-progress/$provider"
        var delayMs = 2000L
        var elapsed = 0L
        var first = true

        while (elapsed < 20_000L) {
            val url = if (first) "$base?force=1" else base
            first = false
            try {
                val resp = app.get(url, headers = papaHeaders)
                val body = resp.text
                val status = Regex(""""status"\s*:\s*"([^"]+)"""").find(body)?.groupValues?.get(1)
                if (status == "ready") {
                    val embedUrl = Regex(""""url"\s*:\s*"([^"]+)"""").find(body)?.groupValues?.get(1)?.replace("\\/", "/")
                    if (embedUrl != null && embedUrl.startsWith("http")) {
                        return provider to embedUrl
                    }
                }
                if (status == "error") return null
            } catch (_: Exception) {}
            delay(delayMs)
            elapsed += delayMs
            delayMs = minOf(delayMs + 2000L, 6000L)
        }
        return null
    }
}
