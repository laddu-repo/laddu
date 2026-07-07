package com.playfy.tv.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.Window;
import android.webkit.URLUtil;
import android.widget.ImageView;
import androidx.lifecycle.i;
import bf.o;
import cf.n;
import com.google.android.material.button.MaterialButton;
import com.playfy.tv.R;
import com.playfy.tv.activities.FullBannerActivity;
import com.playfy.tv.databinding.ActivityFullBannerBinding;
import d.n0;
import d.o0;
import fd.c;
import fd.d;
import fd.e;
import he.g;
import he.m;
import i.j;
import id.h;
import j6.a;
import jb.b;
import kd.m0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import l6.f;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class FullBannerActivity extends j {
    public static final /* synthetic */ o[] H;
    public final a D;
    public final Object E;
    public final m F;
    public CountDownTimer G;

    static {
        q qVar = new q(FullBannerActivity.class, "binding", "getBinding()Lcom/playfy/tv/databinding/ActivityFullBannerBinding;");
        x.f8056a.getClass();
        H = new o[]{qVar};
    }

    public FullBannerActivity() {
        super(R.layout.activity_full_banner);
        this.D = b.s(this, ActivityFullBannerBinding.class);
        this.E = he.a.c(g.f6073x, new d(this, 0));
        this.F = he.a.d(new i(this, 4));
    }

    public final ActivityFullBannerBinding T() {
        return (ActivityFullBannerBinding) this.D.a(this, H[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [he.f, java.lang.Object] */
    public final void U() {
        ((h) this.E.getValue()).e(3, "sp_unlock");
        CountDownTimer countDownTimer = this.G;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        startActivity(new Intent(this, (Class<?>) MainActivity.class));
        finish();
    }

    public final void V() {
        if (!isFinishing() && !isDestroyed() && T().f3144d.getVisibility() == 0) {
            T().f3144d.animate().scaleX(1.15f).scaleY(1.15f).alpha(0.8f).setDuration(800L).withEndAction(new c(this, 0)).start();
        }
    }

    @Override // i.j, d.q, h0.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        boolean z10;
        super.onCreate(bundle);
        Window window = getWindow();
        k.d(window, "getWindow(...)");
        View decorView = window.getDecorView();
        k.d(decorView, "getDecorView(...)");
        cf.m.w(window, true, decorView);
        n0 onBackPressedDispatcher = getOnBackPressedDispatcher();
        n nVar = new n(this, 4);
        k.e(onBackPressedDispatcher, "<this>");
        onBackPressedDispatcher.b(new o0(nVar));
        V();
        m mVar = this.F;
        this.G = new e(this, ((m0) mVar.getValue()).f7883d * 1000).start();
        int i6 = ((m0) mVar.getValue()).f7883d;
        MaterialButton materialButton = T().f3142b;
        if (i6 > 0) {
            string = String.valueOf(i6);
        } else {
            string = getString(R.string.x_close_emoji);
            k.d(string, "getString(...)");
        }
        materialButton.setText(string);
        if (i6 <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        materialButton.setClickable(z10);
        String str = ((m0) mVar.getValue()).f7881b;
        ImageView imageView = T().f3141a;
        f a10 = l6.a.a(imageView.getContext());
        v6.i iVar = new v6.i(imageView.getContext());
        iVar.f13364c = str;
        iVar.c(imageView);
        iVar.b(true);
        iVar.f13366e = new k7.c(this, 7);
        ((l6.k) a10).b(iVar.a());
        ActivityFullBannerBinding T = T();
        final int i10 = 0;
        T.f3143c.setOnClickListener(new View.OnClickListener(this) { // from class: fd.a

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ FullBannerActivity f5159y;

            {
                this.f5159y = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                FullBannerActivity fullBannerActivity = this.f5159y;
                switch (i11) {
                    case 0:
                        bf.o[] oVarArr = FullBannerActivity.H;
                        fullBannerActivity.U();
                        return;
                    default:
                        bf.o[] oVarArr2 = FullBannerActivity.H;
                        if (fullBannerActivity.T().f3142b.isClickable()) {
                            fullBannerActivity.U();
                            return;
                        }
                        return;
                }
            }
        });
        final int i11 = 1;
        T.f3142b.setOnClickListener(new View.OnClickListener(this) { // from class: fd.a

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ FullBannerActivity f5159y;

            {
                this.f5159y = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                FullBannerActivity fullBannerActivity = this.f5159y;
                switch (i112) {
                    case 0:
                        bf.o[] oVarArr = FullBannerActivity.H;
                        fullBannerActivity.U();
                        return;
                    default:
                        bf.o[] oVarArr2 = FullBannerActivity.H;
                        if (fullBannerActivity.T().f3142b.isClickable()) {
                            fullBannerActivity.U();
                            return;
                        }
                        return;
                }
            }
        });
        String obj = df.m.n0(((m0) mVar.getValue()).f7882c).toString();
        if (URLUtil.isValidUrl(obj)) {
            T.f3141a.setOnClickListener(new fd.b(0, this, obj));
        }
    }

    @Override // i.j, android.app.Activity
    public final void onDestroy() {
        CountDownTimer countDownTimer = this.G;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        super.onDestroy();
    }
}
