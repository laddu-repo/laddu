package o4;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9869a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f9870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j0 f9871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9873e;
    public View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t0 f9874g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9875h;
    public final LinearInterpolator i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f9876j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PointF f9877k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f9878l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9879m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f9880n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9881o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9882p;

    public u(Context context) {
        t0 t0Var = new t0();
        t0Var.f9866d = -1;
        t0Var.f = false;
        t0Var.f9868g = 0;
        t0Var.f9863a = 0;
        t0Var.f9864b = 0;
        t0Var.f9865c = Integer.MIN_VALUE;
        t0Var.f9867e = null;
        this.f9874g = t0Var;
        this.i = new LinearInterpolator();
        this.f9876j = new DecelerateInterpolator();
        this.f9879m = false;
        this.f9881o = 0;
        this.f9882p = 0;
        this.f9878l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i10, int i11, int i12, int i13) {
        if (i13 == -1) {
            return i11 - i;
        }
        if (i13 != 0) {
            if (i13 == 1) {
                return i12 - i10;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i14 = i11 - i;
        if (i14 > 0) {
            return i14;
        }
        int i15 = i12 - i10;
        if (i15 < 0) {
            return i15;
        }
        return 0;
    }

    public int b(View view, int i) {
        j0 j0Var = this.f9871c;
        if (j0Var == null || !j0Var.d()) {
            return 0;
        }
        k0 k0Var = (k0) view.getLayoutParams();
        return a((view.getLeft() - ((k0) view.getLayoutParams()).f9801b.left) - ((ViewGroup.MarginLayoutParams) k0Var).leftMargin, view.getRight() + ((k0) view.getLayoutParams()).f9801b.right + ((ViewGroup.MarginLayoutParams) k0Var).rightMargin, j0Var.D(), j0Var.f9774n - j0Var.E(), i);
    }

    public int c(View view, int i) {
        j0 j0Var = this.f9871c;
        if (j0Var == null || !j0Var.e()) {
            return 0;
        }
        k0 k0Var = (k0) view.getLayoutParams();
        return a((view.getTop() - ((k0) view.getLayoutParams()).f9801b.top) - ((ViewGroup.MarginLayoutParams) k0Var).topMargin, view.getBottom() + ((k0) view.getLayoutParams()).f9801b.bottom + ((ViewGroup.MarginLayoutParams) k0Var).bottomMargin, j0Var.F(), j0Var.f9775o - j0Var.C(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float fAbs = Math.abs(i);
        if (!this.f9879m) {
            this.f9880n = d(this.f9878l);
            this.f9879m = true;
        }
        return (int) Math.ceil(fAbs * this.f9880n);
    }

    public PointF f(int i) {
        Object obj = this.f9871c;
        if (obj instanceof u0) {
            return ((u0) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + u0.class.getCanonicalName());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.u.g(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(android.view.View r7, o4.t0 r8) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r6.f9877k
            r1 = 0
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = r3
            goto L16
        L13:
            r0 = r2
            goto L16
        L15:
            r0 = r1
        L16:
            int r0 = r6.b(r7, r0)
            android.graphics.PointF r5 = r6.f9877k
            if (r5 == 0) goto L2a
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L2a
        L25:
            if (r4 <= 0) goto L29
            r1 = r3
            goto L2a
        L29:
            r1 = r2
        L2a:
            int r7 = r6.c(r7, r1)
            int r1 = r0 * r0
            int r2 = r7 * r7
            int r2 = r2 + r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            int r1 = (int) r1
            int r1 = r6.e(r1)
            double r1 = (double) r1
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r1 = r1 / r4
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            if (r1 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            r8.f9863a = r0
            r8.f9864b = r7
            r8.f9865c = r1
            android.view.animation.DecelerateInterpolator r7 = r6.f9876j
            r8.f9867e = r7
            r8.f = r3
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.u.h(android.view.View, o4.t0):void");
    }

    public final void i() {
        if (this.f9873e) {
            this.f9873e = false;
            this.f9882p = 0;
            this.f9881o = 0;
            this.f9877k = null;
            this.f9870b.B0.f9884a = -1;
            this.f = null;
            this.f9869a = -1;
            this.f9872d = false;
            j0 j0Var = this.f9871c;
            if (j0Var.f9767e == this) {
                j0Var.f9767e = null;
            }
            this.f9871c = null;
            this.f9870b = null;
        }
    }
}
