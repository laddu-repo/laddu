package i1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import k8.k2;
import o9.w;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f6326m = new d(1);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f6327n = new d(2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f6328o = new d(3);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f6329p = new d(4);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f6330q = new d(5);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f6331r = new d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f6334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.d f6335d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f6337g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f6339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f6340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6341l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f6332a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f6333b = Float.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6336e = false;
    public long f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f6338h = new ArrayList();
    public final ArrayList i = new ArrayList();

    public f(w wVar, com.bumptech.glide.d dVar) {
        this.f6334c = wVar;
        this.f6335d = dVar;
        if (dVar == f6328o || dVar == f6329p || dVar == f6330q) {
            this.f6337g = 0.1f;
        } else if (dVar == f6331r) {
            this.f6337g = 0.00390625f;
        } else if (dVar == f6326m || dVar == f6327n) {
            this.f6337g = 0.002f;
        } else {
            this.f6337g = 1.0f;
        }
        this.f6339j = null;
        this.f6340k = Float.MAX_VALUE;
        this.f6341l = false;
    }

    public static c b() {
        ThreadLocal threadLocal = c.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new c(new k2(16)));
        }
        return (c) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [i1.a, java.lang.Object] */
    public final void a(float f) {
        if (this.f6336e) {
            this.f6340k = f;
            return;
        }
        if (this.f6339j == null) {
            this.f6339j = new g(f);
        }
        g gVar = this.f6339j;
        double d10 = f;
        gVar.i = d10;
        double d11 = (float) d10;
        if (d11 > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d11 < -3.4028235E38f) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.f6337g * 0.75f);
        gVar.f6345d = dAbs;
        gVar.f6346e = dAbs * 62.5d;
        k2 k2Var = b().f6320e;
        k2Var.getClass();
        if (Thread.currentThread() != ((Looper) k2Var.f7603x).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z2 = this.f6336e;
        if (z2 || z2) {
            return;
        }
        this.f6336e = true;
        float fW = this.f6335d.w(this.f6334c);
        this.f6333b = fW;
        if (fW > Float.MAX_VALUE || fW < -3.4028235E38f) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        c cVarB = b();
        ArrayList arrayList = cVarB.f6317b;
        if (arrayList.size() == 0) {
            ((Choreographer) cVarB.f6320e.f7602w).postFrameCallback(new b(cVarB.f6319d));
            if (Build.VERSION.SDK_INT >= 33) {
                cVarB.f6321g = ValueAnimator.getDurationScale();
                if (cVarB.f6322h == null) {
                    cVarB.f6322h = new sc.b(17, cVarB);
                }
                final sc.b bVar = cVarB.f6322h;
                if (((a) bVar.f11786w) == null) {
                    ?? r12 = new ValueAnimator.DurationScaleChangeListener() { // from class: i1.a
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f4) {
                            ((c) bVar.f11787x).f6321g = f4;
                        }
                    };
                    bVar.f11786w = r12;
                    ValueAnimator.registerDurationScaleChangeListener(r12);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void c(float f) {
        this.f6335d.N(this.f6334c, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                throw d0.d.f(i, arrayList);
            }
            i++;
        }
    }

    public final void d() {
        if (this.f6339j.f6343b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        k2 k2Var = b().f6320e;
        k2Var.getClass();
        if (Thread.currentThread() != ((Looper) k2Var.f7603x).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f6336e) {
            this.f6341l = true;
        }
    }
}
