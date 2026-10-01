package p2;

import o2.b1;
import t1.f0;
import t1.o;
import w1.t;
import w2.g0;
import y1.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j extends a {
    public final int J;
    public final long K;
    public final e L;
    public long M;
    public volatile boolean N;
    public boolean O;

    public j(y1.h hVar, y1.k kVar, o oVar, int i, Object obj, long j8, long j9, long j10, long j11, long j12, int i10, long j13, e eVar) {
        super(hVar, kVar, oVar, i, obj, j8, j9, j10, j11, j12);
        this.J = i10;
        this.K = j13;
        this.L = eVar;
    }

    @Override // p2.l
    public final long a() {
        return this.E + ((long) this.J);
    }

    @Override // p2.l
    public final boolean b() {
        return this.O;
    }

    @Override // s2.k
    public final void c() {
        c cVar = this.H;
        w1.a.k(cVar);
        if (this.M == 0) {
            long j8 = this.K;
            for (b1 b1Var : (b1[]) cVar.f10197x) {
                if (b1Var.F != j8) {
                    b1Var.F = j8;
                    b1Var.f9395z = true;
                }
            }
            e eVar = this.L;
            long j9 = this.F;
            long j10 = j9 == -9223372036854775807L ? -9223372036854775807L : j9 - this.K;
            long j11 = this.G;
            eVar.a(cVar, j10, j11 != -9223372036854775807L ? j11 - this.K : -9223372036854775807L);
        }
        try {
            y1.k kVarC = this.f10209w.c(this.M);
            y yVar = this.D;
            w2.l lVar = new w2.l(yVar, kVarC.f14381e, yVar.h(kVarC));
            while (!this.N) {
                try {
                    int iG = this.L.f10203v.g(lVar, e.E);
                    w1.a.j(iG != 1);
                    if (!(iG == 0)) {
                        break;
                    }
                } finally {
                    this.M = lVar.f13837y - this.f10209w.f14381e;
                }
            }
            o oVar = this.f10211y;
            String str = oVar.f12060m;
            int i = oVar.M;
            int i10 = oVar.N;
            if (f0.m(str) && ((i > 1 || i10 > 1) && i != -1 && i10 != -1)) {
                g0 g0VarQ = cVar.q(4);
                int i11 = i * i10;
                long j12 = (this.C - this.B) / ((long) i11);
                for (int i12 = 1; i12 < i11; i12++) {
                    g0VarQ.d(0, new t());
                    g0VarQ.a(((long) i12) * j12, 0, 0, 0, null);
                }
            }
            android.support.v4.media.session.b.e(this.D);
            this.O = !this.N;
        } catch (Throwable th) {
            android.support.v4.media.session.b.e(this.D);
            throw th;
        }
    }

    @Override // s2.k
    public final void j() {
        this.N = true;
    }
}
