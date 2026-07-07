package com.playfy.tv.activities;

import a2.n0;
import a2.s1;
import a2.t;
import a2.w0;
import android.app.PictureInPictureParams;
import android.app.UiModeManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Rational;
import android.view.GestureDetector;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.d1;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.TrackSelectionView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bf.o;
import bg.y;
import com.google.android.material.chip.Chip;
import com.playfy.tv.R;
import com.playfy.tv.activities.PlayerActivity;
import com.playfy.tv.databinding.ActivityPlayerBinding;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.device.MimeTypes;
import d.s;
import db.c1;
import fd.d;
import fd.h;
import fd.v;
import fd.w;
import gd.p;
import gf.a2;
import he.g;
import he.m;
import i.j;
import i4.u;
import id.e;
import ie.i;
import ie.l;
import j6.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import jb.b;
import kd.p0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import ld.o;
import od.c0;
import okhttp3.HttpUrl;
import p.q3;
import r1.e0;
import r1.f0;
import r1.j0;
import r1.j1;
import r1.k1;
import r1.l1;
import r1.p1;
import r1.r0;
import r1.s0;
import r1.t0;
import t0.h0;
import u1.a0;
import u1.f;
import u2.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class PlayerActivity extends j implements s0 {
    public static final /* synthetic */ o[] V;
    public final Object D;
    public final a E;
    public n0 F;
    public u G;
    public q3 H;
    public final m I;
    public final m J;
    public boolean K;
    public float L;
    public a2 M;
    public final m N;
    public final m O;
    public final m P;
    public final m Q;
    public final m R;
    public final m S;
    public final m T;
    public final m U;

    static {
        q qVar = new q(PlayerActivity.class, "binding", "getBinding()Lcom/playfy/tv/databinding/ActivityPlayerBinding;");
        x.f8056a.getClass();
        V = new o[]{qVar};
    }

    public PlayerActivity() {
        super(R.layout.activity_player);
        this.D = he.a.c(g.f6075z, new d(this, 1));
        this.E = b.s(this, ActivityPlayerBinding.class);
        final int i6 = 0;
        this.I = he.a.d(new ve.a(this) { // from class: fd.s

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f5211y;

            {
                this.f5211y = this;
            }

            @Override // ve.a
            public final Object invoke() {
                int i10 = i6;
                PlayerActivity playerActivity = this.f5211y;
                switch (i10) {
                    case 0:
                        bf.o[] oVarArr = PlayerActivity.V;
                        return new gd.p(null, new t(playerActivity, 2), null, playerActivity.d0().f10064d.f5226d, 5);
                    case 1:
                        bf.o[] oVarArr2 = PlayerActivity.V;
                        return new gd.s(new t(playerActivity, 0), null);
                    case 2:
                        bf.o[] oVarArr3 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.exo_volume);
                    case 3:
                        bf.o[] oVarArr4 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.full_screen_btn);
                    case 4:
                        bf.o[] oVarArr5 = PlayerActivity.V;
                        return (ImageView) playerActivity.findViewById(R.id.adjust_btn);
                    case 5:
                        bf.o[] oVarArr6 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.exo_lock);
                    case 6:
                        bf.o[] oVarArr7 = PlayerActivity.V;
                        return (TextView) playerActivity.findViewById(R.id.exo_error_message);
                    case 7:
                        bf.o[] oVarArr8 = PlayerActivity.V;
                        Object systemService = playerActivity.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                        kotlin.jvm.internal.k.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
                        return (AudioManager) systemService;
                    case 8:
                        bf.o[] oVarArr9 = PlayerActivity.V;
                        return (ProgressBar) playerActivity.findViewById(R.id.pb_player);
                    default:
                        bf.o[] oVarArr10 = PlayerActivity.V;
                        return (FrameLayout) playerActivity.findViewById(R.id.servers_container_controller);
                }
            }
        });
        final int i10 = 1;
        this.J = he.a.d(new ve.a(this) { // from class: fd.s

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f5211y;

            {
                this.f5211y = this;
            }

            @Override // ve.a
            public final Object invoke() {
                int i102 = i10;
                PlayerActivity playerActivity = this.f5211y;
                switch (i102) {
                    case 0:
                        bf.o[] oVarArr = PlayerActivity.V;
                        return new gd.p(null, new t(playerActivity, 2), null, playerActivity.d0().f10064d.f5226d, 5);
                    case 1:
                        bf.o[] oVarArr2 = PlayerActivity.V;
                        return new gd.s(new t(playerActivity, 0), null);
                    case 2:
                        bf.o[] oVarArr3 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.exo_volume);
                    case 3:
                        bf.o[] oVarArr4 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.full_screen_btn);
                    case 4:
                        bf.o[] oVarArr5 = PlayerActivity.V;
                        return (ImageView) playerActivity.findViewById(R.id.adjust_btn);
                    case 5:
                        bf.o[] oVarArr6 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.exo_lock);
                    case 6:
                        bf.o[] oVarArr7 = PlayerActivity.V;
                        return (TextView) playerActivity.findViewById(R.id.exo_error_message);
                    case 7:
                        bf.o[] oVarArr8 = PlayerActivity.V;
                        Object systemService = playerActivity.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                        kotlin.jvm.internal.k.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
                        return (AudioManager) systemService;
                    case 8:
                        bf.o[] oVarArr9 = PlayerActivity.V;
                        return (ProgressBar) playerActivity.findViewById(R.id.pb_player);
                    default:
                        bf.o[] oVarArr10 = PlayerActivity.V;
                        return (FrameLayout) playerActivity.findViewById(R.id.servers_container_controller);
                }
            }
        });
        this.L = -1.0f;
        final int i11 = 2;
        this.N = he.a.d(new ve.a(this) { // from class: fd.s

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f5211y;

            {
                this.f5211y = this;
            }

            @Override // ve.a
            public final Object invoke() {
                int i102 = i11;
                PlayerActivity playerActivity = this.f5211y;
                switch (i102) {
                    case 0:
                        bf.o[] oVarArr = PlayerActivity.V;
                        return new gd.p(null, new t(playerActivity, 2), null, playerActivity.d0().f10064d.f5226d, 5);
                    case 1:
                        bf.o[] oVarArr2 = PlayerActivity.V;
                        return new gd.s(new t(playerActivity, 0), null);
                    case 2:
                        bf.o[] oVarArr3 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.exo_volume);
                    case 3:
                        bf.o[] oVarArr4 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.full_screen_btn);
                    case 4:
                        bf.o[] oVarArr5 = PlayerActivity.V;
                        return (ImageView) playerActivity.findViewById(R.id.adjust_btn);
                    case 5:
                        bf.o[] oVarArr6 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.exo_lock);
                    case 6:
                        bf.o[] oVarArr7 = PlayerActivity.V;
                        return (TextView) playerActivity.findViewById(R.id.exo_error_message);
                    case 7:
                        bf.o[] oVarArr8 = PlayerActivity.V;
                        Object systemService = playerActivity.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                        kotlin.jvm.internal.k.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
                        return (AudioManager) systemService;
                    case 8:
                        bf.o[] oVarArr9 = PlayerActivity.V;
                        return (ProgressBar) playerActivity.findViewById(R.id.pb_player);
                    default:
                        bf.o[] oVarArr10 = PlayerActivity.V;
                        return (FrameLayout) playerActivity.findViewById(R.id.servers_container_controller);
                }
            }
        });
        final int i12 = 3;
        this.O = he.a.d(new ve.a(this) { // from class: fd.s

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f5211y;

            {
                this.f5211y = this;
            }

            @Override // ve.a
            public final Object invoke() {
                int i102 = i12;
                PlayerActivity playerActivity = this.f5211y;
                switch (i102) {
                    case 0:
                        bf.o[] oVarArr = PlayerActivity.V;
                        return new gd.p(null, new t(playerActivity, 2), null, playerActivity.d0().f10064d.f5226d, 5);
                    case 1:
                        bf.o[] oVarArr2 = PlayerActivity.V;
                        return new gd.s(new t(playerActivity, 0), null);
                    case 2:
                        bf.o[] oVarArr3 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.exo_volume);
                    case 3:
                        bf.o[] oVarArr4 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.full_screen_btn);
                    case 4:
                        bf.o[] oVarArr5 = PlayerActivity.V;
                        return (ImageView) playerActivity.findViewById(R.id.adjust_btn);
                    case 5:
                        bf.o[] oVarArr6 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.exo_lock);
                    case 6:
                        bf.o[] oVarArr7 = PlayerActivity.V;
                        return (TextView) playerActivity.findViewById(R.id.exo_error_message);
                    case 7:
                        bf.o[] oVarArr8 = PlayerActivity.V;
                        Object systemService = playerActivity.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                        kotlin.jvm.internal.k.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
                        return (AudioManager) systemService;
                    case 8:
                        bf.o[] oVarArr9 = PlayerActivity.V;
                        return (ProgressBar) playerActivity.findViewById(R.id.pb_player);
                    default:
                        bf.o[] oVarArr10 = PlayerActivity.V;
                        return (FrameLayout) playerActivity.findViewById(R.id.servers_container_controller);
                }
            }
        });
        final int i13 = 4;
        this.P = he.a.d(new ve.a(this) { // from class: fd.s

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f5211y;

            {
                this.f5211y = this;
            }

            @Override // ve.a
            public final Object invoke() {
                int i102 = i13;
                PlayerActivity playerActivity = this.f5211y;
                switch (i102) {
                    case 0:
                        bf.o[] oVarArr = PlayerActivity.V;
                        return new gd.p(null, new t(playerActivity, 2), null, playerActivity.d0().f10064d.f5226d, 5);
                    case 1:
                        bf.o[] oVarArr2 = PlayerActivity.V;
                        return new gd.s(new t(playerActivity, 0), null);
                    case 2:
                        bf.o[] oVarArr3 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.exo_volume);
                    case 3:
                        bf.o[] oVarArr4 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.full_screen_btn);
                    case 4:
                        bf.o[] oVarArr5 = PlayerActivity.V;
                        return (ImageView) playerActivity.findViewById(R.id.adjust_btn);
                    case 5:
                        bf.o[] oVarArr6 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.exo_lock);
                    case 6:
                        bf.o[] oVarArr7 = PlayerActivity.V;
                        return (TextView) playerActivity.findViewById(R.id.exo_error_message);
                    case 7:
                        bf.o[] oVarArr8 = PlayerActivity.V;
                        Object systemService = playerActivity.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                        kotlin.jvm.internal.k.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
                        return (AudioManager) systemService;
                    case 8:
                        bf.o[] oVarArr9 = PlayerActivity.V;
                        return (ProgressBar) playerActivity.findViewById(R.id.pb_player);
                    default:
                        bf.o[] oVarArr10 = PlayerActivity.V;
                        return (FrameLayout) playerActivity.findViewById(R.id.servers_container_controller);
                }
            }
        });
        final int i14 = 5;
        this.Q = he.a.d(new ve.a(this) { // from class: fd.s

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f5211y;

            {
                this.f5211y = this;
            }

            @Override // ve.a
            public final Object invoke() {
                int i102 = i14;
                PlayerActivity playerActivity = this.f5211y;
                switch (i102) {
                    case 0:
                        bf.o[] oVarArr = PlayerActivity.V;
                        return new gd.p(null, new t(playerActivity, 2), null, playerActivity.d0().f10064d.f5226d, 5);
                    case 1:
                        bf.o[] oVarArr2 = PlayerActivity.V;
                        return new gd.s(new t(playerActivity, 0), null);
                    case 2:
                        bf.o[] oVarArr3 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.exo_volume);
                    case 3:
                        bf.o[] oVarArr4 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.full_screen_btn);
                    case 4:
                        bf.o[] oVarArr5 = PlayerActivity.V;
                        return (ImageView) playerActivity.findViewById(R.id.adjust_btn);
                    case 5:
                        bf.o[] oVarArr6 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.exo_lock);
                    case 6:
                        bf.o[] oVarArr7 = PlayerActivity.V;
                        return (TextView) playerActivity.findViewById(R.id.exo_error_message);
                    case 7:
                        bf.o[] oVarArr8 = PlayerActivity.V;
                        Object systemService = playerActivity.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                        kotlin.jvm.internal.k.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
                        return (AudioManager) systemService;
                    case 8:
                        bf.o[] oVarArr9 = PlayerActivity.V;
                        return (ProgressBar) playerActivity.findViewById(R.id.pb_player);
                    default:
                        bf.o[] oVarArr10 = PlayerActivity.V;
                        return (FrameLayout) playerActivity.findViewById(R.id.servers_container_controller);
                }
            }
        });
        final int i15 = 6;
        this.R = he.a.d(new ve.a(this) { // from class: fd.s

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f5211y;

            {
                this.f5211y = this;
            }

            @Override // ve.a
            public final Object invoke() {
                int i102 = i15;
                PlayerActivity playerActivity = this.f5211y;
                switch (i102) {
                    case 0:
                        bf.o[] oVarArr = PlayerActivity.V;
                        return new gd.p(null, new t(playerActivity, 2), null, playerActivity.d0().f10064d.f5226d, 5);
                    case 1:
                        bf.o[] oVarArr2 = PlayerActivity.V;
                        return new gd.s(new t(playerActivity, 0), null);
                    case 2:
                        bf.o[] oVarArr3 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.exo_volume);
                    case 3:
                        bf.o[] oVarArr4 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.full_screen_btn);
                    case 4:
                        bf.o[] oVarArr5 = PlayerActivity.V;
                        return (ImageView) playerActivity.findViewById(R.id.adjust_btn);
                    case 5:
                        bf.o[] oVarArr6 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.exo_lock);
                    case 6:
                        bf.o[] oVarArr7 = PlayerActivity.V;
                        return (TextView) playerActivity.findViewById(R.id.exo_error_message);
                    case 7:
                        bf.o[] oVarArr8 = PlayerActivity.V;
                        Object systemService = playerActivity.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                        kotlin.jvm.internal.k.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
                        return (AudioManager) systemService;
                    case 8:
                        bf.o[] oVarArr9 = PlayerActivity.V;
                        return (ProgressBar) playerActivity.findViewById(R.id.pb_player);
                    default:
                        bf.o[] oVarArr10 = PlayerActivity.V;
                        return (FrameLayout) playerActivity.findViewById(R.id.servers_container_controller);
                }
            }
        });
        final int i16 = 7;
        this.S = he.a.d(new ve.a(this) { // from class: fd.s

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f5211y;

            {
                this.f5211y = this;
            }

            @Override // ve.a
            public final Object invoke() {
                int i102 = i16;
                PlayerActivity playerActivity = this.f5211y;
                switch (i102) {
                    case 0:
                        bf.o[] oVarArr = PlayerActivity.V;
                        return new gd.p(null, new t(playerActivity, 2), null, playerActivity.d0().f10064d.f5226d, 5);
                    case 1:
                        bf.o[] oVarArr2 = PlayerActivity.V;
                        return new gd.s(new t(playerActivity, 0), null);
                    case 2:
                        bf.o[] oVarArr3 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.exo_volume);
                    case 3:
                        bf.o[] oVarArr4 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.full_screen_btn);
                    case 4:
                        bf.o[] oVarArr5 = PlayerActivity.V;
                        return (ImageView) playerActivity.findViewById(R.id.adjust_btn);
                    case 5:
                        bf.o[] oVarArr6 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.exo_lock);
                    case 6:
                        bf.o[] oVarArr7 = PlayerActivity.V;
                        return (TextView) playerActivity.findViewById(R.id.exo_error_message);
                    case 7:
                        bf.o[] oVarArr8 = PlayerActivity.V;
                        Object systemService = playerActivity.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                        kotlin.jvm.internal.k.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
                        return (AudioManager) systemService;
                    case 8:
                        bf.o[] oVarArr9 = PlayerActivity.V;
                        return (ProgressBar) playerActivity.findViewById(R.id.pb_player);
                    default:
                        bf.o[] oVarArr10 = PlayerActivity.V;
                        return (FrameLayout) playerActivity.findViewById(R.id.servers_container_controller);
                }
            }
        });
        final int i17 = 8;
        this.T = he.a.d(new ve.a(this) { // from class: fd.s

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f5211y;

            {
                this.f5211y = this;
            }

            @Override // ve.a
            public final Object invoke() {
                int i102 = i17;
                PlayerActivity playerActivity = this.f5211y;
                switch (i102) {
                    case 0:
                        bf.o[] oVarArr = PlayerActivity.V;
                        return new gd.p(null, new t(playerActivity, 2), null, playerActivity.d0().f10064d.f5226d, 5);
                    case 1:
                        bf.o[] oVarArr2 = PlayerActivity.V;
                        return new gd.s(new t(playerActivity, 0), null);
                    case 2:
                        bf.o[] oVarArr3 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.exo_volume);
                    case 3:
                        bf.o[] oVarArr4 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.full_screen_btn);
                    case 4:
                        bf.o[] oVarArr5 = PlayerActivity.V;
                        return (ImageView) playerActivity.findViewById(R.id.adjust_btn);
                    case 5:
                        bf.o[] oVarArr6 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.exo_lock);
                    case 6:
                        bf.o[] oVarArr7 = PlayerActivity.V;
                        return (TextView) playerActivity.findViewById(R.id.exo_error_message);
                    case 7:
                        bf.o[] oVarArr8 = PlayerActivity.V;
                        Object systemService = playerActivity.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                        kotlin.jvm.internal.k.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
                        return (AudioManager) systemService;
                    case 8:
                        bf.o[] oVarArr9 = PlayerActivity.V;
                        return (ProgressBar) playerActivity.findViewById(R.id.pb_player);
                    default:
                        bf.o[] oVarArr10 = PlayerActivity.V;
                        return (FrameLayout) playerActivity.findViewById(R.id.servers_container_controller);
                }
            }
        });
        final int i18 = 9;
        this.U = he.a.d(new ve.a(this) { // from class: fd.s

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f5211y;

            {
                this.f5211y = this;
            }

            @Override // ve.a
            public final Object invoke() {
                int i102 = i18;
                PlayerActivity playerActivity = this.f5211y;
                switch (i102) {
                    case 0:
                        bf.o[] oVarArr = PlayerActivity.V;
                        return new gd.p(null, new t(playerActivity, 2), null, playerActivity.d0().f10064d.f5226d, 5);
                    case 1:
                        bf.o[] oVarArr2 = PlayerActivity.V;
                        return new gd.s(new t(playerActivity, 0), null);
                    case 2:
                        bf.o[] oVarArr3 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.exo_volume);
                    case 3:
                        bf.o[] oVarArr4 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.full_screen_btn);
                    case 4:
                        bf.o[] oVarArr5 = PlayerActivity.V;
                        return (ImageView) playerActivity.findViewById(R.id.adjust_btn);
                    case 5:
                        bf.o[] oVarArr6 = PlayerActivity.V;
                        return (ImageButton) playerActivity.findViewById(R.id.exo_lock);
                    case 6:
                        bf.o[] oVarArr7 = PlayerActivity.V;
                        return (TextView) playerActivity.findViewById(R.id.exo_error_message);
                    case 7:
                        bf.o[] oVarArr8 = PlayerActivity.V;
                        Object systemService = playerActivity.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                        kotlin.jvm.internal.k.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
                        return (AudioManager) systemService;
                    case 8:
                        bf.o[] oVarArr9 = PlayerActivity.V;
                        return (ProgressBar) playerActivity.findViewById(R.id.pb_player);
                    default:
                        bf.o[] oVarArr10 = PlayerActivity.V;
                        return (FrameLayout) playerActivity.findViewById(R.id.servers_container_controller);
                }
            }
        });
    }

    public static String V(String str) {
        int i6;
        int i10;
        k.e(str, "<this>");
        int length = str.length();
        int i11 = length / 2;
        if (length % 2 == 0) {
            i6 = 0;
        } else {
            i6 = 1;
        }
        ArrayList arrayList = new ArrayList(i11 + i6);
        int i12 = 0;
        while (i12 >= 0 && i12 < length) {
            int i13 = i12 + 2;
            if (i13 >= 0 && i13 <= length) {
                i10 = i13;
            } else {
                i10 = length;
            }
            CharSequence it = str.subSequence(i12, i10);
            k.e(it, "it");
            arrayList.add(it.toString());
            i12 = i13;
        }
        ArrayList arrayList2 = new ArrayList(l.x(arrayList, 10));
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            a.a.g(16);
            arrayList2.add(Byte.valueOf((byte) Integer.parseInt((String) obj, 16)));
        }
        String encodeToString = Base64.encodeToString(ie.j.W(arrayList2), 0);
        k.d(encodeToString, "encodeToString(...)");
        String obj2 = df.m.n0(encodeToString).toString();
        CharSequence charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
        String F = df.u.F(obj2, "\n", HttpUrl.FRAGMENT_ENCODE_SET);
        char[] cArr = {'='};
        int length2 = F.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i15 = length2 - 1;
                if (!i.Y(cArr, F.charAt(length2))) {
                    charSequence = F.subSequence(0, length2 + 1);
                    break;
                }
                if (i15 < 0) {
                    break;
                }
                length2 = i15;
            }
        }
        return charSequence.toString();
    }

    public static void j0(PlayerActivity playerActivity, RecyclerView recyclerView) {
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen._5sdp);
        recyclerView.setLayoutManager(new GridLayoutManager(4));
        while (recyclerView.getItemDecorationCount() > 0) {
            recyclerView.a0();
        }
        recyclerView.g(new gd.g(4, dimensionPixelSize));
    }

    @Override // r1.s0
    public final void D(r1.n0 error) {
        k.e(error, "error");
        if (error.f11589x == 1002) {
            h0();
            return;
        }
        if (!d0().j) {
            List P = cf.l.P(cf.l.L(new cf.o(Y().f3163l, 4), fd.x.f5219x));
            Iterator it = P.iterator();
            int i6 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (((Chip) it.next()).isChecked()) {
                        break;
                    } else {
                        i6++;
                    }
                } else {
                    i6 = -1;
                    break;
                }
            }
            if (i6 != -1) {
                ((Chip) P.get((i6 + 1) % P.size())).performClick();
                return;
            } else {
                if (!P.isEmpty()) {
                    ((Chip) ie.j.G(P)).performClick();
                    return;
                }
                return;
            }
        }
        h0();
    }

    @Override // r1.s0
    public final void Q(boolean z10) {
        c0 d02 = d0();
        if (!d02.j) {
            d02.j = z10;
        }
    }

    public final void T(boolean z10) {
        int i6;
        int i10;
        a0().setSelected(z10);
        ImageButton a02 = a0();
        if (z10) {
            i6 = R.drawable.exo_ic_fullscreen_exit;
        } else {
            i6 = R.drawable.exo_ic_fullscreen_enter;
        }
        a02.setImageResource(i6);
        Window window = getWindow();
        if (window != null) {
            PlayerView playerView = Y().j;
            k.d(playerView, "playerView");
            cf.m.w(window, z10, playerView);
        }
        q0 q0Var = d0().f10063c;
        if (z10) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        q0Var.h(Integer.valueOf(i10));
        i0(z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0180, code lost:
    
        if (((android.app.UiModeManager) r15).getCurrentModeType() == 4) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U(android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.playfy.tv.activities.PlayerActivity.U(android.content.Intent):void");
    }

    public final void W() {
        PictureInPictureParams build;
        Y().j.d();
        Rational rational = new Rational(16, 9);
        PictureInPictureParams.Builder h4 = y.h();
        h4.setAspectRatio(rational);
        if (Build.VERSION.SDK_INT == 31) {
            h4.setAutoEnterEnabled(true);
        }
        build = h4.build();
        enterPictureInPictureMode(build);
    }

    public final AudioManager X() {
        return (AudioManager) this.S.getValue();
    }

    public final ActivityPlayerBinding Y() {
        return (ActivityPlayerBinding) this.E.a(this, V[0]);
    }

    public final ImageView Z() {
        Object value = this.P.getValue();
        k.d(value, "getValue(...)");
        return (ImageView) value;
    }

    public final ImageButton a0() {
        Object value = this.O.getValue();
        k.d(value, "getValue(...)");
        return (ImageButton) value;
    }

    public final ImageButton b0() {
        Object value = this.Q.getValue();
        k.d(value, "getValue(...)");
        return (ImageButton) value;
    }

    public final p c0() {
        return (p) this.I.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [he.f, java.lang.Object] */
    public final c0 d0() {
        return (c0) this.D.getValue();
    }

    public final boolean e0() {
        if (Build.VERSION.SDK_INT >= 26 && getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x04db, code lost:
    
        if (r0.equals("ismv") == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0541, code lost:
    
        r0 = new androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory(r3).e(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x04e6, code lost:
    
        if (r0.equals("isml") == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x04ef, code lost:
    
        if (r0.equals("isma") == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x050c, code lost:
    
        if (r0.equals("ism") == false) goto L206;
     */
    /* JADX WARN: Type inference failed for: r0v35, types: [androidx.media3.exoplayer.hls.HlsMediaSource$Factory] */
    /* JADX WARN: Type inference failed for: r0v56, types: [androidx.media3.exoplayer.hls.HlsMediaSource$Factory] */
    /* JADX WARN: Type inference failed for: r0v72, types: [r1.w, r1.x] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, j4.b0] */
    /* JADX WARN: Type inference failed for: r25v0, types: [o5.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory] */
    /* JADX WARN: Type inference failed for: r3v20, types: [r1.w, r1.x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f0(kd.p0 r35) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.playfy.tv.activities.PlayerActivity.f0(kd.p0):void");
    }

    public final void g0() {
        boolean z10;
        Y().j.d();
        u uVar = this.G;
        if (uVar != null) {
            uVar.a();
        }
        this.G = null;
        n0 n0Var = this.F;
        if (n0Var != null) {
            u1.a.k("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(n0Var)) + " [AndroidXMedia3/1.8.0] [" + a0.f12750a + "] [" + f0.b() + "]");
            n0Var.F1();
            n0Var.Y.k();
            n0Var.Z.c(false);
            n0Var.f326a0.c(false);
            w0 w0Var = n0Var.J;
            if (!w0Var.f462e0 && w0Var.G.getThread().isAlive()) {
                w0Var.f462e0 = true;
                f fVar = new f(w0Var.M);
                w0Var.E.a(7, fVar).b();
                z10 = fVar.c(w0Var.R);
            } else {
                z10 = true;
            }
            if (!z10) {
                n0Var.K.e(10, new t(1));
            }
            n0Var.K.d();
            n0Var.H.f12820a.removeCallbacksAndMessages(null);
            u2.d dVar = n0Var.S;
            b2.f fVar2 = n0Var.Q;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((u2.g) dVar).f12848c.f7745y;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (cVar.f12831b == fVar2) {
                    cVar.f12832c = true;
                    copyOnWriteArrayList.remove(cVar);
                }
            }
            s1 s1Var = n0Var.I0;
            if (s1Var.f408p) {
                n0Var.I0 = s1Var.a();
            }
            s1 p12 = n0.p1(n0Var.I0, 1);
            n0Var.I0 = p12;
            s1 c10 = p12.c(p12.f395b);
            n0Var.I0 = c10;
            c10.f409q = c10.s;
            n0Var.I0.f410r = 0L;
            b2.f fVar3 = n0Var.Q;
            u1.x xVar = fVar3.E;
            u1.c.h(xVar);
            xVar.c(new a2.a(fVar3, 6));
            n0Var.v1();
            Surface surface = n0Var.f341q0;
            if (surface != null) {
                surface.release();
                n0Var.f341q0 = null;
            }
            n0Var.A0 = t1.c.f12476d;
            n0Var.E0 = true;
        }
        this.F = null;
    }

    public final void h0() {
        n0 n0Var = this.F;
        if (n0Var != null) {
            n0Var.B();
            n0Var.c();
            n0Var.j0();
        } else {
            Object obj = d0().f10069i.f973e;
            if (obj == o0.f968k) {
                obj = null;
            }
            f0((p0) obj);
        }
    }

    public final void i0(boolean z10) {
        d0.j jVar;
        d0.j jVar2;
        ActivityPlayerBinding Y = Y();
        ConstraintLayout constraintLayout = Y.f3153a;
        FrameLayout frameLayout = Y.f3162k;
        PlayerView playerView = Y.j;
        HorizontalScrollView horizontalScrollView = Y.f3164m;
        k.d(constraintLayout, "getRoot(...)");
        d0.o oVar = new d0.o();
        oVar.b(constraintLayout);
        if (z10 || d0().f10064d.f5224b == 1) {
            int id2 = playerView.getId();
            Integer valueOf = Integer.valueOf(id2);
            HashMap hashMap = oVar.f3642c;
            if (hashMap.containsKey(valueOf)) {
                jVar = (d0.j) hashMap.get(Integer.valueOf(id2));
            } else {
                jVar = null;
            }
            if (jVar.f3569d.f3600o == 0) {
                return;
            }
        }
        if (z10) {
            int id3 = playerView.getId();
            Integer valueOf2 = Integer.valueOf(id3);
            HashMap hashMap2 = oVar.f3642c;
            if (!hashMap2.containsKey(valueOf2)) {
                hashMap2.put(Integer.valueOf(id3), new d0.j());
            }
            d0.j jVar3 = (d0.j) hashMap2.get(Integer.valueOf(id3));
            if (jVar3 != null) {
                d0.k kVar = jVar3.f3569d;
                kVar.f3600o = 0;
                kVar.f3598n = -1;
                kVar.f3601p = -1;
                kVar.f3602q = -1;
                kVar.f3603r = -1;
            }
            oVar.e(playerView.getId()).f3569d.f3609y = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            int id4 = playerView.getId();
            Integer valueOf3 = Integer.valueOf(id4);
            HashMap hashMap3 = oVar.f3642c;
            if (hashMap3.containsKey(valueOf3) && (jVar2 = (d0.j) hashMap3.get(Integer.valueOf(id4))) != null) {
                d0.k kVar2 = jVar2.f3569d;
                kVar2.f3598n = -1;
                kVar2.f3600o = -1;
                kVar2.I = 0;
                kVar2.P = Integer.MIN_VALUE;
            }
            oVar.e(playerView.getId()).f3569d.f3609y = "H,16:9";
        }
        oVar.a(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
        m mVar = this.U;
        if (z10 && !k.a(horizontalScrollView.getParent(), (FrameLayout) mVar.getValue())) {
            frameLayout.removeView(horizontalScrollView);
            ((FrameLayout) mVar.getValue()).addView(horizontalScrollView);
        } else if (!z10 && !k.a(horizontalScrollView.getParent(), frameLayout)) {
            ((FrameLayout) mVar.getValue()).removeView(horizontalScrollView);
            frameLayout.addView(horizontalScrollView);
        }
    }

    @Override // i.j, d.q, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        boolean z10;
        k.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        T(z10);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [kotlin.jvm.internal.u, java.lang.Object] */
    @Override // i.j, d.q, h0.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z10;
        int i6;
        boolean z11;
        super.onCreate(bundle);
        final int i10 = 7;
        final int i11 = 2;
        if (!a0().isSelected() && Build.VERSION.SDK_INT >= 35) {
            s.a(this, new d.p0(-16777216, -16777216, 2, new cf.p(i11)), 2);
            ConstraintLayout constraintLayout = Y().f3153a;
            com.unity3d.ads.adplayer.b bVar = new com.unity3d.ads.adplayer.b(i10);
            WeakHashMap weakHashMap = t0.q0.f12397a;
            h0.l(constraintLayout, bVar);
        }
        Object systemService = getSystemService("uimode");
        k.c(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
        final int i12 = 1;
        final int i13 = 0;
        final int i14 = 4;
        if (((UiModeManager) systemService).getCurrentModeType() == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        ((ImageButton) findViewById(R.id.exo_rew)).setOnClickListener(new View.OnClickListener(this) { // from class: fd.u

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f5215y;

            {
                this.f5215y = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15;
                int i16;
                int i17;
                Object obj = null;
                int i18 = 0;
                int i19 = 1;
                switch (i13) {
                    case 0:
                        n0 n0Var = this.f5215y.F;
                        if (n0Var != null) {
                            n0Var.N0();
                            return;
                        }
                        return;
                    case 1:
                        n0 n0Var2 = this.f5215y.F;
                        if (n0Var2 != null) {
                            n0Var2.L0();
                            return;
                        }
                        return;
                    case 2:
                        PlayerActivity playerActivity = this.f5215y;
                        n0 n0Var3 = playerActivity.F;
                        if (n0Var3 != null && !playerActivity.K) {
                            c1 c1Var = ld.o.U0;
                            db.i0 listIterator = n0Var3.g0().f11582a.listIterator(0);
                            while (listIterator.hasNext()) {
                                if (ld.o.U0.contains(Integer.valueOf(((k1) listIterator.next()).f11571b.f11388c))) {
                                    playerActivity.K = true;
                                    n0 n0Var4 = playerActivity.F;
                                    m mVar = new m(playerActivity, i19);
                                    l1 g02 = n0Var4.g0();
                                    j1 H0 = n0Var4.H0();
                                    j2.u uVar = new j2.u(n0Var4, 2);
                                    ld.o oVar = new ld.o();
                                    ld.m mVar2 = new ld.m(H0, oVar, uVar);
                                    oVar.R0 = R.string.track_selection_title;
                                    oVar.S0 = mVar2;
                                    oVar.T0 = mVar;
                                    int i20 = 0;
                                    while (true) {
                                        c1 c1Var2 = ld.o.U0;
                                        if (i20 < c1Var2.A) {
                                            Integer num = (Integer) c1Var2.get(i20);
                                            int intValue = num.intValue();
                                            ArrayList arrayList = new ArrayList();
                                            db.i0 listIterator2 = g02.f11582a.listIterator(0);
                                            while (listIterator2.hasNext()) {
                                                k1 k1Var = (k1) listIterator2.next();
                                                if (k1Var.f11571b.f11388c == intValue) {
                                                    arrayList.add(k1Var);
                                                }
                                            }
                                            if (!arrayList.isEmpty()) {
                                                o.a aVar = new o.a();
                                                boolean contains = H0.E.contains(num);
                                                db.n0 n0Var5 = H0.D;
                                                aVar.f8349z0 = arrayList;
                                                aVar.B0 = contains;
                                                aVar.A0 = true;
                                                aVar.C0 = new HashMap(TrackSelectionView.a(n0Var5, arrayList, false));
                                                oVar.P0.put(intValue, aVar);
                                                oVar.Q0.add(num);
                                            }
                                            i20++;
                                        } else {
                                            oVar.Q(playerActivity.z(), null);
                                            return;
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    case 3:
                        PlayerActivity playerActivity2 = this.f5215y;
                        bf.o[] oVarArr = PlayerActivity.V;
                        if (playerActivity2.a0().isSelected()) {
                            playerActivity2.setRequestedOrientation(1);
                            return;
                        } else {
                            playerActivity2.finish();
                            return;
                        }
                    case 4:
                        PlayerActivity playerActivity3 = this.f5215y;
                        bf.o[] oVarArr2 = PlayerActivity.V;
                        if (playerActivity3.e0()) {
                            playerActivity3.W();
                            return;
                        }
                        return;
                    case 5:
                        PlayerActivity playerActivity4 = this.f5215y;
                        bf.o[] oVarArr3 = PlayerActivity.V;
                        boolean isSelected = playerActivity4.a0().isSelected();
                        boolean z12 = !isSelected;
                        if (!isSelected) {
                            i19 = 6;
                        }
                        playerActivity4.setRequestedOrientation(i19);
                        playerActivity4.T(z12);
                        return;
                    case 6:
                        PlayerActivity playerActivity5 = this.f5215y;
                        bf.o[] oVarArr4 = PlayerActivity.V;
                        boolean isSelected2 = playerActivity5.b0().isSelected();
                        boolean z13 = !isSelected2;
                        View findViewById = playerActivity5.findViewById(R.id.exo_back);
                        kotlin.jvm.internal.k.d(findViewById, "findViewById(...)");
                        if (isSelected2) {
                            i15 = 0;
                        } else {
                            i15 = 8;
                        }
                        findViewById.setVisibility(i15);
                        View findViewById2 = playerActivity5.findViewById(R.id.unlocked_ui);
                        kotlin.jvm.internal.k.d(findViewById2, "findViewById(...)");
                        if (isSelected2) {
                            i16 = 0;
                        } else {
                            i16 = 8;
                        }
                        findViewById2.setVisibility(i16);
                        View findViewById3 = playerActivity5.findViewById(R.id.top_ui);
                        kotlin.jvm.internal.k.d(findViewById3, "findViewById(...)");
                        if (isSelected2) {
                            i17 = 0;
                        } else {
                            i17 = 8;
                        }
                        findViewById3.setVisibility(i17);
                        FrameLayout frameLayout = (FrameLayout) playerActivity5.U.getValue();
                        kotlin.jvm.internal.k.d(frameLayout, "<get-serverExo>(...)");
                        if (!isSelected2) {
                            i18 = 8;
                        }
                        frameLayout.setVisibility(i18);
                        playerActivity5.b0().setSelected(z13);
                        return;
                    case 7:
                        PlayerActivity playerActivity6 = this.f5215y;
                        bf.o[] oVarArr5 = PlayerActivity.V;
                        q0 q0Var = playerActivity6.d0().f10063c;
                        Object obj2 = q0Var.f973e;
                        if (obj2 != o0.f968k) {
                            obj = obj2;
                        }
                        kotlin.jvm.internal.k.b(obj);
                        q0Var.h(Integer.valueOf((((Number) obj).intValue() + 1) % 3));
                        return;
                    default:
                        PlayerActivity playerActivity7 = this.f5215y;
                        bf.o[] oVarArr6 = PlayerActivity.V;
                        playerActivity7.d0().getData();
                        return;
                }
            }
        });
        ((ImageButton) findViewById(R.id.exo_ffwd)).setOnClickListener(new View.OnClickListener(this) { // from class: fd.u

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f5215y;

            {
                this.f5215y = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15;
                int i16;
                int i17;
                Object obj = null;
                int i18 = 0;
                int i19 = 1;
                switch (i12) {
                    case 0:
                        n0 n0Var = this.f5215y.F;
                        if (n0Var != null) {
                            n0Var.N0();
                            return;
                        }
                        return;
                    case 1:
                        n0 n0Var2 = this.f5215y.F;
                        if (n0Var2 != null) {
                            n0Var2.L0();
                            return;
                        }
                        return;
                    case 2:
                        PlayerActivity playerActivity = this.f5215y;
                        n0 n0Var3 = playerActivity.F;
                        if (n0Var3 != null && !playerActivity.K) {
                            c1 c1Var = ld.o.U0;
                            db.i0 listIterator = n0Var3.g0().f11582a.listIterator(0);
                            while (listIterator.hasNext()) {
                                if (ld.o.U0.contains(Integer.valueOf(((k1) listIterator.next()).f11571b.f11388c))) {
                                    playerActivity.K = true;
                                    n0 n0Var4 = playerActivity.F;
                                    m mVar = new m(playerActivity, i19);
                                    l1 g02 = n0Var4.g0();
                                    j1 H0 = n0Var4.H0();
                                    j2.u uVar = new j2.u(n0Var4, 2);
                                    ld.o oVar = new ld.o();
                                    ld.m mVar2 = new ld.m(H0, oVar, uVar);
                                    oVar.R0 = R.string.track_selection_title;
                                    oVar.S0 = mVar2;
                                    oVar.T0 = mVar;
                                    int i20 = 0;
                                    while (true) {
                                        c1 c1Var2 = ld.o.U0;
                                        if (i20 < c1Var2.A) {
                                            Integer num = (Integer) c1Var2.get(i20);
                                            int intValue = num.intValue();
                                            ArrayList arrayList = new ArrayList();
                                            db.i0 listIterator2 = g02.f11582a.listIterator(0);
                                            while (listIterator2.hasNext()) {
                                                k1 k1Var = (k1) listIterator2.next();
                                                if (k1Var.f11571b.f11388c == intValue) {
                                                    arrayList.add(k1Var);
                                                }
                                            }
                                            if (!arrayList.isEmpty()) {
                                                o.a aVar = new o.a();
                                                boolean contains = H0.E.contains(num);
                                                db.n0 n0Var5 = H0.D;
                                                aVar.f8349z0 = arrayList;
                                                aVar.B0 = contains;
                                                aVar.A0 = true;
                                                aVar.C0 = new HashMap(TrackSelectionView.a(n0Var5, arrayList, false));
                                                oVar.P0.put(intValue, aVar);
                                                oVar.Q0.add(num);
                                            }
                                            i20++;
                                        } else {
                                            oVar.Q(playerActivity.z(), null);
                                            return;
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    case 3:
                        PlayerActivity playerActivity2 = this.f5215y;
                        bf.o[] oVarArr = PlayerActivity.V;
                        if (playerActivity2.a0().isSelected()) {
                            playerActivity2.setRequestedOrientation(1);
                            return;
                        } else {
                            playerActivity2.finish();
                            return;
                        }
                    case 4:
                        PlayerActivity playerActivity3 = this.f5215y;
                        bf.o[] oVarArr2 = PlayerActivity.V;
                        if (playerActivity3.e0()) {
                            playerActivity3.W();
                            return;
                        }
                        return;
                    case 5:
                        PlayerActivity playerActivity4 = this.f5215y;
                        bf.o[] oVarArr3 = PlayerActivity.V;
                        boolean isSelected = playerActivity4.a0().isSelected();
                        boolean z12 = !isSelected;
                        if (!isSelected) {
                            i19 = 6;
                        }
                        playerActivity4.setRequestedOrientation(i19);
                        playerActivity4.T(z12);
                        return;
                    case 6:
                        PlayerActivity playerActivity5 = this.f5215y;
                        bf.o[] oVarArr4 = PlayerActivity.V;
                        boolean isSelected2 = playerActivity5.b0().isSelected();
                        boolean z13 = !isSelected2;
                        View findViewById = playerActivity5.findViewById(R.id.exo_back);
                        kotlin.jvm.internal.k.d(findViewById, "findViewById(...)");
                        if (isSelected2) {
                            i15 = 0;
                        } else {
                            i15 = 8;
                        }
                        findViewById.setVisibility(i15);
                        View findViewById2 = playerActivity5.findViewById(R.id.unlocked_ui);
                        kotlin.jvm.internal.k.d(findViewById2, "findViewById(...)");
                        if (isSelected2) {
                            i16 = 0;
                        } else {
                            i16 = 8;
                        }
                        findViewById2.setVisibility(i16);
                        View findViewById3 = playerActivity5.findViewById(R.id.top_ui);
                        kotlin.jvm.internal.k.d(findViewById3, "findViewById(...)");
                        if (isSelected2) {
                            i17 = 0;
                        } else {
                            i17 = 8;
                        }
                        findViewById3.setVisibility(i17);
                        FrameLayout frameLayout = (FrameLayout) playerActivity5.U.getValue();
                        kotlin.jvm.internal.k.d(frameLayout, "<get-serverExo>(...)");
                        if (!isSelected2) {
                            i18 = 8;
                        }
                        frameLayout.setVisibility(i18);
                        playerActivity5.b0().setSelected(z13);
                        return;
                    case 7:
                        PlayerActivity playerActivity6 = this.f5215y;
                        bf.o[] oVarArr5 = PlayerActivity.V;
                        q0 q0Var = playerActivity6.d0().f10063c;
                        Object obj2 = q0Var.f973e;
                        if (obj2 != o0.f968k) {
                            obj = obj2;
                        }
                        kotlin.jvm.internal.k.b(obj);
                        q0Var.h(Integer.valueOf((((Number) obj).intValue() + 1) % 3));
                        return;
                    default:
                        PlayerActivity playerActivity7 = this.f5215y;
                        bf.o[] oVarArr6 = PlayerActivity.V;
                        playerActivity7.d0().getData();
                        return;
                }
            }
        });
        ((ImageButton) findViewById(R.id.exo_quality)).setOnClickListener(new View.OnClickListener(this) { // from class: fd.u

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f5215y;

            {
                this.f5215y = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15;
                int i16;
                int i17;
                Object obj = null;
                int i18 = 0;
                int i19 = 1;
                switch (i11) {
                    case 0:
                        n0 n0Var = this.f5215y.F;
                        if (n0Var != null) {
                            n0Var.N0();
                            return;
                        }
                        return;
                    case 1:
                        n0 n0Var2 = this.f5215y.F;
                        if (n0Var2 != null) {
                            n0Var2.L0();
                            return;
                        }
                        return;
                    case 2:
                        PlayerActivity playerActivity = this.f5215y;
                        n0 n0Var3 = playerActivity.F;
                        if (n0Var3 != null && !playerActivity.K) {
                            c1 c1Var = ld.o.U0;
                            db.i0 listIterator = n0Var3.g0().f11582a.listIterator(0);
                            while (listIterator.hasNext()) {
                                if (ld.o.U0.contains(Integer.valueOf(((k1) listIterator.next()).f11571b.f11388c))) {
                                    playerActivity.K = true;
                                    n0 n0Var4 = playerActivity.F;
                                    m mVar = new m(playerActivity, i19);
                                    l1 g02 = n0Var4.g0();
                                    j1 H0 = n0Var4.H0();
                                    j2.u uVar = new j2.u(n0Var4, 2);
                                    ld.o oVar = new ld.o();
                                    ld.m mVar2 = new ld.m(H0, oVar, uVar);
                                    oVar.R0 = R.string.track_selection_title;
                                    oVar.S0 = mVar2;
                                    oVar.T0 = mVar;
                                    int i20 = 0;
                                    while (true) {
                                        c1 c1Var2 = ld.o.U0;
                                        if (i20 < c1Var2.A) {
                                            Integer num = (Integer) c1Var2.get(i20);
                                            int intValue = num.intValue();
                                            ArrayList arrayList = new ArrayList();
                                            db.i0 listIterator2 = g02.f11582a.listIterator(0);
                                            while (listIterator2.hasNext()) {
                                                k1 k1Var = (k1) listIterator2.next();
                                                if (k1Var.f11571b.f11388c == intValue) {
                                                    arrayList.add(k1Var);
                                                }
                                            }
                                            if (!arrayList.isEmpty()) {
                                                o.a aVar = new o.a();
                                                boolean contains = H0.E.contains(num);
                                                db.n0 n0Var5 = H0.D;
                                                aVar.f8349z0 = arrayList;
                                                aVar.B0 = contains;
                                                aVar.A0 = true;
                                                aVar.C0 = new HashMap(TrackSelectionView.a(n0Var5, arrayList, false));
                                                oVar.P0.put(intValue, aVar);
                                                oVar.Q0.add(num);
                                            }
                                            i20++;
                                        } else {
                                            oVar.Q(playerActivity.z(), null);
                                            return;
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    case 3:
                        PlayerActivity playerActivity2 = this.f5215y;
                        bf.o[] oVarArr = PlayerActivity.V;
                        if (playerActivity2.a0().isSelected()) {
                            playerActivity2.setRequestedOrientation(1);
                            return;
                        } else {
                            playerActivity2.finish();
                            return;
                        }
                    case 4:
                        PlayerActivity playerActivity3 = this.f5215y;
                        bf.o[] oVarArr2 = PlayerActivity.V;
                        if (playerActivity3.e0()) {
                            playerActivity3.W();
                            return;
                        }
                        return;
                    case 5:
                        PlayerActivity playerActivity4 = this.f5215y;
                        bf.o[] oVarArr3 = PlayerActivity.V;
                        boolean isSelected = playerActivity4.a0().isSelected();
                        boolean z12 = !isSelected;
                        if (!isSelected) {
                            i19 = 6;
                        }
                        playerActivity4.setRequestedOrientation(i19);
                        playerActivity4.T(z12);
                        return;
                    case 6:
                        PlayerActivity playerActivity5 = this.f5215y;
                        bf.o[] oVarArr4 = PlayerActivity.V;
                        boolean isSelected2 = playerActivity5.b0().isSelected();
                        boolean z13 = !isSelected2;
                        View findViewById = playerActivity5.findViewById(R.id.exo_back);
                        kotlin.jvm.internal.k.d(findViewById, "findViewById(...)");
                        if (isSelected2) {
                            i15 = 0;
                        } else {
                            i15 = 8;
                        }
                        findViewById.setVisibility(i15);
                        View findViewById2 = playerActivity5.findViewById(R.id.unlocked_ui);
                        kotlin.jvm.internal.k.d(findViewById2, "findViewById(...)");
                        if (isSelected2) {
                            i16 = 0;
                        } else {
                            i16 = 8;
                        }
                        findViewById2.setVisibility(i16);
                        View findViewById3 = playerActivity5.findViewById(R.id.top_ui);
                        kotlin.jvm.internal.k.d(findViewById3, "findViewById(...)");
                        if (isSelected2) {
                            i17 = 0;
                        } else {
                            i17 = 8;
                        }
                        findViewById3.setVisibility(i17);
                        FrameLayout frameLayout = (FrameLayout) playerActivity5.U.getValue();
                        kotlin.jvm.internal.k.d(frameLayout, "<get-serverExo>(...)");
                        if (!isSelected2) {
                            i18 = 8;
                        }
                        frameLayout.setVisibility(i18);
                        playerActivity5.b0().setSelected(z13);
                        return;
                    case 7:
                        PlayerActivity playerActivity6 = this.f5215y;
                        bf.o[] oVarArr5 = PlayerActivity.V;
                        q0 q0Var = playerActivity6.d0().f10063c;
                        Object obj2 = q0Var.f973e;
                        if (obj2 != o0.f968k) {
                            obj = obj2;
                        }
                        kotlin.jvm.internal.k.b(obj);
                        q0Var.h(Integer.valueOf((((Number) obj).intValue() + 1) % 3));
                        return;
                    default:
                        PlayerActivity playerActivity7 = this.f5215y;
                        bf.o[] oVarArr6 = PlayerActivity.V;
                        playerActivity7.d0().getData();
                        return;
                }
            }
        });
        final int i15 = 3;
        ((ImageButton) findViewById(R.id.exo_back)).setOnClickListener(new View.OnClickListener(this) { // from class: fd.u

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f5215y;

            {
                this.f5215y = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152;
                int i16;
                int i17;
                Object obj = null;
                int i18 = 0;
                int i19 = 1;
                switch (i15) {
                    case 0:
                        n0 n0Var = this.f5215y.F;
                        if (n0Var != null) {
                            n0Var.N0();
                            return;
                        }
                        return;
                    case 1:
                        n0 n0Var2 = this.f5215y.F;
                        if (n0Var2 != null) {
                            n0Var2.L0();
                            return;
                        }
                        return;
                    case 2:
                        PlayerActivity playerActivity = this.f5215y;
                        n0 n0Var3 = playerActivity.F;
                        if (n0Var3 != null && !playerActivity.K) {
                            c1 c1Var = ld.o.U0;
                            db.i0 listIterator = n0Var3.g0().f11582a.listIterator(0);
                            while (listIterator.hasNext()) {
                                if (ld.o.U0.contains(Integer.valueOf(((k1) listIterator.next()).f11571b.f11388c))) {
                                    playerActivity.K = true;
                                    n0 n0Var4 = playerActivity.F;
                                    m mVar = new m(playerActivity, i19);
                                    l1 g02 = n0Var4.g0();
                                    j1 H0 = n0Var4.H0();
                                    j2.u uVar = new j2.u(n0Var4, 2);
                                    ld.o oVar = new ld.o();
                                    ld.m mVar2 = new ld.m(H0, oVar, uVar);
                                    oVar.R0 = R.string.track_selection_title;
                                    oVar.S0 = mVar2;
                                    oVar.T0 = mVar;
                                    int i20 = 0;
                                    while (true) {
                                        c1 c1Var2 = ld.o.U0;
                                        if (i20 < c1Var2.A) {
                                            Integer num = (Integer) c1Var2.get(i20);
                                            int intValue = num.intValue();
                                            ArrayList arrayList = new ArrayList();
                                            db.i0 listIterator2 = g02.f11582a.listIterator(0);
                                            while (listIterator2.hasNext()) {
                                                k1 k1Var = (k1) listIterator2.next();
                                                if (k1Var.f11571b.f11388c == intValue) {
                                                    arrayList.add(k1Var);
                                                }
                                            }
                                            if (!arrayList.isEmpty()) {
                                                o.a aVar = new o.a();
                                                boolean contains = H0.E.contains(num);
                                                db.n0 n0Var5 = H0.D;
                                                aVar.f8349z0 = arrayList;
                                                aVar.B0 = contains;
                                                aVar.A0 = true;
                                                aVar.C0 = new HashMap(TrackSelectionView.a(n0Var5, arrayList, false));
                                                oVar.P0.put(intValue, aVar);
                                                oVar.Q0.add(num);
                                            }
                                            i20++;
                                        } else {
                                            oVar.Q(playerActivity.z(), null);
                                            return;
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    case 3:
                        PlayerActivity playerActivity2 = this.f5215y;
                        bf.o[] oVarArr = PlayerActivity.V;
                        if (playerActivity2.a0().isSelected()) {
                            playerActivity2.setRequestedOrientation(1);
                            return;
                        } else {
                            playerActivity2.finish();
                            return;
                        }
                    case 4:
                        PlayerActivity playerActivity3 = this.f5215y;
                        bf.o[] oVarArr2 = PlayerActivity.V;
                        if (playerActivity3.e0()) {
                            playerActivity3.W();
                            return;
                        }
                        return;
                    case 5:
                        PlayerActivity playerActivity4 = this.f5215y;
                        bf.o[] oVarArr3 = PlayerActivity.V;
                        boolean isSelected = playerActivity4.a0().isSelected();
                        boolean z12 = !isSelected;
                        if (!isSelected) {
                            i19 = 6;
                        }
                        playerActivity4.setRequestedOrientation(i19);
                        playerActivity4.T(z12);
                        return;
                    case 6:
                        PlayerActivity playerActivity5 = this.f5215y;
                        bf.o[] oVarArr4 = PlayerActivity.V;
                        boolean isSelected2 = playerActivity5.b0().isSelected();
                        boolean z13 = !isSelected2;
                        View findViewById = playerActivity5.findViewById(R.id.exo_back);
                        kotlin.jvm.internal.k.d(findViewById, "findViewById(...)");
                        if (isSelected2) {
                            i152 = 0;
                        } else {
                            i152 = 8;
                        }
                        findViewById.setVisibility(i152);
                        View findViewById2 = playerActivity5.findViewById(R.id.unlocked_ui);
                        kotlin.jvm.internal.k.d(findViewById2, "findViewById(...)");
                        if (isSelected2) {
                            i16 = 0;
                        } else {
                            i16 = 8;
                        }
                        findViewById2.setVisibility(i16);
                        View findViewById3 = playerActivity5.findViewById(R.id.top_ui);
                        kotlin.jvm.internal.k.d(findViewById3, "findViewById(...)");
                        if (isSelected2) {
                            i17 = 0;
                        } else {
                            i17 = 8;
                        }
                        findViewById3.setVisibility(i17);
                        FrameLayout frameLayout = (FrameLayout) playerActivity5.U.getValue();
                        kotlin.jvm.internal.k.d(frameLayout, "<get-serverExo>(...)");
                        if (!isSelected2) {
                            i18 = 8;
                        }
                        frameLayout.setVisibility(i18);
                        playerActivity5.b0().setSelected(z13);
                        return;
                    case 7:
                        PlayerActivity playerActivity6 = this.f5215y;
                        bf.o[] oVarArr5 = PlayerActivity.V;
                        q0 q0Var = playerActivity6.d0().f10063c;
                        Object obj2 = q0Var.f973e;
                        if (obj2 != o0.f968k) {
                            obj = obj2;
                        }
                        kotlin.jvm.internal.k.b(obj);
                        q0Var.h(Integer.valueOf((((Number) obj).intValue() + 1) % 3));
                        return;
                    default:
                        PlayerActivity playerActivity7 = this.f5215y;
                        bf.o[] oVarArr6 = PlayerActivity.V;
                        playerActivity7.d0().getData();
                        return;
                }
            }
        });
        ImageButton imageButton = (ImageButton) findViewById(R.id.pip_btn);
        k.b(imageButton);
        final int i16 = 8;
        if (e0() && !z10) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        imageButton.setVisibility(i6);
        if (imageButton.getVisibility() == 0) {
            imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: fd.u

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ PlayerActivity f5215y;

                {
                    this.f5215y = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152;
                    int i162;
                    int i17;
                    Object obj = null;
                    int i18 = 0;
                    int i19 = 1;
                    switch (i14) {
                        case 0:
                            n0 n0Var = this.f5215y.F;
                            if (n0Var != null) {
                                n0Var.N0();
                                return;
                            }
                            return;
                        case 1:
                            n0 n0Var2 = this.f5215y.F;
                            if (n0Var2 != null) {
                                n0Var2.L0();
                                return;
                            }
                            return;
                        case 2:
                            PlayerActivity playerActivity = this.f5215y;
                            n0 n0Var3 = playerActivity.F;
                            if (n0Var3 != null && !playerActivity.K) {
                                c1 c1Var = ld.o.U0;
                                db.i0 listIterator = n0Var3.g0().f11582a.listIterator(0);
                                while (listIterator.hasNext()) {
                                    if (ld.o.U0.contains(Integer.valueOf(((k1) listIterator.next()).f11571b.f11388c))) {
                                        playerActivity.K = true;
                                        n0 n0Var4 = playerActivity.F;
                                        m mVar = new m(playerActivity, i19);
                                        l1 g02 = n0Var4.g0();
                                        j1 H0 = n0Var4.H0();
                                        j2.u uVar = new j2.u(n0Var4, 2);
                                        ld.o oVar = new ld.o();
                                        ld.m mVar2 = new ld.m(H0, oVar, uVar);
                                        oVar.R0 = R.string.track_selection_title;
                                        oVar.S0 = mVar2;
                                        oVar.T0 = mVar;
                                        int i20 = 0;
                                        while (true) {
                                            c1 c1Var2 = ld.o.U0;
                                            if (i20 < c1Var2.A) {
                                                Integer num = (Integer) c1Var2.get(i20);
                                                int intValue = num.intValue();
                                                ArrayList arrayList = new ArrayList();
                                                db.i0 listIterator2 = g02.f11582a.listIterator(0);
                                                while (listIterator2.hasNext()) {
                                                    k1 k1Var = (k1) listIterator2.next();
                                                    if (k1Var.f11571b.f11388c == intValue) {
                                                        arrayList.add(k1Var);
                                                    }
                                                }
                                                if (!arrayList.isEmpty()) {
                                                    o.a aVar = new o.a();
                                                    boolean contains = H0.E.contains(num);
                                                    db.n0 n0Var5 = H0.D;
                                                    aVar.f8349z0 = arrayList;
                                                    aVar.B0 = contains;
                                                    aVar.A0 = true;
                                                    aVar.C0 = new HashMap(TrackSelectionView.a(n0Var5, arrayList, false));
                                                    oVar.P0.put(intValue, aVar);
                                                    oVar.Q0.add(num);
                                                }
                                                i20++;
                                            } else {
                                                oVar.Q(playerActivity.z(), null);
                                                return;
                                            }
                                        }
                                    }
                                }
                                return;
                            }
                            return;
                        case 3:
                            PlayerActivity playerActivity2 = this.f5215y;
                            bf.o[] oVarArr = PlayerActivity.V;
                            if (playerActivity2.a0().isSelected()) {
                                playerActivity2.setRequestedOrientation(1);
                                return;
                            } else {
                                playerActivity2.finish();
                                return;
                            }
                        case 4:
                            PlayerActivity playerActivity3 = this.f5215y;
                            bf.o[] oVarArr2 = PlayerActivity.V;
                            if (playerActivity3.e0()) {
                                playerActivity3.W();
                                return;
                            }
                            return;
                        case 5:
                            PlayerActivity playerActivity4 = this.f5215y;
                            bf.o[] oVarArr3 = PlayerActivity.V;
                            boolean isSelected = playerActivity4.a0().isSelected();
                            boolean z12 = !isSelected;
                            if (!isSelected) {
                                i19 = 6;
                            }
                            playerActivity4.setRequestedOrientation(i19);
                            playerActivity4.T(z12);
                            return;
                        case 6:
                            PlayerActivity playerActivity5 = this.f5215y;
                            bf.o[] oVarArr4 = PlayerActivity.V;
                            boolean isSelected2 = playerActivity5.b0().isSelected();
                            boolean z13 = !isSelected2;
                            View findViewById = playerActivity5.findViewById(R.id.exo_back);
                            kotlin.jvm.internal.k.d(findViewById, "findViewById(...)");
                            if (isSelected2) {
                                i152 = 0;
                            } else {
                                i152 = 8;
                            }
                            findViewById.setVisibility(i152);
                            View findViewById2 = playerActivity5.findViewById(R.id.unlocked_ui);
                            kotlin.jvm.internal.k.d(findViewById2, "findViewById(...)");
                            if (isSelected2) {
                                i162 = 0;
                            } else {
                                i162 = 8;
                            }
                            findViewById2.setVisibility(i162);
                            View findViewById3 = playerActivity5.findViewById(R.id.top_ui);
                            kotlin.jvm.internal.k.d(findViewById3, "findViewById(...)");
                            if (isSelected2) {
                                i17 = 0;
                            } else {
                                i17 = 8;
                            }
                            findViewById3.setVisibility(i17);
                            FrameLayout frameLayout = (FrameLayout) playerActivity5.U.getValue();
                            kotlin.jvm.internal.k.d(frameLayout, "<get-serverExo>(...)");
                            if (!isSelected2) {
                                i18 = 8;
                            }
                            frameLayout.setVisibility(i18);
                            playerActivity5.b0().setSelected(z13);
                            return;
                        case 7:
                            PlayerActivity playerActivity6 = this.f5215y;
                            bf.o[] oVarArr5 = PlayerActivity.V;
                            q0 q0Var = playerActivity6.d0().f10063c;
                            Object obj2 = q0Var.f973e;
                            if (obj2 != o0.f968k) {
                                obj = obj2;
                            }
                            kotlin.jvm.internal.k.b(obj);
                            q0Var.h(Integer.valueOf((((Number) obj).intValue() + 1) % 3));
                            return;
                        default:
                            PlayerActivity playerActivity7 = this.f5215y;
                            bf.o[] oVarArr6 = PlayerActivity.V;
                            playerActivity7.d0().getData();
                            return;
                    }
                }
            });
        }
        ?? obj = new Object();
        obj.f8053x = X().getStreamVolume(3);
        m mVar = this.N;
        Object value = mVar.getValue();
        k.d(value, "getValue(...)");
        ImageButton imageButton2 = (ImageButton) value;
        if (obj.f8053x > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        imageButton2.setSelected(z11);
        int i17 = obj.f8053x;
        if (i17 <= 0) {
            i17 = X().getStreamMaxVolume(3);
        }
        obj.f8053x = i17;
        Object value2 = mVar.getValue();
        k.d(value2, "getValue(...)");
        ImageButton imageButton3 = (ImageButton) value2;
        imageButton3.setOnClickListener(new h(this, obj, imageButton3, i12));
        ImageButton a02 = a0();
        Object systemService2 = getSystemService("uimode");
        k.c(systemService2, "null cannot be cast to non-null type android.app.UiModeManager");
        final int i18 = 5;
        if (((UiModeManager) systemService2).getCurrentModeType() == 4) {
            a02.setVisibility(8);
        } else {
            a02.setOnClickListener(new View.OnClickListener(this) { // from class: fd.u

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ PlayerActivity f5215y;

                {
                    this.f5215y = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152;
                    int i162;
                    int i172;
                    Object obj2 = null;
                    int i182 = 0;
                    int i19 = 1;
                    switch (i18) {
                        case 0:
                            n0 n0Var = this.f5215y.F;
                            if (n0Var != null) {
                                n0Var.N0();
                                return;
                            }
                            return;
                        case 1:
                            n0 n0Var2 = this.f5215y.F;
                            if (n0Var2 != null) {
                                n0Var2.L0();
                                return;
                            }
                            return;
                        case 2:
                            PlayerActivity playerActivity = this.f5215y;
                            n0 n0Var3 = playerActivity.F;
                            if (n0Var3 != null && !playerActivity.K) {
                                c1 c1Var = ld.o.U0;
                                db.i0 listIterator = n0Var3.g0().f11582a.listIterator(0);
                                while (listIterator.hasNext()) {
                                    if (ld.o.U0.contains(Integer.valueOf(((k1) listIterator.next()).f11571b.f11388c))) {
                                        playerActivity.K = true;
                                        n0 n0Var4 = playerActivity.F;
                                        m mVar2 = new m(playerActivity, i19);
                                        l1 g02 = n0Var4.g0();
                                        j1 H0 = n0Var4.H0();
                                        j2.u uVar = new j2.u(n0Var4, 2);
                                        ld.o oVar = new ld.o();
                                        ld.m mVar22 = new ld.m(H0, oVar, uVar);
                                        oVar.R0 = R.string.track_selection_title;
                                        oVar.S0 = mVar22;
                                        oVar.T0 = mVar2;
                                        int i20 = 0;
                                        while (true) {
                                            c1 c1Var2 = ld.o.U0;
                                            if (i20 < c1Var2.A) {
                                                Integer num = (Integer) c1Var2.get(i20);
                                                int intValue = num.intValue();
                                                ArrayList arrayList = new ArrayList();
                                                db.i0 listIterator2 = g02.f11582a.listIterator(0);
                                                while (listIterator2.hasNext()) {
                                                    k1 k1Var = (k1) listIterator2.next();
                                                    if (k1Var.f11571b.f11388c == intValue) {
                                                        arrayList.add(k1Var);
                                                    }
                                                }
                                                if (!arrayList.isEmpty()) {
                                                    o.a aVar = new o.a();
                                                    boolean contains = H0.E.contains(num);
                                                    db.n0 n0Var5 = H0.D;
                                                    aVar.f8349z0 = arrayList;
                                                    aVar.B0 = contains;
                                                    aVar.A0 = true;
                                                    aVar.C0 = new HashMap(TrackSelectionView.a(n0Var5, arrayList, false));
                                                    oVar.P0.put(intValue, aVar);
                                                    oVar.Q0.add(num);
                                                }
                                                i20++;
                                            } else {
                                                oVar.Q(playerActivity.z(), null);
                                                return;
                                            }
                                        }
                                    }
                                }
                                return;
                            }
                            return;
                        case 3:
                            PlayerActivity playerActivity2 = this.f5215y;
                            bf.o[] oVarArr = PlayerActivity.V;
                            if (playerActivity2.a0().isSelected()) {
                                playerActivity2.setRequestedOrientation(1);
                                return;
                            } else {
                                playerActivity2.finish();
                                return;
                            }
                        case 4:
                            PlayerActivity playerActivity3 = this.f5215y;
                            bf.o[] oVarArr2 = PlayerActivity.V;
                            if (playerActivity3.e0()) {
                                playerActivity3.W();
                                return;
                            }
                            return;
                        case 5:
                            PlayerActivity playerActivity4 = this.f5215y;
                            bf.o[] oVarArr3 = PlayerActivity.V;
                            boolean isSelected = playerActivity4.a0().isSelected();
                            boolean z12 = !isSelected;
                            if (!isSelected) {
                                i19 = 6;
                            }
                            playerActivity4.setRequestedOrientation(i19);
                            playerActivity4.T(z12);
                            return;
                        case 6:
                            PlayerActivity playerActivity5 = this.f5215y;
                            bf.o[] oVarArr4 = PlayerActivity.V;
                            boolean isSelected2 = playerActivity5.b0().isSelected();
                            boolean z13 = !isSelected2;
                            View findViewById = playerActivity5.findViewById(R.id.exo_back);
                            kotlin.jvm.internal.k.d(findViewById, "findViewById(...)");
                            if (isSelected2) {
                                i152 = 0;
                            } else {
                                i152 = 8;
                            }
                            findViewById.setVisibility(i152);
                            View findViewById2 = playerActivity5.findViewById(R.id.unlocked_ui);
                            kotlin.jvm.internal.k.d(findViewById2, "findViewById(...)");
                            if (isSelected2) {
                                i162 = 0;
                            } else {
                                i162 = 8;
                            }
                            findViewById2.setVisibility(i162);
                            View findViewById3 = playerActivity5.findViewById(R.id.top_ui);
                            kotlin.jvm.internal.k.d(findViewById3, "findViewById(...)");
                            if (isSelected2) {
                                i172 = 0;
                            } else {
                                i172 = 8;
                            }
                            findViewById3.setVisibility(i172);
                            FrameLayout frameLayout = (FrameLayout) playerActivity5.U.getValue();
                            kotlin.jvm.internal.k.d(frameLayout, "<get-serverExo>(...)");
                            if (!isSelected2) {
                                i182 = 8;
                            }
                            frameLayout.setVisibility(i182);
                            playerActivity5.b0().setSelected(z13);
                            return;
                        case 7:
                            PlayerActivity playerActivity6 = this.f5215y;
                            bf.o[] oVarArr5 = PlayerActivity.V;
                            q0 q0Var = playerActivity6.d0().f10063c;
                            Object obj22 = q0Var.f973e;
                            if (obj22 != o0.f968k) {
                                obj2 = obj22;
                            }
                            kotlin.jvm.internal.k.b(obj2);
                            q0Var.h(Integer.valueOf((((Number) obj2).intValue() + 1) % 3));
                            return;
                        default:
                            PlayerActivity playerActivity7 = this.f5215y;
                            bf.o[] oVarArr6 = PlayerActivity.V;
                            playerActivity7.d0().getData();
                            return;
                    }
                }
            });
        }
        b0().setSelected(false);
        final int i19 = 6;
        b0().setOnClickListener(new View.OnClickListener(this) { // from class: fd.u

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f5215y;

            {
                this.f5215y = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152;
                int i162;
                int i172;
                Object obj2 = null;
                int i182 = 0;
                int i192 = 1;
                switch (i19) {
                    case 0:
                        n0 n0Var = this.f5215y.F;
                        if (n0Var != null) {
                            n0Var.N0();
                            return;
                        }
                        return;
                    case 1:
                        n0 n0Var2 = this.f5215y.F;
                        if (n0Var2 != null) {
                            n0Var2.L0();
                            return;
                        }
                        return;
                    case 2:
                        PlayerActivity playerActivity = this.f5215y;
                        n0 n0Var3 = playerActivity.F;
                        if (n0Var3 != null && !playerActivity.K) {
                            c1 c1Var = ld.o.U0;
                            db.i0 listIterator = n0Var3.g0().f11582a.listIterator(0);
                            while (listIterator.hasNext()) {
                                if (ld.o.U0.contains(Integer.valueOf(((k1) listIterator.next()).f11571b.f11388c))) {
                                    playerActivity.K = true;
                                    n0 n0Var4 = playerActivity.F;
                                    m mVar2 = new m(playerActivity, i192);
                                    l1 g02 = n0Var4.g0();
                                    j1 H0 = n0Var4.H0();
                                    j2.u uVar = new j2.u(n0Var4, 2);
                                    ld.o oVar = new ld.o();
                                    ld.m mVar22 = new ld.m(H0, oVar, uVar);
                                    oVar.R0 = R.string.track_selection_title;
                                    oVar.S0 = mVar22;
                                    oVar.T0 = mVar2;
                                    int i20 = 0;
                                    while (true) {
                                        c1 c1Var2 = ld.o.U0;
                                        if (i20 < c1Var2.A) {
                                            Integer num = (Integer) c1Var2.get(i20);
                                            int intValue = num.intValue();
                                            ArrayList arrayList = new ArrayList();
                                            db.i0 listIterator2 = g02.f11582a.listIterator(0);
                                            while (listIterator2.hasNext()) {
                                                k1 k1Var = (k1) listIterator2.next();
                                                if (k1Var.f11571b.f11388c == intValue) {
                                                    arrayList.add(k1Var);
                                                }
                                            }
                                            if (!arrayList.isEmpty()) {
                                                o.a aVar = new o.a();
                                                boolean contains = H0.E.contains(num);
                                                db.n0 n0Var5 = H0.D;
                                                aVar.f8349z0 = arrayList;
                                                aVar.B0 = contains;
                                                aVar.A0 = true;
                                                aVar.C0 = new HashMap(TrackSelectionView.a(n0Var5, arrayList, false));
                                                oVar.P0.put(intValue, aVar);
                                                oVar.Q0.add(num);
                                            }
                                            i20++;
                                        } else {
                                            oVar.Q(playerActivity.z(), null);
                                            return;
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    case 3:
                        PlayerActivity playerActivity2 = this.f5215y;
                        bf.o[] oVarArr = PlayerActivity.V;
                        if (playerActivity2.a0().isSelected()) {
                            playerActivity2.setRequestedOrientation(1);
                            return;
                        } else {
                            playerActivity2.finish();
                            return;
                        }
                    case 4:
                        PlayerActivity playerActivity3 = this.f5215y;
                        bf.o[] oVarArr2 = PlayerActivity.V;
                        if (playerActivity3.e0()) {
                            playerActivity3.W();
                            return;
                        }
                        return;
                    case 5:
                        PlayerActivity playerActivity4 = this.f5215y;
                        bf.o[] oVarArr3 = PlayerActivity.V;
                        boolean isSelected = playerActivity4.a0().isSelected();
                        boolean z12 = !isSelected;
                        if (!isSelected) {
                            i192 = 6;
                        }
                        playerActivity4.setRequestedOrientation(i192);
                        playerActivity4.T(z12);
                        return;
                    case 6:
                        PlayerActivity playerActivity5 = this.f5215y;
                        bf.o[] oVarArr4 = PlayerActivity.V;
                        boolean isSelected2 = playerActivity5.b0().isSelected();
                        boolean z13 = !isSelected2;
                        View findViewById = playerActivity5.findViewById(R.id.exo_back);
                        kotlin.jvm.internal.k.d(findViewById, "findViewById(...)");
                        if (isSelected2) {
                            i152 = 0;
                        } else {
                            i152 = 8;
                        }
                        findViewById.setVisibility(i152);
                        View findViewById2 = playerActivity5.findViewById(R.id.unlocked_ui);
                        kotlin.jvm.internal.k.d(findViewById2, "findViewById(...)");
                        if (isSelected2) {
                            i162 = 0;
                        } else {
                            i162 = 8;
                        }
                        findViewById2.setVisibility(i162);
                        View findViewById3 = playerActivity5.findViewById(R.id.top_ui);
                        kotlin.jvm.internal.k.d(findViewById3, "findViewById(...)");
                        if (isSelected2) {
                            i172 = 0;
                        } else {
                            i172 = 8;
                        }
                        findViewById3.setVisibility(i172);
                        FrameLayout frameLayout = (FrameLayout) playerActivity5.U.getValue();
                        kotlin.jvm.internal.k.d(frameLayout, "<get-serverExo>(...)");
                        if (!isSelected2) {
                            i182 = 8;
                        }
                        frameLayout.setVisibility(i182);
                        playerActivity5.b0().setSelected(z13);
                        return;
                    case 7:
                        PlayerActivity playerActivity6 = this.f5215y;
                        bf.o[] oVarArr5 = PlayerActivity.V;
                        q0 q0Var = playerActivity6.d0().f10063c;
                        Object obj22 = q0Var.f973e;
                        if (obj22 != o0.f968k) {
                            obj2 = obj22;
                        }
                        kotlin.jvm.internal.k.b(obj2);
                        q0Var.h(Integer.valueOf((((Number) obj2).intValue() + 1) % 3));
                        return;
                    default:
                        PlayerActivity playerActivity7 = this.f5215y;
                        bf.o[] oVarArr6 = PlayerActivity.V;
                        playerActivity7.d0().getData();
                        return;
                }
            }
        });
        d0().f10063c.h(0);
        Z().setOnClickListener(new View.OnClickListener(this) { // from class: fd.u

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f5215y;

            {
                this.f5215y = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152;
                int i162;
                int i172;
                Object obj2 = null;
                int i182 = 0;
                int i192 = 1;
                switch (i10) {
                    case 0:
                        n0 n0Var = this.f5215y.F;
                        if (n0Var != null) {
                            n0Var.N0();
                            return;
                        }
                        return;
                    case 1:
                        n0 n0Var2 = this.f5215y.F;
                        if (n0Var2 != null) {
                            n0Var2.L0();
                            return;
                        }
                        return;
                    case 2:
                        PlayerActivity playerActivity = this.f5215y;
                        n0 n0Var3 = playerActivity.F;
                        if (n0Var3 != null && !playerActivity.K) {
                            c1 c1Var = ld.o.U0;
                            db.i0 listIterator = n0Var3.g0().f11582a.listIterator(0);
                            while (listIterator.hasNext()) {
                                if (ld.o.U0.contains(Integer.valueOf(((k1) listIterator.next()).f11571b.f11388c))) {
                                    playerActivity.K = true;
                                    n0 n0Var4 = playerActivity.F;
                                    m mVar2 = new m(playerActivity, i192);
                                    l1 g02 = n0Var4.g0();
                                    j1 H0 = n0Var4.H0();
                                    j2.u uVar = new j2.u(n0Var4, 2);
                                    ld.o oVar = new ld.o();
                                    ld.m mVar22 = new ld.m(H0, oVar, uVar);
                                    oVar.R0 = R.string.track_selection_title;
                                    oVar.S0 = mVar22;
                                    oVar.T0 = mVar2;
                                    int i20 = 0;
                                    while (true) {
                                        c1 c1Var2 = ld.o.U0;
                                        if (i20 < c1Var2.A) {
                                            Integer num = (Integer) c1Var2.get(i20);
                                            int intValue = num.intValue();
                                            ArrayList arrayList = new ArrayList();
                                            db.i0 listIterator2 = g02.f11582a.listIterator(0);
                                            while (listIterator2.hasNext()) {
                                                k1 k1Var = (k1) listIterator2.next();
                                                if (k1Var.f11571b.f11388c == intValue) {
                                                    arrayList.add(k1Var);
                                                }
                                            }
                                            if (!arrayList.isEmpty()) {
                                                o.a aVar = new o.a();
                                                boolean contains = H0.E.contains(num);
                                                db.n0 n0Var5 = H0.D;
                                                aVar.f8349z0 = arrayList;
                                                aVar.B0 = contains;
                                                aVar.A0 = true;
                                                aVar.C0 = new HashMap(TrackSelectionView.a(n0Var5, arrayList, false));
                                                oVar.P0.put(intValue, aVar);
                                                oVar.Q0.add(num);
                                            }
                                            i20++;
                                        } else {
                                            oVar.Q(playerActivity.z(), null);
                                            return;
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    case 3:
                        PlayerActivity playerActivity2 = this.f5215y;
                        bf.o[] oVarArr = PlayerActivity.V;
                        if (playerActivity2.a0().isSelected()) {
                            playerActivity2.setRequestedOrientation(1);
                            return;
                        } else {
                            playerActivity2.finish();
                            return;
                        }
                    case 4:
                        PlayerActivity playerActivity3 = this.f5215y;
                        bf.o[] oVarArr2 = PlayerActivity.V;
                        if (playerActivity3.e0()) {
                            playerActivity3.W();
                            return;
                        }
                        return;
                    case 5:
                        PlayerActivity playerActivity4 = this.f5215y;
                        bf.o[] oVarArr3 = PlayerActivity.V;
                        boolean isSelected = playerActivity4.a0().isSelected();
                        boolean z12 = !isSelected;
                        if (!isSelected) {
                            i192 = 6;
                        }
                        playerActivity4.setRequestedOrientation(i192);
                        playerActivity4.T(z12);
                        return;
                    case 6:
                        PlayerActivity playerActivity5 = this.f5215y;
                        bf.o[] oVarArr4 = PlayerActivity.V;
                        boolean isSelected2 = playerActivity5.b0().isSelected();
                        boolean z13 = !isSelected2;
                        View findViewById = playerActivity5.findViewById(R.id.exo_back);
                        kotlin.jvm.internal.k.d(findViewById, "findViewById(...)");
                        if (isSelected2) {
                            i152 = 0;
                        } else {
                            i152 = 8;
                        }
                        findViewById.setVisibility(i152);
                        View findViewById2 = playerActivity5.findViewById(R.id.unlocked_ui);
                        kotlin.jvm.internal.k.d(findViewById2, "findViewById(...)");
                        if (isSelected2) {
                            i162 = 0;
                        } else {
                            i162 = 8;
                        }
                        findViewById2.setVisibility(i162);
                        View findViewById3 = playerActivity5.findViewById(R.id.top_ui);
                        kotlin.jvm.internal.k.d(findViewById3, "findViewById(...)");
                        if (isSelected2) {
                            i172 = 0;
                        } else {
                            i172 = 8;
                        }
                        findViewById3.setVisibility(i172);
                        FrameLayout frameLayout = (FrameLayout) playerActivity5.U.getValue();
                        kotlin.jvm.internal.k.d(frameLayout, "<get-serverExo>(...)");
                        if (!isSelected2) {
                            i182 = 8;
                        }
                        frameLayout.setVisibility(i182);
                        playerActivity5.b0().setSelected(z13);
                        return;
                    case 7:
                        PlayerActivity playerActivity6 = this.f5215y;
                        bf.o[] oVarArr5 = PlayerActivity.V;
                        q0 q0Var = playerActivity6.d0().f10063c;
                        Object obj22 = q0Var.f973e;
                        if (obj22 != o0.f968k) {
                            obj2 = obj22;
                        }
                        kotlin.jvm.internal.k.b(obj2);
                        q0Var.h(Integer.valueOf((((Number) obj2).intValue() + 1) % 3));
                        return;
                    default:
                        PlayerActivity playerActivity7 = this.f5215y;
                        bf.o[] oVarArr6 = PlayerActivity.V;
                        playerActivity7.d0().getData();
                        return;
                }
            }
        });
        d0().f10063c.d(this, new w(new fd.t(this, i15), i13));
        ActivityPlayerBinding Y = Y();
        cf.m.D(Y.f3160h, (SharedPreferences) a8.b.f(this).a(x.a(SharedPreferences.class), null));
        PlayerView playerView = Y.j;
        playerView.setErrorMessageProvider(new lc.c(this));
        Y.f3157e.f3262h.setOnClickListener(new View.OnClickListener(this) { // from class: fd.u

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f5215y;

            {
                this.f5215y = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152;
                int i162;
                int i172;
                Object obj2 = null;
                int i182 = 0;
                int i192 = 1;
                switch (i16) {
                    case 0:
                        n0 n0Var = this.f5215y.F;
                        if (n0Var != null) {
                            n0Var.N0();
                            return;
                        }
                        return;
                    case 1:
                        n0 n0Var2 = this.f5215y.F;
                        if (n0Var2 != null) {
                            n0Var2.L0();
                            return;
                        }
                        return;
                    case 2:
                        PlayerActivity playerActivity = this.f5215y;
                        n0 n0Var3 = playerActivity.F;
                        if (n0Var3 != null && !playerActivity.K) {
                            c1 c1Var = ld.o.U0;
                            db.i0 listIterator = n0Var3.g0().f11582a.listIterator(0);
                            while (listIterator.hasNext()) {
                                if (ld.o.U0.contains(Integer.valueOf(((k1) listIterator.next()).f11571b.f11388c))) {
                                    playerActivity.K = true;
                                    n0 n0Var4 = playerActivity.F;
                                    m mVar2 = new m(playerActivity, i192);
                                    l1 g02 = n0Var4.g0();
                                    j1 H0 = n0Var4.H0();
                                    j2.u uVar = new j2.u(n0Var4, 2);
                                    ld.o oVar = new ld.o();
                                    ld.m mVar22 = new ld.m(H0, oVar, uVar);
                                    oVar.R0 = R.string.track_selection_title;
                                    oVar.S0 = mVar22;
                                    oVar.T0 = mVar2;
                                    int i20 = 0;
                                    while (true) {
                                        c1 c1Var2 = ld.o.U0;
                                        if (i20 < c1Var2.A) {
                                            Integer num = (Integer) c1Var2.get(i20);
                                            int intValue = num.intValue();
                                            ArrayList arrayList = new ArrayList();
                                            db.i0 listIterator2 = g02.f11582a.listIterator(0);
                                            while (listIterator2.hasNext()) {
                                                k1 k1Var = (k1) listIterator2.next();
                                                if (k1Var.f11571b.f11388c == intValue) {
                                                    arrayList.add(k1Var);
                                                }
                                            }
                                            if (!arrayList.isEmpty()) {
                                                o.a aVar = new o.a();
                                                boolean contains = H0.E.contains(num);
                                                db.n0 n0Var5 = H0.D;
                                                aVar.f8349z0 = arrayList;
                                                aVar.B0 = contains;
                                                aVar.A0 = true;
                                                aVar.C0 = new HashMap(TrackSelectionView.a(n0Var5, arrayList, false));
                                                oVar.P0.put(intValue, aVar);
                                                oVar.Q0.add(num);
                                            }
                                            i20++;
                                        } else {
                                            oVar.Q(playerActivity.z(), null);
                                            return;
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    case 3:
                        PlayerActivity playerActivity2 = this.f5215y;
                        bf.o[] oVarArr = PlayerActivity.V;
                        if (playerActivity2.a0().isSelected()) {
                            playerActivity2.setRequestedOrientation(1);
                            return;
                        } else {
                            playerActivity2.finish();
                            return;
                        }
                    case 4:
                        PlayerActivity playerActivity3 = this.f5215y;
                        bf.o[] oVarArr2 = PlayerActivity.V;
                        if (playerActivity3.e0()) {
                            playerActivity3.W();
                            return;
                        }
                        return;
                    case 5:
                        PlayerActivity playerActivity4 = this.f5215y;
                        bf.o[] oVarArr3 = PlayerActivity.V;
                        boolean isSelected = playerActivity4.a0().isSelected();
                        boolean z12 = !isSelected;
                        if (!isSelected) {
                            i192 = 6;
                        }
                        playerActivity4.setRequestedOrientation(i192);
                        playerActivity4.T(z12);
                        return;
                    case 6:
                        PlayerActivity playerActivity5 = this.f5215y;
                        bf.o[] oVarArr4 = PlayerActivity.V;
                        boolean isSelected2 = playerActivity5.b0().isSelected();
                        boolean z13 = !isSelected2;
                        View findViewById = playerActivity5.findViewById(R.id.exo_back);
                        kotlin.jvm.internal.k.d(findViewById, "findViewById(...)");
                        if (isSelected2) {
                            i152 = 0;
                        } else {
                            i152 = 8;
                        }
                        findViewById.setVisibility(i152);
                        View findViewById2 = playerActivity5.findViewById(R.id.unlocked_ui);
                        kotlin.jvm.internal.k.d(findViewById2, "findViewById(...)");
                        if (isSelected2) {
                            i162 = 0;
                        } else {
                            i162 = 8;
                        }
                        findViewById2.setVisibility(i162);
                        View findViewById3 = playerActivity5.findViewById(R.id.top_ui);
                        kotlin.jvm.internal.k.d(findViewById3, "findViewById(...)");
                        if (isSelected2) {
                            i172 = 0;
                        } else {
                            i172 = 8;
                        }
                        findViewById3.setVisibility(i172);
                        FrameLayout frameLayout = (FrameLayout) playerActivity5.U.getValue();
                        kotlin.jvm.internal.k.d(frameLayout, "<get-serverExo>(...)");
                        if (!isSelected2) {
                            i182 = 8;
                        }
                        frameLayout.setVisibility(i182);
                        playerActivity5.b0().setSelected(z13);
                        return;
                    case 7:
                        PlayerActivity playerActivity6 = this.f5215y;
                        bf.o[] oVarArr5 = PlayerActivity.V;
                        q0 q0Var = playerActivity6.d0().f10063c;
                        Object obj22 = q0Var.f973e;
                        if (obj22 != o0.f968k) {
                            obj2 = obj22;
                        }
                        kotlin.jvm.internal.k.b(obj2);
                        q0Var.h(Integer.valueOf((((Number) obj2).intValue() + 1) % 3));
                        return;
                    default:
                        PlayerActivity playerActivity7 = this.f5215y;
                        bf.o[] oVarArr6 = PlayerActivity.V;
                        playerActivity7.d0().getData();
                        return;
                }
            }
        });
        playerView.setOnTouchListener(new com.unity3d.ads.adplayer.a(new GestureDetector(this, new v(this)), 1));
        Intent intent = getIntent();
        k.d(intent, "getIntent(...)");
        U(intent);
        Object systemService3 = getSystemService("uimode");
        k.c(systemService3, "null cannot be cast to non-null type android.app.UiModeManager");
        if (((UiModeManager) systemService3).getCurrentModeType() != 4) {
            d1.a(d0().f10066f).d(this, new w(new fd.t(this, i14), i13));
            d1.a(d0().f10065e).d(this, new w(new fd.t(this, i18), i13));
        }
        d1.a(d0().f10068h).d(this, new w(new fd.t(this, i19), i13));
        d0().f10069i.d(this, new w(new fd.t(this, i10), i13));
        id.h hVar = (id.h) a8.b.f(this).a(x.a(id.h.class), null);
        if (hVar.f6831c.f7841b && hVar.f6832d && hVar.f6833e) {
            UnityAds.show(this, hVar.f6834f, new e(hVar));
        }
        hVar.d(Y().f3154b);
    }

    @Override // i.j, android.app.Activity
    public final void onDestroy() {
        g0();
        super.onDestroy();
    }

    @Override // d.q, android.app.Activity
    public final void onNewIntent(Intent intent) {
        k.e(intent, "intent");
        super.onNewIntent(intent);
        U(intent);
    }

    @Override // i.j, android.app.Activity
    public final void onPause() {
        n0 n0Var;
        super.onPause();
        if ((!e0() || !c2.w.z(this)) && (n0Var = this.F) != null) {
            n0Var.pause();
        }
    }

    @Override // d.q, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10, Configuration newConfig) {
        k.e(newConfig, "newConfig");
        if (z10) {
            ((TextView) this.R.getValue()).setVisibility(8);
        }
        PlayerView playerView = Y().j;
        if (z10) {
            playerView.setUseController(false);
        } else {
            playerView.setUseController(true);
            playerView.i(playerView.h());
        }
        if (getLifecycle().b() == androidx.lifecycle.x.A) {
            if (z10) {
                i0(true);
            } else if (!a0().isSelected()) {
                i0(false);
            }
        } else if (!z10 && getLifecycle().b() != androidx.lifecycle.x.B) {
            g0();
            finish();
        }
        super.onPictureInPictureModeChanged(z10, newConfig);
    }

    @Override // i.j, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (cf.m.b(this)) {
            n0 n0Var = this.F;
            if (n0Var != null) {
                n0Var.j0();
            }
            Window window = getWindow();
            if (window != null) {
                cf.m.w(window, a0().isSelected(), Y().j);
                return;
            }
            return;
        }
        g0();
    }

    @Override // d.q, android.app.Activity
    public final void onUserLeaveHint() {
        if (e0()) {
            W();
        }
        super.onUserLeaveHint();
    }

    @Override // r1.s0
    public final void r(int i6) {
        int i10;
        Object value = this.T.getValue();
        k.d(value, "getValue(...)");
        ProgressBar progressBar = (ProgressBar) value;
        if (i6 == 2) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        progressBar.setVisibility(i10);
    }

    @Override // r1.s0
    public final /* synthetic */ void F() {
    }

    @Override // r1.s0
    public final /* synthetic */ void C(r1.d dVar) {
    }

    @Override // r1.s0
    public final /* synthetic */ void E(j0 j0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void G(List list) {
    }

    @Override // r1.s0
    public final /* synthetic */ void J(r1.o0 o0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void O(r1.n0 n0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void P(r1.h0 h0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void a(int i6) {
    }

    @Override // r1.s0
    public final /* synthetic */ void b(p1 p1Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void c(int i6) {
    }

    @Override // r1.s0
    public final /* synthetic */ void d(boolean z10) {
    }

    @Override // r1.s0
    public final /* synthetic */ void e(int i6) {
    }

    @Override // r1.s0
    public final /* synthetic */ void f(boolean z10) {
    }

    @Override // r1.s0
    public final /* synthetic */ void g(int i6) {
    }

    @Override // r1.s0
    public final /* synthetic */ void i(l1 l1Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void k(j1 j1Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void m(boolean z10) {
    }

    @Override // r1.s0
    public final /* synthetic */ void p(r1.q0 q0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void q(float f3) {
    }

    @Override // r1.s0
    public final /* synthetic */ void s(r1.h0 h0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void t(r0 r0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void x(boolean z10) {
    }

    @Override // r1.s0
    public final /* synthetic */ void y(t1.c cVar) {
    }

    @Override // r1.s0
    public final /* synthetic */ void A(int i6, e0 e0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void H(int i6, boolean z10) {
    }

    @Override // r1.s0
    public final /* synthetic */ void N(int i6, int i10) {
    }

    @Override // r1.s0
    public final /* synthetic */ void h(r1.d1 d1Var, int i6) {
    }

    @Override // r1.s0
    public final /* synthetic */ void o(int i6, boolean z10) {
    }

    @Override // r1.s0
    public final /* synthetic */ void I(int i6, t0 t0Var, t0 t0Var2) {
    }
}
