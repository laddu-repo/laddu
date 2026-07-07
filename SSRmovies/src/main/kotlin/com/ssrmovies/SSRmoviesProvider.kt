package com.ssrmovies

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.AppUtils.toJson
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.M3u8Helper
import com.lagradost.cloudstream3.utils.newExtractorLink
import com.lagradost.cloudstream3.amap
import com.lagradost.cloudstream3.utils.loadExtractor
import org.jsoup.Jsoup
import java.net.URLEncoder

class SSRmoviesProvider : MainAPI() {
    override var mainUrl = "https://ssrmovies.archi"
    override var name = "SSRmovies"
    override var lang = "hi"
    override val hasMainPage = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)

    private val headers = mapOf(
        "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36",
        "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
        "Accept-Language" to "en-US,en;q=0.9",
    )

    override val mainPage = mainPageOf(
        "bollywood-movies" to "Bollywood Movies",
        "hollywood-movies-hd" to "Hollywood Movies",
        "dual-audio-movies" to "Dual Audio",
        "web-series" to "Web Series",
        "tv-shows" to "TV Shows",
        "4k-movies" to "4K Movies",
        "tamil-movies" to "Tamil Movies",
        "telugu-movies" to "Telugu Movies",
        "dubbed-movies" to "Dubbed Movies",
        "animated-movies" to "Animated Movies",
    )

    data class LinkData(
        val linkszillaUrls: List<LinkszillaLink>,
        val isTv: Boolean,
        val title: String
    )

    data class LinkszillaLink(
        val url: String,
        val quality: String,
        val size: String,
        val fullText: String = ""
    )

    // ── Main Page ──
    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        val url = "$mainUrl/category/${request.data}/page/$page/"
        val home = try {
            val doc = app.get(url, headers = headers).document
            doc.select("article, .post, .item, .entry").mapNotNull { article ->
                val link = article.selectFirst("a[href*=\"$mainUrl/\"]")?.attr("href") ?: return@mapNotNull null
                if (link.contains("/category/") || link.contains("/page/")) return@mapNotNull null
                val title = article.selectFirst("h2, h3, .entry-title, .title")?.text()?.trim()
                    ?: article.selectFirst("a")?.text()?.trim() ?: return@mapNotNull null
                val imgEl = article.selectFirst("img")
                val img = if (imgEl != null) {
                    // SSRmovies uses lazy-load: src is a placeholder, actual URL is in style="background:url('...')"
                    val style = imgEl.attr("style")
                    val bgUrl = if (style.contains("background:url('")) style.substringAfter("background:url('").substringBefore("'") else null
                    bgUrl
                        ?: imgEl.attr("data-src").ifBlank { imgEl.attr("src") }
                } else null
                newMovieSearchResponse(title, link, TvType.Movie) {
                    this.posterUrl = img
                }
            }
        } catch (e: Exception) {
            println("SSRmovies: HomePage error - ${e.message}")
            emptyList()
        }
        return newHomePageResponse(request.name, home)
    }

    // ── Search ──
    override suspend fun search(query: String): List<SearchResponse> {
        return try {
            val url = "$mainUrl/?s=${URLEncoder.encode(query, "UTF-8")}"
            val doc = app.get(url, headers = headers).document
            doc.select("article, .post, .item, .entry").mapNotNull { article ->
                val link = article.selectFirst("a[href*=\"$mainUrl/\"]")?.attr("href") ?: return@mapNotNull null
                if (link.contains("/category/") || link.contains("/page/")) return@mapNotNull null
                val title = article.selectFirst("h2, h3, .entry-title, .title")?.text()?.trim()
                    ?: article.selectFirst("a")?.text()?.trim() ?: return@mapNotNull null
                val imgEl = article.selectFirst("img")
                val img = if (imgEl != null) {
                    // SSRmovies uses lazy-load: src is a placeholder, actual URL is in style="background:url('...')"
                    val style = imgEl.attr("style")
                    val bgUrl = if (style.contains("background:url('")) style.substringAfter("background:url('").substringBefore("'") else null
                    bgUrl
                        ?: imgEl.attr("data-src").ifBlank { imgEl.attr("src") }
                } else null
                newMovieSearchResponse(title, link, TvType.Movie) {
                    this.posterUrl = img
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

            // Extract title
            val title = doc.selectFirst("h1.entry-title, h1.title, h1")?.text()?.trim()
                ?: doc.selectFirst("title")?.text()?.substringBefore(" – ")?.trim()
                ?: "Unknown"

            // Extract poster
            val posterEl = doc.selectFirst(".entry-content img, .post-content img, article img, .featured-thumbnail img")
            val poster = if (posterEl != null) {
                val style = posterEl.attr("style")
                val bgUrl = if (style.contains("background:url('")) style.substringAfter("background:url('").substringBefore("'") else null
                bgUrl
                    ?: posterEl.attr("data-src").ifBlank { posterEl.attr("src") }
            } else null

            // Extract plot
            val plot = doc.selectFirst(".entry-content p, .post-content p, .description")?.text()?.trim()

            // Determine if TV show (look for episode/season indicators)
            val isTv = title.contains("S0", true) || title.contains("Season", true) ||
                       title.contains("Complete", true) || title.contains("Ep", true) ||
                       url.contains("web-series", true) || url.contains("tv-show", true)

            // Find all linkszilla download links with quality/size info
            val linkszillaLinks = mutableListOf<LinkszillaLink>()
            doc.select("a[href*=\"linkszilla\"]").forEach { a ->
                val linkUrl = a.attr("href")
                val text = a.text().trim()
                // Parse quality from text (e.g., "Watch & Download in 1080p - 3.71GB")
                val quality = Regex("""(\d{3,4}p|4K)""", RegexOption.IGNORE_CASE).find(text)?.groupValues?.get(1) ?: "Unknown"
                val size = Regex("""(\d+\.?\d*\s*(?:GB|MB))""", RegexOption.IGNORE_CASE).find(text)?.groupValues?.get(1) ?: ""
                if (linkUrl.isNotBlank()) {
                    val parentText = a.parent()?.text()?.trim() ?: text
                    linkszillaLinks.add(LinkszillaLink(linkUrl, quality, size, parentText))
                }
            }

            // Also check for direct download links (not via linkszilla)
            doc.select("a[href*=\"download\"], a[href*=\".mp4\"], a[href*=\".mkv\"]").forEach { a ->
                val linkUrl = a.attr("href")
                if (linkUrl.contains("linkszilla")) return@forEach
                val text = a.text().trim()
                val quality = Regex("""(\d{3,4}p|4K)""", RegexOption.IGNORE_CASE).find(text)?.groupValues?.get(1) ?: "Unknown"
                val size = Regex("""(\d+\.?\d*\s*(?:GB|MB))""", RegexOption.IGNORE_CASE).find(text)?.groupValues?.get(1) ?: ""
                if (linkUrl.isNotBlank() && (linkUrl.startsWith("http"))) {
                    linkszillaLinks.add(LinkszillaLink(linkUrl, quality, size))
                }
            }

            println("SSRmovies: Found ${linkszillaLinks.size} download links for '$title' (isTv=$isTv)")

            if (isTv) {
                // SSRmovies downloads are season packs (1 file = all episodes)
                // Show as 1 episode with proper label
                var epLabel = "Complete Season"
                for (link in linkszillaLinks) {
                    val epMatch = Regex("""(?:Ep|Episode)\s*(\d+)\s*[-–]\s*(\d+)""", RegexOption.IGNORE_CASE)
                        .find(link.fullText)
                    if (epMatch != null) {
                        epLabel = "Complete Season (Ep ${epMatch.groupValues[1]}-${epMatch.groupValues[2]})"
                        break
                    }
                }
                if (epLabel == "Complete Season") {
                    val pageEpMatch = Regex("""(?:Ep|Episode)\s*(\d+)\s*[-–]\s*(\d+)""", RegexOption.IGNORE_CASE)
                        .find(doc.text())
                    if (pageEpMatch != null) {
                        epLabel = "Complete Season (Ep ${pageEpMatch.groupValues[1]}-${pageEpMatch.groupValues[2]})"
                    }
                }

                println("SSRmovies: TV show: $epLabel")

                val episodes = listOf(newEpisode(LinkData(linkszillaLinks, true, title).toJson()) {
                    this.episode = 1
                    this.name = epLabel
                })

                newTvSeriesLoadResponse(title, url, TvType.TvSeries, episodes) {
                    this.posterUrl = poster
                    this.plot = plot
                }
            } else {
                newMovieLoadResponse(title, url, TvType.Movie, LinkData(linkszillaLinks, false, title).toJson()) {
                    this.posterUrl = poster
                    this.plot = plot
                }
            }
        } catch (e: Exception) {
            println("SSRmovies: load error - ${e.message}")
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
        if (ld.linkszillaUrls.isEmpty()) return false

        val seenUrls = mutableSetOf<String>()

        // Run ALL linkszilla links CONCURRENTLY for speed
        // Before: 3 links × (follow redirect + parse + resolve each host) = 3+ min sequential
        // After: all run in parallel = ~15-20s total
        ld.linkszillaUrls.amap { link ->
            try {
                println("SSRmovies: Following linkszilla: ${link.url.take(50)}... (${link.quality})")

                val linkszillaHeaders = mapOf(
                    "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36",
                    "Referer" to "$mainUrl/",
                    "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8"
                )

                val finalResponse = app.get(link.url, headers = linkszillaHeaders)
                val finalHtml = finalResponse.text
                val finalDoc = Jsoup.parse(finalHtml)

                val qualityInt = parseQuality(link.quality)

                // Parse all file host links from linkszilla page
                finalDoc.select("a[href]").forEach { a ->
                    val hostUrl = a.attr("href")
                    val hostLabel = a.text().trim()
                    if (!hostUrl.startsWith("http") || hostUrl.contains("linkszilla") ||
                        hostUrl.contains("google") || hostUrl.contains("facebook") ||
                        hostUrl.contains("twitter") || hostUrl.contains("pinterest") ||
                        hostUrl.contains("reddit") || hostUrl.contains("whatsapp") ||
                        hostUrl.contains("telegram") || hostUrl.contains("quora") ||
                        hostUrl.contains("trustpilot")) return@forEach
                    if (hostLabel.isBlank() || hostLabel.length >= 100) return@forEach

                    synchronized(seenUrls) {
                        if (!seenUrls.add(hostUrl)) return@forEach
                    }

                    try {
                        when {
                            hostUrl.contains("watch-online.mom", true) -> {
                                loadExtractor(hostUrl, "$mainUrl/", subtitleCallback, callback)
                            }
                            hostUrl.contains("direct-cloud.top", true) ||
                            hostUrl.contains("uploadflix.com", true) ||
                            hostUrl.contains("dl.uploadflix", true) ||
                            hostUrl.contains("dl.direct-cloud", true) -> {
                                try {
                                    val resp = app.get(hostUrl, headers = linkszillaHeaders, allowRedirects = false)
                                    val location = resp.headers["location"] ?: hostUrl
                                    if (location.contains(".mp4", true) || location.contains(".mkv", true)) {
                                        callback.invoke(
                                            newExtractorLink("SSRmovies", "SSRmovies ${link.quality}", location, ExtractorLinkType.VIDEO) {
                                                this.quality = qualityInt
                                                this.headers = linkszillaHeaders
                                            }
                                        )
                                    } else {
                                        val resp2 = app.get(location, headers = linkszillaHeaders, allowRedirects = true)
                                        if (resp2.url.contains(".mp4", true) || resp2.url.contains(".mkv", true)) {
                                            callback.invoke(
                                                newExtractorLink("SSRmovies", "SSRmovies ${link.quality}", resp2.url, ExtractorLinkType.VIDEO) {
                                                    this.quality = qualityInt
                                                    this.headers = linkszillaHeaders
                                                }
                                            )
                                        }
                                    }
                                } catch (_: Exception) {}
                            }
                            hostUrl.contains("gofile.io", true) ||
                            hostUrl.contains("1fichier.com", true) ||
                            hostUrl.contains("clicknupload", true) ||
                            hostUrl.contains("hubcloud.cx", true) ||
                            hostUrl.contains("gdflix.io", true) ||
                            hostUrl.contains("hexload.com", true) ||
                            hostUrl.contains("multiup.io", true) -> {
                                try {
                                    loadExtractor(hostUrl, "$mainUrl/", subtitleCallback, callback)
                                } catch (_: Exception) {}
                            }
                            else -> {
                                try {
                                    loadExtractor(hostUrl, "$mainUrl/", subtitleCallback, callback)
                                } catch (_: Exception) {}
                            }
                        }
                    } catch (_: Exception) {}
                }
            } catch (e: Exception) {
                println("SSRmovies: Linkszilla failed for ${link.quality} - ${e.message}")
            }
        }

        return true
    }

    private fun parseQuality(q: String): Int {
        return when {
            q.contains("4K", true) -> 2160
            q.contains("2160", true) -> 2160
            q.contains("1080", true) -> 1080
            q.contains("720", true) -> 720
            q.contains("480", true) -> 480
            q.contains("360", true) -> 360
            else -> -1
        }
    }
}
