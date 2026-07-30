package com.enma

import android.annotation.SuppressLint
import android.content.Context
import android.webkit.JavascriptInterface
import android.webkit.WebChromeClient
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
 * v12: Excessive logging at every stage to pinpoint the hang.
 * The WASM initializes successfully but decrypt() hangs — evaluateJavascript
 * callback never fires. This version logs every step to find why.
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

    @Volatile
    private var initStarted = false

    private val initScope = CoroutineScope(SupervisorJob() + Dispatchers.Main)

    @Volatile
    private var readySignal: CompletableDeferred<Unit>? = null

    @Volatile
    private var pendingResultCont: kotlinx.coroutines.CancellableContinuation<String>? = null

    @Volatile
    private var decryptCallCount = 0

    fun setContext(context: Context) {
        Log.d(TAG, "setContext called")
        appContext = context
    }

    private class DecryptBridge {
        @JavascriptInterface
        fun onResult(result: String) {
            Log.d(TAG, "JS onResult called: len=${result.length} preview=${result.take(80)}")
            val cont = pendingResultCont
            pendingResultCont = null
            cont?.resume(result)
        }

        @JavascriptInterface
        fun onReady() {
            Log.d(TAG, "JS onReady called — setting initialized=true")
            initialized = true
            readySignal?.complete(Unit)
        }

        @JavascriptInterface
        fun onError(error: String) {
            Log.e(TAG, "JS onError called: $error")
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

    private val injectScript = """
        (function() {
            if (window._enmaDecryptLoaded) {
                AndroidDecrypt.log('already loaded, skipping');
                return;
            }
            window._enmaDecryptLoaded = true;
            AndroidDecrypt.log('inject script running');
            var Rs=null, funcName=null;
            async function initWasm(){
                AndroidDecrypt.log('fetching ada.wasm...');
                var w=await fetch('/ada.wasm');
                AndroidDecrypt.log('ada.wasm status='+w.status+' size='+w.headers.get('content-length'));
                AndroidDecrypt.log('fetching ada.manifest...');
                var m=await fetch('/ada.manifest');
                AndroidDecrypt.log('ada.manifest status='+m.status);
                var wb=await w.arrayBuffer();
                var mf=await m.json();
                var s=mf.s, e=mf.e;
                funcName=String.fromCharCode.apply(null, e.map(function(l,c){return l^(s>>(c&15))&255}));
                AndroidDecrypt.log('funcName='+funcName);
                var r=await WebAssembly.instantiate(wb,{env:{abort:function(){}}});
                Rs=r.instance.exports;
                AndroidDecrypt.log('WASM instantiated, exports='+Object.keys(Rs).join(','));
            }
            window._decrypt=function(enc){
                try{
                    AndroidDecrypt.log('_decrypt called, encLen='+enc.length);
                    var dec=atob(enc.trim());
                    var len=dec.length;
                    AndroidDecrypt.log('decoded len='+len);
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
                    AndroidDecrypt.log('calling WASM d()...');
                    var rp=Rs[funcName](hp);
                    AndroidDecrypt.log('d() returned rp='+rp);
                    v=new DataView(Rs.memory.buffer);
                    var rdp=v.getUint32(rp+4,true);
                    var rl=v.getUint32(rp+8,true);
                    AndroidDecrypt.log('result ptr='+rdp+' len='+rl);
                    var rb=new Uint8Array(Rs.memory.buffer,rdp,rl).slice();
                    var result=new TextDecoder().decode(rb);
                    AndroidDecrypt.log('decrypted len='+result.length);
                    return result;
                }catch(e){
                    AndroidDecrypt.log('_decrypt ERROR: '+e.message);
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
        if (initStarted) {
            Log.d(TAG, "startInit: already started, initialized=$initialized")
            return
        }
        initStarted = true
        val ctx = appContext ?: run {
            Log.e(TAG, "startInit: no context")
            return
        }

        val signal = CompletableDeferred<Unit>()
        readySignal = signal

        Log.d(TAG, "startInit: launching WebView creation")

        initScope.launch {
            try {
                Log.d(TAG, "startInit coroutine: destroying old WebView")
                try { webView?.destroy() } catch (e: Exception) {
                    Log.e(TAG, "destroy old WV: ${e.message}")
                }
                webView = null
                initialized = false

                Log.d(TAG, "startInit coroutine: creating new WebView")
                val wv = WebView(ctx)
                wv.settings.javaScriptEnabled = true
                wv.settings.domStorageEnabled = true
                wv.settings.allowFileAccess = true
                wv.settings.allowContentAccess = true
                wv.settings.blockNetworkImage = true
                wv.settings.javaScriptCanOpenWindowsAutomatically = false
                wv.addJavascriptInterface(bridge, "AndroidDecrypt")

                wv.webViewClient = object : WebViewClient() {
                    override fun onPageStarted(view: WebView?, url: String?, favicon: android.graphics.Bitmap?) {
                        Log.d(TAG, "onPageStarted: $url")
                    }
                    override fun onPageFinished(view: WebView?, url: String?) {
                        Log.d(TAG, "onPageFinished: $url — injecting WASM script")
                        view?.evaluateJavascript(injectScript, null)
                    }
                    override fun onReceivedError(view: WebView?, request: android.webkit.WebResourceRequest?, error: android.webkit.WebResourceError?) {
                        Log.e(TAG, "onReceivedError: ${error?.description} for ${request?.url}")
                    }
                }
                wv.webChromeClient = WebChromeClient()

                Log.d(TAG, "startInit coroutine: loading $PAGE_URL")
                wv.loadUrl(PAGE_URL)
                webView = wv
                Log.d(TAG, "startInit coroutine: WebView created and loading")
            } catch (e: Exception) {
                Log.e(TAG, "startInit coroutine FAILED: ${e.message}")
                readySignal?.completeExceptionally(e)
            }
        }
    }

    private suspend fun awaitReady() {
        if (initialized) {
            Log.d(TAG, "awaitReady: already initialized")
            return
        }
        val signal = readySignal ?: run {
            Log.d(TAG, "awaitReady: no signal, calling startInit")
            startInit()
            kotlinx.coroutines.delay(100)
            readySignal ?: run {
                Log.e(TAG, "awaitReady: signal still null after startInit")
                return
            }
        }
        Log.d(TAG, "awaitReady: waiting for signal (30s timeout)...")
        try {
            withTimeoutOrNull(30_000L) {
                signal.await()
            }
        } catch (e: kotlinx.coroutines.CancellationException) {
            Log.d(TAG, "awaitReady: cancelled")
            throw e
        }
        Log.d(TAG, "awaitReady: done, initialized=$initialized")
    }

    suspend fun decrypt(encrypted: String): String {
        val callId = ++decryptCallCount
        Log.d(TAG, "decrypt[$callId]: START, encLen=${encrypted.length}, initialized=$initialized")

        if (!initialized) {
            Log.d(TAG, "decrypt[$callId]: not initialized, calling startInit + awaitReady")
            startInit()
            awaitReady()
        }
        if (!initialized) {
            Log.e(TAG, "decrypt[$callId]: still not initialized after awaitReady, returning empty")
            return ""
        }

        val safeEnc = encrypted.trim()
        Log.d(TAG, "decrypt[$callId]: calling evaluateJavascript, encLen=${safeEnc.length}")

        return withContext(Dispatchers.Main) {
            Log.d(TAG, "decrypt[$callId]: on Main dispatcher, setting up continuation")
            suspendCancellableCoroutine { cont ->
                pendingResultCont = cont
                val js = "AndroidDecrypt.onResult(window._decrypt('$safeEnc'))"
                val wv = webView
                if (wv != null) {
                    Log.d(TAG, "decrypt[$callId]: webView exists, calling evaluateJavascript")
                    wv.evaluateJavascript(js) { result ->
                        Log.d(TAG, "decrypt[$callId]: evaluateJavascript callback fired, result is null=${result == null}")
                        // The callback fires AFTER onResult has been called by the JS
                        // (since the JS calls AndroidDecrypt.onResult synchronously inside _decrypt)
                        // So we don't need to do anything here — the continuation was already resumed.
                    }
                } else {
                    Log.e(TAG, "decrypt[$callId]: webView is NULL!")
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
        Log.d(TAG, "fetchAndDecrypt: START url=$url initialized=$initialized")

        if (!initialized) {
            Log.d(TAG, "fetchAndDecrypt: calling startInit")
            startInit()
        }

        return try {
            Log.d(TAG, "fetchAndDecrypt: fetching URL via OkHttp...")
            val encrypted = com.lagradost.cloudstream3.app.get(url, headers = headers, timeout = 15_000L).text
            Log.d(TAG, "fetchAndDecrypt: OkHttp done, responseLen=${encrypted.length}")
            if (encrypted.isBlank()) {
                Log.e(TAG, "fetchAndDecrypt: empty response")
                return null
            }
            val trimmed = encrypted.trim()
            if (trimmed.startsWith("{") || trimmed.startsWith("[")) {
                Log.d(TAG, "fetchAndDecrypt: response is already JSON")
                return trimmed
            }
            Log.d(TAG, "fetchAndDecrypt: response is encrypted base64, first 40 chars=${trimmed.take(40)}")

            if (!initialized) {
                Log.d(TAG, "fetchAndDecrypt: awaiting WASM ready...")
                awaitReady()
            }
            if (!initialized) {
                Log.e(TAG, "fetchAndDecrypt: WASM not ready after awaitReady")
                return null
            }

            Log.d(TAG, "fetchAndDecrypt: calling decrypt()")
            val decrypted = decrypt(trimmed)
            Log.d(TAG, "fetchAndDecrypt: decrypt returned, len=${decrypted.length}")
            if (decrypted.isBlank() || decrypted.startsWith("DECRYPT_ERROR:")) {
                Log.e(TAG, "fetchAndDecrypt: decrypt failed: $decrypted")
                null
            } else {
                Log.d(TAG, "fetchAndDecrypt: SUCCESS, first 80 chars=${decrypted.take(80)}")
                decrypted
            }
        } catch (e: Exception) {
            Log.e(TAG, "fetchAndDecrypt FAILED for $url: ${e.message}")
            null
        }
    }
}
