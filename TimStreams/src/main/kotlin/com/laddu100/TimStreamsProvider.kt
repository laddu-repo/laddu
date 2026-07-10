package com.laddu100

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.lagradost.api.Log
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.AppUtils.toJson
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.Qualities
import com.lagradost.cloudstream3.utils.loadExtractor
import com.lagradost.cloudstream3.utils.newExtractorLink
import com.lagradost.cloudstream3.network.WebViewResolver
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class TimStreamsProvider : MainAPI() {
    override var mainUrl = "https://timstreams.st"
    override var name = "TimStreams"
    override var lang = "en"
    override val hasMainPage = true
    override val hasDownloadSupport = false
    override val supportedTypes = setOf(TvType.Live)

    private val apiUrl = "https://api.vixnuvew.uk/api"
    private val cdnBase = "https://pacquiao.inproviszon.st/"
    private val TAG = "TimStreams"

    // ==================== DATA MODELS ====================

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class TimStream(
        @JsonProperty("name") val name: String,
        @JsonProperty("url") val url: String,
        @JsonProperty("vip") val vip: Boolean? = null,
        @JsonProperty("logo") val logo: String? = null,
        @JsonProperty("type") val type: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class TimEvent(
        @JsonProperty("url") val url: String? = null,
        @JsonProperty("name") val name: String? = null,
        @JsonProperty("logo") val logo: String? = null,
        @JsonProperty("genre") val genre: Int? = null,
        @JsonProperty("time") val time: String? = null,
        @JsonProperty("isevent") val isevent: Boolean? = null,
        @JsonProperty("vip") val vip: Boolean? = null,
        @JsonProperty("featured") val featured: Boolean? = null,
        @JsonProperty("streams") val streams: List<TimStream>? = null,
        @JsonProperty("date") val date: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class TimChannel(
        @JsonProperty("url") val url: String? = null,
        @JsonProperty("name") val name: String? = null,
        @JsonProperty("logo") val logo: String? = null,
        @JsonProperty("genre") val genre: Int? = null,
        @JsonProperty("vip") val vip: Boolean? = null,
        @JsonProperty("streams") val streams: List<TimStream>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class LiveUpcomingResponse(
        @JsonProperty("events") val events: List<TimEvent>? = null,
        @JsonProperty("genres") val genres: Map<String, String>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class ChannelsResponse(
        @JsonProperty("channels") val channels: List<TimChannel>? = null,
        @JsonProperty("genres") val genres: Map<String, String>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class ReplaysResponse(
        @JsonProperty("replays") val replays: List<TimEvent>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class SettingsResponse(
        @JsonProperty("settings") val settings: Map<String, String>? = null,
        @JsonProperty("genres") val genres: Map<String, String>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class MultiviewResponse(
        @JsonProperty("streams") val streams: List<TimStream>? = null
    )

    // Load data passed from search → loadLinks
    @JsonIgnoreProperties(ignoreUnknown = true)
    data class LoadData(
        val title: String,
        val streams: List<TimStream>,
        val posterUrl: String? = null,
        val isUpcoming: Boolean = false
    )

    // ==================== getMainPage ====================
    // Fetch ALL data in one call, return multiple sections (like DamiTV)
    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        Log.d(TAG, "getMainPage START: section='${request.name}' page=$page")
        val lists = mutableListOf<HomePageList>()

        try {
            coroutineScope {
                val liveDeferred = async { fetchLiveUpcoming() }
                val channelsDeferred = async { fetchChannels() }
                val replaysDeferred = async { fetchReplays() }
                val multiviewDeferred = async { fetchMultiview() }

                // Live Events (split into Live Now + Upcoming)
                val liveData = liveDeferred.await()
                if (liveData != null) {
                    val (live, upcoming) = liveData.partition { e ->
                        try {
                            val eventTime = java.time.LocalDateTime.parse(e.time ?: "")
                                .atZone(java.time.ZoneOffset.UTC).toInstant().toEpochMilli()
                            eventTime <= System.currentTimeMillis()
                        } catch (ex: Exception) { true }
                    }
                    if (live.isNotEmpty()) {
                        val items = live.mapNotNull { it.toSearchResponse() }
                        Log.d(TAG, "getMainPage: Live Now -> ${items.size} items")
                        lists.add(HomePageList("🔴 Live Now", items, isHorizontalImages = true))
                    }
                    if (upcoming.isNotEmpty()) {
                        val items = upcoming.mapNotNull { it.toUpcomingSearchResponse() }
                        Log.d(TAG, "getMainPage: Upcoming -> ${items.size} items")
                        lists.add(HomePageList("📅 Upcoming Events", items, isHorizontalImages = true))
                    }
                }

                // Live TV Channels
                val channelsData = channelsDeferred.await()
                if (channelsData != null && channelsData.isNotEmpty()) {
                    val items = channelsData.mapNotNull { it.toSearchResponse() }
                    Log.d(TAG, "getMainPage: Live TV -> ${items.size} items")
                    lists.add(HomePageList("📺 Live TV Channels", items, isHorizontalImages = true))
                }

                // Replays
                val replaysData = replaysDeferred.await()
                if (replaysData != null && replaysData.isNotEmpty()) {
                    val items = replaysData.mapNotNull { it.toSearchResponse() }
                    Log.d(TAG, "getMainPage: Replays -> ${items.size} items")
                    lists.add(HomePageList("🎬 Replays", items, isHorizontalImages = true))
                }

                // Multiview
                val multiviewData = multiviewDeferred.await()
                if (multiviewData != null && multiviewData.isNotEmpty()) {
                    val loadData = LoadData(title = "Multiview", streams = multiviewData)
                    val item = newLiveSearchResponse("Multiview", loadData.toJson(), TvType.Live) {
                        this.posterUrl = multiviewData.firstOrNull()?.logo
                    }
                    lists.add(HomePageList("🟢 Multiview", listOf(item), isHorizontalImages = true))
                }
            }
        } catch (e: Exception) {
            Log.e(TAG, "getMainPage FAILED: ${e.message}")
            Log.e(TAG, "getMainPage error: ${e.stackTraceToString().take(400)}")
        }

        Log.d(TAG, "getMainPage END: ${lists.size} sections, ${lists.sumOf { it.list.size }} total items")
        return newHomePageResponse(lists, hasNext = false)
    }

    private suspend fun fetchLiveUpcoming(): List<TimEvent>? {
        return try {
            val res = app.get("$apiUrl/live-upcoming", timeout = 30_000L)
            Log.d(TAG, "fetchLiveUpcoming: HTTP ${res.code}, size=${res.text.length}")
            parseJson<LiveUpcomingResponse>(res.text).events
        } catch (e: Exception) {
            Log.e(TAG, "fetchLiveUpcoming FAILED: ${e.message}"); null
        }
    }

    private suspend fun fetchChannels(): List<TimChannel>? {
        return try {
            val res = app.get("$apiUrl/channels", timeout = 30_000L)
            Log.d(TAG, "fetchChannels: HTTP ${res.code}, size=${res.text.length}")
            parseJson<ChannelsResponse>(res.text).channels
        } catch (e: Exception) {
            Log.e(TAG, "fetchChannels FAILED: ${e.message}"); null
        }
    }

    private suspend fun fetchReplays(): List<TimEvent>? {
        return try {
            val res = app.get("$apiUrl/replays", timeout = 30_000L)
            Log.d(TAG, "fetchReplays: HTTP ${res.code}, size=${res.text.length}")
            parseJson<ReplaysResponse>(res.text).replays
        } catch (e: Exception) {
            Log.e(TAG, "fetchReplays FAILED: ${e.message}"); null
        }
    }

    private suspend fun fetchMultiview(): List<TimStream>? {
        return try {
            val res = app.get("$apiUrl/multiview", timeout = 30_000L)
            Log.d(TAG, "fetchMultiview: HTTP ${res.code}, size=${res.text.length}")
            parseJson<MultiviewResponse>(res.text).streams
        } catch (e: Exception) {
            Log.e(TAG, "fetchMultiview FAILED: ${e.message}"); null
        }
    }

    // mainPage — single section triggers getMainPage which returns ALL sections at once
    override val mainPage = mainPageOf(
        "$apiUrl/live-upcoming" to "All"
    )

    private fun TimEvent.toSearchResponse(): SearchResponse? {
        val title = name ?: return null
        val streams = streams ?: return null
        if (streams.isEmpty()) return null
        Log.d(TAG, "toSearchResponse: '$title' streams=${streams.size} poster=${logo?.take(50)}")
        val loadData = LoadData(title = title, streams = streams, posterUrl = logo)
        return newLiveSearchResponse(title, loadData.toJson(), TvType.Live) {
            this.posterUrl = logo
        }
    }

    private fun TimEvent.toUpcomingSearchResponse(): SearchResponse? {
        val title = name ?: return null
        val streams = streams ?: return null
        if (streams.isEmpty()) return null
        val displayTitle = "$title [Upcoming: ${time ?: date ?: "TBD"}]"
        Log.d(TAG, "toUpcomingSearchResponse: '$displayTitle' streams=${streams.size}")
        val loadData = LoadData(title = title, streams = streams, posterUrl = logo, isUpcoming = true)
        return newLiveSearchResponse(displayTitle, loadData.toJson(), TvType.Live) {
            this.posterUrl = logo
        }
    }

    private fun TimChannel.toSearchResponse(): SearchResponse? {
        val title = name ?: return null
        val streams = streams ?: return null
        if (streams.isEmpty()) return null
        Log.d(TAG, "toSearchResponse: channel '$title' streams=${streams.size}")
        val loadData = LoadData(title = title, streams = streams, posterUrl = logo)
        return newLiveSearchResponse(title, loadData.toJson(), TvType.Live) {
            this.posterUrl = logo
        }
    }

    // ==================== search ====================

    override suspend fun search(query: String): List<SearchResponse> {
        Log.d(TAG, "search START: query='$query'")
        if (query.isBlank()) return emptyList()
        val results = mutableListOf<SearchResponse>()

        try {
            // Search events
            val eventsRes = app.get("$apiUrl/live-upcoming", timeout = 30_000L)
            val eventsParsed = parseJson<LiveUpcomingResponse>(eventsRes.text)
            eventsParsed.events?.forEach { e ->
                if (e.name?.contains(query, ignoreCase = true) == true) {
                    e.toSearchResponse()?.let { results.add(it) }
                }
            }

            // Search channels
            val channelsRes = app.get("$apiUrl/channels", timeout = 30_000L)
            val channelsParsed = parseJson<ChannelsResponse>(channelsRes.text)
            channelsParsed.channels?.forEach { c ->
                if (c.name?.contains(query, ignoreCase = true) == true) {
                    c.toSearchResponse()?.let { results.add(it) }
                }
            }

            // Search replays
            val replaysRes = app.get("$apiUrl/replays", timeout = 30_000L)
            val replaysParsed = parseJson<ReplaysResponse>(replaysRes.text)
            replaysParsed.replays?.forEach { r ->
                if (r.name?.contains(query, ignoreCase = true) == true) {
                    r.toSearchResponse()?.let { results.add(it) }
                }
            }
        } catch (e: Exception) {
            Log.e(TAG, "search FAILED: ${e.message}")
        }

        Log.d(TAG, "search END: '$query' -> ${results.size} results")
        return results
    }

    // ==================== load ====================

    override suspend fun load(url: String): LoadResponse? {
        Log.d(TAG, "load START: url='$url'")
        return try {
            val loadData = parseJson<LoadData>(url)
            Log.d(TAG, "load: title='${loadData.title}' streams=${loadData.streams.size} isUpcoming=${loadData.isUpcoming}")

            newLiveStreamLoadResponse(loadData.title, url, this.name) {
                this.posterUrl = loadData.posterUrl
                this.plot = "${loadData.streams.size} stream sources available"
                this.dataUrl = loadData.toJson()
            }
        } catch (e: Exception) {
            Log.e(TAG, "load FAILED: ${e.message}")
            null
        }
    }

    // ==================== loadLinks ====================

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        Log.d(TAG, "loadLinks START: data='$data'")

        val loadData = try {
            parseJson<LoadData>(data)
        } catch (e: Exception) {
            Log.e(TAG, "loadLinks: failed to parse LoadData: ${e.message}")
            return false
        }

        Log.d(TAG, "loadLinks: title='${loadData.title}' streams=${loadData.streams.size}")
        if (loadData.streams.isEmpty()) {
            Log.e(TAG, "loadLinks: no streams in LoadData")
            return false
        }

        var found = false
        for (stream in loadData.streams) {
            val streamName = stream.name
            val streamUrl = stream.url
            Log.d(TAG, "loadLinks: processing stream '$streamName' -> $streamUrl")

            try {
                // Determine the embed domain to route to the right resolver
                when {
                    // ritzembeds.pages.dev or vileembeds.pages.dev → use WebViewResolver to intercept m3u8
                    // The CDN URL is now obfuscated in the JS — can't extract statically
                    streamUrl.contains("ritzembeds.pages.dev") || streamUrl.contains("vileembeds.pages.dev") -> {
                        Log.d(TAG, "loadLinks: '$streamName' is ritz/vile embed — using WebViewResolver to intercept m3u8")
                        try {
                            val resolver = WebViewResolver(
                                interceptUrl = Regex("""(?i)\.m3u8(?:\?|$)"""),
                                additionalUrls = listOf(Regex("""(?i)\.m3u8(?:\?|$)""")),
                                script = """document.querySelector('.vjs-big-play-button,.play-button,button,[role=button]')?.click();""",
                                useOkhttp = false,
                                timeout = 30_000L
                            )
                            val resolvedUrl = app.get(streamUrl, referer = "$mainUrl/", interceptor = resolver).url
                            Log.d(TAG, "loadLinks: '$streamName' WebViewResolver resolved: $resolvedUrl")

                            if (resolvedUrl.contains(".m3u8", ignoreCase = true)) {
                                callback.invoke(
                                    newExtractorLink(
                                        source = "$name - $streamName",
                                        name = "$name - $streamName",
                                        url = resolvedUrl,
                                        type = ExtractorLinkType.M3U8
                                    ) {
                                        this.quality = Qualities.Unknown.value
                                    }
                                )
                                found = true
                                Log.d(TAG, "loadLinks: '$streamName' m3u8 intercepted successfully")
                            } else {
                                Log.e(TAG, "loadLinks: '$streamName' WebViewResolver did not intercept .m3u8 (got: $resolvedUrl)")
                            }
                        } catch (e: Exception) {
                            Log.e(TAG, "loadLinks: '$streamName' WebViewResolver failed: ${e.message}")
                        }
                    }

                    // luluvdo.com / luluvid.com → built-in extractor
                    streamUrl.contains("luluvdo.com") || streamUrl.contains("luluvid.com") -> {
                        Log.d(TAG, "loadLinks: '$streamName' is luluvdo — using loadExtractor")
                        val realUrl = streamUrl.replace("luluvid.com", "luluvdo.com")
                        val loaded = loadExtractor(realUrl, "$mainUrl/", subtitleCallback, callback)
                        if (loaded) {
                            found = true
                            Log.d(TAG, "loadLinks: '$streamName' luluvdo resolved via loadExtractor")
                        } else {
                            Log.e(TAG, "loadLinks: '$streamName' loadExtractor returned false")
                        }
                    }

                    // player.vimeo.com → built-in extractor
                    streamUrl.contains("player.vimeo.com") -> {
                        Log.d(TAG, "loadLinks: '$streamName' is Vimeo — using loadExtractor")
                        val loaded = loadExtractor(streamUrl, "$mainUrl/", subtitleCallback, callback)
                        if (loaded) {
                            found = true
                            Log.d(TAG, "loadLinks: '$streamName' Vimeo resolved via loadExtractor")
                        } else {
                            Log.e(TAG, "loadLinks: '$streamName' Vimeo loadExtractor returned false")
                        }
                    }

                    // timstreams.upn.one → has its own API (encrypted) — try loadExtractor as fallback
                    streamUrl.contains("upn.one") -> {
                        Log.d(TAG, "loadLinks: '$streamName' is upn.one — trying loadExtractor")
                        val loaded = loadExtractor(streamUrl, "$mainUrl/", subtitleCallback, callback)
                        if (loaded) {
                            found = true
                            Log.d(TAG, "loadLinks: '$streamName' upn.one resolved via loadExtractor")
                        } else {
                            Log.e(TAG, "loadLinks: '$streamName' upn.one loadExtractor failed (may need custom extractor)")
                        }
                    }

                    // Direct m3u8/mp4 URLs
                    streamUrl.contains(".m3u8") -> {
                        Log.d(TAG, "loadLinks: '$streamName' is direct m3u8")
                        callback.invoke(
                            newExtractorLink(
                                source = "$name - $streamName",
                                name = "$name - $streamName",
                                url = streamUrl,
                                type = ExtractorLinkType.M3U8
                            )
                        )
                        found = true
                    }

                    streamUrl.contains(".mp4") -> {
                        Log.d(TAG, "loadLinks: '$streamName' is direct mp4")
                        callback.invoke(
                            newExtractorLink(
                                source = "$name - $streamName",
                                name = "$name - $streamName",
                                url = streamUrl,
                                type = ExtractorLinkType.VIDEO
                            )
                        )
                        found = true
                    }

                    // Fallback: try loadExtractor for any other URL
                    else -> {
                        Log.d(TAG, "loadLinks: '$streamName' unknown domain — trying loadExtractor")
                        val loaded = loadExtractor(streamUrl, "$mainUrl/", subtitleCallback, callback)
                        if (loaded) {
                            found = true
                            Log.d(TAG, "loadLinks: '$streamName' resolved via loadExtractor fallback")
                        } else {
                            Log.e(TAG, "loadLinks: '$streamName' loadExtractor fallback failed")
                        }
                    }
                }
            } catch (e: Exception) {
                Log.e(TAG, "loadLinks: FAILED for stream '$streamName': ${e.message}")
            }
        }

        Log.d(TAG, "loadLinks END: found=$found for '${loadData.title}'")
        return found
    }

    /**
     * Extract the embed ID from a ritzembeds/vileembeds URL.
     * "https://ritzembeds.pages.dev/embed/fox-usa" → "fox-usa"
     */
    private fun extractEmbedId(url: String): String? {
        val embedIndex = url.indexOf("/embed/")
        if (embedIndex < 0) return null
        val afterEmbed = url.substring(embedIndex + 7) // after "/embed/"
        // Take everything up to the next /, ?, #, or end
        val id = afterEmbed.split("/", "?", "#").firstOrNull()
        return id?.takeIf { it.isNotBlank() }
    }
}
