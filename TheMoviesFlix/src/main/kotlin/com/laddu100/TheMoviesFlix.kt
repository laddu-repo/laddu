package com.laddu100

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*
import com.lagradost.cloudstream3.LoadResponse.Companion.addImdbId
import com.lagradost.cloudstream3.LoadResponse.Companion.addTrailer
import com.lagradost.cloudstream3.network.WebViewResolver
import com.lagradost.api.Log
import org.jsoup.nodes.Element
import java.net.URLDecoder
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
        Log.d(TAG, "getMainPage: mainUrl=$mainUrl page=$page")
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
        Log.d(TAG, "search: query='$query' mainUrl=$mainUrl")
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

    private suspend fun resolveRedirectPage(url: String): List<String> {
        val fixedUrl = url.replace("mobilejsr.rest", "nexdrive.fit")
        Log.d(TAG, "resolveRedirectPage: fetching $fixedUrl")
        return try {
            val response = app.get(fixedUrl, headers = baseHeaders + ("Referer" to "$mainUrl/"))
            val html = response.text
            Log.d(TAG, "resolveRedirectPage: got ${html.length} chars from $fixedUrl")

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
    //  CRITICAL FIX: Process each link in a SEPARATE coroutine with
    //  withContext(NonCancellable) so that if one link times out,
    //  the others still get processed. The previous version had all
    //  links in a sequential loop — when vcloud timed out (30s), the
    //  entire loadLinks job was cancelled, so all subsequent links
    //  (1fichier, gofile, megaup, vikingfile) showed "Job was cancelled".
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

        val allLinks = mutableListOf<Pair<String, String>>() // (link, contextUrl)

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
                    for (link in episodeLinks) {
                        allLinks.add(Pair(link, nexdriveUrl))
                    }
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
                    for (link in links) {
                        allLinks.add(Pair(link, redirectUrl))
                    }
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

        // Process each link in a SEPARATE coroutine with NonCancellable context.
        // This ensures that even if one resolver times out or the parent job is
        // cancelled, the other links still get processed.
        var foundAny = false
        for ((index, pair) in allLinks.withIndex()) {
            val (link, contextUrl) = pair
            Log.d(TAG, "loadLinks: [$index/${allLinks.size}] processing: $link")

            try {
                // CRITICAL: Use NonCancellable so this link's resolution continues
                // even if the parent loadLinks job is cancelled (timeout).
                kotlinx.coroutines.withContext(kotlinx.coroutines.NonCancellable) {
                    val result = processSingleLink(link, contextUrl, subtitleCallback, callback)
                    if (result) foundAny = true
                }
            } catch (e: Exception) {
                Log.d(TAG, "loadLinks: [$index] EXCEPTION: ${e.message}")
            }
        }

        Log.d(TAG, "loadLinks: END foundAny=$foundAny")
        return foundAny
    }

    // ============================================================
    //  Helper: Process a SINGLE download link
    // ============================================================
    private suspend fun processSingleLink(
        link: String,
        contextUrl: String,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        Log.d(TAG, "processSingleLink: START $link")
        val quality = getQualityFromContext(contextUrl)

        return when {
            link.contains("fastdl") -> {
                Log.d(TAG, "processSingleLink: → fastdl resolver")
                val directUrl = resolveFastDl(link)
                Log.d(TAG, "processSingleLink: fastdl result: ${directUrl?.take(80) ?: "null"}")
                if (directUrl != null) {
                    callback.invoke(
                        newExtractorLink(
                            source = "TheMoviesFlix",
                            name = "G-Direct [FastDL]",
                            url = directUrl,
                            type = ExtractorLinkType.VIDEO
                        ) {
                            this.quality = quality
                            this.referer = "https://fastdl.zip/"
                        }
                    )
                    true
                } else false
            }
            link.contains("vcloud") || link.contains("mcloud") -> {
                Log.d(TAG, "processSingleLink: → vcloud resolver")
                val directUrl = resolveVCloud(link)
                Log.d(TAG, "processSingleLink: vcloud result: ${directUrl?.take(80) ?: "null"}")
                if (directUrl != null) {
                    callback.invoke(
                        newExtractorLink(
                            source = "TheMoviesFlix",
                            name = "V-Cloud [Resumable]",
                            url = directUrl,
                            type = ExtractorLinkType.VIDEO
                        ) {
                            this.quality = quality
                            this.referer = "https://vcloud.zip/"
                        }
                    )
                    true
                } else false
            }
            link.contains("filebee") || link.contains("filepress") -> {
                Log.d(TAG, "processSingleLink: → filepress resolver")
                val directUrl = resolveFilePress(link)
                Log.d(TAG, "processSingleLink: filepress result: ${directUrl?.take(80) ?: "null"}")
                if (directUrl != null) {
                    callback.invoke(
                        newExtractorLink(
                            source = "TheMoviesFlix",
                            name = "FilePress [G-Drive]",
                            url = directUrl,
                            type = ExtractorLinkType.VIDEO
                        ) {
                            this.quality = quality
                        }
                    )
                    true
                } else false
            }
            link.contains("megaup") -> {
                Log.d(TAG, "processSingleLink: → megaup resolver")
                val directUrl = resolveMegaUp(link)
                Log.d(TAG, "processSingleLink: megaup result: ${directUrl?.take(80) ?: "null"}")
                if (directUrl != null) {
                    callback.invoke(
                        newExtractorLink(
                            source = "TheMoviesFlix",
                            name = "MegaUp",
                            url = directUrl,
                            type = ExtractorLinkType.VIDEO
                        ) {
                            this.quality = quality
                            this.referer = "https://megaup.net/"
                        }
                    )
                    true
                } else false
            }
            link.contains("vikingfile") -> {
                Log.d(TAG, "processSingleLink: → vikingfile resolver")
                val directUrl = resolveVikingFile(link)
                Log.d(TAG, "processSingleLink: vikingfile result: ${directUrl?.take(80) ?: "null"}")
                if (directUrl != null) {
                    callback.invoke(
                        newExtractorLink(
                            source = "TheMoviesFlix",
                            name = "VikingFile",
                            url = directUrl,
                            type = ExtractorLinkType.VIDEO
                        ) {
                            this.quality = quality
                            this.referer = "https://vikingfile.com/"
                        }
                    )
                    true
                } else false
            }
            link.contains("gofile") -> {
                Log.d(TAG, "processSingleLink: → gofile resolver")
                val directUrl = resolveGoFile(link)
                Log.d(TAG, "processSingleLink: gofile result: ${directUrl?.take(80) ?: "null"}")
                if (directUrl != null) {
                    callback.invoke(
                        newExtractorLink(
                            source = "TheMoviesFlix",
                            name = "GoFile",
                            url = directUrl,
                            type = ExtractorLinkType.VIDEO
                        ) {
                            this.quality = quality
                            this.referer = "https://gofile.io/"
                        }
                    )
                    true
                } else false
            }
            link.contains("1fichier") -> {
                Log.d(TAG, "processSingleLink: → 1fichier resolver")
                // 1fichier needs login for direct download — pass as a link the user
                // can open externally. We can't resolve it without login.
                // But we still emit it as an ExtractorLink so it shows up.
                callback.invoke(
                    newExtractorLink(
                        source = "TheMoviesFlix",
                        name = "1fichier [External]",
                        url = link,
                        type = ExtractorLinkType.VIDEO
                    ) {
                        this.quality = quality
                        this.referer = "https://1fichier.com/"
                    }
                )
                true
            }
            else -> {
                // Unknown host — try loadExtractor then WebView
                Log.d(TAG, "processSingleLink: → loadExtractor for $link")
                val loaded = try {
                    loadExtractor(link, "https://nexdrive.fit/", subtitleCallback, callback)
                } catch (e: Exception) {
                    Log.d(TAG, "processSingleLink: loadExtractor FAILED: ${e.message}")
                    false
                }
                Log.d(TAG, "processSingleLink: loadExtractor result: $loaded")
                if (!loaded) {
                    Log.d(TAG, "processSingleLink: trying WebViewResolver fallback")
                    val directUrl = resolveViaWebView(link)
                    Log.d(TAG, "processSingleLink: WebViewResolver result: ${directUrl?.take(80) ?: "null"}")
                    if (directUrl != null) {
                        val host = try { java.net.URL(link).host } catch (_: Exception) { "Source" }
                        callback.invoke(
                            newExtractorLink(
                                source = "TheMoviesFlix",
                                name = "$host [WebView]",
                                url = directUrl,
                                type = ExtractorLinkType.VIDEO
                            ) {
                                this.quality = quality
                                this.referer = link
                            }
                        )
                        return true
                    }
                }
                loaded
            }
        }
    }

    private fun getQualityFromContext(contextUrl: String): Int {
        return try {
            val qualityStr = contextUrl.lowercase()
            when {
                qualityStr.contains("2160p") || qualityStr.contains("4k") || qualityStr.contains("uhd") -> Qualities.P2160.value
                qualityStr.contains("1080p") -> Qualities.P1080.value
                qualityStr.contains("720p") -> Qualities.P720.value
                qualityStr.contains("480p") -> Qualities.P480.value
                qualityStr.contains("360p") -> Qualities.P360.value
                else -> Qualities.Unknown.value
            }
        } catch (_: Exception) {
            Qualities.Unknown.value
        }
    }

    // ============================================================
    //  Resolver: fastdl.zip → googleusercontent direct URL
    // ============================================================
    private suspend fun resolveFastDl(url: String): String? {
        Log.d(TAG, "resolveFastDl: fetching $url")
        return try {
            val html = app.get(url, headers = baseHeaders + ("Referer" to "https://nexdrive.fit/")).text
            Log.d(TAG, "resolveFastDl: got ${html.length} chars")
            val reurl = Regex("""var\s+reurl\s*=\s*"([^"]+)"""").find(html)?.groupValues?.get(1)
                ?: Regex("""'(https://fastdl\.[^']+/dl\.php\?link=[^']+)'""").find(html)?.groupValues?.get(1)
                ?: run { return null }
            Log.d(TAG, "resolveFastDl: reurl: ${reurl.take(100)}")
            val googleUrl = Regex("""link=(https?://[^&"']+)""").find(reurl)?.groupValues?.get(1) ?: return null
            val decoded = URLDecoder.decode(googleUrl, "UTF-8")
            Log.d(TAG, "resolveFastDl: decoded: ${decoded.take(100)}")
            decoded
        } catch (e: Exception) {
            Log.d(TAG, "resolveFastDl: FAILED: ${e.message}")
            null
        }
    }

    // ============================================================
    //  Resolver: vcloud.zip (Cloudflare-protected)
    // ============================================================
    //  vcloud.zip returns 403 with Cloudflare Turnstile challenge.
    //  We use WebViewResolver to load the page in a real WebView,
    //  let Cloudflare resolve, then intercept the video URL.
    //  Timeout is 15s (not 30s) to avoid eating the loadLinks budget.
    //
    private suspend fun resolveVCloud(url: String): String? {
        Log.d(TAG, "resolveVCloud: fetching $url")
        return try {
            val (request, _) = WebViewResolver(
                interceptUrl = Regex("""\.(mp4|mkv|webm|m3u8|download)"""),
                userAgent = "Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36",
                useOkhttp = false,
                additionalUrls = listOf(Regex(""".""")),
                script = null,
                scriptCallback = null,
                timeout = 15_000L  // 15s, not 30s — don't eat the entire loadLinks budget
            ).resolveUsingWebView(url) { req ->
                val reqUrl = req.url.toString()
                reqUrl.contains(".mp4") || reqUrl.contains(".mkv") ||
                reqUrl.contains(".webm") || reqUrl.contains(".m3u8") ||
                reqUrl.contains("googleusercontent") || reqUrl.contains("drive.google")
            }

            if (request != null) {
                val finalUrl = request.url.toString()
                Log.d(TAG, "resolveVCloud: WebView found: $finalUrl")
                if (finalUrl.contains(".mp4") || finalUrl.contains(".mkv") ||
                    finalUrl.contains(".webm") || finalUrl.contains(".m3u8") ||
                    finalUrl.contains("googleusercontent") || finalUrl.contains("drive.google")) {
                    return finalUrl
                }
            }
            Log.d(TAG, "resolveVCloud: no video URL found via WebView")
            null
        } catch (e: Exception) {
            Log.d(TAG, "resolveVCloud: FAILED: ${e.message}")
            null
        }
    }

    // ============================================================
    //  Resolver: filebee.xyz / filepress (Cloudflare-protected)
    // ============================================================
    //  filebee.xyz returns 403 Cloudflare challenge with app.get.
    //  Use WebViewResolver to bypass, then look for the download link.
    //
    private suspend fun resolveFilePress(url: String): String? {
        Log.d(TAG, "resolveFilePress: fetching $url")
        return try {
            // Try app.get first (in case CF is not always active)
            val html = app.get(url, headers = baseHeaders + ("Referer" to "$mainUrl/")).text
            Log.d(TAG, "resolveFilePress: got ${html.length} chars")

            if (html.contains("Just a moment") || html.contains("challenge")) {
                Log.d(TAG, "resolveFilePress: Cloudflare challenge detected, trying WebView")
                // Use WebView to bypass Cloudflare
                val (request, _) = WebViewResolver(
                    interceptUrl = Regex("""\.(mp4|mkv|webm|m3u8|download)"""),
                    userAgent = "Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36",
                    useOkhttp = false,
                    additionalUrls = listOf(Regex(""".""")),
                    script = null,
                    scriptCallback = null,
                    timeout = 15_000L
                ).resolveUsingWebView(url) { req ->
                    val reqUrl = req.url.toString()
                    reqUrl.contains(".mp4") || reqUrl.contains(".mkv") ||
                    reqUrl.contains("googleusercontent") || reqUrl.contains("drive.google")
                }

                if (request != null) {
                    val finalUrl = request.url.toString()
                    Log.d(TAG, "resolveFilePress: WebView found: $finalUrl")
                    if (finalUrl.contains(".mp4") || finalUrl.contains(".mkv") ||
                        finalUrl.contains("googleusercontent") || finalUrl.contains("drive.google")) {
                        return finalUrl
                    }
                }
            }

            // Try regex extraction from HTML
            val directLink = Regex("""(https?://[^"'\s<>]+\.mkv[^"'\s<>]*)""").find(html)?.groupValues?.get(1)
                ?: Regex("""(https?://[^"'\s<>]+\.mp4[^"'\s<>]*)""").find(html)?.groupValues?.get(1)
                ?: Regex("""href="(https?://[^"]*(?:drive\.google|googleapis|googleusercontent)[^"]*)"""").find(html)?.groupValues?.get(1)
            Log.d(TAG, "resolveFilePress: result: ${directLink?.take(80) ?: "null"}")
            directLink
        } catch (e: Exception) {
            Log.d(TAG, "resolveFilePress: FAILED: ${e.message}")
            null
        }
    }

    // ============================================================
    //  Resolver: megaup.net
    // ============================================================
    //  megaup.net page has a JS countdown that reveals a
    //  download.megaup.net/?url=XXX link. We extract that URL from
    //  the HTML directly (no need to wait for the countdown).
    //  download.megaup.net itself is Cloudflare-protected, so we
    //  use WebViewResolver on the megaup.net page to get the final
    //  direct download URL.
    //
    private suspend fun resolveMegaUp(url: String): String? {
        Log.d(TAG, "resolveMegaUp: fetching $url")
        return try {
            // Use WebViewResolver — megaup has a JS countdown then redirects
            val (request, _) = WebViewResolver(
                interceptUrl = Regex("""\.(mp4|mkv|webm|m3u8|download)"""),
                userAgent = "Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36",
                useOkhttp = false,
                additionalUrls = listOf(Regex(""".""")),
                script = null,
                scriptCallback = null,
                timeout = 15_000L
            ).resolveUsingWebView(url) { req ->
                val reqUrl = req.url.toString()
                reqUrl.contains(".mp4") || reqUrl.contains(".mkv") ||
                reqUrl.contains(".webm") || reqUrl.contains("download.megaup")
            }

            if (request != null) {
                val finalUrl = request.url.toString()
                Log.d(TAG, "resolveMegaUp: WebView found: $finalUrl")
                if (finalUrl.contains(".mp4") || finalUrl.contains(".mkv") || finalUrl.contains(".webm")) {
                    return finalUrl
                }
            }
            Log.d(TAG, "resolveMegaUp: no video URL found")
            null
        } catch (e: Exception) {
            Log.d(TAG, "resolveMegaUp: FAILED: ${e.message}")
            null
        }
    }

    // ============================================================
    //  Resolver: vikingfile.com
    // ============================================================
    //  vikingfile.com has a Cloudflare Turnstile captcha that must
    //  be solved before the download link is generated. The page
    //  has <a id="download-link" class="button hidden"> whose href
    //  is set by JS after the Turnstile callback.
    //  We use WebViewResolver to load the page, let Turnstile solve
    //  automatically, then intercept the final download URL.
    //
    private suspend fun resolveVikingFile(url: String): String? {
        Log.d(TAG, "resolveVikingFile: fetching $url")
        return try {
            val (request, _) = WebViewResolver(
                interceptUrl = Regex("""\.(mp4|mkv|webm|m3u8|download)"""),
                userAgent = "Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36",
                useOkhttp = false,
                additionalUrls = listOf(Regex(""".""")),
                script = null,
                scriptCallback = null,
                timeout = 15_000L
            ).resolveUsingWebView(url) { req ->
                val reqUrl = req.url.toString()
                reqUrl.contains(".mp4") || reqUrl.contains(".mkv") ||
                reqUrl.contains(".webm") || reqUrl.contains("download") ||
                reqUrl.contains("vikingfile.com/dl") || reqUrl.contains("vikingfile.com/download")
            }

            if (request != null) {
                val finalUrl = request.url.toString()
                Log.d(TAG, "resolveVikingFile: WebView found: $finalUrl")
                if (finalUrl.contains(".mp4") || finalUrl.contains(".mkv") || finalUrl.contains(".webm")) {
                    return finalUrl
                }
            }
            Log.d(TAG, "resolveVikingFile: no video URL found")
            null
        } catch (e: Exception) {
            Log.d(TAG, "resolveVikingFile: FAILED: ${e.message}")
            null
        }
    }

    // ============================================================
    //  Resolver: gofile.io
    // ============================================================
    //  gofile.io uses a JS API. The page loads, then JS fetches
    //  the file info from api.gofile.io/contents/<code>?token=<token>.
    //  We use WebViewResolver to let the JS run and intercept the
    //  resulting download URL.
    //
    private suspend fun resolveGoFile(url: String): String? {
        Log.d(TAG, "resolveGoFile: fetching $url")
        return try {
            val (request, _) = WebViewResolver(
                interceptUrl = Regex("""\.(mp4|mkv|webm|m3u8|download)"""),
                userAgent = "Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36",
                useOkhttp = false,
                additionalUrls = listOf(Regex(""".""")),
                script = null,
                scriptCallback = null,
                timeout = 15_000L
            ).resolveUsingWebView(url) { req ->
                val reqUrl = req.url.toString()
                reqUrl.contains(".mp4") || reqUrl.contains(".mkv") ||
                reqUrl.contains(".webm") || reqUrl.contains("download") ||
                reqUrl.contains("store.gofile.io") || reqUrl.contains("s.gofile.io")
            }

            if (request != null) {
                val finalUrl = request.url.toString()
                Log.d(TAG, "resolveGoFile: WebView found: $finalUrl")
                if (finalUrl.contains(".mp4") || finalUrl.contains(".mkv") || finalUrl.contains(".webm") ||
                    finalUrl.contains("store.gofile.io") || finalUrl.contains("s.gofile.io")) {
                    return finalUrl
                }
            }
            Log.d(TAG, "resolveGoFile: no video URL found")
            null
        } catch (e: Exception) {
            Log.d(TAG, "resolveGoFile: FAILED: ${e.message}")
            null
        }
    }

    // ============================================================
    //  Resolver: Generic WebView fallback
    // ============================================================
    private suspend fun resolveViaWebView(url: String): String? {
        Log.d(TAG, "resolveViaWebView: fetching $url")
        return try {
            val (request, _) = WebViewResolver(
                interceptUrl = Regex("""\.(mp4|mkv|webm|m3u8|download)"""),
                userAgent = "Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36",
                useOkhttp = false,
                additionalUrls = listOf(Regex(""".""")),
                script = null,
                scriptCallback = null,
                timeout = 15_000L
            ).resolveUsingWebView(url) { req ->
                val reqUrl = req.url.toString()
                reqUrl.contains(".mp4") || reqUrl.contains(".mkv") ||
                reqUrl.contains(".webm") || reqUrl.contains(".m3u8") ||
                reqUrl.contains("googleusercontent") || reqUrl.contains("drive.google")
            }

            val finalUrl = request?.url?.toString()
            Log.d(TAG, "resolveViaWebView: result: ${finalUrl?.take(80) ?: "null"}")
            finalUrl
        } catch (e: Exception) {
            Log.d(TAG, "resolveViaWebView: FAILED: ${e.message}")
            null
        }
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
