package com.livxow.tv.activities;

import ad.c;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.UiModeManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.emoji2.text.v;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.d1;
import androidx.fragment.app.m0;
import androidx.fragment.app.q0;
import androidx.media3.decoder.DecoderInputBuffer;
import b8.h;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.livxow.tv.activities.SplashActivity;
import com.livxow.tv.app.App;
import d2.e;
import e.g;
import fc.l;
import fc.m;
import gc.n;
import h.j;
import h.q;
import i0.d;
import mc.z;
import pc.a;
import rc.b;
import sb.p;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"CustomSplashScreen"})
public class SplashActivity extends j {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final /* synthetic */ int f3665i0 = 0;
    public c W;
    public p X;
    public int Y;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f3666a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f3667b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public a f3668c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public z f3669d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public a f3670e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public String f3671f0;
    public int Z = 0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f3672g0 = false;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final g f3673h0 = l(new e(19), new m0(2));

    @Override // h.j, c.j, h0.e, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        View viewK;
        View viewK2;
        q.k();
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(m.activity_splash, (ViewGroup) null, false);
        int i = l.error_ly_splash;
        View viewK3 = a.a.k(viewInflate, i);
        if (viewK3 != null) {
            int i10 = l.clear_data_btn;
            MaterialButton materialButton = (MaterialButton) a.a.k(viewK3, i10);
            if (materialButton != null) {
                ScrollView scrollView = (ScrollView) viewK3;
                i10 = l.error_txt;
                if (((TextView) a.a.k(viewK3, i10)) != null) {
                    i10 = l.join_telegram_btn;
                    MaterialButton materialButton2 = (MaterialButton) a.a.k(viewK3, i10);
                    if (materialButton2 != null) {
                        i10 = l.retry_btn;
                        MaterialButton materialButton3 = (MaterialButton) a.a.k(viewK3, i10);
                        if (materialButton3 != null) {
                            p pVar = new p(scrollView, materialButton, materialButton2, materialButton3, 21);
                            i = l.imageView;
                            if (((ShapeableImageView) a.a.k(viewInflate, i)) != null) {
                                i = l.logo_card;
                                if (((MaterialCardView) a.a.k(viewInflate, i)) != null) {
                                    i = l.lottieAnimationView;
                                    LottieAnimationView lottieAnimationView = (LottieAnimationView) a.a.k(viewInflate, i);
                                    if (lottieAnimationView != null && (viewK = a.a.k(viewInflate, (i = l.splash_blob_bottom))) != null && (viewK2 = a.a.k(viewInflate, (i = l.splash_blob_top))) != null) {
                                        i = l.splash_tagline;
                                        if (((TextView) a.a.k(viewInflate, i)) != null) {
                                            i = l.splash_tagline_two;
                                            if (((TextView) a.a.k(viewInflate, i)) != null) {
                                                i = l.splash_title;
                                                if (((TextView) a.a.k(viewInflate, i)) != null) {
                                                    i = l.update_container;
                                                    FragmentContainerView fragmentContainerView = (FragmentContainerView) a.a.k(viewInflate, i);
                                                    if (fragmentContainerView != null) {
                                                        i = l.versionTXT;
                                                        TextView textView = (TextView) a.a.k(viewInflate, i);
                                                        if (textView != null) {
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                            this.W = new c(constraintLayout, pVar, lottieAnimationView, viewK, viewK2, fragmentContainerView, textView);
                                                            this.X = pVar;
                                                            setContentView(constraintLayout);
                                                            boolean z2 = getPackageManager().hasSystemFeature("android.software.leanback") || getPackageManager().hasSystemFeature("com.google.android.tv") || ((UiModeManager) getSystemService("uimode")).getCurrentModeType() == 4;
                                                            this.f3667b0 = z2;
                                                            vc.a.j(this).edit().putBoolean("is_tv", z2).apply();
                                                            try {
                                                                PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
                                                                if (Build.VERSION.SDK_INT >= 29) {
                                                                    this.Y = (int) packageInfo.getLongVersionCode();
                                                                } else {
                                                                    this.Y = packageInfo.versionCode;
                                                                }
                                                                String str = packageInfo.versionName;
                                                                ((TextView) this.W.A).setText(str);
                                                                App.P.N = str;
                                                            } catch (PackageManager.NameNotFoundException e7) {
                                                                e7.printStackTrace();
                                                            }
                                                            vc.a.k(this).putInt("player_called", 0).apply();
                                                            if (Build.VERSION.SDK_INT >= 33 && d.a(this, "android.permission.POST_NOTIFICATIONS") != 0 && !shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                                                                this.f3673h0.a("android.permission.POST_NOTIFICATIONS");
                                                            }
                                                            final int i11 = 0;
                                                            ((MaterialButton) this.X.f11745z).setOnClickListener(new View.OnClickListener(this) { // from class: gc.m

                                                                /* JADX INFO: renamed from: w, reason: collision with root package name */
                                                                public final /* synthetic */ SplashActivity f5818w;

                                                                {
                                                                    this.f5818w = this;
                                                                }

                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) throws Throwable {
                                                                    int i12 = i11;
                                                                    SplashActivity splashActivity = this.f5818w;
                                                                    switch (i12) {
                                                                        case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                                            ((ScrollView) splashActivity.X.f11742w).setVisibility(8);
                                                                            splashActivity.w();
                                                                            ((LottieAnimationView) splashActivity.W.f479w).setProgress(0.0f);
                                                                            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) splashActivity.W.f479w;
                                                                            lottieAnimationView2.I.add(j5.h.A);
                                                                            lottieAnimationView2.C.l();
                                                                            break;
                                                                        case 1:
                                                                            String str2 = splashActivity.f3668c0.f10469b;
                                                                            try {
                                                                                Intent intent = new Intent("android.intent.action.VIEW");
                                                                                intent.setData(Uri.parse(str2));
                                                                                splashActivity.startActivity(intent);
                                                                            } catch (ActivityNotFoundException e10) {
                                                                                Toast.makeText(splashActivity, e10.getMessage(), 0).show();
                                                                                return;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i13 = SplashActivity.f3665i0;
                                                                            splashActivity.getClass();
                                                                            try {
                                                                                ((ActivityManager) splashActivity.getSystemService("activity")).clearApplicationUserData();
                                                                            } catch (Exception e11) {
                                                                                Toast.makeText(splashActivity, e11.getMessage(), 0).show();
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            this.f3668c0 = new a();
                                                            final int i12 = 1;
                                                            ((MaterialButton) this.X.f11744y).setOnClickListener(new View.OnClickListener(this) { // from class: gc.m

                                                                /* JADX INFO: renamed from: w, reason: collision with root package name */
                                                                public final /* synthetic */ SplashActivity f5818w;

                                                                {
                                                                    this.f5818w = this;
                                                                }

                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) throws Throwable {
                                                                    int i122 = i12;
                                                                    SplashActivity splashActivity = this.f5818w;
                                                                    switch (i122) {
                                                                        case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                                            ((ScrollView) splashActivity.X.f11742w).setVisibility(8);
                                                                            splashActivity.w();
                                                                            ((LottieAnimationView) splashActivity.W.f479w).setProgress(0.0f);
                                                                            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) splashActivity.W.f479w;
                                                                            lottieAnimationView2.I.add(j5.h.A);
                                                                            lottieAnimationView2.C.l();
                                                                            break;
                                                                        case 1:
                                                                            String str2 = splashActivity.f3668c0.f10469b;
                                                                            try {
                                                                                Intent intent = new Intent("android.intent.action.VIEW");
                                                                                intent.setData(Uri.parse(str2));
                                                                                splashActivity.startActivity(intent);
                                                                            } catch (ActivityNotFoundException e10) {
                                                                                Toast.makeText(splashActivity, e10.getMessage(), 0).show();
                                                                                return;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i13 = SplashActivity.f3665i0;
                                                                            splashActivity.getClass();
                                                                            try {
                                                                                ((ActivityManager) splashActivity.getSystemService("activity")).clearApplicationUserData();
                                                                            } catch (Exception e11) {
                                                                                Toast.makeText(splashActivity, e11.getMessage(), 0).show();
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            final int i13 = 2;
                                                            ((MaterialButton) this.X.f11743x).setOnClickListener(new View.OnClickListener(this) { // from class: gc.m

                                                                /* JADX INFO: renamed from: w, reason: collision with root package name */
                                                                public final /* synthetic */ SplashActivity f5818w;

                                                                {
                                                                    this.f5818w = this;
                                                                }

                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) throws Throwable {
                                                                    int i122 = i13;
                                                                    SplashActivity splashActivity = this.f5818w;
                                                                    switch (i122) {
                                                                        case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                                            ((ScrollView) splashActivity.X.f11742w).setVisibility(8);
                                                                            splashActivity.w();
                                                                            ((LottieAnimationView) splashActivity.W.f479w).setProgress(0.0f);
                                                                            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) splashActivity.W.f479w;
                                                                            lottieAnimationView2.I.add(j5.h.A);
                                                                            lottieAnimationView2.C.l();
                                                                            break;
                                                                        case 1:
                                                                            String str2 = splashActivity.f3668c0.f10469b;
                                                                            try {
                                                                                Intent intent = new Intent("android.intent.action.VIEW");
                                                                                intent.setData(Uri.parse(str2));
                                                                                splashActivity.startActivity(intent);
                                                                            } catch (ActivityNotFoundException e10) {
                                                                                Toast.makeText(splashActivity, e10.getMessage(), 0).show();
                                                                                return;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i132 = SplashActivity.f3665i0;
                                                                            splashActivity.getClass();
                                                                            try {
                                                                                ((ActivityManager) splashActivity.getSystemService("activity")).clearApplicationUserData();
                                                                            } catch (Exception e11) {
                                                                                Toast.makeText(splashActivity, e11.getMessage(), 0).show();
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            w();
                                                            ((LottieAnimationView) this.W.f479w).C.f6909w.addListener(new n(this));
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
            throw new NullPointerException("Missing required view with ID: ".concat(viewK3.getResources().getResourceName(i10)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // h.j, android.app.Activity
    public final void onResume() {
        super.onResume();
        b.a(this);
        if (this.f3669d0 != null) {
            try {
                ((FragmentContainerView) this.W.f482z).setVisibility(0);
                q0 q0VarO = o();
                q0VarO.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(q0VarO);
                aVar.h(l.update_container, this.f3669d0);
                aVar.d(false);
                this.f3669d0 = null;
            } catch (Exception unused) {
            }
        }
    }

    public final void v(String str) {
        if (isDestroyed() || isFinishing()) {
            return;
        }
        if (x()) {
            h.r(this, str.concat("app.txt"), new androidx.fragment.app.e(7, this, str), !this.f3667b0);
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new v(19, this), 500L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4 A[Catch: IOException -> 0x007b, XmlPullParserException -> 0x007e, TryCatch #3 {IOException -> 0x007b, XmlPullParserException -> 0x007e, blocks: (B:14:0x006e, B:16:0x0074, B:21:0x0081, B:25:0x0091, B:51:0x00e9, B:28:0x0099, B:32:0x00a9, B:33:0x00ad, B:39:0x00bb, B:50:0x00e4, B:44:0x00ca, B:46:0x00d2, B:47:0x00d7, B:49:0x00df), top: B:62:0x006e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.livxow.tv.activities.SplashActivity.w():void");
    }

    public final boolean x() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        if (Build.VERSION.SDK_INT > 28) {
            return connectivityManager.getActiveNetwork() != null;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void y(String str) {
        vc.a.j(this).edit().putString("api_host", "https://error_pro.com").apply();
        int i = this.Z;
        if (i == 0) {
            this.f3666a0 = true;
            w();
        } else if (i < 2) {
            v(str);
        } else {
            ((ScrollView) this.X.f11742w).setVisibility(0);
        }
        this.Z++;
    }

    public final void z() {
        a aVar = this.f3670e0;
        if (aVar == null) {
            w();
            return;
        }
        if (aVar.f10482q <= this.Y) {
            startActivity(new Intent(this, (Class<?>) (this.f3667b0 ? TvActivity.class : MainActivity.class)));
            finish();
            return;
        }
        wc.b bVar = (wc.b) new a7.j(this).p(wc.b.class);
        bVar.i = this.Y;
        bVar.f14025h = this.f3671f0;
        a aVar2 = this.f3670e0;
        bVar.f = aVar2.f10472e;
        bVar.f14023e = aVar2.f;
        bVar.f14024g = aVar2.f10470c;
        bVar.f14022d = new d1(21, this);
        this.f3669d0 = new z();
        if (isFinishing() || o().N()) {
            return;
        }
        ((FragmentContainerView) this.W.f482z).setVisibility(0);
        q0 q0VarO = o();
        q0VarO.getClass();
        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(q0VarO);
        aVar3.h(l.update_container, this.f3669d0);
        aVar3.d(false);
        this.f3669d0 = null;
    }
}
