package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.WeakHashMap;
import s8.l;
import t0.q0;
import u0.c;
import u5.r;
import v.h;
import w4.a0;
import w4.e1;
import w4.s0;
import w4.t0;
import w4.x;
import w4.y0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final l K;
    public final Rect L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i6, int i10) {
        super(context, attributeSet, i6, i10);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new l(18);
        this.L = new Rect();
        n1(s0.I(context, attributeSet, i6, i10).f13996b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w4.s0
    public final boolean B0() {
        if (this.f1118z == null && !this.E) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void D0(e1 e1Var, a0 a0Var, h hVar) {
        int i6;
        int i10 = this.F;
        for (int i11 = 0; i11 < this.F && (i6 = a0Var.f13806d) >= 0 && i6 < e1Var.b() && i10 > 0; i11++) {
            hVar.b(a0Var.f13806d, Math.max(0, a0Var.f13809g));
            this.K.getClass();
            i10--;
            a0Var.f13806d += a0Var.f13807e;
        }
    }

    @Override // w4.s0
    public final int J(y0 y0Var, e1 e1Var) {
        if (this.f1109p == 0) {
            return this.F;
        }
        if (e1Var.b() < 1) {
            return 0;
        }
        return j1(e1Var.b() - 1, y0Var, e1Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View P0(y0 y0Var, e1 e1Var, boolean z10, boolean z11) {
        int i6;
        int i10;
        int v10 = v();
        int i11 = 1;
        if (z11) {
            i10 = v() - 1;
            i6 = -1;
            i11 = -1;
        } else {
            i6 = v10;
            i10 = 0;
        }
        int b10 = e1Var.b();
        I0();
        int m9 = this.f1111r.m();
        int i12 = this.f1111r.i();
        View view = null;
        View view2 = null;
        while (i10 != i6) {
            View u3 = u(i10);
            int H = s0.H(u3);
            if (H >= 0 && H < b10 && k1(H, y0Var, e1Var) == 0) {
                if (((t0) u3.getLayoutParams()).f14020a.i()) {
                    if (view2 == null) {
                        view2 = u3;
                    }
                } else {
                    if (this.f1111r.g(u3) < i12 && this.f1111r.d(u3) >= m9) {
                        return u3;
                    }
                    if (view == null) {
                        view = u3;
                    }
                }
            }
            i10 += i11;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e2, code lost:
    
        if (r13 == r10) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0107, code lost:
    
        if (r13 == r9) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0021, code lost:
    
        if (((java.util.ArrayList) r22.f14004a.A).contains(r3) != false) goto L10;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, w4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View T(android.view.View r23, int r24, w4.y0 r25, w4.e1 r26) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.T(android.view.View, int, w4.y0, w4.e1):android.view.View");
    }

    @Override // w4.s0
    public final void V(y0 y0Var, e1 e1Var, c cVar) {
        super.V(y0Var, e1Var, cVar);
        cVar.i(GridView.class.getName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        r22.f14083b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v34 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V0(w4.y0 r19, w4.e1 r20, w4.a0 r21, w4.z r22) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.V0(w4.y0, w4.e1, w4.a0, w4.z):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void W0(y0 y0Var, e1 e1Var, a2.t0 t0Var, int i6) {
        boolean z10;
        o1();
        if (e1Var.b() > 0 && !e1Var.f13863g) {
            if (i6 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int k12 = k1(t0Var.f414b, y0Var, e1Var);
            if (z10) {
                while (k12 > 0) {
                    int i10 = t0Var.f414b;
                    if (i10 <= 0) {
                        break;
                    }
                    int i11 = i10 - 1;
                    t0Var.f414b = i11;
                    k12 = k1(i11, y0Var, e1Var);
                }
            } else {
                int b10 = e1Var.b() - 1;
                int i12 = t0Var.f414b;
                while (i12 < b10) {
                    int i13 = i12 + 1;
                    int k13 = k1(i13, y0Var, e1Var);
                    if (k13 <= k12) {
                        break;
                    }
                    i12 = i13;
                    k12 = k13;
                }
                t0Var.f414b = i12;
            }
        }
        h1();
    }

    @Override // w4.s0
    public final void X(y0 y0Var, e1 e1Var, View view, c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof x)) {
            W(view, cVar);
            return;
        }
        x xVar = (x) layoutParams;
        int j12 = j1(xVar.f14020a.c(), y0Var, e1Var);
        if (this.f1109p == 0) {
            cVar.j(r.w(xVar.f14060e, xVar.f14061f, j12, 1, false));
        } else {
            cVar.j(r.w(j12, 1, xVar.f14060e, xVar.f14061f, false));
        }
    }

    @Override // w4.s0
    public final void Y(int i6, int i10) {
        l lVar = this.K;
        lVar.n();
        ((SparseIntArray) lVar.f12252z).clear();
    }

    @Override // w4.s0
    public final void Z() {
        l lVar = this.K;
        lVar.n();
        ((SparseIntArray) lVar.f12252z).clear();
    }

    @Override // w4.s0
    public final void a0(int i6, int i10) {
        l lVar = this.K;
        lVar.n();
        ((SparseIntArray) lVar.f12252z).clear();
    }

    @Override // w4.s0
    public final void b0(int i6, int i10) {
        l lVar = this.K;
        lVar.n();
        ((SparseIntArray) lVar.f12252z).clear();
    }

    @Override // w4.s0
    public final void c0(int i6, int i10) {
        l lVar = this.K;
        lVar.n();
        ((SparseIntArray) lVar.f12252z).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void c1(boolean z10) {
        if (!z10) {
            super.c1(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w4.s0
    public final void d0(y0 y0Var, e1 e1Var) {
        boolean z10 = e1Var.f13863g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z10) {
            int v10 = v();
            for (int i6 = 0; i6 < v10; i6++) {
                x xVar = (x) u(i6).getLayoutParams();
                int c10 = xVar.f14020a.c();
                sparseIntArray2.put(c10, xVar.f14061f);
                sparseIntArray.put(c10, xVar.f14060e);
            }
        }
        super.d0(y0Var, e1Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w4.s0
    public final void e0(e1 e1Var) {
        super.e0(e1Var);
        this.E = false;
    }

    @Override // w4.s0
    public boolean f(t0 t0Var) {
        return t0Var instanceof x;
    }

    public final void g1(int i6) {
        int i10;
        int[] iArr = this.G;
        int i11 = this.F;
        if (iArr == null || iArr.length != i11 + 1 || iArr[iArr.length - 1] != i6) {
            iArr = new int[i11 + 1];
        }
        int i12 = 0;
        iArr[0] = 0;
        int i13 = i6 / i11;
        int i14 = i6 % i11;
        int i15 = 0;
        for (int i16 = 1; i16 <= i11; i16++) {
            i12 += i14;
            if (i12 > 0 && i11 - i12 < i14) {
                i10 = i13 + 1;
                i12 -= i11;
            } else {
                i10 = i13;
            }
            i15 += i10;
            iArr[i16] = i15;
        }
        this.G = iArr;
    }

    public final void h1() {
        View[] viewArr = this.H;
        if (viewArr != null && viewArr.length == this.F) {
            return;
        }
        this.H = new View[this.F];
    }

    public final int i1(int i6, int i10) {
        if (this.f1109p == 1 && U0()) {
            int[] iArr = this.G;
            int i11 = this.F;
            return iArr[i11 - i6] - iArr[(i11 - i6) - i10];
        }
        int[] iArr2 = this.G;
        return iArr2[i10 + i6] - iArr2[i6];
    }

    public final int j1(int i6, y0 y0Var, e1 e1Var) {
        boolean z10 = e1Var.f13863g;
        l lVar = this.K;
        if (!z10) {
            int i10 = this.F;
            lVar.getClass();
            return l.l(i6, i10);
        }
        int b10 = y0Var.b(i6);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i6);
            return 0;
        }
        int i11 = this.F;
        lVar.getClass();
        return l.l(b10, i11);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w4.s0
    public final int k(e1 e1Var) {
        return F0(e1Var);
    }

    public final int k1(int i6, y0 y0Var, e1 e1Var) {
        boolean z10 = e1Var.f13863g;
        l lVar = this.K;
        if (!z10) {
            int i10 = this.F;
            lVar.getClass();
            return i6 % i10;
        }
        int i11 = this.J.get(i6, -1);
        if (i11 != -1) {
            return i11;
        }
        int b10 = y0Var.b(i6);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i6);
            return 0;
        }
        int i12 = this.F;
        lVar.getClass();
        return b10 % i12;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w4.s0
    public final int l(e1 e1Var) {
        return G0(e1Var);
    }

    public final int l1(int i6, y0 y0Var, e1 e1Var) {
        boolean z10 = e1Var.f13863g;
        l lVar = this.K;
        if (!z10) {
            lVar.getClass();
            return 1;
        }
        int i10 = this.I.get(i6, -1);
        if (i10 != -1) {
            return i10;
        }
        if (y0Var.b(i6) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i6);
            return 1;
        }
        lVar.getClass();
        return 1;
    }

    public final void m1(View view, int i6, boolean z10) {
        int i10;
        int i11;
        boolean w02;
        x xVar = (x) view.getLayoutParams();
        Rect rect = xVar.f14021b;
        int i12 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) xVar).topMargin + ((ViewGroup.MarginLayoutParams) xVar).bottomMargin;
        int i13 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) xVar).leftMargin + ((ViewGroup.MarginLayoutParams) xVar).rightMargin;
        int i14 = i1(xVar.f14060e, xVar.f14061f);
        if (this.f1109p == 1) {
            i11 = s0.w(i14, i6, i13, ((ViewGroup.MarginLayoutParams) xVar).width, false);
            i10 = s0.w(this.f1111r.n(), this.f14015m, i12, ((ViewGroup.MarginLayoutParams) xVar).height, true);
        } else {
            int w10 = s0.w(i14, i6, i12, ((ViewGroup.MarginLayoutParams) xVar).height, false);
            int w11 = s0.w(this.f1111r.n(), this.f14014l, i13, ((ViewGroup.MarginLayoutParams) xVar).width, true);
            i10 = w10;
            i11 = w11;
        }
        t0 t0Var = (t0) view.getLayoutParams();
        if (z10) {
            w02 = y0(view, i11, i10, t0Var);
        } else {
            w02 = w0(view, i11, i10, t0Var);
        }
        if (w02) {
            view.measure(i11, i10);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w4.s0
    public final int n(e1 e1Var) {
        return F0(e1Var);
    }

    public final void n1(int i6) {
        if (i6 == this.F) {
            return;
        }
        this.E = true;
        if (i6 >= 1) {
            this.F = i6;
            this.K.n();
            n0();
            return;
        }
        throw new IllegalArgumentException(h8.c.i(i6, "Span count should be at least 1. Provided "));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w4.s0
    public final int o(e1 e1Var) {
        return G0(e1Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w4.s0
    public final int o0(int i6, y0 y0Var, e1 e1Var) {
        o1();
        h1();
        return super.o0(i6, y0Var, e1Var);
    }

    public final void o1() {
        int D;
        int G;
        if (this.f1109p == 1) {
            D = this.f14016n - F();
            G = E();
        } else {
            D = this.f14017o - D();
            G = G();
        }
        g1(D - G);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w4.s0
    public final int q0(int i6, y0 y0Var, e1 e1Var) {
        o1();
        h1();
        return super.q0(i6, y0Var, e1Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w4.s0
    public t0 r() {
        if (this.f1109p == 0) {
            return new x(-2, -1);
        }
        return new x(-1, -2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [w4.x, w4.t0] */
    @Override // w4.s0
    public t0 s(Context context, AttributeSet attributeSet) {
        ?? t0Var = new t0(context, attributeSet);
        t0Var.f14060e = -1;
        t0Var.f14061f = 0;
        return t0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [w4.x, w4.t0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [w4.x, w4.t0] */
    @Override // w4.s0
    public t0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? t0Var = new t0((ViewGroup.MarginLayoutParams) layoutParams);
            t0Var.f14060e = -1;
            t0Var.f14061f = 0;
            return t0Var;
        }
        ?? t0Var2 = new t0(layoutParams);
        t0Var2.f14060e = -1;
        t0Var2.f14061f = 0;
        return t0Var2;
    }

    @Override // w4.s0
    public final void t0(Rect rect, int i6, int i10) {
        int g10;
        int g11;
        if (this.G == null) {
            super.t0(rect, i6, i10);
        }
        int F = F() + E();
        int D = D() + G();
        if (this.f1109p == 1) {
            int height = rect.height() + D;
            RecyclerView recyclerView = this.f14005b;
            WeakHashMap weakHashMap = q0.f12397a;
            g11 = s0.g(i10, height, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            g10 = s0.g(i6, iArr[iArr.length - 1] + F, this.f14005b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.f14005b;
            WeakHashMap weakHashMap2 = q0.f12397a;
            g10 = s0.g(i6, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            g11 = s0.g(i10, iArr2[iArr2.length - 1] + D, this.f14005b.getMinimumHeight());
        }
        this.f14005b.setMeasuredDimension(g10, g11);
    }

    @Override // w4.s0
    public final int x(y0 y0Var, e1 e1Var) {
        if (this.f1109p == 1) {
            return this.F;
        }
        if (e1Var.b() < 1) {
            return 0;
        }
        return j1(e1Var.b() - 1, y0Var, e1Var) + 1;
    }

    public GridLayoutManager(int i6, int i10) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new l(18);
        this.L = new Rect();
        n1(i6);
    }

    public GridLayoutManager(int i6) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new l(18);
        this.L = new Rect();
        n1(i6);
    }
}
