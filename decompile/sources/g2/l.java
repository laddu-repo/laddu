package g2;

import android.net.Uri;
import android.os.Looper;
import db.k0;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o5.e0;
import q2.c0;
import q2.d1;
import r1.f0;
import r1.z;
import w1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l extends q2.a {
    public final c E;
    public final k7.d F;
    public final e0 G;
    public final f2.o H;
    public final e0 I;
    public final boolean J;
    public final int K;
    public final h2.c L;
    public final long M;
    public z N;
    public a0 O;
    public r1.e0 P;

    static {
        f0.a("media3.exoplayer.hls");
    }

    public l(r1.e0 e0Var, k7.d dVar, c cVar, e0 e0Var2, f2.o oVar, e0 e0Var3, h2.c cVar2, long j, boolean z10, int i6) {
        this.P = e0Var;
        this.N = e0Var.f11380c;
        this.F = dVar;
        this.E = cVar;
        this.G = e0Var2;
        this.H = oVar;
        this.I = e0Var3;
        this.L = cVar2;
        this.M = j;
        this.J = z10;
        this.K = i6;
    }

    public static h2.g w(long j, List list) {
        h2.g gVar = null;
        for (int i6 = 0; i6 < list.size(); i6++) {
            h2.g gVar2 = (h2.g) list.get(i6);
            long j10 = gVar2.B;
            if (j10 <= j && gVar2.I) {
                gVar = gVar2;
            } else if (j10 > j) {
                break;
            }
        }
        return gVar;
    }

    @Override // q2.a
    public final boolean a(r1.e0 e0Var) {
        r1.e0 i6 = i();
        r1.a0 a0Var = i6.f11379b;
        a0Var.getClass();
        r1.a0 a0Var2 = e0Var.f11379b;
        if (a0Var2 != null && a0Var2.f11283a.equals(a0Var.f11283a) && a0Var2.f11287e.equals(a0Var.f11287e) && Objects.equals(a0Var2.f11285c, a0Var.f11285c) && i6.f11380c.equals(e0Var.f11380c)) {
            return true;
        }
        return false;
    }

    @Override // q2.a
    public final q2.a0 c(c0 c0Var, u2.e eVar, long j) {
        b2.k b10 = b(c0Var);
        f2.l lVar = new f2.l(this.A.f4677c, 0, c0Var);
        a0 a0Var = this.O;
        b2.m mVar = this.D;
        u1.c.h(mVar);
        return new k(this.E, this.L, this.F, a0Var, this.H, lVar, this.I, b10, eVar, this.G, this.J, this.K, mVar);
    }

    @Override // q2.a
    public final synchronized r1.e0 i() {
        return this.P;
    }

    @Override // q2.a
    public final void l() {
        h2.c cVar = this.L;
        u2.o oVar = cVar.D;
        if (oVar != null) {
            oVar.b();
        }
        Uri uri = cVar.H;
        if (uri != null) {
            h2.b bVar = (h2.b) cVar.A.get(uri);
            bVar.f5858y.b();
            IOException iOException = bVar.G;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // q2.a
    public final void n(a0 a0Var) {
        boolean z10;
        this.O = a0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        b2.m mVar = this.D;
        u1.c.h(mVar);
        f2.o oVar = this.H;
        oVar.n(myLooper, mVar);
        oVar.c();
        b2.k b10 = b(null);
        r1.a0 a0Var2 = i().f11379b;
        a0Var2.getClass();
        Uri uri = a0Var2.f11283a;
        h2.c cVar = this.L;
        cVar.getClass();
        cVar.E = u1.a0.n(null);
        cVar.C = b10;
        cVar.F = this;
        Map map = Collections.EMPTY_MAP;
        u1.c.i(uri, "The uri must be set.");
        u2.r rVar = new u2.r(((w1.g) cVar.f5860x.f7747y).c(), new w1.l(uri, 1, null, map, 0L, -1L, null, 1), 4, cVar.f5861y.p());
        if (cVar.D == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        u2.o oVar2 = new u2.o("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.D = oVar2;
        oVar2.f(rVar, cVar, cVar.f5862z.f(rVar.f12873z));
    }

    @Override // q2.a
    public final void q(q2.a0 a0Var) {
        k kVar = (k) a0Var;
        kVar.f5346y.B.remove(kVar);
        for (q qVar : kVar.Q) {
            if (qVar.f5361a0) {
                for (p pVar : qVar.S) {
                    pVar.k();
                    f2.i iVar = pVar.f10994h;
                    if (iVar != null) {
                        iVar.d(pVar.f10991e);
                        pVar.f10994h = null;
                        pVar.f10993g = null;
                    }
                }
            }
            i iVar2 = qVar.A;
            h2.b bVar = (h2.b) iVar2.f5324g.A.get(iVar2.f5322e[iVar2.f5334r.m()]);
            if (bVar != null) {
                bVar.H = false;
            }
            iVar2.f5330n = null;
            qVar.G.e(qVar);
            qVar.O.removeCallbacksAndMessages(null);
            qVar.f5365e0 = true;
            qVar.P.clear();
        }
        kVar.N = null;
    }

    @Override // q2.a
    public final void s() {
        h2.c cVar = this.L;
        cVar.H = null;
        cVar.I = null;
        cVar.G = null;
        cVar.K = -9223372036854775807L;
        cVar.D.e(null);
        cVar.D = null;
        HashMap hashMap = cVar.A;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((h2.b) it.next()).f5858y.e(null);
        }
        cVar.E.removeCallbacksAndMessages(null);
        cVar.E = null;
        hashMap.clear();
        this.H.a();
    }

    @Override // q2.a
    public final synchronized void v(r1.e0 e0Var) {
        this.P = e0Var;
    }

    public final void x(h2.l lVar) {
        long j;
        long j10;
        long j11;
        d1 d1Var;
        long j12;
        long j13;
        long j14;
        long j15;
        boolean z10;
        float f3;
        long j16;
        boolean z11;
        boolean z12 = lVar.f5921p;
        boolean z13 = lVar.f5913g;
        k0 k0Var = lVar.f5923r;
        long j17 = lVar.f5925u;
        long j18 = lVar.f5911e;
        int i6 = lVar.f5910d;
        long j19 = lVar.f5914h;
        if (z12) {
            j = u1.a0.e0(j19);
        } else {
            j = -9223372036854775807L;
        }
        if (i6 != 2 && i6 != 1) {
            j10 = -9223372036854775807L;
        } else {
            j10 = j;
        }
        h2.c cVar = this.L;
        cVar.G.getClass();
        w8.l lVar2 = new w8.l(13);
        long j20 = 0;
        if (cVar.J) {
            h2.k kVar = lVar.f5926v;
            long j21 = j19 - cVar.K;
            boolean z14 = lVar.f5920o;
            if (z14) {
                j12 = j21 + j17;
            } else {
                j12 = -9223372036854775807L;
            }
            if (lVar.f5921p) {
                j13 = u1.a0.Q(u1.a0.A(this.M)) - (j19 + j17);
            } else {
                j13 = 0;
            }
            long j22 = this.N.f11768a;
            if (j22 != -9223372036854775807L) {
                j15 = u1.a0.Q(j22);
            } else {
                if (j18 != -9223372036854775807L) {
                    j14 = j17 - j18;
                } else {
                    j14 = kVar.f5908d;
                    if (j14 == -9223372036854775807L || lVar.f5919n == -9223372036854775807L) {
                        j14 = kVar.f5907c;
                        if (j14 == -9223372036854775807L) {
                            j14 = 3 * lVar.f5918m;
                        }
                    }
                }
                j15 = j14 + j13;
            }
            long j23 = j17 + j13;
            long j24 = u1.a0.j(j15, j13, j23);
            z zVar = i().f11380c;
            if (zVar.f11771d == -3.4028235E38f && zVar.f11772e == -3.4028235E38f && kVar.f5907c == -9223372036854775807L && kVar.f5908d == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.t tVar = new e2.t();
            tVar.f4275a = u1.a0.e0(j24);
            float f10 = 1.0f;
            if (z10) {
                f3 = 1.0f;
            } else {
                f3 = this.N.f11771d;
            }
            tVar.f4278d = f3;
            if (!z10) {
                f10 = this.N.f11772e;
            }
            tVar.f4279e = f10;
            z zVar2 = new z(tVar);
            this.N = zVar2;
            if (j18 == -9223372036854775807L) {
                j18 = j23 - u1.a0.Q(zVar2.f11768a);
            }
            if (z13) {
                j20 = j18;
            } else {
                h2.g w10 = w(j18, lVar.s);
                if (w10 != null) {
                    j16 = w10.B;
                } else if (!k0Var.isEmpty()) {
                    h2.i iVar = (h2.i) k0Var.get(u1.a0.c(k0Var, Long.valueOf(j18), true));
                    h2.g w11 = w(j18, iVar.J);
                    if (w11 != null) {
                        j16 = w11.B;
                    } else {
                        j16 = iVar.B;
                    }
                }
                j20 = j16;
            }
            if (i6 == 2 && lVar.f5912f) {
                z11 = true;
            } else {
                z11 = false;
            }
            d1Var = new d1(j10, j, j12, lVar.f5925u, j21, j20, true, !z14, z11, lVar2, i(), this.N);
        } else {
            if (j18 != -9223372036854775807L && !k0Var.isEmpty()) {
                if (!z13 && j18 != j17) {
                    j18 = ((h2.i) k0Var.get(u1.a0.c(k0Var, Long.valueOf(j18), true))).B;
                }
                j11 = j18;
            } else {
                j11 = 0;
            }
            long j25 = lVar.f5925u;
            d1Var = new d1(j10, j, j25, j25, 0L, j11, true, false, true, lVar2, i(), null);
        }
        p(d1Var);
    }
}
