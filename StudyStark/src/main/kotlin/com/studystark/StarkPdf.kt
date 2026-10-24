package com.studystark

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Environment
import android.view.Gravity
import android.view.Window
import android.webkit.CookieManager
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import com.lagradost.cloudstream3.CommonActivity
import com.lagradost.cloudstream3.CommonActivity.showToast
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

data class PdfEntry(
    val title: String,
    val url: String,
)

object StarkPdf {

    private fun dp(ctx: Context, v: Float): Float =
        v * ctx.resources.displayMetrics.density

    /**
     * List the PDFs of a topic first, then open whichever one the user taps.
     * Download button next to every row for one click saves.
     */
    suspend fun showPicker(title: String, pdfs: List<PdfEntry>) = withContext(Dispatchers.Main) {
        val activity = CommonActivity.activity ?: return
        if (activity.isFinishing || activity.isDestroyed) return

        val dialog = Dialog(activity)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        val root = LinearLayout(activity).apply {
            orientation = LinearLayout.VERTICAL
            setBackgroundColor(Color.parseColor("#14151A"))
        }

        val header = TextView(activity).apply {
            text = title
            textSize = 16f
            setTextColor(Color.WHITE)
            setPadding(dp(activity, 18f).toInt(), dp(activity, 16f).toInt(), dp(activity, 18f).toInt(), dp(activity, 12f).toInt())
            layoutParams = LinearLayout.LayoutParams(-1, -2)
        }
        root.addView(header)

        val scroll = ScrollView(activity).apply { layoutParams = LinearLayout.LayoutParams(-1, 0, 1f) }
        val list = LinearLayout(activity).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(activity, 8f).toInt(), 0, dp(activity, 8f).toInt(), dp(activity, 8f).toInt())
        }
        scroll.addView(list)

        pdfs.forEach { pdf ->
            val row = LinearLayout(activity).apply {
                orientation = LinearLayout.HORIZONTAL
                gravity = Gravity.CENTER_VERTICAL
                setPadding(dp(activity, 12f).toInt(), dp(activity, 12f).toInt(), dp(activity, 8f).toInt(), dp(activity, 12f).toInt())
                background = GradientDrawable().apply {
                    setColor(Color.parseColor("#1F2129"))
                    cornerRadius = dp(activity, 10f)
                }
                layoutParams = LinearLayout.LayoutParams(-1, -2).apply {
                    setMargins(0, dp(activity, 6f).toInt(), 0, 0)
                }
            }

            val label = TextView(activity).apply {
                text = pdf.title
                textSize = 14f
                setTextColor(Color.WHITE)
                layoutParams = LinearLayout.LayoutParams(0, -2, 1f)
            }
            row.addView(label)

            val open = TextView(activity).apply {
                text = "Read"
                textSize = 13f
                setPadding(dp(activity, 14f).toInt(), dp(activity, 8f).toInt(), dp(activity, 14f).toInt(), dp(activity, 8f).toInt())
                setTextColor(Color.WHITE)
                background = GradientDrawable().apply {
                    setColor(Color.parseColor("#4F6DF5"))
                    cornerRadius = dp(activity, 8f)
                }
                setOnClickListener {
                    dialog.dismiss()
                    showReader(pdf.title, pdf.url)
                }
            }
            row.addView(open)

            val down = TextView(activity).apply {
                text = "Save"
                textSize = 13f
                setPadding(dp(activity, 14f).toInt(), dp(activity, 8f).toInt(), dp(activity, 14f).toInt(), dp(activity, 8f).toInt())
                setTextColor(Color.WHITE)
                background = GradientDrawable().apply {
                    setColor(Color.parseColor("#2A9D4E"))
                    cornerRadius = dp(activity, 8f)
                }
                setOnClickListener { downloadPdf(activity, pdf) }
            }
            row.addView(down)

            row.isFocusable = true
            row.isFocusableInTouchMode = true
            row.setOnFocusChangeListener { v, has ->
                v.background = GradientDrawable().apply {
                    setColor(if (has) Color.parseColor("#2C3040") else Color.parseColor("#1F2129"))
                    cornerRadius = dp(activity, 10f)
                }
            }
            list.addView(row)
        }

        root.addView(scroll)

        val close = TextView(activity).apply {
            text = "Close"
            gravity = Gravity.CENTER
            textSize = 14f
            setTextColor(Color.WHITE)
            setPadding(0, dp(activity, 14f).toInt(), 0, dp(activity, 14f).toInt())
            setOnClickListener { dialog.dismiss() }
            layoutParams = LinearLayout.LayoutParams(-1, -2)
        }
        root.addView(close)

        dialog.setContentView(root)
        dialog.window?.apply {
            setLayout((activity.resources.displayMetrics.widthPixels * 0.9f).toInt(), (activity.resources.displayMetrics.heightPixels * 0.7f).toInt())
            setBackgroundDrawable(GradientDrawable().apply { setColor(Color.TRANSPARENT) })
        }
        dialog.show()
    }

    /** Fullscreen pdf.js reader on the site's own viewer, with a save button up top.
     *  Runs from a click listener so the thread is already main. */
    fun showReader(title: String, pdfUrl: String) {
        val activity = CommonActivity.activity ?: return
        if (activity.isFinishing || activity.isDestroyed) return

        val dialog = Dialog(activity)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)

        val root = LinearLayout(activity).apply {
            orientation = LinearLayout.VERTICAL
            setBackgroundColor(Color.parseColor("#101116"))
        }

        val bar = LinearLayout(activity).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
            setBackgroundColor(Color.parseColor("#1A1C22"))
            setPadding(dp(activity, 12f).toInt(), dp(activity, 8f).toInt(), dp(activity, 12f).toInt(), dp(activity, 8f).toInt())
            layoutParams = LinearLayout.LayoutParams(-1, -2)
        }

        val nameView = TextView(activity).apply {
            text = title
            textSize = 14f
            maxLines = 1
            setTextColor(Color.WHITE)
            layoutParams = LinearLayout.LayoutParams(0, -2, 1f)
        }
        bar.addView(nameView)

        val save = TextView(activity).apply {
            text = "Save PDF"
            textSize = 13f
            setPadding(dp(activity, 12f).toInt(), dp(activity, 6f).toInt(), dp(activity, 12f).toInt(), dp(activity, 6f).toInt())
            setTextColor(Color.WHITE)
            background = GradientDrawable().apply {
                setColor(Color.parseColor("#2A9D4E"))
                cornerRadius = dp(activity, 8f)
            }
            setOnClickListener { downloadPdf(activity, PdfEntry(title, pdfUrl)) }
        }
        bar.addView(save)

        val close = TextView(activity).apply {
            text = "✕"
            textSize = 16f
            setPadding(dp(activity, 14f).toInt(), dp(activity, 6f).toInt(), dp(activity, 6f).toInt(), dp(activity, 6f).toInt())
            setTextColor(Color.WHITE)
            setOnClickListener { dialog.dismiss() }
        }
        bar.addView(close)
        root.addView(bar)

        val webHolder = FrameLayout(activity).apply { layoutParams = LinearLayout.LayoutParams(-1, 0, 1f) }

        @SuppressLint("SetJavaScriptEnabled")
        val webView = WebView(activity).apply {
            layoutParams = FrameLayout.LayoutParams(-1, -1)
            settings.apply {
                javaScriptEnabled = true
                domStorageEnabled = true
                mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
                mediaPlaybackRequiresUserGesture = false
                userAgentString = StarkApi.userAgent()
                setSupportZoom(true)
                builtInZoomControls = true
                displayZoomControls = false
                useWideViewPort = true
                loadWithOverviewMode = true
            }
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, true)
            webViewClient = object : WebViewClient() {
                override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                    return false
                }
            }
            webChromeClient = WebChromeClient()
            loadUrl(StarkApi.pdfViewerUrl(pdfUrl))
        }
        webHolder.addView(webView)
        root.addView(webHolder)

        dialog.setContentView(root)
        dialog.window?.apply {
            setLayout(-1, -1)
            setBackgroundDrawable(GradientDrawable().apply { setColor(Color.parseColor("#101116")) })
        }
        dialog.setOnDismissListener {
            runCatching { webView.stopLoading() }
            runCatching { webView.destroy() }
        }
        dialog.show()
    }

    /** Hand the pdf to the system download manager so it lands in Downloads as .pdf */
    fun downloadPdf(ctx: Context, pdf: PdfEntry) {
        runCatching {
            val name = pdf.title.replace(Regex("[\\\\/:*?\"<>|]"), "_").take(120)
            val file = pdf.title.substringAfterLast('/')
            val fileName = if (file.endsWith(".pdf", true)) file else "$name.pdf"
            val request = android.app.DownloadManager.Request(android.net.Uri.parse(pdf.url))
                .setTitle(fileName)
                .setDescription("StudyStark PDF")
                .setNotificationVisibility(android.app.DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName)
                .addRequestHeader("User-Agent", StarkApi.userAgent())
                .addRequestHeader("Referer", StarkApi.baseUrl() + "/")
            val dm = ctx.getSystemService(Context.DOWNLOAD_SERVICE) as android.app.DownloadManager
            dm.enqueue(request)
            showToast("Saving $fileName")
        }
    }
}
