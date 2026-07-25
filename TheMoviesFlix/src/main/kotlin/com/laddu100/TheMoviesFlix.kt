package com.laddu100

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*
import com.lagradost.cloudstream3.LoadResponse.Companion.addImdbId
import com.lagradost.cloudstream3.LoadResponse.Companion.addTrailer
import com.lagradost.api.Log
import org.jsoup.nodes.Element
import java.net.URLEncoder

private const val TAG = "TMF"

class TheMoviesFlix : MainAPI() {
    override var mainUrl = "https://moviesflixhq.com"
    override var name = "TheMoviesFlix"
    override val hasMainPage = true
    override var lang = "en"
    override val hasDownloadSupport = true
    override val hasQuickSearch = false
    override val supportedTypes = setOf(
        TvType.Movie,
        TvType.TvSeries
    )

    private val baseHeaders = mapOf(
        "User-Agent" to "Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36",
        "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
        "Accept-Language" to "en-US,en;q=0.9"
    )

    override val mainPage = mainPageOf(
        "" to "Latest Movies & Series",
        "category/web-series" to "Web Series",
        "category/hindi-dubbed-movies" to "Hindi Dubbed Movies",
        "category/english" to "English Movies",
        "category/bollywood" to "Bollywood Movies",
        "category/dual-audio-movies" to "Dual Audio Movies",
        "category/netflix" to "Netflix",
        "category/amazon-prime-video" to "Amazon Prime Video",
        "category/jiohotstar" to "JioHotstar",
        "category/disney-plus-hotstar" to "Disney+ Hotstar",
        "category/2160p" to "4K UHD"
    )

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        mainUrl = FirebaseDomainHelper.getDomain("themoviesflix") ?: mainUrl
        val path = request.data
        val url = if (path.isBlank()) {
            if (page > 1) "$mainUrl/page/$page/" else "$mainUrl/"
        } else {
            if (page > 1) "$mainUrl/$path/page/$page/" else "$mainUrl/$path/"
        }
        val doc = app.get(url, headers = baseHeaders).document
        val items = doc.select("article.latestpost a[id=featured-thumbnail]").mapNotNull { it.toSearchResult() }
        val hasNext = doc.select("div.navigation a.nextpostslink, div.navigation li a:contains(Next)").isNotEmpty()
        return newHomePageResponse(request.name, items, hasNext = hasNext)
    }

    private fun Element.toSearchResult(): SearchResponse? {
        val href = this.attr("href").ifBlank { return null }
        val titleRaw = this.attr("title").ifBlank { return null }
        val title = cleanTitle(titleRaw)
        val img = this.selectFirst("img")?.let {
            it.attr("data-src").ifBlank { it.attr("src") }
        } ?: ""
        val quality = getSearchQuality(titleRaw)

        val isSeries = titleRaw.contains("Season", true) ||
                titleRaw.contains("Series", true) ||
                titleRaw.contains("Web Series", true) ||
                titleRaw.contains("TV Show", true) ||
                Regex("""\bS\d{1,2}\b""", RegexOption.IGNORE_CASE).containsMatchIn(titleRaw)

        return if (isSeries) {
            newTvSeriesSearchResponse(title, href, TvType.TvSeries) {
                this.posterUrl = img
                this.quality = quality
            }
        } else {
            newMovieSearchResponse(title, href, TvType.Movie) {
                this.posterUrl = img
                this.quality = quality
            }
        }
    }

    private fun cleanTitle(raw: String): String {
        var t = raw
        t = t.replace(Regex("^Download\\s+", RegexOption.IGNORE_CASE), "")
        t = t.substringBefore(" 480p").substringBefore(" 720p").substringBefore(" 1080p")
        t = t.substringBefore(" {Hindi").substringBefore(" {English")
        t = t.substringBefore(" (Hindi").substringBefore(" (English")
        t = t.substringBefore(" Hindi Dubbed").substringBefore(" Dual Audio")
        t = t.substringBefore(" [480p").substringBefore(" [720p").substringBefore(" [1080p")
        t = t.substringBefore(" Web Dl").substringBefore(" WEB-DL").substringBefore(" BluRay")
        t = t.substringBefore(" Full Movie").substringBefore(" Complete")
        return t.trim().trimEnd('(', '-', ':')
    }

    private fun getSearchQuality(text: String): SearchQuality? {
        return when {
            text.contains("2160p", true) || text.contains("4K", true) || text.contains("UHD", true) -> SearchQuality.FourK
            text.contains("1080p", true) || text.contains("FullHD", true) -> SearchQuality.HD
            text.contains("720p", true) -> SearchQuality.SD
            text.contains("480p", true) -> SearchQuality.SD
            else -> null
        }
    }

    override suspend fun search(query: String): List<SearchResponse> {
        mainUrl = FirebaseDomainHelper.getDomain("themoviesflix") ?: mainUrl
        val url = "$mainUrl/?s=${URLEncoder.encode(query, "UTF-8")}"
        val doc = app.get(url, headers = baseHeaders).document
        return doc.select("article.latestpost a[id=featured-thumbnail]").mapNotNull { it.toSearchResult() }
    }

    override suspend fun load(url: String): LoadResponse? {
        mainUrl = FirebaseDomainHelper.getDomain("themoviesflix") ?: mainUrl
        Log.d(TAG, "load: url=$url mainUrl=$mainUrl")
        val doc = app.get(url, headers = baseHeaders).document
        val entry = doc.selectFirst("div.entry-content") ?: return null

        val titleRaw = doc.selectFirst("h2.mfx-main-title")?.text()
            ?: doc.selectFirst("h1.entry-title")?.text()
            ?: doc.selectFirst("title")?.text()
            ?: return null
        val title = cleanTitle(titleRaw)
        val pageTitle = doc.selectFirst("title")?.text() ?: ""

        val poster = doc.selectFirst("meta[property=og:image]")?.attr("content") ?: ""
        val plot = entry.selectFirst("div.mfx-plot-box")?.text()?.trim()
        val year = extractYear(entry) ?: extractYearFromTitle(titleRaw)

        val genres = extractListFromInfo(entry, "Genres")
        val cast = extractListFromInfo(entry, "Cast").map { ActorData(Actor(it)) }
        val runtime = extractFieldFromInfo(entry, "Runtime")?.replace(Regex("[^0-9]"), "")?.toIntOrNull()

        val imdbLink = entry.selectFirst("div.mfx-imdb a[href*=imdb]")?.attr("href") ?: ""
        val imdbId = Regex("""title/(tt\d+)""").find(imdbLink)?.groupValues?.get(1)
        val ratingText = entry.selectFirst("div.mfx-imdb a")?.text() ?: ""
        val rating = Regex("""([\d.]+)/10""").find(ratingText)?.groupValues?.get(1)?.toFloatOrNull()

        val trailerId = entry.selectFirst("div.mfx-yt-lazy")?.attr("data-yt-id")
        val trailer = trailerId?.let { "https://www.youtube.com/watch?v=$it" }

        val downloadGroups = extractDownloadGroups(entry)
        Log.d(TAG, "load: found ${downloadGroups.size} download groups for '$title'")

        val allTextToCheck = titleRaw + " " + pageTitle + " " + url + " " +
            downloadGroups.joinToString(" ") { it.label }
        val isSeries = allTextToCheck.contains("Season", true) ||
                allTextToCheck.contains("Series", true) ||
                allTextToCheck.contains("Web Series", true) ||
                allTextToCheck.contains("TV Show", true) ||
                allTextToCheck.contains("Episode", true) ||
                Regex("""\bS\d{1,2}\b""", RegexOption.IGNORE_CASE).containsMatchIn(allTextToCheck)

        if (isSeries) {
            val episodes = mutableListOf<com.lagradost.cloudstream3.Episode>()
            val seasonGroups = mutableMapOf<Int, MutableList<DownloadGroup>>()

            for (group in downloadGroups) {
                val seasonNum = extractSeasonNumber(group.label) ?: 1
                seasonGroups.getOrPut(seasonNum) { mutableListOf() }.add(group)
            }

            for ((seasonNum, groups) in seasonGroups) {
                if (groups.isEmpty()) continue
                val firstGroup = groups.first()
                val allNexdriveUrls = groups.joinToString("|") { it.redirectUrl }
                val episodeLinks = resolveNexdriveEpisodes(firstGroup.redirectUrl)

                if (episodeLinks.isEmpty()) {
                    val dataStr = "$allNexdriveUrls|$seasonNum|1"
                    episodes.add(newEpisode(dataStr) {
                        this.name = firstGroup.label
                        this.episode = 1
                        this.season = seasonNum
                    })
                } else {
                    for ((epNum, _) in episodeLinks) {
                        val dataStr = "$allNexdriveUrls|$seasonNum|$epNum"
                        episodes.add(newEpisode(dataStr) {
                            this.name = "Episode $epNum"
                            this.episode = epNum
                            this.season = seasonNum
                        })
                    }
                }
            }

            return newTvSeriesLoadResponse(title, url, TvType.TvSeries, episodes) {
                this.posterUrl = poster
                this.plot = plot
                this.year = year
                this.tags = genres
                this.score = rating?.let { Score.from10(it) }
                this.actors = cast
                this.duration = runtime
                if (imdbId != null) addImdbId(imdbId)
                if (trailer != null) addTrailer(trailer)
            }
        } else {
            val dataStr = downloadGroups.joinToString("\n") { it.redirectUrl }
            Log.d(TAG, "load: movie dataStr='${dataStr.take(200)}'")
            return newMovieLoadResponse(title, url, TvType.Movie, dataStr) {
                this.posterUrl = poster
                this.plot = plot
                this.year = year
                this.tags = genres
                this.score = rating?.let { Score.from10(it) }
                this.actors = cast
                this.duration = runtime
                if (imdbId != null) addImdbId(imdbId)
                if (trailer != null) addTrailer(trailer)
            }
        }
    }

    private data class DownloadGroup(
        val label: String,
        val redirectUrl: String
    )

    private fun extractDownloadGroups(entry: Element): List<DownloadGroup> {
        val groups = mutableListOf<DownloadGroup>()
        val divs = entry.select("div.mfx-download-group")
        for (div in divs) {
            val label = div.selectFirst("h3")?.text()?.trim() ?: continue
            val link = div.selectFirst("a[href]")?.attr("href") ?: continue
            if (link.isNotBlank() && link != "#") {
                groups.add(DownloadGroup(label, link))
            }
        }
        return groups
    }

    private suspend fun resolveNexdriveEpisodes(url: String): List<Pair<Int, List<String>>> {
        return try {
            val fixedUrl = url.replace("mobilejsr.rest", "nexdrive.fit")
            Log.d(TAG, "resolveNexdriveEpisodes: fetching $fixedUrl")
            val doc = app.get(fixedUrl, headers = baseHeaders + ("Referer" to "$mainUrl/")).document
            val article = doc.selectFirst("article") ?: return emptyList<Pair<Int, List<String>>>()

            val episodes: MutableList<Pair<Int, List<String>>> = ArrayList()

            for (h4 in article.select("h4")) {
                val text = h4.text().trim()
                if (!text.contains("Episode", ignoreCase = true)) continue

                val epNum = Regex("""Episode[s]?\s*:\s*0*(\d+)""", RegexOption.IGNORE_CASE)
                    .find(text)?.groupValues?.get(1)?.toIntOrNull() ?: continue

                var sibling = h4.nextElementSibling()
                val links = mutableListOf<String>()
                var attempts = 0
                while (sibling != null && attempts < 3) {
                    for (a in sibling.select("a[href]")) {
                        val href = a.attr("href").trim()
                        if (href.isNotBlank() && !href.startsWith("#") && href.startsWith("http") &&
                            !href.contains("nexdrive") && !href.contains("mobilejsr") &&
                            !href.contains("moviesflix") && !href.contains("wp-") &&
                            !href.contains("vglist") && !href.contains("w.org") &&
                            !href.contains("cloudflare") && !href.contains("googleapi") &&
                            !href.contains("googletagmanager") && !href.contains("font-awesome") &&
                            !href.contains("gmpg")) {
                            links.add(href)
                        }
                    }
                    if (links.isNotEmpty()) break
                    sibling = sibling.nextElementSibling()
                    attempts++
                }

                if (links.isNotEmpty()) {
                    Log.d(TAG, "resolveNexdriveEpisodes: ep $epNum found ${links.size} links")
                    episodes.add(Pair(epNum, links))
                }
            }

            episodes.toList()
        } catch (e: Exception) {
            Log.d(TAG, "resolveNexdriveEpisodes: FAILED ${e.message}")
            emptyList<Pair<Int, List<String>>>()
        }
    }

    // ============================================================
    //  resolveRedirectPage — fetch nexdrive page, get ALL download links
    // ============================================================
    private suspend fun resolveRedirectPage(url: String): List<String> {
        val fixedUrl = url.replace("mobilejsr.rest", "nexdrive.fit")
        Log.d(TAG, "resolveRedirectPage: fetching $fixedUrl")
        return try {
            val response = app.get(fixedUrl, headers = baseHeaders + ("Referer" to "$mainUrl/"))
            val html = response.text
            Log.d(TAG, "resolveRedirectPage: got ${html.length} chars")

            val doc = response.document
            val article = doc.selectFirst("article") ?: doc.selectFirst("div.entry-content") ?: run {
                Log.d(TAG, "resolveRedirectPage: NO article found!")
                return emptyList()
            }

            val allLinks = mutableSetOf<String>()

            for (a in article.select("a[href]")) {
                val href = a.attr("href").trim()
                if (href.isBlank() || href.startsWith("#") || !href.startsWith("http")) continue
                if (href.contains("nexdrive") || href.contains("mobilejsr") ||
                    href.contains("moviesflix") || href.contains("wp-") ||
                    href.contains("vglist") || href.contains("w.org") ||
                    href.contains("cloudflare") || href.contains("googleapi") ||
                    href.contains("googletagmanager") || href.contains("font-awesome") ||
                    href.contains("gmpg")) continue
                allLinks.add(href)
            }

            Log.d(TAG, "resolveRedirectPage: found ${allLinks.size} external links")
            for (link in allLinks) {
                Log.d(TAG, "resolveRedirectPage: LINK → $link")
            }

            allLinks.toList()
        } catch (e: Exception) {
            Log.d(TAG, "resolveRedirectPage: FAILED for $fixedUrl: ${e.message}")
            emptyList()
        }
    }

    private suspend fun resolveNexdriveEpisodeLinks(url: String, episodeNum: Int): List<String> {
        val fixedUrl = url.replace("mobilejsr.rest", "nexdrive.fit")
        Log.d(TAG, "resolveNexdriveEpisodeLinks: fetching $fixedUrl for episode $episodeNum")
        return try {
            val doc = app.get(fixedUrl, headers = baseHeaders + ("Referer" to "$mainUrl/")).document
            val article = doc.selectFirst("article") ?: return emptyList()

            for (h4 in article.select("h4")) {
                val text = h4.text().trim()
                if (!text.contains("Episode", ignoreCase = true)) continue
                val epNum = Regex("""Episode[s]?\s*:\s*0*(\d+)""", RegexOption.IGNORE_CASE)
                    .find(text)?.groupValues?.get(1)?.toIntOrNull() ?: continue
                if (epNum != episodeNum) continue

                var sibling = h4.nextElementSibling()
                val links = mutableListOf<String>()
                var attempts = 0
                while (sibling != null && attempts < 3) {
                    for (a in sibling.select("a[href]")) {
                        val href = a.attr("href").trim()
                        if (href.isNotBlank() && !href.startsWith("#") && href.startsWith("http") &&
                            !href.contains("nexdrive") && !href.contains("mobilejsr") &&
                            !href.contains("moviesflix") && !href.contains("wp-") &&
                            !href.contains("vglist") && !href.contains("w.org") &&
                            !href.contains("cloudflare") && !href.contains("googleapi") &&
                            !href.contains("googletagmanager") && !href.contains("font-awesome") &&
                            !href.contains("gmpg")) {
                            links.add(href)
                        }
                    }
                    if (links.isNotEmpty()) break
                    sibling = sibling.nextElementSibling()
                    attempts++
                }
                Log.d(TAG, "resolveNexdriveEpisodeLinks: ep $episodeNum found ${links.size} links")
                return links
            }

            // Fallback: return ALL download links
            val allLinks = mutableListOf<String>()
            for (a in article.select("a[href]")) {
                val href = a.attr("href").trim()
                if (href.isNotBlank() && !href.startsWith("#") && href.startsWith("http") &&
                    !href.contains("nexdrive") && !href.contains("mobilejsr") &&
                    !href.contains("moviesflix") && !href.contains("wp-") &&
                    !href.contains("vglist") && !href.contains("w.org") &&
                    !href.contains("cloudflare") && !href.contains("googleapi") &&
                    !href.contains("googletagmanager") && !href.contains("font-awesome") &&
                    !href.contains("gmpg")) {
                    allLinks.add(href)
                }
            }
            Log.d(TAG, "resolveNexdriveEpisodeLinks: fallback found ${allLinks.size} links")
            allLinks
        } catch (e: Exception) {
            Log.d(TAG, "resolveNexdriveEpisodeLinks: FAILED: ${e.message}")
            emptyList()
        }
    }

    // ============================================================
    //  loadLinks — main entry point
    // ============================================================
    //  CRITICAL: Uses NonCancellable context for each link so that
    //  if one link times out, the others still get processed.
    //  Each link is passed to loadExtractor() which dispatches to the
    //  appropriate ExtractorApi subclass (FastDlExtractor, VCloudExtractor,
    //  GoFileExtractor, FileBeeExtractor) based on URL domain.
    //
    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        Log.d(TAG, "========================================")
        Log.d(TAG, "loadLinks: START data='${data.take(300)}'")
        if (data.isBlank()) return false

        val parts = data.split("|")
        val isTvEpisode = parts.size >= 3 &&
            parts[parts.size - 2].toIntOrNull() != null &&
            parts[parts.size - 1].toIntOrNull() != null

        val allLinks = mutableListOf<String>()

        if (isTvEpisode) {
            Log.d(TAG, "loadLinks: TV episode mode")
            val seasonNum = parts[parts.size - 2].toInt()
            val episodeNum = parts[parts.size - 1].toInt()
            val nexdriveUrls = parts.dropLast(2).filter { it.isNotBlank() }
            Log.d(TAG, "loadLinks: season=$seasonNum episode=$episodeNum nexdriveUrls=${nexdriveUrls.size}")

            for (nexdriveUrl in nexdriveUrls) {
                try {
                    val episodeLinks = resolveNexdriveEpisodeLinks(nexdriveUrl, episodeNum)
                    Log.d(TAG, "loadLinks: got ${episodeLinks.size} links from nexdrive for ep $episodeNum")
                    allLinks.addAll(episodeLinks)
                } catch (e: Exception) {
                    Log.d(TAG, "loadLinks: TV nexdrive fetch FAILED for $nexdriveUrl: ${e.message}")
                }
            }
        } else {
            Log.d(TAG, "loadLinks: Movie mode")
            val redirectUrls = data.split("\n").map { it.trim() }.filter { it.isNotBlank() }
            Log.d(TAG, "loadLinks: ${redirectUrls.size} redirect URLs to process")

            for (redirectUrl in redirectUrls) {
                try {
                    val links = resolveRedirectPage(redirectUrl)
                    allLinks.addAll(links)
                } catch (e: Exception) {
                    Log.d(TAG, "loadLinks: redirect fetch FAILED for $redirectUrl: ${e.message}")
                }
            }
        }

        Log.d(TAG, "loadLinks: total ${allLinks.size} links to resolve")
        if (allLinks.isEmpty()) {
            Log.d(TAG, "loadLinks: no links found, returning false")
            return false
        }

        // Process each link in NonCancellable context so they all get a chance
        var foundAny = false
        for ((index, link) in allLinks.withIndex()) {
            Log.d(TAG, "loadLinks: [$index/${allLinks.size}] processing: $link")
            try {
                kotlinx.coroutines.withContext(kotlinx.coroutines.NonCancellable) {
                    // loadExtractor dispatches to the appropriate ExtractorApi subclass
                    // based on the URL domain. Our custom extractors (FastDlExtractor,
                    // VCloudExtractor, GoFileExtractor, FileBeeExtractor) handle
                    // the specific hosts. For all other hosts, CloudStream's built-in
                    // extractors are used.
                    val loaded = try {
                        loadExtractor(link, "https://nexdrive.fit/", subtitleCallback, callback)
                    } catch (e: Exception) {
                        Log.d(TAG, "loadLinks: [$index] loadExtractor FAILED: ${e.message}")
                        false
                    }
                    Log.d(TAG, "loadLinks: [$index] loadExtractor result: $loaded")
                    if (loaded) foundAny = true
                }
            } catch (e: Exception) {
                Log.d(TAG, "loadLinks: [$index] EXCEPTION: ${e.message}")
            }
        }

        Log.d(TAG, "loadLinks: END foundAny=$foundAny")
        return foundAny
    }

    private fun extractYear(entry: Element): Int? {
        val yearText = entry.selectFirst("div.mfx-info-box li:contains(Released Year)")?.text()
        return yearText?.let { Regex("""(\d{4})""").find(it)?.groupValues?.get(1)?.toIntOrNull() }
    }

    private fun extractYearFromTitle(title: String): Int? {
        return Regex("""(\d{4})""").find(title)?.groupValues?.get(1)?.toIntOrNull()
    }

    private fun extractSeasonNumber(text: String): Int? {
        return Regex("""Season\s*(\d+)""", RegexOption.IGNORE_CASE).find(text)?.groupValues?.get(1)?.toIntOrNull()
            ?: Regex("""\bS(\d+)\b""", RegexOption.IGNORE_CASE).find(text)?.groupValues?.get(1)?.toIntOrNull()
    }

    private fun extractFieldFromInfo(entry: Element, fieldName: String): String? {
        return entry.selectFirst("div.mfx-info-box li:contains($fieldName)")?.text()
            ?.replace(Regex("$fieldName:\\s*", RegexOption.IGNORE_CASE), "")
            ?.trim()
    }

    private fun extractListFromInfo(entry: Element, fieldName: String): List<String> {
        val text = extractFieldFromInfo(entry, fieldName) ?: return emptyList()
        return text.split(",").map { it.trim() }.filter { it.isNotBlank() }
    }
}
