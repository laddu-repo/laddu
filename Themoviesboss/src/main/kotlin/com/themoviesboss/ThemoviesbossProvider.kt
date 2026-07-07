package com.themoviesboss

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.AppUtils.toJson
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.newExtractorLink
import com.lagradost.cloudstream3.utils.loadExtractor
import org.jsoup.Jsoup
import java.net.URLEncoder

class ThemoviesbossProvider : MainAPI() {
    override var mainUrl = "https://ww1.themoviesboss.blog"
    override var name = "TheMoviesBoss"
    override var lang = "hi"
    override val hasMainPage = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries, TvType.Anime)

    private val headers = mapOf(
        "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36",
        "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
        "Accept-Language" to "en-US,en;q=0.9",
    )

    override val mainPage = mainPageOf(
        "bollywood" to "Bollywood",
        "hollywood" to "Hollywood",
        "hindi" to "Hindi",
        "anime" to "Anime",
        "web-series" to "Web Series",
        "action" to "Action",
        "comedy" to "Comedy",
        "drama" to "Drama",
        "horror" to "Horror",
        "netflix" to "Netflix",
    )

    data class LinkData(
        val tmbLinks: List<TMBLink>,
        val isTv: Boolean,
        val title: String
    )

    data class TMBLink(
        val url: String,
        val quality: String
    )

    // ── Main Page ──
    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        val url = "$mainUrl/genre/${request.data}/page/$page/"
        val home = try {
            val doc = app.get(url, headers = headers).document
            doc.select("article, .post, .item, .entry, .movie-item").mapNotNull { article ->
                val linkEl = article.selectFirst("a[href*=\"$mainUrl/movies/\"]") ?: return@mapNotNull null
                val link = linkEl.attr("href")
                val title = article.selectFirst("h2, h3, .entry-title, .title, .movie-title")?.text()?.trim()
                    ?: linkEl.text()?.trim() ?: return@mapNotNull null
                val img = article.selectFirst("img")?.let {
                    it.attr("data-src").ifBlank { it.attr("src") }
                }
                newMovieSearchResponse(title, link, TvType.Movie) {
                    this.posterUrl = img?.takeIf { it.startsWith("http") && !it.startsWith("data:") }
                }
            }
        } catch (e: Exception) {
            println("TheMoviesBoss: HomePage error - ${e.message}")
            emptyList()
        }
        return newHomePageResponse(request.name, home)
    }

    // ── Search ──
    override suspend fun search(query: String): List<SearchResponse> {
        return try {
            val url = "$mainUrl/?s=${URLEncoder.encode(query, "UTF-8")}"
            val doc = app.get(url, headers = headers).document
            doc.select("article, .post, .item, .entry, .movie-item").mapNotNull { article ->
                val linkEl = article.selectFirst("a[href*=\"$mainUrl/movies/\"]") ?: return@mapNotNull null
                val link = linkEl.attr("href")
                val title = article.selectFirst("h2, h3, .entry-title, .title")?.text()?.trim()
                    ?: linkEl.text()?.trim() ?: return@mapNotNull null
                val img = article.selectFirst("img")?.let {
                    it.attr("data-src").ifBlank { it.attr("src") }
                }
                newMovieSearchResponse(title, link, TvType.Movie) {
                    this.posterUrl = img?.takeIf { it.startsWith("http") && !it.startsWith("data:") }
                }
            }
        } catch (e: Exception) {
            emptyList()
        }
    }

    // ── Load ──
    override suspend fun load(url: String): LoadResponse? {
        return try {
            val doc = app.get(url, headers = headers).document

            val title = doc.selectFirst("h1.entry-title, h1.title, h1")?.text()?.trim()
                ?: doc.selectFirst("title")?.text()?.substringBefore(" - ")?.trim()
                ?: "Unknown"

            val poster = doc.selectFirst(".entry-content img, .post-content img, article img, .movie-poster img")?.let {
                it.attr("data-src").ifBlank { it.attr("src") }
            }?.takeIf { it.startsWith("http") }

            val plot = doc.selectFirst(".entry-content p, .post-content p, .description, .movie-description")?.text()?.trim()

            // Determine if TV/Web Series
            val isTv = title.contains("Season", true) || title.contains("S0", true) ||
                       title.contains("All Episodes", true) || title.contains("Complete", true) ||
                       url.contains("web-series", true)

            // Find all TMBCloud download links
            val tmbLinks = mutableListOf<TMBLink>()
            doc.select("a[href*=\"tmbcloud\"]").forEach { a ->
                val linkUrl = a.attr("href")
                val text = a.text().trim()
                // Parse quality from nearby text or link text
                val quality = Regex("""(\d{3,4}p|4K)""", RegexOption.IGNORE_CASE).find(text)?.groupValues?.get(1)
                    ?: Regex("""(\d{3,4}p|4K)""", RegexOption.IGNORE_CASE).find(a.parent()?.text() ?: "")?.groupValues?.get(1)
                    ?: "Unknown"
                if (linkUrl.isNotBlank()) {
                    tmbLinks.add(TMBLink(linkUrl, quality))
                }
            }

            // Also check for "Download" or "Watch Online" links that might be direct
            doc.select("a[href]").forEach { a ->
                val href = a.attr("href")
                val text = a.text().trim()
                if (!href.contains("tmbcloud") && !href.contains("themoviesboss") &&
                    (text.contains("download", true) || text.contains("watch", true) || text.contains("stream", true))) {
                    val quality = Regex("""(\d{3,4}p|4K)""", RegexOption.IGNORE_CASE).find(text)?.groupValues?.get(1) ?: "Unknown"
                    if (href.startsWith("http")) {
                        tmbLinks.add(TMBLink(href, quality))
                    }
                }
            }

            println("TheMoviesBoss: Found ${tmbLinks.size} download links for '$title' (isTv=$isTv)")

            if (isTv) {
                // Check for episode range
                var epStart = 1
                var epEnd = 1
                val epMatch = Regex("""(?:Ep|Episode)\s*(\d+)\s*[-–]\s*(\d+)""", RegexOption.IGNORE_CASE).find(title)
                if (epMatch != null) {
                    epStart = epMatch.groupValues[1].toIntOrNull() ?: 1
                    epEnd = epMatch.groupValues[2].toIntOrNull() ?: 1
                }

                val episodes = if (epEnd > epStart) {
                    (epStart..epEnd).map { epNum ->
                        newEpisode(LinkData(tmbLinks, true, title).toJson()) {
                            this.episode = epNum
                            this.name = "Episode $epNum"
                        }
                    }
                } else {
                    listOf(newEpisode(LinkData(tmbLinks, true, title).toJson()) {
                        this.episode = 1
                        this.name = "Complete Season"
                    })
                }

                newTvSeriesLoadResponse(title, url, TvType.TvSeries, episodes) {
                    this.posterUrl = poster
                    this.plot = plot
                }
            } else {
                newMovieLoadResponse(title, url, TvType.Movie, LinkData(tmbLinks, false, title).toJson()) {
                    this.posterUrl = poster
                    this.plot = plot
                }
            }
        } catch (e: Exception) {
            println("TheMoviesBoss: load error - ${e.message}")
            null
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
        if (ld.tmbLinks.isEmpty()) return false

        var found = false
        val seenUrls = mutableSetOf<String>()

        for (link in ld.tmbLinks) {
            if (!seenUrls.add(link.url)) continue
            try {
                println("TheMoviesBoss: Resolving ${link.quality} - ${link.url.take(60)}...")
                val qualityInt = parseQuality(link.quality)

                if (link.url.contains("tmbcloud", true)) {
                    // TMBCloud — use custom extractor (WebViewResolver for token system)
                    try {
                        loadExtractor(link.url, "$mainUrl/", subtitleCallback, callback)
                        found = true
                    } catch (e: Exception) {
                        println("TheMoviesBoss: TMBCloud extractor failed - ${e.message}")
                    }
                } else if (link.url.contains(".mp4", true) || link.url.contains(".mkv", true) ||
                           link.url.contains(".m3u8", true)) {
                    // Direct video URL
                    val isM3u8 = link.url.contains(".m3u8", true)
                    callback.invoke(
                        newExtractorLink("TheMoviesBoss", "TheMoviesBoss ${link.quality}", link.url,
                            if (isM3u8) ExtractorLinkType.M3U8 else ExtractorLinkType.VIDEO) {
                            this.quality = qualityInt
                            this.headers = headers
                        }
                    )
                    found = true
                } else {
                    // Try loadExtractor for other hosts
                    try {
                        loadExtractor(link.url, "$mainUrl/", subtitleCallback, callback)
                        found = true
                    } catch (_: Exception) {}
                }
            } catch (e: Exception) {
                println("TheMoviesBoss: Failed for ${link.quality} - ${e.message}")
            }
        }

        return found
    }

    private fun parseQuality(q: String): Int {
        return when {
            q.contains("4K", true) || q.contains("2160", true) -> 2160
            q.contains("1080", true) -> 1080
            q.contains("720", true) -> 720
            q.contains("480", true) -> 480
            q.contains("360", true) -> 360
            else -> -1
        }
    }
}
