package com.playfy.tv.activities;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.lifecycle.d1;
import androidx.lifecycle.i;
import androidx.lifecycle.j1;
import bf.o;
import cf.m;
import com.google.android.material.datepicker.n;
import com.playfy.tv.R;
import com.playfy.tv.databinding.ActivitySplashBinding;
import com.playfy.tv.databinding.DialogBlockedAppSingleBinding;
import com.playfy.tv.databinding.DialogBlockedAppsMultiBinding;
import com.playfy.tv.databinding.ErrorLyBinding;
import com.playfy.tv.databinding.ItemBlockedAppBinding;
import d.s;
import f.c;
import fd.b0;
import fd.c0;
import fd.d0;
import fd.e0;
import fd.w;
import he.g;
import he.k;
import i.h;
import i.j;
import i0.f;
import i4.u0;
import ie.r;
import j6.a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import jb.b;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import od.n0;
import t0.h0;
import t0.q0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@SuppressLint({"CustomSplashScreen"})
/* loaded from: classes.dex */
public final class SplashActivity extends j {
    public static final /* synthetic */ o[] K;
    public final Object D;
    public final a E;
    public List F;
    public h G;
    public final c H;
    public final Object I;
    public final c J;

    static {
        q qVar = new q(SplashActivity.class, "binding", "getBinding()Lcom/playfy/tv/databinding/ActivitySplashBinding;");
        x.f8056a.getClass();
        K = new o[]{qVar};
    }

    public SplashActivity() {
        super(R.layout.activity_splash);
        this.D = he.a.c(g.f6075z, new e0(this, 1));
        this.E = b.s(this, ActivitySplashBinding.class);
        this.F = r.f6846x;
        this.H = registerForActivityResult(new g.b(2), new b0(this, 2));
        this.I = he.a.c(g.f6073x, new e0(this, 0));
        this.J = registerForActivityResult(new g.b(2), new b0(this, 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [he.f, java.lang.Object] */
    public final jd.b T() {
        return (jd.b) ((n0) this.D.getValue()).f10135h.getValue();
    }

    public final ActivitySplashBinding U() {
        return (ActivitySplashBinding) this.E.a(this, K[0]);
    }

    public final void V() {
        if (((id.h) a8.b.f(this).a(x.a(id.h.class), null)).b(3, "sp_unlock")) {
            startActivity(new Intent(this, (Class<?>) FullBannerActivity.class));
        } else {
            startActivity(new Intent(this, (Class<?>) MainActivity.class));
        }
        finish();
    }

    public final void W() {
        File file = new File(getFilesDir(), m.p(this));
        if (!file.exists()) {
            return;
        }
        Uri d10 = FileProvider.d(this, getPackageName() + ".provider", file);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(d10, "application/vnd.android.package-archive");
        intent.setFlags(268435457);
        startActivity(intent);
    }

    public final void X() {
        boolean canRequestPackageInstalls;
        if (Build.VERSION.SDK_INT >= 26) {
            canRequestPackageInstalls = getPackageManager().canRequestPackageInstalls();
            if (!canRequestPackageInstalls) {
                Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
                intent.setData(Uri.parse("package:" + getPackageName()));
                this.J.a(intent);
                return;
            }
            W();
            return;
        }
        W();
    }

    public final boolean Y(String str) {
        Object b10;
        try {
            getPackageManager().getApplicationInfo(str, 0);
            b10 = Boolean.TRUE;
        } catch (Throwable th) {
            b10 = he.a.b(th);
        }
        if (k.a(b10) != null) {
            b10 = Boolean.FALSE;
        }
        return ((Boolean) b10).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c6.h, java.lang.Object] */
    public final void Z(ArrayList arrayList) {
        final h e10;
        final int i6 = 0;
        c0 c0Var = new c0(this, i6);
        i iVar = new i(this, 5);
        final int i10 = 1;
        c0 c0Var2 = new c0(this, i10);
        final ?? obj = new Object();
        obj.f1981x = this;
        obj.f1982y = c0Var;
        obj.f1983z = iVar;
        obj.A = c0Var2;
        final int i11 = 2;
        if (arrayList.size() == 1) {
            final String str = (String) ie.j.G(arrayList);
            DialogBlockedAppSingleBinding inflate = DialogBlockedAppSingleBinding.inflate(LayoutInflater.from(this), null, false);
            ScrollView scrollView = inflate.f3205a;
            kotlin.jvm.internal.k.d(scrollView, "getRoot(...)");
            e10 = m.e(this, scrollView);
            String w10 = obj.w(str);
            inflate.f3214k.setText(getString(R.string.blocked_app_single_message, w10, getString(R.string.app_name)));
            inflate.j.setText(getString(R.string.blocked_app_single_hint));
            inflate.f3213i.setText(getString(R.string.blocked_app_single_footer, getString(R.string.app_name)));
            inflate.f3207c.setText(w10);
            inflate.f3208d.setText(str);
            inflate.f3209e.setText(getString(R.string.blocked_app_installed));
            inflate.f3206b.setImageDrawable(obj.x(str));
            LinearLayout linearLayout = inflate.f3211g;
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: md.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            ((c0) obj.f1982y).invoke(str);
                            return;
                        default:
                            ((c0) obj.f1982y).invoke(str);
                            return;
                    }
                }
            });
            inflate.f3212h.setOnClickListener(new View.OnClickListener() { // from class: md.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            e10.dismiss();
                            ((c0) obj.A).invoke(Boolean.TRUE);
                            return;
                        case 1:
                            e10.dismiss();
                            ((c0) obj.A).invoke(Boolean.FALSE);
                            return;
                        case 2:
                            e10.dismiss();
                            ((c0) obj.A).invoke(Boolean.TRUE);
                            return;
                        default:
                            e10.dismiss();
                            ((c0) obj.A).invoke(Boolean.FALSE);
                            return;
                    }
                }
            });
            final int i12 = 3;
            inflate.f3210f.setOnClickListener(new View.OnClickListener() { // from class: md.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            e10.dismiss();
                            ((c0) obj.A).invoke(Boolean.TRUE);
                            return;
                        case 1:
                            e10.dismiss();
                            ((c0) obj.A).invoke(Boolean.FALSE);
                            return;
                        case 2:
                            e10.dismiss();
                            ((c0) obj.A).invoke(Boolean.TRUE);
                            return;
                        default:
                            e10.dismiss();
                            ((c0) obj.A).invoke(Boolean.FALSE);
                            return;
                    }
                }
            });
            e10.setCancelable(false);
            e10.setCanceledOnTouchOutside(false);
            e10.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: md.c
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i13, KeyEvent keyEvent) {
                    if (i13 == 4) {
                        if (keyEvent.getAction() == 1) {
                            h.this.dismiss();
                            ((c0) obj.A).invoke(Boolean.TRUE);
                        }
                        return true;
                    }
                    return false;
                }
            });
            e10.show();
            linearLayout.requestFocus();
        } else {
            DialogBlockedAppsMultiBinding inflate2 = DialogBlockedAppsMultiBinding.inflate(LayoutInflater.from(this), null, false);
            LinearLayout linearLayout2 = inflate2.f3218d;
            LinearLayout linearLayout3 = inflate2.f3215a;
            kotlin.jvm.internal.k.d(linearLayout3, "getRoot(...)");
            e10 = m.e(this, linearLayout3);
            inflate2.f3220f.setText(getString(R.string.blocked_apps_count_badge, Integer.valueOf(arrayList.size())));
            inflate2.f3223i.setText(getString(R.string.blocked_apps_message, Integer.valueOf(arrayList.size()), getString(R.string.app_name)));
            inflate2.f3222h.setText(getString(R.string.blocked_apps_multi_hint));
            inflate2.f3221g.setText(getString(R.string.blocked_app_multi_footer, getString(R.string.app_name)));
            LinearLayout linearLayout4 = inflate2.f3216b;
            linearLayout4.removeAllViews();
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj2 = arrayList.get(i13);
                i13++;
                final String str2 = (String) obj2;
                ItemBlockedAppBinding inflate3 = ItemBlockedAppBinding.inflate(LayoutInflater.from(this), linearLayout4, false);
                LinearLayout linearLayout5 = inflate3.f3324a;
                inflate3.f3326c.setText(obj.w(str2));
                inflate3.f3327d.setText(getString(R.string.blocked_app_tap_remove));
                inflate3.f3325b.setImageDrawable(obj.x(str2));
                linearLayout5.setOnClickListener(new View.OnClickListener() { // from class: md.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i6) {
                            case 0:
                                ((c0) obj.f1982y).invoke(str2);
                                return;
                            default:
                                ((c0) obj.f1982y).invoke(str2);
                                return;
                        }
                    }
                });
                linearLayout4.addView(linearLayout5);
            }
            linearLayout2.setOnClickListener(new n(obj, 6));
            inflate2.f3219e.setOnClickListener(new View.OnClickListener() { // from class: md.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i6) {
                        case 0:
                            e10.dismiss();
                            ((c0) obj.A).invoke(Boolean.TRUE);
                            return;
                        case 1:
                            e10.dismiss();
                            ((c0) obj.A).invoke(Boolean.FALSE);
                            return;
                        case 2:
                            e10.dismiss();
                            ((c0) obj.A).invoke(Boolean.TRUE);
                            return;
                        default:
                            e10.dismiss();
                            ((c0) obj.A).invoke(Boolean.FALSE);
                            return;
                    }
                }
            });
            inflate2.f3217c.setOnClickListener(new View.OnClickListener() { // from class: md.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            e10.dismiss();
                            ((c0) obj.A).invoke(Boolean.TRUE);
                            return;
                        case 1:
                            e10.dismiss();
                            ((c0) obj.A).invoke(Boolean.FALSE);
                            return;
                        case 2:
                            e10.dismiss();
                            ((c0) obj.A).invoke(Boolean.TRUE);
                            return;
                        default:
                            e10.dismiss();
                            ((c0) obj.A).invoke(Boolean.FALSE);
                            return;
                    }
                }
            });
            e10.setCancelable(false);
            e10.setCanceledOnTouchOutside(false);
            e10.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: md.c
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i132, KeyEvent keyEvent) {
                    if (i132 == 4) {
                        if (keyEvent.getAction() == 1) {
                            h.this.dismiss();
                            ((c0) obj.A).invoke(Boolean.TRUE);
                        }
                        return true;
                    }
                    return false;
                }
            });
            e10.show();
            linearLayout2.requestFocus();
        }
        this.G = e10;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [he.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [ne.j, ve.q] */
    @Override // i.j, d.q, h0.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        int i6 = 3;
        s.a(this, null, 3);
        FrameLayout frameLayout = U().f3169a;
        kotlin.jvm.internal.k.d(frameLayout, "getRoot(...)");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            s.a(this, null, 3);
            u0 u0Var = new u0(20);
            WeakHashMap weakHashMap = q0.f12397a;
            h0.l(frameLayout, u0Var);
        }
        TextView textView = U().f3176h;
        try {
            str = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
            kotlin.jvm.internal.k.b(str);
        } catch (Exception unused) {
            str = "unknown";
        }
        textView.setText("Version ".concat(str));
        ErrorLyBinding errorLyBinding = U().f3171c;
        LinearLayout linearLayout = errorLyBinding.f3255a;
        LinearLayout linearLayout2 = errorLyBinding.f3263i;
        linearLayout.setVisibility(0);
        linearLayout2.setVisibility(0);
        int i11 = 1;
        errorLyBinding.f3262h.setOnClickListener(new d0(this, i11));
        int i12 = 2;
        linearLayout2.setOnClickListener(new d0(this, i12));
        linearLayout.setOnClickListener(new d0(this, i6));
        U().f3178k.setVisibility(8);
        ?? r12 = this.D;
        n0 n0Var = (n0) r12.getValue();
        d1.a(new j1(n0Var.f10134g, n0Var.f10133f, (ve.q) new ne.j(3, null))).d(this, new w(new c0(this, i12), 1));
        if (i10 >= 33) {
            if (f.a(this, "android.permission.POST_NOTIFICATIONS") != 0) {
                registerForActivityResult(new g.b(i11), new b0(this, 1)).a("android.permission.POST_NOTIFICATIONS");
            } else {
                ((n0) r12.getValue()).f10131d.c("permissionChecked", Boolean.TRUE);
            }
        }
    }
}
