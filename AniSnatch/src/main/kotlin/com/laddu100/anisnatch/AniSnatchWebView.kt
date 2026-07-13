package com.laddu100.anisnatch

import android.annotation.SuppressLint
import android.content.Context
import android.webkit.CookieManager
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import com.lagradost.api.Log
import com.lagradost.cloudstream3.CommonActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeoutOrNull
import java.util.concurrent.atomic.AtomicBoolean
import kotlin.coroutines.resume

private const val TAG = "AniSnatch"
private const val BASE_URL = "https://anisnatch.top"
private const val PAGE_LOAD_TIMEOUT = 90_000L

class AniSnatchWebView {
    private var webViewRef: WebView? = null
    private var pageReady = AtomicBoolean(false)
    private var loadingPage = AtomicBoolean(false)

    @SuppressLint("SetJavaScriptEnabled")
    private suspend fun ensurePageLoaded(): Boolean {
        Log.d(TAG, "ensurePageLoaded: called, pageReady=${pageReady.get()} webViewRef=${webViewRef != null}")
        if (pageReady.get() && webViewRef != null) return true
        if (!loadingPage.compareAndSet(false, true)) {
            Log.d(TAG, "ensurePageLoaded: waiting for other load")
            var wait = 0
            while (!pageReady.get() && wait < 90) {
                kotlinx.coroutines.delay(1000)
                wait++
            }
            Log.d(TAG, "ensurePageLoaded: wait done, pageReady=${pageReady.get()}")
            return pageReady.get()
        }

        pageReady.set(false)
        val context = CommonActivity.activity ?: run {
            Log.e(TAG, "ensurePageLoaded: CommonActivity.activity is null")
            loadingPage.set(false)
            return false
        }

        Log.d(TAG, "ensurePageLoaded: starting fresh page load")

        val success = withContext(Dispatchers.Main) {
            withTimeoutOrNull(PAGE_LOAD_TIMEOUT) {
                suspendCancellableCoroutine<Boolean> { cont ->
                    var resumed = false
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
                            val originalUa = userAgentString ?: ""
                            userAgentString = originalUa.replace("; wv", "").replace("Android TV", "Android")
                            blockNetworkImage = true
                        }

                        webView.webChromeClient = object : android.webkit.WebChromeClient() {
                            override fun onConsoleMessage(consoleMessage: android.webkit.ConsoleMessage?): Boolean {
                                Log.d(TAG, "JS: ${consoleMessage?.message()}")
                                return true
                            }
                        }

                        webView.webViewClient = object : WebViewClient() {
                            override fun shouldOverrideUrlLoading(
                                view: WebView?,
                                request: WebResourceRequest?
                            ) = false

                            override fun onPageFinished(view: WebView?, url: String?) {
                                super.onPageFinished(view, url)
                                if (url == null || resumed) return
                                Log.d(TAG, "onPageFinished: $url title=${view?.title}")
                                pollForReady(view, 0)
                            }

                            private fun pollForReady(view: WebView?, count: Int) {
                                if (resumed || count > 80) return
                                view?.evaluateJavascript(
                                    "(function(){ try{ var t=document.title||''; var x=typeof str2ArrayEnc; if(t.indexOf('Just a moment')>=0||t.indexOf('Attention')>=0||t==='') return 'CF:'+t.substring(0,30); if(x==='undefined') return 'NOJS:'+t.substring(0,30); return 'READY:'+t.substring(0,40); }catch(e){ return 'ERR:'+e; } })();"
                                ) { res ->
                                    Log.d(TAG, "poll $count: $res")
                                    if (res != null && res.contains("READY:") && !resumed) {
                                        CookieManager.getInstance().flush()
                                        Log.d(TAG, "Page ready after $count polls")
                                        pageReady.set(true)
                                        resumed = true
                                        if (cont.isActive) cont.resume(true)
                                    } else {
                                        view?.postDelayed({ pollForReady(view, count + 1) }, 1000)
                                    }
                                }
                            }
                        }

                        Log.d(TAG, "Loading URL: $BASE_URL/home")
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
            Log.e(TAG, "ensurePageLoaded FAILED")
        }
        return success
    }

    suspend fun encryptData(data: String): String? {
        if (!ensurePageLoaded()) {
            Log.e(TAG, "encryptData: ensurePageLoaded returned false")
            return null
        }

        val callId = System.currentTimeMillis()
        Log.d(TAG, "encryptData: calling str2ArrayEnc")
        return withContext(Dispatchers.Main) {
            withTimeoutOrNull(15_000L) {
                suspendCancellableCoroutine<String?> { cont ->
                    var resumed = false
                    val webView = webViewRef
                    if (webView == null) {
                        if (cont.isActive) cont.resume(null)
                        return@suspendCancellableCoroutine
                    }

                    val callId = System.currentTimeMillis()
                    val js = """
                        (function() {
                            try {
                                window['AS_ENC_$callId'] = null;
                                if (typeof str2ArrayEnc !== 'function') {
                                    window['AS_ENC_$callId'] = JSON.stringify({error: 'str2ArrayEnc not a function: ' + typeof str2ArrayEnc});
                                    return;
                                }
                                var ir = str2ArrayEnc($data);
                                var str = JSON.stringify(ir);
                                if (!str || str === 'undefined') {
                                    window['AS_ENC_$callId'] = JSON.stringify({error: 'str2ArrayEnc returned ' + typeof ir});
                                    return;
                                }
                                window['AS_ENC_$callId'] = str;
                            } catch(e) {
                                window['AS_ENC_$callId'] = JSON.stringify({error: String(e), stack: e.stack ? e.stack.substring(0,300) : 'no stack'});
                            }
                        })();
                    """.trimIndent()

                    webView.evaluateJavascript(js, null)

                    var pollCount = 0
                    val pollRunnable = object : Runnable {
                        override fun run() {
                            if (resumed) return
                            pollCount++
                            webView.evaluateJavascript(
                                "window['AS_ENC_$callId']"
                            ) { res ->
                                if (res != null && res != "null" && res != "\"null\"" && !resumed) {
                                    resumed = true
                                    Log.d(TAG, "encryptData got result (poll $pollCount): ${res.take(300)}")
                                    if (cont.isActive) cont.resume(res)
                                } else {
                                    if (pollCount % 10 == 0) {
                                        Log.d(TAG, "encryptData poll $pollCount: $res")
                                    }
                                    webView.postDelayed(this, 200)
                                }
                            }
                        }
                    }
                    webView.postDelayed(pollRunnable, 100)

                    cont.invokeOnCancellation { resumed = true }
                }
            }
        }
    }

    suspend fun decryptResponse(encryptedHex: String, token: String): String? {
        if (!ensurePageLoaded()) return null

        val callId = System.currentTimeMillis()
        return withContext(Dispatchers.Main) {
            withTimeoutOrNull(15_000L) {
                suspendCancellableCoroutine<String?> { cont ->
                    var resumed = false
                    val webView = webViewRef
                    if (webView == null) {
                        if (cont.isActive) cont.resume(null)
                        return@suspendCancellableCoroutine
                    }

                    val js = """
                        (function() {
                            try {
                                var hex = "$encryptedHex";
                                var token = "$token";
                                var bytes = new Uint8Array(hex.length / 2);
                                for (var i = 0; i < bytes.length; i++) {
                                    bytes[i] = parseInt(hex.substr(i * 2, 2), 16);
                                }
                                var marker = [65,110,105,83,110,97,116,99,104];
                                var e = -1;
                                for (var i = 0; i <= bytes.length - marker.length; i++) {
                                    var match = true;
                                    for (var j = 0; j < marker.length; j++) {
                                        if (bytes[i+j] !== marker[j]) { match = false; break; }
                                    }
                                    if (match) { e = i + marker.length; break; }
                                }
                                if (e === -1) {
                                    return new TextDecoder().decode(bytes);
                                }
                                var decrypted = new Uint8Array(bytes.length - e);
                                for (var k = 0; k < decrypted.length; k++) {
                                    decrypted[k] = bytes[e + k] ^ token.charCodeAt(k % token.length);
                                }
                                var inflated = pako.inflate(decrypted);
                                return new TextDecoder().decode(inflated);
                            } catch(e) {
                                return JSON.stringify({error: String(e)});
                            }
                        })();
                    """.trimIndent()

                    webView.evaluateJavascript(js) { res ->
                        if (!resumed) {
                            resumed = true
                            Log.d(TAG, "decryptResponse result: ${res?.take(300)}")
                            if (cont.isActive) {
                                cont.resume(res)
                            }
                        }
                    }

                    cont.invokeOnCancellation { resumed = true }
                }
            }
        }
    }

    suspend fun fetchStreamUrl(videoPath: String): String? {
        val context = CommonActivity.activity ?: return null
        val fullUrl = if (videoPath.startsWith("http")) videoPath else "$BASE_URL$videoPath"
        Log.d(TAG, "fetchStreamUrl: $fullUrl")

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
                            val originalUa = userAgentString ?: ""
                            userAgentString = originalUa.replace("; wv", "").replace("Android TV", "Android")
                            blockNetworkImage = true
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
                                    Log.d(TAG, "fetchStreamUrl found: $url")
                                    if (cont.isActive) cont.resume(url)
                                }
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
