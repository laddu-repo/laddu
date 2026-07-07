package o2;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import b2.k;
import b2.m;
import com.google.android.gms.internal.measurement.j4;
import com.unity3d.services.core.di.ServiceProvider;
import f2.l;
import f2.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import o5.e0;
import q2.c0;
import q2.d1;
import q2.u;
import q2.z;
import r1.f0;
import u2.e;
import u2.j;
import u2.p;
import u2.q;
import u2.r;
import w1.a0;
import w1.g;
import w1.h;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends q2.a implements j {
    public final boolean E;
    public final Uri F;
    public final g G;
    public final j4 H;
    public final e0 I;
    public final o J;
    public final e0 K;
    public final long L;
    public final k M;
    public final q N;
    public final ArrayList O;
    public h P;
    public u2.o Q;
    public p R;
    public a0 S;
    public long T;
    public p2.c U;
    public Handler V;
    public r1.e0 W;

    static {
        f0.a("media3.exoplayer.smoothstreaming");
    }

    public c(r1.e0 e0Var, g gVar, q qVar, j4 j4Var, e0 e0Var2, o oVar, e0 e0Var3, long j) {
        this.W = e0Var;
        r1.a0 a0Var = e0Var.f11379b;
        a0Var.getClass();
        Uri uri = a0Var.f11283a;
        this.U = null;
        if (uri.equals(Uri.EMPTY)) {
            uri = null;
        } else {
            String str = u1.a0.f12750a;
            String path = uri.getPath();
            if (path != null) {
                Matcher matcher = u1.a0.f12755f.matcher(path);
                if (matcher.matches() && matcher.group(1) == null) {
                    uri = Uri.withAppendedPath(uri, "Manifest");
                }
            }
        }
        this.F = uri;
        this.G = gVar;
        this.N = qVar;
        this.H = j4Var;
        this.I = e0Var2;
        this.J = oVar;
        this.K = e0Var3;
        this.L = j;
        this.M = b(null);
        this.E = false;
        this.O = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    @Override // u2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ef.g C(u2.l r3, long r4, long r6, java.io.IOException r8, int r9) {
        /*
            r2 = this;
            u2.r r3 = (u2.r) r3
            q2.u r4 = new q2.u
            long r0 = r3.f12871x
            w1.z r5 = r3.A
            android.net.Uri r5 = r5.f13560z
            r4.<init>(r6)
            int r3 = r3.f12873z
            o5.e0 r5 = r2.K
            r5.getClass()
            boolean r5 = r8 instanceof r1.l0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 != 0) goto L4d
            boolean r5 = r8 instanceof java.io.FileNotFoundException
            if (r5 != 0) goto L4d
            boolean r5 = r8 instanceof w1.s
            if (r5 != 0) goto L4d
            boolean r5 = r8 instanceof u2.n
            if (r5 != 0) goto L4d
            int r5 = w1.j.f13537y
            r5 = r8
        L2c:
            if (r5 == 0) goto L41
            boolean r0 = r5 instanceof w1.j
            if (r0 == 0) goto L3c
            r0 = r5
            w1.j r0 = (w1.j) r0
            int r0 = r0.f13538x
            r1 = 2008(0x7d8, float:2.814E-42)
            if (r0 != r1) goto L3c
            goto L4d
        L3c:
            java.lang.Throwable r5 = r5.getCause()
            goto L2c
        L41:
            int r9 = r9 + (-1)
            int r9 = r9 * 1000
            r5 = 5000(0x1388, float:7.006E-42)
            int r5 = java.lang.Math.min(r9, r5)
            long r0 = (long) r5
            goto L4e
        L4d:
            r0 = r6
        L4e:
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 != 0) goto L55
            ef.g r5 = u2.o.C
            goto L5b
        L55:
            ef.g r5 = new ef.g
            r6 = 0
            r5.<init>(r6, r0, r6)
        L5b:
            boolean r6 = r5.a()
            r6 = r6 ^ 1
            b2.k r7 = r2.M
            r7.r(r4, r3, r8, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.c.C(u2.l, long, long, java.io.IOException, int):ef.g");
    }

    @Override // q2.a
    public final boolean a(r1.e0 e0Var) {
        r1.a0 a0Var = i().f11379b;
        a0Var.getClass();
        r1.a0 a0Var2 = e0Var.f11379b;
        if (a0Var2 != null && a0Var2.f11283a.equals(a0Var.f11283a) && a0Var2.f11287e.equals(a0Var.f11287e) && Objects.equals(a0Var2.f11285c, a0Var.f11285c)) {
            return true;
        }
        return false;
    }

    @Override // q2.a
    public final q2.a0 c(c0 c0Var, e eVar, long j) {
        k b10 = b(c0Var);
        l lVar = new l(this.A.f4677c, 0, c0Var);
        b bVar = new b(this.U, this.H, this.S, this.I, this.J, lVar, this.K, b10, this.R, eVar);
        this.O.add(bVar);
        return bVar;
    }

    @Override // q2.a
    public final synchronized r1.e0 i() {
        return this.W;
    }

    @Override // u2.j
    public final void k(u2.l lVar, long j, long j10) {
        r rVar = (r) lVar;
        long j11 = rVar.f12871x;
        Uri uri = rVar.A.f13560z;
        u uVar = new u(j10);
        this.K.getClass();
        this.M.o(uVar, rVar.f12873z);
        this.U = (p2.c) rVar.C;
        this.T = j - j10;
        w();
        if (!this.U.f10477d) {
            return;
        }
        this.V.postDelayed(new j2.h(this, 11), Math.max(0L, (this.T + ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT) - SystemClock.elapsedRealtime()));
    }

    @Override // q2.a
    public final void l() {
        this.R.b();
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, u2.p] */
    @Override // q2.a
    public final void n(a0 a0Var) {
        this.S = a0Var;
        Looper myLooper = Looper.myLooper();
        m mVar = this.D;
        u1.c.h(mVar);
        o oVar = this.J;
        oVar.n(myLooper, mVar);
        oVar.c();
        if (this.E) {
            this.R = new Object();
            w();
            return;
        }
        this.P = this.G.c();
        u2.o oVar2 = new u2.o("SsMediaSource");
        this.Q = oVar2;
        this.R = oVar2;
        this.V = u1.a0.n(null);
        x();
    }

    @Override // u2.j
    public final void o(u2.l lVar, long j, long j10, boolean z10) {
        r rVar = (r) lVar;
        long j11 = rVar.f12871x;
        Uri uri = rVar.A.f13560z;
        u uVar = new u(j10);
        this.K.getClass();
        this.M.n(uVar, rVar.f12873z, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // q2.a
    public final void q(q2.a0 a0Var) {
        b bVar = (b) a0Var;
        for (r2.h hVar : bVar.J) {
            hVar.A(null);
        }
        bVar.H = null;
        this.O.remove(a0Var);
    }

    @Override // q2.a
    public final void s() {
        p2.c cVar;
        if (this.E) {
            cVar = this.U;
        } else {
            cVar = null;
        }
        this.U = cVar;
        this.P = null;
        this.T = 0L;
        u2.o oVar = this.Q;
        if (oVar != null) {
            oVar.e(null);
            this.Q = null;
        }
        Handler handler = this.V;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.V = null;
        }
        this.J.a();
    }

    @Override // q2.a
    public final synchronized void v(r1.e0 e0Var) {
        this.W = e0Var;
    }

    public final void w() {
        d1 d1Var;
        long j;
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.O;
            if (i6 >= arrayList.size()) {
                break;
            }
            b bVar = (b) arrayList.get(i6);
            p2.c cVar = this.U;
            bVar.I = cVar;
            for (r2.h hVar : bVar.J) {
                a aVar = (a) hVar.B;
                p2.b[] bVarArr = aVar.f9857f.f10479f;
                int i10 = aVar.f9853b;
                p2.b bVar2 = bVarArr[i10];
                int i11 = bVar2.f10468k;
                long[] jArr = bVar2.f10472o;
                p2.b bVar3 = cVar.f10479f[i10];
                if (i11 == 0 || bVar3.f10468k == 0) {
                    aVar.f9858g += i11;
                } else {
                    int i12 = i11 - 1;
                    long b10 = bVar2.b(i12) + jArr[i12];
                    long j10 = bVar3.f10472o[0];
                    if (b10 <= j10) {
                        aVar.f9858g += i11;
                    } else {
                        aVar.f9858g = u1.a0.e(jArr, j10, true) + aVar.f9858g;
                    }
                }
                aVar.f9857f = cVar;
            }
            z zVar = bVar.H;
            zVar.getClass();
            zVar.j(bVar);
            i6++;
        }
        p2.b[] bVarArr2 = this.U.f10479f;
        int length = bVarArr2.length;
        long j11 = Long.MIN_VALUE;
        long j12 = Long.MAX_VALUE;
        int i13 = 0;
        while (i13 < length) {
            p2.b bVar4 = bVarArr2[i13];
            int i14 = bVar4.f10468k;
            long[] jArr2 = bVar4.f10472o;
            p2.b[] bVarArr3 = bVarArr2;
            if (i14 > 0) {
                j12 = Math.min(j12, jArr2[0]);
                int i15 = bVar4.f10468k - 1;
                j11 = Math.max(j11, bVar4.b(i15) + jArr2[i15]);
            }
            i13++;
            bVarArr2 = bVarArr3;
        }
        if (j12 == Long.MAX_VALUE) {
            if (this.U.f10477d) {
                j = -9223372036854775807L;
            } else {
                j = 0;
            }
            p2.c cVar2 = this.U;
            boolean z10 = cVar2.f10477d;
            d1Var = new d1(j, 0L, 0L, 0L, true, z10, z10, cVar2, i());
        } else {
            p2.c cVar3 = this.U;
            if (cVar3.f10477d) {
                long j13 = cVar3.f10481h;
                if (j13 != -9223372036854775807L && j13 > 0) {
                    j12 = Math.max(j12, j11 - j13);
                }
                long j14 = j12;
                long j15 = j11 - j14;
                long Q = j15 - u1.a0.Q(this.L);
                if (Q < 5000000) {
                    Q = Math.min(5000000L, j15 / 2);
                }
                d1Var = new d1(-9223372036854775807L, j15, j14, Q, true, true, true, this.U, i());
            } else {
                long j16 = cVar3.f10480g;
                if (j16 == -9223372036854775807L) {
                    j16 = j11 - j12;
                }
                long j17 = j16;
                long j18 = j12;
                d1Var = new d1(-9223372036854775807L, -9223372036854775807L, j18 + j17, j17, j18, 0L, true, false, false, this.U, i(), null);
            }
        }
        p(d1Var);
    }

    public final void x() {
        if (this.Q.c()) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = this.F;
        u1.c.i(uri, "The uri must be set.");
        r rVar = new r(this.P, new w1.l(uri, 1, null, map, 0L, -1L, null, 1), 4, this.N);
        this.Q.f(rVar, this, this.K.f(rVar.f12873z));
    }

    @Override // u2.j
    public final void z(u2.l lVar, long j, long j10, int i6) {
        u uVar;
        r rVar = (r) lVar;
        if (i6 == 0) {
            long j11 = rVar.f12871x;
            uVar = new u(rVar.f12872y);
        } else {
            long j12 = rVar.f12871x;
            Uri uri = rVar.A.f13560z;
            uVar = new u(j10);
        }
        u uVar2 = uVar;
        this.M.s(uVar2, rVar.f12873z, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i6);
    }
}
