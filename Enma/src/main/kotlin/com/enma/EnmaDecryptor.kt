package com.enma

import android.annotation.SuppressLint
import android.content.Context
import android.webkit.JavascriptInterface
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import com.lagradost.api.Log
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeoutOrNull
import kotlin.coroutines.resume

/**
 * Decrypts enma.lol API responses using the site's own WASM module (ada.wasm).
 *
 * FIX (v11): Previous versions used loadDataWithBaseURL with inline HTML, but
 * Android WebView's fetch() from inline scripts uses about:blank origin on
 * many devices, causing ada.wasm fetch to fail silently. Now we load the
 * REAL enma.lol page and inject our WASM script via evaluateJavascript.
 * This guarantees the origin is https://www.enma.lol and fetch works.
 *
 * The init runs in a SupervisorJob (survives coroutine cancellation).
 */
object EnmaDecryptor {
    private const val TAG = "EnmaDecryptor"
    private const val PAGE_URL = "https://www.enma.lol/home"

    @Volatile
    private var webView: WebView? = null

    @Volatile
    private var initialized = false

    @Volatile
    private var appContext: Context? = null

    private val initScope = CoroutineScope(SupervisorJob() + Dispatchers.Main)

    @Volatile
    private var readySignal: CompletableDeferred<Unit>? = null

    @Volatile
    private var pendingResultCont: kotlinx.coroutines.CancellableContinuation<String>? = null

    fun setContext(context: Context) {
        appContext = context
    }

    private class DecryptBridge {
        @JavascriptInterface
        fun onResult(result: String) {
            val cont = pendingResultCont
            pendingResultCont = null
            cont?.resume(result)
        }

        @JavascriptInterface
        fun onReady() {
            Log.d(TAG, "WASM ready — setting initialized=true")
            initialized = true
            readySignal?.complete(Unit)
        }

        @JavascriptInterface
        fun onError(error: String) {
            Log.e(TAG, "WASM error: $error")
            readySignal?.completeExceptionally(Exception(error))
            val cont = pendingResultCont
            pendingResultCont = null
            cont?.resume("")
        }

        @JavascriptInterface
        fun log(msg: String) {
            Log.d(TAG, "JS: $msg")
        }
    }

    private val bridge = DecryptBridge()

    // The JS code to inject after the page loads.
    // Fetches ada.wasm + ada.manifest, instantiates WASM, exposes _decrypt()
    private val injectScript = """
        (function() {
            if (window._enmaDecryptLoaded) return;
            window._enmaDecryptLoaded = true;
            AndroidDecrypt.log('inject script running');
            var Rs=null, funcName=null;
            async function initWasm(){
                AndroidDecrypt.log('fetching ada.wasm...');
                var w=await fetch('/ada.wasm');
                AndroidDecrypt.log('fetching ada.manifest...');
                var m=await fetch('/ada.manifest');
                var wb=await w.arrayBuffer();
                var mf=await m.json();
                var s=mf.s, e=mf.e;
                funcName=String.fromCharCode.apply(null, e.map(function(l,c){return l^(s>>(c&15))&255}));
                AndroidDecrypt.log('funcName='+funcName);
                var r=await WebAssembly.instantiate(wb,{env:{abort:function(){}}});
                Rs=r.instance.exports;
                AndroidDecrypt.log('WASM instantiated');
            }
            window._decrypt=function(enc){
                try{
                    var dec=atob(enc.trim());
                    var len=dec.length;
                    var bytes=new Uint8Array(len);
                    for(var i=0;i<len;i++)bytes[i]=dec.charCodeAt(i);
                    var dp=Rs.__pin(Rs.__new(len,1))>>>0;
                    var hp=Rs.__new(12,5)>>>0;
                    var v=new DataView(Rs.memory.buffer);
                    v.setUint32(hp,dp,true);
                    v.setUint32(hp+4,dp,true);
                    v.setUint32(hp+8,len,true);
                    new Uint8Array(Rs.memory.buffer,dp,len).set(bytes);
                    Rs.__unpin(dp);
                    var rp=Rs[funcName](hp);
                    v=new DataView(Rs.memory.buffer);
                    var rdp=v.getUint32(rp+4,true);
                    var rl=v.getUint32(rp+8,true);
                    var rb=new Uint8Array(Rs.memory.buffer,rdp,rl).slice();
                    return new TextDecoder().decode(rb);
                }catch(e){
                    return 'DECRYPT_ERROR:'+e.message;
                }
            };
            initWasm().then(function(){
                AndroidDecrypt.log('initWasm success, calling onReady');
                AndroidDecrypt.onReady();
            }).catch(function(e){
                AndroidDecrypt.log('initWasm failed: '+e.message);
                AndroidDecrypt.onError('init: '+e.message);
            });
        })();
    """.trimIndent()

    @SuppressLint("SetJavaScriptEnabled")
    fun startInit() {
        if (initialized || readySignal != null) return
        val ctx = appContext ?: run {
            Log.e(TAG, "No context for WASM init")
            return
        }

        val signal = CompletableDeferred<Unit>()
        readySignal = signal

        initScope.launch {
            try {
                Log.d(TAG, "Starting WASM init — loading enma.lol page...")
                try { webView?.destroy() } catch (_: Exception) {}
                webView = null

                val wv = WebView(ctx)
                wv.settings.javaScriptEnabled = true
                wv.settings.domStorageEnabled = true
                wv.settings.allowFileAccess = true
                wv.settings.allowContentAccess = true
                wv.settings.blockNetworkImage = true  // Don't load images (faster)
                wv.settings.javaScriptCanOpenWindowsAutomatically = false
                wv.addJavascriptInterface(bridge, "AndroidDecrypt")

                // Set WebViewClient to detect page load completion
                wv.webViewClient = object : WebViewClient() {
                    override fun onPageFinished(view: WebView?, url: String?) {
                        Log.d(TAG, "Page loaded: $url — injecting WASM script")
                        // Inject our script now that the page is loaded
                        view?.evaluateJavascript(injectScript, null)
                    }
                }
                wv.webChromeClient = WebChromeClient()

                // Load the REAL enma.lol page — this sets the origin correctly
                wv.loadUrl(PAGE_URL)
                webView = wv
                Log.d(TAG, "WebView created, loading $PAGE_URL")
            } catch (e: Exception) {
                Log.e(TAG, "WASM init failed: ${e.message}")
                readySignal?.completeExceptionally(e)
            }
        }
    }

    private suspend fun awaitReady() {
        if (initialized) return
        val signal = readySignal ?: run {
            startInit()
            // Give it a moment to create the signal
            kotlinx.coroutines.delay(100)
            readySignal ?: return
        }
        try {
            withTimeoutOrNull(30_000L) {
                signal.await()
            }
        } catch (e: kotlinx.coroutines.CancellationException) {
            Log.d(TAG, "awaitReady cancelled — WebView continues in background")
            throw e
        }
        if (initialized) {
            Log.d(TAG, "WASM initialized successfully")
        } else {
            Log.e(TAG, "WASM init timeout after 30s")
        }
    }

    suspend fun decrypt(encrypted: String): String {
        if (!initialized) {
            startInit()
            awaitReady()
        }
        if (!initialized) return ""

        val safeEnc = encrypted.trim()

        return withContext(Dispatchers.Main) {
            suspendCancellableCoroutine { cont ->
                pendingResultCont = cont
                val js = "AndroidDecrypt.onResult(window._decrypt('$safeEnc'))"
                val wv = webView
                if (wv != null) {
                    wv.evaluateJavascript(js, null)
                } else {
                    pendingResultCont = null
                    cont.resume("")
                }
            }
        }
    }

    suspend fun fetchAndDecrypt(
        url: String,
        headers: Map<String, String>
    ): String? {
        if (!initialized) {
            startInit()
        }

        return try {
            val encrypted = com.lagradost.cloudstream3.app.get(url, headers = headers, timeout = 15_000L).text
            if (encrypted.isBlank()) return null
            val trimmed = encrypted.trim()
            if (trimmed.startsWith("{") || trimmed.startsWith("[")) {
                return trimmed
            }

            if (!initialized) {
                awaitReady()
            }
            if (!initialized) {
                Log.e(TAG, "WASM not ready — cannot decrypt $url")
                return null
            }

            val decrypted = decrypt(trimmed)
            if (decrypted.isBlank() || decrypted.startsWith("DECRYPT_ERROR:")) {
                Log.e(TAG, "decrypt failed for $url: $decrypted")
                null
            } else {
                decrypted
            }
        } catch (e: Exception) {
            Log.e(TAG, "fetchAndDecrypt failed for $url: ${e.message}")
            null
        }
    }
}
