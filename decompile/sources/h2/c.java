package h2;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o5.e0;
import okhttp3.HttpUrl;
import q2.u;
import r1.k0;
import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements u2.j {
    public static final com.unity3d.ads.adplayer.b L = new com.unity3d.ads.adplayer.b(10);
    public b2.k C;
    public u2.o D;
    public Handler E;
    public g2.l F;
    public o G;
    public Uri H;
    public l I;
    public boolean J;

    /* renamed from: x, reason: collision with root package name */
    public final k7.d f5860x;

    /* renamed from: y, reason: collision with root package name */
    public final s f5861y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f5862z;
    public final CopyOnWriteArrayList B = new CopyOnWriteArrayList();
    public final HashMap A = new HashMap();
    public long K = -9223372036854775807L;

    public c(k7.d dVar, e0 e0Var, s sVar) {
        this.f5860x = dVar;
        this.f5861y = sVar;
        this.f5862z = e0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    @Override // u2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ef.g C(u2.l r5, long r6, long r8, java.io.IOException r10, int r11) {
        /*
            r4 = this;
            u2.r r5 = (u2.r) r5
            q2.u r6 = new q2.u
            long r0 = r5.f12871x
            w1.z r7 = r5.A
            android.net.Uri r7 = r7.f13560z
            r6.<init>(r8)
            int r5 = r5.f12873z
            o5.e0 r7 = r4.f5862z
            r7.getClass()
            boolean r7 = r10 instanceof r1.l0
            r8 = 1
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 != 0) goto L4d
            boolean r7 = r10 instanceof java.io.FileNotFoundException
            if (r7 != 0) goto L4d
            boolean r7 = r10 instanceof w1.s
            if (r7 != 0) goto L4d
            boolean r7 = r10 instanceof u2.n
            if (r7 != 0) goto L4d
            int r7 = w1.j.f13537y
            r7 = r10
        L2d:
            if (r7 == 0) goto L42
            boolean r9 = r7 instanceof w1.j
            if (r9 == 0) goto L3d
            r9 = r7
            w1.j r9 = (w1.j) r9
            int r9 = r9.f13538x
            r2 = 2008(0x7d8, float:2.814E-42)
            if (r9 != r2) goto L3d
            goto L4d
        L3d:
            java.lang.Throwable r7 = r7.getCause()
            goto L2d
        L42:
            int r11 = r11 - r8
            int r11 = r11 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r7 = java.lang.Math.min(r11, r7)
            long r2 = (long) r7
            goto L4e
        L4d:
            r2 = r0
        L4e:
            r7 = 0
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 != 0) goto L54
            goto L55
        L54:
            r8 = 0
        L55:
            b2.k r9 = r4.C
            r9.r(r6, r5, r10, r8)
            if (r8 == 0) goto L5f
            ef.g r5 = u2.o.C
            return r5
        L5f:
            ef.g r5 = new ef.g
            r5.<init>(r7, r2, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.c.C(u2.l, long, long, java.io.IOException, int):ef.g");
    }

    public final l a(boolean z10, Uri uri) {
        HashMap hashMap = this.A;
        l lVar = ((b) hashMap.get(uri)).A;
        if (lVar != null && z10) {
            if (!uri.equals(this.H)) {
                List list = this.G.f5939e;
                int i6 = 0;
                while (true) {
                    if (i6 >= list.size()) {
                        break;
                    }
                    if (uri.equals(((n) list.get(i6)).f5931a)) {
                        l lVar2 = this.I;
                        if (lVar2 == null || !lVar2.f5920o) {
                            this.H = uri;
                            b bVar = (b) hashMap.get(uri);
                            l lVar3 = bVar.A;
                            if (lVar3 != null && lVar3.f5920o) {
                                this.I = lVar3;
                                this.F.x(lVar3);
                            } else {
                                bVar.e(b(uri));
                            }
                        }
                    } else {
                        i6++;
                    }
                }
            }
            b bVar2 = (b) hashMap.get(uri);
            l lVar4 = bVar2.A;
            if (!bVar2.H) {
                bVar2.H = true;
                if (lVar4 != null && !lVar4.f5920o) {
                    bVar2.c(true);
                }
            }
        }
        return lVar;
    }

    public final Uri b(Uri uri) {
        h hVar;
        l lVar = this.I;
        if (lVar != null && lVar.f5926v.f5909e && (hVar = (h) lVar.f5924t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(hVar.f5900b));
            int i6 = hVar.f5901c;
            if (i6 != -1) {
                buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i6));
            }
            return buildUpon.build();
        }
        return uri;
    }

    public final boolean c(Uri uri) {
        int i6;
        b bVar = (b) this.A.get(uri);
        if (bVar.A != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, a0.e0(bVar.A.f5925u));
            l lVar = bVar.A;
            if (lVar.f5920o || (i6 = lVar.f5910d) == 2 || i6 == 1 || bVar.B + max > elapsedRealtime) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // u2.j
    public final void k(u2.l lVar, long j, long j10) {
        o oVar;
        u2.r rVar = (u2.r) lVar;
        p pVar = (p) rVar.C;
        boolean z10 = pVar instanceof l;
        if (z10) {
            String str = pVar.f5947a;
            o oVar2 = o.f5937n;
            Uri parse = Uri.parse(str);
            r1.p pVar2 = new r1.p();
            pVar2.f11600a = "0";
            pVar2.f11610l = k0.p("application/x-mpegURL");
            List singletonList = Collections.singletonList(new n(parse, new r1.q(pVar2), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            oVar = new o(HttpUrl.FRAGMENT_ENCODE_SET, list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            oVar = (o) pVar;
        }
        this.G = oVar;
        this.H = ((n) oVar.f5939e.get(0)).f5931a;
        this.B.add(new a(this));
        List list2 = oVar.f5938d;
        int size = list2.size();
        for (int i6 = 0; i6 < size; i6++) {
            Uri uri = (Uri) list2.get(i6);
            this.A.put(uri, new b(this, uri));
        }
        Uri uri2 = rVar.A.f13560z;
        u uVar = new u(j10);
        b bVar = (b) this.A.get(this.H);
        if (z10) {
            bVar.f((l) pVar, uVar);
        } else {
            bVar.c(false);
        }
        this.f5862z.getClass();
        this.C.o(uVar, 4);
    }

    @Override // u2.j
    public final void o(u2.l lVar, long j, long j10, boolean z10) {
        u2.r rVar = (u2.r) lVar;
        long j11 = rVar.f12871x;
        Uri uri = rVar.A.f13560z;
        u uVar = new u(j10);
        this.f5862z.getClass();
        this.C.n(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
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
        this.C.s(uVar, rVar.f12873z, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i6);
    }
}
