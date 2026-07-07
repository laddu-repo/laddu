package i2;

import android.net.Uri;
import android.os.Looper;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k8.a0;
import k8.c0;
import o2.b0;
import o2.d0;
import o2.g1;
import t1.v;
import t1.w;
import y1.z;
import y9.f0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l extends o2.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f6399h;
    public final a9.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a0 f6400j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h2.n f6401k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c0 f6402l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f6403m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f6404n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j2.c f6405o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f6406p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public v f6407q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z f6408r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public t1.z f6409s;

    static {
        t1.a0.a("media3.exoplayer.hls");
    }

    public l(t1.z zVar, a9.g gVar, c cVar, a0 a0Var, h2.n nVar, c0 c0Var, j2.c cVar2, long j8, boolean z2, int i) {
        this.f6409s = zVar;
        this.f6407q = zVar.f12180c;
        this.i = gVar;
        this.f6399h = cVar;
        this.f6400j = a0Var;
        this.f6401k = nVar;
        this.f6402l = c0Var;
        this.f6405o = cVar2;
        this.f6406p = j8;
        this.f6403m = z2;
        this.f6404n = i;
    }

    public static j2.g t(long j8, List list) {
        j2.g gVar = null;
        for (int i = 0; i < list.size(); i++) {
            j2.g gVar2 = (j2.g) list.get(i);
            long j9 = gVar2.f6702z;
            if (j9 > j8 || !gVar2.G) {
                if (j9 > j8) {
                    break;
                }
            } else {
                gVar = gVar2;
            }
        }
        return gVar;
    }

    @Override // o2.a
    public final b0 b(d0 d0Var, s2.e eVar, long j8) {
        b3.a aVarA = a(d0Var);
        h2.k kVar = new h2.k(this.f9369d.f6097c, 0, d0Var);
        z zVar = this.f6408r;
        d2.l lVar = this.f9371g;
        w1.a.k(lVar);
        return new k(this.f6399h, this.f6405o, this.i, zVar, this.f6401k, kVar, this.f6402l, aVarA, eVar, this.f6400j, this.f6403m, this.f6404n, lVar);
    }

    @Override // o2.a
    public final synchronized t1.z h() {
        return this.f6409s;
    }

    @Override // o2.a
    public final void j() throws IOException {
        j2.c cVar = this.f6405o;
        s2.n nVar = cVar.B;
        if (nVar != null) {
            nVar.b();
        }
        Uri uri = cVar.F;
        if (uri != null) {
            j2.b bVar = (j2.b) cVar.f6659y.get(uri);
            bVar.f6652w.b();
            IOException iOException = bVar.E;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // o2.a
    public final void l(z zVar) {
        this.f6408r = zVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        d2.l lVar = this.f9371g;
        w1.a.k(lVar);
        h2.n nVar = this.f6401k;
        nVar.d(looperMyLooper, lVar);
        nVar.h();
        b3.a aVarA = a(null);
        w wVar = h().f12179b;
        wVar.getClass();
        Uri uri = wVar.f12129a;
        j2.c cVar = this.f6405o;
        cVar.getClass();
        cVar.C = w1.b0.m(null);
        cVar.A = aVarA;
        cVar.D = this;
        Map map = Collections.EMPTY_MAP;
        w1.a.l(uri, "The uri must be set.");
        s2.q qVar = new s2.q(((y1.g) cVar.f6656v.f273w).c(), new y1.k(uri, 1, null, map, 0L, -1L, null, 1), 4, cVar.f6657w.v());
        w1.a.j(cVar.B == null);
        s2.n nVar2 = new s2.n("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.B = nVar2;
        nVar2.f(qVar, cVar, cVar.f6658x.w(qVar.f11472x));
    }

    @Override // o2.a
    public final void n(b0 b0Var) {
        k kVar = (k) b0Var;
        kVar.f6395w.f6660z.remove(kVar);
        for (q qVar : kVar.O) {
            if (qVar.Y) {
                for (p pVar : qVar.Q) {
                    pVar.k();
                    h2.h hVar = pVar.f9378h;
                    if (hVar != null) {
                        hVar.d(pVar.f9376e);
                        pVar.f9378h = null;
                        pVar.f9377g = null;
                    }
                }
            }
            i iVar = qVar.f6443y;
            j2.b bVar = (j2.b) iVar.f6374g.f6659y.get(iVar.f6373e[iVar.f6384r.i()]);
            if (bVar != null) {
                bVar.F = false;
            }
            iVar.f6380n = null;
            qVar.E.e(qVar);
            qVar.M.removeCallbacksAndMessages(null);
            qVar.f6424c0 = true;
            qVar.N.clear();
        }
        kVar.L = null;
    }

    @Override // o2.a
    public final void p() {
        j2.c cVar = this.f6405o;
        cVar.F = null;
        cVar.G = null;
        cVar.E = null;
        cVar.I = -9223372036854775807L;
        cVar.B.e(null);
        cVar.B = null;
        HashMap map = cVar.f6659y;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((j2.b) it.next()).f6652w.e(null);
        }
        cVar.C.removeCallbacksAndMessages(null);
        cVar.C = null;
        map.clear();
        this.f6401k.release();
    }

    @Override // o2.a
    public final synchronized void s(t1.z zVar) {
        this.f6409s = zVar;
    }

    public final void u(j2.l lVar) {
        long j8;
        g1 g1Var;
        long j9;
        long jM;
        long j10;
        boolean z2 = lVar.f6718p;
        boolean z10 = lVar.f6710g;
        f0 f0Var = lVar.f6720r;
        long j11 = lVar.f6723u;
        long jM2 = lVar.f6709e;
        int i = lVar.f6708d;
        long j12 = lVar.f6711h;
        long jY = z2 ? w1.b0.Y(j12) : -9223372036854775807L;
        long j13 = (i == 2 || i == 1) ? jY : -9223372036854775807L;
        j2.c cVar = this.f6405o;
        cVar.E.getClass();
        t7.k kVar = new t7.k(12);
        long j14 = 0;
        if (cVar.H) {
            j2.k kVar2 = lVar.f6724v;
            long j15 = j12 - cVar.I;
            boolean z11 = lVar.f6717o;
            long j16 = z11 ? j15 + j11 : -9223372036854775807L;
            long jM3 = lVar.f6718p ? w1.b0.M(w1.b0.x(this.f6406p)) - (j12 + j11) : 0L;
            long j17 = this.f6407q.f12123a;
            if (j17 != -9223372036854775807L) {
                jM = w1.b0.M(j17);
            } else {
                if (jM2 != -9223372036854775807L) {
                    j9 = j11 - jM2;
                } else {
                    j9 = kVar2.f6706d;
                    if (j9 == -9223372036854775807L || lVar.f6716n == -9223372036854775807L) {
                        j9 = kVar2.f6705c;
                        if (j9 == -9223372036854775807L) {
                            j9 = 3 * lVar.f6715m;
                        }
                    }
                }
                jM = j9 + jM3;
            }
            long j18 = j11 + jM3;
            long jI = w1.b0.i(jM, jM3, j18);
            v vVar = h().f12180c;
            boolean z12 = vVar.f12126d == -3.4028235E38f && vVar.f12127e == -3.4028235E38f && kVar2.f6705c == -9223372036854775807L && kVar2.f6706d == -9223372036854775807L;
            g2.t tVar = new g2.t();
            tVar.f5476a = w1.b0.Y(jI);
            tVar.f5479d = z12 ? 1.0f : this.f6407q.f12126d;
            tVar.f5480e = z12 ? 1.0f : this.f6407q.f12127e;
            v vVar2 = new v(tVar);
            this.f6407q = vVar2;
            if (jM2 == -9223372036854775807L) {
                jM2 = j18 - w1.b0.M(vVar2.f12123a);
            }
            if (z10) {
                j14 = jM2;
            } else {
                j2.g gVarT = t(jM2, lVar.f6721s);
                if (gVarT != null) {
                    j10 = gVarT.f6702z;
                } else if (!f0Var.isEmpty()) {
                    j2.i iVar = (j2.i) f0Var.get(w1.b0.c(f0Var, Long.valueOf(jM2), true));
                    j2.g gVarT2 = t(jM2, iVar.H);
                    j10 = gVarT2 != null ? gVarT2.f6702z : iVar.f6702z;
                }
                j14 = j10;
            }
            g1Var = new g1(j13, jY, j16, lVar.f6723u, j15, j14, true, !z11, i == 2 && lVar.f, kVar, h(), this.f6407q);
        } else {
            if (jM2 == -9223372036854775807L || f0Var.isEmpty()) {
                j8 = 0;
            } else {
                if (!z10 && jM2 != j11) {
                    jM2 = ((j2.i) f0Var.get(w1.b0.c(f0Var, Long.valueOf(jM2), true))).f6702z;
                }
                j8 = jM2;
            }
            long j19 = lVar.f6723u;
            g1Var = new g1(j13, jY, j19, j19, 0L, j8, true, false, true, kVar, h(), null);
        }
        m(g1Var);
    }
}
