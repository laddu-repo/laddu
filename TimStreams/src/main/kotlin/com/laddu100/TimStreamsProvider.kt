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
import com.lagradost.cloudstream3.app
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class TimStreamsProvider : MainAPI() {
    override var mainUrl = "https://timstreams.st"
    override var name = "TimStreams"
    override var lang = "en"
    override val hasMainPage = true
    override val hasDownloadSupport = false
    override val supportedTypes = setOf(TvType.Live)

    private val apiUrl = "https://api.timstreams.st/api"
    private val TAG = "TimStreams"

    private val mobileUA =
        "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36"

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
    data class LoadData(
        val title: String,
        val streams: List<TimStream>,
        val posterUrl: String? = null,
        val isUpcoming: Boolean = false
    )

    override val mainPage = mainPageOf("$apiUrl/live-upcoming" to "All")

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        val lists = mutableListOf<HomePageList>()
        try {
            coroutineScope {
                val liveDeferred = async { fetchLiveUpcoming() }
                val channelsDeferred = async { fetchChannels() }

                val liveData = liveDeferred.await()
                if (liveData != null) {
                    val (live, upcoming) = liveData.partition { e ->
                        try {
                            val eventTime = java.time.LocalDateTime.parse(e.time ?: "")
                                .atZone(java.time.ZoneOffset.UTC).toInstant().toEpochMilli()
                            eventTime <= System.currentTimeMillis()
                        } catch (ex: Exception) { true }
                    }
                    if (live.isNotEmpty())
                        lists.add(HomePageList("Live Now", live.mapNotNull { it.toSearchResponse() }, isHorizontalImages = true))
                    if (upcoming.isNotEmpty())
                        lists.add(HomePageList("Upcoming Events", upcoming.mapNotNull { it.toUpcomingSearchResponse() }, isHorizontalImages = true))
                }

                val channelsData = channelsDeferred.await()
                if (channelsData != null && channelsData.isNotEmpty())
                    lists.add(HomePageList("Live TV Channels", channelsData.mapNotNull { it.toSearchResponse() }, isHorizontalImages = true))
            }
        } catch (e: Exception) {
            Log.e(TAG, "getMainPage: ${e.message}")
        }
        return newHomePageResponse(lists, hasNext = false)
    }

    private suspend fun fetchLiveUpcoming(): List<TimEvent>? {
        return try {
            val res = app.get("$apiUrl/live-upcoming", timeout = 30_000L, headers = mapOf("User-Agent" to mobileUA, "Referer" to "$mainUrl/"))
            parseJson<LiveUpcomingResponse>(res.text).events
        } catch (e: Exception) { Log.e(TAG, "fetchLiveUpcoming: ${e.message}"); null }
    }

    private suspend fun fetchChannels(): List<TimChannel>? {
        return try {
            val res = app.get("$apiUrl/channels", timeout = 30_000L, headers = mapOf("User-Agent" to mobileUA, "Referer" to "$mainUrl/"))
            parseJson<ChannelsResponse>(res.text).channels
        } catch (e: Exception) { Log.e(TAG, "fetchChannels: ${e.message}"); null }
    }

    private fun TimEvent.toSearchResponse(): SearchResponse? {
        val title = name ?: return null
        val streams = streams ?: return null
        if (streams.isEmpty()) return null
        return newLiveSearchResponse(title, LoadData(title, streams, logo).toJson(), TvType.Live) { this.posterUrl = logo }
    }

    private fun TimEvent.toUpcomingSearchResponse(): SearchResponse? {
        val title = name ?: return null
        val streams = streams ?: return null
        if (streams.isEmpty()) return null
        val displayTitle = "$title [${time ?: date ?: "TBD"}]"
        return newLiveSearchResponse(displayTitle, LoadData(title, streams, logo, true).toJson(), TvType.Live) { this.posterUrl = logo }
    }

    private fun TimChannel.toSearchResponse(): SearchResponse? {
        val title = name ?: return null
        val streams = streams ?: return null
        if (streams.isEmpty()) return null
        return newLiveSearchResponse(title, LoadData(title, streams, logo).toJson(), TvType.Live) { this.posterUrl = logo }
    }

    override suspend fun search(query: String): List<SearchResponse> {
        if (query.isBlank()) return emptyList()
        val results = mutableListOf<SearchResponse>()
        try {
            val headers = mapOf("User-Agent" to mobileUA)
            val eventsRes = app.get("$apiUrl/live-upcoming", timeout = 30_000L, headers = headers)
            parseJson<LiveUpcomingResponse>(eventsRes.text).events?.forEach { e ->
                if (e.name?.contains(query, ignoreCase = true) == true) e.toSearchResponse()?.let { results.add(it) }
            }
            val channelsRes = app.get("$apiUrl/channels", timeout = 30_000L, headers = headers)
            parseJson<ChannelsResponse>(channelsRes.text).channels?.forEach { c ->
                if (c.name?.contains(query, ignoreCase = true) == true) c.toSearchResponse()?.let { results.add(it) }
            }
        } catch (e: Exception) { Log.e(TAG, "search: ${e.message}") }
        return results
    }

    override suspend fun load(url: String): LoadResponse? {
        return try {
            val loadData = parseJson<LoadData>(url)
            newLiveStreamLoadResponse(loadData.title, url, this.name) {
                this.posterUrl = loadData.posterUrl
                this.plot = "${loadData.streams.size} stream sources available"
                this.dataUrl = loadData.toJson()
            }
        } catch (e: Exception) { null }
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        val loadData = try { parseJson<LoadData>(data) } catch (e: Exception) { return false }
        if (loadData.streams.isEmpty()) return false

        var found = false
        for (stream in loadData.streams) {
            try {
                val resolved = when {
                    stream.url.contains("icelanders.st") -> resolveIcelanders(stream.url, subtitleCallback, callback)
                    stream.url.contains("luluvdo.com") || stream.url.contains("luluvid.com") -> {
                        loadExtractor(stream.url.replace("luluvid.com", "luluvdo.com"), "$mainUrl/", subtitleCallback, callback)
                    }
                    stream.url.contains("player.vimeo.com") -> {
                        loadExtractor(stream.url, "$mainUrl/", subtitleCallback, callback)
                    }
                    stream.url.contains(".m3u8") -> {
                        callback.invoke(newExtractorLink("$name", "$name", stream.url, ExtractorLinkType.M3U8) { this.quality = Qualities.Unknown.value })
                        true
                    }
                    stream.url.contains(".mp4") -> {
                        callback.invoke(newExtractorLink("$name", "$name", stream.url, ExtractorLinkType.VIDEO) { this.quality = Qualities.Unknown.value })
                        true
                    }
                    else -> loadExtractor(stream.url, "$mainUrl/", subtitleCallback, callback)
                }
                if (resolved) found = true
            } catch (e: Exception) {
                Log.e(TAG, "loadLinks: ${stream.name} - ${e.message}")
            }
        }
        return found
    }

    // The icelanders.st embed page has an obfuscated script with XOR+sub encoding.
    // We decode it to find the signed m3u8 URL, then pass it to ExoPlayer with
    // the embed host as Referer (required by the CDN).
    private suspend fun resolveIcelanders(
        embedUrl: String,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        return try {
            val html = app.get(embedUrl, referer = "$mainUrl/", headers = mapOf("User-Agent" to mobileUA)).text

            val arrayMatch = Regex("""var\s+_\w+\s*=\s*\[([^\]]+)\]""").find(html) ?: return false
            val nums = arrayMatch.groupValues[1].split(",").mapNotNull { it.trim().toIntOrNull() }

            val allVars = mutableMapOf<String, Int>()
            Regex("""_(\w+)\s*=\s*(\d+)""").findAll(html).forEach { m ->
                allVars[m.groupValues[1]] = m.groupValues[2].toInt()
            }

            val formulaPattern = "\^_(\\w+)\\)\\s*-\\s*_(\\w+)"
            val formulaMatch = Regex(formulaPattern).find(html) ?: return false
            val xorKey = allVars[formulaMatch.groupValues[1]] ?: return false
            val subVal = allVars[formulaMatch.groupValues[2]] ?: return false

            val decoded = buildString {
                for (n in nums) {
                    append((((n ^ xorKey) - subVal + 256) % 256).toChar())
                }
            }

            val m3u8Match = Regex("""https?://[^"\s']+\.m3u8[^"\s']*""").find(decoded) ?: return false
            val m3u8Url = m3u8Match.value

            val embedHost = Regex("""(https?://[^/]+)""").find(embedUrl)?.groupValues?.get(1) ?: mainUrl

            callback.invoke(
                newExtractorLink("$name", "$name", m3u8Url, ExtractorLinkType.M3U8) {
                    this.quality = Qualities.Unknown.value
                    this.headers = mapOf("User-Agent" to mobileUA, "Referer" to "$embedHost/")
                }
            )
            true
        } catch (e: Exception) {
            Log.e(TAG, "resolveIcelanders: ${e.message}")
            false
        }
    }
}
