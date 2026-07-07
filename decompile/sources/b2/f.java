package b2;

import a2.q;
import a2.t;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.unity3d.services.UnityAdsConstants;
import db.h1;
import db.k0;
import java.io.IOException;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import q2.c0;
import q2.i0;
import q2.u;
import r1.a1;
import r1.c1;
import r1.d1;
import r1.e0;
import r1.h0;
import r1.j0;
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
import u1.a0;
import u1.o;
import u1.v;
import u1.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements s0, i0, f2.m {
    public final androidx.lifecycle.d A;
    public final SparseArray B;
    public o C;
    public u0 D;
    public x E;
    public boolean F;

    /* renamed from: x, reason: collision with root package name */
    public final v f1361x;

    /* renamed from: y, reason: collision with root package name */
    public final a1 f1362y;

    /* renamed from: z, reason: collision with root package name */
    public final c1 f1363z;

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.d, java.lang.Object] */
    public f(v vVar) {
        vVar.getClass();
        this.f1361x = vVar;
        String str = a0.f12750a;
        Looper myLooper = Looper.myLooper();
        this.C = new o(myLooper == null ? Looper.getMainLooper() : myLooper, vVar, new t(15));
        a1 a1Var = new a1();
        this.f1362y = a1Var;
        this.f1363z = new c1();
        ?? obj = new Object();
        obj.f896a = a1Var;
        db.i0 i0Var = k0.f4008y;
        obj.f897b = db.c1.B;
        obj.f898c = h1.D;
        this.A = obj;
        this.B = new SparseArray();
    }

    @Override // r1.s0
    public final void A(int i6, e0 e0Var) {
        W(R(), 1, new c(27));
    }

    @Override // f2.m
    public final void B(int i6, c0 c0Var, int i10) {
        W(U(i6, c0Var), 1022, new c(4));
    }

    @Override // r1.s0
    public final void C(r1.d dVar) {
        W(V(), 20, new c(17));
    }

    @Override // r1.s0
    public final void D(n0 n0Var) {
        a R;
        c0 c0Var;
        if ((n0Var instanceof q) && (c0Var = ((q) n0Var).L) != null) {
            R = S(c0Var);
        } else {
            R = R();
        }
        W(R, 10, new a2.e0(R, n0Var, 8));
    }

    @Override // r1.s0
    public final void E(j0 j0Var) {
        W(R(), 28, new t(6));
    }

    @Override // r1.s0
    public final void G(List list) {
        a R = R();
        W(R, 27, new a2.i0(R, list));
    }

    @Override // r1.s0
    public final void H(int i6, boolean z10) {
        W(R(), -1, new t(5));
    }

    @Override // r1.s0
    public final void I(int i6, t0 t0Var, t0 t0Var2) {
        if (i6 == 1) {
            this.F = false;
        }
        u0 u0Var = this.D;
        u0Var.getClass();
        androidx.lifecycle.d dVar = this.A;
        dVar.f899d = androidx.lifecycle.d.g(u0Var, (k0) dVar.f897b, (c0) dVar.f900e, (a1) dVar.f896a);
        a R = R();
        W(R, 11, new a2.a0(R, i6, t0Var, t0Var2));
    }

    @Override // r1.s0
    public final void J(o0 o0Var) {
        W(R(), 12, new t(4));
    }

    @Override // f2.m
    public final void K(int i6, c0 c0Var, Exception exc) {
        W(U(i6, c0Var), 1024, new c(5));
    }

    @Override // q2.i0
    public final void L(int i6, c0 c0Var, u uVar, n2.g gVar) {
        W(U(i6, c0Var), 1002, new c(2));
    }

    @Override // q2.i0
    public final void M(int i6, c0 c0Var, n2.g gVar) {
        a U = U(i6, c0Var);
        W(U, 1004, new b(1, U, gVar));
    }

    @Override // r1.s0
    public final void N(int i6, int i10) {
        W(V(), 24, new t(23));
    }

    @Override // r1.s0
    public final void O(n0 n0Var) {
        a R;
        c0 c0Var;
        if ((n0Var instanceof q) && (c0Var = ((q) n0Var).L) != null) {
            R = S(c0Var);
        } else {
            R = R();
        }
        W(R, 10, new t(11));
    }

    @Override // r1.s0
    public final void P(h0 h0Var) {
        W(R(), 15, new c(20));
    }

    @Override // r1.s0
    public final void Q(boolean z10) {
        W(R(), 7, new t(7));
    }

    public final a R() {
        return S((c0) this.A.f899d);
    }

    public final a S(c0 c0Var) {
        d1 d1Var;
        this.D.getClass();
        if (c0Var == null) {
            d1Var = null;
        } else {
            d1Var = (d1) ((db.n0) this.A.f898c).get(c0Var);
        }
        if (c0Var != null && d1Var != null) {
            return T(d1Var, d1Var.g(c0Var.f10834a, this.f1362y).f11297c, c0Var);
        }
        int m02 = this.D.m0();
        d1 y02 = this.D.y0();
        if (m02 >= y02.o()) {
            y02 = d1.f11368a;
        }
        return T(y02, m02, null);
    }

    public final a T(d1 d1Var, int i6, c0 c0Var) {
        c0 c0Var2;
        boolean z10;
        if (d1Var.p()) {
            c0Var2 = null;
        } else {
            c0Var2 = c0Var;
        }
        this.f1361x.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (d1Var.equals(this.D.y0()) && i6 == this.D.m0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j = 0;
        if (c0Var2 != null && c0Var2.b()) {
            if (z10 && this.D.k0() == c0Var2.f10835b && this.D.I() == c0Var2.f10836c) {
                j = this.D.getCurrentPosition();
            }
        } else if (z10) {
            j = this.D.Y();
        } else if (!d1Var.p()) {
            j = a0.e0(d1Var.m(i6, this.f1363z, 0L).f11337l);
        }
        return new a(elapsedRealtime, d1Var, i6, c0Var2, j, this.D.y0(), this.D.m0(), (c0) this.A.f899d, this.D.getCurrentPosition(), this.D.j());
    }

    public final a U(int i6, c0 c0Var) {
        this.D.getClass();
        if (c0Var != null) {
            if (((d1) ((db.n0) this.A.f898c).get(c0Var)) != null) {
                return S(c0Var);
            }
            return T(d1.f11368a, i6, c0Var);
        }
        d1 y02 = this.D.y0();
        if (i6 >= y02.o()) {
            y02 = d1.f11368a;
        }
        return T(y02, i6, null);
    }

    public final a V() {
        return S((c0) this.A.f901f);
    }

    public final void W(a aVar, int i6, u1.l lVar) {
        this.B.put(i6, aVar);
        this.C.e(i6, lVar);
    }

    public final void X(a2.n0 n0Var, Looper looper) {
        boolean z10;
        if (this.D != null && !((k0) this.A.f897b).isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        u1.c.g(z10);
        n0Var.getClass();
        this.D = n0Var;
        this.E = this.f1361x.a(looper, null);
        o oVar = this.C;
        b bVar = new b(0, this, n0Var);
        this.C = new o(oVar.f12787d, looper, oVar.f12784a, bVar, oVar.f12792i);
    }

    @Override // r1.s0
    public final void a(int i6) {
        W(V(), 21, new c(8));
    }

    @Override // r1.s0
    public final void b(p1 p1Var) {
        a V = V();
        W(V, 25, new a2.j0(V, p1Var));
    }

    @Override // r1.s0
    public final void c(int i6) {
        W(R(), 8, new t(18));
    }

    @Override // r1.s0
    public final void d(boolean z10) {
        W(V(), 23, new c(23));
    }

    @Override // r1.s0
    public final void e(int i6) {
        W(R(), 6, new t(9));
    }

    @Override // r1.s0
    public final void h(d1 d1Var, int i6) {
        u0 u0Var = this.D;
        u0Var.getClass();
        androidx.lifecycle.d dVar = this.A;
        dVar.f899d = androidx.lifecycle.d.g(u0Var, (k0) dVar.f897b, (c0) dVar.f900e, (a1) dVar.f896a);
        dVar.n(u0Var.y0());
        W(R(), 0, new c(26));
    }

    @Override // r1.s0
    public final void i(l1 l1Var) {
        W(R(), 2, new t(14));
    }

    @Override // q2.i0
    public final void j(int i6, c0 c0Var, u uVar, n2.g gVar, IOException iOException, boolean z10) {
        a U = U(i6, c0Var);
        W(U, 1003, new a2.e0(U, uVar, gVar, iOException, z10));
    }

    @Override // r1.s0
    public final void k(j1 j1Var) {
        W(R(), 19, new t(25));
    }

    @Override // f2.m
    public final void l(int i6, c0 c0Var) {
        W(U(i6, c0Var), 1027, new c(13));
    }

    @Override // r1.s0
    public final void m(boolean z10) {
        W(R(), 3, new c(9));
    }

    @Override // f2.m
    public final void n(int i6, c0 c0Var) {
        W(U(i6, c0Var), 1025, new c(19));
    }

    @Override // r1.s0
    public final void o(int i6, boolean z10) {
        W(R(), 5, new t(12));
    }

    @Override // r1.s0
    public final void p(q0 q0Var) {
        W(R(), 13, new c(25));
    }

    @Override // r1.s0
    public final void q(float f3) {
        W(V(), 22, new c(15));
    }

    @Override // r1.s0
    public final void r(int i6) {
        W(R(), 4, new t(16));
    }

    @Override // r1.s0
    public final void s(h0 h0Var) {
        W(R(), 14, new t(29));
    }

    @Override // q2.i0
    public final void u(int i6, c0 c0Var, u uVar, n2.g gVar, int i10) {
        W(U(i6, c0Var), UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, new t(24));
    }

    @Override // q2.i0
    public final void v(int i6, c0 c0Var, u uVar, n2.g gVar) {
        W(U(i6, c0Var), WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, new c(6));
    }

    @Override // q2.i0
    public final void w(int i6, c0 c0Var, n2.g gVar) {
        W(U(i6, c0Var), WebSocketProtocol.CLOSE_NO_STATUS_CODE, new c(12));
    }

    @Override // r1.s0
    public final void x(boolean z10) {
        W(R(), 9, new t(22));
    }

    @Override // r1.s0
    public final void y(t1.c cVar) {
        W(R(), 27, new t(21));
    }

    @Override // f2.m
    public final void z(int i6, c0 c0Var) {
        W(U(i6, c0Var), 1023, new c(21));
    }

    @Override // r1.s0
    public final void F() {
    }

    @Override // r1.s0
    public final void f(boolean z10) {
    }

    @Override // r1.s0
    public final void g(int i6) {
    }

    @Override // r1.s0
    public final void t(r0 r0Var) {
    }
}
