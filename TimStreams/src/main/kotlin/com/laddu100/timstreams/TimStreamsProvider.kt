package com.laddu100.timstreams

import android.content.Context
import android.webkit.WebView
import android.webkit.WebViewClient
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.APIHolder.universalExtractorApi
import com.lagradost.cloudstream3.utils.*
import com.lagradost.api.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeoutOrNull
import kotlin.coroutines.suspendCancellableCoroutine

@JsonIgnoreProperties(ignoreUnknown = true)
data class StreamItem(
    @JsonProperty("name") val name: String? = null,
    @JsonProperty("url") val url: String? = null,
    @JsonProperty("vip") val vip: Boolean? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class EventItem(
    @JsonProperty("url") val url: String? = null,
    @JsonProperty("name") val name: String? = null,
    @JsonProperty("logo") val logo: String? = null,
    @JsonProperty("genre") val genre: Int? = null,
    @JsonProperty("time") val time: String? = null,
    @JsonProperty("date") val date: String? = null,
    @JsonProperty("isevent") val isevent: Boolean? = null,
    @JsonProperty("vip") val vip: Boolean? = null,
    @JsonProperty("featured") val featured: Boolean? = null,
    @JsonProperty("streams") val streams: List<StreamItem>? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class EventsResponse(
    @JsonProperty("events") val events: List<EventItem>? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class ReplaysResponse(
    @JsonProperty("replays") val replays: List<EventItem>? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class ChannelsResponse(
    @JsonProperty("channels") val channels: List<EventItem>? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class WatchResponse(
    @JsonProperty("item") val item: EventItem? = null
)

class TimStreamsProvider : MainAPI() {
    override var mainUrl = "https://timstreams.st"
    override var name = "TimStreams"
    override var lang = "en"
    override val hasMainPage = true
    override val hasDownloadSupport = false
    override val supportedTypes = setOf(TvType.Live, TvType.Movie, TvType.TVSeries)

    companion object {
        var context: Context? = null
        private const val TAG = "TimStreams"
        private const val API_BASE = "https://api.vixnuvew.uk/api"
    }

    override val mainPage = mainPageOf(
        "$mainUrl/live-upcoming" to "Live & Upcoming Events",
        "$mainUrl/replays" to "Replays",
        "$mainUrl/channels" to "Live TV"
    )

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        Log.d(TAG, "getMainPage START: section='${request.name}' page=$page")
        return try {
            val items = when {
                request.data.contains("live-upcoming") -> fetchLiveUpcoming()
                request.data.contains("replays") -> fetchReplays()
                request.data.contains("channels") -> fetchChannels()
                else -> emptyList()
            }
            Log.d(TAG, "getMainPage: found ${items.size} items for ${request.name}")
            newHomePageResponse(request.name, items)
        } catch (e: Exception) {
            Log.e(TAG, "getMainPage FAILED: ${e.message}")
            newHomePageResponse(request.name, emptyList())
        }
    }

    private suspend fun fetchLiveUpcoming(): List<SearchResponse> {
        val response = app.get("$API_BASE/live-upcoming")
        val parsed = parseJson<EventsResponse>(response.text)
        return parsed.events?.mapNotNull { it.toSearchResult() } ?: emptyList()
    }

    private suspend fun fetchReplays(): List<SearchResponse> {
        val response = app.get("$API_BASE/replays")
        val parsed = parseJson<ReplaysResponse>(response.text)
        return parsed.replays?.mapNotNull { it.toSearchResult() } ?: emptyList()
    }

    private suspend fun fetchChannels(): List<SearchResponse> {
        val response = app.get("$API_BASE/channels")
        val parsed = parseJson<ChannelsResponse>(response.text)
        return parsed.channels?.mapNotNull { it.toSearchResult() } ?: emptyList()
    }

    private fun EventItem.toSearchResult(): SearchResponse? {
        val title = name ?: return null
        val id = url ?: return null
        val href = "$mainUrl/watch/$id"
        val tvType = if (this.isevent == true) TvType.Live else TvType.Movie
        return newAnimeSearchResponse(title, href, tvType) {
            this.posterUrl = logo
            this.plot = buildPlot()
            addDubStatus(dubExist = true, subExist = true)
        }
    }

    private fun EventItem.buildPlot(): String? {
        val parts = mutableListOf<String>()
        time?.let { parts.add("Time: $it") }
        date?.let { parts.add("Date: $it") }
        if (vip == true) parts.add("🔒 VIP")
        return if (parts.isNotEmpty()) parts.joinToString("\n") else null
    }

    override suspend fun search(query: String): List<SearchResponse> {
        Log.d(TAG, "search START: query='$query'")
        return try {
            val response = app.get("$API_BASE/live-upcoming")
            val parsed = parseJson<EventsResponse>(response.text)
            val allEvents = parsed.events ?: emptyList()
            allEvents.filter { it.name?.contains(query, ignoreCase = true) == true }
                .mapNotNull { it.toSearchResult() }
        } catch (e: Exception) {
            Log.e(TAG, "search FAILED: ${e.message}")
            emptyList()
        }
    }

    override suspend fun load(url: String): LoadResponse? {
        Log.d(TAG, "load START: url=$url")
        return try {
            val id = url.substringAfterLast("/")
            if (id.isBlank()) return null
            val response = app.get("$API_BASE/watch/$id", timeout = 30_000L)
            val parsed = parseJson<WatchResponse>(response.text)
            val item = parsed.item ?: return null
            val title = item.name ?: return null
            val poster = item.logo
            val plot = item.buildPlot()

            val episodes = mutableListOf<Episode>()
            val streamList = item.streams ?: emptyList()
            if (streamList.isNotEmpty()) {
                val episodeData = buildString {
                    append(id)
                    append("|")
                    append(streamList.joinToString("||") { it.url ?: "" })
                }
                episodes.add(
                    newEpisode(episodeData) {
                        this.name = "Watch"
                        this.episode = 1
                    }
                )
            }

            val tvType = if (item.isevent == true) TvType.Live else TvType.Movie
            newAnimeLoadResponse(title, url, tvType) {
                this.posterUrl = poster
                this.plot = plot
                addEpisodes(DubStatus.Subbed, episodes)
            }
        } catch (e: Exception) {
            Log.e(TAG, "load FAILED: ${e.message}")
            null
        }
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        Log.d(TAG, "loadLinks START: data=$data")
        val parts = data.split("|")
        if (parts.isEmpty()) return false
        val eventId = parts[0]
        val streamUrls = if (parts.size > 1) parts[1].split("||") else emptyList()
        Log.d(TAG, "loadLinks: eventId=$eventId, streamUrls=${streamUrls.size}")

        var found = false
        if (streamUrls.isNotEmpty()) {
            for (url in streamUrls) {
                if (url.isBlank()) continue
                Log.d(TAG, "Resolving stream URL: $url")
                val resolved = resolveStreamUrl(url, eventId)
                if (resolved != null) {
                    callback(resolved)
                    found = true
                }
            }
        } else {
            try {
                val response = app.get("$API_BASE/watch/$eventId", timeout = 30_000L)
                val parsed = parseJson<WatchResponse>(response.text)
                val item = parsed.item
                val streams = item?.streams ?: emptyList()
                for (stream in streams) {
                    val url = stream.url
                    if (url.isNullOrBlank()) continue
                    Log.d(TAG, "Resolving stream URL: $url")
                    val resolved = resolveStreamUrl(url, eventId)
                    if (resolved != null) {
                        callback(resolved)
                        found = true
                    }
                }
            } catch (e: Exception) {
                Log.e(TAG, "loadLinks fallback fetch FAILED: ${e.message}")
            }
        }
        Log.d(TAG, "loadLinks DONE: found=$found")
        return found
    }

    private suspend fun resolveStreamUrl(embedUrl: String, eventId: String): ExtractorLink? {
        Log.d(TAG, "resolveStreamUrl: $embedUrl")
        return try {
            var result: ExtractorLink? = null
            var found = false
            universalExtractorApi.extract(
                embedUrl,
                mainUrl,
                subtitleCallback = { },
                callback = { link ->
                    if (!found) {
                        result = link
                        found = true
                    }
                }
            )
            if (found && result != null) {
                Log.d(TAG, "Built-in extractor found: ${result?.url}")
                return result
            }

            when {
                embedUrl.contains("ritzembeds.pages.dev") -> extractWithWebView(embedUrl)
                embedUrl.contains("vileembeds.pages.dev") -> extractWithWebView(embedUrl)
                embedUrl.contains("timstreams.upn.one") -> resolveUpnEmbed(embedUrl)
                embedUrl.contains("luluvid.com") -> {
                    var link: ExtractorLink? = null
                    universalExtractorApi.extract(embedUrl, mainUrl) { l -> if (link == null) link = l }
                    link
                }
                embedUrl.contains(".m3u8") || embedUrl.contains(".mp4") -> createExtractorLink(
                    name = "TimStreams",
                    url = embedUrl,
                    mainUrl = mainUrl,
                    quality = Qualities.Unknown.value,
                    type = if (embedUrl.contains(".m3u8")) ExtractorLinkType.M3U8 else ExtractorLinkType.MP4
                )
                else -> extractWithWebView(embedUrl)
            }
        } catch (e: Exception) {
            Log.e(TAG, "resolveStreamUrl FAILED: ${e.message}")
            null
        }
    }

    private suspend fun resolveUpnEmbed(embedUrl: String): ExtractorLink? {
        return try {
            val response = app.get(embedUrl, timeout = 30_000L)
            val html = response.text
            val iframeRegex = Regex("""<iframe[^>]*src=["']([^"']+)["']""", RegexOption.IGNORE_CASE)
            val match = iframeRegex.find(html)
            val iframeUrl = match?.groupValues?.get(1)
            if (iframeUrl != null) resolveStreamUrl(iframeUrl, "") else null
        } catch (e: Exception) {
            Log.e(TAG, "resolveUpnEmbed FAILED: ${e.message}")
            null
        }
    }

    private suspend fun extractWithWebView(embedUrl: String): ExtractorLink? {
        Log.d(TAG, "extractWithWebView: $embedUrl")
        return withContext(Dispatchers.Main) {
            val ctx = context ?: return@withContext null
            var result: ExtractorLink? = null
            withTimeoutOrNull(30_000L) {
                suspendCancellableCoroutine { cont ->
                    var foundUrl: String? = null
                    val webView = WebView(ctx)
                    try {
                        webView.settings.apply {
                            javaScriptEnabled = true
                            domStorageEnabled = true
                            mixedContentMode = android.webkit.WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
                            userAgentString = "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Mobile Safari/537.36"
                        }
                        webView.webViewClient = object : WebViewClient() {
                            override fun shouldOverrideUrlLoading(view: WebView?, request: android.webkit.WebResourceRequest?): Boolean = false
                            override fun onLoadResource(view: WebView?, resourceUrl: String?) {
                                super.onLoadResource(view, resourceUrl)
                                if (foundUrl == null && resourceUrl != null) {
                                    if (resourceUrl.contains(".m3u8") || resourceUrl.contains(".mp4")) {
                                        if (!resourceUrl.contains("/audio/") && !resourceUrl.contains("audio.")) {
                                            foundUrl = resourceUrl
                                            Log.d(TAG, "WebView intercepted: $resourceUrl")
                                            if (cont.isActive) {
                                                cont.resume(createExtractorLink(
                                                    name = "TimStreams",
                                                    url = resourceUrl,
                                                    mainUrl = mainUrl,
                                                    quality = Qualities.Unknown.value,
                                                    type = if (resourceUrl.contains(".m3u8")) ExtractorLinkType.M3U8 else ExtractorLinkType.MP4
                                                ))
                                            }
                                        }
                                    }
                                }
                            }
                            override fun onPageFinished(view: WebView?, url: String?) {
                                super.onPageFinished(view, url)
                                if (foundUrl == null) {
                                    view?.evaluateJavascript(
                                        """
                                        (function() {
                                            var videos = document.querySelectorAll('video');
                                            for (var i = 0; i < videos.length; i++) {
                                                var src = videos[i].src;
                                                if (src && (src.includes('.m3u8') || src.includes('.mp4'))) return src;
                                            }
                                            var sources = document.querySelectorAll('source');
                                            for (var i = 0; i < sources.length; i++) {
                                                var src = sources[i].src;
                                                if (src && (src.includes('.m3u8') || src.includes('.mp4'))) return src;
                                            }
                                            return null;
                                        })();
                                        """.trimIndent(),
                                        null
                                    ) { value ->
                                        if (value != "null" && value != null) {
                                            val url = value.trim('"')
                                            if (url.isNotBlank() && (url.contains(".m3u8") || url.contains(".mp4"))) {
                                                foundUrl = url
                                                Log.d(TAG, "WebView JS found: $url")
                                                if (cont.isActive) {
                                                    cont.resume(createExtractorLink(
                                                        name = "TimStreams",
                                                        url = url,
                                                        mainUrl = mainUrl,
                                                        quality = Qualities.Unknown.value,
                                                        type = if (url.contains(".m3u8")) ExtractorLinkType.M3U8 else ExtractorLinkType.MP4
                                                    ))
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        webView.loadUrl(embedUrl)
                    } catch (e: Exception) {
                        Log.e(TAG, "WebView error: ${e.message}")
                        if (cont.isActive) cont.resume(null)
                    }
                    cont.invokeOnCancellation { try { webView.destroy() } catch (_: Exception) {} }
                }
            }
        }
    }

    private fun createExtractorLink(
        name: String,
        url: String,
        mainUrl: String,
        quality: Int,
        type: ExtractorLinkType
    ): ExtractorLink {
        return ExtractorLink(
            source = name,
            url = url,
            name = name,
            referer = mainUrl,
            quality = quality,
            type = type,
            headers = mapOf(
                "Referer" to mainUrl,
                "User-Agent" to "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36"
            )
        )
    }
}
