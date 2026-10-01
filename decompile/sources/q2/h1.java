package q2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h1 extends a {
    public final w1.l E;
    public final w1.g F;
    public final r1.q G;
    public final o5.e0 I;
    public final d1 K;
    public final r1.e0 L;
    public w1.a0 M;
    public final long H = -9223372036854775807L;
    public final boolean J = true;

    /* JADX WARN: Type inference failed for: r15v0, types: [r1.w, r1.x] */
    public h1(r1.d0 d0Var, w1.g gVar, o5.e0 e0Var) {
        e2.t tVar;
        r1.a0 a0Var;
        r1.y yVar;
        this.F = gVar;
        this.I = e0Var;
        boolean z10 = true;
        r1.v vVar = new r1.v();
        f5.b bVar = new f5.b();
        List list = Collections.EMPTY_LIST;
        db.c1 c1Var = db.c1.B;
        e2.t tVar2 = new e2.t();
        r1.b0 b0Var = r1.b0.f11307d;
        Uri uri = Uri.EMPTY;
        String uri2 = d0Var.f11361a.toString();
        uri2.getClass();
        db.k0 k8 = db.k0.k(db.k0.o(d0Var));
        if (((Uri) bVar.f5022e) != null && ((UUID) bVar.f5021d) == null) {
            z10 = false;
        }
        u1.c.g(z10);
        if (uri != null) {
            if (((UUID) bVar.f5021d) != null) {
                yVar = new r1.y(bVar);
            } else {
                yVar = null;
            }
            tVar = tVar2;
            a0Var = new r1.a0(uri, null, yVar, null, list, null, k8, -9223372036854775807L);
        } else {
            tVar = tVar2;
            a0Var = null;
        }
        r1.e0 e0Var2 = new r1.e0(uri2, new r1.w(vVar), a0Var, new r1.z(tVar), r1.h0.K, b0Var);
        this.L = e0Var2;
        r1.p pVar = new r1.p();
        String str = d0Var.f11362b;
        pVar.f11611m = r1.k0.p(str == null ? "text/x-unknown" : str);
        pVar.f11603d = d0Var.f11363c;
        pVar.f11604e = d0Var.f11364d;
        pVar.f11605f = d0Var.f11365e;
        pVar.f11601b = d0Var.f11366f;
        String str2 = d0Var.f11367g;
        pVar.f11600a = str2 != null ? str2 : null;
        this.G = new r1.q(pVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = d0Var.f11361a;
        u1.c.i(uri3, "The uri must be set.");
        this.E = new w1.l(uri3, 1, null, map, 0L, -1L, null, 1);
        this.K = new d1(-9223372036854775807L, true, false, e0Var2);
    }

    @Override // q2.a
    public final a0 c(c0 c0Var, u2.e eVar, long j) {
        return new g1(this.E, this.F, this.M, this.G, this.H, this.I, b(c0Var), this.J, null);
    }

    @Override // q2.a
    public final r1.e0 i() {
        return this.L;
    }

    @Override // q2.a
    public final void n(w1.a0 a0Var) {
        this.M = a0Var;
        p(this.K);
    }

    @Override // q2.a
    public final void q(a0 a0Var) {
        ((g1) a0Var).F.e(null);
    }

    @Override // q2.a
    public final void l() {
    }

    @Override // q2.a
    public final void s() {
    }
}
