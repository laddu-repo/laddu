package d1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import com.unity3d.services.UnityAdsConstants;
import j4.b0;
import java.util.ArrayList;
import o5.n;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: p, reason: collision with root package name */
    public static final d f3666p = new d(1);

    /* renamed from: q, reason: collision with root package name */
    public static final d f3667q = new d(2);

    /* renamed from: r, reason: collision with root package name */
    public static final d f3668r = new d(3);
    public static final d s = new d(4);

    /* renamed from: t, reason: collision with root package name */
    public static final d f3669t = new d(5);

    /* renamed from: u, reason: collision with root package name */
    public static final d f3670u = new d(0);

    /* renamed from: d, reason: collision with root package name */
    public final Object f3674d;

    /* renamed from: e, reason: collision with root package name */
    public final c9.a f3675e;
    public final float j;

    /* renamed from: m, reason: collision with root package name */
    public f f3682m;

    /* renamed from: n, reason: collision with root package name */
    public float f3683n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3684o;

    /* renamed from: a, reason: collision with root package name */
    public float f3671a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* renamed from: b, reason: collision with root package name */
    public float f3672b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3673c = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3676f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float f3677g = Float.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public final float f3678h = -3.4028235E38f;

    /* renamed from: i, reason: collision with root package name */
    public long f3679i = 0;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3680k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3681l = new ArrayList();

    public e(Object obj, c9.a aVar) {
        this.f3674d = obj;
        this.f3675e = aVar;
        if (aVar != f3668r && aVar != s && aVar != f3669t) {
            if (aVar == f3670u) {
                this.j = 0.00390625f;
            } else if (aVar != f3666p && aVar != f3667q) {
                this.j = 1.0f;
            } else {
                this.j = 0.002f;
            }
        } else {
            this.j = 0.1f;
        }
        this.f3682m = null;
        this.f3683n = Float.MAX_VALUE;
        this.f3684o = false;
    }

    public static c b() {
        ThreadLocal threadLocal = c.f3656i;
        if (threadLocal.get() == null) {
            threadLocal.set(new c(new b0(10)));
        }
        return (c) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, d1.a] */
    public final void a(float f3) {
        float durationScale;
        if (this.f3676f) {
            this.f3683n = f3;
            return;
        }
        if (this.f3682m == null) {
            this.f3682m = new f(f3);
        }
        f fVar = this.f3682m;
        double d10 = f3;
        fVar.f3693i = d10;
        double d11 = (float) d10;
        if (d11 <= this.f3677g) {
            if (d11 >= this.f3678h) {
                double abs = Math.abs(this.j * 0.75f);
                fVar.f3688d = abs;
                fVar.f3689e = abs * 62.5d;
                b0 b0Var = b().f3661e;
                b0Var.getClass();
                if (Thread.currentThread() == ((Looper) b0Var.f7159y).getThread()) {
                    boolean z10 = this.f3676f;
                    if (!z10 && !z10) {
                        this.f3676f = true;
                        if (!this.f3673c) {
                            this.f3672b = this.f3675e.i(this.f3674d);
                        }
                        float f10 = this.f3672b;
                        if (f10 <= this.f3677g && f10 >= this.f3678h) {
                            c b10 = b();
                            ArrayList arrayList = b10.f3658b;
                            if (arrayList.size() == 0) {
                                ((Choreographer) b10.f3661e.f7158x).postFrameCallback(new b(b10.f3660d));
                                if (Build.VERSION.SDK_INT >= 33) {
                                    durationScale = ValueAnimator.getDurationScale();
                                    b10.f3663g = durationScale;
                                    if (b10.f3664h == null) {
                                        b10.f3664h = new b0(b10);
                                    }
                                    final b0 b0Var2 = b10.f3664h;
                                    if (((a) b0Var2.f7158x) == null) {
                                        ?? r12 = new ValueAnimator.DurationScaleChangeListener() { // from class: d1.a
                                            @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                                            public final void onChanged(float f11) {
                                                ((c) b0.this.f7159y).f3663g = f11;
                                            }
                                        };
                                        b0Var2.f7158x = r12;
                                        ValueAnimator.registerDurationScaleChangeListener(r12);
                                    }
                                }
                            }
                            if (!arrayList.contains(this)) {
                                arrayList.add(this);
                                return;
                            }
                            return;
                        }
                        throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                    }
                    return;
                }
                throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
    }

    public final void c(float f3) {
        this.f3675e.u(this.f3674d, f3);
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f3681l;
            if (i6 < arrayList.size()) {
                if (arrayList.get(i6) == null) {
                    i6++;
                } else {
                    ((n) arrayList.get(i6)).getClass();
                    throw null;
                }
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
        }
    }

    public final void d() {
        if (this.f3682m.f3686b > 0.0d) {
            b0 b0Var = b().f3661e;
            b0Var.getClass();
            if (Thread.currentThread() == ((Looper) b0Var.f7159y).getThread()) {
                if (this.f3676f) {
                    this.f3684o = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }
}
