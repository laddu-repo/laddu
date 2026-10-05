package com.justplay

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.graphics.RectF
import android.graphics.Typeface
import android.graphics.drawable.GradientDrawable
import android.view.Gravity
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.animation.DecelerateInterpolator
import android.widget.Button
import android.widget.CompoundButton
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.SwitchCompat
import com.lagradost.cloudstream3.CloudStreamApp
import com.lagradost.cloudstream3.MainActivity

/**
 * JustPlay settings — red & black theme, rebuilt after FLUMMOX's BingeAnime
 * settings: full-screen window, animated vector glyphs, staggered entrances,
 * press-scale feedback with a growing accent underline, themed switches.
 *
 * The main screen is a BIG LIST (full-width tall rows) instead of boxes:
 *   SITES           — enable/disable the 7 source sites
 *   MANAGE SOURCES  — download-only vs stream-only link modes
 */
object JustPlaySettings {

    // ── red & black palette ──
    private const val BG = 0xFF0B0506.toInt()
    private const val SURFACE = 0xFF150F11.toInt()
    private const val SURFACE_2 = 0xFF201518.toInt()
    private const val BORDER = 0xFF2E1C1F.toInt()
    private const val BORDER_HI = 0xFF4A272C.toInt()
    private const val TEXT = 0xFFF8EDEE.toInt()
    private const val SUBTEXT = 0xFF9D8488.toInt()
    private const val RED = 0xFFE53935.toInt()
    private const val RED_BRIGHT = 0xFFFF5A52.toInt()
    private const val RED_DEEP = 0xFF8E1418.toInt()

    private fun dp(ctx: Context, v: Int): Int =
        (v * ctx.resources.displayMetrics.density).toInt()

    private fun shape(
        color: Int, radiusDp: Int, ctx: Context,
        strokeDp: Int = 0, strokeColor: Int = 0
    ): GradientDrawable = GradientDrawable().apply {
        setColor(color)
        cornerRadius = dp(ctx, radiusDp).toFloat()
        if (strokeDp > 0) setStroke(dp(ctx, strokeDp), strokeColor)
    }

    // ── themed switch: red track when on ──
    private fun themedSwitch(ctx: Context): SwitchCompat = SwitchCompat(ctx).apply {
        trackTintList = ColorStateList(
            arrayOf(
                intArrayOf(android.R.attr.state_checked),
                intArrayOf()
            ),
            intArrayOf(RED_DEEP, 0xFF231316.toInt())
        )
        thumbTintList = ColorStateList(
            arrayOf(
                intArrayOf(android.R.attr.state_checked),
                intArrayOf()
            ),
            intArrayOf(RED_BRIGHT, 0xFF6E5A5D.toInt())
        )
    }

    // ── staggered entrance ──
    private fun stagger(v: View, i: Int, base: Long = 60L) {
        v.alpha = 0f
        v.translationY = 30f
        v.animate().alpha(1f).translationY(0f)
            .setStartDelay(base * i).setDuration(400)
            .setInterpolator(DecelerateInterpolator()).start()
    }

    // ── animated vector glyph (custom drawn, pulsing red) ──
    class GlyphView(context: Context, private val kind: String) : View(context) {
        private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = RED_BRIGHT
            style = Paint.Style.STROKE
            strokeCap = Paint.Cap.ROUND
            strokeJoin = Paint.Join.ROUND
        }
        private var pulse = 1f

        init {
            ValueAnimator.ofFloat(0.7f, 1f).apply {
                duration = 2200
                repeatCount = ValueAnimator.INFINITE
                repeatMode = ValueAnimator.REVERSE
                addUpdateListener {
                    pulse = it.animatedValue as Float
                    invalidate()
                }
                start()
            }
        }

        override fun onDraw(canvas: Canvas) {
            super.onDraw(canvas)
            val cx = width / 2f
            val cy = height / 2f
            val r = minOf(width, height) / 3f
            paint.strokeWidth = r * 0.2f
            paint.alpha = (pulse * 255).toInt()
            val fill = Paint(paint).apply { style = Paint.Style.FILL }

            when (kind) {
                // globe: circle + equator + meridian
                "SITES" -> {
                    canvas.drawCircle(cx, cy, r, paint)
                    canvas.drawLine(cx - r, cy, cx + r, cy, paint)
                    val meridian = RectF(cx - r * 0.45f, cy - r, cx + r * 0.45f, cy + r)
                    canvas.drawOval(meridian, paint)
                }
                // sliders: three rails with offset knobs
                "MANAGE" -> {
                    val ys = listOf(cy - r * 0.65f, cy, cy + r * 0.65f)
                    val xs = listOf(cx - r * 0.3f, cx + r * 0.35f, cx - r * 0.05f)
                    for (i in ys.indices) {
                        canvas.drawLine(cx - r, ys[i], cx + r, ys[i], paint)
                        canvas.drawCircle(xs[i], ys[i], r * 0.26f, fill)
                    }
                }
                // play-to-download: play triangle + down arrow
                "DOWNLOAD" -> {
                    val tri = Path()
                    tri.moveTo(cx - r * 0.75f, cy - r * 0.6f)
                    tri.lineTo(cx - r * 0.05f, cy)
                    tri.lineTo(cx - r * 0.75f, cy + r * 0.6f)
                    tri.close()
                    canvas.drawPath(tri, fill)
                    canvas.drawLine(cx + r * 0.25f, cy - r * 0.75f, cx + r * 0.25f, cy + r * 0.35f, paint)
                    val arrow = Path()
                    arrow.moveTo(cx + r * 0.0f, cy + r * 0.1f)
                    arrow.lineTo(cx + r * 0.25f, cy + r * 0.75f)
                    arrow.lineTo(cx + r * 0.5f, cy + r * 0.1f)
                    canvas.drawPath(arrow, paint)
                }
            }
        }
    }

    // ── big list row factory (the list-form replacement of FLUMMOX tiles) ──
    private fun bigListRow(
        ctx: Context,
        glyphKind: String,
        label: String,
        sub: String,
        onClick: () -> Unit
    ): LinearLayout {
        val row = LinearLayout(ctx).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
            background = shape(SURFACE, 18, ctx, 1, BORDER)
            setPadding(dp(ctx, 18), dp(ctx, 20), dp(ctx, 18), dp(ctx, 20))
            isClickable = true
            layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            ).apply { bottomMargin = dp(ctx, 14) }
        }

        // glyph chip
        val chip = FrameLayout(ctx).apply {
            background = shape(SURFACE_2, 16, ctx, 1, BORDER)
        }
        val glyph = GlyphView(ctx, glyphKind)
        chip.addView(glyph, FrameLayout.LayoutParams(dp(ctx, 34), dp(ctx, 34), Gravity.CENTER))
        row.addView(chip, LinearLayout.LayoutParams(dp(ctx, 56), dp(ctx, 56)).apply {
            rightMargin = dp(ctx, 16)
        })

        // text column
        val col = LinearLayout(ctx).apply {
            orientation = LinearLayout.VERTICAL
            layoutParams = LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f)
        }
        col.addView(TextView(ctx).apply {
            text = label
            setTextColor(TEXT); textSize = 18f
            setTypeface(typeface, Typeface.BOLD)
            letterSpacing = 0.04f
        })
        col.addView(TextView(ctx).apply {
            text = sub
            setTextColor(SUBTEXT); textSize = 11.5f
            setPadding(0, dp(ctx, 4), dp(ctx, 8), 0)
        })
        row.addView(col)

        // chevron
        row.addView(TextView(ctx).apply {
            text = "›"
            setTextColor(RED); textSize = 30f
            setTypeface(typeface, Typeface.BOLD)
            gravity = Gravity.CENTER
        })

        // accent underline that grows on press
        val underline = View(ctx).apply {
            background = shape(RED, 2, ctx)
            alpha = 0f
        }
        row.addView(underline, LinearLayout.LayoutParams(
            dp(ctx, 28), dp(ctx, 2)
        ).apply {
            gravity = Gravity.BOTTOM or Gravity.START
            leftMargin = dp(ctx, 18); bottomMargin = dp(ctx, 8)
        })

        // press animation — scale + glyph grow + underline expand
        row.setOnTouchListener { v, e ->
            when (e.action) {
                MotionEvent.ACTION_DOWN -> {
                    v.animate().scaleX(0.97f).scaleY(0.97f).setDuration(90).start()
                    glyph.animate().scaleX(1.08f).scaleY(1.08f).setDuration(140).start()
                    underline.animate().alpha(1f).setDuration(110).start()
                    val lp = underline.layoutParams as LinearLayout.LayoutParams
                    ValueAnimator.ofInt(dp(ctx, 28), dp(ctx, 76)).apply {
                        duration = 180
                        addUpdateListener {
                            lp.width = it.animatedValue as Int
                            underline.layoutParams = lp
                        }
                        start()
                    }
                    true
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    v.animate().scaleX(1f).scaleY(1f).setDuration(150).start()
                    glyph.animate().scaleX(1f).scaleY(1f).setDuration(190).start()
                    underline.animate().alpha(0f).setDuration(190).start()
                    if (e.action == MotionEvent.ACTION_UP) v.performClick()
                    true
                }
                else -> false
            }
        }
        row.setOnClickListener { onClick() }
        return row
    }

    // ── section label block ──
    private fun labelBlock(ctx: Context, title: String, subtitle: String?): LinearLayout =
        LinearLayout(ctx).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(ctx, 4), dp(ctx, 10), dp(ctx, 4), dp(ctx, 6))
            addView(TextView(ctx).apply {
                text = title; setTextColor(TEXT); textSize = 15f
                setTypeface(typeface, Typeface.BOLD)
                letterSpacing = 0.06f
            })
            if (!subtitle.isNullOrBlank()) {
                addView(TextView(ctx).apply {
                    text = subtitle; setTextColor(SUBTEXT); textSize = 11f
                    setPadding(0, dp(ctx, 3), 0, 0)
                })
            }
        }

    // ── generic toggle row (returns the row AND its switch for the bounce-back) ──
    private fun toggleRow(
        ctx: Context,
        label: String,
        desc: String?,
        initial: Boolean,
        onChange: (Boolean) -> Unit
    ): Pair<LinearLayout, SwitchCompat> {
        val row = LinearLayout(ctx).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
            background = shape(SURFACE, 14, ctx, 1, BORDER)
            setPadding(dp(ctx, 16), dp(ctx, 15), dp(ctx, 16), dp(ctx, 15))
            layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT
            ).apply { bottomMargin = dp(ctx, 8) }
        }
        val col = LinearLayout(ctx).apply {
            orientation = LinearLayout.VERTICAL
            layoutParams = LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f)
        }
        col.addView(TextView(ctx).apply {
            text = label; setTextColor(TEXT); textSize = 14f
            setTypeface(typeface, Typeface.BOLD)
        })
        if (!desc.isNullOrBlank()) {
            col.addView(TextView(ctx).apply {
                text = desc; setTextColor(SUBTEXT); textSize = 11f
                setPadding(0, dp(ctx, 3), 0, 0)
            })
        }
        row.addView(col)
        val sw = themedSwitch(ctx)
        sw.isChecked = initial
        sw.setOnCheckedChangeListener { _: CompoundButton, v: Boolean -> onChange(v) }
        row.addView(sw)
        row.setOnClickListener { sw.toggle() }
        return row to sw
    }

    // ── fluid bounce-back: switch returns ON + row shakes + pulse ──
    private fun bounceBackOn(ctx: Context, row: LinearLayout, sw: SwitchCompat) {
        sw.isChecked = true // SwitchCompat animates the thumb sliding back
        ObjectAnimator.ofFloat(row, View.TRANSLATION_X, 0f, -16f, 13f, -8f, 4f, 0f).apply {
            duration = 460
            interpolator = DecelerateInterpolator()
            start()
        }
        row.animate().scaleX(1.02f).scaleY(1.02f).setDuration(120).withEndAction {
            row.animate().scaleX(1f).scaleY(1f).setDuration(210).start()
        }.start()
        Toast.makeText(
            ctx,
            "Both can't be turned off — one source mode has to stay active.",
            Toast.LENGTH_LONG
        ).show()
    }

    // ── sub window (FLUMMOX pattern) ──
    private fun subWindow(
        ctx: Context,
        title: String,
        body: (LinearLayout) -> Unit
    ) {
        val dlg = Dialog(ctx).apply { requestWindowFeature(Window.FEATURE_NO_TITLE) }
        val root = LinearLayout(ctx).apply {
            orientation = LinearLayout.VERTICAL
            background = shape(BG, 0, ctx)
            setPadding(dp(ctx, 20), dp(ctx, 40), dp(ctx, 20), dp(ctx, 20))
        }
        val header = TextView(ctx).apply {
            text = title; setTextColor(TEXT); textSize = 26f
            setTypeface(typeface, Typeface.BOLD); letterSpacing = 0.08f
        }
        root.addView(header)
        val sub = TextView(ctx).apply {
            text = "LADDU REPO · JUSTPLAY"
            setTextColor(SUBTEXT); textSize = 10f
            letterSpacing = 0.22f
            setPadding(0, dp(ctx, 8), 0, dp(ctx, 20))
        }
        root.addView(sub)

        val scroll = ScrollView(ctx)
        val bodyRoot = LinearLayout(ctx).apply { orientation = LinearLayout.VERTICAL }
        scroll.addView(bodyRoot)
        root.addView(scroll, LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f
        ))
        body(bodyRoot)

        val close = Button(ctx).apply {
            text = "CLOSE"; textSize = 13f; letterSpacing = 0.18f
            setTextColor(BG); background = shape(TEXT, 14, ctx)
            isAllCaps = false; setTypeface(typeface, Typeface.BOLD)
            layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, dp(ctx, 52)
            ).apply { topMargin = dp(ctx, 16) }
            setOnClickListener { dlg.dismiss() }
        }
        root.addView(close)

        dlg.setContentView(root)
        dlg.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT
        )
        dlg.window?.setBackgroundDrawable(shape(BG, 0, ctx))
        dlg.setOnShowListener {
            listOf(header, sub, close).forEachIndexed { i, v -> stagger(v, i, 40L) }
            for (i in 0 until bodyRoot.childCount) {
                stagger(bodyRoot.getChildAt(i), i + 1, 45L)
            }
        }
        dlg.show()
    }

    // ── root ──
    fun show(context: Context) {
        var ctx = context
        // unwrap in case a ContextWrapper is handed over
        var p = context
        while (p is android.content.ContextWrapper) {
            if (p is android.app.Activity) { ctx = p; break }
            p = p.baseContext
        }

        val dlg = Dialog(ctx).apply { requestWindowFeature(Window.FEATURE_NO_TITLE) }
        val root = LinearLayout(ctx).apply {
            orientation = LinearLayout.VERTICAL
            background = shape(BG, 0, ctx)
            setPadding(dp(ctx, 20), dp(ctx, 40), dp(ctx, 20), dp(ctx, 20))
        }

        val title = TextView(ctx).apply {
            text = "JUSTPLAY"
            setTextColor(TEXT); textSize = 34f
            setTypeface(typeface, Typeface.BOLD)
            letterSpacing = 0.06f
        }
        root.addView(title)

        val subtitle = TextView(ctx).apply {
            text = "LADDU REPO · EXTENSION"
            setTextColor(SUBTEXT); textSize = 10f
            letterSpacing = 0.22f
            setPadding(0, dp(ctx, 8), 0, dp(ctx, 28))
        }
        root.addView(subtitle)

        val sitesRow = bigListRow(
            ctx, "SITES", "SITES",
            "7 sources · NetNaija, VegaMovies, HDHub4u…"
        ) { openSites(ctx) }
        root.addView(sitesRow)

        val manageRow = bigListRow(
            ctx, "MANAGE", "MANAGE SOURCES",
            "Download-only & stream-only link modes"
        ) { openManageSources(ctx) }
        root.addView(manageRow)

        root.addView(View(ctx), LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f
        ))

        val close = Button(ctx).apply {
            text = "CLOSE"; textSize = 13f; letterSpacing = 0.18f
            setTextColor(BG)
            background = GradientDrawable().apply {
                orientation = GradientDrawable.Orientation.LEFT_RIGHT
                colors = intArrayOf(RED_BRIGHT, RED_DEEP)
                cornerRadius = dp(ctx, 14).toFloat()
            }
            isAllCaps = false; setTypeface(typeface, Typeface.BOLD)
            layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, dp(ctx, 52)
            ).apply { topMargin = dp(ctx, 24) }
            setOnClickListener { dlg.dismiss() }
        }
        root.addView(close)

        dlg.setContentView(root)
        dlg.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT
        )
        dlg.window?.setBackgroundDrawable(shape(BG, 0, ctx))

        dlg.setOnShowListener {
            listOf(title, subtitle, sitesRow, manageRow, close)
                .forEachIndexed { i, v -> stagger(v, i) }
        }
        dlg.show()
    }

    // ── SITES window ──
    private fun openSites(ctx: Context) {
        subWindow(ctx, "SITES") { body ->
            body.addView(labelBlock(ctx, "Source sites",
                "Toggle the sites JustPlay pulls links from"))

            val switches = HashMap<String, SwitchCompat>()
            JustPlay.sites.forEach { site ->
                val (row, sw) = toggleRow(ctx, site.label, site.sub,
                    JustPlay.siteEnabled(site.id)) { }
                switches[site.id] = sw
                body.addView(row)
            }

            // ENABLE ALL row
            body.addView(actionRow(ctx, "Enable all",
                "Turn every site back on", "ENABLE ALL") {
                switches.values.forEach { it.isChecked = true }
                Toast.makeText(ctx, "All sources enabled", Toast.LENGTH_SHORT).show()
            })

            // SAVE & RESTART
            val save = Button(ctx).apply {
                text = "SAVE & RESTART"; textSize = 15f
                setTextColor(Color.WHITE); setTypeface(typeface, Typeface.BOLD)
                letterSpacing = 0.03f
                stateListAnimator = null
                isAllCaps = false
                background = GradientDrawable().apply {
                    orientation = GradientDrawable.Orientation.LEFT_RIGHT
                    colors = intArrayOf(RED_BRIGHT, RED_DEEP)
                    cornerRadius = dp(ctx, 16).toFloat()
                }
                layoutParams = LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT
                ).apply { topMargin = dp(ctx, 12) }
                setPadding(0, dp(ctx, 15), 0, dp(ctx, 15))
                setOnClickListener {
                    JustPlay.sites.forEach { site ->
                        try {
                            CloudStreamApp.setKey(
                                "JUSTPLAY_SITE_${site.id}",
                                switches[site.id]?.isChecked ?: true
                            )
                        } catch (_: Exception) {}
                    }
                    AlertDialog.Builder(ctx)
                        .setTitle("Restart Required")
                        .setMessage("Sources saved. Restart CloudStream now to apply them?")
                        .setPositiveButton("Restart") { _, _ -> restartApp(ctx) }
                        .setNegativeButton("Later") { _, _ ->
                            try {
                                MainActivity.reloadHomeEvent.invoke(true)
                            } catch (_: Throwable) {}
                        }
                        .show()
                }
            }
            body.addView(save)

            body.addView(TextView(ctx).apply {
                text = "Changes apply after the app restarts"
                textSize = 11f; setTextColor(SUBTEXT); gravity = Gravity.CENTER
                setPadding(0, dp(ctx, 10), 0, 0)
            })
        }
    }

    // ── MANAGE SOURCES window ──
    private fun openManageSources(ctx: Context) {
        subWindow(ctx, "MANAGE SOURCES") { body ->
            body.addView(labelBlock(ctx, "Link modes",
                "Choose which links load in the player. One mode is always active."))

            // refs resolved after the rows exist, so the change handlers can
            // reach the sibling switch/row without self-capture
            var dlSwitch: SwitchCompat? = null
            var streamSwitch: SwitchCompat? = null
            var downloadRow: LinearLayout? = null
            var streamRow: LinearLayout? = null
            var guard = false // suppress re-entrant listener events

            fun dlChanged(checked: Boolean) {
                if (guard) return
                if (!checked) {
                    if (streamSwitch?.isChecked != true) {
                        val row = downloadRow ?: return
                        val sw = dlSwitch ?: return
                        guard = true
                        bounceBackOn(ctx, row, sw)
                        guard = false
                        return
                    }
                    // stream mode is on, so download-only may go off
                    JustPlay.setDownloadOnly(false)
                    return
                }
                // download-only wins -> stream-only flips off automatically
                guard = true
                streamSwitch?.isChecked = false
                guard = false
                JustPlay.setDownloadOnly(true)
                JustPlay.setStreamOnly(false)
            }

            fun streamChanged(checked: Boolean) {
                if (guard) return
                if (!checked) {
                    if (dlSwitch?.isChecked != true) {
                        val row = streamRow ?: return
                        val sw = streamSwitch ?: return
                        guard = true
                        bounceBackOn(ctx, row, sw)
                        guard = false
                        return
                    }
                    JustPlay.setStreamOnly(false)
                    return
                }
                guard = true
                dlSwitch?.isChecked = false
                guard = false
                JustPlay.setStreamOnly(true)
                JustPlay.setDownloadOnly(false)
            }

            // Download-only row (OFF by default)
            val (rowDl, swDl) = toggleRow(
                ctx,
                "Download Only Sources",
                "Only download-type links load — 10Gbps, GDflix Instant Download, " +
                    "Instant Download, Download. Everything else stays hidden, and " +
                    "the download links are tagged (DOWNLOAD ONLY).",
                JustPlay.downloadOnlyEnabled(),
                ::dlChanged
            )
            dlSwitch = swDl
            downloadRow = rowDl
            body.addView(rowDl)

            // Stream-only row (ON by default)
            val (rowSt, swSt) = toggleRow(
                ctx,
                "Stream Only Sources",
                "Only streamable links load. Download-type links never appear " +
                    "in the player at all.",
                JustPlay.streamOnlyEnabled(),
                ::streamChanged
            )
            streamSwitch = swSt
            streamRow = rowSt
            body.addView(rowSt)

            // info block: which names count as download-only
            body.addView(labelBlock(ctx, "Counted as download-only",
                "Matched by name on every link before it reaches the player"))
            body.addView(infoRow(ctx, "10Gbps",
                "Hub-Cloud & V-Drive fast download workers"))
            body.addView(infoRow(ctx, "GDflix Instant Download",
                "GDFlix instant-download server"))
            body.addView(infoRow(ctx, "Instant Download",
                "Hub-Cloud instant links"))
            body.addView(infoRow(ctx, "Download",
                "Download File and every other download-named link"))

            body.addView(TextView(ctx).apply {
                text = "Applies instantly — no restart needed"
                textSize = 11f; setTextColor(SUBTEXT); gravity = Gravity.CENTER
                setPadding(0, dp(ctx, 12), 0, 0)
            })
        }
    }

    private fun infoRow(ctx: Context, title: String, desc: String): LinearLayout =
        LinearLayout(ctx).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
            background = shape(SURFACE_2, 12, ctx, 1, BORDER)
            setPadding(dp(ctx, 14), dp(ctx, 11), dp(ctx, 14), dp(ctx, 11))
            layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT
            ).apply { bottomMargin = dp(ctx, 6) }
            addView(TextView(ctx).apply {
                text = "•"; setTextColor(RED); textSize = 16f
                setTypeface(typeface, Typeface.BOLD)
                layoutParams = LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT
                ).apply { rightMargin = dp(ctx, 10) }
            })
            val col = LinearLayout(ctx).apply {
                orientation = LinearLayout.VERTICAL
                layoutParams = LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f)
            }
            col.addView(TextView(ctx).apply {
                text = title; setTextColor(TEXT); textSize = 13f
                setTypeface(typeface, Typeface.BOLD)
            })
            col.addView(TextView(ctx).apply {
                text = desc; setTextColor(SUBTEXT); textSize = 10.5f
                setPadding(0, dp(ctx, 2), 0, 0)
            })
            addView(col)
        }

    private fun actionRow(
        ctx: Context, label: String, desc: String?,
        btnText: String, onClick: () -> Unit
    ): LinearLayout {
        val row = LinearLayout(ctx).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
            background = shape(SURFACE, 12, ctx, 1, BORDER)
            setPadding(dp(ctx, 16), dp(ctx, 14), dp(ctx, 16), dp(ctx, 14))
            layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT
            ).apply { bottomMargin = dp(ctx, 8); topMargin = dp(ctx, 4) }
        }
        val col = LinearLayout(ctx).apply {
            orientation = LinearLayout.VERTICAL
            layoutParams = LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f)
        }
        col.addView(TextView(ctx).apply {
            text = label; setTextColor(TEXT); textSize = 14f
            setTypeface(typeface, Typeface.BOLD)
        })
        if (!desc.isNullOrBlank()) {
            col.addView(TextView(ctx).apply {
                text = desc; setTextColor(SUBTEXT); textSize = 11f
                setPadding(0, dp(ctx, 3), 0, 0)
            })
        }
        row.addView(col)
        row.addView(Button(ctx).apply {
            text = btnText; textSize = 12f
            setTextColor(RED_BRIGHT)
            background = shape(SURFACE_2, 16, ctx, 1, BORDER_HI)
            isAllCaps = false; setTypeface(typeface, Typeface.BOLD)
            setPadding(dp(ctx, 14), dp(ctx, 8), dp(ctx, 14), dp(ctx, 8))
            minHeight = 0; minWidth = 0
            setOnClickListener { onClick() }
        })
        return row
    }

    private fun restartApp(ctx: Context) {
        try {
            val context = ctx.applicationContext
            val pm = context.packageManager
            val intent = pm.getLaunchIntentForPackage(context.packageName)
            val componentName = intent?.component
            if (componentName != null) {
                val restartIntent = Intent.makeRestartActivityTask(componentName)
                context.startActivity(restartIntent)
                Runtime.getRuntime().exit(0)
            }
        } catch (_: Throwable) {}
    }
}
