package com.playfy.tv.activities;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import bf.o;
import bg.y;
import com.google.android.material.card.MaterialCardView;
import com.playfy.tv.R;
import com.playfy.tv.activities.SponsorActivity;
import com.playfy.tv.databinding.ActivitySponsorBinding;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import d.s;
import fd.g0;
import fd.h0;
import fd.i0;
import fd.j0;
import h0.a0;
import h0.w;
import h0.z;
import he.g;
import he.m;
import i.j;
import i0.f;
import id.h;
import j2.u;
import j6.a;
import java.util.WeakHashMap;
import jb.b;
import kd.m0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import okhttp3.HttpUrl;
import okhttp3.internal.ws.WebSocketProtocol;
import t0.q0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class SponsorActivity extends j {
    public static final i0 O;
    public static final /* synthetic */ o[] P;
    public final a D;
    public final Object E;
    public final Object F;
    public final m G;
    public boolean H;
    public boolean I;
    public long J;
    public CountDownTimer K;
    public AnimatorSet L;
    public ValueAnimator M;
    public final m N;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, fd.i0] */
    static {
        q qVar = new q(SponsorActivity.class, "binding", "getBinding()Lcom/playfy/tv/databinding/ActivitySponsorBinding;");
        x.f8056a.getClass();
        P = new o[]{qVar};
        O = new Object();
    }

    public SponsorActivity() {
        super(R.layout.activity_sponsor);
        this.D = b.s(this, ActivitySponsorBinding.class);
        j0 j0Var = new j0(this, 0);
        g gVar = g.f6073x;
        this.E = he.a.c(gVar, j0Var);
        this.F = he.a.c(gVar, new j0(this, 1));
        this.G = he.a.d(new g0(this, 2));
        this.N = he.a.d(new g0(this, 3));
    }

    public static void U(LinearLayout linearLayout, ve.a aVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, "scaleX", 1.0f, 0.93f);
        ofFloat.setDuration(80L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, "scaleY", 1.0f, 0.93f);
        ofFloat2.setDuration(80L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(linearLayout, "scaleX", 0.93f, 1.0f);
        ofFloat3.setDuration(250L);
        ofFloat3.setInterpolator(new OvershootInterpolator(2.2f));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(linearLayout, "scaleY", 0.93f, 1.0f);
        ofFloat4.setDuration(250L);
        ofFloat4.setInterpolator(new OvershootInterpolator(2.2f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ofFloat, ofFloat2);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ofFloat3, ofFloat4);
        animatorSet.playSequentially(animatorSet2, animatorSet3);
        animatorSet.addListener(new bb.b(aVar, 1));
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v6, types: [he.f, java.lang.Object] */
    public final void onAdTimerComplete() {
        Object systemService;
        V().f3182b.setEnabled(false);
        V().f3182b.setAlpha(0.4f);
        V().f3189i.setVisibility(8);
        X();
        h hVar = (h) this.E.getValue();
        String stringExtra = getIntent().getStringExtra(MediationMetaData.KEY_NAME);
        if (stringExtra == null) {
            stringExtra = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        hVar.e(getIntent().getIntExtra("sn", 2), stringExtra);
        Intent intent = new Intent(this, (Class<?>) PlayerActivity.class);
        Bundle bundleExtra = getIntent().getBundleExtra("args");
        k.b(bundleExtra);
        intent.putExtras(bundleExtra);
        try {
            startActivity(intent);
            finish();
        } catch (Exception unused) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 < 33 || f.a(this, "android.permission.POST_NOTIFICATIONS") == 0) {
                if (i6 >= 26) {
                    y.p();
                    NotificationChannel f3 = y.f(getString(R.string.app_name));
                    systemService = getSystemService(NotificationManager.class);
                    ((NotificationManager) systemService).createNotificationChannel(f3);
                }
                PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 201326592);
                h0.q qVar = new h0.q(this, "com.playfy.tv-channel");
                qVar.f5803t.icon = R.drawable.ic_check_circle;
                qVar.f5790e = h0.q.b(getString(R.string.notif_reward_title));
                qVar.f5791f = h0.q.b(getString(R.string.ad_unlock_success, Integer.valueOf(W().f7884e)));
                qVar.c(true);
                qVar.j = 1;
                qVar.f5798n = "alarm";
                qVar.f5792g = activity;
                Notification a10 = qVar.a();
                k.d(a10, "build(...)");
                a0 a0Var = new a0(this);
                Bundle bundle = a10.extras;
                if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
                    w wVar = new w(getPackageName(), a10);
                    synchronized (a0.f5759e) {
                        try {
                            if (a0.f5760f == null) {
                                a0.f5760f = new z(getApplicationContext());
                            }
                            a0.f5760f.f5815y.obtainMessage(0, wVar).sendToTarget();
                            a0Var.f5761a.cancel(null, WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    a0Var.f5761a.notify(null, WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, a10);
                }
            }
        }
        finish();
    }

    public final ActivitySponsorBinding V() {
        return (ActivitySponsorBinding) this.D.a(this, P[0]);
    }

    public final m0 W() {
        return (m0) this.G.getValue();
    }

    public final void X() {
        if (V().f3185e.getVisibility() == 0) {
            V().f3185e.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L).withEndAction(new a2.a(this, 23)).start();
        }
    }

    public final void Y() {
        Z();
        LinearLayout btnClickHere = V().f3182b;
        k.d(btnClickHere, "btnClickHere");
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(btnClickHere, (Property<LinearLayout, Float>) View.SCALE_X, 1.0f, 1.04f);
        ofFloat.setDuration(800L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new PathInterpolator(0.4f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.2f, 1.0f));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(btnClickHere, (Property<LinearLayout, Float>) View.SCALE_Y, 1.0f, 1.04f);
        ofFloat2.setDuration(800L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setInterpolator(new PathInterpolator(0.4f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.2f, 1.0f));
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setStartDelay(1200L);
        animatorSet.start();
        this.L = animatorSet;
    }

    public final void Z() {
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        V().f3182b.setScaleX(1.0f);
        V().f3182b.setScaleY(1.0f);
    }

    @Override // i.j, d.q, h0.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s.a(this, null, 3);
        CoordinatorLayout coordinatorLayout = V().f3181a;
        k.d(coordinatorLayout, "getRoot(...)");
        final int i6 = 0;
        final int i10 = 1;
        u uVar = new u(new h0(0), 1);
        WeakHashMap weakHashMap = q0.f12397a;
        t0.h0.l(coordinatorLayout, uVar);
        V().f3188h.setText(getString(R.string.open_1_ad_per_day, Integer.valueOf(W().f7884e)));
        final int i11 = 2;
        V().f3190k.setText(getString(R.string.wait_time_customized, Integer.valueOf(W().f7883d), Integer.valueOf(W().f7884e)));
        TextView textView = V().j;
        String string = getString(R.string.insutructions_text);
        k.d(string, "getString(...)");
        textView.setText(df.u.F(string, "{d}", String.valueOf(W().f7883d)));
        V().f3188h.setVisibility(0);
        V().f3189i.setVisibility(8);
        V().f3190k.setVisibility(8);
        V().f3182b.setOnClickListener(new View.OnClickListener(this) { // from class: fd.f0

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ SponsorActivity f5182y;

            {
                this.f5182y = this;
            }

            /* JADX WARN: Type inference failed for: r5v3, types: [he.f, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i10;
                SponsorActivity sponsorActivity = this.f5182y;
                switch (i12) {
                    case 0:
                        i0 i0Var = SponsorActivity.O;
                        String string2 = ((SharedPreferences) sponsorActivity.F.getValue()).getString("website", "https://google.com");
                        kotlin.jvm.internal.k.b(string2);
                        cf.m.y(sponsorActivity, string2, true);
                        return;
                    case 1:
                        if (!sponsorActivity.H && !sponsorActivity.I) {
                            sponsorActivity.Z();
                            SponsorActivity.U(sponsorActivity.V().f3182b, new g0(sponsorActivity, 1));
                            return;
                        }
                        return;
                    default:
                        i0 i0Var2 = SponsorActivity.O;
                        SponsorActivity.U(sponsorActivity.V().f3184d, new g0(sponsorActivity, 0));
                        return;
                }
            }
        });
        V().f3184d.setOnClickListener(new View.OnClickListener(this) { // from class: fd.f0

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ SponsorActivity f5182y;

            {
                this.f5182y = this;
            }

            /* JADX WARN: Type inference failed for: r5v3, types: [he.f, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                SponsorActivity sponsorActivity = this.f5182y;
                switch (i12) {
                    case 0:
                        i0 i0Var = SponsorActivity.O;
                        String string2 = ((SharedPreferences) sponsorActivity.F.getValue()).getString("website", "https://google.com");
                        kotlin.jvm.internal.k.b(string2);
                        cf.m.y(sponsorActivity, string2, true);
                        return;
                    case 1:
                        if (!sponsorActivity.H && !sponsorActivity.I) {
                            sponsorActivity.Z();
                            SponsorActivity.U(sponsorActivity.V().f3182b, new g0(sponsorActivity, 1));
                            return;
                        }
                        return;
                    default:
                        i0 i0Var2 = SponsorActivity.O;
                        SponsorActivity.U(sponsorActivity.V().f3184d, new g0(sponsorActivity, 0));
                        return;
                }
            }
        });
        V().f3183c.setOnClickListener(new View.OnClickListener(this) { // from class: fd.f0

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ SponsorActivity f5182y;

            {
                this.f5182y = this;
            }

            /* JADX WARN: Type inference failed for: r5v3, types: [he.f, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i6;
                SponsorActivity sponsorActivity = this.f5182y;
                switch (i12) {
                    case 0:
                        i0 i0Var = SponsorActivity.O;
                        String string2 = ((SharedPreferences) sponsorActivity.F.getValue()).getString("website", "https://google.com");
                        kotlin.jvm.internal.k.b(string2);
                        cf.m.y(sponsorActivity, string2, true);
                        return;
                    case 1:
                        if (!sponsorActivity.H && !sponsorActivity.I) {
                            sponsorActivity.Z();
                            SponsorActivity.U(sponsorActivity.V().f3182b, new g0(sponsorActivity, 1));
                            return;
                        }
                        return;
                    default:
                        i0 i0Var2 = SponsorActivity.O;
                        SponsorActivity.U(sponsorActivity.V().f3184d, new g0(sponsorActivity, 0));
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -18.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat.setDuration(750L);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new b7.w(this, 2));
        ofFloat.start();
        this.M = ofFloat;
        Y();
    }

    @Override // i.j, android.app.Activity
    public final void onDestroy() {
        Z();
        ValueAnimator valueAnimator = this.M;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        CountDownTimer countDownTimer = this.K;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        super.onDestroy();
    }

    @Override // i.j, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.H) {
            onAdTimerComplete();
            return;
        }
        if (this.I) {
            CountDownTimer countDownTimer = this.K;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.K = null;
            this.I = false;
            String string = getString(R.string.ad_return_too_early, Long.valueOf(this.J));
            k.d(string, "getString(...)");
            V().f3191l.setText(string);
            if (V().f3185e.getVisibility() != 0) {
                MaterialCardView materialCardView = V().f3185e;
                materialCardView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                materialCardView.setVisibility(0);
                materialCardView.animate().alpha(1.0f).setDuration(280L).start();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(V().f3185e, "translationX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -10.0f, 10.0f, -8.0f, 8.0f, -4.0f, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ofFloat.setDuration(400L);
                ofFloat.start();
            }
            LinearLayout linearLayout = V().f3182b;
            linearLayout.setAlpha(1.0f);
            linearLayout.setEnabled(true);
            Y();
        }
    }
}
