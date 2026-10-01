package com.laddu100.ppv

import android.content.Context
import android.webkit.WebView
import android.webkit.WebViewClient
import android.webkit.WebResourceRequest
import android.webkit.WebResourceResponse
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.lagradost.api.Log
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.cloudstream3.utils.AppUtils.toJson
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.M3u8Helper
import com.lagradost.cloudstream3.utils.loadExtractor
import com.lagradost.cloudstream3.utils.newExtractorLink
import com.lagradost.cloudstream3.utils.Qualities
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeoutOrNull
import java.util.concurrent.ConcurrentHashMap
import kotlin.coroutines.resume

private const val TAG = "PPVLiveSports"
private const val API_BASE = "https://api.ppv.st/api"
private const val API_BASE_2 = "https://api.ppv.cx/api"
private const val TIMEOUT = 30_000L

class PPVLiveSportsProvider : MainAPI() {
    override var mainUrl = "https://ppv.st"
    override var name = "PPV Live Sports"
    override var lang = "en"
    override val hasMainPage = true
    override val hasDownloadSupport = false
    override val supportedTypes = setOf(TvType.Live)

    companion object {
        var context: Context? = null
    }

    private var cachedStreams: StreamsResponse? = null
    private var cacheTimestamp: Long = 0L
    private val CACHE_TTL = 5 * 60 * 1000L

    private val apiHeaders = mapOf(
        "Accept" to "application/json",
        "Referer" to "$mainUrl/",
        "Origin" to mainUrl
    )

    private suspend fun fetchStreams(): StreamsResponse? {
        if (cachedStreams != null && System.currentTimeMillis() - cacheTimestamp < CACHE_TTL) {
            return cachedStreams
        }

        val response = try {
            app.get("$API_BASE/streams", headers = apiHeaders, timeout = TIMEOUT).text
        } catch (e: Exception) {
            Log.e(TAG, "fetchStreams failed on primary: ${e.message}")
            try {
                app.get("$API_BASE_2/streams", headers = apiHeaders, timeout = TIMEOUT).text
            } catch (e2: Exception) {
                Log.e(TAG, "fetchStreams failed on fallback: ${e2.message}")
                return null
            }
        }

        val parsed = try {
            parseJson<StreamsResponse>(response)
        } catch (e: Exception) {
            Log.e(TAG, "fetchStreams parse failed: ${e.message}")
            return null
        }

        cachedStreams = parsed
        cacheTimestamp = System.currentTimeMillis()
        return parsed
    }

    override val mainPage = mainPageOf(
        "live" to "Live Now",
        "upcoming" to "Upcoming",
        "American Football" to "American Football",
        "Australian Football" to "Australian Football",
        "Basketball" to "Basketball",
        "Football" to "Football",
        "Motorsports" to "Motorsports",
        "Rugby" to "Rugby",
        "Wrestling" to "Wrestling",
        "Miscellaneous" to "Miscellaneous",
        "24/7 Streams" to "24/7 Channels"
    )

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        val data = fetchStreams() ?: return newHomePageResponse(request.name, emptyList())

        val now = System.currentTimeMillis() / 1000
        val allStreams = data.streams?.flatMap { cat ->
            cat.streams?.map { s -> s.copy(categoryName = cat.category) } ?: emptyList()
        } ?: emptyList()

        val items = when (request.data) {
            "live" -> allStreams.filter { s ->
                val starts = s.starts_at ?: 0
                val ends = s.ends_at ?: 0
                starts <= now && (ends == 0L || ends >= now)
            }
            "upcoming" -> allStreams.filter { s ->
                val starts = s.starts_at ?: 0
                starts > now && s.always_live != 1
            }.sortedBy { it.starts_at ?: 0 }
            "24/7 Streams" -> allStreams.filter { s -> s.always_live == 1 }
            else -> allStreams.filter { s -> s.categoryName == request.data && s.always_live != 1 }
        }

        val searchItems = items.map { it.toSearchResult(this) }
        return newHomePageResponse(request.name, searchItems)
    }

    override suspend fun search(query: String): List<SearchResponse> {
        val data = fetchStreams() ?: return emptyList()
        val allStreams = data.streams?.flatMap { cat ->
            cat.streams?.map { s -> s.copy(categoryName = cat.category) } ?: emptyList()
        } ?: emptyList()

        return allStreams
            .filter { it.name?.contains(query, ignoreCase = true) == true }
            .map { it.toSearchResult(this) }
    }

    override suspend fun load(url: String): LoadResponse? {
        val streamData = try {
            parseJson<StreamItem>(url)
        } catch (e: Exception) {
            return null
        }

        val title = streamData.name ?: "Unknown"
        val poster = streamData.poster
        val isLive = streamData.always_live == 1 ||
            (streamData.starts_at ?: 0) <= (System.currentTimeMillis() / 1000)

        val plot = buildString {
            streamData.tag?.let { append("Channel: $it\n") }
            streamData.categoryName?.let { append("Sport: $it\n") }
            streamData.starts_at?.takeIf { it > 0 }?.let {
                val date = java.text.SimpleDateFormat("MMM dd, yyyy HH:mm z", java.util.Locale.US)
                    .apply { timeZone = java.util.TimeZone.getDefault() }
                    .format(java.util.Date(it * 1000))
                append("Starts: $date\n")
            }
        }

        val iframeUrl = streamData.iframe ?: return null

        return newLiveStreamLoadResponse(title, url, this.name) {
            this.posterUrl = poster
            this.plot = plot
            this.tags = listOfNotNull(streamData.categoryName, streamData.tag)
            this.dataUrl = EpisodeData(
                name = title,
                iframe = iframeUrl,
                poster = poster,
                tag = streamData.tag
            ).toJson()
        }
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        val epData = try {
            parseJson<EpisodeData>(data)
        } catch (e: Exception) {
            Log.e(TAG, "loadLinks parse failed: ${e.message}")
            return false
        }

        val iframeUrl = epData.iframe ?: return false
        Log.d(TAG, "loadLinks: ${epData.name} -> $iframeUrl")

        val ctx = context ?: return false

        var found = false

        try {
            val html = app.get(iframeUrl, headers = mapOf(
                "User-Agent" to "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Mobile Safari/537.36",
                "Referer" to "$mainUrl/"
            ), timeout = TIMEOUT).text

            val m3u8Regex = Regex("""https?://[^\s"'\\]+\.m3u8[^\s"'\\]*""")
            val directMatches = m3u8Regex.findAll(html)
                .map { it.value.replace("\\u0026", "&").replace("\\/", "/") }
                .toList()
                .distinct()

            if (directMatches.isNotEmpty()) {
                directMatches.forEach { m3u8 ->
                    val label = if (epData.tag != null) "PPV • ${epData.tag}" else "PPV"
                    try {
                        M3u8Helper.generateM3u8(
                            source = label,
                            streamUrl = m3u8,
                            referer = "https://embedindia.st/"
                        ).forEach(callback)
                        found = true
                    } catch (e: Exception) {
                        Log.d(TAG, "m3u8 gen failed: ${e.message}")
                    }
                }
            }
        } catch (e: Exception) {
            Log.d(TAG, "Direct fetch failed, trying WebView: ${e.message}")
        }

        if (!found) {
            found = resolveViaWebView(ctx, iframeUrl, epData.tag, callback, subtitleCallback)
        }

        if (!found) {
            try {
                loadExtractor(iframeUrl, mainUrl, subtitleCallback, callback)
                found = true
            } catch (e: Exception) {
                Log.d(TAG, "loadExtractor failed: ${e.message}")
            }
        }

        return found
    }

    private val playScript = """
        (function() {
            if (window.__interceptor_installed) return "already_installed";
            Object.defineProperty(window, '__interceptor_installed', {
                value: true, writable: true, configurable: true, enumerable: false
            });
            function log(msg) { console.log("[Hook] " + msg); }
            log("Installing stealth hooks...");
            function triggerInterception(url) {
                if (!url) return;
                var urlStr = (url && typeof url.toString === 'function') ? url.toString() : url;
                log("Triggering: " + urlStr);
                if (urlStr.indexOf('m3u8') !== -1 || urlStr.indexOf('master') !== -1) {
                    window.location.href = urlStr;
                }
            }
            try {
                var originalSrcDescriptor = Object.getOwnPropertyDescriptor(HTMLMediaElement.prototype, 'src');
                if (originalSrcDescriptor && originalSrcDescriptor.set) {
                    var originalSet = originalSrcDescriptor.set;
                    Object.defineProperty(HTMLMediaElement.prototype, 'src', {
                        set: function(val) { log("MediaElement src: " + val); triggerInterception(val); return originalSet.apply(this, arguments); },
                        configurable: true, enumerable: true
                    });
                }
            } catch(e) { log("Error hooking MediaElement.src: " + e.message); }
            try {
                var originalSetAttribute = Element.prototype.setAttribute;
                Element.prototype.setAttribute = function(name, value) {
                    if (typeof name === 'string' && name.toLowerCase() === 'src') { log("setAttribute src: " + value); triggerInterception(value); }
                    return originalSetAttribute.apply(this, arguments);
                };
                Element.prototype.setAttribute.toString = function() { return "function setAttribute() { [native code] }"; };
            } catch(e) { log("Error hooking setAttribute: " + e.message); }
            try {
                var originalFetch = window.fetch;
                window.fetch = function() {
                    var url = arguments[0];
                    var urlStr = typeof url === 'string' ? url : (url && url.url) ? url.url : (url && typeof url.toString === 'function') ? url.toString() : '';
                    if (urlStr) { log("Fetch: " + urlStr); if (urlStr.indexOf('m3u8') !== -1) triggerInterception(urlStr); }
                    return originalFetch.apply(this, arguments);
                };
                window.fetch.toString = function() { return "function fetch() { [native code] }"; };
            } catch(e) { log("Error hooking fetch: " + e.message); }
            try {
                var originalOpen = XMLHttpRequest.prototype.open;
                XMLHttpRequest.prototype.open = function(method, url) {
                    var urlStr = (url && typeof url.toString === 'function') ? url.toString() : url;
                    this._url = urlStr; log("XHR open: " + urlStr);
                    if (typeof urlStr === 'string' && urlStr.indexOf('m3u8') !== -1) triggerInterception(urlStr);
                    return originalOpen.apply(this, arguments);
                };
                XMLHttpRequest.prototype.open.toString = function() { return "function open() { [native code] }"; };
            } catch(e) { log("Error hooking XHR: " + e.message); }
            try {
                var installHlsHook = function(HlsClass) {
                    if (HlsClass.prototype && !HlsClass.prototype._hooked) {
                        HlsClass.prototype._hooked = true;
                        var originalLoadSource = HlsClass.prototype.loadSource;
                        if (originalLoadSource) {
                            HlsClass.prototype.loadSource = function(src) { log("Hls.loadSource: " + src); triggerInterception(src); return originalLoadSource.apply(this, arguments); };
                            HlsClass.prototype.loadSource.toString = function() { return "function loadSource() { [native code] }"; };
                        }
                    }
                };
                if (window.Hls) { installHlsHook(window.Hls); }
                else {
                    var hlsVal = undefined;
                    Object.defineProperty(window, 'Hls', { get: function() { return hlsVal; }, set: function(val) { hlsVal = val; try { installHlsHook(val); } catch(e) {} }, configurable: true, enumerable: true });
                }
            } catch(e) { log("Error hooking Hls: " + e.message); }
            try {
                var installJwHook = function(jwplayerFunc) {
                    if (!jwplayerFunc._hooked) {
                        jwplayerFunc._hooked = true;
                        window.jwplayer = function() {
                            var playerInstance = jwplayerFunc.apply(this, arguments);
                            if (playerInstance && !playerInstance._hooked) {
                                playerInstance._hooked = true;
                                var originalSetup = playerInstance.setup;
                                if (originalSetup) {
                                    playerInstance.setup = function(config) {
                                        log("jwplayer.setup");
                                        if (config && config.file) triggerInterception(config.file);
                                        if (config && config.playlist) {
                                            try { config.playlist.forEach(function(item) { if (item.file) triggerInterception(item.file); if (item.sources) { item.sources.forEach(function(src) { if (src.file) triggerInterception(src.file); }); } }); } catch(e) {}
                                        }
                                        return originalSetup.apply(this, arguments);
                                    };
                                    playerInstance.setup.toString = function() { return "function setup() { [native code] }"; };
                                }
                            }
                            return playerInstance;
                        };
                        for (var key in jwplayerFunc) { if (jwplayerFunc.hasOwnProperty(key)) { window.jwplayer[key] = jwplayerFunc[key]; } }
                    }
                };
                if (window.jwplayer) { installJwHook(window.jwplayer); }
                else {
                    var jwVal = undefined;
                    Object.defineProperty(window, 'jwplayer', { get: function() { return jwVal; }, set: function(val) { jwVal = val; try { installJwHook(val); } catch(e) {} }, configurable: true, enumerable: true });
                }
            } catch(e) { log("Error hooking jwplayer: " + e.message); }
            var checkerInterval = setInterval(function() {
                var videos = document.querySelectorAll('video');
                if (videos && videos.length > 0) {
                    for (var i = 0; i < videos.length; i++) {
                        var src = videos[i].src;
                        if (src && src.indexOf('m3u8') !== -1) { log("Checker found video src: " + src); triggerInterception(src); clearInterval(checkerInterval); }
                    }
                }
            }, 1000);
            log("Stealth hooks installed.");
        })();
    """.trimIndent()

    private suspend fun resolveViaWebView(
        context: Context,
        url: String,
        tag: String?,
        callback: (ExtractorLink) -> Unit,
        subtitleCallback: (SubtitleFile) -> Unit
    ): Boolean {
        return withContext(Dispatchers.Main) {
            withTimeoutOrNull(60_000L) {
                suspendCancellableCoroutine<Boolean> { cont ->
                    var found = false
                    val webView = WebView(context)
                    try {
                        webView.settings.apply {
                            javaScriptEnabled = true
                            domStorageEnabled = true
                            databaseEnabled = true
                            mixedContentMode = android.webkit.WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
                            userAgentString = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/130.0.0.0 Safari/537.36"
                            mediaPlaybackRequiresUserGesture = false
                        }

                        webView.webChromeClient = object : android.webkit.WebChromeClient() {
                            override fun onConsoleMessage(consoleMessage: android.webkit.ConsoleMessage?): Boolean {
                                Log.d(TAG, "JS: ${consoleMessage?.message()}")
                                return true
                            }
                        }

                        webView.webViewClient = object : WebViewClient() {
                            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?) = false

                            override fun shouldInterceptRequest(
                                view: WebView?,
                                request: WebResourceRequest?
                            ): WebResourceResponse? {
                                val reqUrl = request?.url?.toString() ?: return null
                                if ((reqUrl.contains("m3u8") || reqUrl.contains("master")) && !found) {
                                    found = true
                                    val label = if (tag != null) "PPV • $tag" else "PPV"
                                    callback(
                                        ExtractorLink(
                                            source = label,
                                            name = label,
                                            url = reqUrl,
                                            referer = "https://embedindia.st/",
                                            type = ExtractorLinkType.M3U8,
                                            quality = Qualities.Unknown.value
                                        )
                                    )
                                    if (cont.isActive) cont.resume(true)
                                }
                                return null
                            }

                            override fun onPageFinished(view: WebView?, pageUrl: String?) {
                                super.onPageFinished(view, pageUrl)
                                if (found) return
                                Log.d(TAG, "onPageFinished: $pageUrl")
                                view?.evaluateJavascript(playScript, null)
                            }
                        }

                        webView.loadUrl(url)

                        cont.invokeOnCancellation {
                            try { webView.destroy() } catch (_: Exception) {}
                        }
                    } catch (e: Exception) {
                        Log.e(TAG, "resolveViaWebView error: ${e.message}")
                        try { webView.destroy() } catch (_: Exception) {}
                        if (cont.isActive) cont.resume(false)
                    }
                }
            } ?: false
        }
    }
}

@JsonIgnoreProperties(ignoreUnknown = true)
data class StreamsResponse(
    @JsonProperty("success") val success: Boolean? = null,
    @JsonProperty("streams") val streams: List<Category>? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class Category(
    @JsonProperty("category") val category: String = "",
    @JsonProperty("id") val id: Int = 0,
    @JsonProperty("streams") val streams: List<StreamItem>? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class StreamItem(
    @JsonProperty("id") val id: Int = 0,
    @JsonProperty("name") val name: String? = null,
    @JsonProperty("tag") val tag: String? = null,
    @JsonProperty("source_tag") val source_tag: String? = null,
    @JsonProperty("poster") val poster: String? = null,
    @JsonProperty("uri_name") val uri_name: String? = null,
    @JsonProperty("starts_at") val starts_at: Long? = null,
    @JsonProperty("ends_at") val ends_at: Long? = null,
    @JsonProperty("always_live") val always_live: Int? = null,
    @JsonProperty("locale") val locale: String? = null,
    @JsonProperty("iframe") val iframe: String? = null,
    @JsonProperty("colors") val colors: List<String>? = null,
    @JsonProperty("blurhash") val blurhash: String? = null,
    @JsonProperty("categoryName") val categoryName: String? = null
) {
    fun toSearchResult(provider: PPVLiveSportsProvider): SearchResponse {
        return provider.newLiveSearchResponse(name ?: "Unknown", this.toJson(), TvType.Live) {
            this.posterUrl = poster
        }
    }
}

@JsonIgnoreProperties(ignoreUnknown = true)
data class EpisodeData(
    @JsonProperty("name") val name: String? = null,
    @JsonProperty("iframe") val iframe: String? = null,
    @JsonProperty("poster") val poster: String? = null,
    @JsonProperty("tag") val tag: String? = null
)
