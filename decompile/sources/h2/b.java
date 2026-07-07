package h2;

import a2.c0;
import android.net.Uri;
import android.os.SystemClock;
import db.k0;
import j2.y;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o5.e0;
import q2.u;
import r1.l0;
import u1.a0;
import w1.v;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements u2.j {
    public l A;
    public long B;
    public long C;
    public long D;
    public long E;
    public boolean F;
    public IOException G;
    public boolean H;
    public final /* synthetic */ c I;

    /* renamed from: x, reason: collision with root package name */
    public final Uri f5857x;

    /* renamed from: y, reason: collision with root package name */
    public final u2.o f5858y = new u2.o("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* renamed from: z, reason: collision with root package name */
    public final w1.h f5859z;

    public b(c cVar, Uri uri) {
        this.I = cVar;
        this.f5857x = uri;
        this.f5859z = ((w1.g) cVar.f5860x.f7747y).c();
    }

    public static boolean a(b bVar, long j) {
        bVar.E = SystemClock.elapsedRealtime() + j;
        Uri uri = bVar.f5857x;
        c cVar = bVar.I;
        if (!uri.equals(cVar.H)) {
            return false;
        }
        List list = cVar.G.f5939e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i6 = 0; i6 < size; i6++) {
            b bVar2 = (b) cVar.A.get(((n) list.get(i6)).f5931a);
            bVar2.getClass();
            if (elapsedRealtime > bVar2.E) {
                Uri uri2 = bVar2.f5857x;
                cVar.H = uri2;
                bVar2.e(cVar.b(uri2));
                return false;
            }
        }
        return true;
    }

    @Override // u2.j
    public final ef.g C(u2.l lVar, long j, long j10, IOException iOException, int i6) {
        boolean z10;
        int i10;
        ef.g gVar;
        u2.r rVar = (u2.r) lVar;
        long j11 = rVar.f12871x;
        int i11 = rVar.f12873z;
        Uri uri = rVar.A.f13560z;
        u uVar = new u(j10);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof q;
        ef.g gVar2 = u2.o.B;
        c cVar = this.I;
        if (z10 || z11) {
            if (iOException instanceof v) {
                i10 = ((v) iOException).A;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            if (z11 || i10 == 400 || i10 == 503) {
                this.D = SystemClock.elapsedRealtime();
                c(false);
                b2.k kVar = cVar.C;
                String str = a0.f12750a;
                kVar.r(uVar, i11, iOException, true);
                return gVar2;
            }
        }
        y yVar = new y(i6, 6, iOException);
        Iterator it = cVar.B.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((t) it.next()).d(this.f5857x, yVar, false);
        }
        e0 e0Var = cVar.f5862z;
        if (z12) {
            e0Var.getClass();
            long h4 = e0.h(yVar);
            if (h4 != -9223372036854775807L) {
                gVar = new ef.g(0, h4, false);
            } else {
                gVar = u2.o.C;
            }
            gVar2 = gVar;
        }
        boolean a10 = gVar2.a();
        cVar.C.r(uVar, i11, iOException, !a10);
        if (!a10) {
            e0Var.getClass();
        }
        return gVar2;
    }

    public final Uri b() {
        String str;
        l lVar = this.A;
        Uri uri = this.f5857x;
        if (lVar != null) {
            k kVar = lVar.f5926v;
            if (kVar.f5905a != -9223372036854775807L || kVar.f5909e) {
                Uri.Builder buildUpon = uri.buildUpon();
                l lVar2 = this.A;
                if (lVar2.f5926v.f5909e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(lVar2.f5916k + lVar2.f5923r.size()));
                    l lVar3 = this.A;
                    if (lVar3.f5919n != -9223372036854775807L) {
                        k0 k0Var = lVar3.s;
                        int size = k0Var.size();
                        if (!k0Var.isEmpty() && ((g) db.r.l(k0Var)).J) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                k kVar2 = this.A.f5926v;
                if (kVar2.f5905a != -9223372036854775807L) {
                    if (kVar2.f5906b) {
                        str = "v2";
                    } else {
                        str = "YES";
                    }
                    buildUpon.appendQueryParameter("_HLS_skip", str);
                }
                return buildUpon.build();
            }
        }
        return uri;
    }

    public final void c(boolean z10) {
        Uri uri;
        if (z10) {
            uri = b();
        } else {
            uri = this.f5857x;
        }
        e(uri);
    }

    public final void d(Uri uri) {
        c cVar = this.I;
        u2.q h4 = cVar.f5861y.h(cVar.G, this.A);
        Map map = Collections.EMPTY_MAP;
        u1.c.i(uri, "The uri must be set.");
        u2.r rVar = new u2.r(this.f5859z, new w1.l(uri, 1, null, map, 0L, -1L, null, 1), 4, h4);
        this.f5858y.f(rVar, this, cVar.f5862z.f(rVar.f12873z));
    }

    public final void e(Uri uri) {
        this.E = 0L;
        if (!this.F) {
            u2.o oVar = this.f5858y;
            if (!oVar.d() && !oVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = this.D;
                if (elapsedRealtime < j) {
                    this.F = true;
                    this.I.E.postDelayed(new c0(17, this, uri), j - elapsedRealtime);
                } else {
                    d(uri);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(h2.l r73, q2.u r74) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.b.f(h2.l, q2.u):void");
    }

    @Override // u2.j
    public final void k(u2.l lVar, long j, long j10) {
        u2.r rVar = (u2.r) lVar;
        p pVar = (p) rVar.C;
        Uri uri = rVar.A.f13560z;
        u uVar = new u(j10);
        if (pVar instanceof l) {
            f((l) pVar, uVar);
            this.I.C.o(uVar, 4);
        } else {
            l0 b10 = l0.b("Loaded playlist has unexpected type.", null);
            this.G = b10;
            this.I.C.r(uVar, 4, b10, true);
        }
        this.I.f5862z.getClass();
    }

    @Override // u2.j
    public final void o(u2.l lVar, long j, long j10, boolean z10) {
        u2.r rVar = (u2.r) lVar;
        long j11 = rVar.f12871x;
        Uri uri = rVar.A.f13560z;
        u uVar = new u(j10);
        c cVar = this.I;
        cVar.f5862z.getClass();
        cVar.C.n(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // u2.j
    public final void z(u2.l lVar, long j, long j10, int i6) {
        u uVar;
        u2.r rVar = (u2.r) lVar;
        if (i6 == 0) {
            long j11 = rVar.f12871x;
            uVar = new u(rVar.f12872y);
        } else {
            long j12 = rVar.f12871x;
            Uri uri = rVar.A.f13560z;
            uVar = new u(j10);
        }
        this.I.C.s(uVar, rVar.f12873z, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i6);
    }
}
