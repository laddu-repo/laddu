package com.livxow.tv.activities;

import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.i0;
import androidx.fragment.app.m0;
import androidx.fragment.app.y;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.mb;
import com.google.android.material.button.MaterialButton;
import com.livxow.tv.activities.TvActivity;
import com.livxow.tv.app.App;
import d2.e;
import e.g;
import fc.l;
import fc.m;
import gc.r;
import gc.s;
import h.j;
import h.q;
import java.io.File;
import jc.f;
import ka.c;
import nc.d;
import o.o3;
import pc.a;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class TvActivity extends j {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final /* synthetic */ int f3678g0 = 0;
    public f W;
    public a X;
    public App Y;
    public boolean Z;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public View f3680b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public d f3681c0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public o3 f3683e0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f3679a0 = -1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final g f3682d0 = l(new e(20), new m0(2));

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final i0 f3684f0 = new i0(this, 3);

    @Override // h.j, c.j, h0.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        View viewK;
        q.k();
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(m.activity_tv, (ViewGroup) null, false);
        int i = l.main_fragment_container;
        FrameLayout frameLayout = (FrameLayout) a.a.k(viewInflate, i);
        if (frameLayout == null || (viewK = a.a.k(viewInflate, (i = l.top_binding))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
        int i10 = l.btns_lay;
        LinearLayout linearLayout = (LinearLayout) a.a.k(viewK, i10);
        if (linearLayout != null) {
            i10 = l.cats_btn;
            MaterialButton materialButton = (MaterialButton) a.a.k(viewK, i10);
            if (materialButton != null) {
                i10 = l.events_btn;
                MaterialButton materialButton2 = (MaterialButton) a.a.k(viewK, i10);
                if (materialButton2 != null) {
                    i10 = l.fav_btn;
                    ImageButton imageButton = (ImageButton) a.a.k(viewK, i10);
                    if (imageButton != null) {
                        i10 = l.highlights_btn;
                        MaterialButton materialButton3 = (MaterialButton) a.a.k(viewK, i10);
                        if (materialButton3 != null) {
                            i10 = l.refresh_btn;
                            ImageButton imageButton2 = (ImageButton) a.a.k(viewK, i10);
                            if (imageButton2 != null) {
                                i10 = l.search_btn;
                                ImageButton imageButton3 = (ImageButton) a.a.k(viewK, i10);
                                if (imageButton3 != null) {
                                    i10 = l.search_img;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) a.a.k(viewK, i10);
                                    if (appCompatImageView != null) {
                                        i10 = l.search_view;
                                        AppCompatEditText appCompatEditText = (AppCompatEditText) a.a.k(viewK, i10);
                                        if (appCompatEditText != null) {
                                            i10 = l.settings_btn;
                                            MaterialButton materialButton4 = (MaterialButton) a.a.k(viewK, i10);
                                            if (materialButton4 != null) {
                                                i10 = l.sports_btn;
                                                MaterialButton materialButton5 = (MaterialButton) a.a.k(viewK, i10);
                                                if (materialButton5 != null) {
                                                    i10 = l.title_txt;
                                                    if (((TextView) a.a.k(viewK, i10)) != null) {
                                                        this.W = new f(linearLayout, materialButton, materialButton2, imageButton, materialButton3, imageButton2, imageButton3, appCompatImageView, appCompatEditText, materialButton4, materialButton5);
                                                        setContentView((LinearLayout) viewInflate);
                                                        j().a(this.f3684f0, this);
                                                        App app = App.P;
                                                        this.Y = app;
                                                        app.f3686w = this;
                                                        if (Build.VERSION.SDK_INT >= 33 && i0.d.a(this, "android.permission.POST_NOTIFICATIONS") != 0 && !shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                                                            this.f3682d0.a("android.permission.POST_NOTIFICATIONS");
                                                        }
                                                        this.X = this.Y.f3685v;
                                                        mb mbVarE = mb.e(getLayoutInflater().inflate(m.bottom_nav_lay, (ViewGroup) null, false));
                                                        LinearLayout linearLayout2 = (LinearLayout) mbVarE.f2889c;
                                                        o3 o3Var = new o3(this, mbVarE, frameLayout.getId());
                                                        this.f3683e0 = o3Var;
                                                        o3Var.b(this.X);
                                                        this.f3683e0.a(linearLayout2, false);
                                                        o3 o3Var2 = this.f3683e0;
                                                        this.f3681c0 = (d) o3Var2.f9255x;
                                                        o3Var2.B = new androidx.fragment.app.e(8, this, mbVarE);
                                                        MaterialButton materialButton6 = this.W.f7063c;
                                                        this.f3680b0 = materialButton6;
                                                        materialButton6.setSelected(true);
                                                        int i11 = 0;
                                                        this.W.f7063c.setOnClickListener(new r(i11, this, linearLayout2));
                                                        this.W.f7062b.setOnClickListener(new r(i11, this, (LinearLayout) mbVarE.f2888b));
                                                        this.W.f7069k.setOnClickListener(new r(i11, this, (LinearLayout) mbVarE.f2892g));
                                                        this.W.f7065e.setOnClickListener(new r(i11, this, (LinearLayout) mbVarE.f2890d));
                                                        this.W.f7068j.setOnClickListener(new r(0, this, (LinearLayout) mbVarE.f));
                                                        final int i12 = 0;
                                                        this.W.f7064d.setOnClickListener(new View.OnClickListener(this) { // from class: gc.p

                                                            /* JADX INFO: renamed from: w, reason: collision with root package name */
                                                            public final /* synthetic */ TvActivity f5823w;

                                                            {
                                                                this.f5823w = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                switch (i12) {
                                                                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                                        this.f5823w.f3681c0.c();
                                                                        break;
                                                                    case 1:
                                                                        y yVar = this.f5823w.f3681c0.f9107g;
                                                                        if (yVar instanceof mc.a) {
                                                                            ((mc.a) yVar).T();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        TvActivity tvActivity = this.f5823w;
                                                                        tvActivity.W.f7061a.setVisibility(8);
                                                                        tvActivity.W.f7067h.setVisibility(0);
                                                                        tvActivity.W.i.setVisibility(0);
                                                                        tvActivity.W.i.setFocusable(true);
                                                                        tvActivity.W.i.requestFocus();
                                                                        ((InputMethodManager) tvActivity.getSystemService("input_method")).showSoftInput(tvActivity.W.i, 1);
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        final int i13 = 1;
                                                        this.W.f.setOnClickListener(new View.OnClickListener(this) { // from class: gc.p

                                                            /* JADX INFO: renamed from: w, reason: collision with root package name */
                                                            public final /* synthetic */ TvActivity f5823w;

                                                            {
                                                                this.f5823w = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                switch (i13) {
                                                                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                                        this.f5823w.f3681c0.c();
                                                                        break;
                                                                    case 1:
                                                                        y yVar = this.f5823w.f3681c0.f9107g;
                                                                        if (yVar instanceof mc.a) {
                                                                            ((mc.a) yVar).T();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        TvActivity tvActivity = this.f5823w;
                                                                        tvActivity.W.f7061a.setVisibility(8);
                                                                        tvActivity.W.f7067h.setVisibility(0);
                                                                        tvActivity.W.i.setVisibility(0);
                                                                        tvActivity.W.i.setFocusable(true);
                                                                        tvActivity.W.i.requestFocus();
                                                                        ((InputMethodManager) tvActivity.getSystemService("input_method")).showSoftInput(tvActivity.W.i, 1);
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        final int i14 = 2;
                                                        this.W.f7066g.setOnClickListener(new View.OnClickListener(this) { // from class: gc.p

                                                            /* JADX INFO: renamed from: w, reason: collision with root package name */
                                                            public final /* synthetic */ TvActivity f5823w;

                                                            {
                                                                this.f5823w = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                switch (i14) {
                                                                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                                        this.f5823w.f3681c0.c();
                                                                        break;
                                                                    case 1:
                                                                        y yVar = this.f5823w.f3681c0.f9107g;
                                                                        if (yVar instanceof mc.a) {
                                                                            ((mc.a) yVar).T();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        TvActivity tvActivity = this.f5823w;
                                                                        tvActivity.W.f7061a.setVisibility(8);
                                                                        tvActivity.W.f7067h.setVisibility(0);
                                                                        tvActivity.W.i.setVisibility(0);
                                                                        tvActivity.W.i.setFocusable(true);
                                                                        tvActivity.W.i.requestFocus();
                                                                        ((InputMethodManager) tvActivity.getSystemService("input_method")).showSoftInput(tvActivity.W.i, 1);
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        this.W.i.addTextChangedListener(new s(0, this));
                                                        this.W.i.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: gc.q
                                                            @Override // android.widget.TextView.OnEditorActionListener
                                                            public final boolean onEditorAction(TextView textView, int i15, KeyEvent keyEvent) {
                                                                int i16 = TvActivity.f3678g0;
                                                                if (i15 != 6) {
                                                                    return false;
                                                                }
                                                                TvActivity tvActivity = this.f5824a;
                                                                ((InputMethodManager) tvActivity.getSystemService("input_method")).hideSoftInputFromWindow(tvActivity.W.i.getWindowToken(), 0);
                                                                return true;
                                                            }
                                                        });
                                                        this.Y.f3689z = new e(21);
                                                        File externalFilesDir = getExternalFilesDir(null);
                                                        if (externalFilesDir == null) {
                                                            return;
                                                        }
                                                        c.G(externalFilesDir);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewK.getResources().getResourceName(i10)));
    }
}
