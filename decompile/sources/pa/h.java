package pa;

import android.animation.ObjectAnimator;
import com.unity3d.services.UnityAdsConstants;
import i.y;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends y {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f10659k = {0, 1350, 2700, 4050};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f10660l = {667, 2017, 3367, 4717};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f10661m = {UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, 2350, 3700, 5050};

    /* renamed from: n, reason: collision with root package name */
    public static final o5.b f10662n = new o5.b(Float.class, "animationFraction", 8);

    /* renamed from: o, reason: collision with root package name */
    public static final o5.b f10663o = new o5.b(Float.class, "completeEndFraction", 9);

    /* renamed from: c, reason: collision with root package name */
    public ObjectAnimator f10664c;

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f10665d;

    /* renamed from: e, reason: collision with root package name */
    public final l1.a f10666e;

    /* renamed from: f, reason: collision with root package name */
    public final k f10667f;

    /* renamed from: g, reason: collision with root package name */
    public int f10668g;

    /* renamed from: h, reason: collision with root package name */
    public float f10669h;

    /* renamed from: i, reason: collision with root package name */
    public float f10670i;
    public c j;

    public h(k kVar) {
        super(1);
        this.f10668g = 0;
        this.j = null;
        this.f10667f = kVar;
        this.f10666e = new l1.a(1);
    }

    @Override // i.y
    public final void c() {
        ObjectAnimator objectAnimator = this.f10664c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // i.y
    public final void i() {
        p();
        ObjectAnimator objectAnimator = this.f10664c;
        k kVar = this.f10667f;
        objectAnimator.setDuration(kVar.f10645n * 5400.0f);
        this.f10665d.setDuration(kVar.f10645n * 333.0f);
        this.f10668g = 0;
        ((p) ((ArrayList) this.f6269b).get(0)).f10699c = kVar.f10637e[0];
        this.f10670i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // i.y
    public final void k(c cVar) {
        this.j = cVar;
    }

    @Override // i.y
    public final void l() {
        ObjectAnimator objectAnimator = this.f10665d;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (((s) this.f6268a).isVisible()) {
                this.f10665d.start();
            } else {
                c();
            }
        }
    }

    @Override // i.y
    public final void n() {
        p();
        this.f10668g = 0;
        ((p) ((ArrayList) this.f6269b).get(0)).f10699c = this.f10667f.f10637e[0];
        this.f10670i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f10664c.start();
    }

    @Override // i.y
    public final void o() {
        this.j = null;
    }

    public final void p() {
        ObjectAnimator objectAnimator = this.f10664c;
        k kVar = this.f10667f;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f10662n, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.f10664c = ofFloat;
            ofFloat.setDuration(kVar.f10645n * 5400.0f);
            this.f10664c.setInterpolator(null);
            this.f10664c.setRepeatCount(-1);
            this.f10664c.addListener(new g(this, 0));
        }
        if (this.f10665d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f10663o, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.f10665d = ofFloat2;
            ofFloat2.setDuration(kVar.f10645n * 333.0f);
            this.f10665d.setInterpolator(this.f10666e);
            this.f10665d.addListener(new g(this, 1));
        }
    }
}
