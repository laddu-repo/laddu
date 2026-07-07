package k4;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import java.util.List;
import r1.d1;
import r1.j1;
import r1.l1;
import r1.n0;
import r1.o0;
import r1.p1;
import r1.q0;
import r1.r0;
import r1.s0;
import r1.t0;
import r1.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements s0, View.OnClickListener, PopupWindow.OnDismissListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f7643x;

    public g(q qVar) {
        this.f7643x = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        q qVar = this.f7643x;
        ImageView imageView = qVar.f7667c0;
        View view2 = qVar.f7672h0;
        View view3 = qVar.f7671g0;
        View view4 = qVar.f7670f0;
        v vVar = qVar.f7687x;
        u0 u0Var = qVar.M0;
        if (u0Var != null) {
            vVar.g();
            if (qVar.Q == view) {
                if (u0Var.n0(9)) {
                    u0Var.K0();
                    return;
                }
                return;
            }
            if (qVar.P == view) {
                if (u0Var.n0(7)) {
                    u0Var.P();
                    return;
                }
                return;
            }
            if (qVar.S == view) {
                if (u0Var.e0() != 4 && u0Var.n0(12)) {
                    u0Var.L0();
                    return;
                }
                return;
            }
            if (qVar.T == view) {
                if (u0Var.n0(11)) {
                    u0Var.N0();
                    return;
                }
                return;
            }
            if (qVar.R == view) {
                if (u1.a0.a0(u0Var, qVar.Q0)) {
                    u1.a0.H(u0Var);
                    return;
                } else {
                    if (u0Var.n0(1)) {
                        u0Var.pause();
                        return;
                    }
                    return;
                }
            }
            if (qVar.W == view) {
                if (u0Var.n0(15)) {
                    int x02 = u0Var.x0();
                    int i6 = qVar.W0;
                    for (int i10 = 1; i10 <= 2; i10++) {
                        int i11 = (x02 + i10) % 3;
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 == 2 && (i6 & 2) != 0) {
                                }
                            } else if ((i6 & 1) == 0) {
                            }
                        }
                        x02 = i11;
                    }
                    u0Var.p0(x02);
                    return;
                }
                return;
            }
            if (qVar.f7663a0 == view) {
                if (u0Var.n0(14)) {
                    u0Var.q(!u0Var.F0());
                    return;
                }
                return;
            }
            if (view4 == view) {
                vVar.f();
                qVar.e(qVar.I, view4);
                return;
            }
            if (view3 == view) {
                vVar.f();
                qVar.e(qVar.J, view3);
            } else if (view2 == view) {
                vVar.f();
                qVar.e(qVar.L, view2);
            } else if (imageView == view) {
                vVar.f();
                qVar.e(qVar.K, imageView);
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        q qVar = this.f7643x;
        if (qVar.c1) {
            qVar.f7687x.g();
        }
    }

    @Override // r1.s0
    public final void t(r0 r0Var) {
        r1.o oVar = r0Var.f11687a;
        boolean a10 = oVar.a(4, 5, 13);
        q qVar = this.f7643x;
        if (a10) {
            qVar.q();
        }
        if (oVar.a(4, 5, 7, 13)) {
            qVar.s();
        }
        if (oVar.a(8, 13)) {
            qVar.t();
        }
        if (oVar.a(9, 13)) {
            qVar.v();
        }
        if (oVar.a(8, 9, 11, 0, 16, 17, 13)) {
            qVar.p();
        }
        if (oVar.a(11, 0, 13)) {
            qVar.w();
        }
        if (oVar.a(12, 13)) {
            qVar.r();
        }
        if (oVar.a(2, 13)) {
            qVar.x();
        }
    }

    @Override // r1.s0
    public final /* synthetic */ void F() {
    }

    @Override // r1.s0
    public final /* synthetic */ void C(r1.d dVar) {
    }

    @Override // r1.s0
    public final /* synthetic */ void D(n0 n0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void E(r1.j0 j0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void G(List list) {
    }

    @Override // r1.s0
    public final /* synthetic */ void J(o0 o0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void O(n0 n0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void P(r1.h0 h0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void Q(boolean z10) {
    }

    @Override // r1.s0
    public final /* synthetic */ void a(int i6) {
    }

    @Override // r1.s0
    public final /* synthetic */ void b(p1 p1Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void c(int i6) {
    }

    @Override // r1.s0
    public final /* synthetic */ void d(boolean z10) {
    }

    @Override // r1.s0
    public final /* synthetic */ void e(int i6) {
    }

    @Override // r1.s0
    public final /* synthetic */ void f(boolean z10) {
    }

    @Override // r1.s0
    public final /* synthetic */ void g(int i6) {
    }

    @Override // r1.s0
    public final /* synthetic */ void i(l1 l1Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void k(j1 j1Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void m(boolean z10) {
    }

    @Override // r1.s0
    public final /* synthetic */ void p(q0 q0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void q(float f3) {
    }

    @Override // r1.s0
    public final /* synthetic */ void r(int i6) {
    }

    @Override // r1.s0
    public final /* synthetic */ void s(r1.h0 h0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void x(boolean z10) {
    }

    @Override // r1.s0
    public final /* synthetic */ void y(t1.c cVar) {
    }

    @Override // r1.s0
    public final /* synthetic */ void A(int i6, r1.e0 e0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void H(int i6, boolean z10) {
    }

    @Override // r1.s0
    public final /* synthetic */ void N(int i6, int i10) {
    }

    @Override // r1.s0
    public final /* synthetic */ void h(d1 d1Var, int i6) {
    }

    @Override // r1.s0
    public final /* synthetic */ void o(int i6, boolean z10) {
    }

    @Override // r1.s0
    public final /* synthetic */ void I(int i6, t0 t0Var, t0 t0Var2) {
    }
}
