package c3;

import android.content.Context;
import c2.j0;
import d6.h;
import g1.g;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import k8.n1;
import k8.p1;
import k8.v0;
import k8.z1;
import sb.p;
import t0.o1;
import t0.y0;
import t1.n0;
import t1.r0;
import t1.s0;
import t1.z;
import t7.y;
import v6.m;
import w1.b0;
import y9.f0;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements z1, p5.e, n0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2052v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f2053w;

    public /* synthetic */ e(int i, Object obj) {
        this.f2052v = i;
        this.f2053w = obj;
    }

    public void A(int i, long j8) {
        j0 j0Var = (j0) this;
        long jL = j0Var.L() + j8;
        long jQ = j0Var.Q();
        if (jQ != -9223372036854775807L) {
            jL = Math.min(jL, jQ);
        }
        y(j0Var.K(), Math.max(jL, 0L), false);
    }

    public void B() {
        int iK;
        int iK2;
        int iK3;
        j0 j0Var = (j0) this;
        if (j0Var.N().p() || j0Var.V()) {
            m();
            return;
        }
        s0 s0VarN = j0Var.N();
        if (s0VarN.p()) {
            iK = -1;
        } else {
            int iK4 = j0Var.K();
            j0Var.q0();
            int i = j0Var.f1781c0;
            if (i == 1) {
                i = 0;
            }
            j0Var.q0();
            iK = s0VarN.k(iK4, i, j0Var.f1782d0);
        }
        boolean z2 = iK != -1;
        if (p() && !q()) {
            if (!z2) {
                m();
                return;
            }
            s0 s0VarN2 = j0Var.N();
            if (s0VarN2.p()) {
                iK3 = -1;
            } else {
                int iK5 = j0Var.K();
                j0Var.q0();
                int i10 = j0Var.f1781c0;
                if (i10 == 1) {
                    i10 = 0;
                }
                j0Var.q0();
                iK3 = s0VarN2.k(iK5, i10, j0Var.f1782d0);
            }
            if (iK3 == -1) {
                m();
                return;
            } else if (iK3 == j0Var.K()) {
                y(j0Var.K(), -9223372036854775807L, true);
                return;
            } else {
                y(iK3, -9223372036854775807L, false);
                return;
            }
        }
        if (z2) {
            long jL = j0Var.L();
            j0Var.q0();
            if (jL <= j0Var.T) {
                s0 s0VarN3 = j0Var.N();
                if (s0VarN3.p()) {
                    iK2 = -1;
                } else {
                    int iK6 = j0Var.K();
                    j0Var.q0();
                    int i11 = j0Var.f1781c0;
                    if (i11 == 1) {
                        i11 = 0;
                    }
                    j0Var.q0();
                    iK2 = s0VarN3.k(iK6, i11, j0Var.f1782d0);
                }
                if (iK2 == -1) {
                    m();
                    return;
                } else if (iK2 == j0Var.K()) {
                    y(j0Var.K(), -9223372036854775807L, true);
                    return;
                } else {
                    y(iK2, -9223372036854775807L, false);
                    return;
                }
            }
        }
        y(j0Var.K(), 0L, false);
    }

    public void C(z zVar) {
        z0 z0VarQ = f0.q(zVar);
        j0 j0Var = (j0) this;
        j0Var.q0();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < z0VarQ.f14639y; i++) {
            arrayList.add(j0Var.N.d((z) z0VarQ.get(i)));
        }
        j0Var.f0(arrayList);
    }

    public void D() {
        n1 n1Var = ((p1) this.f2053w).B;
        p1.l(n1Var);
        n1Var.D();
    }

    @Override // k8.z1
    public oa.b a() {
        throw null;
    }

    @Override // k8.z1
    public v0 c() {
        throw null;
    }

    @Override // k8.z1
    public n1 d() {
        throw null;
    }

    @Override // k8.z1
    public Context e() {
        throw null;
    }

    @Override // k8.z1
    public x7.a g() {
        throw null;
    }

    @Override // p5.e
    public List h() {
        return (List) this.f2053w;
    }

    @Override // p5.e
    public boolean i() {
        List list = (List) this.f2053w;
        return list.isEmpty() || (list.size() == 1 && ((w5.a) list.get(0)).c());
    }

    public abstract void j(p pVar);

    public abstract String k();

    public long l() {
        j0 j0Var = (j0) this;
        s0 s0VarN = j0Var.N();
        if (s0VarN.p()) {
            return -9223372036854775807L;
        }
        return b0.Y(s0VarN.m(j0Var.K(), (r0) this.f2053w, 0L).f12105m);
    }

    public void m() {
        ((j0) this).q0();
    }

    public boolean n(int i) {
        j0 j0Var = (j0) this;
        j0Var.q0();
        return j0Var.f1790l0.f12012a.f12018a.get(i);
    }

    public boolean o() {
        j0 j0Var = (j0) this;
        s0 s0VarN = j0Var.N();
        return !s0VarN.p() && s0VarN.m(j0Var.K(), (r0) this.f2053w, 0L).i;
    }

    public boolean p() {
        j0 j0Var = (j0) this;
        s0 s0VarN = j0Var.N();
        return !s0VarN.p() && s0VarN.m(j0Var.K(), (r0) this.f2053w, 0L).a();
    }

    public boolean q() {
        j0 j0Var = (j0) this;
        s0 s0VarN = j0Var.N();
        return !s0VarN.p() && s0VarN.m(j0Var.K(), (r0) this.f2053w, 0L).f12101h;
    }

    public void r(h hVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f2053w;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(hVar);
        }
    }

    public abstract void s(y0 y0Var);

    public abstract void t(y0 y0Var);

    public String toString() {
        switch (this.f2052v) {
            case g.LONG_FIELD_NUMBER /* 4 */:
                StringBuilder sb2 = new StringBuilder();
                List list = (List) this.f2053w;
                if (!list.isEmpty()) {
                    sb2.append("values=");
                    sb2.append(Arrays.toString(list.toArray()));
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public abstract o1 u(o1 o1Var, List list);

    public abstract p2.c v(y0 y0Var, p2.c cVar);

    public void w() {
        ((j0) this).h0(false);
    }

    public void x() {
        ((j0) this).h0(true);
    }

    public abstract void y(int i, long j8, boolean z2);

    public void z() {
        int iE;
        int iE2;
        j0 j0Var = (j0) this;
        if (j0Var.N().p() || j0Var.V()) {
            m();
            return;
        }
        s0 s0VarN = j0Var.N();
        if (s0VarN.p()) {
            iE = -1;
        } else {
            int iK = j0Var.K();
            j0Var.q0();
            int i = j0Var.f1781c0;
            if (i == 1) {
                i = 0;
            }
            j0Var.q0();
            iE = s0VarN.e(iK, i, j0Var.f1782d0);
        }
        if (!(iE != -1)) {
            if (p() && o()) {
                y(j0Var.K(), -9223372036854775807L, false);
                return;
            } else {
                m();
                return;
            }
        }
        s0 s0VarN2 = j0Var.N();
        if (s0VarN2.p()) {
            iE2 = -1;
        } else {
            int iK2 = j0Var.K();
            j0Var.q0();
            int i10 = j0Var.f1781c0;
            if (i10 == 1) {
                i10 = 0;
            }
            j0Var.q0();
            iE2 = s0VarN2.e(iK2, i10, j0Var.f1782d0);
        }
        if (iE2 == -1) {
            m();
        } else if (iE2 == j0Var.K()) {
            y(j0Var.K(), -9223372036854775807L, true);
        } else {
            y(iE2, -9223372036854775807L, false);
        }
    }

    public /* synthetic */ e(int i, boolean z2) {
        this.f2052v = i;
    }

    public e(p1 p1Var) {
        this.f2052v = 3;
        y.g(p1Var);
        this.f2053w = p1Var;
    }

    public e(int i) {
        this.f2052v = i;
        switch (i) {
            case g.STRING_FIELD_NUMBER /* 5 */:
                this.f2053w = new LinkedHashMap();
                break;
            case g.STRING_SET_FIELD_NUMBER /* 6 */:
            default:
                char[] cArr = m.f13232a;
                this.f2053w = new ArrayDeque(20);
                break;
            case g.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f2053w = new r0();
                break;
        }
    }
}
