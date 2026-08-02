package com.laddu100.sportseera

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.lagradost.api.Log
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.AppUtils.toJson
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.M3u8Helper
import com.lagradost.cloudstream3.utils.Qualities
import com.lagradost.cloudstream3.utils.newExtractorLink

class SportsEeraProvider : MainAPI() {
    override var mainUrl = "https://fancodexeera.pages.dev"
    override var name = "SportsEera"
    override var lang = "en"
    override val hasMainPage = true
    override val hasDownloadSupport = false
    override val supportedTypes = setOf(TvType.Live)

    private val TAG = "SportsEera"
    private val apiUrl = "https://raw.githubusercontent.com/doctor-8trange/zyphx8/refs/heads/main/data/fancode.json"

    private val cdnHeaders = mapOf(
        "User-Agent" to "ReactNativeVideo/9.11.1 (Linux;Android 13) AndroidXMedia3/1.6.1",
        "Referer" to "https://fancode.com/"
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class StreamCDN(
        @JsonProperty("is_drm") val isDrm: Boolean? = null,
        @JsonProperty("Primary_Playback_URL") val primaryUrl: String? = null,
        @JsonProperty("fancode_cdn") val fancodeCdn: String? = null,
        @JsonProperty("fancode_bd_cdn") val bdCdn: String? = null,
        @JsonProperty("fancode_np_cdn") val npCdn: String? = null,
        @JsonProperty("fancode_lk_cdn") val lkCdn: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class AutoStream(
        @JsonProperty("auto") val auto: String? = null,
        @JsonProperty("cookie") val cookie: String? = null,
        @JsonProperty("language") val language: String? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Match(
        @JsonProperty("category") val category: String? = null,
        @JsonProperty("title") val title: String? = null,
        @JsonProperty("tournament") val tournament: String? = null,
        @JsonProperty("match_id") val matchId: Long? = null,
        @JsonProperty("status") val status: String? = null,
        @JsonProperty("streamingStatus") val streamingStatus: String? = null,
        @JsonProperty("startTime") val startTime: String? = null,
        @JsonProperty("image") val image: String? = null,
        @JsonProperty("STREAMING_CDN") val streamingCdn: StreamCDN? = null,
        @JsonProperty("auto_streams") val autoStreams: List<AutoStream>? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class ApiResponse(
        @JsonProperty("matches") val matches: List<Match>? = null,
        @JsonProperty("live_matches") val liveMatches: Int? = null,
        @JsonProperty("upcoming_matches") val upcomingMatches: Int? = null
    )

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class LoadData(
        val title: String,
        val matchId: Long,
        val image: String?
    )

    override val mainPage = mainPageOf(apiUrl to "All")

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        val lists = mutableListOf<HomePageList>()
        try {
            val res = app.get(apiUrl, timeout = 30_000L)
            val parsed = parseJson<ApiResponse>(res.text)
            val matches = parsed.matches ?: emptyList()

            val live = matches.filter { it.status == "LIVE" }
            val upcoming = matches.filter { it.status != "LIVE" }

            if (live.isNotEmpty()) {
                lists.add(HomePageList("Live Now", live.mapNotNull { it.toSearchResponse() }, isHorizontalImages = true))
            }
            if (upcoming.isNotEmpty()) {
                lists.add(HomePageList("Upcoming", upcoming.mapNotNull { it.toSearchResponse() }, isHorizontalImages = true))
            }
        } catch (e: Exception) {
            Log.e(TAG, "getMainPage: ${e.message}")
        }
        return newHomePageResponse(lists, hasNext = false)
    }

    private fun Match.toSearchResponse(): SearchResponse? {
        val title = title ?: return null
        val id = matchId ?: return null
        val displayTitle = "$title - ${tournament ?: category ?: ""}"
        return newLiveSearchResponse(displayTitle, LoadData(title, id, image).toJson(), TvType.Live) {
            this.posterUrl = image
        }
    }

    override suspend fun search(query: String): List<SearchResponse> {
        if (query.isBlank()) return emptyList()
        return try {
            val res = app.get(apiUrl, timeout = 30_000L)
            val parsed = parseJson<ApiResponse>(res.text)
            parsed.matches?.filter { 
                it.title?.contains(query, ignoreCase = true) == true ||
                it.tournament?.contains(query, ignoreCase = true) == true ||
                it.category?.contains(query, ignoreCase = true) == true
            }?.mapNotNull { it.toSearchResponse() } ?: emptyList()
        } catch (e: Exception) {
            emptyList()
        }
    }

    override suspend fun load(url: String): LoadResponse? {
        return try {
            val loadData = parseJson<LoadData>(url)
            newLiveStreamLoadResponse(loadData.title, url, this.name) {
                this.posterUrl = loadData.image
                this.plot = loadData.title
                this.dataUrl = loadData.toJson()
            }
        } catch (e: Exception) {
            null
        }
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        val loadData = try { parseJson<LoadData>(data) } catch (e: Exception) { return false }
        
        return try {
            val res = app.get(apiUrl, timeout = 30_000L)
            val parsed = parseJson<ApiResponse>(res.text)
            val match = parsed.matches?.find { it.matchId == loadData.matchId } ?: return false

            var found = false
            val headers = cdnHeaders.toMutableMap()

            match.autoStreams?.firstOrNull()?.cookie?.let { cookie ->
                headers["Cookie"] = cookie
            }

            match.autoStreams?.firstOrNull()?.auto?.let { m3u8Content ->
                if (m3u8Content.startsWith("#EXTM3U")) {
                    val lines = m3u8Content.lines()
                    var i = 0
                    while (i < lines.size) {
                        val line = lines[i]
                        if (line.startsWith("#EXT-X-STREAM-INF:")) {
                            val bandwidth = Regex("BANDWIDTH=(\\d+)").find(line)?.groupValues?.get(1)?.toIntOrNull() ?: 0
                            val resolution = Regex("RESOLUTION=(\\d+x\\d+)").find(line)?.groupValues?.get(1) ?: ""
                            i++
                            if (i < lines.size) {
                                val streamUrl = lines[i].trim()
                                if (streamUrl.startsWith("http")) {
                                    val quality = when {
                                        resolution.contains("1080") -> Qualities.P1080.value
                                        resolution.contains("720") -> Qualities.P720.value
                                        resolution.contains("540") -> Qualities.P480.value
                                        resolution.contains("480") -> Qualities.P480.value
                                        resolution.contains("360") -> Qualities.P360.value
                                        resolution.contains("240") -> Qualities.P240.value
                                        else -> Qualities.Unknown.value
                                    }
                                    callback.invoke(
                                        newExtractorLink(
                                            source = "$name - ${match.category ?: "Live"}",
                                            name = "$name ${resolution}",
                                            url = streamUrl,
                                            type = ExtractorLinkType.M3U8
                                        ) {
                                            this.quality = quality
                                            this.headers = headers
                                        }
                                    )
                                    found = true
                                }
                            }
                        }
                        i++
                    }
                }
            }

            if (!found) {
                val cdn = match.streamingCdn
                val urls = listOfNotNull(
                    cdn?.primaryUrl,
                    cdn?.fancodeCdn,
                    cdn?.bdCdn,
                    cdn?.npCdn,
                    cdn?.lkCdn
                ).filter { it != "Unavailable" && it.isNotBlank() }

                for (url in urls) {
                    M3u8Helper.generateM3u8(
                        "$name - ${match.category ?: "Live"}",
                        url,
                        "https://fancode.com/",
                        headers = headers
                    ).forEach(callback)
                    found = true
                }
            }

            found
        } catch (e: Exception) {
            Log.e(TAG, "loadLinks: ${e.message}")
            false
        }
    }
}
