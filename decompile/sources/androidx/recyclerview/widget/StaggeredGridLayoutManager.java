package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import e1.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import s8.l;
import t0.q0;
import v.h;
import v.k;
import v8.i;
import w4.b;
import w4.c0;
import w4.d1;
import w4.e1;
import w4.m1;
import w4.n1;
import w4.p1;
import w4.r0;
import w4.s0;
import w4.t0;
import w4.y;
import w4.y0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends s0 implements d1 {
    public final l B;
    public final int C;
    public boolean D;
    public boolean E;
    public p1 F;
    public final Rect G;
    public final m1 H;
    public final boolean I;
    public int[] J;
    public final i K;

    /* renamed from: p, reason: collision with root package name */
    public final int f1150p;

    /* renamed from: q, reason: collision with root package name */
    public final k[] f1151q;

    /* renamed from: r, reason: collision with root package name */
    public final g f1152r;
    public final g s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1153t;

    /* renamed from: u, reason: collision with root package name */
    public int f1154u;

    /* renamed from: v, reason: collision with root package name */
    public final y f1155v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1156w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f1158y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1157x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f1159z = -1;
    public int A = Integer.MIN_VALUE;

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, w4.y] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i6, int i10) {
        this.f1150p = -1;
        this.f1156w = false;
        l lVar = new l(19, false);
        this.B = lVar;
        this.C = 2;
        this.G = new Rect();
        this.H = new m1(this);
        this.I = true;
        this.K = new i(this, 4);
        r0 I = s0.I(context, attributeSet, i6, i10);
        int i11 = I.f13995a;
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i11 != this.f1153t) {
            this.f1153t = i11;
            g gVar = this.f1152r;
            this.f1152r = this.s;
            this.s = gVar;
            n0();
        }
        int i12 = I.f13996b;
        c(null);
        if (i12 != this.f1150p) {
            lVar.d();
            n0();
            this.f1150p = i12;
            this.f1158y = new BitSet(this.f1150p);
            this.f1151q = new k[this.f1150p];
            for (int i13 = 0; i13 < this.f1150p; i13++) {
                this.f1151q[i13] = new k(this, i13);
            }
            n0();
        }
        boolean z10 = I.f13997c;
        c(null);
        p1 p1Var = this.F;
        if (p1Var != null && p1Var.E != z10) {
            p1Var.E = z10;
        }
        this.f1156w = z10;
        n0();
        ?? obj = new Object();
        obj.f14065a = true;
        obj.f14070f = 0;
        obj.f14071g = 0;
        this.f1155v = obj;
        this.f1152r = g.b(this, this.f1153t);
        this.s = g.b(this, 1 - this.f1153t);
    }

    public static int c1(int i6, int i10, int i11) {
        int mode;
        if ((i10 == 0 && i11 == 0) || ((mode = View.MeasureSpec.getMode(i6)) != Integer.MIN_VALUE && mode != 1073741824)) {
            return i6;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i6) - i10) - i11), mode);
    }

    @Override // w4.s0
    public final boolean B0() {
        if (this.F == null) {
            return true;
        }
        return false;
    }

    public final boolean C0() {
        int J0;
        if (v() != 0 && this.C != 0 && this.f14010g) {
            if (this.f1157x) {
                J0 = K0();
                J0();
            } else {
                J0 = J0();
                K0();
            }
            if (J0 == 0 && O0() != null) {
                this.B.d();
                this.f14009f = true;
                n0();
                return true;
            }
        }
        return false;
    }

    public final int D0(e1 e1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return b.d(e1Var, this.f1152r, G0(z10), F0(z10), this, this.I, this.f1157x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0269, code lost:
    
        U0(r20, r3);
     */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int E0(w4.y0 r20, w4.y r21, w4.e1 r22) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.E0(w4.y0, w4.y, w4.e1):int");
    }

    public final View F0(boolean z10) {
        int m9 = this.f1152r.m();
        int i6 = this.f1152r.i();
        View view = null;
        for (int v10 = v() - 1; v10 >= 0; v10--) {
            View u3 = u(v10);
            int g10 = this.f1152r.g(u3);
            int d10 = this.f1152r.d(u3);
            if (d10 > m9 && g10 < i6) {
                if (d10 > i6 && z10) {
                    if (view == null) {
                        view = u3;
                    }
                } else {
                    return u3;
                }
            }
        }
        return view;
    }

    public final View G0(boolean z10) {
        int m9 = this.f1152r.m();
        int i6 = this.f1152r.i();
        int v10 = v();
        View view = null;
        for (int i10 = 0; i10 < v10; i10++) {
            View u3 = u(i10);
            int g10 = this.f1152r.g(u3);
            if (this.f1152r.d(u3) > m9 && g10 < i6) {
                if (g10 < m9 && z10) {
                    if (view == null) {
                        view = u3;
                    }
                } else {
                    return u3;
                }
            }
        }
        return view;
    }

    public final void H0(y0 y0Var, e1 e1Var, boolean z10) {
        int i6;
        int L0 = L0(Integer.MIN_VALUE);
        if (L0 != Integer.MIN_VALUE && (i6 = this.f1152r.i() - L0) > 0) {
            int i10 = i6 - (-Y0(-i6, y0Var, e1Var));
            if (z10 && i10 > 0) {
                this.f1152r.q(i10);
            }
        }
    }

    public final void I0(y0 y0Var, e1 e1Var, boolean z10) {
        int m9;
        int M0 = M0(Integer.MAX_VALUE);
        if (M0 != Integer.MAX_VALUE && (m9 = M0 - this.f1152r.m()) > 0) {
            int Y0 = m9 - Y0(m9, y0Var, e1Var);
            if (z10 && Y0 > 0) {
                this.f1152r.q(-Y0);
            }
        }
    }

    public final int J0() {
        if (v() == 0) {
            return 0;
        }
        return s0.H(u(0));
    }

    public final int K0() {
        int v10 = v();
        if (v10 == 0) {
            return 0;
        }
        return s0.H(u(v10 - 1));
    }

    @Override // w4.s0
    public final boolean L() {
        if (this.C != 0) {
            return true;
        }
        return false;
    }

    public final int L0(int i6) {
        int i10 = this.f1151q[0].i(i6);
        for (int i11 = 1; i11 < this.f1150p; i11++) {
            int i12 = this.f1151q[i11].i(i6);
            if (i12 > i10) {
                i10 = i12;
            }
        }
        return i10;
    }

    public final int M0(int i6) {
        int k8 = this.f1151q[0].k(i6);
        for (int i10 = 1; i10 < this.f1150p; i10++) {
            int k9 = this.f1151q[i10].k(i6);
            if (k9 < k8) {
                k8 = k9;
            }
        }
        return k8;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N0(int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.N0(int, int, int):void");
    }

    @Override // w4.s0
    public final void O(int i6) {
        super.O(i6);
        for (int i10 = 0; i10 < this.f1150p; i10++) {
            k kVar = this.f1151q[i10];
            int i11 = kVar.f13166b;
            if (i11 != Integer.MIN_VALUE) {
                kVar.f13166b = i11 + i6;
            }
            int i12 = kVar.f13167c;
            if (i12 != Integer.MIN_VALUE) {
                kVar.f13167c = i12 + i6;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View O0() {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.O0():android.view.View");
    }

    @Override // w4.s0
    public final void P(int i6) {
        super.P(i6);
        for (int i10 = 0; i10 < this.f1150p; i10++) {
            k kVar = this.f1151q[i10];
            int i11 = kVar.f13166b;
            if (i11 != Integer.MIN_VALUE) {
                kVar.f13166b = i11 + i6;
            }
            int i12 = kVar.f13167c;
            if (i12 != Integer.MIN_VALUE) {
                kVar.f13167c = i12 + i6;
            }
        }
    }

    public final boolean P0() {
        if (C() == 1) {
            return true;
        }
        return false;
    }

    @Override // w4.s0
    public final void Q() {
        this.B.d();
        for (int i6 = 0; i6 < this.f1150p; i6++) {
            this.f1151q[i6].b();
        }
    }

    public final void Q0(View view, int i6, int i10) {
        RecyclerView recyclerView = this.f14005b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.K(view));
        }
        n1 n1Var = (n1) view.getLayoutParams();
        int c1 = c1(i6, ((ViewGroup.MarginLayoutParams) n1Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) n1Var).rightMargin + rect.right);
        int c12 = c1(i10, ((ViewGroup.MarginLayoutParams) n1Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) n1Var).bottomMargin + rect.bottom);
        if (w0(view, c1, c12, n1Var)) {
            view.measure(c1, c12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01aa, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a6, code lost:
    
        if (r11 != r16.f1157x) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x041b, code lost:
    
        if (C0() != false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0198, code lost:
    
        if (r16.f1157x != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a8, code lost:
    
        r11 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R0(w4.y0 r17, w4.e1 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1081
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.R0(w4.y0, w4.e1, boolean):void");
    }

    @Override // w4.s0
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f14005b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i6 = 0; i6 < this.f1150p; i6++) {
            this.f1151q[i6].b();
        }
        recyclerView.requestLayout();
    }

    public final boolean S0(int i6) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f1153t == 0) {
            if (i6 == -1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 == this.f1157x) {
                return false;
            }
            return true;
        }
        if (i6 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 == this.f1157x) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != P0()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0052, code lost:
    
        if (r8.f1153t == 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0058, code lost:
    
        if (r8.f1153t == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0064, code lost:
    
        if (P0() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0070, code lost:
    
        if (P0() == false) goto L37;
     */
    @Override // w4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View T(android.view.View r9, int r10, w4.y0 r11, w4.e1 r12) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.T(android.view.View, int, w4.y0, w4.e1):android.view.View");
    }

    public final void T0(int i6, e1 e1Var) {
        int J0;
        int i10;
        if (i6 > 0) {
            J0 = K0();
            i10 = 1;
        } else {
            J0 = J0();
            i10 = -1;
        }
        y yVar = this.f1155v;
        yVar.f14065a = true;
        a1(J0, e1Var);
        Z0(i10);
        yVar.f14067c = J0 + yVar.f14068d;
        yVar.f14066b = Math.abs(i6);
    }

    @Override // w4.s0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View G0 = G0(false);
            View F0 = F0(false);
            if (G0 != null && F0 != null) {
                int H = s0.H(G0);
                int H2 = s0.H(F0);
                if (H < H2) {
                    accessibilityEvent.setFromIndex(H);
                    accessibilityEvent.setToIndex(H2);
                } else {
                    accessibilityEvent.setFromIndex(H2);
                    accessibilityEvent.setToIndex(H);
                }
            }
        }
    }

    public final void U0(y0 y0Var, y yVar) {
        int min;
        int min2;
        if (yVar.f14065a && !yVar.f14073i) {
            if (yVar.f14066b == 0) {
                if (yVar.f14069e == -1) {
                    V0(y0Var, yVar.f14071g);
                    return;
                } else {
                    W0(y0Var, yVar.f14070f);
                    return;
                }
            }
            int i6 = 1;
            if (yVar.f14069e == -1) {
                int i10 = yVar.f14070f;
                int k8 = this.f1151q[0].k(i10);
                while (i6 < this.f1150p) {
                    int k9 = this.f1151q[i6].k(i10);
                    if (k9 > k8) {
                        k8 = k9;
                    }
                    i6++;
                }
                int i11 = i10 - k8;
                if (i11 < 0) {
                    min2 = yVar.f14071g;
                } else {
                    min2 = yVar.f14071g - Math.min(i11, yVar.f14066b);
                }
                V0(y0Var, min2);
                return;
            }
            int i12 = yVar.f14071g;
            int i13 = this.f1151q[0].i(i12);
            while (i6 < this.f1150p) {
                int i14 = this.f1151q[i6].i(i12);
                if (i14 < i13) {
                    i13 = i14;
                }
                i6++;
            }
            int i15 = i13 - yVar.f14071g;
            if (i15 < 0) {
                min = yVar.f14070f;
            } else {
                min = Math.min(i15, yVar.f14066b) + yVar.f14070f;
            }
            W0(y0Var, min);
        }
    }

    public final void V0(y0 y0Var, int i6) {
        for (int v10 = v() - 1; v10 >= 0; v10--) {
            View u3 = u(v10);
            if (this.f1152r.g(u3) >= i6 && this.f1152r.p(u3) >= i6) {
                n1 n1Var = (n1) u3.getLayoutParams();
                n1Var.getClass();
                if (((ArrayList) n1Var.f13962e.f13170f).size() != 1) {
                    k kVar = n1Var.f13962e;
                    ArrayList arrayList = (ArrayList) kVar.f13170f;
                    int size = arrayList.size();
                    View view = (View) arrayList.remove(size - 1);
                    n1 n1Var2 = (n1) view.getLayoutParams();
                    n1Var2.f13962e = null;
                    if (n1Var2.f14020a.i() || n1Var2.f14020a.l()) {
                        kVar.f13168d -= ((StaggeredGridLayoutManager) kVar.f13171g).f1152r.e(view);
                    }
                    if (size == 1) {
                        kVar.f13166b = Integer.MIN_VALUE;
                    }
                    kVar.f13167c = Integer.MIN_VALUE;
                    k0(u3, y0Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void W0(y0 y0Var, int i6) {
        while (v() > 0) {
            View u3 = u(0);
            if (this.f1152r.d(u3) <= i6 && this.f1152r.o(u3) <= i6) {
                n1 n1Var = (n1) u3.getLayoutParams();
                n1Var.getClass();
                if (((ArrayList) n1Var.f13962e.f13170f).size() != 1) {
                    k kVar = n1Var.f13962e;
                    ArrayList arrayList = (ArrayList) kVar.f13170f;
                    View view = (View) arrayList.remove(0);
                    n1 n1Var2 = (n1) view.getLayoutParams();
                    n1Var2.f13962e = null;
                    if (arrayList.size() == 0) {
                        kVar.f13167c = Integer.MIN_VALUE;
                    }
                    if (n1Var2.f14020a.i() || n1Var2.f14020a.l()) {
                        kVar.f13168d -= ((StaggeredGridLayoutManager) kVar.f13171g).f1152r.e(view);
                    }
                    kVar.f13166b = Integer.MIN_VALUE;
                    k0(u3, y0Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void X0() {
        if (this.f1153t != 1 && P0()) {
            this.f1157x = !this.f1156w;
        } else {
            this.f1157x = this.f1156w;
        }
    }

    @Override // w4.s0
    public final void Y(int i6, int i10) {
        N0(i6, i10, 1);
    }

    public final int Y0(int i6, y0 y0Var, e1 e1Var) {
        if (v() == 0 || i6 == 0) {
            return 0;
        }
        T0(i6, e1Var);
        y yVar = this.f1155v;
        int E0 = E0(y0Var, yVar, e1Var);
        if (yVar.f14066b >= E0) {
            if (i6 < 0) {
                i6 = -E0;
            } else {
                i6 = E0;
            }
        }
        this.f1152r.q(-i6);
        this.D = this.f1157x;
        yVar.f14066b = 0;
        U0(y0Var, yVar);
        return i6;
    }

    @Override // w4.s0
    public final void Z() {
        this.B.d();
        n0();
    }

    public final void Z0(int i6) {
        boolean z10;
        y yVar = this.f1155v;
        yVar.f14069e = i6;
        boolean z11 = this.f1157x;
        int i10 = 1;
        if (i6 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            i10 = -1;
        }
        yVar.f14068d = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if (r4 != r3.f1157x) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.f1157x != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // w4.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.PointF a(int r4) {
        /*
            r3 = this;
            int r0 = r3.v()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.f1157x
            if (r4 == 0) goto L1b
        Lc:
            r1 = 1
            goto L1b
        Le:
            int r0 = r3.J0()
            if (r4 >= r0) goto L16
            r4 = 1
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.f1157x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.f1153t
            r2 = 0
            if (r0 != 0) goto L2f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L2f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(int):android.graphics.PointF");
    }

    @Override // w4.s0
    public final void a0(int i6, int i10) {
        N0(i6, i10, 8);
    }

    public final void a1(int i6, e1 e1Var) {
        int i10;
        int i11;
        RecyclerView recyclerView;
        int i12;
        boolean z10;
        y yVar = this.f1155v;
        boolean z11 = false;
        yVar.f14066b = 0;
        yVar.f14067c = i6;
        c0 c0Var = this.f14008e;
        if (c0Var != null && c0Var.f13827e && (i12 = e1Var.f13857a) != -1) {
            boolean z12 = this.f1157x;
            if (i12 < i6) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z12 == z10) {
                i10 = this.f1152r.n();
            } else {
                i11 = this.f1152r.n();
                i10 = 0;
                recyclerView = this.f14005b;
                if (recyclerView == null && recyclerView.E) {
                    yVar.f14070f = this.f1152r.m() - i11;
                    yVar.f14071g = this.f1152r.i() + i10;
                } else {
                    yVar.f14071g = this.f1152r.h() + i10;
                    yVar.f14070f = -i11;
                }
                yVar.f14072h = false;
                yVar.f14065a = true;
                if (this.f1152r.k() == 0 && this.f1152r.h() == 0) {
                    z11 = true;
                }
                yVar.f14073i = z11;
            }
        } else {
            i10 = 0;
        }
        i11 = 0;
        recyclerView = this.f14005b;
        if (recyclerView == null) {
        }
        yVar.f14071g = this.f1152r.h() + i10;
        yVar.f14070f = -i11;
        yVar.f14072h = false;
        yVar.f14065a = true;
        if (this.f1152r.k() == 0) {
            z11 = true;
        }
        yVar.f14073i = z11;
    }

    @Override // w4.s0
    public final void b0(int i6, int i10) {
        N0(i6, i10, 2);
    }

    public final void b1(k kVar, int i6, int i10) {
        int i11 = kVar.f13168d;
        int i12 = kVar.f13169e;
        if (i6 == -1) {
            int i13 = kVar.f13166b;
            if (i13 == Integer.MIN_VALUE) {
                View view = (View) ((ArrayList) kVar.f13170f).get(0);
                n1 n1Var = (n1) view.getLayoutParams();
                kVar.f13166b = ((StaggeredGridLayoutManager) kVar.f13171g).f1152r.g(view);
                n1Var.getClass();
                i13 = kVar.f13166b;
            }
            if (i13 + i11 <= i10) {
                this.f1158y.set(i12, false);
                return;
            }
            return;
        }
        int i14 = kVar.f13167c;
        if (i14 == Integer.MIN_VALUE) {
            kVar.a();
            i14 = kVar.f13167c;
        }
        if (i14 - i11 >= i10) {
            this.f1158y.set(i12, false);
        }
    }

    @Override // w4.s0
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // w4.s0
    public final void c0(int i6, int i10) {
        N0(i6, i10, 4);
    }

    @Override // w4.s0
    public final boolean d() {
        if (this.f1153t == 0) {
            return true;
        }
        return false;
    }

    @Override // w4.s0
    public final void d0(y0 y0Var, e1 e1Var) {
        R0(y0Var, e1Var, true);
    }

    @Override // w4.s0
    public final boolean e() {
        if (this.f1153t == 1) {
            return true;
        }
        return false;
    }

    @Override // w4.s0
    public final void e0(e1 e1Var) {
        this.f1159z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // w4.s0
    public final boolean f(t0 t0Var) {
        return t0Var instanceof n1;
    }

    @Override // w4.s0
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof p1) {
            p1 p1Var = (p1) parcelable;
            this.F = p1Var;
            if (this.f1159z != -1) {
                p1Var.f13982x = -1;
                p1Var.f13983y = -1;
                p1Var.A = null;
                p1Var.f13984z = 0;
                p1Var.B = 0;
                p1Var.C = null;
                p1Var.D = null;
            }
            n0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, w4.p1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.os.Parcelable, w4.p1, java.lang.Object] */
    @Override // w4.s0
    public final Parcelable g0() {
        int J0;
        View G0;
        int k8;
        int m9;
        int[] iArr;
        p1 p1Var = this.F;
        if (p1Var != null) {
            ?? obj = new Object();
            obj.f13984z = p1Var.f13984z;
            obj.f13982x = p1Var.f13982x;
            obj.f13983y = p1Var.f13983y;
            obj.A = p1Var.A;
            obj.B = p1Var.B;
            obj.C = p1Var.C;
            obj.E = p1Var.E;
            obj.F = p1Var.F;
            obj.G = p1Var.G;
            obj.D = p1Var.D;
            return obj;
        }
        ?? obj2 = new Object();
        obj2.E = this.f1156w;
        obj2.F = this.D;
        obj2.G = this.E;
        l lVar = this.B;
        if (lVar != null && (iArr = (int[]) lVar.f12251y) != null) {
            obj2.C = iArr;
            obj2.B = iArr.length;
            obj2.D = (ArrayList) lVar.f12252z;
        } else {
            obj2.B = 0;
        }
        int i6 = -1;
        if (v() > 0) {
            if (this.D) {
                J0 = K0();
            } else {
                J0 = J0();
            }
            obj2.f13982x = J0;
            if (this.f1157x) {
                G0 = F0(true);
            } else {
                G0 = G0(true);
            }
            if (G0 != null) {
                i6 = s0.H(G0);
            }
            obj2.f13983y = i6;
            int i10 = this.f1150p;
            obj2.f13984z = i10;
            obj2.A = new int[i10];
            for (int i11 = 0; i11 < this.f1150p; i11++) {
                if (this.D) {
                    k8 = this.f1151q[i11].i(Integer.MIN_VALUE);
                    if (k8 != Integer.MIN_VALUE) {
                        m9 = this.f1152r.i();
                        k8 -= m9;
                        obj2.A[i11] = k8;
                    } else {
                        obj2.A[i11] = k8;
                    }
                } else {
                    k8 = this.f1151q[i11].k(Integer.MIN_VALUE);
                    if (k8 != Integer.MIN_VALUE) {
                        m9 = this.f1152r.m();
                        k8 -= m9;
                        obj2.A[i11] = k8;
                    } else {
                        obj2.A[i11] = k8;
                    }
                }
            }
            return obj2;
        }
        obj2.f13982x = -1;
        obj2.f13983y = -1;
        obj2.f13984z = 0;
        return obj2;
    }

    @Override // w4.s0
    public final void h(int i6, int i10, e1 e1Var, h hVar) {
        y yVar;
        int i11;
        int i12;
        if (this.f1153t != 0) {
            i6 = i10;
        }
        if (v() != 0 && i6 != 0) {
            T0(i6, e1Var);
            int[] iArr = this.J;
            if (iArr == null || iArr.length < this.f1150p) {
                this.J = new int[this.f1150p];
            }
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int i15 = this.f1150p;
                yVar = this.f1155v;
                if (i13 >= i15) {
                    break;
                }
                if (yVar.f14068d == -1) {
                    i11 = yVar.f14070f;
                    i12 = this.f1151q[i13].k(i11);
                } else {
                    i11 = this.f1151q[i13].i(yVar.f14071g);
                    i12 = yVar.f14071g;
                }
                int i16 = i11 - i12;
                if (i16 >= 0) {
                    this.J[i14] = i16;
                    i14++;
                }
                i13++;
            }
            Arrays.sort(this.J, 0, i14);
            for (int i17 = 0; i17 < i14; i17++) {
                int i18 = yVar.f14067c;
                if (i18 >= 0 && i18 < e1Var.b()) {
                    hVar.b(yVar.f14067c, this.J[i17]);
                    yVar.f14067c += yVar.f14068d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // w4.s0
    public final void h0(int i6) {
        if (i6 == 0) {
            C0();
        }
    }

    @Override // w4.s0
    public final int j(e1 e1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return b.c(e1Var, this.f1152r, G0(z10), F0(z10), this, this.I);
    }

    @Override // w4.s0
    public final int k(e1 e1Var) {
        return D0(e1Var);
    }

    @Override // w4.s0
    public final int l(e1 e1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return b.e(e1Var, this.f1152r, G0(z10), F0(z10), this, this.I);
    }

    @Override // w4.s0
    public final int m(e1 e1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return b.c(e1Var, this.f1152r, G0(z10), F0(z10), this, this.I);
    }

    @Override // w4.s0
    public final int n(e1 e1Var) {
        return D0(e1Var);
    }

    @Override // w4.s0
    public final int o(e1 e1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return b.e(e1Var, this.f1152r, G0(z10), F0(z10), this, this.I);
    }

    @Override // w4.s0
    public final int o0(int i6, y0 y0Var, e1 e1Var) {
        return Y0(i6, y0Var, e1Var);
    }

    @Override // w4.s0
    public final void p0(int i6) {
        p1 p1Var = this.F;
        if (p1Var != null && p1Var.f13982x != i6) {
            p1Var.A = null;
            p1Var.f13984z = 0;
            p1Var.f13982x = -1;
            p1Var.f13983y = -1;
        }
        this.f1159z = i6;
        this.A = Integer.MIN_VALUE;
        n0();
    }

    @Override // w4.s0
    public final int q0(int i6, y0 y0Var, e1 e1Var) {
        return Y0(i6, y0Var, e1Var);
    }

    @Override // w4.s0
    public final t0 r() {
        if (this.f1153t == 0) {
            return new t0(-2, -1);
        }
        return new t0(-1, -2);
    }

    @Override // w4.s0
    public final t0 s(Context context, AttributeSet attributeSet) {
        return new t0(context, attributeSet);
    }

    @Override // w4.s0
    public final t0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new t0((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new t0(layoutParams);
    }

    @Override // w4.s0
    public final void t0(Rect rect, int i6, int i10) {
        int g10;
        int g11;
        int F = F() + E();
        int D = D() + G();
        int i11 = this.f1153t;
        int i12 = this.f1150p;
        if (i11 == 1) {
            int height = rect.height() + D;
            RecyclerView recyclerView = this.f14005b;
            WeakHashMap weakHashMap = q0.f12397a;
            g11 = s0.g(i10, height, recyclerView.getMinimumHeight());
            g10 = s0.g(i6, (this.f1154u * i12) + F, this.f14005b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.f14005b;
            WeakHashMap weakHashMap2 = q0.f12397a;
            g10 = s0.g(i6, width, recyclerView2.getMinimumWidth());
            g11 = s0.g(i10, (this.f1154u * i12) + D, this.f14005b.getMinimumHeight());
        }
        this.f14005b.setMeasuredDimension(g10, g11);
    }

    @Override // w4.s0
    public final void z0(RecyclerView recyclerView, int i6) {
        c0 c0Var = new c0(recyclerView.getContext());
        c0Var.f13823a = i6;
        A0(c0Var);
    }
}
