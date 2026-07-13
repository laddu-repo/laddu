package com.laddu100.anisnatch

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.webkit.CookieManager
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.lagradost.api.Log
import java.util.Locale
import kotlin.coroutines.resume
import kotlinx.coroutines.suspendCancellableCoroutine

private const val TAG = "AniSnatch_CFDialog"
private const val POLL_INTERVAL_MS = 2000L
private const val POLL_TIMEOUT_MS = 120_000L

private val CHALLENGE_TITLES = listOf(
    "just a moment", "just a moment...", "checking your browser",
    "attention required", "ddos-guard", "one more step"
)

private fun isChallengeTitle(title: String): Boolean {
    val lower = title.lowercase(Locale.ROOT)
    return CHALLENGE_TITLES.any { lower.contains(it) }
}

class AniSnatchCFDialog(
    private val targetUrl: String,
    private val onFinished: (Boolean) -> Unit
) : BottomSheetDialogFragment() {

    private val handler = Handler(Looper.getMainLooper())
    private var webView: WebView? = null
    private var statusText: TextView? = null
    private var cookiesSaved = false
    private var pollElapsedMs = 0L

    private val targetHost: String by lazy {
        try {
            val uri = Uri.parse(targetUrl)
            "${uri.scheme}://${uri.host}"
        } catch (e: Exception) {
            targetUrl
        }
    }

    private val cookiePollRunnable = object : Runnable {
        override fun run() {
            if (cookiesSaved || !isAdded) return

            CookieManager.getInstance().flush()
            val cookieStr = CookieManager.getInstance().getCookie(targetHost) ?: ""
            Log.d(TAG, "Poll [${pollElapsedMs}ms] cookies: $cookieStr")

            val title = webView?.title ?: ""
            val isChallenge = isChallengeTitle(title)

            val cfRegex = Regex("cf_clearance=[^;]{15,}")
            if (cfRegex.containsMatchIn(cookieStr) && !isChallenge) {
                saveCookiesAndDismiss(cookieStr)
                return
            }

            if (pollElapsedMs >= POLL_TIMEOUT_MS) {
                updateStatus("Timed out. Try solving the challenge then reopen.")
                return
            }

            scheduleNextPoll()
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.window?.setDimAmount(0.5f)
        return dialog
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val screenH = resources.displayMetrics.heightPixels
        val webViewHeight = (screenH * 0.7).toInt()

        val root = LinearLayout(requireContext()).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(32, 24, 32, 24)
            setBackgroundColor(Color.parseColor("#1A1A2E"))
            layoutParams = ViewGroup.LayoutParams(-1, -2)
        }

        TextView(requireContext()).apply {
            text = "AniSnatch - Cloudflare Bypass"
            textSize = 18f
            setTextColor(-1)
            setPadding(0, 0, 0, 8)
            root.addView(this)
        }

        val status = TextView(requireContext()).apply {
            text = "Loading challenge page..."
            textSize = 13f
            setTextColor(Color.parseColor("#A0A0B0"))
            setPadding(0, 0, 0, 4)
        }
        statusText = status
        root.addView(status)

        TextView(requireContext()).apply {
            text = "Solve any challenge shown below. The dialog will close automatically once done."
            textSize = 11f
            setTextColor(Color.parseColor("#707080"))
            setPadding(0, 0, 0, 12)
            root.addView(this)
        }

        val progress = ProgressBar(requireContext(), null, android.R.attr.progressBarStyleHorizontal).apply {
            isIndeterminate = true
            layoutParams = LinearLayout.LayoutParams(-1, -2).apply { bottomMargin = 12 }
        }
        root.addView(progress)

        val wvContainer = FrameLayout(requireContext()).apply {
            layoutParams = LinearLayout.LayoutParams(-1, webViewHeight)
        }
        webView = buildWebView()
        wvContainer.addView(webView, FrameLayout.LayoutParams(-1, -1))
        root.addView(wvContainer)

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val cm = CookieManager.getInstance()
        cm.setAcceptCookie(true)
        cm.setAcceptThirdPartyCookies(webView, true)

        try {
            val uri = Uri.parse(targetHost)
            val domain = uri.host?.removePrefix("www.") ?: targetHost
            listOf("cf_clearance", "cf_chl_rc_ni", "cf_chl_prog").forEach { name ->
                cm.setCookie(targetHost, "$name=; domain=$domain; path=/; Max-Age=0; expires=Thu, 01 Jan 1970 00:00:00 GMT")
                cm.setCookie(targetHost, "$name=; domain=.$domain; path=/; Max-Age=0; expires=Thu, 01 Jan 1970 00:00:00 GMT")
            }
            cm.flush()
        } catch (e: Exception) {
            Log.e(TAG, "Cookie clear error: ${e.message}")
        }

        webView?.loadUrl(targetUrl)
        handler.postDelayed(cookiePollRunnable, POLL_INTERVAL_MS)
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun buildWebView(): WebView {
        return WebView(requireContext()).apply {
            settings.apply {
                javaScriptEnabled = true
                domStorageEnabled = true
                databaseEnabled = true
                mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
                val originalUa = userAgentString ?: ""
                userAgentString = originalUa.replace("; wv", "").replace("Android TV", "Android")
            }

            webViewClient = object : WebViewClient() {
                override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?) = false

                override fun onPageFinished(view: WebView?, url: String?) {
                    super.onPageFinished(view, url)
                    Log.d(TAG, "onPageFinished: $url title=${view?.title}")
                }
            }
        }
    }

    private fun saveCookiesAndDismiss(cookieStr: String) {
        if (cookiesSaved) return
        cookiesSaved = true
        handler.removeCallbacks(cookiePollRunnable)

        val ua = webView?.settings?.userAgentString ?: ""
        context?.let { ctx ->
            AniSnatchPlugin.saveCfData(ctx, cookieStr, ua)
        }
        Log.d(TAG, "Saved cookies: $cookieStr")
        updateStatus("Done! Cookies saved.")

        webView?.postDelayed({
            if (isAdded) {
                onFinished(true)
                dismissAllowingStateLoss()
            }
        }, 1500)
    }

    private fun scheduleNextPoll() {
        pollElapsedMs += POLL_INTERVAL_MS
        updateStatus("Waiting for cookies... (${pollElapsedMs / 1000}s)")
        handler.postDelayed(cookiePollRunnable, POLL_INTERVAL_MS)
    }

    private fun updateStatus(msg: String) {
        activity?.runOnUiThread {
            statusText?.text = msg
        }
    }

    override fun onDismiss(dialog: DialogInterface) {
        super.onDismiss(dialog)
        handler.removeCallbacks(cookiePollRunnable)
        if (!cookiesSaved) onFinished(false)
    }

    override fun onDestroyView() {
        handler.removeCallbacks(cookiePollRunnable)
        webView?.apply {
            stopLoading()
            destroy()
        }
        webView = null
        super.onDestroyView()
    }
}

suspend fun showAniSnatchCFDialogAndWait(url: String): Boolean {
    val context = com.lagradost.cloudstream3.CommonActivity.activity ?: return false
    return kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.Main) {
        suspendCancellableCoroutine { cont ->
            val dialog = AniSnatchCFDialog(url) { success ->
                if (cont.isActive) cont.resume(success)
            }
            try {
                dialog.show(
                    (context as androidx.fragment.app.FragmentActivity).supportFragmentManager,
                    "AniSnatchCFDialog"
                )
            } catch (e: Exception) {
                Log.e(TAG, "Dialog show error: ${e.message}")
                if (cont.isActive) cont.resume(false)
            }

            cont.invokeOnCancellation {
                try {
                    dialog.dismissAllowingStateLoss()
                } catch (_: Exception) {
                }
            }
        }
    }
}
