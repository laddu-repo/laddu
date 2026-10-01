package androidx.recyclerview.widget;

import a2.t0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.unity3d.services.UnityAdsConstants;
import e1.g;
import h8.c;
import java.util.ArrayList;
import java.util.List;
import v.h;
import w4.a0;
import w4.b;
import w4.b0;
import w4.c0;
import w4.d1;
import w4.e1;
import w4.i1;
import w4.r0;
import w4.s0;
import w4.y0;
import w4.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class LinearLayoutManager extends s0 implements d1 {
    public final t0 A;
    public final z B;
    public final int C;
    public final int[] D;

    /* renamed from: p, reason: collision with root package name */
    public int f1109p;

    /* renamed from: q, reason: collision with root package name */
    public a0 f1110q;

    /* renamed from: r, reason: collision with root package name */
    public g f1111r;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1112t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1113u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1114v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f1115w;

    /* renamed from: x, reason: collision with root package name */
    public int f1116x;

    /* renamed from: y, reason: collision with root package name */
    public int f1117y;

    /* renamed from: z, reason: collision with root package name */
    public b0 f1118z;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, w4.z] */
    public LinearLayoutManager(int i6) {
        this.f1109p = 1;
        this.f1112t = false;
        this.f1113u = false;
        this.f1114v = false;
        this.f1115w = true;
        this.f1116x = -1;
        this.f1117y = Integer.MIN_VALUE;
        this.f1118z = null;
        this.A = new t0();
        this.B = new Object();
        this.C = 2;
        this.D = new int[2];
        b1(i6);
        c(null);
        if (this.f1112t) {
            this.f1112t = false;
            n0();
        }
    }

    @Override // w4.s0
    public boolean B0() {
        if (this.f1118z == null && this.s == this.f1114v) {
            return true;
        }
        return false;
    }

    public void C0(e1 e1Var, int[] iArr) {
        int i6;
        int i10;
        if (e1Var.f13857a != -1) {
            i6 = this.f1111r.n();
        } else {
            i6 = 0;
        }
        if (this.f1110q.f13808f == -1) {
            i10 = 0;
        } else {
            i10 = i6;
            i6 = 0;
        }
        iArr[0] = i6;
        iArr[1] = i10;
    }

    public void D0(e1 e1Var, a0 a0Var, h hVar) {
        int i6 = a0Var.f13806d;
        if (i6 >= 0 && i6 < e1Var.b()) {
            hVar.b(i6, Math.max(0, a0Var.f13809g));
        }
    }

    public final int E0(e1 e1Var) {
        if (v() == 0) {
            return 0;
        }
        I0();
        g gVar = this.f1111r;
        boolean z10 = !this.f1115w;
        return b.c(e1Var, gVar, L0(z10), K0(z10), this, this.f1115w);
    }

    public final int F0(e1 e1Var) {
        if (v() == 0) {
            return 0;
        }
        I0();
        g gVar = this.f1111r;
        boolean z10 = !this.f1115w;
        return b.d(e1Var, gVar, L0(z10), K0(z10), this, this.f1115w, this.f1113u);
    }

    public final int G0(e1 e1Var) {
        if (v() == 0) {
            return 0;
        }
        I0();
        g gVar = this.f1111r;
        boolean z10 = !this.f1115w;
        return b.e(e1Var, gVar, L0(z10), K0(z10), this, this.f1115w);
    }

    public final int H0(int i6) {
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 17) {
                    if (i6 != 33) {
                        if (i6 != 66) {
                            if (i6 == 130 && this.f1109p == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                        if (this.f1109p == 0) {
                            return 1;
                        }
                        return Integer.MIN_VALUE;
                    }
                    if (this.f1109p == 1) {
                        return -1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (this.f1109p == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            }
            if (this.f1109p != 1 && U0()) {
                return -1;
            }
            return 1;
        }
        if (this.f1109p == 1 || !U0()) {
            return -1;
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [w4.a0, java.lang.Object] */
    public final void I0() {
        if (this.f1110q == null) {
            ?? obj = new Object();
            obj.f13803a = true;
            obj.f13810h = 0;
            obj.f13811i = 0;
            obj.f13812k = null;
            this.f1110q = obj;
        }
    }

    public final int J0(y0 y0Var, a0 a0Var, e1 e1Var, boolean z10) {
        int i6;
        int i10 = a0Var.f13805c;
        int i11 = a0Var.f13809g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                a0Var.f13809g = i11 + i10;
            }
            X0(y0Var, a0Var);
        }
        int i12 = a0Var.f13805c + a0Var.f13810h;
        while (true) {
            if ((!a0Var.f13813l && i12 <= 0) || (i6 = a0Var.f13806d) < 0 || i6 >= e1Var.b()) {
                break;
            }
            z zVar = this.B;
            zVar.f14082a = 0;
            zVar.f14083b = false;
            zVar.f14084c = false;
            zVar.f14085d = false;
            V0(y0Var, e1Var, a0Var, zVar);
            if (!zVar.f14083b) {
                int i13 = a0Var.f13804b;
                int i14 = zVar.f14082a;
                a0Var.f13804b = (a0Var.f13808f * i14) + i13;
                if (!zVar.f14084c || a0Var.f13812k != null || !e1Var.f13863g) {
                    a0Var.f13805c -= i14;
                    i12 -= i14;
                }
                int i15 = a0Var.f13809g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    a0Var.f13809g = i16;
                    int i17 = a0Var.f13805c;
                    if (i17 < 0) {
                        a0Var.f13809g = i16 + i17;
                    }
                    X0(y0Var, a0Var);
                }
                if (z10 && zVar.f14085d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - a0Var.f13805c;
    }

    public final View K0(boolean z10) {
        if (this.f1113u) {
            return O0(z10, 0, v());
        }
        return O0(z10, v() - 1, -1);
    }

    @Override // w4.s0
    public final boolean L() {
        return true;
    }

    public final View L0(boolean z10) {
        if (this.f1113u) {
            return O0(z10, v() - 1, -1);
        }
        return O0(z10, 0, v());
    }

    public final int M0() {
        View O0 = O0(false, v() - 1, -1);
        if (O0 == null) {
            return -1;
        }
        return s0.H(O0);
    }

    public final View N0(int i6, int i10) {
        int i11;
        int i12;
        I0();
        if (i10 > i6 || i10 < i6) {
            if (this.f1111r.g(u(i6)) < this.f1111r.m()) {
                i11 = 16644;
                i12 = 16388;
            } else {
                i11 = 4161;
                i12 = 4097;
            }
            if (this.f1109p == 0) {
                return this.f14006c.i(i6, i10, i11, i12);
            }
            return this.f14007d.i(i6, i10, i11, i12);
        }
        return u(i6);
    }

    public final View O0(boolean z10, int i6, int i10) {
        int i11;
        I0();
        if (z10) {
            i11 = 24579;
        } else {
            i11 = 320;
        }
        if (this.f1109p == 0) {
            return this.f14006c.i(i6, i10, i11, 320);
        }
        return this.f14007d.i(i6, i10, i11, 320);
    }

    public View P0(y0 y0Var, e1 e1Var, boolean z10, boolean z11) {
        int i6;
        int i10;
        int i11;
        boolean z12;
        boolean z13;
        I0();
        int v10 = v();
        if (z11) {
            i10 = v() - 1;
            i6 = -1;
            i11 = -1;
        } else {
            i6 = v10;
            i10 = 0;
            i11 = 1;
        }
        int b10 = e1Var.b();
        int m9 = this.f1111r.m();
        int i12 = this.f1111r.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i10 != i6) {
            View u3 = u(i10);
            int H = s0.H(u3);
            int g10 = this.f1111r.g(u3);
            int d10 = this.f1111r.d(u3);
            if (H >= 0 && H < b10) {
                if (((w4.t0) u3.getLayoutParams()).f14020a.i()) {
                    if (view3 == null) {
                        view3 = u3;
                    }
                } else {
                    if (d10 <= m9 && g10 < m9) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (g10 >= i12 && d10 > i12) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z12 && !z13) {
                        return u3;
                    }
                    if (z10) {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = u3;
                        }
                        view2 = u3;
                    } else {
                        if (!z12) {
                            if (view != null) {
                            }
                            view = u3;
                        }
                        view2 = u3;
                    }
                }
            }
            i10 += i11;
        }
        if (view != null) {
            return view;
        }
        if (view2 != null) {
            return view2;
        }
        return view3;
    }

    public final int Q0(int i6, y0 y0Var, e1 e1Var, boolean z10) {
        int i10;
        int i11 = this.f1111r.i() - i6;
        if (i11 > 0) {
            int i12 = -a1(-i11, y0Var, e1Var);
            int i13 = i6 + i12;
            if (z10 && (i10 = this.f1111r.i() - i13) > 0) {
                this.f1111r.q(i10);
                return i10 + i12;
            }
            return i12;
        }
        return 0;
    }

    public final int R0(int i6, y0 y0Var, e1 e1Var, boolean z10) {
        int m9;
        int m10 = i6 - this.f1111r.m();
        if (m10 > 0) {
            int i10 = -a1(m10, y0Var, e1Var);
            int i11 = i6 + i10;
            if (z10 && (m9 = i11 - this.f1111r.m()) > 0) {
                this.f1111r.q(-m9);
                return i10 - m9;
            }
            return i10;
        }
        return 0;
    }

    public final View S0() {
        int v10;
        if (this.f1113u) {
            v10 = 0;
        } else {
            v10 = v() - 1;
        }
        return u(v10);
    }

    @Override // w4.s0
    public View T(View view, int i6, y0 y0Var, e1 e1Var) {
        int H0;
        View N0;
        View S0;
        Z0();
        if (v() != 0 && (H0 = H0(i6)) != Integer.MIN_VALUE) {
            I0();
            d1(H0, (int) (this.f1111r.n() * 0.33333334f), false, e1Var);
            a0 a0Var = this.f1110q;
            a0Var.f13809g = Integer.MIN_VALUE;
            a0Var.f13803a = false;
            J0(y0Var, a0Var, e1Var, true);
            if (H0 == -1) {
                if (this.f1113u) {
                    N0 = N0(v() - 1, -1);
                } else {
                    N0 = N0(0, v());
                }
            } else if (this.f1113u) {
                N0 = N0(0, v());
            } else {
                N0 = N0(v() - 1, -1);
            }
            if (H0 == -1) {
                S0 = T0();
            } else {
                S0 = S0();
            }
            if (S0.hasFocusable()) {
                if (N0 != null) {
                    return S0;
                }
            } else {
                return N0;
            }
        }
        return null;
    }

    public final View T0() {
        int i6;
        if (this.f1113u) {
            i6 = v() - 1;
        } else {
            i6 = 0;
        }
        return u(i6);
    }

    @Override // w4.s0
    public final void U(AccessibilityEvent accessibilityEvent) {
        int H;
        super.U(accessibilityEvent);
        if (v() > 0) {
            View O0 = O0(false, 0, v());
            if (O0 == null) {
                H = -1;
            } else {
                H = s0.H(O0);
            }
            accessibilityEvent.setFromIndex(H);
            accessibilityEvent.setToIndex(M0());
        }
    }

    public final boolean U0() {
        if (C() == 1) {
            return true;
        }
        return false;
    }

    public void V0(y0 y0Var, e1 e1Var, a0 a0Var, z zVar) {
        boolean z10;
        int i6;
        int i10;
        int i11;
        int i12;
        boolean z11;
        View b10 = a0Var.b(y0Var);
        if (b10 == null) {
            zVar.f14083b = true;
            return;
        }
        w4.t0 t0Var = (w4.t0) b10.getLayoutParams();
        if (a0Var.f13812k == null) {
            boolean z12 = this.f1113u;
            if (a0Var.f13808f == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z12 == z11) {
                b(b10, -1, false);
            } else {
                b(b10, 0, false);
            }
        } else {
            boolean z13 = this.f1113u;
            if (a0Var.f13808f == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z13 == z10) {
                b(b10, -1, true);
            } else {
                b(b10, 0, true);
            }
        }
        w4.t0 t0Var2 = (w4.t0) b10.getLayoutParams();
        Rect K = this.f14005b.K(b10);
        int i13 = K.left + K.right;
        int i14 = K.top + K.bottom;
        int w10 = s0.w(this.f14016n, this.f14014l, F() + E() + ((ViewGroup.MarginLayoutParams) t0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) t0Var2).rightMargin + i13, ((ViewGroup.MarginLayoutParams) t0Var2).width, d());
        int w11 = s0.w(this.f14017o, this.f14015m, D() + G() + ((ViewGroup.MarginLayoutParams) t0Var2).topMargin + ((ViewGroup.MarginLayoutParams) t0Var2).bottomMargin + i14, ((ViewGroup.MarginLayoutParams) t0Var2).height, e());
        if (w0(b10, w10, w11, t0Var2)) {
            b10.measure(w10, w11);
        }
        zVar.f14082a = this.f1111r.e(b10);
        if (this.f1109p == 1) {
            if (U0()) {
                i12 = this.f14016n - F();
                i6 = i12 - this.f1111r.f(b10);
            } else {
                i6 = E();
                i12 = this.f1111r.f(b10) + i6;
            }
            if (a0Var.f13808f == -1) {
                i10 = a0Var.f13804b;
                i11 = i10 - zVar.f14082a;
            } else {
                i11 = a0Var.f13804b;
                i10 = zVar.f14082a + i11;
            }
        } else {
            int G = G();
            int f3 = this.f1111r.f(b10) + G;
            if (a0Var.f13808f == -1) {
                int i15 = a0Var.f13804b;
                int i16 = i15 - zVar.f14082a;
                i12 = i15;
                i10 = f3;
                i6 = i16;
                i11 = G;
            } else {
                int i17 = a0Var.f13804b;
                int i18 = zVar.f14082a + i17;
                i6 = i17;
                i10 = f3;
                i11 = G;
                i12 = i18;
            }
        }
        s0.N(b10, i6, i11, i12, i10);
        if (t0Var.f14020a.i() || t0Var.f14020a.l()) {
            zVar.f14084c = true;
        }
        zVar.f14085d = b10.hasFocusable();
    }

    public final void X0(y0 y0Var, a0 a0Var) {
        if (a0Var.f13803a && !a0Var.f13813l) {
            int i6 = a0Var.f13809g;
            int i10 = a0Var.f13811i;
            if (a0Var.f13808f == -1) {
                int v10 = v();
                if (i6 >= 0) {
                    int h4 = (this.f1111r.h() - i6) + i10;
                    if (this.f1113u) {
                        for (int i11 = 0; i11 < v10; i11++) {
                            View u3 = u(i11);
                            if (this.f1111r.g(u3) < h4 || this.f1111r.p(u3) < h4) {
                                Y0(y0Var, 0, i11);
                                return;
                            }
                        }
                        return;
                    }
                    int i12 = v10 - 1;
                    for (int i13 = i12; i13 >= 0; i13--) {
                        View u10 = u(i13);
                        if (this.f1111r.g(u10) < h4 || this.f1111r.p(u10) < h4) {
                            Y0(y0Var, i12, i13);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (i6 >= 0) {
                int i14 = i6 - i10;
                int v11 = v();
                if (this.f1113u) {
                    int i15 = v11 - 1;
                    for (int i16 = i15; i16 >= 0; i16--) {
                        View u11 = u(i16);
                        if (this.f1111r.d(u11) > i14 || this.f1111r.o(u11) > i14) {
                            Y0(y0Var, i15, i16);
                            return;
                        }
                    }
                    return;
                }
                for (int i17 = 0; i17 < v11; i17++) {
                    View u12 = u(i17);
                    if (this.f1111r.d(u12) > i14 || this.f1111r.o(u12) > i14) {
                        Y0(y0Var, 0, i17);
                        return;
                    }
                }
            }
        }
    }

    public final void Y0(y0 y0Var, int i6, int i10) {
        if (i6 != i10) {
            if (i10 > i6) {
                for (int i11 = i10 - 1; i11 >= i6; i11--) {
                    View u3 = u(i11);
                    l0(i11);
                    y0Var.i(u3);
                }
                return;
            }
            while (i6 > i10) {
                View u10 = u(i6);
                l0(i6);
                y0Var.i(u10);
                i6--;
            }
        }
    }

    public final void Z0() {
        if (this.f1109p != 1 && U0()) {
            this.f1113u = !this.f1112t;
        } else {
            this.f1113u = this.f1112t;
        }
    }

    @Override // w4.d1
    public final PointF a(int i6) {
        if (v() == 0) {
            return null;
        }
        boolean z10 = false;
        int i10 = 1;
        if (i6 < s0.H(u(0))) {
            z10 = true;
        }
        if (z10 != this.f1113u) {
            i10 = -1;
        }
        if (this.f1109p == 0) {
            return new PointF(i10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        return new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i10);
    }

    public final int a1(int i6, y0 y0Var, e1 e1Var) {
        int i10;
        if (v() != 0 && i6 != 0) {
            I0();
            this.f1110q.f13803a = true;
            if (i6 > 0) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int abs = Math.abs(i6);
            d1(i10, abs, true, e1Var);
            a0 a0Var = this.f1110q;
            int J0 = J0(y0Var, a0Var, e1Var, false) + a0Var.f13809g;
            if (J0 >= 0) {
                if (abs > J0) {
                    i6 = i10 * J0;
                }
                this.f1111r.q(-i6);
                this.f1110q.j = i6;
                return i6;
            }
        }
        return 0;
    }

    public final void b1(int i6) {
        if (i6 != 0 && i6 != 1) {
            throw new IllegalArgumentException(c.i(i6, "invalid orientation:"));
        }
        c(null);
        if (i6 == this.f1109p && this.f1111r != null) {
            return;
        }
        g b10 = g.b(this, i6);
        this.f1111r = b10;
        this.A.f418f = b10;
        this.f1109p = i6;
        n0();
    }

    @Override // w4.s0
    public final void c(String str) {
        if (this.f1118z == null) {
            super.c(str);
        }
    }

    public void c1(boolean z10) {
        c(null);
        if (this.f1114v == z10) {
            return;
        }
        this.f1114v = z10;
        n0();
    }

    @Override // w4.s0
    public final boolean d() {
        if (this.f1109p == 0) {
            return true;
        }
        return false;
    }

    @Override // w4.s0
    public void d0(y0 y0Var, e1 e1Var) {
        View view;
        int i6;
        View view2;
        View P0;
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        int g10;
        int n10;
        int i11;
        boolean z14;
        int i12;
        int i13;
        List list;
        boolean z15;
        int i14;
        int i15;
        int Q0;
        int i16;
        View q9;
        int g11;
        int i17;
        int i18;
        int i19 = -1;
        if ((this.f1118z != null || this.f1116x != -1) && e1Var.b() == 0) {
            i0(y0Var);
            return;
        }
        b0 b0Var = this.f1118z;
        if (b0Var != null && (i18 = b0Var.f13818x) >= 0) {
            this.f1116x = i18;
        }
        I0();
        this.f1110q.f13803a = false;
        Z0();
        RecyclerView recyclerView = this.f14005b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f14004a.A).contains(view)) {
            view = null;
        }
        t0 t0Var = this.A;
        if (t0Var.f416d && this.f1116x == -1 && this.f1118z == null) {
            if (view != null && (this.f1111r.g(view) >= this.f1111r.i() || this.f1111r.d(view) <= this.f1111r.m())) {
                t0Var.d(view, s0.H(view));
            }
        } else {
            t0Var.g();
            t0Var.f415c = this.f1113u ^ this.f1114v;
            if (!e1Var.f13863g && (i10 = this.f1116x) != -1) {
                if (i10 >= 0 && i10 < e1Var.b()) {
                    int i20 = this.f1116x;
                    t0Var.f414b = i20;
                    b0 b0Var2 = this.f1118z;
                    if (b0Var2 != null && b0Var2.f13818x >= 0) {
                        boolean z16 = b0Var2.f13820z;
                        t0Var.f415c = z16;
                        if (z16) {
                            t0Var.f417e = this.f1111r.i() - this.f1118z.f13819y;
                        } else {
                            t0Var.f417e = this.f1111r.m() + this.f1118z.f13819y;
                        }
                    } else if (this.f1117y == Integer.MIN_VALUE) {
                        View q10 = q(i20);
                        if (q10 != null) {
                            if (this.f1111r.e(q10) > this.f1111r.n()) {
                                t0Var.b();
                            } else if (this.f1111r.g(q10) - this.f1111r.m() < 0) {
                                t0Var.f417e = this.f1111r.m();
                                t0Var.f415c = false;
                            } else if (this.f1111r.i() - this.f1111r.d(q10) < 0) {
                                t0Var.f417e = this.f1111r.i();
                                t0Var.f415c = true;
                            } else {
                                if (t0Var.f415c) {
                                    int d10 = this.f1111r.d(q10);
                                    g gVar = this.f1111r;
                                    if (Integer.MIN_VALUE == gVar.f4157a) {
                                        n10 = 0;
                                    } else {
                                        n10 = gVar.n() - gVar.f4157a;
                                    }
                                    g10 = n10 + d10;
                                } else {
                                    g10 = this.f1111r.g(q10);
                                }
                                t0Var.f417e = g10;
                            }
                        } else {
                            if (v() > 0) {
                                if (this.f1116x < s0.H(u(0))) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12 == this.f1113u) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                t0Var.f415c = z13;
                            }
                            t0Var.b();
                        }
                    } else {
                        boolean z17 = this.f1113u;
                        t0Var.f415c = z17;
                        if (z17) {
                            t0Var.f417e = this.f1111r.i() - this.f1117y;
                        } else {
                            t0Var.f417e = this.f1111r.m() + this.f1117y;
                        }
                    }
                    t0Var.f416d = true;
                } else {
                    this.f1116x = -1;
                    this.f1117y = Integer.MIN_VALUE;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.f14005b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f14004a.A).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    w4.t0 t0Var2 = (w4.t0) view2.getLayoutParams();
                    if (!t0Var2.f14020a.i() && t0Var2.f14020a.c() >= 0 && t0Var2.f14020a.c() < e1Var.b()) {
                        t0Var.d(view2, s0.H(view2));
                        t0Var.f416d = true;
                    }
                }
                boolean z18 = this.s;
                boolean z19 = this.f1114v;
                if (z18 == z19 && (P0 = P0(y0Var, e1Var, t0Var.f415c, z19)) != null) {
                    t0Var.c(P0, s0.H(P0));
                    if (!e1Var.f13863g && B0()) {
                        int g12 = this.f1111r.g(P0);
                        int d11 = this.f1111r.d(P0);
                        int m9 = this.f1111r.m();
                        int i21 = this.f1111r.i();
                        if (d11 <= m9 && g12 < m9) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (g12 >= i21 && d11 > i21) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z10 || z11) {
                            if (t0Var.f415c) {
                                m9 = i21;
                            }
                            t0Var.f417e = m9;
                        }
                    }
                    t0Var.f416d = true;
                }
            }
            t0Var.b();
            if (this.f1114v) {
                i6 = e1Var.b() - 1;
            } else {
                i6 = 0;
            }
            t0Var.f414b = i6;
            t0Var.f416d = true;
        }
        a0 a0Var = this.f1110q;
        if (a0Var.j >= 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        a0Var.f13808f = i11;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        C0(e1Var, iArr);
        int m10 = this.f1111r.m() + Math.max(0, iArr[0]);
        int j = this.f1111r.j() + Math.max(0, iArr[1]);
        if (e1Var.f13863g && (i16 = this.f1116x) != -1 && this.f1117y != Integer.MIN_VALUE && (q9 = q(i16)) != null) {
            if (this.f1113u) {
                i17 = this.f1111r.i() - this.f1111r.d(q9);
                g11 = this.f1117y;
            } else {
                g11 = this.f1111r.g(q9) - this.f1111r.m();
                i17 = this.f1117y;
            }
            int i22 = i17 - g11;
            if (i22 > 0) {
                m10 += i22;
            } else {
                j -= i22;
            }
        }
        if (!t0Var.f415c ? !this.f1113u : this.f1113u) {
            i19 = 1;
        }
        W0(y0Var, e1Var, t0Var, i19);
        p(y0Var);
        a0 a0Var2 = this.f1110q;
        if (this.f1111r.k() == 0 && this.f1111r.h() == 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        a0Var2.f13813l = z14;
        this.f1110q.getClass();
        this.f1110q.f13811i = 0;
        if (t0Var.f415c) {
            f1(t0Var.f414b, t0Var.f417e);
            a0 a0Var3 = this.f1110q;
            a0Var3.f13810h = m10;
            J0(y0Var, a0Var3, e1Var, false);
            a0 a0Var4 = this.f1110q;
            i13 = a0Var4.f13804b;
            int i23 = a0Var4.f13806d;
            int i24 = a0Var4.f13805c;
            if (i24 > 0) {
                j += i24;
            }
            e1(t0Var.f414b, t0Var.f417e);
            a0 a0Var5 = this.f1110q;
            a0Var5.f13810h = j;
            a0Var5.f13806d += a0Var5.f13807e;
            J0(y0Var, a0Var5, e1Var, false);
            a0 a0Var6 = this.f1110q;
            i12 = a0Var6.f13804b;
            int i25 = a0Var6.f13805c;
            if (i25 > 0) {
                f1(i23, i13);
                a0 a0Var7 = this.f1110q;
                a0Var7.f13810h = i25;
                J0(y0Var, a0Var7, e1Var, false);
                i13 = this.f1110q.f13804b;
            }
        } else {
            e1(t0Var.f414b, t0Var.f417e);
            a0 a0Var8 = this.f1110q;
            a0Var8.f13810h = j;
            J0(y0Var, a0Var8, e1Var, false);
            a0 a0Var9 = this.f1110q;
            i12 = a0Var9.f13804b;
            int i26 = a0Var9.f13806d;
            int i27 = a0Var9.f13805c;
            if (i27 > 0) {
                m10 += i27;
            }
            f1(t0Var.f414b, t0Var.f417e);
            a0 a0Var10 = this.f1110q;
            a0Var10.f13810h = m10;
            a0Var10.f13806d += a0Var10.f13807e;
            J0(y0Var, a0Var10, e1Var, false);
            a0 a0Var11 = this.f1110q;
            int i28 = a0Var11.f13804b;
            int i29 = a0Var11.f13805c;
            if (i29 > 0) {
                e1(i26, i12);
                a0 a0Var12 = this.f1110q;
                a0Var12.f13810h = i29;
                J0(y0Var, a0Var12, e1Var, false);
                i12 = this.f1110q.f13804b;
            }
            i13 = i28;
        }
        if (v() > 0) {
            if (this.f1113u ^ this.f1114v) {
                int Q02 = Q0(i12, y0Var, e1Var, true);
                i14 = i13 + Q02;
                i15 = i12 + Q02;
                Q0 = R0(i14, y0Var, e1Var, false);
            } else {
                int R0 = R0(i13, y0Var, e1Var, true);
                i14 = i13 + R0;
                i15 = i12 + R0;
                Q0 = Q0(i15, y0Var, e1Var, false);
            }
            i13 = i14 + Q0;
            i12 = i15 + Q0;
        }
        if (e1Var.f13866k && v() != 0 && !e1Var.f13863g && B0()) {
            List list2 = y0Var.f14077d;
            int size = list2.size();
            int H = s0.H(u(0));
            int i30 = 0;
            int i31 = 0;
            for (int i32 = 0; i32 < size; i32++) {
                i1 i1Var = (i1) list2.get(i32);
                boolean i33 = i1Var.i();
                View view3 = i1Var.f13897a;
                if (!i33) {
                    if (i1Var.c() < H) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15 != this.f1113u) {
                        i30 += this.f1111r.e(view3);
                    } else {
                        i31 += this.f1111r.e(view3);
                    }
                }
            }
            this.f1110q.f13812k = list2;
            if (i30 > 0) {
                f1(s0.H(T0()), i13);
                a0 a0Var13 = this.f1110q;
                a0Var13.f13810h = i30;
                a0Var13.f13805c = 0;
                a0Var13.a(null);
                J0(y0Var, this.f1110q, e1Var, false);
            }
            if (i31 > 0) {
                e1(s0.H(S0()), i12);
                a0 a0Var14 = this.f1110q;
                a0Var14.f13810h = i31;
                a0Var14.f13805c = 0;
                list = null;
                a0Var14.a(null);
                J0(y0Var, this.f1110q, e1Var, false);
            } else {
                list = null;
            }
            this.f1110q.f13812k = list;
        }
        if (!e1Var.f13863g) {
            g gVar2 = this.f1111r;
            gVar2.f4157a = gVar2.n();
        } else {
            t0Var.g();
        }
        this.s = this.f1114v;
    }

    public final void d1(int i6, int i10, boolean z10, e1 e1Var) {
        boolean z11;
        int i11;
        int m9;
        a0 a0Var = this.f1110q;
        boolean z12 = false;
        int i12 = 1;
        if (this.f1111r.k() == 0 && this.f1111r.h() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        a0Var.f13813l = z11;
        this.f1110q.f13808f = i6;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        C0(e1Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i6 == 1) {
            z12 = true;
        }
        a0 a0Var2 = this.f1110q;
        if (z12) {
            i11 = max2;
        } else {
            i11 = max;
        }
        a0Var2.f13810h = i11;
        if (!z12) {
            max = max2;
        }
        a0Var2.f13811i = max;
        if (z12) {
            a0Var2.f13810h = this.f1111r.j() + i11;
            View S0 = S0();
            a0 a0Var3 = this.f1110q;
            if (this.f1113u) {
                i12 = -1;
            }
            a0Var3.f13807e = i12;
            int H = s0.H(S0);
            a0 a0Var4 = this.f1110q;
            a0Var3.f13806d = H + a0Var4.f13807e;
            a0Var4.f13804b = this.f1111r.d(S0);
            m9 = this.f1111r.d(S0) - this.f1111r.i();
        } else {
            View T0 = T0();
            a0 a0Var5 = this.f1110q;
            a0Var5.f13810h = this.f1111r.m() + a0Var5.f13810h;
            a0 a0Var6 = this.f1110q;
            if (!this.f1113u) {
                i12 = -1;
            }
            a0Var6.f13807e = i12;
            int H2 = s0.H(T0);
            a0 a0Var7 = this.f1110q;
            a0Var6.f13806d = H2 + a0Var7.f13807e;
            a0Var7.f13804b = this.f1111r.g(T0);
            m9 = (-this.f1111r.g(T0)) + this.f1111r.m();
        }
        a0 a0Var8 = this.f1110q;
        a0Var8.f13805c = i10;
        if (z10) {
            a0Var8.f13805c = i10 - m9;
        }
        a0Var8.f13809g = m9;
    }

    @Override // w4.s0
    public final boolean e() {
        if (this.f1109p == 1) {
            return true;
        }
        return false;
    }

    @Override // w4.s0
    public void e0(e1 e1Var) {
        this.f1118z = null;
        this.f1116x = -1;
        this.f1117y = Integer.MIN_VALUE;
        this.A.g();
    }

    public final void e1(int i6, int i10) {
        int i11;
        this.f1110q.f13805c = this.f1111r.i() - i10;
        a0 a0Var = this.f1110q;
        if (this.f1113u) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        a0Var.f13807e = i11;
        a0Var.f13806d = i6;
        a0Var.f13808f = 1;
        a0Var.f13804b = i10;
        a0Var.f13809g = Integer.MIN_VALUE;
    }

    @Override // w4.s0
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof b0) {
            b0 b0Var = (b0) parcelable;
            this.f1118z = b0Var;
            if (this.f1116x != -1) {
                b0Var.f13818x = -1;
            }
            n0();
        }
    }

    public final void f1(int i6, int i10) {
        int i11;
        this.f1110q.f13805c = i10 - this.f1111r.m();
        a0 a0Var = this.f1110q;
        a0Var.f13806d = i6;
        if (this.f1113u) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        a0Var.f13807e = i11;
        a0Var.f13808f = -1;
        a0Var.f13804b = i10;
        a0Var.f13809g = Integer.MIN_VALUE;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, w4.b0] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.os.Parcelable, java.lang.Object, w4.b0] */
    @Override // w4.s0
    public final Parcelable g0() {
        b0 b0Var = this.f1118z;
        if (b0Var != null) {
            ?? obj = new Object();
            obj.f13818x = b0Var.f13818x;
            obj.f13819y = b0Var.f13819y;
            obj.f13820z = b0Var.f13820z;
            return obj;
        }
        ?? obj2 = new Object();
        if (v() > 0) {
            I0();
            boolean z10 = this.s ^ this.f1113u;
            obj2.f13820z = z10;
            if (z10) {
                View S0 = S0();
                obj2.f13819y = this.f1111r.i() - this.f1111r.d(S0);
                obj2.f13818x = s0.H(S0);
                return obj2;
            }
            View T0 = T0();
            obj2.f13818x = s0.H(T0);
            obj2.f13819y = this.f1111r.g(T0) - this.f1111r.m();
            return obj2;
        }
        obj2.f13818x = -1;
        return obj2;
    }

    @Override // w4.s0
    public final void h(int i6, int i10, e1 e1Var, h hVar) {
        int i11;
        if (this.f1109p != 0) {
            i6 = i10;
        }
        if (v() != 0 && i6 != 0) {
            I0();
            if (i6 > 0) {
                i11 = 1;
            } else {
                i11 = -1;
            }
            d1(i11, Math.abs(i6), true, e1Var);
            D0(e1Var, this.f1110q, hVar);
        }
    }

    @Override // w4.s0
    public final void i(int i6, h hVar) {
        boolean z10;
        int i10;
        b0 b0Var = this.f1118z;
        int i11 = -1;
        if (b0Var != null && (i10 = b0Var.f13818x) >= 0) {
            z10 = b0Var.f13820z;
        } else {
            Z0();
            z10 = this.f1113u;
            i10 = this.f1116x;
            if (i10 == -1) {
                i10 = z10 ? i6 - 1 : 0;
            }
        }
        if (!z10) {
            i11 = 1;
        }
        for (int i12 = 0; i12 < this.C && i10 >= 0 && i10 < i6; i12++) {
            hVar.b(i10, 0);
            i10 += i11;
        }
    }

    @Override // w4.s0
    public final int j(e1 e1Var) {
        return E0(e1Var);
    }

    @Override // w4.s0
    public int k(e1 e1Var) {
        return F0(e1Var);
    }

    @Override // w4.s0
    public int l(e1 e1Var) {
        return G0(e1Var);
    }

    @Override // w4.s0
    public final int m(e1 e1Var) {
        return E0(e1Var);
    }

    @Override // w4.s0
    public int n(e1 e1Var) {
        return F0(e1Var);
    }

    @Override // w4.s0
    public int o(e1 e1Var) {
        return G0(e1Var);
    }

    @Override // w4.s0
    public int o0(int i6, y0 y0Var, e1 e1Var) {
        if (this.f1109p == 1) {
            return 0;
        }
        return a1(i6, y0Var, e1Var);
    }

    @Override // w4.s0
    public final void p0(int i6) {
        this.f1116x = i6;
        this.f1117y = Integer.MIN_VALUE;
        b0 b0Var = this.f1118z;
        if (b0Var != null) {
            b0Var.f13818x = -1;
        }
        n0();
    }

    @Override // w4.s0
    public final View q(int i6) {
        int v10 = v();
        if (v10 == 0) {
            return null;
        }
        int H = i6 - s0.H(u(0));
        if (H >= 0 && H < v10) {
            View u3 = u(H);
            if (s0.H(u3) == i6) {
                return u3;
            }
        }
        return super.q(i6);
    }

    @Override // w4.s0
    public int q0(int i6, y0 y0Var, e1 e1Var) {
        if (this.f1109p == 0) {
            return 0;
        }
        return a1(i6, y0Var, e1Var);
    }

    @Override // w4.s0
    public w4.t0 r() {
        return new w4.t0(-2, -2);
    }

    @Override // w4.s0
    public final boolean x0() {
        if (this.f14015m != 1073741824 && this.f14014l != 1073741824) {
            int v10 = v();
            for (int i6 = 0; i6 < v10; i6++) {
                ViewGroup.LayoutParams layoutParams = u(i6).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // w4.s0
    public void z0(RecyclerView recyclerView, int i6) {
        c0 c0Var = new c0(recyclerView.getContext());
        c0Var.f13823a = i6;
        A0(c0Var);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, w4.z] */
    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i6, int i10) {
        this.f1109p = 1;
        this.f1112t = false;
        this.f1113u = false;
        this.f1114v = false;
        this.f1115w = true;
        this.f1116x = -1;
        this.f1117y = Integer.MIN_VALUE;
        this.f1118z = null;
        this.A = new t0();
        this.B = new Object();
        this.C = 2;
        this.D = new int[2];
        r0 I = s0.I(context, attributeSet, i6, i10);
        b1(I.f13995a);
        boolean z10 = I.f13997c;
        c(null);
        if (z10 != this.f1112t) {
            this.f1112t = z10;
            n0();
        }
        c1(I.f13998d);
    }

    @Override // w4.s0
    public final void S(RecyclerView recyclerView) {
    }

    public void W0(y0 y0Var, e1 e1Var, t0 t0Var, int i6) {
    }
}
