package k8;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y extends d0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final v.e f7843x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final v.e f7844y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f7845z;

    public y(p1 p1Var) {
        super(p1Var);
        this.f7844y = new v.e(0);
        this.f7843x = new v.e(0);
    }

    public final void E(String str, long j8) {
        p1 p1Var = (p1) this.f2053w;
        if (str == null || str.length() == 0) {
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.B.a("Ad unit id must be a non-empty string");
        } else {
            n1 n1Var = p1Var.B;
            p1.l(n1Var);
            n1Var.M(new a(this, str, j8, 0));
        }
    }

    public final void F(String str, long j8) {
        p1 p1Var = (p1) this.f2053w;
        if (str == null || str.length() == 0) {
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.B.a("Ad unit id must be a non-empty string");
        } else {
            n1 n1Var = p1Var.B;
            p1.l(n1Var);
            n1Var.M(new a(this, str, j8, 1));
        }
    }

    public final void G(long j8) {
        f3 f3Var = ((p1) this.f2053w).G;
        p1.k(f3Var);
        c3 c3VarH = f3Var.H(false);
        v.e eVar = this.f7843x;
        for (String str : (v.b) eVar.keySet()) {
            I(str, j8 - ((Long) eVar.get(str)).longValue(), c3VarH);
        }
        if (!eVar.isEmpty()) {
            H(j8 - this.f7845z, c3VarH);
        }
        J(j8);
    }

    public final void H(long j8, c3 c3Var) {
        p1 p1Var = (p1) this.f2053w;
        if (c3Var == null) {
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.J.a("Not logging ad exposure. No active activity");
        } else if (j8 < 1000) {
            v0 v0Var2 = p1Var.A;
            p1.l(v0Var2);
            v0Var2.J.b(Long.valueOf(j8), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j8);
            t4.A0(c3Var, bundle, true);
            u2 u2Var = p1Var.H;
            p1.k(u2Var);
            u2Var.K("am", "_xa", bundle);
        }
    }

    public final void I(String str, long j8, c3 c3Var) {
        p1 p1Var = (p1) this.f2053w;
        if (c3Var == null) {
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.J.a("Not logging ad unit exposure. No active activity");
        } else {
            if (j8 < 1000) {
                v0 v0Var2 = p1Var.A;
                p1.l(v0Var2);
                v0Var2.J.b(Long.valueOf(j8), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j8);
            t4.A0(c3Var, bundle, true);
            u2 u2Var = p1Var.H;
            p1.k(u2Var);
            u2Var.K("am", "_xu", bundle);
        }
    }

    public final void J(long j8) {
        v.e eVar = this.f7843x;
        Iterator it = ((v.b) eVar.keySet()).iterator();
        while (it.hasNext()) {
            eVar.put((String) it.next(), Long.valueOf(j8));
        }
        if (eVar.isEmpty()) {
            return;
        }
        this.f7845z = j8;
    }
}
