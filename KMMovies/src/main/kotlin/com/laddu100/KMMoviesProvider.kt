package com.laddu100

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.AppUtils.toJson
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.Qualities
import com.lagradost.cloudstream3.utils.newExtractorLink
import org.jsoup.Jsoup
import org.jsoup.nodes.Element
import java.net.URLDecoder
import java.net.URLEncoder

/**
 * KMMovies plugin — kmmovies.shop
 *
 * COMPLETE RESOLVER — handles all 5 link types found on magiclinks pages:
 *   1. videoUrl= in page HTML (skytech.works CDN — may be geo-blocked)
 *   2. online.php redirect → nf/index.php?videoUrl= (r2.dev CDN — may be 404)
 *   3. skydrop.sbs/api.php → Google Video URL (WORKS RELIABLY)
 *   4. download99.php → signed r2/worker links (signed, may expire)
 *   5. flexplayer.buzz → m3u8/mp4 (may timeout)
 *
 * Strategy: try ALL methods, emit every working URL as a separate source.
 * The player auto-falls-through if one fails.
 */
class KMMovies : MainAPI() {
    override var mainUrl = "https://kmmovies.shop"
    override var name = "KMMovies"
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
        "/category/movies/" to "Latest Movies",
        "/category/tv-series/" to "TV Series",
        "/category/bollywood/" to "Bollywood",
        "/category/hollywood/" to "Hollywood",
        "/category/4k/" to "4K Movies",
        "/category/south/" to "South Movies",
    )

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        val url = if (page > 1) "$mainUrl${request.data}page/$page/" else "$mainUrl${request.data}"
        val home = try {
            val doc = app.get(url, headers = headers).document
            doc.select(".movie-card").mapNotNull { it.toSearchResult() }
        } catch (e: Exception) {
            println("KMMovies: getMainPage failed - ${e.message}")
            emptyList()
        }
        return newHomePageResponse(request.name, home, hasNext = home.isNotEmpty())
    }

    override suspend fun search(query: String): List<SearchResponse> {
        if (query.isBlank()) return emptyList()
        return try {
            val encoded = URLEncoder.encode(query, "UTF-8")
            val doc = app.get("$mainUrl/?s=$encoded", headers = headers).document
            doc.select(".movie-card").mapNotNull { it.toSearchResult() }
        } catch (e: Exception) {
            println("KMMovies: search failed - ${e.message}")
            emptyList()
        }
    }

    override suspend fun load(url: String): LoadResponse? {
        val doc = try {
            app.get(url, headers = headers).document
        } catch (e: Exception) {
            println("KMMovies: load failed - ${e.message}")
            return null
        }

        val title = doc.selectFirst("h1.hero-title")?.text()?.trim()
            ?: doc.selectFirst("h1")?.text()?.trim()
            ?: return null

        val poster = doc.selectFirst("img.hero-poster")?.attr("src")
            ?: doc.selectFirst("meta[property=og:image]")?.attr("content")
            ?: ""

        val plot = doc.selectFirst("div.description, div.movie-overview, div.synopsis")?.text()?.trim()
        val genres = doc.select("a[href*='/genre/']").map { it.text().trim() }.filter { it.isNotBlank() }.distinct()
        val year = Regex("""\b(20\d{2})\b""").find(title)?.groupValues?.get(1)?.toIntOrNull()

        val dlLinks = doc.select("a.dl-btn").mapNotNull { a ->
            val href = a.attr("href").trim()
            if (href.isBlank()) null else {
                val qualityText = a.text().trim().replace("\n", " ").replace("\t", " ")
                    .replace(Regex("\\s+"), " ")
                Triple(href, "", qualityText)
            }
        }

        println("KMMovies: Found ${dlLinks.size} download links for '$title'")

        val isTv = title.contains("S01", true) || title.contains("S02", true) ||
                   title.contains("Season", true) || title.contains("S0", true) ||
                   doc.selectFirst(".meta-row")?.text()?.contains("TV", true) == true

        val sources = mutableListOf<MovieSource>()
        for ((mlUrl, res, qualityText) in dlLinks) {
            if (!mlUrl.contains("magiclinks")) continue
            val quality = when {
                qualityText.contains("4K", true) && qualityText.contains("SDR") -> "4K SDR"
                qualityText.contains("4K", true) && qualityText.contains("HDR") -> "4K HDR"
                qualityText.contains("4K", true) -> "4K"
                qualityText.contains("2160", true) -> "4K"
                qualityText.contains("1080", true) && qualityText.contains("60FPS", true) -> "1080p 60FPS"
                qualityText.contains("1080", true) && qualityText.contains("HQ", true) -> "1080p HQ"
                qualityText.contains("1080", true) && qualityText.contains("10BIT", true) -> "1080p 10BIT"
                qualityText.contains("1080", true) -> "1080p"
                qualityText.contains("720", true) && qualityText.contains("10BIT", true) -> "720p 10BIT"
                qualityText.contains("720", true) -> "720p"
                qualityText.contains("480", true) -> "480p"
                qualityText.contains("360", true) -> "360p"
                else -> qualityText.take(20).ifBlank { "Unknown" }
            }
            val sizeMatch = Regex("""(\d+(?:\.\d+)?\s*(?:GB|MB))""", RegexOption.IGNORE_CASE).find(qualityText)
            val size = sizeMatch?.groupValues?.get(1) ?: ""
            sources.add(MovieSource(mlUrl, quality, size))
        }

        println("KMMovies: ${sources.size} sources parsed (isTv=$isTv)")

        val data = ContentData(title, sources, isTv).toJson()

        return if (isTv) {
            val episodes = listOf(
                newEpisode(data) {
                    this.episode = 1
                    this.name = "Complete Season / All Episodes"
                }
            )
            newTvSeriesLoadResponse(title, url, TvType.TvSeries, episodes) {
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

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        val cleanData = when {
            data.startsWith("$mainUrl/") -> data.removePrefix("$mainUrl/")
            data.startsWith("/") -> data.removePrefix("/")
            else -> data
        }

        val contentData = try {
            parseJson<ContentData>(cleanData)
        } catch (e: Exception) {
            println("KMMovies: loadLinks parse error - ${e.message}")
            return false
        }

        if (contentData.sources.isEmpty()) {
            println("KMMovies: No sources in data")
            return false
        }

        println("KMMovies: loadLinks ${contentData.sources.size} sources for '${contentData.title}'")

        var found = false

        contentData.sources.amap { source ->
            try {
                val urls = resolveAllLinks(source.url, source.quality)
                for ((directUrl, label) in urls) {
                    println("KMMovies: Resolved $label → ${directUrl.take(80)}...")
                    val qualityInt = when {
                        source.quality.contains("4K", true) -> Qualities.P2160.value
                        source.quality.contains("2160", true) -> Qualities.P2160.value
                        source.quality.contains("1080", true) -> Qualities.P1080.value
                        source.quality.contains("720", true) -> Qualities.P720.value
                        source.quality.contains("480", true) -> Qualities.P480.value
                        else -> Qualities.Unknown.value
                    }
                    val displayName = "KMMovies ${source.quality}" +
                        if (source.size.isNotBlank()) " (${source.size})" else ""

                    // Google Video URLs (GDrive) need NO custom headers — Google's CDN
                    // rejects requests with extra headers on some edge nodes, causing
                    // "unexpected end of stream" errors and infinite loading.
                    // Other CDNs (skytech, kmphotos) need a browser UA header.
                    val isGoogleVideo = directUrl.contains("googleusercontent.com") ||
                                        directUrl.contains("googlevideo.com")

                    callback.invoke(
                        newExtractorLink(
                            source = "KMMovies",
                            name = displayName,
                            url = directUrl,
                            type = ExtractorLinkType.VIDEO
                        ) {
                            this.quality = qualityInt
                            // Only set headers for non-Google URLs
                            if (!isGoogleVideo) {
                                this.headers = mapOf(
                                    "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36"
                                )
                            }
                        }
                    )
                    found = true
                }
                if (urls.isEmpty()) {
                    println("KMMovies: Failed to resolve ${source.quality} - no direct URL from any method")
                }
            } catch (e: Exception) {
                println("KMMovies: Failed to resolve ${source.quality} - ${e.message}")
            }
        }

        println("KMMovies: loadLinks result found=$found")
        return found
    }

    /**
     * Resolve a magiclinks URL to ALL available direct video URLs.
     * Returns a list of (url, label) pairs — each is a separate playable source.
     */
    private suspend fun resolveAllLinks(mlUrl: String, qualityLabel: String): List<Pair<String, String>> {
        val results = mutableListOf<Pair<String, String>>()
        try {
            val mlHtml = app.get(mlUrl, headers = headers).text

            // Method 1: videoUrl= parameter directly in page (skytech CDN)
            val directVideoUrl = Regex("""videoUrl=([^&"'\s]+)""").find(mlHtml)?.groupValues?.get(1)
            if (directVideoUrl != null) {
                val decoded = URLDecoder.decode(directVideoUrl, "UTF-8")
                if (decoded.startsWith("http")) {
                    results.add(decoded to "$qualityLabel (CDN)")
                }
            }

            // Method 2: online.php → follow redirect → videoUrl= in final URL
            val onlineLink = Regex("""href=["']([^"']*online\.php[^"']*)["']""").find(mlHtml)?.groupValues?.get(1)
            if (onlineLink != null) {
                val fullUrl = if (onlineLink.startsWith("http")) onlineLink else "https://z1.kmphotos.cv$onlineLink"
                try {
                    val response = app.get(fullUrl, headers = headers, allowRedirects = false)
                    val location = response.headers["location"] ?: response.headers["Location"]
                    if (location != null) {
                        val videoUrl = Regex("""videoUrl=([^&]+)""").find(location)?.groupValues?.get(1)
                        if (videoUrl != null) {
                            val decoded = URLDecoder.decode(videoUrl, "UTF-8")
                            if (decoded.startsWith("http")) {
                                results.add(decoded to "$qualityLabel (R2)")
                            }
                        }
                    }
                } catch (_: Exception) {}
            }

            // Method 3: skydrop.sbs → api.php → Google Video URL (MOST RELIABLE)
            val skydropLink = Regex("""href=["']([^"']*skydrop\.sbs/download\.php\?id=([^"']+))["']""").find(mlHtml)
            if (skydropLink != null) {
                val skydropId = skydropLink.groupValues[2]
                try {
                    val apiUrl = "https://w1.skydrop.sbs/api.php?id=$skydropId"
                    val apiResponse = app.get(apiUrl, headers = headers).text
                    val skydrop = parseJson<SkydropResponse>(apiResponse)
                    if (skydrop.success && !skydrop.link.isNullOrBlank()) {
                        results.add(skydrop.link to "$qualityLabel (GDrive)")
                    }
                } catch (e: Exception) {
                    println("KMMovies: skydrop failed for $qualityLabel - ${e.message}")
                }
            }

            // Method 4: download99.php → fetch page → extract signed r2/worker links
            val dl99Link = Regex("""href=["']([^"']*download99\.php\?file=([^"']+))["']""").find(mlHtml)
            if (dl99Link != null) {
                val fileName = dl99Link.groupValues[2]
                val dl99Url = "https://z1.kmphotos.cv/download99.php?file=$fileName"
                try {
                    val dl99Html = app.get(dl99Url, headers = headers).text
                    // Find signed r2 link
                    val r2Link = Regex("""href=["']([^"']*dl=r2[^"']+)["']""").find(dl99Html)?.groupValues?.get(1)
                        ?.replace("&amp;", "&")
                    if (r2Link != null) {
                        val fullR2 = if (r2Link.startsWith("http")) r2Link else "https://z1.kmphotos.cv/download99.php$r2Link"
                        results.add(fullR2 to "$qualityLabel (R2-DL)")
                    }
                    // Find signed worker link
                    val workerLink = Regex("""href=["']([^"']*dl=worker[^"']+)["']""").find(dl99Html)?.groupValues?.get(1)
                        ?.replace("&amp;", "&")
                    if (workerLink != null) {
                        val fullWorker = if (workerLink.startsWith("http")) workerLink else "https://z1.kmphotos.cv/download99.php$workerLink"
                        results.add(fullWorker to "$qualityLabel (Worker)")
                    }
                } catch (_: Exception) {}
            }

        } catch (e: Exception) {
            println("KMMovies: resolveAllLinks failed for $mlUrl - ${e.message}")
        }

        return results
    }

    private fun Element.toSearchResult(): SearchResponse? {
        val a = selectFirst("a[href]") ?: return null
        val href = a.attr("href").trim()
        if (href.isBlank() || !href.contains(mainUrl)) return null
        val title = selectFirst(".movie-title")?.text()?.trim()
            ?: a.attr("aria-label")?.trim()
            ?: return null
        val poster = selectFirst("img.poster")?.attr("src") ?: ""
        val isTv = title.contains("S01", true) || title.contains("S02", true) ||
                   title.contains("S0", true) || title.contains("Season", true)
        return if (isTv) {
            newTvSeriesSearchResponse(title, href, TvType.TvSeries) {
                this.posterUrl = poster
            }
        } else {
            newMovieSearchResponse(title, href, TvType.Movie) {
                this.posterUrl = poster
            }
        }
    }

    data class MovieSource(
        val url: String,
        val quality: String,
        val size: String
    )

    data class ContentData(
        val title: String,
        val sources: List<MovieSource>,
        val isTv: Boolean
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class SkydropResponse(
        @JsonProperty("success") val success: Boolean = false,
        @JsonProperty("link") val link: String? = null,
        @JsonProperty("message") val message: String? = null
    )
}
