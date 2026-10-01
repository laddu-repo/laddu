package com.livxow.tv.activities;

import ac.q;
import android.app.PictureInPictureParams;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Rational;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.i0;
import androidx.fragment.app.q0;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.m;
import c2.j0;
import c2.k0;
import c2.s;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.card.MaterialCardView;
import com.livxow.tv.activities.PlayerActivity;
import com.livxow.tv.app.App;
import d2.e;
import fc.h;
import fc.l;
import g2.t;
import g4.e0;
import g4.g0;
import gc.i;
import h.j;
import hc.o;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import jc.d;
import mc.n;
import mc.z;
import o2.p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pc.a;
import rc.b;
import t0.d0;
import t0.m0;
import t1.c0;
import t1.r;
import t1.u;
import t1.v;
import t1.w;
import t1.x;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class PlayerActivity extends j {
    public static final /* synthetic */ int J0 = 0;
    public h B0;
    public Handler C0;
    public gc.h D0;
    public a E0;
    public String F0;
    public n G0;
    public Handler H0;
    public App W;
    public jc.a X;
    public d Y;
    public RecyclerView Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public o f3640a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ArrayList f3641b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public i f3642c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public j0 f3643d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public PlayerView f3644e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public kc.o f3645f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public String f3646g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public String f3647h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public String f3648i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public String f3649j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f3650k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f3651l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f3652m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f3653n0;
    public boolean o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f3654p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f3655q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f3656r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f3657s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f3658t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f3659u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f3660v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f3661w0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f3663y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f3664z0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final s5.d f3662x0 = new s5.d(this);
    public boolean A0 = true;
    public final i0 I0 = new i0(this, 2);

    public static void B(Map map, xa.a aVar) {
        if (map.isEmpty()) {
            return;
        }
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if ("user-agent".equals(str.toLowerCase())) {
                String str2 = (String) entry.getValue();
                if ("null".equals(str2)) {
                    str2 = "";
                }
                aVar.f14308v = str2;
                map.remove(str);
            }
        }
        aVar.e(map);
    }

    public final void A() {
        o oVar = this.f3640a0;
        if (oVar != null) {
            int i = oVar.f6248g + 1;
            if (i == this.f3641b0.size()) {
                i = 0;
            }
            pc.h hVar = (pc.h) this.f3641b0.get(i);
            this.f3642c0.a(hVar.f10523w.replaceAll("\\\\", "").replaceAll("]", "").replaceAll("\"", ""), hVar.f10524x, hVar.f10525y, hVar.f10526z, hVar.A, hVar.B);
            if (this.f3640a0.f6248g != i) {
                this.Z.g0(i);
                new Handler(Looper.getMainLooper()).postDelayed(new k0(i, 2, this), 100L);
            }
        }
    }

    public final void C(String str, boolean z2) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        if (this.X == null) {
            return;
        }
        j0 j0Var = this.f3643d0;
        if (j0Var != null) {
            j0Var.b0();
        }
        if (z2) {
            b8.h.s(b8.h.q(this, str), new i(this, 1));
            return;
        }
        try {
            if (!str.startsWith("[")) {
                str = rc.a.b(str);
            }
            jSONArray = new JSONArray(str);
            jSONObject = jSONArray.getJSONObject(this.f3658t0);
        } catch (ArrayIndexOutOfBoundsException e7) {
            e = e7;
            Throwable th = e;
            Log.e("Pro", "JSONException", th);
            Toast.makeText(this, th.toString(), 1).show();
            this.f3646g0 = "https://pro.com";
            this.f3647h0 = null;
            this.f3648i0 = null;
            this.f3649j0 = null;
            this.f3659u0 = 0;
        } catch (JSONException e10) {
            e = e10;
            Throwable th2 = e;
            Log.e("Pro", "JSONException", th2);
            Toast.makeText(this, th2.toString(), 1).show();
            this.f3646g0 = "https://pro.com";
            this.f3647h0 = null;
            this.f3648i0 = null;
            this.f3649j0 = null;
            this.f3659u0 = 0;
        }
        if (jSONObject.has("playlist")) {
            b8.h.u(jSONObject, new i(this, 0));
            return;
        }
        pc.h hVarB = pc.h.b(jSONObject);
        this.f3646g0 = hVarB.f10523w;
        this.f3647h0 = hVarB.f10524x;
        this.f3648i0 = hVarB.f10525y;
        this.f3649j0 = hVarB.f10526z;
        this.f3659u0 = hVarB.A;
        this.f3651l0 = hVarB.B;
        if (jSONArray.length() > 1) {
            D(jSONArray);
        } else {
            this.f3640a0 = null;
        }
        z(this.f3646g0, this.f3647h0, this.f3648i0, this.f3649j0, null);
    }

    public final void D(JSONArray jSONArray) {
        this.f3642c0 = new i(this, 2);
        ArrayList arrayListA = pc.h.a(jSONArray);
        this.f3641b0 = arrayListA;
        o oVar = new o(this, arrayListA, this.f3642c0);
        this.f3640a0 = oVar;
        oVar.f6248g = this.f3658t0;
        this.Z.setAdapter(oVar);
        this.Z.setLayoutManager(new LinearLayoutManager(0));
        this.Z.setVisibility(0);
        new Handler(Looper.getMainLooper()).postDelayed(new gc.h(this, 2), 100L);
    }

    public final void E() {
        if (this.f3655q0) {
            setRequestedOrientation(1);
            vc.a.B(this);
            this.f3644e0.setResizeMode(0);
            this.Y.f7044j.setImageResource(e0.exo_ic_fullscreen_enter);
            this.X.f.setVisibility(0);
            this.X.f7008e.setVisibility(0);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((RelativeLayout) this.X.f7012k).getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = this.f3660v0;
            ((RelativeLayout) this.X.f7012k).setLayoutParams(layoutParams);
            F(this.X.f7007d);
            this.f3655q0 = false;
            return;
        }
        setRequestedOrientation(6);
        vc.a.o(this);
        this.f3644e0.setResizeMode(3);
        this.Y.f7044j.setImageResource(e0.exo_ic_fullscreen_exit);
        this.X.f.setVisibility(8);
        this.X.f7008e.setVisibility(8);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) ((RelativeLayout) this.X.f7012k).getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        ((RelativeLayout) this.X.f7012k).setLayoutParams(layoutParams2);
        F(this.Y.f7042g);
        this.f3655q0 = true;
    }

    public final void F(FrameLayout frameLayout) {
        ViewGroup viewGroup = (ViewGroup) this.Z.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.Z);
        }
        frameLayout.addView(this.Z);
        if (this.f3640a0 != null) {
            new Handler(Looper.getMainLooper()).postDelayed(new gc.h(this, 3), 100L);
        }
    }

    @Override // h.j, c.j, h0.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        View viewK;
        View viewK2;
        m.a(this);
        super.onCreate(bundle);
        final int i = 0;
        View viewInflate = getLayoutInflater().inflate(fc.m.activity_player, (ViewGroup) null, false);
        int i10 = l.bottom_space;
        View viewK3 = a.a.k(viewInflate, i10);
        if (viewK3 != null) {
            i10 = l.date_view;
            if (((LinearLayout) a.a.k(viewInflate, i10)) != null) {
                i10 = l.fragment_container;
                if (((FragmentContainerView) a.a.k(viewInflate, i10)) != null) {
                    i10 = l.item_details_container;
                    LinearLayout linearLayout = (LinearLayout) a.a.k(viewInflate, i10);
                    if (linearLayout != null) {
                        i10 = l.links_lay;
                        FrameLayout frameLayout = (FrameLayout) a.a.k(viewInflate, i10);
                        if (frameLayout != null) {
                            i10 = l.live_anim_view;
                            LottieAnimationView lottieAnimationView = (LottieAnimationView) a.a.k(viewInflate, i10);
                            if (lottieAnimationView != null) {
                                i10 = l.message_card;
                                MaterialCardView materialCardView = (MaterialCardView) a.a.k(viewInflate, i10);
                                if (materialCardView != null) {
                                    i10 = l.message_txt;
                                    TextView textView = (TextView) a.a.k(viewInflate, i10);
                                    if (textView != null) {
                                        i10 = l.playerLayout;
                                        RelativeLayout relativeLayout = (RelativeLayout) a.a.k(viewInflate, i10);
                                        if (relativeLayout != null) {
                                            i10 = l.playerTxt;
                                            TextView textView2 = (TextView) a.a.k(viewInflate, i10);
                                            if (textView2 != null) {
                                                i10 = l.player_view;
                                                PlayerView playerView = (PlayerView) a.a.k(viewInflate, i10);
                                                if (playerView != null) {
                                                    i10 = l.progress;
                                                    ProgressBar progressBar = (ProgressBar) a.a.k(viewInflate, i10);
                                                    if (progressBar != null) {
                                                        i10 = l.share_app_btn;
                                                        ImageButton imageButton = (ImageButton) a.a.k(viewInflate, i10);
                                                        if (imageButton != null && (viewK = a.a.k(viewInflate, (i10 = l.swipe_binding))) != null) {
                                                            hd.a aVarM = hd.a.m(viewK);
                                                            i10 = l.teamAFlag;
                                                            ImageView imageView = (ImageView) a.a.k(viewInflate, i10);
                                                            if (imageView != null) {
                                                                i10 = l.teamBFlag;
                                                                ImageView imageView2 = (ImageView) a.a.k(viewInflate, i10);
                                                                if (imageView2 != null && (viewK2 = a.a.k(viewInflate, (i10 = l.top_space))) != null) {
                                                                    i10 = l.update_fragment_container;
                                                                    FragmentContainerView fragmentContainerView = (FragmentContainerView) a.a.k(viewInflate, i10);
                                                                    if (fragmentContainerView != null) {
                                                                        i10 = l.vsText;
                                                                        TextView textView3 = (TextView) a.a.k(viewInflate, i10);
                                                                        if (textView3 != null) {
                                                                            this.X = new jc.a((LinearLayout) viewInflate, viewK3, linearLayout, frameLayout, lottieAnimationView, materialCardView, textView, relativeLayout, textView2, playerView, progressBar, imageButton, aVarM, imageView, imageView2, viewK2, fragmentContainerView, textView3);
                                                                            viewK2.setVisibility(0);
                                                                            View view = this.X.f;
                                                                            e eVar = new e(17);
                                                                            WeakHashMap weakHashMap = m0.f11853a;
                                                                            d0.k(view, eVar);
                                                                            this.X.f7008e.setVisibility(0);
                                                                            d0.k(this.X.f7008e, new e(18));
                                                                            setContentView(this.X.f7005b);
                                                                            PlayerView playerView2 = (PlayerView) this.X.f7013l;
                                                                            this.f3644e0 = playerView2;
                                                                            View viewFindViewById = playerView2.findViewById(l.player_controls);
                                                                            int i11 = l.bottom_controller;
                                                                            LinearLayout linearLayout2 = (LinearLayout) a.a.k(viewFindViewById, i11);
                                                                            if (linearLayout2 != null) {
                                                                                i11 = l.btn_back;
                                                                                ImageButton imageButton2 = (ImageButton) a.a.k(viewFindViewById, i11);
                                                                                if (imageButton2 != null) {
                                                                                    i11 = l.btn_lock_unlock;
                                                                                    ImageButton imageButton3 = (ImageButton) a.a.k(viewFindViewById, i11);
                                                                                    if (imageButton3 != null) {
                                                                                        i11 = l.btn_mute;
                                                                                        ImageButton imageButton4 = (ImageButton) a.a.k(viewFindViewById, i11);
                                                                                        if (imageButton4 != null) {
                                                                                            i11 = l.btn_pip;
                                                                                            ImageButton imageButton5 = (ImageButton) a.a.k(viewFindViewById, i11);
                                                                                            if (imageButton5 != null) {
                                                                                                i11 = l.btn_settings;
                                                                                                ImageButton imageButton6 = (ImageButton) a.a.k(viewFindViewById, i11);
                                                                                                if (imageButton6 != null) {
                                                                                                    i11 = l.controller_links_lay;
                                                                                                    FrameLayout frameLayout2 = (FrameLayout) a.a.k(viewFindViewById, i11);
                                                                                                    if (frameLayout2 != null) {
                                                                                                        i11 = g0.exo_duration;
                                                                                                        if (((TextView) a.a.k(viewFindViewById, i11)) != null) {
                                                                                                            i11 = g0.exo_ffwd;
                                                                                                            if (((ImageButton) a.a.k(viewFindViewById, i11)) != null) {
                                                                                                                i11 = l.exo_pause;
                                                                                                                ImageButton imageButton7 = (ImageButton) a.a.k(viewFindViewById, i11);
                                                                                                                if (imageButton7 != null) {
                                                                                                                    i11 = l.exo_play;
                                                                                                                    ImageButton imageButton8 = (ImageButton) a.a.k(viewFindViewById, i11);
                                                                                                                    if (imageButton8 != null) {
                                                                                                                        i11 = g0.exo_position;
                                                                                                                        if (((TextView) a.a.k(viewFindViewById, i11)) != null) {
                                                                                                                            i11 = g0.exo_progress;
                                                                                                                            if (((DefaultTimeBar) a.a.k(viewFindViewById, i11)) != null) {
                                                                                                                                i11 = g0.exo_rew;
                                                                                                                                if (((ImageButton) a.a.k(viewFindViewById, i11)) != null) {
                                                                                                                                    i11 = l.fullscreen;
                                                                                                                                    ImageButton imageButton9 = (ImageButton) a.a.k(viewFindViewById, i11);
                                                                                                                                    if (imageButton9 != null) {
                                                                                                                                        i11 = l.resize_mode;
                                                                                                                                        ImageButton imageButton10 = (ImageButton) a.a.k(viewFindViewById, i11);
                                                                                                                                        if (imageButton10 != null) {
                                                                                                                                            i11 = l.timer_bar_ly;
                                                                                                                                            LinearLayout linearLayout3 = (LinearLayout) a.a.k(viewFindViewById, i11);
                                                                                                                                            if (linearLayout3 != null) {
                                                                                                                                                i11 = l.title;
                                                                                                                                                TextView textView4 = (TextView) a.a.k(viewFindViewById, i11);
                                                                                                                                                if (textView4 != null) {
                                                                                                                                                    i11 = l.top_btns_lay;
                                                                                                                                                    if (((LinearLayout) a.a.k(viewFindViewById, i11)) != null) {
                                                                                                                                                        this.Y = new d(linearLayout2, imageButton2, imageButton3, imageButton4, imageButton5, imageButton6, frameLayout2, imageButton7, imageButton8, imageButton9, imageButton10, linearLayout3, textView4);
                                                                                                                                                        imageButton2.setOnClickListener(new View.OnClickListener(this) { // from class: gc.k

                                                                                                                                                            /* JADX INFO: renamed from: w, reason: collision with root package name */
                                                                                                                                                            public final /* synthetic */ PlayerActivity f5814w;

                                                                                                                                                            {
                                                                                                                                                                this.f5814w = this;
                                                                                                                                                            }

                                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                                            public final void onClick(View view2) {
                                                                                                                                                                int i12 = i;
                                                                                                                                                                int i13 = 1;
                                                                                                                                                                PlayerActivity playerActivity = this.f5814w;
                                                                                                                                                                switch (i12) {
                                                                                                                                                                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                                                                                                                                        int i14 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.v();
                                                                                                                                                                        break;
                                                                                                                                                                    case 1:
                                                                                                                                                                        int i15 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.w();
                                                                                                                                                                        break;
                                                                                                                                                                    case 2:
                                                                                                                                                                        PlayerActivity playerActivity2 = this.f5814w;
                                                                                                                                                                        j0 j0Var = playerActivity2.f3643d0;
                                                                                                                                                                        if (j0Var != null) {
                                                                                                                                                                            playerActivity2.o0 = false;
                                                                                                                                                                            if (!playerActivity2.f3652m0) {
                                                                                                                                                                                j0Var.x();
                                                                                                                                                                                playerActivity2.Y.i.setVisibility(8);
                                                                                                                                                                                playerActivity2.Y.f7043h.setVisibility(0);
                                                                                                                                                                            } else {
                                                                                                                                                                                playerActivity2.z(playerActivity2.f3646g0, playerActivity2.f3647h0, playerActivity2.f3648i0, playerActivity2.f3649j0, null);
                                                                                                                                                                                playerActivity2.f3652m0 = false;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case 3:
                                                                                                                                                                        if (playerActivity.f3643d0 != null) {
                                                                                                                                                                            Log.e("Pro Pro", "pause button");
                                                                                                                                                                            playerActivity.f3643d0.w();
                                                                                                                                                                            playerActivity.o0 = true;
                                                                                                                                                                            playerActivity.Y.f7043h.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.i.setVisibility(0);
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.LONG_FIELD_NUMBER /* 4 */:
                                                                                                                                                                        if (!playerActivity.f3654p0) {
                                                                                                                                                                            playerActivity.B0.J = true;
                                                                                                                                                                            playerActivity.Y.f7039c.setImageResource(fc.k.ic_lock);
                                                                                                                                                                            playerActivity.Y.f7037a.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7046l.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7038b.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7040d.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7047m.setVisibility(8);
                                                                                                                                                                            RecyclerView recyclerView = playerActivity.Z;
                                                                                                                                                                            if (recyclerView != null) {
                                                                                                                                                                                recyclerView.setVisibility(8);
                                                                                                                                                                            }
                                                                                                                                                                            playerActivity.f3654p0 = true;
                                                                                                                                                                        } else {
                                                                                                                                                                            playerActivity.B0.J = false;
                                                                                                                                                                            playerActivity.Y.f7039c.setImageResource(fc.k.ic_unlock);
                                                                                                                                                                            playerActivity.Y.f7037a.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7046l.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7038b.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7040d.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7047m.setVisibility(0);
                                                                                                                                                                            RecyclerView recyclerView2 = playerActivity.Z;
                                                                                                                                                                            if (recyclerView2 != null) {
                                                                                                                                                                                recyclerView2.setVisibility(0);
                                                                                                                                                                            }
                                                                                                                                                                            playerActivity.f3654p0 = false;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.STRING_FIELD_NUMBER /* 5 */:
                                                                                                                                                                        int resizeMode = playerActivity.f3644e0.getResizeMode();
                                                                                                                                                                        if (resizeMode == 0) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(3);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_crop);
                                                                                                                                                                            break;
                                                                                                                                                                        } else if (resizeMode == 3) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(4);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_fit);
                                                                                                                                                                            break;
                                                                                                                                                                        } else if (resizeMode == 4) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(0);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_fill);
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                                                                                                                                                        j0 j0Var2 = playerActivity.f3643d0;
                                                                                                                                                                        if (j0Var2 != null) {
                                                                                                                                                                            kc.o oVarT = kc.o.T(j0Var2, new b(playerActivity, i13));
                                                                                                                                                                            playerActivity.f3645f0 = oVarT;
                                                                                                                                                                            oVarT.R(playerActivity.o(), null);
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                                                                                                                                                        if (!playerActivity.f3653n0) {
                                                                                                                                                                            j0 j0Var3 = playerActivity.f3643d0;
                                                                                                                                                                            j0Var3.q0();
                                                                                                                                                                            playerActivity.f3657s0 = j0Var3.f1800w0;
                                                                                                                                                                            playerActivity.f3643d0.l0(0.0f);
                                                                                                                                                                            playerActivity.Y.f7040d.setImageResource(fc.k.volume_off_24px);
                                                                                                                                                                            playerActivity.f3653n0 = true;
                                                                                                                                                                        } else {
                                                                                                                                                                            playerActivity.f3643d0.l0(playerActivity.f3657s0);
                                                                                                                                                                            playerActivity.Y.f7040d.setImageResource(fc.k.volume_up_24px);
                                                                                                                                                                            playerActivity.f3653n0 = false;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                                                                                                                                                                        int i16 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.E();
                                                                                                                                                                        break;
                                                                                                                                                                    case 9:
                                                                                                                                                                        int i17 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.getClass();
                                                                                                                                                                        try {
                                                                                                                                                                            Intent intent = new Intent("android.intent.action.VIEW");
                                                                                                                                                                            intent.setData(Uri.parse(playerActivity.W.I));
                                                                                                                                                                            playerActivity.startActivity(intent);
                                                                                                                                                                        } catch (ActivityNotFoundException e7) {
                                                                                                                                                                            Toast.makeText(playerActivity, e7.getMessage(), 0).show();
                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    default:
                                                                                                                                                                        int i18 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.getClass();
                                                                                                                                                                        vc.a.z(playerActivity);
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        });
                                                                                                                                                        final int i12 = 8;
                                                                                                                                                        final int i13 = 1;
                                                                                                                                                        if (Build.VERSION.SDK_INT < 26 || !getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
                                                                                                                                                            this.Y.f7041e.setVisibility(8);
                                                                                                                                                        } else {
                                                                                                                                                            this.Y.f7041e.setOnClickListener(new View.OnClickListener(this) { // from class: gc.k

                                                                                                                                                                /* JADX INFO: renamed from: w, reason: collision with root package name */
                                                                                                                                                                public final /* synthetic */ PlayerActivity f5814w;

                                                                                                                                                                {
                                                                                                                                                                    this.f5814w = this;
                                                                                                                                                                }

                                                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                                                public final void onClick(View view2) {
                                                                                                                                                                    int i122 = i13;
                                                                                                                                                                    int i132 = 1;
                                                                                                                                                                    PlayerActivity playerActivity = this.f5814w;
                                                                                                                                                                    switch (i122) {
                                                                                                                                                                        case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                                                                                                                                            int i14 = PlayerActivity.J0;
                                                                                                                                                                            playerActivity.v();
                                                                                                                                                                            break;
                                                                                                                                                                        case 1:
                                                                                                                                                                            int i15 = PlayerActivity.J0;
                                                                                                                                                                            playerActivity.w();
                                                                                                                                                                            break;
                                                                                                                                                                        case 2:
                                                                                                                                                                            PlayerActivity playerActivity2 = this.f5814w;
                                                                                                                                                                            j0 j0Var = playerActivity2.f3643d0;
                                                                                                                                                                            if (j0Var != null) {
                                                                                                                                                                                playerActivity2.o0 = false;
                                                                                                                                                                                if (!playerActivity2.f3652m0) {
                                                                                                                                                                                    j0Var.x();
                                                                                                                                                                                    playerActivity2.Y.i.setVisibility(8);
                                                                                                                                                                                    playerActivity2.Y.f7043h.setVisibility(0);
                                                                                                                                                                                } else {
                                                                                                                                                                                    playerActivity2.z(playerActivity2.f3646g0, playerActivity2.f3647h0, playerActivity2.f3648i0, playerActivity2.f3649j0, null);
                                                                                                                                                                                    playerActivity2.f3652m0 = false;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            break;
                                                                                                                                                                        case 3:
                                                                                                                                                                            if (playerActivity.f3643d0 != null) {
                                                                                                                                                                                Log.e("Pro Pro", "pause button");
                                                                                                                                                                                playerActivity.f3643d0.w();
                                                                                                                                                                                playerActivity.o0 = true;
                                                                                                                                                                                playerActivity.Y.f7043h.setVisibility(8);
                                                                                                                                                                                playerActivity.Y.i.setVisibility(0);
                                                                                                                                                                            }
                                                                                                                                                                            break;
                                                                                                                                                                        case g1.g.LONG_FIELD_NUMBER /* 4 */:
                                                                                                                                                                            if (!playerActivity.f3654p0) {
                                                                                                                                                                                playerActivity.B0.J = true;
                                                                                                                                                                                playerActivity.Y.f7039c.setImageResource(fc.k.ic_lock);
                                                                                                                                                                                playerActivity.Y.f7037a.setVisibility(8);
                                                                                                                                                                                playerActivity.Y.f7046l.setVisibility(8);
                                                                                                                                                                                playerActivity.Y.f7038b.setVisibility(8);
                                                                                                                                                                                playerActivity.Y.f7040d.setVisibility(8);
                                                                                                                                                                                playerActivity.Y.f7047m.setVisibility(8);
                                                                                                                                                                                RecyclerView recyclerView = playerActivity.Z;
                                                                                                                                                                                if (recyclerView != null) {
                                                                                                                                                                                    recyclerView.setVisibility(8);
                                                                                                                                                                                }
                                                                                                                                                                                playerActivity.f3654p0 = true;
                                                                                                                                                                            } else {
                                                                                                                                                                                playerActivity.B0.J = false;
                                                                                                                                                                                playerActivity.Y.f7039c.setImageResource(fc.k.ic_unlock);
                                                                                                                                                                                playerActivity.Y.f7037a.setVisibility(0);
                                                                                                                                                                                playerActivity.Y.f7046l.setVisibility(0);
                                                                                                                                                                                playerActivity.Y.f7038b.setVisibility(0);
                                                                                                                                                                                playerActivity.Y.f7040d.setVisibility(0);
                                                                                                                                                                                playerActivity.Y.f7047m.setVisibility(0);
                                                                                                                                                                                RecyclerView recyclerView2 = playerActivity.Z;
                                                                                                                                                                                if (recyclerView2 != null) {
                                                                                                                                                                                    recyclerView2.setVisibility(0);
                                                                                                                                                                                }
                                                                                                                                                                                playerActivity.f3654p0 = false;
                                                                                                                                                                            }
                                                                                                                                                                            break;
                                                                                                                                                                        case g1.g.STRING_FIELD_NUMBER /* 5 */:
                                                                                                                                                                            int resizeMode = playerActivity.f3644e0.getResizeMode();
                                                                                                                                                                            if (resizeMode == 0) {
                                                                                                                                                                                playerActivity.f3644e0.setResizeMode(3);
                                                                                                                                                                                playerActivity.Y.f7045k.setImageResource(fc.k.mode_crop);
                                                                                                                                                                                break;
                                                                                                                                                                            } else if (resizeMode == 3) {
                                                                                                                                                                                playerActivity.f3644e0.setResizeMode(4);
                                                                                                                                                                                playerActivity.Y.f7045k.setImageResource(fc.k.mode_fit);
                                                                                                                                                                                break;
                                                                                                                                                                            } else if (resizeMode == 4) {
                                                                                                                                                                                playerActivity.f3644e0.setResizeMode(0);
                                                                                                                                                                                playerActivity.Y.f7045k.setImageResource(fc.k.mode_fill);
                                                                                                                                                                                break;
                                                                                                                                                                            }
                                                                                                                                                                            break;
                                                                                                                                                                        case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                                                                                                                                                            j0 j0Var2 = playerActivity.f3643d0;
                                                                                                                                                                            if (j0Var2 != null) {
                                                                                                                                                                                kc.o oVarT = kc.o.T(j0Var2, new b(playerActivity, i132));
                                                                                                                                                                                playerActivity.f3645f0 = oVarT;
                                                                                                                                                                                oVarT.R(playerActivity.o(), null);
                                                                                                                                                                            }
                                                                                                                                                                            break;
                                                                                                                                                                        case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                                                                                                                                                            if (!playerActivity.f3653n0) {
                                                                                                                                                                                j0 j0Var3 = playerActivity.f3643d0;
                                                                                                                                                                                j0Var3.q0();
                                                                                                                                                                                playerActivity.f3657s0 = j0Var3.f1800w0;
                                                                                                                                                                                playerActivity.f3643d0.l0(0.0f);
                                                                                                                                                                                playerActivity.Y.f7040d.setImageResource(fc.k.volume_off_24px);
                                                                                                                                                                                playerActivity.f3653n0 = true;
                                                                                                                                                                            } else {
                                                                                                                                                                                playerActivity.f3643d0.l0(playerActivity.f3657s0);
                                                                                                                                                                                playerActivity.Y.f7040d.setImageResource(fc.k.volume_up_24px);
                                                                                                                                                                                playerActivity.f3653n0 = false;
                                                                                                                                                                            }
                                                                                                                                                                            break;
                                                                                                                                                                        case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                                                                                                                                                                            int i16 = PlayerActivity.J0;
                                                                                                                                                                            playerActivity.E();
                                                                                                                                                                            break;
                                                                                                                                                                        case 9:
                                                                                                                                                                            int i17 = PlayerActivity.J0;
                                                                                                                                                                            playerActivity.getClass();
                                                                                                                                                                            try {
                                                                                                                                                                                Intent intent = new Intent("android.intent.action.VIEW");
                                                                                                                                                                                intent.setData(Uri.parse(playerActivity.W.I));
                                                                                                                                                                                playerActivity.startActivity(intent);
                                                                                                                                                                            } catch (ActivityNotFoundException e7) {
                                                                                                                                                                                Toast.makeText(playerActivity, e7.getMessage(), 0).show();
                                                                                                                                                                                return;
                                                                                                                                                                            }
                                                                                                                                                                            break;
                                                                                                                                                                        default:
                                                                                                                                                                            int i18 = PlayerActivity.J0;
                                                                                                                                                                            playerActivity.getClass();
                                                                                                                                                                            vc.a.z(playerActivity);
                                                                                                                                                                            break;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            });
                                                                                                                                                        }
                                                                                                                                                        final int i14 = 2;
                                                                                                                                                        this.Y.i.setOnClickListener(new View.OnClickListener(this) { // from class: gc.k

                                                                                                                                                            /* JADX INFO: renamed from: w, reason: collision with root package name */
                                                                                                                                                            public final /* synthetic */ PlayerActivity f5814w;

                                                                                                                                                            {
                                                                                                                                                                this.f5814w = this;
                                                                                                                                                            }

                                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                                            public final void onClick(View view2) {
                                                                                                                                                                int i122 = i14;
                                                                                                                                                                int i132 = 1;
                                                                                                                                                                PlayerActivity playerActivity = this.f5814w;
                                                                                                                                                                switch (i122) {
                                                                                                                                                                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                                                                                                                                        int i142 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.v();
                                                                                                                                                                        break;
                                                                                                                                                                    case 1:
                                                                                                                                                                        int i15 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.w();
                                                                                                                                                                        break;
                                                                                                                                                                    case 2:
                                                                                                                                                                        PlayerActivity playerActivity2 = this.f5814w;
                                                                                                                                                                        j0 j0Var = playerActivity2.f3643d0;
                                                                                                                                                                        if (j0Var != null) {
                                                                                                                                                                            playerActivity2.o0 = false;
                                                                                                                                                                            if (!playerActivity2.f3652m0) {
                                                                                                                                                                                j0Var.x();
                                                                                                                                                                                playerActivity2.Y.i.setVisibility(8);
                                                                                                                                                                                playerActivity2.Y.f7043h.setVisibility(0);
                                                                                                                                                                            } else {
                                                                                                                                                                                playerActivity2.z(playerActivity2.f3646g0, playerActivity2.f3647h0, playerActivity2.f3648i0, playerActivity2.f3649j0, null);
                                                                                                                                                                                playerActivity2.f3652m0 = false;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case 3:
                                                                                                                                                                        if (playerActivity.f3643d0 != null) {
                                                                                                                                                                            Log.e("Pro Pro", "pause button");
                                                                                                                                                                            playerActivity.f3643d0.w();
                                                                                                                                                                            playerActivity.o0 = true;
                                                                                                                                                                            playerActivity.Y.f7043h.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.i.setVisibility(0);
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.LONG_FIELD_NUMBER /* 4 */:
                                                                                                                                                                        if (!playerActivity.f3654p0) {
                                                                                                                                                                            playerActivity.B0.J = true;
                                                                                                                                                                            playerActivity.Y.f7039c.setImageResource(fc.k.ic_lock);
                                                                                                                                                                            playerActivity.Y.f7037a.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7046l.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7038b.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7040d.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7047m.setVisibility(8);
                                                                                                                                                                            RecyclerView recyclerView = playerActivity.Z;
                                                                                                                                                                            if (recyclerView != null) {
                                                                                                                                                                                recyclerView.setVisibility(8);
                                                                                                                                                                            }
                                                                                                                                                                            playerActivity.f3654p0 = true;
                                                                                                                                                                        } else {
                                                                                                                                                                            playerActivity.B0.J = false;
                                                                                                                                                                            playerActivity.Y.f7039c.setImageResource(fc.k.ic_unlock);
                                                                                                                                                                            playerActivity.Y.f7037a.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7046l.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7038b.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7040d.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7047m.setVisibility(0);
                                                                                                                                                                            RecyclerView recyclerView2 = playerActivity.Z;
                                                                                                                                                                            if (recyclerView2 != null) {
                                                                                                                                                                                recyclerView2.setVisibility(0);
                                                                                                                                                                            }
                                                                                                                                                                            playerActivity.f3654p0 = false;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.STRING_FIELD_NUMBER /* 5 */:
                                                                                                                                                                        int resizeMode = playerActivity.f3644e0.getResizeMode();
                                                                                                                                                                        if (resizeMode == 0) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(3);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_crop);
                                                                                                                                                                            break;
                                                                                                                                                                        } else if (resizeMode == 3) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(4);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_fit);
                                                                                                                                                                            break;
                                                                                                                                                                        } else if (resizeMode == 4) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(0);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_fill);
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                                                                                                                                                        j0 j0Var2 = playerActivity.f3643d0;
                                                                                                                                                                        if (j0Var2 != null) {
                                                                                                                                                                            kc.o oVarT = kc.o.T(j0Var2, new b(playerActivity, i132));
                                                                                                                                                                            playerActivity.f3645f0 = oVarT;
                                                                                                                                                                            oVarT.R(playerActivity.o(), null);
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                                                                                                                                                        if (!playerActivity.f3653n0) {
                                                                                                                                                                            j0 j0Var3 = playerActivity.f3643d0;
                                                                                                                                                                            j0Var3.q0();
                                                                                                                                                                            playerActivity.f3657s0 = j0Var3.f1800w0;
                                                                                                                                                                            playerActivity.f3643d0.l0(0.0f);
                                                                                                                                                                            playerActivity.Y.f7040d.setImageResource(fc.k.volume_off_24px);
                                                                                                                                                                            playerActivity.f3653n0 = true;
                                                                                                                                                                        } else {
                                                                                                                                                                            playerActivity.f3643d0.l0(playerActivity.f3657s0);
                                                                                                                                                                            playerActivity.Y.f7040d.setImageResource(fc.k.volume_up_24px);
                                                                                                                                                                            playerActivity.f3653n0 = false;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                                                                                                                                                                        int i16 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.E();
                                                                                                                                                                        break;
                                                                                                                                                                    case 9:
                                                                                                                                                                        int i17 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.getClass();
                                                                                                                                                                        try {
                                                                                                                                                                            Intent intent = new Intent("android.intent.action.VIEW");
                                                                                                                                                                            intent.setData(Uri.parse(playerActivity.W.I));
                                                                                                                                                                            playerActivity.startActivity(intent);
                                                                                                                                                                        } catch (ActivityNotFoundException e7) {
                                                                                                                                                                            Toast.makeText(playerActivity, e7.getMessage(), 0).show();
                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    default:
                                                                                                                                                                        int i18 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.getClass();
                                                                                                                                                                        vc.a.z(playerActivity);
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        });
                                                                                                                                                        final int i15 = 3;
                                                                                                                                                        this.Y.f7043h.setOnClickListener(new View.OnClickListener(this) { // from class: gc.k

                                                                                                                                                            /* JADX INFO: renamed from: w, reason: collision with root package name */
                                                                                                                                                            public final /* synthetic */ PlayerActivity f5814w;

                                                                                                                                                            {
                                                                                                                                                                this.f5814w = this;
                                                                                                                                                            }

                                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                                            public final void onClick(View view2) {
                                                                                                                                                                int i122 = i15;
                                                                                                                                                                int i132 = 1;
                                                                                                                                                                PlayerActivity playerActivity = this.f5814w;
                                                                                                                                                                switch (i122) {
                                                                                                                                                                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                                                                                                                                        int i142 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.v();
                                                                                                                                                                        break;
                                                                                                                                                                    case 1:
                                                                                                                                                                        int i152 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.w();
                                                                                                                                                                        break;
                                                                                                                                                                    case 2:
                                                                                                                                                                        PlayerActivity playerActivity2 = this.f5814w;
                                                                                                                                                                        j0 j0Var = playerActivity2.f3643d0;
                                                                                                                                                                        if (j0Var != null) {
                                                                                                                                                                            playerActivity2.o0 = false;
                                                                                                                                                                            if (!playerActivity2.f3652m0) {
                                                                                                                                                                                j0Var.x();
                                                                                                                                                                                playerActivity2.Y.i.setVisibility(8);
                                                                                                                                                                                playerActivity2.Y.f7043h.setVisibility(0);
                                                                                                                                                                            } else {
                                                                                                                                                                                playerActivity2.z(playerActivity2.f3646g0, playerActivity2.f3647h0, playerActivity2.f3648i0, playerActivity2.f3649j0, null);
                                                                                                                                                                                playerActivity2.f3652m0 = false;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case 3:
                                                                                                                                                                        if (playerActivity.f3643d0 != null) {
                                                                                                                                                                            Log.e("Pro Pro", "pause button");
                                                                                                                                                                            playerActivity.f3643d0.w();
                                                                                                                                                                            playerActivity.o0 = true;
                                                                                                                                                                            playerActivity.Y.f7043h.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.i.setVisibility(0);
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.LONG_FIELD_NUMBER /* 4 */:
                                                                                                                                                                        if (!playerActivity.f3654p0) {
                                                                                                                                                                            playerActivity.B0.J = true;
                                                                                                                                                                            playerActivity.Y.f7039c.setImageResource(fc.k.ic_lock);
                                                                                                                                                                            playerActivity.Y.f7037a.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7046l.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7038b.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7040d.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7047m.setVisibility(8);
                                                                                                                                                                            RecyclerView recyclerView = playerActivity.Z;
                                                                                                                                                                            if (recyclerView != null) {
                                                                                                                                                                                recyclerView.setVisibility(8);
                                                                                                                                                                            }
                                                                                                                                                                            playerActivity.f3654p0 = true;
                                                                                                                                                                        } else {
                                                                                                                                                                            playerActivity.B0.J = false;
                                                                                                                                                                            playerActivity.Y.f7039c.setImageResource(fc.k.ic_unlock);
                                                                                                                                                                            playerActivity.Y.f7037a.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7046l.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7038b.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7040d.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7047m.setVisibility(0);
                                                                                                                                                                            RecyclerView recyclerView2 = playerActivity.Z;
                                                                                                                                                                            if (recyclerView2 != null) {
                                                                                                                                                                                recyclerView2.setVisibility(0);
                                                                                                                                                                            }
                                                                                                                                                                            playerActivity.f3654p0 = false;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.STRING_FIELD_NUMBER /* 5 */:
                                                                                                                                                                        int resizeMode = playerActivity.f3644e0.getResizeMode();
                                                                                                                                                                        if (resizeMode == 0) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(3);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_crop);
                                                                                                                                                                            break;
                                                                                                                                                                        } else if (resizeMode == 3) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(4);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_fit);
                                                                                                                                                                            break;
                                                                                                                                                                        } else if (resizeMode == 4) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(0);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_fill);
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                                                                                                                                                        j0 j0Var2 = playerActivity.f3643d0;
                                                                                                                                                                        if (j0Var2 != null) {
                                                                                                                                                                            kc.o oVarT = kc.o.T(j0Var2, new b(playerActivity, i132));
                                                                                                                                                                            playerActivity.f3645f0 = oVarT;
                                                                                                                                                                            oVarT.R(playerActivity.o(), null);
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                                                                                                                                                        if (!playerActivity.f3653n0) {
                                                                                                                                                                            j0 j0Var3 = playerActivity.f3643d0;
                                                                                                                                                                            j0Var3.q0();
                                                                                                                                                                            playerActivity.f3657s0 = j0Var3.f1800w0;
                                                                                                                                                                            playerActivity.f3643d0.l0(0.0f);
                                                                                                                                                                            playerActivity.Y.f7040d.setImageResource(fc.k.volume_off_24px);
                                                                                                                                                                            playerActivity.f3653n0 = true;
                                                                                                                                                                        } else {
                                                                                                                                                                            playerActivity.f3643d0.l0(playerActivity.f3657s0);
                                                                                                                                                                            playerActivity.Y.f7040d.setImageResource(fc.k.volume_up_24px);
                                                                                                                                                                            playerActivity.f3653n0 = false;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                                                                                                                                                                        int i16 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.E();
                                                                                                                                                                        break;
                                                                                                                                                                    case 9:
                                                                                                                                                                        int i17 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.getClass();
                                                                                                                                                                        try {
                                                                                                                                                                            Intent intent = new Intent("android.intent.action.VIEW");
                                                                                                                                                                            intent.setData(Uri.parse(playerActivity.W.I));
                                                                                                                                                                            playerActivity.startActivity(intent);
                                                                                                                                                                        } catch (ActivityNotFoundException e7) {
                                                                                                                                                                            Toast.makeText(playerActivity, e7.getMessage(), 0).show();
                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    default:
                                                                                                                                                                        int i18 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.getClass();
                                                                                                                                                                        vc.a.z(playerActivity);
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        });
                                                                                                                                                        final int i16 = 4;
                                                                                                                                                        this.Y.f7039c.setOnClickListener(new View.OnClickListener(this) { // from class: gc.k

                                                                                                                                                            /* JADX INFO: renamed from: w, reason: collision with root package name */
                                                                                                                                                            public final /* synthetic */ PlayerActivity f5814w;

                                                                                                                                                            {
                                                                                                                                                                this.f5814w = this;
                                                                                                                                                            }

                                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                                            public final void onClick(View view2) {
                                                                                                                                                                int i122 = i16;
                                                                                                                                                                int i132 = 1;
                                                                                                                                                                PlayerActivity playerActivity = this.f5814w;
                                                                                                                                                                switch (i122) {
                                                                                                                                                                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                                                                                                                                        int i142 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.v();
                                                                                                                                                                        break;
                                                                                                                                                                    case 1:
                                                                                                                                                                        int i152 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.w();
                                                                                                                                                                        break;
                                                                                                                                                                    case 2:
                                                                                                                                                                        PlayerActivity playerActivity2 = this.f5814w;
                                                                                                                                                                        j0 j0Var = playerActivity2.f3643d0;
                                                                                                                                                                        if (j0Var != null) {
                                                                                                                                                                            playerActivity2.o0 = false;
                                                                                                                                                                            if (!playerActivity2.f3652m0) {
                                                                                                                                                                                j0Var.x();
                                                                                                                                                                                playerActivity2.Y.i.setVisibility(8);
                                                                                                                                                                                playerActivity2.Y.f7043h.setVisibility(0);
                                                                                                                                                                            } else {
                                                                                                                                                                                playerActivity2.z(playerActivity2.f3646g0, playerActivity2.f3647h0, playerActivity2.f3648i0, playerActivity2.f3649j0, null);
                                                                                                                                                                                playerActivity2.f3652m0 = false;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case 3:
                                                                                                                                                                        if (playerActivity.f3643d0 != null) {
                                                                                                                                                                            Log.e("Pro Pro", "pause button");
                                                                                                                                                                            playerActivity.f3643d0.w();
                                                                                                                                                                            playerActivity.o0 = true;
                                                                                                                                                                            playerActivity.Y.f7043h.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.i.setVisibility(0);
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.LONG_FIELD_NUMBER /* 4 */:
                                                                                                                                                                        if (!playerActivity.f3654p0) {
                                                                                                                                                                            playerActivity.B0.J = true;
                                                                                                                                                                            playerActivity.Y.f7039c.setImageResource(fc.k.ic_lock);
                                                                                                                                                                            playerActivity.Y.f7037a.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7046l.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7038b.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7040d.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7047m.setVisibility(8);
                                                                                                                                                                            RecyclerView recyclerView = playerActivity.Z;
                                                                                                                                                                            if (recyclerView != null) {
                                                                                                                                                                                recyclerView.setVisibility(8);
                                                                                                                                                                            }
                                                                                                                                                                            playerActivity.f3654p0 = true;
                                                                                                                                                                        } else {
                                                                                                                                                                            playerActivity.B0.J = false;
                                                                                                                                                                            playerActivity.Y.f7039c.setImageResource(fc.k.ic_unlock);
                                                                                                                                                                            playerActivity.Y.f7037a.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7046l.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7038b.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7040d.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7047m.setVisibility(0);
                                                                                                                                                                            RecyclerView recyclerView2 = playerActivity.Z;
                                                                                                                                                                            if (recyclerView2 != null) {
                                                                                                                                                                                recyclerView2.setVisibility(0);
                                                                                                                                                                            }
                                                                                                                                                                            playerActivity.f3654p0 = false;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.STRING_FIELD_NUMBER /* 5 */:
                                                                                                                                                                        int resizeMode = playerActivity.f3644e0.getResizeMode();
                                                                                                                                                                        if (resizeMode == 0) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(3);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_crop);
                                                                                                                                                                            break;
                                                                                                                                                                        } else if (resizeMode == 3) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(4);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_fit);
                                                                                                                                                                            break;
                                                                                                                                                                        } else if (resizeMode == 4) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(0);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_fill);
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                                                                                                                                                        j0 j0Var2 = playerActivity.f3643d0;
                                                                                                                                                                        if (j0Var2 != null) {
                                                                                                                                                                            kc.o oVarT = kc.o.T(j0Var2, new b(playerActivity, i132));
                                                                                                                                                                            playerActivity.f3645f0 = oVarT;
                                                                                                                                                                            oVarT.R(playerActivity.o(), null);
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                                                                                                                                                        if (!playerActivity.f3653n0) {
                                                                                                                                                                            j0 j0Var3 = playerActivity.f3643d0;
                                                                                                                                                                            j0Var3.q0();
                                                                                                                                                                            playerActivity.f3657s0 = j0Var3.f1800w0;
                                                                                                                                                                            playerActivity.f3643d0.l0(0.0f);
                                                                                                                                                                            playerActivity.Y.f7040d.setImageResource(fc.k.volume_off_24px);
                                                                                                                                                                            playerActivity.f3653n0 = true;
                                                                                                                                                                        } else {
                                                                                                                                                                            playerActivity.f3643d0.l0(playerActivity.f3657s0);
                                                                                                                                                                            playerActivity.Y.f7040d.setImageResource(fc.k.volume_up_24px);
                                                                                                                                                                            playerActivity.f3653n0 = false;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                                                                                                                                                                        int i162 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.E();
                                                                                                                                                                        break;
                                                                                                                                                                    case 9:
                                                                                                                                                                        int i17 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.getClass();
                                                                                                                                                                        try {
                                                                                                                                                                            Intent intent = new Intent("android.intent.action.VIEW");
                                                                                                                                                                            intent.setData(Uri.parse(playerActivity.W.I));
                                                                                                                                                                            playerActivity.startActivity(intent);
                                                                                                                                                                        } catch (ActivityNotFoundException e7) {
                                                                                                                                                                            Toast.makeText(playerActivity, e7.getMessage(), 0).show();
                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    default:
                                                                                                                                                                        int i18 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.getClass();
                                                                                                                                                                        vc.a.z(playerActivity);
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        });
                                                                                                                                                        final int i17 = 5;
                                                                                                                                                        this.Y.f7045k.setOnClickListener(new View.OnClickListener(this) { // from class: gc.k

                                                                                                                                                            /* JADX INFO: renamed from: w, reason: collision with root package name */
                                                                                                                                                            public final /* synthetic */ PlayerActivity f5814w;

                                                                                                                                                            {
                                                                                                                                                                this.f5814w = this;
                                                                                                                                                            }

                                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                                            public final void onClick(View view2) {
                                                                                                                                                                int i122 = i17;
                                                                                                                                                                int i132 = 1;
                                                                                                                                                                PlayerActivity playerActivity = this.f5814w;
                                                                                                                                                                switch (i122) {
                                                                                                                                                                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                                                                                                                                        int i142 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.v();
                                                                                                                                                                        break;
                                                                                                                                                                    case 1:
                                                                                                                                                                        int i152 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.w();
                                                                                                                                                                        break;
                                                                                                                                                                    case 2:
                                                                                                                                                                        PlayerActivity playerActivity2 = this.f5814w;
                                                                                                                                                                        j0 j0Var = playerActivity2.f3643d0;
                                                                                                                                                                        if (j0Var != null) {
                                                                                                                                                                            playerActivity2.o0 = false;
                                                                                                                                                                            if (!playerActivity2.f3652m0) {
                                                                                                                                                                                j0Var.x();
                                                                                                                                                                                playerActivity2.Y.i.setVisibility(8);
                                                                                                                                                                                playerActivity2.Y.f7043h.setVisibility(0);
                                                                                                                                                                            } else {
                                                                                                                                                                                playerActivity2.z(playerActivity2.f3646g0, playerActivity2.f3647h0, playerActivity2.f3648i0, playerActivity2.f3649j0, null);
                                                                                                                                                                                playerActivity2.f3652m0 = false;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case 3:
                                                                                                                                                                        if (playerActivity.f3643d0 != null) {
                                                                                                                                                                            Log.e("Pro Pro", "pause button");
                                                                                                                                                                            playerActivity.f3643d0.w();
                                                                                                                                                                            playerActivity.o0 = true;
                                                                                                                                                                            playerActivity.Y.f7043h.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.i.setVisibility(0);
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.LONG_FIELD_NUMBER /* 4 */:
                                                                                                                                                                        if (!playerActivity.f3654p0) {
                                                                                                                                                                            playerActivity.B0.J = true;
                                                                                                                                                                            playerActivity.Y.f7039c.setImageResource(fc.k.ic_lock);
                                                                                                                                                                            playerActivity.Y.f7037a.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7046l.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7038b.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7040d.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7047m.setVisibility(8);
                                                                                                                                                                            RecyclerView recyclerView = playerActivity.Z;
                                                                                                                                                                            if (recyclerView != null) {
                                                                                                                                                                                recyclerView.setVisibility(8);
                                                                                                                                                                            }
                                                                                                                                                                            playerActivity.f3654p0 = true;
                                                                                                                                                                        } else {
                                                                                                                                                                            playerActivity.B0.J = false;
                                                                                                                                                                            playerActivity.Y.f7039c.setImageResource(fc.k.ic_unlock);
                                                                                                                                                                            playerActivity.Y.f7037a.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7046l.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7038b.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7040d.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7047m.setVisibility(0);
                                                                                                                                                                            RecyclerView recyclerView2 = playerActivity.Z;
                                                                                                                                                                            if (recyclerView2 != null) {
                                                                                                                                                                                recyclerView2.setVisibility(0);
                                                                                                                                                                            }
                                                                                                                                                                            playerActivity.f3654p0 = false;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.STRING_FIELD_NUMBER /* 5 */:
                                                                                                                                                                        int resizeMode = playerActivity.f3644e0.getResizeMode();
                                                                                                                                                                        if (resizeMode == 0) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(3);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_crop);
                                                                                                                                                                            break;
                                                                                                                                                                        } else if (resizeMode == 3) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(4);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_fit);
                                                                                                                                                                            break;
                                                                                                                                                                        } else if (resizeMode == 4) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(0);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_fill);
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                                                                                                                                                        j0 j0Var2 = playerActivity.f3643d0;
                                                                                                                                                                        if (j0Var2 != null) {
                                                                                                                                                                            kc.o oVarT = kc.o.T(j0Var2, new b(playerActivity, i132));
                                                                                                                                                                            playerActivity.f3645f0 = oVarT;
                                                                                                                                                                            oVarT.R(playerActivity.o(), null);
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                                                                                                                                                        if (!playerActivity.f3653n0) {
                                                                                                                                                                            j0 j0Var3 = playerActivity.f3643d0;
                                                                                                                                                                            j0Var3.q0();
                                                                                                                                                                            playerActivity.f3657s0 = j0Var3.f1800w0;
                                                                                                                                                                            playerActivity.f3643d0.l0(0.0f);
                                                                                                                                                                            playerActivity.Y.f7040d.setImageResource(fc.k.volume_off_24px);
                                                                                                                                                                            playerActivity.f3653n0 = true;
                                                                                                                                                                        } else {
                                                                                                                                                                            playerActivity.f3643d0.l0(playerActivity.f3657s0);
                                                                                                                                                                            playerActivity.Y.f7040d.setImageResource(fc.k.volume_up_24px);
                                                                                                                                                                            playerActivity.f3653n0 = false;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                                                                                                                                                                        int i162 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.E();
                                                                                                                                                                        break;
                                                                                                                                                                    case 9:
                                                                                                                                                                        int i172 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.getClass();
                                                                                                                                                                        try {
                                                                                                                                                                            Intent intent = new Intent("android.intent.action.VIEW");
                                                                                                                                                                            intent.setData(Uri.parse(playerActivity.W.I));
                                                                                                                                                                            playerActivity.startActivity(intent);
                                                                                                                                                                        } catch (ActivityNotFoundException e7) {
                                                                                                                                                                            Toast.makeText(playerActivity, e7.getMessage(), 0).show();
                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    default:
                                                                                                                                                                        int i18 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.getClass();
                                                                                                                                                                        vc.a.z(playerActivity);
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        });
                                                                                                                                                        final int i18 = 6;
                                                                                                                                                        this.Y.f.setOnClickListener(new View.OnClickListener(this) { // from class: gc.k

                                                                                                                                                            /* JADX INFO: renamed from: w, reason: collision with root package name */
                                                                                                                                                            public final /* synthetic */ PlayerActivity f5814w;

                                                                                                                                                            {
                                                                                                                                                                this.f5814w = this;
                                                                                                                                                            }

                                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                                            public final void onClick(View view2) {
                                                                                                                                                                int i122 = i18;
                                                                                                                                                                int i132 = 1;
                                                                                                                                                                PlayerActivity playerActivity = this.f5814w;
                                                                                                                                                                switch (i122) {
                                                                                                                                                                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                                                                                                                                        int i142 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.v();
                                                                                                                                                                        break;
                                                                                                                                                                    case 1:
                                                                                                                                                                        int i152 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.w();
                                                                                                                                                                        break;
                                                                                                                                                                    case 2:
                                                                                                                                                                        PlayerActivity playerActivity2 = this.f5814w;
                                                                                                                                                                        j0 j0Var = playerActivity2.f3643d0;
                                                                                                                                                                        if (j0Var != null) {
                                                                                                                                                                            playerActivity2.o0 = false;
                                                                                                                                                                            if (!playerActivity2.f3652m0) {
                                                                                                                                                                                j0Var.x();
                                                                                                                                                                                playerActivity2.Y.i.setVisibility(8);
                                                                                                                                                                                playerActivity2.Y.f7043h.setVisibility(0);
                                                                                                                                                                            } else {
                                                                                                                                                                                playerActivity2.z(playerActivity2.f3646g0, playerActivity2.f3647h0, playerActivity2.f3648i0, playerActivity2.f3649j0, null);
                                                                                                                                                                                playerActivity2.f3652m0 = false;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case 3:
                                                                                                                                                                        if (playerActivity.f3643d0 != null) {
                                                                                                                                                                            Log.e("Pro Pro", "pause button");
                                                                                                                                                                            playerActivity.f3643d0.w();
                                                                                                                                                                            playerActivity.o0 = true;
                                                                                                                                                                            playerActivity.Y.f7043h.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.i.setVisibility(0);
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.LONG_FIELD_NUMBER /* 4 */:
                                                                                                                                                                        if (!playerActivity.f3654p0) {
                                                                                                                                                                            playerActivity.B0.J = true;
                                                                                                                                                                            playerActivity.Y.f7039c.setImageResource(fc.k.ic_lock);
                                                                                                                                                                            playerActivity.Y.f7037a.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7046l.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7038b.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7040d.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7047m.setVisibility(8);
                                                                                                                                                                            RecyclerView recyclerView = playerActivity.Z;
                                                                                                                                                                            if (recyclerView != null) {
                                                                                                                                                                                recyclerView.setVisibility(8);
                                                                                                                                                                            }
                                                                                                                                                                            playerActivity.f3654p0 = true;
                                                                                                                                                                        } else {
                                                                                                                                                                            playerActivity.B0.J = false;
                                                                                                                                                                            playerActivity.Y.f7039c.setImageResource(fc.k.ic_unlock);
                                                                                                                                                                            playerActivity.Y.f7037a.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7046l.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7038b.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7040d.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7047m.setVisibility(0);
                                                                                                                                                                            RecyclerView recyclerView2 = playerActivity.Z;
                                                                                                                                                                            if (recyclerView2 != null) {
                                                                                                                                                                                recyclerView2.setVisibility(0);
                                                                                                                                                                            }
                                                                                                                                                                            playerActivity.f3654p0 = false;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.STRING_FIELD_NUMBER /* 5 */:
                                                                                                                                                                        int resizeMode = playerActivity.f3644e0.getResizeMode();
                                                                                                                                                                        if (resizeMode == 0) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(3);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_crop);
                                                                                                                                                                            break;
                                                                                                                                                                        } else if (resizeMode == 3) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(4);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_fit);
                                                                                                                                                                            break;
                                                                                                                                                                        } else if (resizeMode == 4) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(0);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_fill);
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                                                                                                                                                        j0 j0Var2 = playerActivity.f3643d0;
                                                                                                                                                                        if (j0Var2 != null) {
                                                                                                                                                                            kc.o oVarT = kc.o.T(j0Var2, new b(playerActivity, i132));
                                                                                                                                                                            playerActivity.f3645f0 = oVarT;
                                                                                                                                                                            oVarT.R(playerActivity.o(), null);
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                                                                                                                                                        if (!playerActivity.f3653n0) {
                                                                                                                                                                            j0 j0Var3 = playerActivity.f3643d0;
                                                                                                                                                                            j0Var3.q0();
                                                                                                                                                                            playerActivity.f3657s0 = j0Var3.f1800w0;
                                                                                                                                                                            playerActivity.f3643d0.l0(0.0f);
                                                                                                                                                                            playerActivity.Y.f7040d.setImageResource(fc.k.volume_off_24px);
                                                                                                                                                                            playerActivity.f3653n0 = true;
                                                                                                                                                                        } else {
                                                                                                                                                                            playerActivity.f3643d0.l0(playerActivity.f3657s0);
                                                                                                                                                                            playerActivity.Y.f7040d.setImageResource(fc.k.volume_up_24px);
                                                                                                                                                                            playerActivity.f3653n0 = false;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                                                                                                                                                                        int i162 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.E();
                                                                                                                                                                        break;
                                                                                                                                                                    case 9:
                                                                                                                                                                        int i172 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.getClass();
                                                                                                                                                                        try {
                                                                                                                                                                            Intent intent = new Intent("android.intent.action.VIEW");
                                                                                                                                                                            intent.setData(Uri.parse(playerActivity.W.I));
                                                                                                                                                                            playerActivity.startActivity(intent);
                                                                                                                                                                        } catch (ActivityNotFoundException e7) {
                                                                                                                                                                            Toast.makeText(playerActivity, e7.getMessage(), 0).show();
                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    default:
                                                                                                                                                                        int i182 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.getClass();
                                                                                                                                                                        vc.a.z(playerActivity);
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        });
                                                                                                                                                        final int i19 = 7;
                                                                                                                                                        this.Y.f7040d.setOnClickListener(new View.OnClickListener(this) { // from class: gc.k

                                                                                                                                                            /* JADX INFO: renamed from: w, reason: collision with root package name */
                                                                                                                                                            public final /* synthetic */ PlayerActivity f5814w;

                                                                                                                                                            {
                                                                                                                                                                this.f5814w = this;
                                                                                                                                                            }

                                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                                            public final void onClick(View view2) {
                                                                                                                                                                int i122 = i19;
                                                                                                                                                                int i132 = 1;
                                                                                                                                                                PlayerActivity playerActivity = this.f5814w;
                                                                                                                                                                switch (i122) {
                                                                                                                                                                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                                                                                                                                        int i142 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.v();
                                                                                                                                                                        break;
                                                                                                                                                                    case 1:
                                                                                                                                                                        int i152 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.w();
                                                                                                                                                                        break;
                                                                                                                                                                    case 2:
                                                                                                                                                                        PlayerActivity playerActivity2 = this.f5814w;
                                                                                                                                                                        j0 j0Var = playerActivity2.f3643d0;
                                                                                                                                                                        if (j0Var != null) {
                                                                                                                                                                            playerActivity2.o0 = false;
                                                                                                                                                                            if (!playerActivity2.f3652m0) {
                                                                                                                                                                                j0Var.x();
                                                                                                                                                                                playerActivity2.Y.i.setVisibility(8);
                                                                                                                                                                                playerActivity2.Y.f7043h.setVisibility(0);
                                                                                                                                                                            } else {
                                                                                                                                                                                playerActivity2.z(playerActivity2.f3646g0, playerActivity2.f3647h0, playerActivity2.f3648i0, playerActivity2.f3649j0, null);
                                                                                                                                                                                playerActivity2.f3652m0 = false;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case 3:
                                                                                                                                                                        if (playerActivity.f3643d0 != null) {
                                                                                                                                                                            Log.e("Pro Pro", "pause button");
                                                                                                                                                                            playerActivity.f3643d0.w();
                                                                                                                                                                            playerActivity.o0 = true;
                                                                                                                                                                            playerActivity.Y.f7043h.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.i.setVisibility(0);
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.LONG_FIELD_NUMBER /* 4 */:
                                                                                                                                                                        if (!playerActivity.f3654p0) {
                                                                                                                                                                            playerActivity.B0.J = true;
                                                                                                                                                                            playerActivity.Y.f7039c.setImageResource(fc.k.ic_lock);
                                                                                                                                                                            playerActivity.Y.f7037a.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7046l.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7038b.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7040d.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7047m.setVisibility(8);
                                                                                                                                                                            RecyclerView recyclerView = playerActivity.Z;
                                                                                                                                                                            if (recyclerView != null) {
                                                                                                                                                                                recyclerView.setVisibility(8);
                                                                                                                                                                            }
                                                                                                                                                                            playerActivity.f3654p0 = true;
                                                                                                                                                                        } else {
                                                                                                                                                                            playerActivity.B0.J = false;
                                                                                                                                                                            playerActivity.Y.f7039c.setImageResource(fc.k.ic_unlock);
                                                                                                                                                                            playerActivity.Y.f7037a.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7046l.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7038b.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7040d.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7047m.setVisibility(0);
                                                                                                                                                                            RecyclerView recyclerView2 = playerActivity.Z;
                                                                                                                                                                            if (recyclerView2 != null) {
                                                                                                                                                                                recyclerView2.setVisibility(0);
                                                                                                                                                                            }
                                                                                                                                                                            playerActivity.f3654p0 = false;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.STRING_FIELD_NUMBER /* 5 */:
                                                                                                                                                                        int resizeMode = playerActivity.f3644e0.getResizeMode();
                                                                                                                                                                        if (resizeMode == 0) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(3);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_crop);
                                                                                                                                                                            break;
                                                                                                                                                                        } else if (resizeMode == 3) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(4);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_fit);
                                                                                                                                                                            break;
                                                                                                                                                                        } else if (resizeMode == 4) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(0);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_fill);
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                                                                                                                                                        j0 j0Var2 = playerActivity.f3643d0;
                                                                                                                                                                        if (j0Var2 != null) {
                                                                                                                                                                            kc.o oVarT = kc.o.T(j0Var2, new b(playerActivity, i132));
                                                                                                                                                                            playerActivity.f3645f0 = oVarT;
                                                                                                                                                                            oVarT.R(playerActivity.o(), null);
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                                                                                                                                                        if (!playerActivity.f3653n0) {
                                                                                                                                                                            j0 j0Var3 = playerActivity.f3643d0;
                                                                                                                                                                            j0Var3.q0();
                                                                                                                                                                            playerActivity.f3657s0 = j0Var3.f1800w0;
                                                                                                                                                                            playerActivity.f3643d0.l0(0.0f);
                                                                                                                                                                            playerActivity.Y.f7040d.setImageResource(fc.k.volume_off_24px);
                                                                                                                                                                            playerActivity.f3653n0 = true;
                                                                                                                                                                        } else {
                                                                                                                                                                            playerActivity.f3643d0.l0(playerActivity.f3657s0);
                                                                                                                                                                            playerActivity.Y.f7040d.setImageResource(fc.k.volume_up_24px);
                                                                                                                                                                            playerActivity.f3653n0 = false;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                                                                                                                                                                        int i162 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.E();
                                                                                                                                                                        break;
                                                                                                                                                                    case 9:
                                                                                                                                                                        int i172 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.getClass();
                                                                                                                                                                        try {
                                                                                                                                                                            Intent intent = new Intent("android.intent.action.VIEW");
                                                                                                                                                                            intent.setData(Uri.parse(playerActivity.W.I));
                                                                                                                                                                            playerActivity.startActivity(intent);
                                                                                                                                                                        } catch (ActivityNotFoundException e7) {
                                                                                                                                                                            Toast.makeText(playerActivity, e7.getMessage(), 0).show();
                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    default:
                                                                                                                                                                        int i182 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.getClass();
                                                                                                                                                                        vc.a.z(playerActivity);
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        });
                                                                                                                                                        this.Y.f7044j.setOnClickListener(new View.OnClickListener(this) { // from class: gc.k

                                                                                                                                                            /* JADX INFO: renamed from: w, reason: collision with root package name */
                                                                                                                                                            public final /* synthetic */ PlayerActivity f5814w;

                                                                                                                                                            {
                                                                                                                                                                this.f5814w = this;
                                                                                                                                                            }

                                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                                            public final void onClick(View view2) {
                                                                                                                                                                int i122 = i12;
                                                                                                                                                                int i132 = 1;
                                                                                                                                                                PlayerActivity playerActivity = this.f5814w;
                                                                                                                                                                switch (i122) {
                                                                                                                                                                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                                                                                                                                        int i142 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.v();
                                                                                                                                                                        break;
                                                                                                                                                                    case 1:
                                                                                                                                                                        int i152 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.w();
                                                                                                                                                                        break;
                                                                                                                                                                    case 2:
                                                                                                                                                                        PlayerActivity playerActivity2 = this.f5814w;
                                                                                                                                                                        j0 j0Var = playerActivity2.f3643d0;
                                                                                                                                                                        if (j0Var != null) {
                                                                                                                                                                            playerActivity2.o0 = false;
                                                                                                                                                                            if (!playerActivity2.f3652m0) {
                                                                                                                                                                                j0Var.x();
                                                                                                                                                                                playerActivity2.Y.i.setVisibility(8);
                                                                                                                                                                                playerActivity2.Y.f7043h.setVisibility(0);
                                                                                                                                                                            } else {
                                                                                                                                                                                playerActivity2.z(playerActivity2.f3646g0, playerActivity2.f3647h0, playerActivity2.f3648i0, playerActivity2.f3649j0, null);
                                                                                                                                                                                playerActivity2.f3652m0 = false;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case 3:
                                                                                                                                                                        if (playerActivity.f3643d0 != null) {
                                                                                                                                                                            Log.e("Pro Pro", "pause button");
                                                                                                                                                                            playerActivity.f3643d0.w();
                                                                                                                                                                            playerActivity.o0 = true;
                                                                                                                                                                            playerActivity.Y.f7043h.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.i.setVisibility(0);
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.LONG_FIELD_NUMBER /* 4 */:
                                                                                                                                                                        if (!playerActivity.f3654p0) {
                                                                                                                                                                            playerActivity.B0.J = true;
                                                                                                                                                                            playerActivity.Y.f7039c.setImageResource(fc.k.ic_lock);
                                                                                                                                                                            playerActivity.Y.f7037a.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7046l.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7038b.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7040d.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7047m.setVisibility(8);
                                                                                                                                                                            RecyclerView recyclerView = playerActivity.Z;
                                                                                                                                                                            if (recyclerView != null) {
                                                                                                                                                                                recyclerView.setVisibility(8);
                                                                                                                                                                            }
                                                                                                                                                                            playerActivity.f3654p0 = true;
                                                                                                                                                                        } else {
                                                                                                                                                                            playerActivity.B0.J = false;
                                                                                                                                                                            playerActivity.Y.f7039c.setImageResource(fc.k.ic_unlock);
                                                                                                                                                                            playerActivity.Y.f7037a.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7046l.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7038b.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7040d.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7047m.setVisibility(0);
                                                                                                                                                                            RecyclerView recyclerView2 = playerActivity.Z;
                                                                                                                                                                            if (recyclerView2 != null) {
                                                                                                                                                                                recyclerView2.setVisibility(0);
                                                                                                                                                                            }
                                                                                                                                                                            playerActivity.f3654p0 = false;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.STRING_FIELD_NUMBER /* 5 */:
                                                                                                                                                                        int resizeMode = playerActivity.f3644e0.getResizeMode();
                                                                                                                                                                        if (resizeMode == 0) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(3);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_crop);
                                                                                                                                                                            break;
                                                                                                                                                                        } else if (resizeMode == 3) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(4);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_fit);
                                                                                                                                                                            break;
                                                                                                                                                                        } else if (resizeMode == 4) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(0);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_fill);
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                                                                                                                                                        j0 j0Var2 = playerActivity.f3643d0;
                                                                                                                                                                        if (j0Var2 != null) {
                                                                                                                                                                            kc.o oVarT = kc.o.T(j0Var2, new b(playerActivity, i132));
                                                                                                                                                                            playerActivity.f3645f0 = oVarT;
                                                                                                                                                                            oVarT.R(playerActivity.o(), null);
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                                                                                                                                                        if (!playerActivity.f3653n0) {
                                                                                                                                                                            j0 j0Var3 = playerActivity.f3643d0;
                                                                                                                                                                            j0Var3.q0();
                                                                                                                                                                            playerActivity.f3657s0 = j0Var3.f1800w0;
                                                                                                                                                                            playerActivity.f3643d0.l0(0.0f);
                                                                                                                                                                            playerActivity.Y.f7040d.setImageResource(fc.k.volume_off_24px);
                                                                                                                                                                            playerActivity.f3653n0 = true;
                                                                                                                                                                        } else {
                                                                                                                                                                            playerActivity.f3643d0.l0(playerActivity.f3657s0);
                                                                                                                                                                            playerActivity.Y.f7040d.setImageResource(fc.k.volume_up_24px);
                                                                                                                                                                            playerActivity.f3653n0 = false;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                                                                                                                                                                        int i162 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.E();
                                                                                                                                                                        break;
                                                                                                                                                                    case 9:
                                                                                                                                                                        int i172 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.getClass();
                                                                                                                                                                        try {
                                                                                                                                                                            Intent intent = new Intent("android.intent.action.VIEW");
                                                                                                                                                                            intent.setData(Uri.parse(playerActivity.W.I));
                                                                                                                                                                            playerActivity.startActivity(intent);
                                                                                                                                                                        } catch (ActivityNotFoundException e7) {
                                                                                                                                                                            Toast.makeText(playerActivity, e7.getMessage(), 0).show();
                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    default:
                                                                                                                                                                        int i182 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.getClass();
                                                                                                                                                                        vc.a.z(playerActivity);
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        });
                                                                                                                                                        this.B0 = new h(this, (hd.a) this.X.f7016o, this.f3644e0, this.f3643d0);
                                                                                                                                                        j().a(this.I0, this);
                                                                                                                                                        this.W = App.P;
                                                                                                                                                        RecyclerView recyclerView = new RecyclerView(this, null);
                                                                                                                                                        this.Z = recyclerView;
                                                                                                                                                        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                                                                                                                                                        this.X.f7007d.addView(this.Z);
                                                                                                                                                        Intent intent = getIntent();
                                                                                                                                                        this.f3664z0 = intent.getBooleanExtra("fromSplash", true);
                                                                                                                                                        x(intent);
                                                                                                                                                        String str = this.W.H;
                                                                                                                                                        if (str != null) {
                                                                                                                                                            this.X.f7004a.setText(str);
                                                                                                                                                            this.X.f7004a.setSelected(true);
                                                                                                                                                            final int i20 = 9;
                                                                                                                                                            ((MaterialCardView) this.X.f7010h).setOnClickListener(new View.OnClickListener(this) { // from class: gc.k

                                                                                                                                                                /* JADX INFO: renamed from: w, reason: collision with root package name */
                                                                                                                                                                public final /* synthetic */ PlayerActivity f5814w;

                                                                                                                                                                {
                                                                                                                                                                    this.f5814w = this;
                                                                                                                                                                }

                                                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                                                public final void onClick(View view2) {
                                                                                                                                                                    int i122 = i20;
                                                                                                                                                                    int i132 = 1;
                                                                                                                                                                    PlayerActivity playerActivity = this.f5814w;
                                                                                                                                                                    switch (i122) {
                                                                                                                                                                        case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                                                                                                                                            int i142 = PlayerActivity.J0;
                                                                                                                                                                            playerActivity.v();
                                                                                                                                                                            break;
                                                                                                                                                                        case 1:
                                                                                                                                                                            int i152 = PlayerActivity.J0;
                                                                                                                                                                            playerActivity.w();
                                                                                                                                                                            break;
                                                                                                                                                                        case 2:
                                                                                                                                                                            PlayerActivity playerActivity2 = this.f5814w;
                                                                                                                                                                            j0 j0Var = playerActivity2.f3643d0;
                                                                                                                                                                            if (j0Var != null) {
                                                                                                                                                                                playerActivity2.o0 = false;
                                                                                                                                                                                if (!playerActivity2.f3652m0) {
                                                                                                                                                                                    j0Var.x();
                                                                                                                                                                                    playerActivity2.Y.i.setVisibility(8);
                                                                                                                                                                                    playerActivity2.Y.f7043h.setVisibility(0);
                                                                                                                                                                                } else {
                                                                                                                                                                                    playerActivity2.z(playerActivity2.f3646g0, playerActivity2.f3647h0, playerActivity2.f3648i0, playerActivity2.f3649j0, null);
                                                                                                                                                                                    playerActivity2.f3652m0 = false;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            break;
                                                                                                                                                                        case 3:
                                                                                                                                                                            if (playerActivity.f3643d0 != null) {
                                                                                                                                                                                Log.e("Pro Pro", "pause button");
                                                                                                                                                                                playerActivity.f3643d0.w();
                                                                                                                                                                                playerActivity.o0 = true;
                                                                                                                                                                                playerActivity.Y.f7043h.setVisibility(8);
                                                                                                                                                                                playerActivity.Y.i.setVisibility(0);
                                                                                                                                                                            }
                                                                                                                                                                            break;
                                                                                                                                                                        case g1.g.LONG_FIELD_NUMBER /* 4 */:
                                                                                                                                                                            if (!playerActivity.f3654p0) {
                                                                                                                                                                                playerActivity.B0.J = true;
                                                                                                                                                                                playerActivity.Y.f7039c.setImageResource(fc.k.ic_lock);
                                                                                                                                                                                playerActivity.Y.f7037a.setVisibility(8);
                                                                                                                                                                                playerActivity.Y.f7046l.setVisibility(8);
                                                                                                                                                                                playerActivity.Y.f7038b.setVisibility(8);
                                                                                                                                                                                playerActivity.Y.f7040d.setVisibility(8);
                                                                                                                                                                                playerActivity.Y.f7047m.setVisibility(8);
                                                                                                                                                                                RecyclerView recyclerView2 = playerActivity.Z;
                                                                                                                                                                                if (recyclerView2 != null) {
                                                                                                                                                                                    recyclerView2.setVisibility(8);
                                                                                                                                                                                }
                                                                                                                                                                                playerActivity.f3654p0 = true;
                                                                                                                                                                            } else {
                                                                                                                                                                                playerActivity.B0.J = false;
                                                                                                                                                                                playerActivity.Y.f7039c.setImageResource(fc.k.ic_unlock);
                                                                                                                                                                                playerActivity.Y.f7037a.setVisibility(0);
                                                                                                                                                                                playerActivity.Y.f7046l.setVisibility(0);
                                                                                                                                                                                playerActivity.Y.f7038b.setVisibility(0);
                                                                                                                                                                                playerActivity.Y.f7040d.setVisibility(0);
                                                                                                                                                                                playerActivity.Y.f7047m.setVisibility(0);
                                                                                                                                                                                RecyclerView recyclerView22 = playerActivity.Z;
                                                                                                                                                                                if (recyclerView22 != null) {
                                                                                                                                                                                    recyclerView22.setVisibility(0);
                                                                                                                                                                                }
                                                                                                                                                                                playerActivity.f3654p0 = false;
                                                                                                                                                                            }
                                                                                                                                                                            break;
                                                                                                                                                                        case g1.g.STRING_FIELD_NUMBER /* 5 */:
                                                                                                                                                                            int resizeMode = playerActivity.f3644e0.getResizeMode();
                                                                                                                                                                            if (resizeMode == 0) {
                                                                                                                                                                                playerActivity.f3644e0.setResizeMode(3);
                                                                                                                                                                                playerActivity.Y.f7045k.setImageResource(fc.k.mode_crop);
                                                                                                                                                                                break;
                                                                                                                                                                            } else if (resizeMode == 3) {
                                                                                                                                                                                playerActivity.f3644e0.setResizeMode(4);
                                                                                                                                                                                playerActivity.Y.f7045k.setImageResource(fc.k.mode_fit);
                                                                                                                                                                                break;
                                                                                                                                                                            } else if (resizeMode == 4) {
                                                                                                                                                                                playerActivity.f3644e0.setResizeMode(0);
                                                                                                                                                                                playerActivity.Y.f7045k.setImageResource(fc.k.mode_fill);
                                                                                                                                                                                break;
                                                                                                                                                                            }
                                                                                                                                                                            break;
                                                                                                                                                                        case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                                                                                                                                                            j0 j0Var2 = playerActivity.f3643d0;
                                                                                                                                                                            if (j0Var2 != null) {
                                                                                                                                                                                kc.o oVarT = kc.o.T(j0Var2, new b(playerActivity, i132));
                                                                                                                                                                                playerActivity.f3645f0 = oVarT;
                                                                                                                                                                                oVarT.R(playerActivity.o(), null);
                                                                                                                                                                            }
                                                                                                                                                                            break;
                                                                                                                                                                        case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                                                                                                                                                            if (!playerActivity.f3653n0) {
                                                                                                                                                                                j0 j0Var3 = playerActivity.f3643d0;
                                                                                                                                                                                j0Var3.q0();
                                                                                                                                                                                playerActivity.f3657s0 = j0Var3.f1800w0;
                                                                                                                                                                                playerActivity.f3643d0.l0(0.0f);
                                                                                                                                                                                playerActivity.Y.f7040d.setImageResource(fc.k.volume_off_24px);
                                                                                                                                                                                playerActivity.f3653n0 = true;
                                                                                                                                                                            } else {
                                                                                                                                                                                playerActivity.f3643d0.l0(playerActivity.f3657s0);
                                                                                                                                                                                playerActivity.Y.f7040d.setImageResource(fc.k.volume_up_24px);
                                                                                                                                                                                playerActivity.f3653n0 = false;
                                                                                                                                                                            }
                                                                                                                                                                            break;
                                                                                                                                                                        case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                                                                                                                                                                            int i162 = PlayerActivity.J0;
                                                                                                                                                                            playerActivity.E();
                                                                                                                                                                            break;
                                                                                                                                                                        case 9:
                                                                                                                                                                            int i172 = PlayerActivity.J0;
                                                                                                                                                                            playerActivity.getClass();
                                                                                                                                                                            try {
                                                                                                                                                                                Intent intent2 = new Intent("android.intent.action.VIEW");
                                                                                                                                                                                intent2.setData(Uri.parse(playerActivity.W.I));
                                                                                                                                                                                playerActivity.startActivity(intent2);
                                                                                                                                                                            } catch (ActivityNotFoundException e7) {
                                                                                                                                                                                Toast.makeText(playerActivity, e7.getMessage(), 0).show();
                                                                                                                                                                                return;
                                                                                                                                                                            }
                                                                                                                                                                            break;
                                                                                                                                                                        default:
                                                                                                                                                                            int i182 = PlayerActivity.J0;
                                                                                                                                                                            playerActivity.getClass();
                                                                                                                                                                            vc.a.z(playerActivity);
                                                                                                                                                                            break;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            });
                                                                                                                                                        }
                                                                                                                                                        ((TextView) this.X.i).setText(this.W.M);
                                                                                                                                                        final int i21 = 10;
                                                                                                                                                        ((ImageButton) this.X.f7015n).setOnClickListener(new View.OnClickListener(this) { // from class: gc.k

                                                                                                                                                            /* JADX INFO: renamed from: w, reason: collision with root package name */
                                                                                                                                                            public final /* synthetic */ PlayerActivity f5814w;

                                                                                                                                                            {
                                                                                                                                                                this.f5814w = this;
                                                                                                                                                            }

                                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                                            public final void onClick(View view2) {
                                                                                                                                                                int i122 = i21;
                                                                                                                                                                int i132 = 1;
                                                                                                                                                                PlayerActivity playerActivity = this.f5814w;
                                                                                                                                                                switch (i122) {
                                                                                                                                                                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                                                                                                                                        int i142 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.v();
                                                                                                                                                                        break;
                                                                                                                                                                    case 1:
                                                                                                                                                                        int i152 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.w();
                                                                                                                                                                        break;
                                                                                                                                                                    case 2:
                                                                                                                                                                        PlayerActivity playerActivity2 = this.f5814w;
                                                                                                                                                                        j0 j0Var = playerActivity2.f3643d0;
                                                                                                                                                                        if (j0Var != null) {
                                                                                                                                                                            playerActivity2.o0 = false;
                                                                                                                                                                            if (!playerActivity2.f3652m0) {
                                                                                                                                                                                j0Var.x();
                                                                                                                                                                                playerActivity2.Y.i.setVisibility(8);
                                                                                                                                                                                playerActivity2.Y.f7043h.setVisibility(0);
                                                                                                                                                                            } else {
                                                                                                                                                                                playerActivity2.z(playerActivity2.f3646g0, playerActivity2.f3647h0, playerActivity2.f3648i0, playerActivity2.f3649j0, null);
                                                                                                                                                                                playerActivity2.f3652m0 = false;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case 3:
                                                                                                                                                                        if (playerActivity.f3643d0 != null) {
                                                                                                                                                                            Log.e("Pro Pro", "pause button");
                                                                                                                                                                            playerActivity.f3643d0.w();
                                                                                                                                                                            playerActivity.o0 = true;
                                                                                                                                                                            playerActivity.Y.f7043h.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.i.setVisibility(0);
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.LONG_FIELD_NUMBER /* 4 */:
                                                                                                                                                                        if (!playerActivity.f3654p0) {
                                                                                                                                                                            playerActivity.B0.J = true;
                                                                                                                                                                            playerActivity.Y.f7039c.setImageResource(fc.k.ic_lock);
                                                                                                                                                                            playerActivity.Y.f7037a.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7046l.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7038b.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7040d.setVisibility(8);
                                                                                                                                                                            playerActivity.Y.f7047m.setVisibility(8);
                                                                                                                                                                            RecyclerView recyclerView2 = playerActivity.Z;
                                                                                                                                                                            if (recyclerView2 != null) {
                                                                                                                                                                                recyclerView2.setVisibility(8);
                                                                                                                                                                            }
                                                                                                                                                                            playerActivity.f3654p0 = true;
                                                                                                                                                                        } else {
                                                                                                                                                                            playerActivity.B0.J = false;
                                                                                                                                                                            playerActivity.Y.f7039c.setImageResource(fc.k.ic_unlock);
                                                                                                                                                                            playerActivity.Y.f7037a.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7046l.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7038b.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7040d.setVisibility(0);
                                                                                                                                                                            playerActivity.Y.f7047m.setVisibility(0);
                                                                                                                                                                            RecyclerView recyclerView22 = playerActivity.Z;
                                                                                                                                                                            if (recyclerView22 != null) {
                                                                                                                                                                                recyclerView22.setVisibility(0);
                                                                                                                                                                            }
                                                                                                                                                                            playerActivity.f3654p0 = false;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.STRING_FIELD_NUMBER /* 5 */:
                                                                                                                                                                        int resizeMode = playerActivity.f3644e0.getResizeMode();
                                                                                                                                                                        if (resizeMode == 0) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(3);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_crop);
                                                                                                                                                                            break;
                                                                                                                                                                        } else if (resizeMode == 3) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(4);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_fit);
                                                                                                                                                                            break;
                                                                                                                                                                        } else if (resizeMode == 4) {
                                                                                                                                                                            playerActivity.f3644e0.setResizeMode(0);
                                                                                                                                                                            playerActivity.Y.f7045k.setImageResource(fc.k.mode_fill);
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                                                                                                                                                        j0 j0Var2 = playerActivity.f3643d0;
                                                                                                                                                                        if (j0Var2 != null) {
                                                                                                                                                                            kc.o oVarT = kc.o.T(j0Var2, new b(playerActivity, i132));
                                                                                                                                                                            playerActivity.f3645f0 = oVarT;
                                                                                                                                                                            oVarT.R(playerActivity.o(), null);
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                                                                                                                                                        if (!playerActivity.f3653n0) {
                                                                                                                                                                            j0 j0Var3 = playerActivity.f3643d0;
                                                                                                                                                                            j0Var3.q0();
                                                                                                                                                                            playerActivity.f3657s0 = j0Var3.f1800w0;
                                                                                                                                                                            playerActivity.f3643d0.l0(0.0f);
                                                                                                                                                                            playerActivity.Y.f7040d.setImageResource(fc.k.volume_off_24px);
                                                                                                                                                                            playerActivity.f3653n0 = true;
                                                                                                                                                                        } else {
                                                                                                                                                                            playerActivity.f3643d0.l0(playerActivity.f3657s0);
                                                                                                                                                                            playerActivity.Y.f7040d.setImageResource(fc.k.volume_up_24px);
                                                                                                                                                                            playerActivity.f3653n0 = false;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                                                                                                                                                                        int i162 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.E();
                                                                                                                                                                        break;
                                                                                                                                                                    case 9:
                                                                                                                                                                        int i172 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.getClass();
                                                                                                                                                                        try {
                                                                                                                                                                            Intent intent2 = new Intent("android.intent.action.VIEW");
                                                                                                                                                                            intent2.setData(Uri.parse(playerActivity.W.I));
                                                                                                                                                                            playerActivity.startActivity(intent2);
                                                                                                                                                                        } catch (ActivityNotFoundException e7) {
                                                                                                                                                                            Toast.makeText(playerActivity, e7.getMessage(), 0).show();
                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    default:
                                                                                                                                                                        int i182 = PlayerActivity.J0;
                                                                                                                                                                        playerActivity.getClass();
                                                                                                                                                                        vc.a.z(playerActivity);
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        });
                                                                                                                                                        this.f3660v0 = ((RelativeLayout) this.X.f7012k).getLayoutParams().height;
                                                                                                                                                        if (getResources().getConfiguration().orientation != 2) {
                                                                                                                                                            vc.a.B(this);
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        E();
                                                                                                                                                        this.f3656r0 = true;
                                                                                                                                                        this.Y.f7044j.setClickable(false);
                                                                                                                                                        this.Y.f7044j.setFocusable(false);
                                                                                                                                                        this.Y.f7044j.setEnabled(false);
                                                                                                                                                        this.Y.f7044j.setAlpha(0.5f);
                                                                                                                                                        F(this.Y.f7042g);
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i11)));
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // h.j, android.app.Activity
    public final void onDestroy() {
        j0 j0Var = this.f3643d0;
        if (j0Var != null) {
            j0Var.b0();
        }
        this.X = null;
        super.onDestroy();
    }

    @Override // c.j, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        x(intent);
    }

    @Override // h.j, android.app.Activity
    public final void onPause() {
        j0 j0Var;
        if (!(Build.VERSION.SDK_INT >= 24 ? isInPictureInPictureMode() : false) && (j0Var = this.f3643d0) != null && !this.o0) {
            j0Var.w();
        }
        this.W.K = null;
        super.onPause();
    }

    @Override // c.j, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        super.onPictureInPictureModeChanged(z2, configuration);
        if (z2) {
            kc.o oVar = this.f3645f0;
            if (oVar != null) {
                oVar.P(false, false);
            }
            this.f3644e0.b();
            this.f3644e0.setControllerAutoShow(false);
            if (!this.f3655q0) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((RelativeLayout) this.X.f7012k).getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                ((RelativeLayout) this.X.f7012k).setLayoutParams(layoutParams);
            }
            ((TextView) this.X.i).setVisibility(8);
            return;
        }
        if (!this.f3655q0) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) ((RelativeLayout) this.X.f7012k).getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = this.f3660v0;
            ((RelativeLayout) this.X.f7012k).setLayoutParams(layoutParams2);
        }
        j0 j0Var = this.f3643d0;
        if (j0Var != null) {
            j0Var.w();
            int iS = this.f3643d0.S();
            if (iS == 1 || iS == 3) {
                ((TextView) this.X.i).setVisibility(0);
            }
        }
        this.f3644e0.setControllerAutoShow(true);
    }

    @Override // h.j, android.app.Activity
    public final void onResume() {
        j0 j0Var = this.f3643d0;
        if (j0Var != null && !this.f3652m0 && !this.o0) {
            j0Var.x();
        }
        b.a(this);
        super.onResume();
    }

    @Override // c.j, android.app.Activity
    public final void onUserLeaveHint() {
        if (this.f3663y0) {
            w();
        }
        super.onUserLeaveHint();
    }

    public final void v() {
        if (this.Y.f7044j.getVisibility() == 0 && this.f3655q0 && !this.f3656r0) {
            E();
            return;
        }
        j0 j0Var = this.f3643d0;
        if (j0Var != null) {
            j0Var.b0();
        }
        if (this.f3664z0) {
            finish();
            return;
        }
        vc.a.j(this).edit().putBoolean("is_tv", false).apply();
        if (this.E0 == null) {
            startActivity(new Intent(this, (Class<?>) SplashActivity.class));
            finish();
            return;
        }
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            int longVersionCode = Build.VERSION.SDK_INT >= 29 ? (int) packageInfo.getLongVersionCode() : packageInfo.versionCode;
            if (this.E0.f10482q != longVersionCode) {
                ((RelativeLayout) this.X.f7012k).setVisibility(8);
                ((FragmentContainerView) this.X.f7019r).setVisibility(0);
                wc.b bVar = (wc.b) new a7.j(this).p(wc.b.class);
                bVar.i = longVersionCode;
                bVar.f14025h = this.F0;
                bVar.f14023e = this.E0.f;
                bVar.f14022d = new i(this, 4);
                z zVar = new z();
                q0 q0VarO = o();
                q0VarO.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(q0VarO);
                aVar.h(l.update_fragment_container, zVar);
                aVar.d(false);
                return;
            }
        } catch (PackageManager.NameNotFoundException e7) {
            e7.printStackTrace();
        }
        startActivity(new Intent(this, (Class<?>) MainActivity.class));
        finish();
    }

    public final void w() {
        if (this.f3643d0 == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        try {
            if (getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
                q.p();
                PictureInPictureParams.Builder builderB = q.b();
                builderB.setAspectRatio(new Rational(16, 9));
                Rect rect = new Rect();
                ((RelativeLayout) this.X.f7012k).getGlobalVisibleRect(rect);
                builderB.setSourceRectHint(rect);
                enterPictureInPictureMode(builderB.build());
            }
        } catch (Exception unused) {
        }
    }

    public final void x(Intent intent) {
        Handler handler = this.H0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.H0 = null;
        }
        App app = this.W;
        pc.e eVar = app.F;
        int i = 0;
        if (eVar != null) {
            app.F = null;
            com.bumptech.glide.b.b(this).c(this).n(eVar.f).v((ImageView) this.X.f7017p);
            com.bumptech.glide.b.b(this).c(this).n(eVar.f10502g).v((ImageView) this.X.f7018q);
            String str = eVar.f10504j;
            String str2 = eVar.i;
            if (vc.a.q(str, str2)) {
                jc.a aVar = this.X;
                if (aVar != null) {
                    ((TextView) aVar.f7011j).setVisibility(8);
                    ((LottieAnimationView) this.X.f7009g).setVisibility(0);
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) this.X.f7009g;
                    lottieAnimationView.I.add(j5.h.A);
                    lottieAnimationView.C.l();
                }
            } else {
                ((TextView) this.X.f7011j).setVisibility(0);
                ((LottieAnimationView) this.X.f7009g).setVisibility(8);
                if (vc.a.p(str, str2)) {
                    try {
                        long jE = vc.a.e(str, str2);
                        Handler handler2 = new Handler(Looper.getMainLooper());
                        this.H0 = handler2;
                        handler2.postDelayed(new gc.h(this, i), jE - System.currentTimeMillis());
                    } catch (ParseException unused) {
                    }
                }
            }
            this.X.f7006c.setVisibility(0);
        } else {
            this.X.f7006c.setVisibility(8);
        }
        int i10 = 1;
        if (intent.hasExtra("links_model")) {
            pc.h hVar = Build.VERSION.SDK_INT > 33 ? (pc.h) intent.getParcelableExtra("links_model", pc.h.class) : (pc.h) intent.getParcelableExtra("links_model");
            if (hVar != null) {
                this.f3646g0 = hVar.f10523w;
                this.f3647h0 = hVar.f10524x;
                this.f3659u0 = hVar.A;
                this.f3649j0 = hVar.f10526z;
                this.f3651l0 = hVar.B;
            } else {
                this.f3646g0 = "https://pro.com";
            }
            this.f3650k0 = "";
            z(this.f3646g0, this.f3647h0, this.f3648i0, this.f3649j0, null);
        } else if (intent.getData() != null) {
            vc.a.B(this);
            this.Y.f7044j.setVisibility(0);
            E();
            String string = intent.getData().toString();
            b8.h.K(vc.a.h(this) + "app.txt", false, null, null, new i(this, 3));
            String lowerCase = string.toLowerCase();
            StringBuilder sb2 = new StringBuilder(string);
            if (lowerCase.contains("|") && lowerCase.contains("drmlicense=")) {
                String[] strArrSplit = string.split("\\|");
                ArrayList arrayListL = vc.a.l(strArrSplit[1], "drmlicense");
                StringBuilder sb3 = new StringBuilder(strArrSplit[0] + "|" + ((String) arrayListL.get(0)));
                if (!TextUtils.isEmpty((CharSequence) arrayListL.get(1))) {
                    this.f3647h0 = (String) arrayListL.get(1);
                }
                sb2 = sb3;
            }
            if (lowerCase.contains("|") && lowerCase.contains("drmscheme=")) {
                String[] strArrSplit2 = sb2.toString().split("\\|");
                ArrayList arrayListL2 = vc.a.l(strArrSplit2[1], "drmscheme");
                sb2 = new StringBuilder(strArrSplit2[0] + "|" + ((String) arrayListL2.get(0)));
                if (!TextUtils.isEmpty((CharSequence) arrayListL2.get(1))) {
                    String lowerCase2 = ((String) arrayListL2.get(1)).toLowerCase();
                    lowerCase2.getClass();
                    this.f3659u0 = !lowerCase2.equals("widevine") ? !lowerCase2.equals("clearkey") ? 2 : 0 : 1;
                }
            }
            String string2 = sb2.toString();
            if (string2.indexOf("|") + 1 >= string2.length()) {
                sb2 = new StringBuilder(string2.split("\\|")[0]);
            }
            this.f3664z0 = false;
            String string3 = sb2.toString();
            this.f3646g0 = string3;
            this.f3648i0 = null;
            this.f3649j0 = null;
            this.f3651l0 = true;
            z(string3, this.f3647h0, null, null, null);
        } else {
            this.f3650k0 = intent.hasExtra("title") ? intent.getStringExtra("title") : "";
            boolean booleanExtra = intent.getBooleanExtra("isEncoded", true);
            String stringExtra = intent.getStringExtra("links");
            this.f3658t0 = intent.getIntExtra("position", 0);
            if (!this.f3664z0) {
                vc.a.k(this).putInt("player_called", -1).apply();
            }
            this.W.G = stringExtra;
            C(stringExtra, booleanExtra);
        }
        this.Z.setVisibility(8);
        if (!this.f3656r0) {
            n nVar = this.G0;
            if (nVar == null) {
                this.G0 = new n();
                q0 q0VarO = o();
                q0VarO.getClass();
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(q0VarO);
                aVar2.e(l.fragment_container, this.G0, null, 1);
                aVar2.d(false);
            } else {
                nVar.Q();
            }
        }
        vc.a.A(this);
        new Handler(Looper.getMainLooper()).postDelayed(new gc.h(this, i10), 500L);
    }

    public final t1.z y(String str, String str2, String str3) {
        w wVar;
        if (str3 != null && !TextUtils.isEmpty(str3)) {
            j0 j0VarA = new s(this).a();
            this.f3643d0 = j0VarA;
            this.f3644e0.setPlayer(j0VarA);
            android.support.v4.media.session.b.o(this, str3, this.f3662x0);
            return null;
        }
        boolean z2 = true;
        if (!TextUtils.isEmpty(str2)) {
            int i = this.f3659u0;
            UUID uuid = i != 0 ? i != 1 ? t1.e.f11983e : t1.e.f11982d : t1.e.f11981c;
            if (!str2.contains("http")) {
                t1.q qVar = new t1.q();
                qVar.f12079a = str != null ? Uri.parse(str) : null;
                qVar.b(new u(new p(uuid)));
                return qVar.a();
            }
            t1.q qVar2 = new t1.q();
            qVar2.f12079a = str != null ? Uri.parse(str) : null;
            p pVar = new p(uuid);
            pVar.f9504x = Uri.parse(str2);
            pVar.f9503w = uuid;
            qVar2.b(new u(pVar));
            return qVar2.a();
        }
        r rVar = new r();
        p pVar2 = new p();
        List list = Collections.EMPTY_LIST;
        z0 z0Var = z0.f14637z;
        t tVar = new t();
        x xVar = x.f12153a;
        Uri uri = str == null ? null : Uri.parse(str);
        String strI = vc.a.i(str);
        if (((Uri) pVar2.f9504x) != null && ((UUID) pVar2.f9503w) == null) {
            z2 = false;
        }
        w1.a.j(z2);
        if (uri != null) {
            wVar = new w(uri, strI, ((UUID) pVar2.f9503w) != null ? new u(pVar2) : null, list, z0Var, -9223372036854775807L);
        } else {
            wVar = null;
        }
        return new t1.z("", new t1.t(rVar), wVar, new v(tVar), c0.B, xVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0115 A[Catch: Exception -> 0x0055, TryCatch #0 {Exception -> 0x0055, blocks: (B:11:0x003b, B:13:0x004b, B:15:0x0051, B:21:0x0072, B:24:0x007c, B:36:0x0107, B:38:0x0115, B:40:0x013a, B:43:0x01af, B:45:0x01ba, B:47:0x01c2, B:49:0x01ca, B:51:0x01d3, B:54:0x01d9, B:58:0x01e3, B:60:0x01f6, B:61:0x01fc, B:56:0x01dd, B:57:0x01e0, B:50:0x01cf, B:62:0x0234, B:64:0x023a, B:65:0x024f, B:66:0x0254, B:67:0x0255, B:69:0x0277, B:70:0x0281, B:71:0x0286, B:39:0x0120, B:27:0x00ee, B:29:0x00f6, B:32:0x0100, B:18:0x0058, B:20:0x0060), top: B:82:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0120 A[Catch: Exception -> 0x0055, TryCatch #0 {Exception -> 0x0055, blocks: (B:11:0x003b, B:13:0x004b, B:15:0x0051, B:21:0x0072, B:24:0x007c, B:36:0x0107, B:38:0x0115, B:40:0x013a, B:43:0x01af, B:45:0x01ba, B:47:0x01c2, B:49:0x01ca, B:51:0x01d3, B:54:0x01d9, B:58:0x01e3, B:60:0x01f6, B:61:0x01fc, B:56:0x01dd, B:57:0x01e0, B:50:0x01cf, B:62:0x0234, B:64:0x023a, B:65:0x024f, B:66:0x0254, B:67:0x0255, B:69:0x0277, B:70:0x0281, B:71:0x0286, B:39:0x0120, B:27:0x00ee, B:29:0x00f6, B:32:0x0100, B:18:0x0058, B:20:0x0060), top: B:82:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01af A[Catch: Exception -> 0x0055, TRY_ENTER, TryCatch #0 {Exception -> 0x0055, blocks: (B:11:0x003b, B:13:0x004b, B:15:0x0051, B:21:0x0072, B:24:0x007c, B:36:0x0107, B:38:0x0115, B:40:0x013a, B:43:0x01af, B:45:0x01ba, B:47:0x01c2, B:49:0x01ca, B:51:0x01d3, B:54:0x01d9, B:58:0x01e3, B:60:0x01f6, B:61:0x01fc, B:56:0x01dd, B:57:0x01e0, B:50:0x01cf, B:62:0x0234, B:64:0x023a, B:65:0x024f, B:66:0x0254, B:67:0x0255, B:69:0x0277, B:70:0x0281, B:71:0x0286, B:39:0x0120, B:27:0x00ee, B:29:0x00f6, B:32:0x0100, B:18:0x0058, B:20:0x0060), top: B:82:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0255 A[Catch: Exception -> 0x0055, TryCatch #0 {Exception -> 0x0055, blocks: (B:11:0x003b, B:13:0x004b, B:15:0x0051, B:21:0x0072, B:24:0x007c, B:36:0x0107, B:38:0x0115, B:40:0x013a, B:43:0x01af, B:45:0x01ba, B:47:0x01c2, B:49:0x01ca, B:51:0x01d3, B:54:0x01d9, B:58:0x01e3, B:60:0x01f6, B:61:0x01fc, B:56:0x01dd, B:57:0x01e0, B:50:0x01cf, B:62:0x0234, B:64:0x023a, B:65:0x024f, B:66:0x0254, B:67:0x0255, B:69:0x0277, B:70:0x0281, B:71:0x0286, B:39:0x0120, B:27:0x00ee, B:29:0x00f6, B:32:0x0100, B:18:0x0058, B:20:0x0060), top: B:82:0x003b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.util.Map r26) {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.livxow.tv.activities.PlayerActivity.z(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }
}
