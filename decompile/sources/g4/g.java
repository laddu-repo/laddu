package g4;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import java.util.List;
import t1.d1;
import t1.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g implements t1.l0, View.OnClickListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f5505v;

    public g(r rVar) {
        this.f5505v = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        r rVar = this.f5505v;
        ImageView imageView = rVar.R;
        View view2 = rVar.W;
        View view3 = rVar.V;
        View view4 = rVar.U;
        w wVar = rVar.f5581v;
        t1.n0 n0Var = rVar.C0;
        if (n0Var == null) {
            return;
        }
        wVar.g();
        if (rVar.I == view) {
            c3.e eVar = (c3.e) n0Var;
            if (eVar.n(9)) {
                eVar.z();
                return;
            }
            return;
        }
        if (rVar.H == view) {
            c3.e eVar2 = (c3.e) n0Var;
            if (eVar2.n(7)) {
                eVar2.B();
                return;
            }
            return;
        }
        if (rVar.K == view) {
            if (((c2.j0) n0Var).S() != 4) {
                c3.e eVar3 = (c3.e) n0Var;
                if (eVar3.n(12)) {
                    c2.j0 j0Var = (c2.j0) eVar3;
                    j0Var.q0();
                    eVar3.A(12, j0Var.S);
                    return;
                }
                return;
            }
            return;
        }
        if (rVar.L == view) {
            c3.e eVar4 = (c3.e) n0Var;
            if (eVar4.n(11)) {
                c2.j0 j0Var2 = (c2.j0) eVar4;
                j0Var2.q0();
                eVar4.A(11, -j0Var2.R);
                return;
            }
            return;
        }
        if (rVar.J == view) {
            if (w1.b0.W(n0Var, rVar.H0)) {
                w1.b0.E(n0Var);
                return;
            }
            c3.e eVar5 = (c3.e) n0Var;
            if (eVar5.n(1)) {
                eVar5.w();
                return;
            }
            return;
        }
        if (rVar.O == view) {
            if (((c3.e) n0Var).n(15)) {
                c2.j0 j0Var3 = (c2.j0) n0Var;
                j0Var3.q0();
                int i = j0Var3.f1781c0;
                int i10 = rVar.M0;
                for (int i11 = 1; i11 <= 2; i11++) {
                    int i12 = (i + i11) % 3;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 != 2 || (i10 & 2) == 0) {
                            }
                        } else if ((i10 & 1) == 0) {
                        }
                    }
                    i = i12;
                }
                j0Var3.i0(i);
                return;
            }
            return;
        }
        if (rVar.P != view) {
            if (view4 == view) {
                wVar.f();
                rVar.e(rVar.A, view4);
                return;
            }
            if (view3 == view) {
                wVar.f();
                rVar.e(rVar.B, view3);
                return;
            } else if (view2 == view) {
                wVar.f();
                rVar.e(rVar.D, view2);
                return;
            } else {
                if (imageView == view) {
                    wVar.f();
                    rVar.e(rVar.C, imageView);
                    return;
                }
                return;
            }
        }
        if (((c3.e) n0Var).n(14)) {
            c2.j0 j0Var4 = (c2.j0) n0Var;
            j0Var4.q0();
            boolean z2 = !j0Var4.f1782d0;
            w1.p pVar = j0Var4.I;
            j0Var4.q0();
            if (j0Var4.f1782d0 != z2) {
                j0Var4.f1782d0 = z2;
                w1.x xVar = j0Var4.H.C;
                xVar.getClass();
                w1.w wVarB = w1.x.b();
                wVarB.f13745a = xVar.f13747a.obtainMessage(12, z2 ? 1 : 0, 0);
                wVarB.b();
                pVar.c(9, new c2.a0(0, z2));
                j0Var4.m0();
                pVar.b();
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        r rVar = this.f5505v;
        if (rVar.S0) {
            rVar.f5581v.g();
        }
    }

    @Override // t1.l0
    public final void z(t1.k0 k0Var) {
        boolean zA = k0Var.a(4, 5, 13);
        r rVar = this.f5505v;
        if (zA) {
            rVar.m();
        }
        if (k0Var.a(4, 5, 7, 13)) {
            rVar.o();
        }
        if (k0Var.a(8, 13)) {
            rVar.p();
        }
        if (k0Var.a(9, 13)) {
            rVar.r();
        }
        if (k0Var.a(8, 9, 11, 0, 16, 17, 13)) {
            rVar.l();
        }
        if (k0Var.a(11, 0, 13)) {
            rVar.s();
        }
        if (k0Var.a(12, 13)) {
            rVar.n();
        }
        if (k0Var.a(2, 13)) {
            rVar.t();
        }
    }

    @Override // t1.l0
    public final /* synthetic */ void n() {
    }

    @Override // t1.l0
    public final /* synthetic */ void A(boolean z2) {
    }

    @Override // t1.l0
    public final /* synthetic */ void D(t1.h0 h0Var) {
    }

    @Override // t1.l0
    public final /* synthetic */ void E(t1.j0 j0Var) {
    }

    @Override // t1.l0
    public final /* synthetic */ void G(t1.e0 e0Var) {
    }

    @Override // t1.l0
    public final /* synthetic */ void I(v1.c cVar) {
    }

    @Override // t1.l0
    public final /* synthetic */ void K(t1.c0 c0Var) {
    }

    @Override // t1.l0
    public final /* synthetic */ void L(boolean z2) {
    }

    @Override // t1.l0
    public final /* synthetic */ void a(boolean z2) {
    }

    @Override // t1.l0
    public final /* synthetic */ void b(d1 d1Var) {
    }

    @Override // t1.l0
    public final /* synthetic */ void c(int i) {
    }

    @Override // t1.l0
    public final /* synthetic */ void e(int i) {
    }

    @Override // t1.l0
    public final /* synthetic */ void g(int i) {
    }

    @Override // t1.l0
    public final /* synthetic */ void j(int i) {
    }

    @Override // t1.l0
    public final /* synthetic */ void m(boolean z2) {
    }

    @Override // t1.l0
    public final /* synthetic */ void o(t1.h0 h0Var) {
    }

    @Override // t1.l0
    public final /* synthetic */ void p(List list) {
    }

    @Override // t1.l0
    public final /* synthetic */ void t(t1.x0 x0Var) {
    }

    @Override // t1.l0
    public final /* synthetic */ void u(float f) {
    }

    @Override // t1.l0
    public final /* synthetic */ void w(int i) {
    }

    @Override // t1.l0
    public final /* synthetic */ void x(z0 z0Var) {
    }

    @Override // t1.l0
    public final /* synthetic */ void y(t1.i0 i0Var) {
    }

    @Override // t1.l0
    public final /* synthetic */ void B(int i, int i10) {
    }

    @Override // t1.l0
    public final /* synthetic */ void C(t1.z zVar, int i) {
    }

    @Override // t1.l0
    public final /* synthetic */ void q(int i, boolean z2) {
    }

    @Override // t1.l0
    public final /* synthetic */ void s(int i, boolean z2) {
    }

    @Override // t1.l0
    public final /* synthetic */ void J(int i, t1.m0 m0Var, t1.m0 m0Var2) {
    }
}
