package i2;

import android.net.Uri;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import t1.t0;
import w1.b0;
import y1.z;
import y9.c0;
import y9.f0;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f6369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y1.h f6370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y1.h f6371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a9.g f6372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri[] f6373e;
    public final t1.o[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j2.c f6374g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t0 f6375h;
    public final List i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d2.l f6377k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6378l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o2.b f6380n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Uri f6381o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Uri f6382p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f6383q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public r2.s f6384r;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s5.c f6376j = new s5.c(24);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f6379m = b0.f13688c;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f6385s = -9223372036854775807L;

    public i(c cVar, j2.c cVar2, Uri[] uriArr, t1.o[] oVarArr, a9.g gVar, z zVar, a9.g gVar2, List list, d2.l lVar) {
        this.f6369a = cVar;
        this.f6374g = cVar2;
        this.f6373e = uriArr;
        this.f = oVarArr;
        this.f6372d = gVar2;
        this.i = list;
        this.f6377k = lVar;
        y1.h hVarC = ((y1.g) gVar.f273w).c();
        this.f6370b = hVarC;
        if (zVar != null) {
            hVarC.a(zVar);
        }
        this.f6371c = ((y1.g) gVar.f273w).c();
        this.f6375h = new t0("", oVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((oVarArr[i].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        t0 t0Var = this.f6375h;
        int[] iArrN = z7.b.N(arrayList);
        g gVar3 = new g(t0Var, iArrN);
        gVar3.f6364g = gVar3.n(t0Var.f12114d[iArrN[0]]);
        this.f6384r = gVar3;
    }

    public static h d(j2.l lVar, long j8, int i) {
        long j9 = lVar.f6713k;
        f0 f0Var = lVar.f6721s;
        int i10 = (int) (j8 - j9);
        f0 f0Var2 = lVar.f6720r;
        if (i10 == f0Var2.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < f0Var.size()) {
                return new h((j2.j) f0Var.get(i), j8, i);
            }
            return null;
        }
        j2.i iVar = (j2.i) f0Var2.get(i10);
        if (i == -1) {
            return new h(iVar, j8, -1);
        }
        if (i < iVar.H.size()) {
            return new h((j2.j) iVar.H.get(i), j8, i);
        }
        int i11 = i10 + 1;
        if (i11 < f0Var2.size()) {
            return new h((j2.j) f0Var2.get(i11), j8 + 1, -1);
        }
        if (f0Var.isEmpty()) {
            return null;
        }
        return new h((j2.j) f0Var.get(0), j8 + 1, 0);
    }

    public final p2.m[] a(j jVar, long j8) {
        List listUnmodifiableList;
        i iVar = this;
        j jVar2 = jVar;
        int iA = jVar2 == null ? -1 : iVar.f6375h.a(jVar2.f10211y);
        int length = iVar.f6384r.length();
        p2.m[] mVarArr = new p2.m[length];
        boolean z2 = false;
        int i = 0;
        while (i < length) {
            int iE = iVar.f6384r.e(i);
            Uri uri = iVar.f6373e[iE];
            j2.c cVar = iVar.f6374g;
            if (cVar.c(uri)) {
                j2.l lVarA = cVar.a(uri, z2);
                lVarA.getClass();
                long j9 = lVarA.f6711h - cVar.I;
                Pair pairC = iVar.c(jVar2, iE != iA ? true : z2, lVarA, j9, j8);
                long jLongValue = ((Long) pairC.first).longValue();
                int iIntValue = ((Integer) pairC.second).intValue();
                long j10 = lVarA.f6713k;
                f0 f0Var = lVarA.f6721s;
                f0 f0Var2 = lVarA.f6720r;
                int i10 = (int) (jLongValue - j10);
                if (i10 < 0 || f0Var2.size() < i10) {
                    c0 c0Var = f0.f14553w;
                    listUnmodifiableList = z0.f14637z;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i10 < f0Var2.size()) {
                        if (iIntValue != -1) {
                            j2.i iVar2 = (j2.i) f0Var2.get(i10);
                            if (iIntValue == 0) {
                                arrayList.add(iVar2);
                            } else if (iIntValue < iVar2.H.size()) {
                                f0 f0Var3 = iVar2.H;
                                arrayList.addAll(f0Var3.subList(iIntValue, f0Var3.size()));
                            }
                            i10++;
                        }
                        arrayList.addAll(f0Var2.subList(i10, f0Var2.size()));
                        iIntValue = 0;
                    }
                    if (lVarA.f6716n != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < f0Var.size()) {
                            arrayList.addAll(f0Var.subList(iIntValue, f0Var.size()));
                        }
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                }
                mVarArr[i] = new f(j9, listUnmodifiableList);
            } else {
                mVarArr[i] = p2.m.f10223q;
            }
            i++;
            iVar = this;
            jVar2 = jVar;
            z2 = false;
        }
        return mVarArr;
    }

    public final int b(j jVar) {
        int i = jVar.J;
        if (i == -1) {
            return 1;
        }
        j2.l lVarA = this.f6374g.a(this.f6373e[this.f6375h.a(jVar.f10211y)], false);
        lVarA.getClass();
        f0 f0Var = lVarA.f6720r;
        int i10 = (int) (jVar.E - lVarA.f6713k);
        if (i10 < 0) {
            return 1;
        }
        f0 f0Var2 = i10 < f0Var.size() ? ((j2.i) f0Var.get(i10)).H : lVarA.f6721s;
        if (i >= f0Var2.size()) {
            return 2;
        }
        j2.g gVar = (j2.g) f0Var2.get(i);
        if (gVar.H) {
            return 0;
        }
        return Objects.equals(Uri.parse(w1.a.z(lVarA.f6741a, gVar.f6698v)), jVar.f10209w.f14377a) ? 1 : 2;
    }

    public final Pair c(j jVar, boolean z2, j2.l lVar, long j8, long j9) {
        boolean z10 = true;
        if (jVar != null) {
            long jA = jVar.E;
            int i = jVar.J;
            if (!z2) {
                if (!jVar.f6389c0) {
                    return new Pair(Long.valueOf(jA), Integer.valueOf(i));
                }
                if (i == -1) {
                    jA = jVar.a();
                }
                return new Pair(Long.valueOf(jA), Integer.valueOf(i != -1 ? i + 1 : -1));
            }
        }
        long j10 = lVar.f6723u;
        f0 f0Var = lVar.f6721s;
        long j11 = lVar.f6713k;
        f0 f0Var2 = lVar.f6720r;
        long j12 = j10 + j8;
        if (jVar != null && !this.f6383q) {
            j9 = jVar.B;
        }
        if (!lVar.f6717o && j9 >= j12) {
            return new Pair(Long.valueOf(j11 + ((long) f0Var2.size())), -1);
        }
        long j13 = j9 - j8;
        Long lValueOf = Long.valueOf(j13);
        int i10 = 0;
        if (this.f6374g.H && jVar != null) {
            z10 = false;
        }
        int iC = b0.c(f0Var2, lValueOf, z10);
        long j14 = ((long) iC) + j11;
        if (iC >= 0) {
            j2.i iVar = (j2.i) f0Var2.get(iC);
            f0 f0Var3 = j13 < iVar.f6702z + iVar.f6700x ? iVar.H : f0Var;
            while (true) {
                if (i10 >= f0Var3.size()) {
                    break;
                }
                j2.g gVar = (j2.g) f0Var3.get(i10);
                if (j13 >= gVar.f6702z + gVar.f6700x) {
                    i10++;
                } else if (gVar.G) {
                    j14 += f0Var3 == f0Var ? 1L : 0L;
                    i = i10;
                }
            }
        }
        return new Pair(Long.valueOf(j14), Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e e(Uri uri, int i, boolean z2) {
        if (uri == null) {
            return null;
        }
        s5.c cVar = this.f6376j;
        byte[] bArr = (byte[]) ((d) cVar.f11492w).remove(uri);
        if (bArr != null) {
            return null;
        }
        y1.k kVar = new y1.k(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        t1.o oVar = this.f[i];
        int iL = this.f6384r.l();
        Object objQ = this.f6384r.q();
        byte[] bArr2 = this.f6379m;
        e eVar = new e(this.f6371c, kVar, 3, oVar, iL, objQ, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = b0.f13688c;
        }
        eVar.E = bArr2;
        return eVar;
    }
}
