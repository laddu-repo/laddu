package com.studystark

import android.annotation.SuppressLint
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.SystemClock
import android.view.Gravity
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import android.view.Window
import android.webkit.CookieManager
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import com.lagradost.cloudstream3.CommonActivity
import com.lagradost.cloudstream3.ui.settings.Globals
import com.lagradost.cloudstream3.ui.settings.Globals.TV
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * The quiz runs on the site's own page (MathJax, timer, scoring, solutions) inside a
 * fullscreen WebView. Phones can just touch it, for TV a small virtual cursor driven
 * by the d-pad taps the option cards.
 */
object StarkQuiz {

    private fun dp(ctx: android.content.Context, v: Float): Float =
        v * ctx.resources.displayMetrics.density

    private class CursorPos {
        var x: Float = 0f
        var y: Float = 0f
    }

    suspend fun showQuizList(title: String, quizzes: List<StarkApi.DppQuizDetails>) =
        withContext(Dispatchers.Main) {
            val activity = CommonActivity.activity ?: return@withContext
            if (activity.isFinishing || activity.isDestroyed) return@withContext

            val dialog = Dialog(activity)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            val root = LinearLayout(activity).apply {
                orientation = LinearLayout.VERTICAL
                setBackgroundColor(Color.parseColor("#14151A"))
            }

            root.addView(TextView(activity).apply {
                text = title
                textSize = 16f
                setTextColor(Color.WHITE)
                setPadding(
                    dp(activity, 18).toInt(), dp(activity, 16).toInt(),
                    dp(activity, 18).toInt(), dp(activity, 12).toInt()
                )
                layoutParams = LinearLayout.LayoutParams(-1, -2)
            })

            val scroll = android.widget.ScrollView(activity).apply {
                layoutParams = LinearLayout.LayoutParams(-1, 0, 1f)
            }
            val list = LinearLayout(activity).apply {
                orientation = LinearLayout.VERTICAL
                setPadding(dp(activity, 8).toInt(), 0, dp(activity, 8).toInt(), dp(activity, 8).toInt())
            }
            scroll.addView(list)

            quizzes.sortedBy { it.test?.displayOrder ?: 0 }.forEach { quiz ->
                val test = quiz.test ?: return@forEach
                val card = LinearLayout(activity).apply {
                    orientation = LinearLayout.VERTICAL
                    setPadding(
                        dp(activity, 14).toInt(), dp(activity, 12).toInt(),
                        dp(activity, 14).toInt(), dp(activity, 12).toInt()
                    )
                    background = GradientDrawable().apply {
                        setColor(Color.parseColor("#1F2129"))
                        cornerRadius = dp(activity, 10)
                    }
                    layoutParams = LinearLayout.LayoutParams(-1, -2).apply {
                        setMargins(0, dp(activity, 6).toInt(), 0, 0)
                    }
                    isFocusable = true
                    isFocusableInTouchMode = true
                    setOnFocusChangeListener { v, has ->
                        v.background = GradientDrawable().apply {
                            setColor(if (has) Color.parseColor("#2C3040") else Color.parseColor("#1F2129"))
                            cornerRadius = dp(activity, 10)
                        }
                    }
                    setOnClickListener {
                        dialog.dismiss()
                        openQuiz(test._id.orEmpty(), quiz)
                    }
                }
                card.addView(TextView(activity).apply {
                    text = test.name ?: "DPP Quiz"
                    textSize = 14f
                    setTextColor(Color.WHITE)
                    layoutParams = LinearLayout.LayoutParams(-1, -2)
                })
                val meta = listOfNotNull(
                    test.totalQuestions?.let { "$it Qs" },
                    test.totalMarks?.let { "$it Marks" },
                    test.maxDuration?.let { "$it min" },
                ).joinToString("  ·  ")
                card.addView(TextView(activity).apply {
                    text = meta
                    textSize = 12f
                    setTextColor(Color.parseColor("#9BA0AC"))
                    layoutParams = LinearLayout.LayoutParams(-1, -2)
                })
                list.addView(card)
            }

            root.addView(scroll)
            root.addView(TextView(activity).apply {
                text = "Close"
                gravity = Gravity.CENTER
                textSize = 14f
                setTextColor(Color.WHITE)
                setPadding(0, dp(activity, 14).toInt(), 0, dp(activity, 14).toInt())
                setOnClickListener { dialog.dismiss() }
                layoutParams = LinearLayout.LayoutParams(-1, -2)
            })

            dialog.setContentView(root)
            dialog.window?.apply {
                setLayout(
                    (activity.resources.displayMetrics.widthPixels * 0.9f).toInt(),
                    (activity.resources.displayMetrics.heightPixels * 0.7f).toInt()
                )
                setBackgroundDrawable(GradientDrawable().apply { setColor(Color.TRANSPARENT) })
            }
            dialog.show()
        }

    private suspend fun openQuiz(testId: String, quiz: StarkApi.DppQuizDetails) =
        withContext(Dispatchers.Main) {
            if (testId.isBlank()) return@withContext
            val ctx = CommonActivity.activity ?: return@withContext
            CommonActivity.showToast?.let { it("Opening quiz...", 0) }
            showQuizPage(ctx, quiz.test?.name ?: "DPP Quiz", testId)
        }

    @SuppressLint("SetJavaScriptEnabled")
    private fun showQuizPage(ctx: android.content.Context, title: String, testId: String) {
        val dialog = Dialog(ctx)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)

        val data = ctx.getSharedPreferences("studystark_nav", android.content.Context.MODE_PRIVATE)
        val batchId = data.getString("batch_id", "").orEmpty()
        val subjectId = data.getString("subject_id", "").orEmpty()
        val topicId = data.getString("topic_id", "").orEmpty()

        val root = LinearLayout(ctx).apply {
            orientation = LinearLayout.VERTICAL
            setBackgroundColor(Color.parseColor("#101116"))
        }

        val bar = LinearLayout(ctx).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
            setBackgroundColor(Color.parseColor("#1A1C22"))
            setPadding(dp(ctx, 12).toInt(), dp(ctx, 8).toInt(), dp(ctx, 12).toInt(), dp(ctx, 8).toInt())
            layoutParams = LinearLayout.LayoutParams(-1, -2)
        }
        bar.addView(TextView(ctx).apply {
            text = title
            textSize = 14f
            maxLines = 1
            setTextColor(Color.WHITE)
            layoutParams = LinearLayout.LayoutParams(0, -2, 1f)
        })
        bar.addView(TextView(ctx).apply {
            text = "✕"
            textSize = 16f
            setPadding(dp(ctx, 14).toInt(), dp(ctx, 6).toInt(), dp(ctx, 6).toInt(), dp(ctx, 6).toInt())
            setTextColor(Color.WHITE)
            setOnClickListener { dialog.dismiss() }
        })
        root.addView(bar)

        val webHolder = FrameLayout(ctx).apply {
            layoutParams = LinearLayout.LayoutParams(-1, 0, 1f)
            isFocusable = true
            isFocusableInTouchMode = true
        }

        val webView = WebView(ctx).apply {
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
            }
            CookieManager.getInstance().setAcceptCookie(true)
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, true)
            // carry the api cookies so the quiz page knows who we are
            runCatching {
                val cm = CookieManager.getInstance()
                StarkApi.currentToken()?.let { cm.setCookie(StarkApi.baseUrl(), "auth_token=$it") }
                StarkApi.currentSession()?.let { cm.setCookie(StarkApi.baseUrl(), "PHPSESSID=$it") }
                cm.flush()
            }
            webViewClient = object : WebViewClient() {
                override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                    return false
                }
            }
            webChromeClient = WebChromeClient()
            loadUrl(StarkApi.quizUrl(testId, batchId, subjectId, topicId))
        }
        webHolder.addView(webView)

        // virtual cursor for tv remotes - phones never see it
        val isTv = runCatching { Globals.isLayout(TV) }.getOrDefault(false)
        var cursor: View? = null
        if (isTv) {
            val size = dp(ctx, 22).toInt()
            cursor = View(ctx).apply {
                layoutParams = FrameLayout.LayoutParams(size, size)
                background = GradientDrawable().apply {
                    shape = GradientDrawable.OVAL
                    setColor(Color.argb(170, 255, 60, 60))
                    setStroke(dp(ctx, 2).toInt(), Color.WHITE)
                }
                elevation = 999f
            }
            webHolder.addView(cursor)

            val pos = CursorPos()
            fun syncCursor() {
                cursor.translationX = pos.x - size / 2f
                cursor.translationY = pos.y - size / 2f
            }
            webView.post {
                pos.x = webView.width / 2f
                pos.y = webView.height / 2f
                syncCursor()
            }

            val step = dp(ctx, 24)
            webHolder.setOnKeyListener { _, keyCode, event ->
                if (event.action != KeyEvent.ACTION_DOWN) return@setOnKeyListener false
                when (keyCode) {
                    KeyEvent.KEYCODE_DPAD_UP -> {
                        pos.y = (pos.y - step).coerceAtLeast(0f); syncCursor(); true
                    }
                    KeyEvent.KEYCODE_DPAD_DOWN -> {
                        pos.y = (pos.y + step).coerceAtMost(webHolder.height.toFloat()); syncCursor(); true
                    }
                    KeyEvent.KEYCODE_DPAD_LEFT -> {
                        pos.x = (pos.x - step).coerceAtLeast(0f); syncCursor(); true
                    }
                    KeyEvent.KEYCODE_DPAD_RIGHT -> {
                        pos.x = (pos.x + step).coerceAtMost(webHolder.width.toFloat()); syncCursor(); true
                    }
                    KeyEvent.KEYCODE_DPAD_CENTER, KeyEvent.KEYCODE_ENTER -> {
                        val t = SystemClock.uptimeMillis()
                        val down = MotionEvent.obtain(t, t, MotionEvent.ACTION_DOWN, pos.x, pos.y, 0)
                        val up = MotionEvent.obtain(t, t + 120, MotionEvent.ACTION_UP, pos.x, pos.y, 0)
                        runCatching {
                            webView.dispatchTouchEvent(down)
                            webView.dispatchTouchEvent(up)
                        }
                        down.recycle(); up.recycle()
                        true
                    }
                    else -> false
                }
            }
            webHolder.requestFocus()
        }

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
}
