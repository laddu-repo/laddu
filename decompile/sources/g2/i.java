package g2;

import a2.a2;
import android.net.Uri;
import android.util.Pair;
import db.c1;
import db.i0;
import db.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import r1.e1;
import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final c f5318a;

    /* renamed from: b, reason: collision with root package name */
    public final w1.h f5319b;

    /* renamed from: c, reason: collision with root package name */
    public final w1.h f5320c;

    /* renamed from: d, reason: collision with root package name */
    public final a2 f5321d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri[] f5322e;

    /* renamed from: f, reason: collision with root package name */
    public final r1.q[] f5323f;

    /* renamed from: g, reason: collision with root package name */
    public final h2.c f5324g;

    /* renamed from: h, reason: collision with root package name */
    public final e1 f5325h;

    /* renamed from: i, reason: collision with root package name */
    public final List f5326i;

    /* renamed from: k, reason: collision with root package name */
    public final b2.m f5327k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5328l;

    /* renamed from: n, reason: collision with root package name */
    public q2.b f5330n;

    /* renamed from: o, reason: collision with root package name */
    public Uri f5331o;

    /* renamed from: p, reason: collision with root package name */
    public Uri f5332p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5333q;

    /* renamed from: r, reason: collision with root package name */
    public t2.s f5334r;
    public final lc.c j = new lc.c(7);

    /* renamed from: m, reason: collision with root package name */
    public byte[] f5329m = a0.f12751b;
    public long s = -9223372036854775807L;

    /* JADX WARN: Type inference failed for: r3v1, types: [t2.c, t2.s, g2.g] */
    public i(c cVar, h2.c cVar2, Uri[] uriArr, r1.q[] qVarArr, k7.d dVar, w1.a0 a0Var, a2 a2Var, List list, b2.m mVar) {
        this.f5318a = cVar;
        this.f5324g = cVar2;
        this.f5322e = uriArr;
        this.f5323f = qVarArr;
        this.f5321d = a2Var;
        this.f5326i = list;
        this.f5327k = mVar;
        w1.h c10 = ((w1.g) dVar.f7747y).c();
        this.f5319b = c10;
        if (a0Var != null) {
            c10.q(a0Var);
        }
        this.f5320c = ((w1.g) dVar.f7747y).c();
        this.f5325h = new e1(HttpUrl.FRAGMENT_ENCODE_SET, qVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < uriArr.length; i6++) {
            if ((qVarArr[i6].f11663f & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                arrayList.add(Integer.valueOf(i6));
            }
        }
        e1 e1Var = this.f5325h;
        int[] U = a8.f.U(arrayList);
        ?? cVar3 = new t2.c(e1Var, U);
        cVar3.f5313g = cVar3.g(e1Var.f11389d[U[0]]);
        this.f5334r = cVar3;
    }

    public static h d(h2.l lVar, long j, int i6) {
        long j10 = lVar.f5916k;
        k0 k0Var = lVar.s;
        int i10 = (int) (j - j10);
        k0 k0Var2 = lVar.f5923r;
        if (i10 == k0Var2.size()) {
            if (i6 == -1) {
                i6 = 0;
            }
            if (i6 < k0Var.size()) {
                return new h((h2.j) k0Var.get(i6), j, i6);
            }
            return null;
        }
        h2.i iVar = (h2.i) k0Var2.get(i10);
        if (i6 == -1) {
            return new h(iVar, j, -1);
        }
        if (i6 < iVar.J.size()) {
            return new h((h2.j) iVar.J.get(i6), j, i6);
        }
        int i11 = i10 + 1;
        if (i11 < k0Var2.size()) {
            return new h((h2.j) k0Var2.get(i11), j + 1, -1);
        }
        if (!k0Var.isEmpty()) {
            return new h((h2.j) k0Var.get(0), j + 1, 0);
        }
        return null;
    }

    public final r2.m[] a(j jVar, long j) {
        int a10;
        boolean z10;
        List list;
        i iVar = this;
        j jVar2 = jVar;
        if (jVar2 == null) {
            a10 = -1;
        } else {
            a10 = iVar.f5325h.a(jVar2.A);
        }
        int length = iVar.f5334r.length();
        r2.m[] mVarArr = new r2.m[length];
        boolean z11 = false;
        int i6 = 0;
        while (i6 < length) {
            int j10 = iVar.f5334r.j(i6);
            Uri uri = iVar.f5322e[j10];
            h2.c cVar = iVar.f5324g;
            if (!cVar.c(uri)) {
                mVarArr[i6] = r2.m.f11794q;
            } else {
                h2.l a11 = cVar.a(z11, uri);
                a11.getClass();
                long j11 = a11.f5914h - cVar.K;
                if (j10 != a10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Pair c10 = iVar.c(jVar2, z10, a11, j11, j);
                long longValue = ((Long) c10.first).longValue();
                int intValue = ((Integer) c10.second).intValue();
                long j12 = a11.f5916k;
                k0 k0Var = a11.s;
                k0 k0Var2 = a11.f5923r;
                int i10 = (int) (longValue - j12);
                if (i10 >= 0 && k0Var2.size() >= i10) {
                    ArrayList arrayList = new ArrayList();
                    if (i10 < k0Var2.size()) {
                        if (intValue != -1) {
                            h2.i iVar2 = (h2.i) k0Var2.get(i10);
                            if (intValue == 0) {
                                arrayList.add(iVar2);
                            } else if (intValue < iVar2.J.size()) {
                                k0 k0Var3 = iVar2.J;
                                arrayList.addAll(k0Var3.subList(intValue, k0Var3.size()));
                            }
                            i10++;
                        }
                        arrayList.addAll(k0Var2.subList(i10, k0Var2.size()));
                        intValue = 0;
                    }
                    if (a11.f5919n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < k0Var.size()) {
                            arrayList.addAll(k0Var.subList(intValue, k0Var.size()));
                        }
                    }
                    list = Collections.unmodifiableList(arrayList);
                } else {
                    i0 i0Var = k0.f4008y;
                    list = c1.B;
                }
                mVarArr[i6] = new f(j11, list);
            }
            i6++;
            iVar = this;
            jVar2 = jVar;
            z11 = false;
        }
        return mVarArr;
    }

    public final int b(j jVar) {
        k0 k0Var;
        int i6 = jVar.L;
        if (i6 != -1) {
            h2.l a10 = this.f5324g.a(false, this.f5322e[this.f5325h.a(jVar.A)]);
            a10.getClass();
            k0 k0Var2 = a10.f5923r;
            int i10 = (int) (jVar.G - a10.f5916k);
            if (i10 >= 0) {
                if (i10 < k0Var2.size()) {
                    k0Var = ((h2.i) k0Var2.get(i10)).J;
                } else {
                    k0Var = a10.s;
                }
                if (i6 < k0Var.size()) {
                    h2.g gVar = (h2.g) k0Var.get(i6);
                    if (gVar.J) {
                        return 0;
                    }
                    if (Objects.equals(Uri.parse(u1.a.n(a10.f5947a, gVar.f5902x)), jVar.f11786y.f13542a)) {
                        return 1;
                    }
                    return 2;
                }
                return 2;
            }
            return 1;
        }
        return 1;
    }

    public final Pair c(j jVar, boolean z10, h2.l lVar, long j, long j10) {
        k0 k0Var;
        long j11;
        boolean z11 = true;
        int i6 = -1;
        if (jVar != null) {
            long j12 = jVar.G;
            int i10 = jVar.L;
            if (!z10) {
                if (jVar.f5340e0) {
                    if (i10 == -1) {
                        j12 = jVar.a();
                    }
                    Long valueOf = Long.valueOf(j12);
                    if (i10 != -1) {
                        i6 = i10 + 1;
                    }
                    return new Pair(valueOf, Integer.valueOf(i6));
                }
                return new Pair(Long.valueOf(j12), Integer.valueOf(i10));
            }
        }
        long j13 = lVar.f5925u;
        k0 k0Var2 = lVar.s;
        long j14 = lVar.f5916k;
        k0 k0Var3 = lVar.f5923r;
        long j15 = j13 + j;
        if (jVar != null && !this.f5333q) {
            j10 = jVar.D;
        }
        if (!lVar.f5920o && j10 >= j15) {
            return new Pair(Long.valueOf(j14 + k0Var3.size()), -1);
        }
        long j16 = j10 - j;
        Long valueOf2 = Long.valueOf(j16);
        int i11 = 0;
        if (this.f5324g.J && jVar != null) {
            z11 = false;
        }
        int c10 = a0.c(k0Var3, valueOf2, z11);
        long j17 = c10 + j14;
        if (c10 >= 0) {
            h2.i iVar = (h2.i) k0Var3.get(c10);
            if (j16 < iVar.B + iVar.f5904z) {
                k0Var = iVar.J;
            } else {
                k0Var = k0Var2;
            }
            while (true) {
                if (i11 >= k0Var.size()) {
                    break;
                }
                h2.g gVar = (h2.g) k0Var.get(i11);
                if (j16 < gVar.B + gVar.f5904z) {
                    if (gVar.I) {
                        if (k0Var == k0Var2) {
                            j11 = 1;
                        } else {
                            j11 = 0;
                        }
                        j17 += j11;
                        i6 = i11;
                    }
                } else {
                    i11++;
                }
            }
        }
        return new Pair(Long.valueOf(j17), Integer.valueOf(i6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [r2.e, g2.e] */
    public final e e(Uri uri, int i6, boolean z10) {
        if (uri == null) {
            return null;
        }
        lc.c cVar = this.j;
        byte[] bArr = (byte[]) ((d) cVar.f8328x).remove(uri);
        if (bArr != null) {
            return null;
        }
        w1.l lVar = new w1.l(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        r1.q qVar = this.f5323f[i6];
        int o10 = this.f5334r.o();
        Object r10 = this.f5334r.r();
        byte[] bArr2 = this.f5329m;
        ?? eVar = new r2.e(this.f5320c, lVar, 3, qVar, o10, r10, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = a0.f12751b;
        }
        eVar.G = bArr2;
        return eVar;
    }
}
