package x0;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import o.r1;
import t9.x;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d implements View.OnTouchListener {
    public static final int M = ViewConfiguration.getTapTimeout();
    public final float[] A;
    public final int B;
    public final int C;
    public final float[] D;
    public final float[] E;
    public final float[] F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public final r1 L;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a f14074v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AccelerateInterpolator f14075w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final r1 f14076x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public x f14077y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float[] f14078z;

    public d(r1 r1Var) {
        a aVar = new a();
        aVar.f14071e = Long.MIN_VALUE;
        aVar.f14072g = -1L;
        aVar.f = 0L;
        this.f14074v = aVar;
        this.f14075w = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f14078z = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.A = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.D = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.E = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.F = fArr5;
        this.f14076x = r1Var;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f4 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f4;
        fArr5[1] = f4;
        float f10 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f10;
        fArr4[1] = f10;
        this.B = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.C = M;
        aVar.f14067a = 500;
        aVar.f14068b = 500;
        this.L = r1Var;
    }

    public static float b(float f, float f4, float f10) {
        return f > f10 ? f10 : f < f4 ? f4 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f14078z
            r0 = r0[r4]
            float[] r1 = r3.A
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f14075w
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.D
            r0 = r0[r4]
            float[] r1 = r3.E
            r1 = r1[r4]
            float[] r2 = r3.F
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L51:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.d.a(int, float, float, float):float");
    }

    public final float c(float f, float f4) {
        if (f4 != 0.0f) {
            int i = this.B;
            if (i == 0 || i == 1) {
                if (f < f4) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f4);
                    }
                    if (this.J && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f4);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.H) {
            this.J = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f14074v;
        int i10 = (int) (jCurrentAnimationTimeMillis - aVar.f14071e);
        int i11 = aVar.f14068b;
        if (i10 > i11) {
            i = i11;
        } else if (i10 >= 0) {
            i = i10;
        }
        aVar.i = i;
        aVar.f14073h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f14072g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        r1 r1Var;
        int count;
        a aVar = this.f14074v;
        float f = aVar.f14070d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(aVar.f14069c);
        if (iAbs != 0 && (count = (r1Var = this.L).getCount()) != 0) {
            int childCount = r1Var.getChildCount();
            int firstVisiblePosition = r1Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && r1Var.getChildAt(0).getTop() >= 0)) : !(i >= count && r1Var.getChildAt(childCount - 1).getBottom() <= r1Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
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
            boolean r0 = r8.K
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r10.getActionMasked()
            r2 = 3
            r3 = 1
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            r4 = 2
            if (r0 == r4) goto L1f
            if (r0 == r2) goto L17
            goto L7c
        L17:
            r8.d()
            return r1
        L1b:
            r8.I = r3
            r8.G = r1
        L1f:
            float r0 = r10.getX()
            int r4 = r9.getWidth()
            float r4 = (float) r4
            o.r1 r5 = r8.f14076x
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r0 = r8.a(r1, r0, r4, r6)
            float r10 = r10.getY()
            int r9 = r9.getHeight()
            float r9 = (float) r9
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r9 = r8.a(r3, r10, r9, r4)
            x0.a r10 = r8.f14074v
            r10.f14069c = r0
            r10.f14070d = r9
            boolean r9 = r8.J
            if (r9 != 0) goto L7c
            boolean r9 = r8.e()
            if (r9 == 0) goto L7c
            t9.x r9 = r8.f14077y
            if (r9 != 0) goto L60
            t9.x r9 = new t9.x
            r9.<init>(r2, r8)
            r8.f14077y = r9
        L60:
            r8.J = r3
            r8.H = r3
            boolean r9 = r8.G
            if (r9 != 0) goto L75
            int r9 = r8.C
            if (r9 <= 0) goto L75
            t9.x r10 = r8.f14077y
            long r6 = (long) r9
            java.util.WeakHashMap r9 = t0.m0.f11853a
            r5.postOnAnimationDelayed(r10, r6)
            goto L7a
        L75:
            t9.x r9 = r8.f14077y
            r9.run()
        L7a:
            r8.G = r3
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
