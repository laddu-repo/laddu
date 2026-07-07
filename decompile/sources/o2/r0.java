package o2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements s2.k {
    public volatile boolean B;
    public long D;
    public y1.k E;
    public w2.g0 F;
    public boolean G;
    public final /* synthetic */ u0 H;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Uri f9517v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y1.y f9518w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final hd.a f9519x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final u0 f9520y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final w1.e f9521z;
    public final t1.r A = new t1.r();
    public boolean C = true;

    public r0(u0 u0Var, Uri uri, y1.h hVar, hd.a aVar, u0 u0Var2, w1.e eVar) {
        this.H = u0Var;
        this.f9517v = uri;
        this.f9518w = new y1.y(hVar);
        this.f9519x = aVar;
        this.f9520y = u0Var2;
        this.f9521z = eVar;
        u.f9532b.getAndIncrement();
        this.E = a(0L);
    }

    public final y1.k a(long j8) {
        Map map = Collections.EMPTY_MAP;
        Map map2 = u0.f9534k0;
        Uri uri = this.f9517v;
        w1.a.l(uri, "The uri must be set.");
        return new y1.k(uri, 1, null, map2, j8, -1L, null, 6);
    }

    @Override // s2.k
    public final void c() {
        y1.h tVar;
        w2.o oVar;
        int i;
        int iG = 0;
        while (iG == 0 && !this.B) {
            try {
                long j8 = this.A.f12092a;
                y1.k kVarA = a(j8);
                this.E = kVarA;
                long jH = this.f9518w.h(kVarA);
                if (this.B) {
                    if (iG != 1 && this.f9519x.t() != -1) {
                        this.A.f12092a = this.f9519x.t();
                    }
                    android.support.v4.media.session.b.e(this.f9518w);
                    return;
                }
                if (jH != -1) {
                    jH += j8;
                    u0 u0Var = this.H;
                    u0Var.L.post(new p0(u0Var, 0));
                }
                long j9 = jH;
                this.H.N = j3.b.d(this.f9518w.f14399v.j());
                y1.y yVar = this.f9518w;
                j3.b bVar = this.H.N;
                if (bVar == null || (i = bVar.f) == -1) {
                    tVar = yVar;
                } else {
                    tVar = new t(yVar, i, this);
                    w2.g0 g0VarD = this.H.D(new t0(0, true));
                    this.F = g0VarD;
                    g0VarD.c(u0.f9535l0);
                }
                this.f9519x.G(tVar, this.f9517v, this.f9518w.f14399v.j(), j8, j9, this.f9520y);
                if (this.H.N != null && (oVar = (w2.o) this.f9519x.f6280x) != null) {
                    w2.o oVarA = oVar.a();
                    if (oVarA instanceof p3.d) {
                        ((p3.d) oVarA).f10252r = true;
                    }
                }
                if (this.C) {
                    hd.a aVar = this.f9519x;
                    long j10 = this.D;
                    w2.o oVar2 = (w2.o) aVar.f6280x;
                    oVar2.getClass();
                    oVar2.f(j8, j10);
                    this.C = false;
                }
                while (iG == 0 && !this.B) {
                    try {
                        w1.e eVar = this.f9521z;
                        synchronized (eVar) {
                            while (!eVar.f13705b) {
                                eVar.f13704a.getClass();
                                eVar.wait();
                            }
                        }
                        hd.a aVar2 = this.f9519x;
                        t1.r rVar = this.A;
                        w2.o oVar3 = (w2.o) aVar2.f6280x;
                        oVar3.getClass();
                        w2.l lVar = (w2.l) aVar2.f6281y;
                        lVar.getClass();
                        iG = oVar3.g(lVar, rVar);
                        long jT = this.f9519x.t();
                        if (jT > this.H.D + j8) {
                            this.f9521z.d();
                            u0 u0Var2 = this.H;
                            u0Var2.L.post(u0Var2.K);
                            j8 = jT;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (iG == 1) {
                    iG = 0;
                } else if (this.f9519x.t() != -1) {
                    this.A.f12092a = this.f9519x.t();
                }
                android.support.v4.media.session.b.e(this.f9518w);
            } catch (Throwable th) {
                if (iG != 1 && this.f9519x.t() != -1) {
                    this.A.f12092a = this.f9519x.t();
                }
                android.support.v4.media.session.b.e(this.f9518w);
                throw th;
            }
        }
    }

    @Override // s2.k
    public final void j() {
        this.B = true;
    }
}
