package com.laddu100.anisnatch

import android.annotation.SuppressLint
import android.net.http.SslError
import android.webkit.CookieManager
import android.webkit.SslErrorHandler
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import com.lagradost.api.Log
import com.lagradost.cloudstream3.CommonActivity
import com.lagradost.cloudstream3.utils.AppUtils.toJson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeoutOrNull
import java.util.concurrent.atomic.AtomicBoolean
import kotlin.coroutines.resume

private const val TAG = "AniSnatch"
private const val BASE_URL = "https://anisnatch.top"
private const val PAGE_LOAD_TIMEOUT = 90_000L
private const val API_CALL_TIMEOUT = 45_000L

class AniSnatchWebView {
    private var webViewRef: WebView? = null
    private var pageReady = AtomicBoolean(false)
    private var loadingPage = AtomicBoolean(false)

    @SuppressLint("SetJavaScriptEnabled")
    private suspend fun ensurePageLoaded(): Boolean {
        if (pageReady.get() && webViewRef != null) return true
        if (!loadingPage.compareAndSet(false, true)) {
            var wait = 0
            while (!pageReady.get() && wait < 60) {
                delay(500)
                wait++
            }
            return pageReady.get()
        }

        val context = CommonActivity.activity ?: run {
            loadingPage.set(false)
            return false
        }

        val success = withContext(Dispatchers.Main) {
            withTimeoutOrNull(PAGE_LOAD_TIMEOUT) {
                suspendCancellableCoroutine<Boolean> { cont ->
                    var resumed = false
                    var pollCount = 0
                    val webView = WebView(context)
                    webViewRef = webView
                    try {
                        CookieManager.getInstance().setAcceptCookie(true)
                        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true)
                        webView.settings.apply {
                            javaScriptEnabled = true
                            domStorageEnabled = true
                            databaseEnabled = true
                            mixedContentMode = android.webkit.WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
                            userAgentString = "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/130.0.0.0 Mobile Safari/537.36"
                            blockNetworkImage = true
                            blockNetworkLoads = false
                        }

                        webView.webViewClient = object : WebViewClient() {
                            override fun shouldOverrideUrlLoading(
                                view: WebView?,
                                request: WebResourceRequest?
                            ) = false

                            override fun onReceivedSslError(
                                view: WebView?,
                                handler: SslErrorHandler?,
                                error: SslError?
                            ) {
                                Log.d(TAG, "SSL error ${error?.primaryError} — proceeding anyway")
                                handler?.proceed()
                            }

                            override fun onPageFinished(view: WebView?, url: String?) {
                                super.onPageFinished(view, url)
                                if (url == null || resumed) return
                                Log.d(TAG, "onPageFinished: $url title=${view?.title}")
                                pollForReady(view, 0)
                            }

                            private fun pollForReady(view: WebView?, count: Int) {
                                if (resumed || count > 60) return
                                view?.evaluateJavascript(
                                    "(function(){ var t=document.title||''; var x=typeof xhrAjax; var s=typeof str2ArrayEnc; if(t.indexOf('Just a moment')>=0||t.indexOf('Attention')>=0||t==='') return 'CF:'+t; if(x==='undefined'||s==='undefined') return 'NOJS:'+t; return 'READY:'+t; })();"
                                ) { res ->
                                    Log.d(TAG, "poll $count: $res")
                                    if (res != null && res.contains("READY:") && !resumed) {
                                        CookieManager.getInstance().flush()
                                        Log.d(TAG, "Page ready after $count polls: $res")
                                        pageReady.set(true)
                                        resumed = true
                                        if (cont.isActive) cont.resume(true)
                                    } else {
                                        view?.postDelayed({ pollForReady(view, count + 1) }, 1000)
                                    }
                                }
                            }
                        }

                        webView.loadUrl("$BASE_URL/home")

                        cont.invokeOnCancellation {
                            try {
                                webView.destroy()
                                webViewRef = null
                            } catch (_: Exception) {
                            }
                        }
                    } catch (e: Exception) {
                        Log.e(TAG, "ensurePageLoaded error: ${e.message}")
                        try {
                            webView.destroy()
                            webViewRef = null
                        } catch (_: Exception) {
                        }
                        if (cont.isActive && !resumed) {
                            resumed = true
                            cont.resume(false)
                        }
                    }
                }
            } ?: false
        }

        loadingPage.set(false)
        if (!success) {
            pageReady.set(false)
        }
        return success
    }

    suspend fun callApi(endpoint: String, data: Map<String, Any?>): String? {
        if (!ensurePageLoaded()) {
            Log.e(TAG, "callApi: page not loaded")
            return null
        }

        val dataJson = data.toJson()
        val callId = System.currentTimeMillis()
        Log.d(TAG, "callApi $endpoint data=$dataJson")

        return withContext(Dispatchers.Main) {
            withTimeoutOrNull(API_CALL_TIMEOUT) {
                suspendCancellableCoroutine<String?> { cont ->
                    var resumed = false
                    val webView = webViewRef
                    if (webView == null) {
                        Log.e(TAG, "callApi: webViewRef is null")
                        if (cont.isActive) cont.resume(null)
                        return@suspendCancellableCoroutine
                    }

                    try {
                        val js = """
                            (function() {
                                try {
                                    window.__anisnatch_result_$callId = null;
                                    var t = document.title || '';
                                    if (t.indexOf('Just a moment') >= 0 || t.indexOf('Attention') >= 0) {
                                        window.__anisnatch_result_$callId = JSON.stringify({success:false, error: "CF challenge active: " + t});
                                        return;
                                    }
                                    if (typeof xhrAjax === 'undefined') {
                                        window.__anisnatch_result_$callId = JSON.stringify({success:false, error: "xhrAjax undefined, title=" + t});
                                        return;
                                    }
                                    var p = xhrAjax("$endpoint", $dataJson);
                                    var promise = (p && p.promise) ? p.promise : p;
                                    if (promise && typeof promise.then === 'function') {
                                        promise.then(function(r) {
                                            window.__anisnatch_result_$callId = JSON.stringify(r);
                                        }).catch(function(e) {
                                            window.__anisnatch_result_$callId = JSON.stringify({success:false, error: "promise.catch: " + String(e)});
                                        });
                                    } else {
                                        window.__anisnatch_result_$callId = JSON.stringify({success:false, error: "no promise, got " + typeof promise});
                                    }
                                } catch(e) {
                                    window.__anisnatch_result_$callId = JSON.stringify({success:false, error: "exception: " + String(e)});
                                }
                            })();
                        """.trimIndent()

                        webView.evaluateJavascript(js, null)

                        val pollCount = intArrayOf(0)
                        val pollRunnable = object : Runnable {
                            override fun run() {
                                if (resumed) return
                                pollCount[0]++
                                webView.evaluateJavascript(
                                    "window.__anisnatch_result_$callId || null"
                                ) { res ->
                                    if (res != null && res != "null" && !resumed) {
                                        resumed = true
                                        Log.d(TAG, "API $endpoint response (poll ${pollCount[0]}): ${res.take(800)}")
                                        if (cont.isActive) cont.resume(res)
                                    } else {
                                        if (pollCount[0] % 10 == 0) {
                                            Log.d(TAG, "API $endpoint still waiting (poll ${pollCount[0]})...")
                                        }
                                        webView.postDelayed(this, 500)
                                    }
                                }
                            }
                        }
                        webView.postDelayed(pollRunnable, 1000)

                        cont.invokeOnCancellation {
                            resumed = true
                        }
                    } catch (e: Exception) {
                        Log.e(TAG, "callApi error: ${e.message}")
                        if (cont.isActive && !resumed) {
                            resumed = true
                            cont.resume(null)
                        }
                    }
                }
            } ?: run {
                Log.e(TAG, "callApi $endpoint TIMED OUT after ${API_CALL_TIMEOUT}ms")
                null
            }
        }
    }

    suspend fun fetchStreamUrl(videoPath: String): String? {
        val context = CommonActivity.activity ?: return null
        val fullUrl = if (videoPath.startsWith("http")) videoPath else "$BASE_URL$videoPath"

        return withContext(Dispatchers.Main) {
            withTimeoutOrNull(30_000L) {
                suspendCancellableCoroutine<String?> { cont ->
                    var foundUrl: String? = null
                    val webView = WebView(context)
                    try {
                        CookieManager.getInstance().setAcceptCookie(true)
                        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true)
                        webView.settings.apply {
                            javaScriptEnabled = true
                            domStorageEnabled = true
                            mixedContentMode = android.webkit.WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
                            userAgentString = "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/130.0.0.0 Mobile Safari/537.36"
                            blockNetworkImage = true
                        }

                        webView.webViewClient = object : WebViewClient() {
                            override fun shouldOverrideUrlLoading(
                                view: WebView?,
                                request: WebResourceRequest?
                            ) = false

                            override fun onReceivedSslError(
                                view: WebView?,
                                handler: SslErrorHandler?,
                                error: SslError?
                            ) {
                                handler?.proceed()
                            }

                            override fun onLoadResource(view: WebView?, url: String?) {
                                super.onLoadResource(view, url)
                                if (foundUrl == null && url != null &&
                                    (url.contains(".m3u8") || url.contains(".mp4"))
                                ) {
                                    foundUrl = url
                                    if (cont.isActive) cont.resume(url)
                                }
                            }

                            override fun shouldInterceptRequest(
                                view: WebView?,
                                request: WebResourceRequest?
                            ): android.webkit.WebResourceResponse? {
                                val url = request?.url?.toString() ?: return null
                                if (url.contains(".m3u8") && foundUrl == null) {
                                    foundUrl = url
                                    if (cont.isActive) cont.resume(url)
                                }
                                return null
                            }
                        }

                        webView.loadUrl(fullUrl)

                        cont.invokeOnCancellation {
                            try {
                                webView.destroy()
                            } catch (_: Exception) {
                            }
                        }
                    } catch (e: Exception) {
                        Log.e(TAG, "fetchStreamUrl error: ${e.message}")
                        try {
                            webView.destroy()
                        } catch (_: Exception) {
                        }
                        if (cont.isActive) cont.resume(null)
                    }
                }
            }
        }
    }
}
