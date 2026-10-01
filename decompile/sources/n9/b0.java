package n9;

import android.os.Bundle;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b0 extends c0 {
    public final v.e A;
    public long B;

    /* renamed from: z, reason: collision with root package name */
    public final v.e f9182z;

    /* JADX WARN: Type inference failed for: r2v1, types: [v.l, v.e] */
    /* JADX WARN: Type inference failed for: r2v2, types: [v.l, v.e] */
    public b0(n1 n1Var) {
        super(n1Var);
        this.A = new v.l(0);
        this.f9182z = new v.l(0);
    }

    public final void e1(String str, long j) {
        n1 n1Var = (n1) this.f4301y;
        if (str != null && str.length() != 0) {
            l1 l1Var = n1Var.D;
            n1.g(l1Var);
            l1Var.m1(new a(this, str, j, 0));
        } else {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.D.a("Ad unit id must be a non-empty string");
        }
    }

    public final void f1(String str, long j) {
        n1 n1Var = (n1) this.f4301y;
        if (str != null && str.length() != 0) {
            l1 l1Var = n1Var.D;
            n1.g(l1Var);
            l1Var.m1(new a(this, str, j, 1));
        } else {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.D.a("Ad unit id must be a non-empty string");
        }
    }

    public final void g1(long j) {
        x2 x2Var = ((n1) this.f4301y).I;
        n1.f(x2Var);
        u2 j12 = x2Var.j1(false);
        v.e eVar = this.f9182z;
        Iterator it = ((v.b) eVar.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            i1(str, j - ((Long) eVar.get(str)).longValue(), j12);
        }
        if (!eVar.isEmpty()) {
            h1(j - this.B, j12);
        }
        j1(j);
    }

    public final void h1(long j, u2 u2Var) {
        n1 n1Var = (n1) this.f4301y;
        if (u2Var == null) {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.L.a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            u0 u0Var2 = n1Var.C;
            n1.g(u0Var2);
            u0Var2.L.b(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            j4.V1(u2Var, bundle, true);
            m2 m2Var = n1Var.J;
            n1.f(m2Var);
            m2Var.k1("am", "_xa", bundle);
        }
    }

    public final void i1(String str, long j, u2 u2Var) {
        n1 n1Var = (n1) this.f4301y;
        if (u2Var == null) {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.L.a("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                u0 u0Var2 = n1Var.C;
                n1.g(u0Var2);
                u0Var2.L.b(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            j4.V1(u2Var, bundle, true);
            m2 m2Var = n1Var.J;
            n1.f(m2Var);
            m2Var.k1("am", "_xu", bundle);
        }
    }

    public final void j1(long j) {
        v.e eVar = this.f9182z;
        Iterator it = ((v.b) eVar.keySet()).iterator();
        while (it.hasNext()) {
            eVar.put((String) it.next(), Long.valueOf(j));
        }
        if (!eVar.isEmpty()) {
            this.B = j;
        }
    }
}
