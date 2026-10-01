package com.laddu100.anitaku2

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.lagradost.api.Log
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.utils.*
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.AppUtils.toJson
import com.lagradost.nicehttp.RequestBodyTypes
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody
import org.jsoup.Jsoup
import org.jsoup.nodes.Element
import java.net.URLEncoder

class Anitaku2Provider : MainAPI() {
    override var mainUrl = "https://anitaku.online"
    override var name = "Anitaku2"
    override var lang = "en"
    override val hasMainPage = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie, TvType.OVA)

    override val mainPage = mainPageOf(
        "$mainUrl" to "Recent Release",
        "$mainUrl/popular.html" to "Popular",
        "$mainUrl/season.html" to "New Season",
        "$mainUrl/anime-movies.html" to "Movies",
    )

    private val TAG = "Anitaku2"

    private val browserHeaders = mapOf(
        "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36",
        "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
        "Accept-Language" to "en-US,en;q=0.5",
    )

    // ---- Data classes for server info ----

    data class ServerData(
        val url: String,
        val type: String,        // HSUB, SUB, DUB
        val serverName: String,  // HD-1, HD-2, StreamHG, Earnvids, Doodstream
        val subtitleUrl: String? = null
    )

    // ---- Homepage ----

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        val url = if (page > 1 && (request.data.contains("popular") || request.data.contains("movies") || request.data.contains("season"))) {
            "${request.data}?page=$page"
        } else {
            request.data
        }

        val doc = app.get(url, headers = browserHeaders).document
        val items = when {
            // Homepage Recent Release section uses .items li inside #load_recent_release
            request.data == mainUrl -> {
                doc.select("#load_recent_release .items li, .anime_name.recent_release .items li").mapNotNull { it.toRecentResult() }
            }
            // Popular, New Season, Movies pages use .items li
            else -> {
                doc.select(".items li").mapNotNull { it.toListResult() }
            }
        }
        return newHomePageResponse(request.name, items)
    }

    // ---- Search ----

    override suspend fun search(query: String): List<SearchResponse> {
        val encoded = query.replace(" ", "+")
        val searchUrl = "$mainUrl/search.html?keyword=$encoded"
        val doc = app.get(searchUrl, headers = browserHeaders).document
        return doc.select(".items li").mapNotNull { it.toListResult() }
    }

    // ---- Load (Anime Detail Page) ----

    override suspend fun load(url: String): LoadResponse? {
        val doc = app.get(url, headers = browserHeaders).document

        val title = doc.selectFirst(".anime_info_body_bg h1")?.text()?.trim() ?: return null
        val poster = doc.selectFirst(".anime_info_body_bg img")?.attr("src")
        val plot = extractPlot(doc)
        val genres = doc.select(".anime_info_body_bg a[href*=/genre/]").map { it.text().trim().removePrefix(",") }.filter { it.isNotBlank() }
        val typeText = doc.selectFirst(".anime_info_body_bg a[href*=/type/]")?.text()?.trim() ?: ""
        val isMovie = typeText.equals("Movie", ignoreCase = true) || typeText.equals("OVA", ignoreCase = true) || url.contains("movie", ignoreCase = true)
        val year = doc.selectFirst(".anime_info_body_bg p.type:contains(Released:) span, .anime_info_body_bg p:contains(Released:)")?.text()
            ?.replace(Regex("Released:\\s*", RegexOption.IGNORE_CASE), "")?.trim()?.toIntOrNull()
        val otherName = doc.selectFirst(".anime_info_body_bg p.other-name")?.text()
            ?.replace(Regex("Other name:\\s*", RegexOption.IGNORE_CASE), "")?.trim()

        // Fetch AniList metadata
        val anilistData = fetchAniList(title, year, isMovie)

        // Parse episodes from the category page
        // The episode listing has data-sub and data-dub attributes per episode
        val epLinks = doc.select("#episode_related a, .ep-range a")
        val hasAnyEpisodes = epLinks.isNotEmpty()

        val subEpisodes = mutableListOf<Episode>()
        val dubEpisodes = mutableListOf<Episode>()

        if (!hasAnyEpisodes) {
            // Single-episode OVA/Movie - check if there's an episode link
            val singleEp = doc.selectFirst("a[href*=-episode-]")
            if (singleEp != null) {
                val epHref = fixUrl(singleEp.attr("href"))
                val epName = anilistData?.episodes?.firstOrNull()?.name ?: "Episode 1"
                subEpisodes.add(newEpisode("anitaku2|$epHref|sub") {
                    this.episode = 1
                    this.name = epName
                })
                // Check dub availability for single episode
                val hasDub = checkDubOnEpisodePage(epHref)
                if (hasDub) {
                    dubEpisodes.add(newEpisode("anitaku2|$epHref|dub") {
                        this.episode = 1
                        this.name = epName
                    })
                }
            } else {
                // Movie without episode link - use category URL itself
                subEpisodes.add(newEpisode("anitaku2|$url|sub") {
                    this.episode = 1
                    this.name = anilistData?.episodes?.firstOrNull()?.name ?: "Movie"
                })
            }
        } else {
            // Multi-episode anime
            val anilistEps = anilistData?.episodes
            epLinks.forEach { el ->
                val epText = el.text().trim()
                val epNum = Regex("""EP?\s*(\d+)""", RegexOption.IGNORE_CASE).find(epText)?.groupValues?.get(1)?.toIntOrNull()
                    ?: Regex("""/episode-(\d+)""").find(el.attr("href"))?.groupValues?.get(1)?.toIntOrNull()
                    ?: 1

                val epHref = fixUrl(el.attr("href"))
                if (epHref.isBlank()) return@forEach

                // Check per-episode sub/dub availability from data attributes
                val hasSub = el.attr("data-sub") == "1"
                val hasDub = el.attr("data-dub") == "1"

                // Get real episode name from AniList
                val epName = anilistEps?.find { it.episode == epNum }?.name ?: "Episode $epNum"

                if (hasSub || (!hasSub && !hasDub)) {
                    // If no data-sub/dub attributes, default to sub
                    subEpisodes.add(newEpisode("anitaku2|$epHref|sub") {
                        this.episode = epNum
                        this.name = epName
                    })
                }
                if (hasDub) {
                    dubEpisodes.add(newEpisode("anitaku2|$epHref|dub") {
                        this.episode = epNum
                        this.name = epName
                    })
                }
            }

            // If no sub/dub data attributes found, check the first episode for dub
            if (subEpisodes.isEmpty() && dubEpisodes.isEmpty() && epLinks.isNotEmpty()) {
                val firstEp = epLinks.first()!!
                val epNum = Regex("""EP?\s*(\d+)""", RegexOption.IGNORE_CASE).find(firstEp.text())?.groupValues?.get(1)?.toIntOrNull()
                    ?: Regex("""/episode-(\d+)""").find(firstEp.attr("href"))?.groupValues?.get(1)?.toIntOrNull()
                    ?: 1
                val epHref = fixUrl(firstEp.attr("href"))
                val epName = anilistEps?.find { it.episode == epNum }?.name ?: "Episode $epNum"

                subEpisodes.add(newEpisode("anitaku2|$epHref|sub") {
                    this.episode = epNum
                    this.name = epName
                })

                if (checkDubOnEpisodePage(epHref)) {
                    dubEpisodes.add(newEpisode("anitaku2|$epHref|dub") {
                        this.episode = epNum
                        this.name = epName
                    })
                }
            }
        }

        val finalTitle = anilistData?.title ?: title
        val finalPoster = anilistData?.posterUrl ?: poster?.let { fixUrl(it) }
        val finalPlot = anilistData?.plot ?: plot
        val finalGenres = anilistData?.genres ?: genres

        val finalType = when {
            isMovie && dubEpisodes.isNotEmpty() -> TvType.Anime
            isMovie -> TvType.AnimeMovie
            else -> TvType.Anime
        }

        return newAnimeLoadResponse(finalTitle, url, finalType) {
            this.posterUrl = finalPoster
            this.plot = finalPlot
            this.tags = finalGenres
            this.year = year
            if (subEpisodes.isNotEmpty()) addEpisodes(DubStatus.Subbed, subEpisodes)
            if (dubEpisodes.isNotEmpty()) addEpisodes(DubStatus.Dubbed, dubEpisodes)
        }
    }

    // ---- Plot extraction ----

    private fun extractPlot(doc: org.jsoup.nodes.Document): String? {
        val descEl = doc.selectFirst(".anime_info_body_bg .description")
        if (descEl != null) {
            return descEl.text().trim()
        }
        val allText = doc.selectFirst(".anime_info_body_bg")?.text() ?: return null
        val idx = allText.indexOf("Plot Summary:")
        return if (idx >= 0) allText.substring(idx + 13).trim() else null
    }

    // ---- Dub check ----

    private suspend fun checkDubOnEpisodePage(epUrl: String): Boolean {
        return try {
            val epDoc = app.get(epUrl, headers = browserHeaders).document
            epDoc.selectFirst(".server-items[data-type=DUB]") != null ||
                epDoc.selectFirst(".name_type[data-type=DUB]") != null
        } catch (e: Exception) {
            false
        }
    }

    // ---- loadLinks ----

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        val cleanData = when {
            data.startsWith("$mainUrl/anitaku2|") -> data.removePrefix("$mainUrl/")
            data.startsWith("/anitaku2|") -> data.removePrefix("/")
            else -> data
        }

        val epUrl: String
        val audioType: String

        if (cleanData.startsWith("anitaku2|")) {
            val parts = cleanData.split("|", limit = 3)
            if (parts.size < 3) return false
            epUrl = parts[1]
            audioType = parts[2].ifBlank { "sub" }
        } else {
            // Direct URL (fallback)
            return try {
                loadExtractor(data, data, subtitleCallback, callback)
            } catch (e: Exception) {
                false
            }
        }

        return resolveEpisodePage(epUrl, audioType, subtitleCallback, callback)
    }

    // ---- Episode page resolution ----

    private suspend fun resolveEpisodePage(
        epUrl: String,
        audioType: String,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        val doc = try {
            app.get(epUrl, headers = browserHeaders).document
        } catch (e: Exception) {
            Log.e(TAG, "Failed to fetch episode page: ${e.message}")
            return false
        }

        // Select which server type tab based on audio preference
        val typeSelectors = if (audioType == "dub") {
            listOf("DUB")
        } else {
            // For sub, prefer SUB (with soft subtitles), fallback to HSUB
            listOf("SUB", "HSUB")
        }

        val servers = mutableListOf<ServerData>()
        for (type in typeSelectors) {
            val serverDiv = doc.selectFirst(".server-items[data-type=$type]") ?: continue
            serverDiv.select("a.server-video").forEach { a ->
                val videoUrl = a.attr("data-video")
                if (videoUrl.isBlank()) return@forEach
                val serverName = a.ownText().trim().replace("Choose this server", "").trim()
                val fullUrl = if (videoUrl.startsWith("//")) "https:$videoUrl" else videoUrl

                val subtitleUrl = extractSubtitleUrl(fullUrl)
                val cleanUrl = cleanVideoUrl(fullUrl)

                servers.add(ServerData(cleanUrl, type, "$serverName ($type)", subtitleUrl))
            }
        }

        // Fallback: if no type-specific servers found, try all servers
        if (servers.isEmpty()) {
            doc.select("a.server-video").forEach { a ->
                val videoUrl = a.attr("data-video")
                if (videoUrl.isBlank()) return@forEach
                val serverName = a.ownText().trim().replace("Choose this server", "").trim()
                val fullUrl = if (videoUrl.startsWith("//")) "https:$videoUrl" else videoUrl
                val subtitleUrl = extractSubtitleUrl(fullUrl)
                val cleanUrl = cleanVideoUrl(fullUrl)
                servers.add(ServerData(cleanUrl, "SUB", serverName, subtitleUrl))
            }
        }

        if (servers.isEmpty()) {
            Log.e(TAG, "No servers found on episode page: $epUrl")
            return false
        }

        var found = false
        for (server in servers) {
            try {
                if (resolveServer(server, epUrl, subtitleCallback, callback)) {
                    found = true
                }
            } catch (e: Exception) {
                Log.e(TAG, "Server ${server.serverName} failed: ${e.message}")
            }
        }
        return found
    }

    // ---- Subtitle URL extraction from embed URL ----

    private fun extractSubtitleUrl(url: String): String? {
        return when {
            url.contains("sub=") -> Regex("""[?&]sub=([^&]+)""").find(url)?.groupValues?.get(1)
            url.contains("caption_1=") -> Regex("""[?&]caption_1=([^&]+)""").find(url)?.groupValues?.get(1)
            url.contains("c1_file=") -> Regex("""[?&]c1_file=([^&]+)""").find(url)?.groupValues?.get(1)
            else -> null
        }
    }

    // ---- Clean video URL (remove subtitle params) ----

    private fun cleanVideoUrl(url: String): String {
        return url.substringBefore("?sub=").substringBefore("?caption_1=").substringBefore("?c1_file=")
    }

    // ---- Server resolution dispatcher ----

    private suspend fun resolveServer(
        server: ServerData,
        referer: String,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        val url = server.url
        val domain = Regex("""https?://([^/]+)""").find(url)?.groupValues?.get(1) ?: ""

        return when {
            // VibePlayer: vivibebe.site and bibiemb.xyz
            domain.contains("vivibebe", ignoreCase = true) || domain.contains("bibiemb", ignoreCase = true) -> {
                resolveVibePlayer(url, server, referer, subtitleCallback, callback)
            }
            // StreamHG: otakuhg.site
            domain.contains("otakuhg", ignoreCase = true) -> {
                resolveStreamHG(url, server, referer, subtitleCallback, callback)
            }
            // Earnvids: otakuvid.online
            domain.contains("otakuvid", ignoreCase = true) -> {
                resolveEarnvids(url, server, referer, subtitleCallback, callback)
            }
            // Doodstream: playmogo.com or doodstream domains
            domain.contains("playmogo", ignoreCase = true) || domain.contains("dood", ignoreCase = true) -> {
                resolveDoodstream(url, server, referer, subtitleCallback, callback)
            }
            // Fallback: try CloudStream's built-in extractors
            else -> {
                try {
                    loadExtractor(url, referer, subtitleCallback, callback)
                } catch (e: Exception) {
                    Log.e(TAG, "Fallback extractor failed for $url: ${e.message}")
                    false
                }
            }
        }
    }

    // ---- VibePlayer (vivibebe.site / bibiemb.xyz) ----
    // These embed pages have: const src = "https://...master.m3u8" and const subtitle = "https://...vtt"

    private suspend fun resolveVibePlayer(
        url: String,
        server: ServerData,
        referer: String,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        try {
            val headers = mapOf(
                "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36",
                "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
                "Referer" to referer,
            )
            val response = app.get(url, headers = headers, timeout = 30_000L).text

            // Extract m3u8 URL from const src = "..."
            val m3u8Match = Regex("""const\s+src\s*=\s*"([^"]+\.m3u8[^"]*)"""").find(response)
            val m3u8 = m3u8Match?.groupValues?.get(1) ?: return false

            // Extract subtitle from const subtitle = "..." (only present for SUB type)
            val subMatch = Regex("""const\s+subtitle\s*=\s*"([^"]+)"""").find(response)
            val embedSub = subMatch?.groupValues?.get(1)?.takeIf { it.isNotBlank() && it.startsWith("http") }

            val domain = Regex("""https?://([^/]+)""").find(url)?.groupValues?.get(1) ?: "vivibebe.site"
            val streamHeaders = mapOf(
                "Referer" to url,
                "Origin" to "https://$domain",
                "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36"
            )

            M3u8Helper.generateM3u8(server.serverName, m3u8, url, headers = streamHeaders).forEach(callback)

            // Add subtitles
            if (!embedSub.isNullOrEmpty()) {
                subtitleCallback.invoke(newSubtitleFile("English", embedSub))
            }
            server.subtitleUrl?.let { subUrl ->
                subtitleCallback.invoke(newSubtitleFile("English", subUrl))
            }
            return true
        } catch (e: Exception) {
            Log.e(TAG, "VibePlayer failed: ${e.message}")
            return false
        }
    }

    // ---- StreamHG (otakuhg.site) ----
    // Uses obfuscated JS (eval(function(p,a,c,k,e,d){...})) to embed m3u8 URL
    // We decode the JS packer to extract the stream URL

    private suspend fun resolveStreamHG(
        url: String,
        server: ServerData,
        referer: String,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        try {
            val headers = mapOf(
                "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36",
                "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
                "Referer" to referer,
            )
            val html = app.get(url, headers = headers, timeout = 30_000L).text

            // Try to decode the JS packer and extract m3u8
            val m3u8 = decodeJSPackerAndExtractM3u8(html, "otakuhg.site")
                ?: findM3u8InHtml(html, "otakuhg.site")

            if (m3u8.isNullOrBlank()) return false

            val streamHeaders = mapOf(
                "Referer" to url,
                "Origin" to "https://otakuhg.site",
                "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36"
            )

            M3u8Helper.generateM3u8(server.serverName, m3u8, url, headers = streamHeaders).forEach(callback)
            addSubtitles(server, subtitleCallback)
            return true
        } catch (e: Exception) {
            Log.e(TAG, "StreamHG failed: ${e.message}")
            return false
        }
    }

    // ---- Earnvids (otakuvid.online) ----
    // Same obfuscated JS packer as StreamHG

    private suspend fun resolveEarnvids(
        url: String,
        server: ServerData,
        referer: String,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        try {
            val headers = mapOf(
                "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36",
                "Accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
                "Referer" to referer,
            )
            val html = app.get(url, headers = headers, timeout = 30_000L).text

            // Try to decode the JS packer and extract m3u8
            val m3u8 = decodeJSPackerAndExtractM3u8(html, "otakuvid.online")
                ?: findM3u8InHtml(html, "otakuvid.online")

            if (m3u8.isNullOrBlank()) return false

            val streamHeaders = mapOf(
                "Referer" to url,
                "Origin" to "https://otakuvid.online",
                "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36"
            )

            M3u8Helper.generateM3u8(server.serverName, m3u8, url, headers = streamHeaders).forEach(callback)
            addSubtitles(server, subtitleCallback)
            return true
        } catch (e: Exception) {
            Log.e(TAG, "Earnvids failed: ${e.message}")
            return false
        }
    }

    // ---- Doodstream (playmogo.com) ----
    // Often dead/unavailable - handle gracefully

    private suspend fun resolveDoodstream(
        url: String,
        server: ServerData,
        referer: String,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        try {
            val response = app.get(url, headers = browserHeaders, timeout = 15_000L)
            val html = response.text

            // Check if server is dead
            if (html.contains("removed", ignoreCase = true) || html.contains("unavailable", ignoreCase = true) || html.length < 200) {
                Log.d(TAG, "Doodstream server unavailable: $url")
                return false
            }

            val doodHost = Regex("""https?://([^/]+)""").find(url)?.groupValues?.get(1) ?: return false

            // Try standard Doodstream extraction
            val md5Match = Regex("""(/pass_md5/[^'"]+)""").find(html) ?: return false
            val md5Path = md5Match.groupValues[1]
            val token = Regex("""\?token=([^'"]+)""").find(html)?.groupValues?.get(1) ?: ""

            val md5Url = "https://$doodHost$md5Path"
            val md5Headers = mapOf(
                "Referer" to url,
                "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36",
            )
            val videoUrlBase = app.get(md5Url, headers = md5Headers, timeout = 15_000L).text
            if (videoUrlBase.isBlank() || !videoUrlBase.startsWith("http")) return false

            val extraChars = token.takeLast(3)
            val m3u8Url = "${videoUrlBase}${extraChars}.m3u8"

            callback.invoke(
                newExtractorLink(name, server.serverName, m3u8Url, type = ExtractorLinkType.M3U8) {
                    this.referer = url
                    this.headers = mapOf(
                        "Referer" to url,
                        "User-Agent" to "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36"
                    )
                }
            )
            addSubtitles(server, subtitleCallback)
            return true
        } catch (e: Exception) {
            Log.d(TAG, "Doodstream skipped: ${e.message}")
            return false
        }
    }

    // ---- Subtitle helper ----

    private suspend fun addSubtitles(
        server: ServerData,
        subtitleCallback: (SubtitleFile) -> Unit
    ) {
        server.subtitleUrl?.let { subUrl ->
            subtitleCallback.invoke(newSubtitleFile("English", subUrl))
        }
    }

    // ---- JS Packer Decoder ----
    // Decodes eval(function(p,a,c,k,e,d){...}('packed',radix,count,'keys'))
    // Used by StreamHG and Earnvids to obfuscate the player setup

    private fun decodeJSPackerAndExtractM3u8(html: String, hostDomain: String): String? {
        return try {
            // Find the packed script
            val packerMatch = Regex(
                """eval\(function\(p,a,c,k,e,d\)\{.*?\}\('(.+?)',(\d+),(\d+),'(.+?)'\)"""
            ).find(html) ?: return null

            val p = packerMatch.groupValues[1]
            val radix = packerMatch.groupValues[2].toIntOrNull() ?: return null
            val count = packerMatch.groupValues[3].toIntOrNull() ?: return null
            val keys = packerMatch.groupValues[4].split("|")

            // Decode: replace base-radix tokens with corresponding keys
            val decoded = StringBuilder()
            val tokenPattern = Regex("""\b([a-zA-Z0-9]+)\b""")

            val decodedStr = tokenPattern.replace(p) { matchResult ->
                val token = matchResult.groupValues[1]
                try {
                    val idx = if (radix <= 36) {
                        token.toInt(radix)
                    } else {
                        return@replace token
                    }
                    if (idx < keys.size && keys[idx].isNotEmpty()) {
                        keys[idx]
                    } else {
                        token
                    }
                } catch (e: Exception) {
                    token
                }
            }

            // Extract m3u8 URL from the decoded script
            // Pattern 1: /stream/.../master.m3u8 (relative path - hls4)
            val streamPathMatch = Regex("""["'](/stream/[^"']+\.m3u8)["']""").find(decodedStr)
            if (streamPathMatch != null) {
                return "https://$hostDomain${streamPathMatch.groupValues[1]}"
            }

            // Pattern 2: Full URL m3u8 (hls2 or hls3)
            val fullUrlMatch = Regex("""["'](https?://[^"']+\.m3u8[^"']*)["']""").find(decodedStr)
            if (fullUrlMatch != null) {
                return fullUrlMatch.groupValues[1]
            }

            // Pattern 3: .urlset/master.txt (hls3 variant - replace .txt with .m3u8)
            val urlsetMatch = Regex("""["'](https?://[^"']+\.urlset/master\.txt[^"']*)["']""").find(decodedStr)
            if (urlsetMatch != null) {
                return urlsetMatch.groupValues[1].replace("master.txt", "master.m3u8")
            }

            null
        } catch (e: Exception) {
            Log.d(TAG, "JS packer decode failed for $hostDomain: ${e.message}")
            null
        }
    }

    // ---- Fallback: find m3u8 directly in HTML (for unobfuscated pages) ----

    private fun findM3u8InHtml(html: String, hostDomain: String): String? {
        // Try relative /stream/ path
        val streamPathMatch = Regex("""["'](/stream/[^"']+\.m3u8)["']""").find(html)
        if (streamPathMatch != null) return "https://$hostDomain${streamPathMatch.groupValues[1]}"

        // Try full URL
        val fullUrlMatch = Regex("""(https?://[^"'\s]+/stream/[^"'\s]+\.m3u8[^"'\s]*)""").find(html)
        if (fullUrlMatch != null) return fullUrlMatch.groupValues[1]

        // Try file: property pattern
        val fileMatch = Regex("""file["']\s*[:=]\s*["']([^"']+\.m3u8[^"']*)["']""").find(html)
        if (fileMatch != null) {
            val path = fileMatch.groupValues[1]
            return if (path.startsWith("http")) path else "https://$hostDomain$path"
        }

        // Generic m3u8 URL
        val m3u8Match = Regex("""(https?://[^"'\s]+\.m3u8[^"'\s]*)""").find(html)
        return m3u8Match?.groupValues?.get(1)
    }

    // ---- Homepage element parsers ----

    private fun Element.toRecentResult(): AnimeSearchResponse? {
        // Recent release items have: a href="/anime-episode-N" title="Anime Name"
        // We need to convert episode links to category links
        val link = selectFirst("a[href]") ?: return null
        val href = link.attr("href").ifBlank { return null }
        val rawTitle = link.attr("title").trim()
        val title = if (rawTitle.isNotBlank()) rawTitle else {
            selectFirst("p a, .name a")?.text()?.trim() ?: return null
        }

        val poster = selectFirst("img")?.let { it.attr("src").ifBlank { it.attr("data-src") } }
        val hasDub = selectFirst(".ic-dub") != null
        val hasSub = selectFirst(".ic-sub") != null || !hasDub

        // Convert episode URL to category URL
        val categoryUrl = getCategoryUrl(href)

        return newAnimeSearchResponse(title, categoryUrl, TvType.Anime) {
            this.posterUrl = poster?.let { fixUrl(it) }
            addDubStatus(dubExist = hasDub, subExist = hasSub)
        }
    }

    private fun Element.toListResult(): AnimeSearchResponse? {
        // List items from search, popular, season, movies pages
        val link = selectFirst("a[href*=/category/]") ?: return null
        val href = link.attr("href").ifBlank { return null }
        val title = selectFirst("p a, a[title]")?.text()?.trim() ?: link.attr("title").trim().ifBlank { return null }

        val poster = selectFirst("img")?.let { it.attr("src").ifBlank { it.attr("data-src") } }
        val hasDub = selectFirst(".ic-dub") != null
        val hasSub = selectFirst(".ic-sub") != null || !hasDub
        val isMovie = href.contains("movie", ignoreCase = true)

        return newAnimeSearchResponse(title, fixUrl(href), if (isMovie) TvType.AnimeMovie else TvType.Anime) {
            this.posterUrl = poster?.let { fixUrl(it) }
            addDubStatus(dubExist = hasDub, subExist = hasSub)
        }
    }

    // ---- Convert episode URL to category URL ----

    private fun getCategoryUrl(href: String): String {
        // Episode URL: /anime-name-episode-123 or /anime-name-episode-1
        // Category URL: /category/anime-name
        val slug = Regex("""/([^/]+?)(?:-episode-\d+)?/?$""").find(href)?.groupValues?.get(1) ?: href.trimStart('/')
        return "$mainUrl/category/$slug"
    }

    // ---- AniList Integration ----
    // Fetches anime/movie metadata for better titles, posters, and episode names

    private data class AniListResult(
        val title: String? = null,
        val posterUrl: String? = null,
        val plot: String? = null,
        val genres: List<String>? = null,
        val episodes: List<AniListEpisode>? = null
    )

    private data class AniListEpisode(
        val episode: Int,
        val name: String
    )

    private suspend fun fetchAniList(title: String, year: Int?, isMovie: Boolean): AniListResult? {
        return try {
            // Clean the title for AniList search
            var cleanTitle = title
                .replace(Regex("""\s*\(\d{4}\).*"""), "")
                .replace(Regex("""\s*(TV|Movie|OVA|ONA|Special)\s*$""", RegexOption.IGNORE_CASE), "")
                .trim()
            // Replace Season/S patterns
            val seasonMatch = Regex("""\s*(?:Season|S)\s*(\d+).*""", RegexOption.IGNORE_CASE).find(cleanTitle)
            if (seasonMatch != null) {
                cleanTitle = cleanTitle.replace(seasonMatch.value, " ${seasonMatch.groupValues[1]}").trim()
            }

            val mediaType = if (isMovie) "ANIME" else "ANIME"

            val query = """
                query (${'$'}search: String, ${'$'}year: Int, ${'$'}type: MediaType) {
                    Media(search: ${'$'}search, type: ${'$'}type, startDate_year: ${'$'}year, isAdult: false) {
                        id
                        title { romaji english native }
                        coverImage { large }
                        description(asHtml: false)
                        genres
                        episodes
                        synonyms
                        nextAiringEpisode { episode }
                    }
                }
            """.trimIndent()

            val variables = mutableMapOf<String, Any>(
                "search" to cleanTitle,
                "type" to mediaType
            )
            year?.let { variables["year"] = it }

            val requestData = mapOf("query" to query, "variables" to variables)
                .toJson()
                .toRequestBody(RequestBodyTypes.JSON.toMediaTypeOrNull())

            val response = app.post(
                "https://graphql.anilist.co",
                requestBody = requestData,
                headers = mapOf(
                    "Content-Type" to "application/json",
                    "Accept" to "application/json",
                ),
                timeout = 15_000L
            ).text

            val root = parseJson<AniListResponse>(response)
            val media = root.data?.media ?: return null

            // Build episode list with proper names
            val totalEps = media.episodes ?: media.nextAiringEpisode?.episode?.minus(1) ?: 0
            val epList = if (totalEps > 0) {
                (1..totalEps).map { epNum ->
                    val epTitle = "Episode $epNum"
                    AniListEpisode(epNum, epTitle)
                }
            } else null

            AniListResult(
                title = media.title?.english ?: media.title?.romaji ?: title,
                posterUrl = media.coverImage?.large,
                plot = media.description?.replace(Regex("<[^>]+>"), "")?.trim(),
                genres = media.genres,
                episodes = epList
            )
        } catch (e: Exception) {
            Log.d(TAG, "AniList fallback: ${e.message}")
            null
        }
    }

    // ---- AniList response data classes ----

    @JsonIgnoreProperties(ignoreUnknown = true)
    private data class AniListResponse(
        val data: AniListData? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    private data class AniListData(
        val media: AniListMedia? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    private data class AniListMedia(
        val title: AniListTitle? = null,
        val coverImage: AniListCover? = null,
        val description: String? = null,
        val genres: List<String>? = null,
        val episodes: Int? = null,
        val synonyms: List<String>? = null,
        val nextAiringEpisode: AniListAiring? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    private data class AniListTitle(
        val romaji: String? = null,
        val english: String? = null,
        val native: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    private data class AniListCover(
        val large: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    private data class AniListAiring(
        val episode: Int? = null
    )
}
