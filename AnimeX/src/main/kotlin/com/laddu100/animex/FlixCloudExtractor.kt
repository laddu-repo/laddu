package com.laddu100.animex

import android.annotation.SuppressLint
import android.webkit.WebView
import com.lagradost.api.Log
import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.network.WebViewResolver
import com.lagradost.cloudstream3.utils.ExtractorApi
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.ExtractorLinkType
import com.lagradost.cloudstream3.utils.newExtractorLink
import kotlinx.coroutines.CompletableDeferred
import okhttp3.Interceptor
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.ResponseBody.Companion.toResponseBody

class FlixCloudExtractor : ExtractorApi() {
    override val name = "FlixCloud"
    override val mainUrl = "https://flixcloud.cc"
    override val requiresReferer = true

    private val chromeUA =
        "Mozilla/5.0 (Linux; Android 13; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Mobile Safari/537.36"

    @Volatile
    private var pageWebView: WebView? = null

    @Volatile
    private var decryptedCache = mutableMapOf<String, String>()

    override suspend fun getUrl(
        url: String,
        referer: String?,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ) {
        try {
            val embedHtml = app.get(url, referer = referer).text

            Regex("""url:"(https://[^"]*slopnet[^"]*\.ass)"[\s\S]{0,120}?language:"([^"]*)"""")
                .findAll(embedHtml).forEach { match ->
                    subtitleCallback.invoke(SubtitleFile(match.groupValues[2], match.groupValues[1]))
                }

            val (request, wv) = WebViewResolver(
                interceptUrl = Regex("""fetch\.flixcloud\.cc.*\.m3u8"""),
                userAgent = chromeUA,
                useOkhttp = false,
                additionalUrls = listOf(Regex("""\.(m3u8|mp4)""")),
                script = null,
                scriptCallback = null,
                timeout = 30_000L
            ).resolveUsingWebView(url) { req ->
                req.url.toString().contains("fetch.flixcloud.cc") &&
                    req.url.toString().contains(".m3u8")
            }

            if (request != null) {
                val m3u8Url = request.url.toString()
                Log.d("AnimeX", "FlixCloud: intercepted m3u8=$m3u8Url")

                pageWebView = wv

                val decryptedM3u8 = fetchAndDecryptViaWebView(m3u8Url, wv)
                if (decryptedM3u8 != null && decryptedM3u8.startsWith("#EXTM3U")) {
                    Log.d("AnimeX", "FlixCloud: decrypted m3u8, len=${decryptedM3u8.length}")
                    decryptedCache[m3u8Url] = decryptedM3u8

                    val subPlaylistUrls = extractSubPlaylistUrls(decryptedM3u8, m3u8Url)
                    for (subUrl in subPlaylistUrls) {
                        val decSub = fetchAndDecryptViaWebView(subUrl, wv)
                        if (decSub != null && decSub.startsWith("#EXTM3U")) {
                            decryptedCache[subUrl] = decSub
                            Log.d("AnimeX", "FlixCloud: decrypted sub-playlist: $subUrl")
                        }
                    }
                }

                val headers = mapOf(
                    "Referer" to "https://flixcloud.cc/",
                    "User-Agent" to chromeUA,
                    "Origin" to "https://flixcloud.cc",
                    "Accept" to "*/*",
                    "Accept-Language" to "en-US,en;q=0.9",
                    "Sec-Fetch-Dest" to "empty",
                    "Sec-Fetch-Mode" to "cors",
                    "Sec-Fetch-Site" to "same-site"
                )

                callback.invoke(
                    newExtractorLink(
                        source = name,
                        name = name,
                        url = m3u8Url,
                        type = ExtractorLinkType.M3U8
                    ) {
                        this.referer = "https://flixcloud.cc/"
                        this.headers = headers
                    }
                )
            } else {
                Log.e("AnimeX", "FlixCloud: no m3u8 intercepted for $url")
            }
        } catch (e: Exception) {
            Log.e("AnimeX", "FlixCloud: ${e.message}")
        }
    }

    @SuppressLint("SetJavaScriptEnabled")
    private suspend fun fetchAndDecryptViaWebView(m3u8Url: String, wv: WebView): String? {
        return try {
            val result = CompletableDeferred<String?>()

            android.os.Handler(android.os.Looper.getMainLooper()).post {
                try {
                    val js = """
                        (function() {
                            var url = '$m3u8Url';
                            fetch(url, {credentials: 'include'})
                                .then(function(r) { return r.text(); })
                                .then(function(text) {
                                    if (text.startsWith('#EXTM3U')) {
                                        window._flixDecrypted = text;
                                    } else {
                                        try {
                                            var encData = text;
                                            if (typeof window._flixDecrypt === 'function') {
                                                window._flixDecrypt(encData).then(function(dec) {
                                                    window._flixDecrypted = dec;
                                                });
                                            } else if (typeof window.hls !== 'undefined' && window.hls.config && window.hls.config.loader) {
                                                var xhr = new XMLHttpRequest();
                                                xhr.open('GET', url, false);
                                                xhr.send();
                                                if (xhr.responseText.startsWith('#EXTM3U')) {
                                                    window._flixDecrypted = xhr.responseText;
                                                } else {
                                                    window._flixDecrypted = 'DECRYPT_FAILED:' + xhr.responseText.substring(0, 50);
                                                }
                                            } else {
                                                window._flixDecrypted = 'NO_DECRYPTOR';
                                            }
                                        } catch(e) {
                                            window._flixDecrypted = 'DECRYPT_ERROR:' + e.message;
                                        }
                                    }
                                })
                                .catch(function(e) {
                                    window._flixDecrypted = 'FETCH_ERROR:' + e.message;
                                });
                        })();
                    """.trimIndent()

                    wv.evaluateJavascript(js, null)

                    Thread {
                        try {
                            for (i in 0..50) {
                                Thread.sleep(200)
                                val checkJs = "window._flixDecrypted"
                                val deferred = CompletableDeferred<String?>()
                                android.os.Handler(android.os.Looper.getMainLooper()).post {
                                    wv.evaluateJavascript(checkJs) { res ->
                                        deferred.complete(res)
                                    }
                                }
                                val res = try { kotlinx.coroutines.runBlocking { deferred.await() } } catch (_: Exception) { null }
                                if (res != null && res != "null" && res != "undefined") {
                                    val decoded = if (res.startsWith("\"") && res.endsWith("\"")) {
                                        res.substring(1, res.length - 1)
                                            .replace("\\\"", "\"")
                                            .replace("\\n", "\n")
                                            .replace("\\\\", "\\")
                                            .replace("\\/", "/")
                                    } else res
                                    if (!decoded.startsWith("DECRYPT_") && !decoded.startsWith("FETCH_") && !decoded.startsWith("NO_")) {
                                        result.complete(decoded)
                                        return@Thread
                                    } else if (decoded.startsWith("DECRYPT_") || decoded.startsWith("FETCH_") || decoded.startsWith("NO_")) {
                                        result.complete(null)
                                        return@Thread
                                    }
                                }
                            }
                            result.complete(null)
                        } catch (e: Exception) {
                            result.complete(null)
                        }
                    }.start()
                } catch (e: Exception) {
                    result.complete(null)
                }
            }

            kotlinx.coroutines.withTimeoutOrNull(15_000L) { result.await() }
        } catch (e: Exception) {
            Log.e("AnimeX", "fetchAndDecrypt failed: ${e.message}")
            null
        }
    }

    private fun extractSubPlaylistUrls(masterM3u8: String, masterUrl: String): List<String> {
        val urls = mutableListOf<String>()
        val baseUrl = masterUrl.substringBeforeLast("/")
        for (line in masterM3u8.lines()) {
            val trimmed = line.trim()
            if (trimmed.startsWith("#")) continue
            if (trimmed.isEmpty()) continue
            if (trimmed.startsWith("http")) {
                urls.add(trimmed)
            } else {
                urls.add("$baseUrl/$trimmed")
            }
        }
        return urls
    }

    override fun getVideoInterceptor(extractorLink: ExtractorLink): Interceptor? {
        val linkUrl = extractorLink.url
        if (!linkUrl.contains("fetch.flixcloud.cc")) return null

        return Interceptor { chain ->
            val request = chain.request()
            val url = request.url.toString()
            val response = chain.proceed(request)
            val body = response.body
            val contentType = body?.contentType()
            val rawBody = body?.string() ?: ""

            val cached = decryptedCache[url]
            if (cached != null) {
                Log.d("AnimeX", "FlixCloud: serving cached decrypted for $url")
                response.newBuilder()
                    .body(cached.toResponseBody("application/vnd.apple.mpegurl".toMediaType()))
                    .build()
            } else if (rawBody.startsWith("#EXTM3U")) {
                response.newBuilder()
                    .body(rawBody.toResponseBody(contentType))
                    .build()
            } else {
                Log.d("AnimeX", "FlixCloud: encrypted response for $url, len=${rawBody.length}")
                val wv = pageWebView
                if (wv != null) {
                    val decrypted = kotlinx.coroutines.runBlocking {
                        fetchAndDecryptViaWebView(url, wv)
                    }
                    if (decrypted != null && decrypted.startsWith("#EXTM3U")) {
                        decryptedCache[url] = decrypted
                        response.newBuilder()
                            .body(decrypted.toResponseBody("application/vnd.apple.mpegurl".toMediaType()))
                            .build()
                    } else {
                        response.newBuilder()
                            .body(rawBody.toResponseBody(contentType))
                            .build()
                    }
                } else {
                    response.newBuilder()
                        .body(rawBody.toResponseBody(contentType))
                        .build()
                }
            }
        }
    }
}
