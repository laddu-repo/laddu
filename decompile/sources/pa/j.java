package pa;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import com.google.android.gms.internal.measurement.j5;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import i.y;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends y {

    /* renamed from: k, reason: collision with root package name */
    public static final l1.a f10673k = u9.a.f12954b;

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f10674l = {0, 1500, 3000, 4500};

    /* renamed from: m, reason: collision with root package name */
    public static final float[] f10675m = {0.1f, 0.87f};

    /* renamed from: n, reason: collision with root package name */
    public static final o5.b f10676n = new o5.b(Float.class, "animationFraction", 10);

    /* renamed from: o, reason: collision with root package name */
    public static final o5.b f10677o = new o5.b(Float.class, "completeEndFraction", 11);

    /* renamed from: c, reason: collision with root package name */
    public ObjectAnimator f10678c;

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f10679d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f10680e;

    /* renamed from: f, reason: collision with root package name */
    public final k f10681f;

    /* renamed from: g, reason: collision with root package name */
    public int f10682g;

    /* renamed from: h, reason: collision with root package name */
    public float f10683h;

    /* renamed from: i, reason: collision with root package name */
    public float f10684i;
    public c j;

    public j(Context context, k kVar) {
        super(1);
        this.f10682g = 0;
        this.j = null;
        this.f10681f = kVar;
        this.f10680e = j5.u(context, R.attr.motionEasingStandardInterpolator, f10673k);
    }

    @Override // i.y
    public final void c() {
        ObjectAnimator objectAnimator = this.f10678c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // i.y
    public final void i() {
        p();
        ObjectAnimator objectAnimator = this.f10678c;
        k kVar = this.f10681f;
        objectAnimator.setDuration(kVar.f10645n * 6000.0f);
        this.f10679d.setDuration(kVar.f10645n * 500.0f);
        this.f10682g = 0;
        ((p) ((ArrayList) this.f6269b).get(0)).f10699c = kVar.f10637e[0];
        this.f10684i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // i.y
    public final void k(c cVar) {
        this.j = cVar;
    }

    @Override // i.y
    public final void l() {
        ObjectAnimator objectAnimator = this.f10679d;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (((s) this.f6268a).isVisible()) {
                this.f10679d.start();
            } else {
                c();
            }
        }
    }

    @Override // i.y
    public final void n() {
        p();
        this.f10682g = 0;
        ((p) ((ArrayList) this.f6269b).get(0)).f10699c = this.f10681f.f10637e[0];
        this.f10684i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f10678c.start();
    }

    @Override // i.y
    public final void o() {
        this.j = null;
    }

    public final void p() {
        ObjectAnimator objectAnimator = this.f10678c;
        k kVar = this.f10681f;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f10676n, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.f10678c = ofFloat;
            ofFloat.setDuration(kVar.f10645n * 6000.0f);
            this.f10678c.setInterpolator(null);
            this.f10678c.setRepeatCount(-1);
            this.f10678c.addListener(new i(this, 0));
        }
        if (this.f10679d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f10677o, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.f10679d = ofFloat2;
            ofFloat2.setDuration(kVar.f10645n * 500.0f);
            this.f10679d.addListener(new i(this, 1));
        }
    }
}
