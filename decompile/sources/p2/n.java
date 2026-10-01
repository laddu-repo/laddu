package p2;

import o2.b1;
import t1.o;
import w2.g0;
import y1.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n extends a {
    public final int J;
    public final o K;
    public long L;
    public boolean M;

    public n(y1.h hVar, y1.k kVar, o oVar, int i, Object obj, long j8, long j9, long j10, int i10, o oVar2) {
        super(hVar, kVar, oVar, i, obj, j8, j9, -9223372036854775807L, -9223372036854775807L, j10);
        this.J = i10;
        this.K = oVar2;
    }

    @Override // p2.l
    public final boolean b() {
        return this.M;
    }

    @Override // s2.k
    public final void c() {
        y yVar = this.D;
        c cVar = this.H;
        w1.a.k(cVar);
        for (b1 b1Var : (b1[]) cVar.f10197x) {
            if (b1Var.F != 0) {
                b1Var.F = 0L;
                b1Var.f9395z = true;
            }
        }
        g0 g0VarQ = cVar.q(this.J);
        g0VarQ.c(this.K);
        try {
            long jH = yVar.h(this.f10209w.c(this.L));
            if (jH != -1) {
                jH += this.L;
            }
            w2.l lVar = new w2.l(this.D, this.L, jH);
            for (int iE = 0; iE != -1; iE = g0VarQ.e(lVar, Integer.MAX_VALUE, true)) {
                this.L += (long) iE;
            }
            g0VarQ.a(this.B, 1, (int) this.L, 0, null);
            android.support.v4.media.session.b.e(yVar);
            this.M = true;
        } catch (Throwable th) {
            android.support.v4.media.session.b.e(yVar);
            throw th;
        }
    }

    @Override // s2.k
    public final void j() {
    }
}
