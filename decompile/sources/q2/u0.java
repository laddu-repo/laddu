package q2;

import android.net.Uri;
import android.os.Looper;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u0 extends a {
    public final w1.g E;
    public final j2.u F;
    public final f2.o G;
    public final o5.e0 H;
    public final int I;
    public final r1.q J;
    public boolean K = true;
    public long L = -9223372036854775807L;
    public boolean M;
    public boolean N;
    public w1.a0 O;
    public r1.e0 P;

    public u0(r1.e0 e0Var, w1.g gVar, j2.u uVar, f2.o oVar, o5.e0 e0Var2, int i6, r1.q qVar) {
        this.P = e0Var;
        this.E = gVar;
        this.F = uVar;
        this.G = oVar;
        this.H = e0Var2;
        this.I = i6;
        this.J = qVar;
    }

    @Override // q2.a
    public final boolean a(r1.e0 e0Var) {
        r1.a0 a0Var = i().f11379b;
        a0Var.getClass();
        r1.a0 a0Var2 = e0Var.f11379b;
        if (a0Var2 != null && a0Var2.f11283a.equals(a0Var.f11283a) && a0Var2.f11290h == a0Var.f11290h && Objects.equals(a0Var2.f11288f, a0Var.f11288f)) {
            return true;
        }
        return false;
    }

    @Override // q2.a
    public final a0 c(c0 c0Var, u2.e eVar, long j) {
        w1.h c10 = this.E.c();
        w1.a0 a0Var = this.O;
        if (a0Var != null) {
            c10.q(a0Var);
        }
        r1.a0 a0Var2 = i().f11379b;
        a0Var2.getClass();
        Uri uri = a0Var2.f11283a;
        u1.c.h(this.D);
        return new s0(uri, c10, new n9.j((y2.r) this.F.f7139y), this.G, new f2.l(this.A.f4677c, 0, c0Var), this.H, b(c0Var), this, eVar, a0Var2.f11288f, this.I, this.J, u1.a0.Q(a0Var2.f11290h), null);
    }

    @Override // q2.a
    public final synchronized r1.e0 i() {
        return this.P;
    }

    @Override // q2.a
    public final void n(w1.a0 a0Var) {
        this.O = a0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        b2.m mVar = this.D;
        u1.c.h(mVar);
        f2.o oVar = this.G;
        oVar.n(myLooper, mVar);
        oVar.c();
        w();
    }

    @Override // q2.a
    public final void q(a0 a0Var) {
        s0 s0Var = (s0) a0Var;
        if (s0Var.U) {
            for (y0 y0Var : s0Var.R) {
                y0Var.k();
                f2.i iVar = y0Var.f10994h;
                if (iVar != null) {
                    iVar.d(y0Var.f10991e);
                    y0Var.f10994h = null;
                    y0Var.f10993g = null;
                }
            }
        }
        s0Var.J.e(s0Var);
        s0Var.O.removeCallbacksAndMessages(null);
        s0Var.P = null;
        s0Var.f10957m0 = true;
    }

    @Override // q2.a
    public final void s() {
        this.G.a();
    }

    @Override // q2.a
    public final synchronized void v(r1.e0 e0Var) {
        this.P = e0Var;
    }

    public final void w() {
        r1.d1 d1Var = new d1(this.L, this.M, this.N, i());
        if (this.K) {
            d1Var = new m2.t(d1Var, 1);
        }
        p(d1Var);
    }

    public final void x(long j, y2.z zVar, boolean z10) {
        if (j == -9223372036854775807L) {
            j = this.L;
        }
        boolean g10 = zVar.g();
        if (!this.K && this.L == j && this.M == g10 && this.N == z10) {
            return;
        }
        this.L = j;
        this.M = g10;
        this.N = z10;
        this.K = false;
        w();
    }

    @Override // q2.a
    public final void l() {
    }
}
