package w0;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import com.unity3d.services.UnityAdsConstants;
import p.t1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements View.OnTouchListener {
    public static final int O = ViewConfiguration.getTapTimeout();
    public v8.i A;
    public final float[] B;
    public final float[] C;
    public final int D;
    public final int E;
    public final float[] F;
    public final float[] G;
    public final float[] H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final t1 N;

    /* renamed from: x, reason: collision with root package name */
    public final a f13520x;

    /* renamed from: y, reason: collision with root package name */
    public final AccelerateInterpolator f13521y;

    /* renamed from: z, reason: collision with root package name */
    public final t1 f13522z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w0.a] */
    public d(t1 t1Var) {
        ?? obj = new Object();
        obj.f13515e = Long.MIN_VALUE;
        obj.f13517g = -1L;
        obj.f13516f = 0L;
        this.f13520x = obj;
        this.f13521y = new AccelerateInterpolator();
        float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        this.B = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.C = fArr2;
        float[] fArr3 = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        this.F = fArr3;
        float[] fArr4 = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        this.G = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.H = fArr5;
        this.f13522z = t1Var;
        float f3 = Resources.getSystem().getDisplayMetrics().density;
        float f10 = ((int) ((1575.0f * f3) + 0.5f)) / 1000.0f;
        fArr5[0] = f10;
        fArr5[1] = f10;
        float f11 = ((int) ((f3 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f11;
        fArr4[1] = f11;
        this.D = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.E = O;
        obj.f13511a = UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
        obj.f13512b = UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
        this.N = t1Var;
    }

    public static float b(float f3, float f10, float f11) {
        if (f3 > f11) {
            return f11;
        }
        if (f3 < f10) {
            return f10;
        }
        return f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.B
            r0 = r0[r4]
            float[] r1 = r3.C
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            android.view.animation.AccelerateInterpolator r6 = r3.f13521y
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L26
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L2e
        L26:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L37
            float r5 = r6.getInterpolation(r5)
        L2e:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L38
        L37:
            r5 = 0
        L38:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3d
            return r2
        L3d:
            float[] r0 = r3.F
            r0 = r0[r4]
            float[] r1 = r3.G
            r1 = r1[r4]
            float[] r2 = r3.H
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L54
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L54:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.d.a(int, float, float, float):float");
    }

    public final float c(float f3, float f10) {
        if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            int i6 = this.D;
            if (i6 != 0 && i6 != 1) {
                if (i6 == 2 && f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    return f3 / (-f10);
                }
            } else if (f3 < f10) {
                if (f3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    return 1.0f - (f3 / f10);
                }
                if (this.L && i6 == 1) {
                    return 1.0f;
                }
            }
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void d() {
        int i6 = 0;
        if (this.J) {
            this.L = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f13520x;
        int i10 = (int) (currentAnimationTimeMillis - aVar.f13515e);
        int i11 = aVar.f13512b;
        if (i10 > i11) {
            i6 = i11;
        } else if (i10 >= 0) {
            i6 = i10;
        }
        aVar.f13519i = i6;
        aVar.f13518h = aVar.a(currentAnimationTimeMillis);
        aVar.f13517g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        t1 t1Var;
        int count;
        a aVar = this.f13520x;
        float f3 = aVar.f13514d;
        int abs = (int) (f3 / Math.abs(f3));
        Math.abs(aVar.f13513c);
        if (abs != 0 && (count = (t1Var = this.N).getCount()) != 0) {
            int childCount = t1Var.getChildCount();
            int firstVisiblePosition = t1Var.getFirstVisiblePosition();
            int i6 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && t1Var.getChildAt(0).getTop() >= 0)) : !(i6 >= count && t1Var.getChildAt(childCount - 1).getBottom() <= t1Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            boolean r0 = r8.M
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r10.getActionMasked()
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            if (r0 == r2) goto L1f
            r9 = 3
            if (r0 == r9) goto L17
            goto L7c
        L17:
            r8.d()
            return r1
        L1b:
            r8.K = r3
            r8.I = r1
        L1f:
            float r0 = r10.getX()
            int r4 = r9.getWidth()
            float r4 = (float) r4
            p.t1 r5 = r8.f13522z
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r0 = r8.a(r1, r0, r4, r6)
            float r10 = r10.getY()
            int r9 = r9.getHeight()
            float r9 = (float) r9
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r9 = r8.a(r3, r10, r9, r4)
            w0.a r10 = r8.f13520x
            r10.f13513c = r0
            r10.f13514d = r9
            boolean r9 = r8.L
            if (r9 != 0) goto L7c
            boolean r9 = r8.e()
            if (r9 == 0) goto L7c
            v8.i r9 = r8.A
            if (r9 != 0) goto L60
            v8.i r9 = new v8.i
            r9.<init>(r8, r2)
            r8.A = r9
        L60:
            r8.L = r3
            r8.J = r3
            boolean r9 = r8.I
            if (r9 != 0) goto L75
            int r9 = r8.E
            if (r9 <= 0) goto L75
            v8.i r10 = r8.A
            long r6 = (long) r9
            java.util.WeakHashMap r9 = t0.q0.f12397a
            r5.postOnAnimationDelayed(r10, r6)
            goto L7a
        L75:
            v8.i r9 = r8.A
            r9.run()
        L7a:
            r8.I = r3
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
