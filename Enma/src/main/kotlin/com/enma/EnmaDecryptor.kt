package com.enma

import android.annotation.SuppressLint
import android.content.Context
import android.webkit.JavascriptInterface
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import com.lagradost.api.Log
import com.fasterxml.jackson.databind.ObjectMapper
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
 * v13 FIXES:
 * 1. Replaced evaluateJavascript+JavascriptInterface bridge with a POLLING approach.
 *    The old bridge used suspendCancellableCoroutine + pendingResultCont which could
 *    deadlock if the WebView was destroyed/recreated while a decrypt was in-flight.
 *    Now we set window._pendingResult and poll for window._decryptResult via
 *    evaluateJavascript until it appears.
 * 2. The encrypted data is stored in window._pendingEnc (not embedded in the JS string)
 *    to avoid string quoting issues with large base64 payloads.
 * 3. Single init guard using @Volatile initStarted.
 */
object EnmaDecryptor {
    private const val TAG = "EnmaDecryptor"
    private const val PAGE_URL = "https://www.enma.lol/home"
    private val mapper = ObjectMapper()

    @Volatile private var webView: WebView? = null
    @Volatile private var initialized = false
    @Volatile private var appContext: Context? = null
    @Volatile private var initStarted = false

    private val initScope = CoroutineScope(SupervisorJob() + Dispatchers.Main)

    fun setContext(context: Context) {
        appContext = context
    }
    @Volatile private var readySignal: CompletableDeferred<Unit>? = null

    private class DecryptBridge {
        @JavascriptInterface
        fun onReady() {
            Log.d(TAG, "JS onReady — setting initialized=true")
            initialized = true
            readySignal?.complete(Unit)
        }
        @JavascriptInterface
        fun onError(error: String) {
            Log.e(TAG, "JS onError: $error")
            readySignal?.completeExceptionally(Exception(error))
        }
        @JavascriptInterface
        fun log(msg: String) {
            Log.d(TAG, "JS: $msg")
        }
    }
    private val bridge = DecryptBridge()

    private val injectScript = """
        (function() {
            if (window._enmaDecryptLoaded) { AndroidDecrypt.log('already loaded'); return; }
            window._enmaDecryptLoaded = true;
            AndroidDecrypt.log('inject running');
            var Rs=null, funcName=null;
            async function initWasm(){
                AndroidDecrypt.log('fetch wasm');
                var w=await fetch('/ada.wasm');
                AndroidDecrypt.log('fetch manifest');
                var m=await fetch('/ada.manifest');
                var wb=await w.arrayBuffer();
                var mf=await m.json();
                funcName=String.fromCharCode.apply(null, mf.e.map(function(l,c){return l^(mf.s>>(c&15))&255}));
                AndroidDecrypt.log('func='+funcName);
                var r=await WebAssembly.instantiate(wb,{env:{abort:function(){}}});
                Rs=r.instance.exports;
                AndroidDecrypt.log('wasm ready');
            }
            window._doDecrypt=function(){
                try{
                    var enc=window._pendingEnc;
                    if(!enc){return;}
                    window._pendingEnc=null;
                    window._decryptResult=null;
                    var dec=atob(enc.trim());
                    var len=dec.length;
                    var bytes=new Uint8Array(len);
                    for(var i=0;i<len;i++)bytes[i]=dec.charCodeAt(i);
                    var dp=Rs.__pin(Rs.__new(len,1))>>>0;
                    var hp=Rs.__new(12,5)>>>0;
                    var v=new DataView(Rs.memory.buffer);
                    v.setUint32(hp,dp,true);v.setUint32(hp+4,dp,true);v.setUint32(hp+8,len,true);
                    new Uint8Array(Rs.memory.buffer,dp,len).set(bytes);
                    Rs.__unpin(dp);
                    var rp=Rs[funcName](hp);
                    v=new DataView(Rs.memory.buffer);
                    var rdp=v.getUint32(rp+4,true);
                    var rl=v.getUint32(rp+8,true);
                    var rb=new Uint8Array(Rs.memory.buffer,rdp,rl).slice();
                    window._decryptResult=new TextDecoder().decode(rb);
                }catch(e){
                    window._decryptResult='DECRYPT_ERROR:'+e.message;
                }
            };
            initWasm().then(function(){AndroidDecrypt.onReady();}).catch(function(e){AndroidDecrypt.onError(e.message);});
        })();
    """.trimIndent()

    @SuppressLint("SetJavaScriptEnabled")
    fun startInit() {
        if (initStarted) { Log.d(TAG, "startInit: already started, init=$initialized"); return }
        initStarted = true
        val ctx = appContext ?: run { Log.e(TAG, "startInit: no context"); return }
        val signal = CompletableDeferred<Unit>()
        readySignal = signal
        Log.d(TAG, "startInit: creating WebView")
        initScope.launch {
            try {
                try { webView?.destroy() } catch(_: Exception) {}
                webView = null; initialized = false
                val wv = WebView(ctx)
                wv.settings.javaScriptEnabled = true
                wv.settings.domStorageEnabled = true
                wv.settings.blockNetworkImage = true
                wv.addJavascriptInterface(bridge, "AndroidDecrypt")
                wv.webViewClient = object : WebViewClient() {
                    override fun onPageFinished(view: WebView?, url: String?) {
                        Log.d(TAG, "onPageFinished: $url")
                        view?.evaluateJavascript(injectScript, null)
                    }
                }
                wv.webChromeClient = WebChromeClient()
                Log.d(TAG, "loading $PAGE_URL")
                wv.loadUrl(PAGE_URL)
                webView = wv
            } catch (e: Exception) {
                Log.e(TAG, "startInit failed: ${e.message}")
                readySignal?.completeExceptionally(e)
            }
        }
    }

    private suspend fun awaitReady() {
        if (initialized) return
        val signal = readySignal ?: run { startInit(); kotlinx.coroutines.delay(100); readySignal ?: return }
        try {
            withTimeoutOrNull(30_000L) { signal.await() }
        } catch (e: kotlinx.coroutines.CancellationException) { throw e }
        Log.d(TAG, "awaitReady done, init=$initialized")
    }

    /**
     * Decrypt using polling: set _pendingEnc, trigger _doDecrypt, poll for _decryptResult.
     * This avoids the suspendCancellableCoroutine + JavascriptInterface deadlock.
     */
    suspend fun decrypt(encrypted: String): String {
        if (!initialized) { startInit(); awaitReady() }
        if (!initialized) { Log.e(TAG, "decrypt: not initialized"); return "" }
        val wv = webView ?: run { Log.e(TAG, "decrypt: webView null"); return "" }

        Log.d(TAG, "decrypt: encLen=${encrypted.length}")
        return withContext(Dispatchers.Main) {
            // Step 1: Store encrypted data in window._pendingEnc
            // Use JSON.stringify to safely encode the base64 string
            val setJs = "window._pendingEnc=${jsonEncode(encrypted)};window._decryptResult=null;window._doDecrypt();"
            wv.evaluateJavascript(setJs, null)

            // Step 2: Poll for result (up to 15 seconds)
            var result: String? = null
            var attempts = 0
            while (attempts < 75 && result == null) {
                kotlinx.coroutines.delay(200)
                result = suspendCancellableCoroutine<String?> { cont ->
                    wv.evaluateJavascript("window._decryptResult") { res ->
                        // evaluateJavascript returns null if JS value is null/undefined,
                        // or a JSON-encoded string otherwise
                        cont.resume(res)
                    }
                }
                // res is null (not ready yet), "null" (JS null), or "\"...\"" (JSON string)
                if (result == null || result == "null" || result == "undefined") {
                    result = null
                    attempts++
                }
            }

            if (result == null) {
                Log.e(TAG, "decrypt: timeout after 15s, attempts=$attempts")
                return@withContext ""
            }

            // result is a JSON-encoded string — use Jackson to parse
            // Parse it twice: outer JSON string → inner string
            val decoded = try {
                mapper.readValue(result, String::class.java)
            } catch (e: Exception) {
                Log.e(TAG, "decrypt: parse failed for result=${result.take(100)}")
                return@withContext ""
            }

            Log.d(TAG, "decrypt: success, len=${decoded.length}")
            decoded
        }
    }

    /** JSON-encode a string for safe embedding in JS */
    private fun jsonEncode(s: String): String {
        val sb = StringBuilder("\"")
        for (c in s) {
            when (c) {
                '\\' -> sb.append("\\\\")
                '"' -> sb.append("\\\"")
                '\n' -> sb.append("\\n")
                '\r' -> sb.append("\\r")
                '\t' -> sb.append("\\t")
                else -> if (c.code < 32) sb.append("\\u%04x".format(c.code)) else sb.append(c)
            }
        }
        sb.append("\"")
        return sb.toString()
    }

    /** Parse a double-JSON-encoded string (result of evaluateJavascript on a string value) */
        if (!initialized) startInit()
        return try {
            val encrypted = com.lagradost.cloudstream3.app.get(url, headers = headers, timeout = 15_000L).text
            Log.d(TAG, "fetchAndDecrypt: OkHttp done len=${encrypted.length}")
            if (encrypted.isBlank()) return null
            val trimmed = encrypted.trim()
            if (trimmed.startsWith("{") || trimmed.startsWith("[")) return trimmed
            if (!initialized) awaitReady()
            if (!initialized) { Log.e(TAG, "fetchAndDecrypt: not ready"); return null }
            val decrypted = decrypt(trimmed)
            if (decrypted.isBlank() || decrypted.startsWith("DECRYPT_ERROR:")) {
                Log.e(TAG, "fetchAndDecrypt: decrypt failed: ${decrypted.take(100)}")
                null
            } else decrypted
        } catch (e: Exception) {
            Log.e(TAG, "fetchAndDecrypt failed: ${e.message}")
            null
        }
    }
}
