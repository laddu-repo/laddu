package com.laddu100.anisnatch

import android.annotation.SuppressLint
import android.webkit.JavascriptInterface
import android.webkit.CookieManager
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import com.lagradost.api.Log
import com.lagradost.cloudstream3.CommonActivity
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

class JSBridge {
    val resultLock = Object()
    var result: String? = null

    val readyLock = Object()
    var ready: Boolean = false

    @JavascriptInterface
    fun onResult(value: String) {
        synchronized(resultLock) {
            result = value
            (resultLock as Object).notifyAll()
        }
        Log.d(TAG, "JSBridge.onResult called, length=${value.length}")
    }

    @JavascriptInterface
    fun onReady() {
        synchronized(readyLock) {
            ready = true
            (readyLock as Object).notifyAll()
        }
        Log.d(TAG, "JSBridge.onReady called")
    }

    @JavascriptInterface
    fun log(msg: String) {
        Log.d(TAG, "JS: $msg")
    }

    fun reset() {
        synchronized(resultLock) { result = null }
        synchronized(readyLock) { ready = false }
    }

    fun waitForResult(timeoutMs: Long): String? {
        synchronized(resultLock) {
            val deadline = System.currentTimeMillis() + timeoutMs
            while (result == null && System.currentTimeMillis() < deadline) {
                try {
                    (resultLock as Object).wait(timeoutMs)
                } catch (_: InterruptedException) {
                    Thread.currentThread().interrupt()
                    break
                }
            }
            return result
        }
    }
}

class AniSnatchWebView {
    private var webViewRef: WebView? = null
    private var pageReady = AtomicBoolean(false)
    private var loadingPage = AtomicBoolean(false)
    private val bridge = JSBridge()

    @SuppressLint("SetJavaScriptEnabled")
    private suspend fun ensurePageLoaded(): Boolean {
        Log.d(TAG, "ensurePageLoaded: called, pageReady=${pageReady.get()} webViewRef=${webViewRef != null} loadingPage=${loadingPage.get()}")
        if (pageReady.get() && webViewRef != null) return true

        // Force reset stuck state from previous cancelled attempts
        if (loadingPage.get()) {
            Log.d(TAG, "ensurePageLoaded: force resetting stuck loadingPage")
            loadingPage.set(false)
            try {
                webViewRef?.destroy()
            } catch (_: Exception) {}
            webViewRef = null
            pageReady.set(false)
        }

        if (!loadingPage.compareAndSet(false, true)) {
            Log.d(TAG, "ensurePageLoaded: waiting for other load")
            var wait = 0
            while (!pageReady.get() && wait < 90) {
                delay(1000)
                wait++
            }
            return pageReady.get()
        }

        pageReady.set(false)
        bridge.ready = false
        val context = CommonActivity.activity ?: run {
            Log.e(TAG, "ensurePageLoaded: CommonActivity.activity is null")
            loadingPage.set(false)
            return false
        }

        Log.d(TAG, "ensurePageLoaded: starting fresh page load")

        var success = false
        try {
            success = withContext(Dispatchers.Main) {
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

                            webView.addJavascriptInterface(bridge, "AndroidBridge")

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

                                    view?.evaluateJavascript("""
                                        (function() {
                                            try {
                                                var t = document.title || '';
                                                if (t.indexOf('Just a moment') >= 0 || t.indexOf('Attention') >= 0) {
                                                    AndroidBridge.log('CF challenge: ' + t);
                                                    return;
                                                }
                                                if (typeof str2ArrayEnc === 'function' && typeof pako !== 'undefined') {
                                                    AndroidBridge.log('Page ready, str2ArrayEnc and pako available');
                                                    AndroidBridge.onReady();
                                                } else {
                                                    AndroidBridge.log('Waiting for JS: str2ArrayEnc=' + typeof str2ArrayEnc + ' pako=' + typeof pako);
                                                }
                                            } catch(e) {
                                                AndroidBridge.log('Ready check error: ' + e);
                                            }
                                        })();
                                    """.trimIndent(), null)

                                    pollForReady(view, 0)
                                }

                                private fun pollForReady(view: WebView?, count: Int) {
                                    if (resumed || count > 80) return
                                    synchronized(bridge.readyLock) {
                                        if (bridge.ready) {
                                            CookieManager.getInstance().flush()
                                            Log.d(TAG, "Page ready after $count polls")
                                            pageReady.set(true)
                                            resumed = true
                                            if (cont.isActive) cont.resume(true)
                                            return
                                        }
                                    }
                                    view?.evaluateJavascript("""
                                        (function() {
                                            try {
                                                var t = document.title || '';
                                                if (t.indexOf('Just a moment') >= 0 || t.indexOf('Attention') >= 0) return;
                                                if (typeof str2ArrayEnc === 'function' && typeof pako !== 'undefined') {
                                                    AndroidBridge.onReady();
                                                }
                                            } catch(e) {}
                                        })();
                                    """.trimIndent(), null)
                                    view?.postDelayed({ pollForReady(view, count + 1) }, 500)
                                }
                            }

                            Log.d(TAG, "Loading URL: $BASE_URL/home")
                            webView.loadUrl("$BASE_URL/home")

                            cont.invokeOnCancellation {
                                try {
                                    webView.destroy()
                                    webViewRef = null
                                    pageReady.set(false)
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
        } finally {
            loadingPage.set(false)
        }

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

        bridge.reset()
        Log.d(TAG, "encryptData: calling str2ArrayEnc via JS bridge")

        withContext(Dispatchers.Main) {
            webViewRef?.evaluateJavascript("""
                (function() {
                    try {
                        if (typeof str2ArrayEnc !== 'function') {
                            AndroidBridge.onResult(JSON.stringify({error: 'str2ArrayEnc not a function: ' + typeof str2ArrayEnc}));
                            return;
                        }
                        var ir = str2ArrayEnc($data);
                        var str = JSON.stringify(ir);
                        if (!str || str === 'undefined') {
                            AndroidBridge.onResult(JSON.stringify({error: 'str2ArrayEnc returned ' + typeof ir}));
                            return;
                        }
                        AndroidBridge.log('encryptData success, length=' + str.length);
                        AndroidBridge.onResult(str);
                    } catch(e) {
                        AndroidBridge.onResult(JSON.stringify({error: String(e), stack: e.stack ? e.stack.substring(0,300) : 'no stack'}));
                    }
                })();
            """.trimIndent(), null)
        }

        var wait = 0
        while (bridge.result == null && wait < 75) {
            delay(200)
            wait++
            if (wait % 10 == 0) {
                Log.d(TAG, "encryptData waiting... (poll $wait)")
            }
        }

        val result = bridge.result
        if (result != null) {
            Log.d(TAG, "encryptData got result: ${result.take(300)}")
        } else {
            Log.e(TAG, "encryptData timed out after 15s")
        }
        return result
    }

    suspend fun encryptDataV2(data: String): String? {
        if (!ensurePageLoaded()) {
            Log.e(TAG, "encryptData: ensurePageLoaded returned false")
            return null
        }

        bridge.reset()
        Log.d(TAG, "encryptData: calling str2ArrayEnc via JS bridge")

        withContext(Dispatchers.Main) {
            webViewRef?.evaluateJavascript("""
                (function() {
                    try {
                        if (typeof str2ArrayEnc !== 'function') {
                            AndroidBridge.onResult(JSON.stringify({error: 'str2ArrayEnc not a function: ' + typeof str2ArrayEnc}));
                            return;
                        }
                        var ir = str2ArrayEnc($data);
                        var str = JSON.stringify(ir);
                        if (!str || str === 'undefined') {
                            AndroidBridge.onResult(JSON.stringify({error: 'str2ArrayEnc returned ' + typeof ir}));
                            return;
                        }
                        AndroidBridge.log('encryptData success, length=' + str.length);
                        AndroidBridge.onResult(str);
                    } catch(e) {
                        AndroidBridge.onResult(JSON.stringify({error: String(e), stack: e.stack ? e.stack.substring(0,300) : 'no stack'}));
                    }
                })();
            """.trimIndent(), null)
        }

        val result = bridge.waitForResult(15_000)
        if (result != null) {
            Log.d(TAG, "encryptData got result: ${result.take(300)}")
        } else {
            Log.e(TAG, "encryptData timed out after 15s")
        }
        return result
    }

    suspend fun decryptResponse(encryptedHex: String, token: String): String? {
        if (!ensurePageLoaded()) return null

        bridge.reset()
        Log.d(TAG, "decryptResponse: calling pako.inflate via JS bridge")

        withContext(Dispatchers.Main) {
            webViewRef?.evaluateJavascript("""
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
                            AndroidBridge.onResult(new TextDecoder().decode(bytes));
                            return;
                        }
                        var decrypted = new Uint8Array(bytes.length - e);
                        for (var k = 0; k < decrypted.length; k++) {
                            decrypted[k] = bytes[e + k] ^ token.charCodeAt(k % token.length);
                        }
                        var inflated = pako.inflate(decrypted);
                        AndroidBridge.log('decryptResponse success, length=' + inflated.length);
                        AndroidBridge.onResult(new TextDecoder().decode(inflated));
                    } catch(e) {
                        AndroidBridge.onResult(JSON.stringify({error: String(e)}));
                    }
                })();
            """.trimIndent(), null)
        }

        var wait = 0
        while (bridge.result == null && wait < 75) {
            delay(200)
            wait++
        }

        val result = bridge.result
        if (result != null) {
            Log.d(TAG, "decryptResponse got result: ${result?.take(500)}")
        } else {
            Log.e(TAG, "decryptResponse timed out after 15s")
        }
        return result
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
