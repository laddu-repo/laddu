package com.laddu100.anisnatch

import android.annotation.SuppressLint
import android.webkit.CookieManager
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import com.lagradost.api.Log
import com.lagradost.cloudstream3.CommonActivity
import com.lagradost.cloudstream3.utils.AppUtils.toJson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeoutOrNull
import java.util.concurrent.atomic.AtomicBoolean
import kotlin.coroutines.resume

private const val TAG = "AniSnatch"
private const val BASE_URL = "https://anisnatch.top"
private const val PAGE_LOAD_TIMEOUT = 30_000L
private const val API_CALL_TIMEOUT = 30_000L

class AniSnatchWebView {
    private var pageLoaded = AtomicBoolean(false)
    private var loading = AtomicBoolean(false)

    @SuppressLint("SetJavaScriptEnabled")
    private suspend fun ensurePageLoaded(): Boolean {
        if (pageLoaded.get()) return true
        if (!loading.compareAndSet(false, true)) {
            var wait = 0
            while (pageLoaded.get().not() && wait < 40) {
                kotlinx.coroutines.delay(500)
                wait++
            }
            return pageLoaded.get()
        }

        val context = CommonActivity.activity ?: run {
            loading.set(false)
            return false
        }

        val success = withContext(Dispatchers.Main) {
            withTimeoutOrNull(PAGE_LOAD_TIMEOUT) {
                suspendCancellableCoroutine<Boolean> { cont ->
                    var resumed = false
                    val webView = WebView(context)
                    try {
                        CookieManager.getInstance().setAcceptCookie(true)
                        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true)
                        webView.settings.apply {
                            javaScriptEnabled = true
                            domStorageEnabled = true
                            databaseEnabled = true
                            mixedContentMode = android.webkit.WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
                            userAgentString = "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/130.0.0.0 Mobile Safari/537.36"
                        }

                        webView.webViewClient = object : WebViewClient() {
                            override fun shouldOverrideUrlLoading(
                                view: WebView?,
                                request: WebResourceRequest?
                            ) = false

                            override fun onPageFinished(view: WebView?, url: String?) {
                                super.onPageFinished(view, url)
                                if (url == null || resumed) return
                                val title = view?.title ?: ""
                                if (title.contains("Just a moment", true).not() &&
                                    title.contains("Attention Required", true).not() &&
                                    title.isNotEmpty()
                                ) {
                                    CookieManager.getInstance().flush()
                                    if (resumed.not()) {
                                        resumed = true
                                        pageLoaded.set(true)
                                        try {
                                            view?.destroy()
                                        } catch (_: Exception) {
                                        }
                                        if (cont.isActive) cont.resume(true)
                                    }
                                }
                            }
                        }

                        webView.loadUrl("$BASE_URL/home")

                        cont.invokeOnCancellation {
                            try {
                                webView.destroy()
                            } catch (_: Exception) {
                            }
                        }
                    } catch (e: Exception) {
                        Log.e(TAG, "ensurePageLoaded error: ${e.message}")
                        try {
                            webView.destroy()
                        } catch (_: Exception) {
                        }
                        if (cont.isActive && resumed.not()) {
                            resumed = true
                            cont.resume(false)
                        }
                    }
                }
            } ?: false
        }

        loading.set(false)
        if (success.not()) {
            pageLoaded.set(false)
        }
        return success
    }

    suspend fun callApi(endpoint: String, data: Map<String, Any?>): String? {
        if (ensurePageLoaded().not()) {
            Log.e(TAG, "callApi: page not loaded")
            return null
        }

        val context = CommonActivity.activity ?: return null
        val dataJson = data.toJson()

        return withContext(Dispatchers.Main) {
            withTimeoutOrNull(API_CALL_TIMEOUT) {
                suspendCancellableCoroutine<String?> { cont ->
                    var resumed = false
                    val webView = WebView(context)
                    try {
                        CookieManager.getInstance().setAcceptCookie(true)
                        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true)
                        webView.settings.apply {
                            javaScriptEnabled = true
                            domStorageEnabled = true
                            mixedContentMode = android.webkit.WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
                            userAgentString = "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/130.0.0.0 Mobile Safari/537.36"
                        }

                        webView.webViewClient = object : WebViewClient() {
                            override fun shouldOverrideUrlLoading(
                                view: WebView?,
                                request: WebResourceRequest?
                            ) = false

                            override fun onPageFinished(view: WebView?, url: String?) {
                                super.onPageFinished(view, url)
                                if (url == null || resumed) return

                                val title = view?.title ?: ""
                                if (title.contains("Just a moment", true) ||
                                    title.contains("Attention Required", true)
                                ) {
                                    return
                                }

                                val js = """
                                    (function() {
                                        try {
                                            var result = null;
                                            var p = xhrAjax("$endpoint", $dataJson);
                                            if (p && p.promise) {
                                                p.promise.then(function(r) {
                                                    window.__anisnatch_result = JSON.stringify(r);
                                                }).catch(function(e) {
                                                    window.__anisnatch_result = JSON.stringify({success:false, error: String(e)});
                                                });
                                            } else if (p && typeof p.then === 'function') {
                                                p.then(function(r) {
                                                    window.__anisnatch_result = JSON.stringify(r);
                                                }).catch(function(e) {
                                                    window.__anisnatch_result = JSON.stringify({success:false, error: String(e)});
                                                });
                                            } else {
                                                window.__anisnatch_result = JSON.stringify({success:false, error: "xhrAjax returned " + typeof p});
                                            }
                                        } catch(e) {
                                            window.__anisnatch_result = JSON.stringify({success:false, error: String(e)});
                                        }
                                    })();
                                """.trimIndent()

                                view?.evaluateJavascript(js, null)

                                val pollRunnable = object : Runnable {
                                    override fun run() {
                                        view?.evaluateJavascript(
                                            "(window.__anisnatch_result || null)"
                                        ) { res ->
                                            if (res != null && res != "null" && resumed.not()) {
                                                resumed = true
                                                try {
                                                    view.destroy()
                                                } catch (_: Exception) {
                                                }
                                                if (cont.isActive) {
                                                    cont.resume(res)
                                                }
                                            } else if (resumed.not()) {
                                                view?.postDelayed(this, 500)
                                            }
                                        }
                                    }
                                }
                                view?.postDelayed(pollRunnable, 1000)
                            }
                        }

                        webView.loadUrl("$BASE_URL/home")

                        cont.invokeOnCancellation {
                            try {
                                webView.destroy()
                            } catch (_: Exception) {
                            }
                        }
                    } catch (e: Exception) {
                        Log.e(TAG, "callApi error: ${e.message}")
                        try {
                            webView.destroy()
                        } catch (_: Exception) {
                        }
                        if (cont.isActive && resumed.not()) {
                            resumed = true
                            cont.resume(null)
                        }
                    }
                }
            }
        }
    }

    suspend fun fetchStreamUrl(videoPath: String): String? {
        val context = CommonActivity.activity ?: return null

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
                        }

                        webView.webViewClient = object : WebViewClient() {
                            override fun shouldOverrideUrlLoading(
                                view: WebView?,
                                request: WebResourceRequest?
                            ) = false

                            override fun onLoadResource(view: WebView?, url: String?) {
                                super.onLoadResource(view, url)
                                if (foundUrl == null && url != null &&
                                    (url.contains(".m3u8") || url.contains(".mp4"))
                                ) {
                                    foundUrl = url
                                    if (cont.isActive) cont.resume(url)
                                }
                            }
                        }

                        val fullUrl = if (videoPath.startsWith("http")) videoPath else "$BASE_URL$videoPath"
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
