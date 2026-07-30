package com.enma

import android.annotation.SuppressLint
import android.content.Context
import android.webkit.JavascriptInterface
import android.webkit.WebView
import com.lagradost.api.Log
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeoutOrNull
import kotlin.coroutines.resume

/**
 * Decrypts enma.lol API responses using the site's own WASM module (ada.wasm).
 *
 * The site encrypts ALL API responses with a WASM-based AES decryption.
 * The WASM binary (4KB, AssemblyScript) is served from https://www.enma.lol/ada.wasm
 * and the function name is derived from https://www.enma.lol/ada.manifest.
 *
 * FIX (v10): The WebView initialization now runs in a SupervisorJob (global scope)
 * that survives coroutine cancellation. CloudStream cancels getMainPage coroutines
 * after ~1 second, which was killing the WebView init in v8/v9. Now the init runs
 * independently and fetchAndDecrypt just awaits the readySignal deferred.
 */
object EnmaDecryptor {
    private const val TAG = "EnmaDecryptor"
    private const val BASE_URL = "https://www.enma.lol/"

    @Volatile
    private var webView: WebView? = null

    @Volatile
    private var initialized = false

    @Volatile
    private var appContext: Context? = null

    // SupervisorJob that survives cancellation of individual API call coroutines
    private val initScope = CoroutineScope(SupervisorJob() + Dispatchers.Main)

    // Signal completed when WASM onReady() fires.
    @Volatile
    private var readySignal: CompletableDeferred<Unit>? = null

    // Pending continuation for decrypt() result
    @Volatile
    private var pendingResultCont: kotlinx.coroutines.CancellableContinuation<String>? = null

    fun setContext(context: Context) {
        appContext = context
    }

    // Named class so @JavascriptInterface annotation is correctly applied
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
    }

    private val bridge = DecryptBridge()

    /**
     * Start WASM initialization in a global scope (SupervisorJob).
     * This is NOT tied to the calling coroutine — even if the caller is cancelled,
     * the WebView keeps loading and onReady() will fire.
     * Safe to call multiple times — only the first call creates the WebView.
     */
    fun startInit() {
        if (initialized || readySignal != null) return
        val ctx = appContext ?: run {
            Log.e(TAG, "No context for WASM init")
            return
        }

        val signal = CompletableDeferred<Unit>()
        readySignal = signal

        // Launch in SupervisorJob scope — survives caller cancellation
        initScope.launch {
            try {
                Log.d(TAG, "Starting WASM WebView init (global scope)...")
                try { webView?.destroy() } catch (_: Exception) {}
                webView = null

                val wv = WebView(ctx)
                wv.settings.javaScriptEnabled = true
                wv.settings.domStorageEnabled = true
                wv.settings.allowFileAccess = false
                wv.addJavascriptInterface(bridge, "AndroidDecrypt")

                val html = """
                    <html><body><script>
                    var Rs=null, funcName=null;
                    async function initWasm(){
                        var w=await fetch('${BASE_URL}ada.wasm');
                        var m=await fetch('${BASE_URL}ada.manifest');
                        var wb=await w.arrayBuffer();
                        var mf=await m.json();
                        var s=mf.s, e=mf.e;
                        funcName=String.fromCharCode.apply(null, e.map(function(l,c){return l^(s>>(c&15))&255}));
                        var r=await WebAssembly.instantiate(wb,{env:{abort:function(){}}});
                        Rs=r.instance.exports;
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
                        AndroidDecrypt.onReady();
                    }).catch(function(e){
                        AndroidDecrypt.onError('init: '+e.message);
                    });
                    </script></body></html>
                """.trimIndent()

                wv.loadDataWithBaseURL(BASE_URL, html, "text/html", "UTF-8", null)
                webView = wv
                Log.d(TAG, "WebView created, waiting for onReady...")
            } catch (e: Exception) {
                Log.e(TAG, "WASM init failed: ${e.message}")
                readySignal?.completeExceptionally(e)
            }
        }
    }

    /**
     * Wait for the WASM to be ready. Times out after 20 seconds.
     * Does NOT throw on timeout — just returns (initialized will still be false).
     */
    private suspend fun awaitReady() {
        if (initialized) return
        val signal = readySignal ?: run {
            startInit()
            return awaitReady()
        }
        try {
            withTimeoutOrNull(20_000L) {
                signal.await()
            }
        } catch (e: kotlinx.coroutines.CancellationException) {
            // The WebView keeps running in the background (SupervisorJob).
            // onReady() will still fire and set initialized=true.
            Log.d(TAG, "awaitReady cancelled — WebView continues in background")
            throw e
        }
        if (initialized) {
            Log.d(TAG, "WASM initialized successfully")
        } else {
            Log.e(TAG, "WASM init timeout after 20s")
        }
    }

    /**
     * Decrypt an encrypted base64 API response to JSON string.
     * Returns "" on failure.
     */
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

    /**
     * Convenience: fetch a URL, get the encrypted response, decrypt it, return JSON.
     * Auto-initializes the WASM decryptor on first use.
     */
    suspend fun fetchAndDecrypt(
        url: String,
        headers: Map<String, String>
    ): String? {
        // Start init if not already started (non-blocking — just kicks off the WebView)
        if (!initialized) {
            startInit()
        }

        return try {
            val encrypted = com.lagradost.cloudstream3.app.get(url, headers = headers, timeout = 30_000L).text
            if (encrypted.isBlank()) return null
            val trimmed = encrypted.trim()
            // If it starts with { or [ it is already JSON (not encrypted)
            if (trimmed.startsWith("{") || trimmed.startsWith("[")) {
                return trimmed
            }

            // Wait for WASM to be ready before decrypting
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
