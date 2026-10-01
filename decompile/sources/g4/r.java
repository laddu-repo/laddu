package g4;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.ui.DefaultTimeBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c2.l1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import t1.y0;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r extends FrameLayout {
    public static final float[] T0;
    public final m A;
    public final String A0;
    public final j B;
    public final String B0;
    public final f C;
    public t1.n0 C0;
    public final f D;
    public h D0;
    public final s5.c E;
    public boolean E0;
    public final PopupWindow F;
    public boolean F0;
    public final int G;
    public boolean G0;
    public final View H;
    public boolean H0;
    public final View I;
    public boolean I0;
    public final View J;
    public boolean J0;
    public final View K;
    public int K0;
    public final View L;
    public int L0;
    public final TextView M;
    public int M0;
    public final TextView N;
    public long[] N0;
    public final ImageView O;
    public boolean[] O0;
    public final ImageView P;
    public final long[] P0;
    public final View Q;
    public final boolean[] Q0;
    public final ImageView R;
    public long R0;
    public final ImageView S;
    public boolean S0;
    public final ImageView T;
    public final View U;
    public final View V;
    public final View W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final TextView f5561a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final TextView f5562b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final s0 f5563c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final StringBuilder f5564d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Formatter f5565e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final t1.q0 f5566f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final t1.r0 f5567g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final androidx.emoji2.text.v f5568h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final Drawable f5569i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final Drawable f5570j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Drawable f5571k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final String f5572l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final String f5573m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final String f5574n0;
    public final Drawable o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Drawable f5575p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final float f5576q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final float f5577r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f5578s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f5579t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Drawable f5580u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final w f5581v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Drawable f5582v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Resources f5583w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final String f5584w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g f5585x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final String f5586x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CopyOnWriteArrayList f5587y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final Drawable f5588y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final RecyclerView f5589z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final Drawable f5590z0;

    static {
        t1.a0.a("media3.ui");
        T0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public r(Context context, AttributeSet attributeSet) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        ImageView imageView;
        g gVar;
        boolean z18;
        boolean z19;
        Typeface typefaceB;
        super(context, null, 0);
        int resourceId = i0.exo_player_control_view;
        this.H0 = true;
        this.K0 = 5000;
        this.M0 = 0;
        this.L0 = 200;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, m0.PlayerControlView, 0, 0);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(m0.PlayerControlView_controller_layout_id, resourceId);
                this.K0 = typedArrayObtainStyledAttributes.getInt(m0.PlayerControlView_show_timeout, this.K0);
                this.M0 = typedArrayObtainStyledAttributes.getInt(m0.PlayerControlView_repeat_toggle_modes, this.M0);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(m0.PlayerControlView_show_rewind_button, true);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(m0.PlayerControlView_show_fastforward_button, true);
                boolean z22 = typedArrayObtainStyledAttributes.getBoolean(m0.PlayerControlView_show_previous_button, true);
                boolean z23 = typedArrayObtainStyledAttributes.getBoolean(m0.PlayerControlView_show_next_button, true);
                boolean z24 = typedArrayObtainStyledAttributes.getBoolean(m0.PlayerControlView_show_shuffle_button, false);
                boolean z25 = typedArrayObtainStyledAttributes.getBoolean(m0.PlayerControlView_show_subtitle_button, false);
                boolean z26 = typedArrayObtainStyledAttributes.getBoolean(m0.PlayerControlView_show_vr_button, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(m0.PlayerControlView_time_bar_min_update_interval, this.L0));
                boolean z27 = typedArrayObtainStyledAttributes.getBoolean(m0.PlayerControlView_animation_enabled, true);
                typedArrayObtainStyledAttributes.recycle();
                z16 = z27;
                z2 = z24;
                z12 = z20;
                z13 = z21;
                z10 = z25;
                z11 = z26;
                z14 = z22;
                z15 = z23;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z2 = false;
            z10 = false;
            z11 = false;
            z12 = true;
            z13 = true;
            z14 = true;
            z15 = true;
            z16 = true;
        }
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        g gVar2 = new g(this);
        this.f5585x = gVar2;
        this.f5587y = new CopyOnWriteArrayList();
        this.f5566f0 = new t1.q0();
        this.f5567g0 = new t1.r0();
        StringBuilder sb2 = new StringBuilder();
        this.f5564d0 = sb2;
        this.f5565e0 = new Formatter(sb2, Locale.getDefault());
        this.N0 = new long[0];
        this.O0 = new boolean[0];
        this.P0 = new long[0];
        this.Q0 = new boolean[0];
        this.f5568h0 = new androidx.emoji2.text.v(14, this);
        this.f5561a0 = (TextView) findViewById(g0.exo_duration);
        this.f5562b0 = (TextView) findViewById(g0.exo_position);
        ImageView imageView2 = (ImageView) findViewById(g0.exo_subtitle);
        this.R = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(gVar2);
        }
        ImageView imageView3 = (ImageView) findViewById(g0.exo_fullscreen);
        this.S = imageView3;
        com.google.android.material.datepicker.n nVar = new com.google.android.material.datepicker.n(1, this);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(nVar);
        }
        ImageView imageView4 = (ImageView) findViewById(g0.exo_minimal_fullscreen);
        this.T = imageView4;
        com.google.android.material.datepicker.n nVar2 = new com.google.android.material.datepicker.n(1, this);
        if (imageView4 != null) {
            imageView4.setVisibility(8);
            imageView4.setOnClickListener(nVar2);
        }
        View viewFindViewById = findViewById(g0.exo_settings);
        this.U = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(gVar2);
        }
        View viewFindViewById2 = findViewById(g0.exo_playback_speed);
        this.V = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(gVar2);
        }
        View viewFindViewById3 = findViewById(g0.exo_audio_track);
        this.W = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(gVar2);
        }
        s0 s0Var = (s0) findViewById(g0.exo_progress);
        View viewFindViewById4 = findViewById(g0.exo_progress_placeholder);
        if (s0Var != null) {
            this.f5563c0 = s0Var;
            z17 = z2;
        } else if (viewFindViewById4 != null) {
            z17 = z2;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, attributeSet, l0.ExoStyledControls_TimeBar);
            defaultTimeBar.setId(g0.exo_progress);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.f5563c0 = defaultTimeBar;
        } else {
            z17 = z2;
            this.f5563c0 = null;
        }
        s0 s0Var2 = this.f5563c0;
        if (s0Var2 != null) {
            ((DefaultTimeBar) s0Var2).S.add(gVar2);
        }
        View viewFindViewById5 = findViewById(g0.exo_play_pause);
        this.J = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(gVar2);
        }
        View viewFindViewById6 = findViewById(g0.exo_prev);
        this.H = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(gVar2);
        }
        View viewFindViewById7 = findViewById(g0.exo_next);
        this.I = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(gVar2);
        }
        int i = f0.roboto_medium_numbers;
        ThreadLocal threadLocal = k0.k.f7244a;
        if (context.isRestricted()) {
            z18 = z10;
            z19 = z11;
            imageView = imageView2;
            gVar = gVar2;
            typefaceB = null;
        } else {
            imageView = imageView2;
            gVar = gVar2;
            z18 = z10;
            z19 = z11;
            typefaceB = k0.k.b(context, i, new TypedValue(), 0, null, false, false);
        }
        View viewFindViewById8 = findViewById(g0.exo_rew);
        TextView textView = viewFindViewById8 == null ? (TextView) findViewById(g0.exo_rew_with_amount) : null;
        this.N = textView;
        if (textView != null) {
            textView.setTypeface(typefaceB);
        }
        viewFindViewById8 = viewFindViewById8 == null ? textView : viewFindViewById8;
        this.L = viewFindViewById8;
        if (viewFindViewById8 != null) {
            viewFindViewById8.setOnClickListener(gVar);
        }
        View viewFindViewById9 = findViewById(g0.exo_ffwd);
        TextView textView2 = viewFindViewById9 == null ? (TextView) findViewById(g0.exo_ffwd_with_amount) : null;
        this.M = textView2;
        if (textView2 != null) {
            textView2.setTypeface(typefaceB);
        }
        viewFindViewById9 = viewFindViewById9 == null ? textView2 : viewFindViewById9;
        this.K = viewFindViewById9;
        if (viewFindViewById9 != null) {
            viewFindViewById9.setOnClickListener(gVar);
        }
        ImageView imageView5 = (ImageView) findViewById(g0.exo_repeat_toggle);
        this.O = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(gVar);
        }
        ImageView imageView6 = (ImageView) findViewById(g0.exo_shuffle);
        this.P = imageView6;
        if (imageView6 != null) {
            imageView6.setOnClickListener(gVar);
        }
        Resources resources = context.getResources();
        this.f5583w = resources;
        this.f5576q0 = resources.getInteger(h0.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f5577r0 = resources.getInteger(h0.exo_media_button_opacity_percentage_disabled) / 100.0f;
        View viewFindViewById10 = findViewById(g0.exo_vr);
        this.Q = viewFindViewById10;
        if (viewFindViewById10 != null) {
            k(viewFindViewById10, false);
        }
        w wVar = new w(this);
        this.f5581v = wVar;
        wVar.C = z16;
        m mVar = new m(this, new String[]{resources.getString(k0.exo_controls_playback_speed), resources.getString(k0.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(e0.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(e0.exo_styled_controls_audiotrack, context.getTheme())});
        this.A = mVar;
        this.G = resources.getDimensionPixelSize(d0.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(i0.exo_styled_settings_list, (ViewGroup) null);
        this.f5589z = recyclerView;
        recyclerView.setAdapter(mVar);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.F = popupWindow;
        if (w1.b0.f13686a < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(gVar);
        this.S0 = true;
        this.E = new s5.c(getResources());
        this.f5580u0 = resources.getDrawable(e0.exo_styled_controls_subtitle_on, context.getTheme());
        this.f5582v0 = resources.getDrawable(e0.exo_styled_controls_subtitle_off, context.getTheme());
        this.f5584w0 = resources.getString(k0.exo_controls_cc_enabled_description);
        this.f5586x0 = resources.getString(k0.exo_controls_cc_disabled_description);
        this.C = new f(this, 1);
        this.D = new f(this, 0);
        this.B = new j(this, resources.getStringArray(b0.exo_controls_playback_speeds), T0);
        this.f5588y0 = resources.getDrawable(e0.exo_styled_controls_fullscreen_exit, context.getTheme());
        this.f5590z0 = resources.getDrawable(e0.exo_styled_controls_fullscreen_enter, context.getTheme());
        this.f5569i0 = resources.getDrawable(e0.exo_styled_controls_repeat_off, context.getTheme());
        this.f5570j0 = resources.getDrawable(e0.exo_styled_controls_repeat_one, context.getTheme());
        this.f5571k0 = resources.getDrawable(e0.exo_styled_controls_repeat_all, context.getTheme());
        this.o0 = resources.getDrawable(e0.exo_styled_controls_shuffle_on, context.getTheme());
        this.f5575p0 = resources.getDrawable(e0.exo_styled_controls_shuffle_off, context.getTheme());
        this.A0 = resources.getString(k0.exo_controls_fullscreen_exit_description);
        this.B0 = resources.getString(k0.exo_controls_fullscreen_enter_description);
        this.f5572l0 = resources.getString(k0.exo_controls_repeat_off_description);
        this.f5573m0 = resources.getString(k0.exo_controls_repeat_one_description);
        this.f5574n0 = resources.getString(k0.exo_controls_repeat_all_description);
        this.f5578s0 = resources.getString(k0.exo_controls_shuffle_on_description);
        this.f5579t0 = resources.getString(k0.exo_controls_shuffle_off_description);
        wVar.h((ViewGroup) findViewById(g0.exo_bottom_bar), true);
        wVar.h(viewFindViewById9, z13);
        wVar.h(viewFindViewById8, z12);
        wVar.h(viewFindViewById6, z14);
        wVar.h(viewFindViewById7, z15);
        wVar.h(imageView6, z17);
        wVar.h(imageView, z18);
        wVar.h(viewFindViewById10, z19);
        wVar.h(imageView5, this.M0 != 0);
        addOnLayoutChangeListener(new e(0, this));
    }

    public static void a(r rVar) {
        String str = rVar.B0;
        Drawable drawable = rVar.f5590z0;
        String str2 = rVar.A0;
        Drawable drawable2 = rVar.f5588y0;
        if (rVar.D0 == null) {
            return;
        }
        boolean z2 = rVar.E0;
        rVar.E0 = !z2;
        ImageView imageView = rVar.S;
        if (imageView != null) {
            if (z2) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            }
        }
        ImageView imageView2 = rVar.T;
        boolean z10 = rVar.E0;
        if (imageView2 == null) {
            return;
        }
        if (z10) {
            imageView2.setImageDrawable(drawable2);
            imageView2.setContentDescription(str2);
        } else {
            imageView2.setImageDrawable(drawable);
            imageView2.setContentDescription(str);
        }
    }

    public static boolean c(t1.n0 n0Var, t1.r0 r0Var) {
        t1.s0 s0VarN;
        int iO;
        c3.e eVar = (c3.e) n0Var;
        if (!eVar.n(17) || (iO = (s0VarN = ((c2.j0) eVar).N()).o()) <= 1 || iO > 100) {
            return false;
        }
        for (int i = 0; i < iO; i++) {
            if (s0VarN.m(i, r0Var, 0L).f12105m == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        t1.n0 n0Var = this.C0;
        if (n0Var == null || !((c3.e) n0Var).n(13)) {
            return;
        }
        c2.j0 j0Var = (c2.j0) this.C0;
        j0Var.q0();
        t1.i0 i0Var = new t1.i0(f, j0Var.E0.f1852o.f12005b);
        j0Var.q0();
        if (j0Var.E0.f1852o.equals(i0Var)) {
            return;
        }
        l1 l1VarG = j0Var.E0.g(i0Var);
        j0Var.f1783e0++;
        j0Var.H.C.a(4, i0Var).b();
        j0Var.o0(l1VarG, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.view.KeyEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getKeyCode()
            t1.n0 r1 = r12.C0
            if (r1 == 0) goto Lc4
            r2 = 88
            r3 = 87
            r4 = 127(0x7f, float:1.78E-43)
            r5 = 126(0x7e, float:1.77E-43)
            r6 = 79
            r7 = 85
            r8 = 89
            r9 = 90
            if (r0 == r9) goto L28
            if (r0 == r8) goto L28
            if (r0 == r7) goto L28
            if (r0 == r6) goto L28
            if (r0 == r5) goto L28
            if (r0 == r4) goto L28
            if (r0 == r3) goto L28
            if (r0 != r2) goto Lc4
        L28:
            int r10 = r13.getAction()
            r11 = 1
            if (r10 != 0) goto Lc3
            if (r0 != r9) goto L52
            r13 = r1
            c2.j0 r13 = (c2.j0) r13
            int r13 = r13.S()
            r0 = 4
            if (r13 == r0) goto Lc3
            c3.e r1 = (c3.e) r1
            r13 = 12
            boolean r0 = r1.n(r13)
            if (r0 == 0) goto Lc3
            r0 = r1
            c2.j0 r0 = (c2.j0) r0
            r0.q0()
            long r2 = r0.S
            r1.A(r13, r2)
            goto Lc3
        L52:
            if (r0 != r8) goto L6c
            r8 = r1
            c3.e r8 = (c3.e) r8
            r9 = 11
            boolean r10 = r8.n(r9)
            if (r10 == 0) goto L6c
            r13 = r8
            c2.j0 r13 = (c2.j0) r13
            r13.q0()
            long r0 = r13.R
            long r0 = -r0
            r8.A(r9, r0)
            goto Lc3
        L6c:
            int r13 = r13.getRepeatCount()
            if (r13 != 0) goto Lc3
            if (r0 == r6) goto Lac
            if (r0 == r7) goto Lac
            if (r0 == r3) goto L9e
            if (r0 == r2) goto L91
            if (r0 == r5) goto L8d
            if (r0 == r4) goto L7f
            goto Lc3
        L7f:
            int r13 = w1.b0.f13686a
            c3.e r1 = (c3.e) r1
            boolean r13 = r1.n(r11)
            if (r13 == 0) goto Lc3
            r1.w()
            goto Lc3
        L8d:
            w1.b0.E(r1)
            goto Lc3
        L91:
            c3.e r1 = (c3.e) r1
            r13 = 7
            boolean r13 = r1.n(r13)
            if (r13 == 0) goto Lc3
            r1.B()
            goto Lc3
        L9e:
            c3.e r1 = (c3.e) r1
            r13 = 9
            boolean r13 = r1.n(r13)
            if (r13 == 0) goto Lc3
            r1.z()
            goto Lc3
        Lac:
            boolean r13 = r12.H0
            boolean r13 = w1.b0.W(r1, r13)
            if (r13 == 0) goto Lb8
            w1.b0.E(r1)
            goto Lc3
        Lb8:
            c3.e r1 = (c3.e) r1
            boolean r13 = r1.n(r11)
            if (r13 == 0) goto Lc3
            r1.w()
        Lc3:
            return r11
        Lc4:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.r.d(android.view.KeyEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return d(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e(o4.b0 b0Var, View view) {
        this.f5589z.setAdapter(b0Var);
        q();
        this.S0 = false;
        PopupWindow popupWindow = this.F;
        popupWindow.dismiss();
        this.S0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.G;
        popupWindow.showAsDropDown(view, width - i, (-popupWindow.getHeight()) - i);
    }

    public final z0 f(t1.z0 z0Var, int i) {
        y9.p.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        y9.f0 f0Var = z0Var.f12184a;
        int i10 = 0;
        for (int i11 = 0; i11 < f0Var.size(); i11++) {
            y0 y0Var = (y0) f0Var.get(i11);
            if (y0Var.f12174b.f12113c == i) {
                for (int i12 = 0; i12 < y0Var.f12173a; i12++) {
                    if (y0Var.f12176d[i12] == 4) {
                        t1.o oVar = y0Var.f12174b.f12114d[i12];
                        if ((oVar.f12054e & 2) == 0) {
                            o oVar2 = new o(z0Var, i11, i12, this.E.C(oVar));
                            int i13 = i10 + 1;
                            int iF = y9.z.f(objArrCopyOf.length, i13);
                            if (iF > objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iF);
                            }
                            objArrCopyOf[i10] = oVar2;
                            i10 = i13;
                        }
                    }
                }
            }
        }
        return y9.f0.i(i10, objArrCopyOf);
    }

    public final void g() {
        w wVar = this.f5581v;
        int i = wVar.f5625z;
        if (i == 3 || i == 2) {
            return;
        }
        wVar.f();
        if (!wVar.C) {
            wVar.i(2);
        } else if (wVar.f5625z == 1) {
            wVar.f5612m.start();
        } else {
            wVar.f5613n.start();
        }
    }

    public t1.n0 getPlayer() {
        return this.C0;
    }

    public int getRepeatToggleModes() {
        return this.M0;
    }

    public boolean getShowShuffleButton() {
        return this.f5581v.b(this.P);
    }

    public boolean getShowSubtitleButton() {
        return this.f5581v.b(this.R);
    }

    public int getShowTimeoutMs() {
        return this.K0;
    }

    public boolean getShowVrButton() {
        return this.f5581v.b(this.Q);
    }

    public final boolean h() {
        w wVar = this.f5581v;
        return wVar.f5625z == 0 && wVar.f5602a.i();
    }

    public final boolean i() {
        return getVisibility() == 0;
    }

    public final void j() {
        m();
        l();
        p();
        r();
        t();
        n();
        s();
    }

    public final void k(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.f5576q0 : this.f5577r0);
    }

    public final void l() {
        boolean zN;
        boolean zN2;
        boolean zN3;
        boolean zN4;
        boolean zN5;
        long j8;
        long j9;
        if (i() && this.F0) {
            t1.n0 n0Var = this.C0;
            if (n0Var != null) {
                zN2 = (this.G0 && c(n0Var, this.f5567g0)) ? ((c3.e) n0Var).n(10) : ((c3.e) n0Var).n(5);
                c3.e eVar = (c3.e) n0Var;
                zN3 = eVar.n(7);
                zN4 = eVar.n(11);
                zN5 = eVar.n(12);
                zN = eVar.n(9);
            } else {
                zN = false;
                zN2 = false;
                zN3 = false;
                zN4 = false;
                zN5 = false;
            }
            Resources resources = this.f5583w;
            View view = this.L;
            if (zN4) {
                t1.n0 n0Var2 = this.C0;
                if (n0Var2 != null) {
                    c2.j0 j0Var = (c2.j0) n0Var2;
                    j0Var.q0();
                    j9 = j0Var.R;
                } else {
                    j9 = 5000;
                }
                int i = (int) (j9 / 1000);
                TextView textView = this.N;
                if (textView != null) {
                    textView.setText(String.valueOf(i));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(j0.exo_controls_rewind_by_amount_description, i, Integer.valueOf(i)));
                }
            }
            View view2 = this.K;
            if (zN5) {
                t1.n0 n0Var3 = this.C0;
                if (n0Var3 != null) {
                    c2.j0 j0Var2 = (c2.j0) n0Var3;
                    j0Var2.q0();
                    j8 = j0Var2.S;
                } else {
                    j8 = 15000;
                }
                int i10 = (int) (j8 / 1000);
                TextView textView2 = this.M;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(i10));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(j0.exo_controls_fastforward_by_amount_description, i10, Integer.valueOf(i10)));
                }
            }
            k(this.H, zN3);
            k(view, zN4);
            k(view2, zN5);
            k(this.I, zN);
            s0 s0Var = this.f5563c0;
            if (s0Var != null) {
                s0Var.setEnabled(zN2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            r6 = this;
            boolean r0 = r6.i()
            if (r0 == 0) goto L6c
            boolean r0 = r6.F0
            if (r0 != 0) goto Lb
            goto L6c
        Lb:
            android.view.View r0 = r6.J
            if (r0 == 0) goto L6c
            t1.n0 r1 = r6.C0
            boolean r2 = r6.H0
            boolean r1 = w1.b0.W(r1, r2)
            if (r1 == 0) goto L1c
            int r2 = g4.e0.exo_styled_controls_play
            goto L1e
        L1c:
            int r2 = g4.e0.exo_styled_controls_pause
        L1e:
            if (r1 == 0) goto L23
            int r1 = g4.k0.exo_controls_play_description
            goto L25
        L23:
            int r1 = g4.k0.exo_controls_pause_description
        L25:
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.content.Context r4 = r6.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            android.content.res.Resources r5 = r6.f5583w
            android.graphics.drawable.Drawable r2 = r5.getDrawable(r2, r4)
            r3.setImageDrawable(r2)
            java.lang.String r1 = r5.getString(r1)
            r0.setContentDescription(r1)
            t1.n0 r1 = r6.C0
            if (r1 == 0) goto L68
            c3.e r1 = (c3.e) r1
            r2 = 1
            boolean r1 = r1.n(r2)
            if (r1 == 0) goto L68
            t1.n0 r1 = r6.C0
            r3 = 17
            c3.e r1 = (c3.e) r1
            boolean r1 = r1.n(r3)
            if (r1 == 0) goto L69
            t1.n0 r1 = r6.C0
            c2.j0 r1 = (c2.j0) r1
            t1.s0 r1 = r1.N()
            boolean r1 = r1.p()
            if (r1 != 0) goto L68
            goto L69
        L68:
            r2 = 0
        L69:
            r6.k(r0, r2)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.r.m():void");
    }

    public final void n() {
        j jVar;
        t1.n0 n0Var = this.C0;
        if (n0Var == null) {
            return;
        }
        c2.j0 j0Var = (c2.j0) n0Var;
        j0Var.q0();
        float f = j0Var.E0.f1852o.f12004a;
        float f4 = Float.MAX_VALUE;
        int i = 0;
        int i10 = 0;
        while (true) {
            jVar = this.B;
            float[] fArr = jVar.f5510e;
            if (i >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f - fArr[i]);
            if (fAbs < f4) {
                i10 = i;
                f4 = fAbs;
            }
            i++;
        }
        jVar.f = i10;
        String str = jVar.f5509d[i10];
        m mVar = this.A;
        ((String[]) mVar.f)[0] = str;
        k(this.U, mVar.g(1) || mVar.g(0));
    }

    public final void o() {
        long j8;
        long jY;
        if (i() && this.F0) {
            t1.n0 n0Var = this.C0;
            long j9 = 0;
            if (n0Var == null || !((c3.e) n0Var).n(16)) {
                j8 = 0;
            } else {
                long j10 = this.R0;
                c2.j0 j0Var = (c2.j0) n0Var;
                j0Var.q0();
                long jH = j0Var.H(j0Var.E0) + j10;
                long j11 = this.R0;
                j0Var.q0();
                if (j0Var.E0.f1840a.p()) {
                    jY = j0Var.G0;
                } else {
                    l1 l1Var = j0Var.E0;
                    if (l1Var.f1848k.f9407d != l1Var.f1841b.f9407d) {
                        jY = w1.b0.Y(l1Var.f1840a.m(j0Var.K(), (t1.r0) j0Var.f2053w, 0L).f12105m);
                    } else {
                        long j12 = l1Var.f1854q;
                        if (j0Var.E0.f1848k.b()) {
                            l1 l1Var2 = j0Var.E0;
                            l1Var2.f1840a.g(l1Var2.f1848k.f9404a, j0Var.K).d(j0Var.E0.f1848k.f9405b);
                        } else {
                            j9 = j12;
                        }
                        l1 l1Var3 = j0Var.E0;
                        t1.s0 s0Var = l1Var3.f1840a;
                        Object obj = l1Var3.f1848k.f9404a;
                        t1.q0 q0Var = j0Var.K;
                        s0Var.g(obj, q0Var);
                        jY = w1.b0.Y(j9 + q0Var.f12090e);
                    }
                }
                j8 = jY + j11;
                j9 = jH;
            }
            TextView textView = this.f5562b0;
            if (textView != null && !this.J0) {
                textView.setText(w1.b0.B(this.f5564d0, this.f5565e0, j9));
            }
            s0 s0Var2 = this.f5563c0;
            if (s0Var2 != null) {
                s0Var2.setPosition(j9);
                this.f5563c0.setBufferedPosition(j8);
            }
            removeCallbacks(this.f5568h0);
            int iS = n0Var == null ? 1 : ((c2.j0) n0Var).S();
            if (n0Var != null) {
                c2.j0 j0Var2 = (c2.j0) ((c3.e) n0Var);
                if (j0Var2.S() == 3 && j0Var2.R()) {
                    j0Var2.q0();
                    if (j0Var2.E0.f1851n == 0) {
                        s0 s0Var3 = this.f5563c0;
                        long jMin = Math.min(s0Var3 != null ? s0Var3.getPreferredUpdateDelay() : 1000L, 1000 - (j9 % 1000));
                        c2.j0 j0Var3 = (c2.j0) n0Var;
                        j0Var3.q0();
                        float f = j0Var3.E0.f1852o.f12004a;
                        postDelayed(this.f5568h0, w1.b0.i(f > 0.0f ? (long) (jMin / f) : 1000L, this.L0, 1000L));
                        return;
                    }
                }
            }
            if (iS == 4 || iS == 1) {
                return;
            }
            postDelayed(this.f5568h0, 1000L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w wVar = this.f5581v;
        wVar.f5602a.addOnLayoutChangeListener(wVar.f5623x);
        this.F0 = true;
        if (h()) {
            wVar.g();
        }
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        w wVar = this.f5581v;
        wVar.f5602a.removeOnLayoutChangeListener(wVar.f5623x);
        this.F0 = false;
        removeCallbacks(this.f5568h0);
        wVar.f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i10, int i11, int i12) {
        super.onLayout(z2, i, i10, i11, i12);
        View view = this.f5581v.f5603b;
        if (view != null) {
            view.layout(0, 0, i11 - i, i12 - i10);
        }
    }

    public final void p() {
        ImageView imageView;
        if (i() && this.F0 && (imageView = this.O) != null) {
            if (this.M0 == 0) {
                k(imageView, false);
                return;
            }
            t1.n0 n0Var = this.C0;
            String str = this.f5572l0;
            Drawable drawable = this.f5569i0;
            if (n0Var == null || !((c3.e) n0Var).n(15)) {
                k(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            k(imageView, true);
            c2.j0 j0Var = (c2.j0) n0Var;
            j0Var.q0();
            int i = j0Var.f1781c0;
            if (i == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (i == 1) {
                imageView.setImageDrawable(this.f5570j0);
                imageView.setContentDescription(this.f5573m0);
            } else {
                if (i != 2) {
                    return;
                }
                imageView.setImageDrawable(this.f5571k0);
                imageView.setContentDescription(this.f5574n0);
            }
        }
    }

    public final void q() {
        RecyclerView recyclerView = this.f5589z;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i = this.G;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i * 2));
        PopupWindow popupWindow = this.F;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i * 2), recyclerView.getMeasuredHeight()));
    }

    public final void r() {
        ImageView imageView;
        if (i() && this.F0 && (imageView = this.P) != null) {
            t1.n0 n0Var = this.C0;
            if (!this.f5581v.b(imageView)) {
                k(imageView, false);
                return;
            }
            String str = this.f5579t0;
            Drawable drawable = this.f5575p0;
            if (n0Var == null || !((c3.e) n0Var).n(14)) {
                k(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            k(imageView, true);
            c2.j0 j0Var = (c2.j0) n0Var;
            j0Var.q0();
            if (j0Var.f1782d0) {
                drawable = this.o0;
            }
            imageView.setImageDrawable(drawable);
            j0Var.q0();
            if (j0Var.f1782d0) {
                str = this.f5578s0;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0137  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r4v18, types: [t1.b] */
    /* JADX WARN: Type inference failed for: r7v3, types: [t1.q0] */
    /* JADX WARN: Type inference failed for: r8v3, types: [t1.s0] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s() {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.r.s():void");
    }

    public void setAnimationEnabled(boolean z2) {
        this.f5581v.C = z2;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(h hVar) {
        this.D0 = hVar;
        boolean z2 = hVar != null;
        ImageView imageView = this.S;
        if (imageView != null) {
            if (z2) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z10 = hVar != null;
        ImageView imageView2 = this.T;
        if (imageView2 == null) {
            return;
        }
        if (z10) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(t1.n0 n0Var) {
        w1.a.j(Looper.myLooper() == Looper.getMainLooper());
        w1.a.d(n0Var == null || ((c2.j0) n0Var).P == Looper.getMainLooper());
        t1.n0 n0Var2 = this.C0;
        if (n0Var2 == n0Var) {
            return;
        }
        g gVar = this.f5585x;
        if (n0Var2 != null) {
            ((c2.j0) n0Var2).c0(gVar);
        }
        this.C0 = n0Var;
        if (n0Var != null) {
            w1.p pVar = ((c2.j0) n0Var).I;
            gVar.getClass();
            pVar.a(gVar);
        }
        j();
    }

    public void setRepeatToggleModes(int i) {
        this.M0 = i;
        t1.n0 n0Var = this.C0;
        if (n0Var != null && ((c3.e) n0Var).n(15)) {
            c2.j0 j0Var = (c2.j0) this.C0;
            j0Var.q0();
            int i10 = j0Var.f1781c0;
            if (i == 0 && i10 != 0) {
                ((c2.j0) this.C0).i0(0);
            } else if (i == 1 && i10 == 2) {
                ((c2.j0) this.C0).i0(1);
            } else if (i == 2 && i10 == 1) {
                ((c2.j0) this.C0).i0(2);
            }
        }
        this.f5581v.h(this.O, i != 0);
        p();
    }

    public void setShowFastForwardButton(boolean z2) {
        this.f5581v.h(this.K, z2);
        l();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z2) {
        this.G0 = z2;
        s();
    }

    public void setShowNextButton(boolean z2) {
        this.f5581v.h(this.I, z2);
        l();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z2) {
        this.H0 = z2;
        m();
    }

    public void setShowPreviousButton(boolean z2) {
        this.f5581v.h(this.H, z2);
        l();
    }

    public void setShowRewindButton(boolean z2) {
        this.f5581v.h(this.L, z2);
        l();
    }

    public void setShowShuffleButton(boolean z2) {
        this.f5581v.h(this.P, z2);
        r();
    }

    public void setShowSubtitleButton(boolean z2) {
        this.f5581v.h(this.R, z2);
    }

    public void setShowTimeoutMs(int i) {
        this.K0 = i;
        if (h()) {
            this.f5581v.g();
        }
    }

    public void setShowVrButton(boolean z2) {
        this.f5581v.h(this.Q, z2);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.L0 = w1.b0.h(i, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.Q;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            k(view, onClickListener != null);
        }
    }

    public final void t() {
        f fVar = this.C;
        fVar.getClass();
        List list = Collections.EMPTY_LIST;
        fVar.f5502d = list;
        f fVar2 = this.D;
        fVar2.getClass();
        fVar2.f5502d = list;
        t1.n0 n0Var = this.C0;
        ImageView imageView = this.R;
        if (n0Var != null && ((c3.e) n0Var).n(30) && ((c3.e) this.C0).n(29)) {
            t1.z0 z0VarO = ((c2.j0) this.C0).O();
            z0 z0VarF = f(z0VarO, 1);
            fVar2.f5502d = z0VarF;
            r rVar = fVar2.f5504g;
            t1.n0 n0Var2 = rVar.C0;
            m mVar = rVar.A;
            n0Var2.getClass();
            r2.j jVarU = ((c2.j0) n0Var2).U();
            if (!z0VarF.isEmpty()) {
                if (fVar2.g(jVarU)) {
                    int i = 0;
                    while (true) {
                        if (i >= z0VarF.f14639y) {
                            break;
                        }
                        o oVar = (o) z0VarF.get(i);
                        if (oVar.f5527a.f12177e[oVar.f5528b]) {
                            ((String[]) mVar.f)[1] = oVar.f5529c;
                            break;
                        }
                        i++;
                    }
                } else {
                    ((String[]) mVar.f)[1] = rVar.getResources().getString(k0.exo_track_selection_auto);
                }
            } else {
                ((String[]) mVar.f)[1] = rVar.getResources().getString(k0.exo_track_selection_none);
            }
            if (this.f5581v.b(imageView)) {
                fVar.h(f(z0VarO, 3));
            } else {
                fVar.h(z0.f14637z);
            }
        }
        k(imageView, fVar.a() > 0);
        m mVar2 = this.A;
        k(this.U, mVar2.g(1) || mVar2.g(0));
    }

    public void setProgressUpdateListener(k kVar) {
    }
}
