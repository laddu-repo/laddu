package b0;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1248a = new Object();

    public static boolean a(a0.d dVar) {
        a0.e eVar;
        boolean z10;
        boolean z11;
        int[] iArr = dVar.f59p0;
        int i6 = iArr[0];
        int i10 = iArr[1];
        a0.d dVar2 = dVar.T;
        if (dVar2 != null) {
            eVar = (a0.e) dVar2;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            int i11 = eVar.f59p0[0];
        }
        if (eVar != null) {
            int i12 = eVar.f59p0[1];
        }
        if (i6 != 1 && !dVar.A() && i6 != 2 && ((i6 != 3 || dVar.f61r != 0 || dVar.W != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || !dVar.t(0)) && (i6 != 3 || dVar.f61r != 1 || !dVar.u(0, dVar.q())))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i10 != 1 && !dVar.B() && i10 != 2 && ((i10 != 3 || dVar.s != 0 || dVar.W != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || !dVar.t(1)) && (i10 != 3 || dVar.s != 1 || !dVar.u(1, dVar.k())))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if ((dVar.W <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || (!z10 && !z11)) && (!z10 || !z11)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [b0.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [b0.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    public static n b(a0.d dVar, int i6, ArrayList arrayList, n nVar) {
        int i10;
        int i11;
        if (i6 == 0) {
            i10 = dVar.f56n0;
        } else {
            i10 = dVar.o0;
        }
        int i12 = 0;
        if (i10 != -1 && (nVar == 0 || i10 != nVar.f1256b)) {
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList.size()) {
                    break;
                }
                n nVar2 = (n) arrayList.get(i13);
                if (nVar2.f1256b == i10) {
                    if (nVar != 0) {
                        nVar.c(i6, nVar2);
                        arrayList.remove((Object) nVar);
                    }
                    nVar = nVar2;
                } else {
                    i13++;
                }
            }
        } else if (i10 != -1) {
            return nVar;
        }
        n nVar3 = nVar;
        if (nVar == 0) {
            if (dVar instanceof a0.i) {
                a0.i iVar = (a0.i) dVar;
                int i14 = 0;
                while (true) {
                    if (i14 < iVar.f113r0) {
                        a0.d dVar2 = iVar.f112q0[i14];
                        if ((i6 == 0 && (i11 = dVar2.f56n0) != -1) || (i6 == 1 && (i11 = dVar2.o0) != -1)) {
                            break;
                        }
                        i14++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 != -1) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList.size()) {
                            break;
                        }
                        n nVar4 = (n) arrayList.get(i15);
                        if (nVar4.f1256b == i11) {
                            nVar = nVar4;
                            break;
                        }
                        i15++;
                    }
                }
            }
            if (nVar == 0) {
                nVar = new Object();
                nVar.f1255a = new ArrayList();
                nVar.f1258d = null;
                nVar.f1259e = -1;
                int i16 = n.f1254f;
                n.f1254f = i16 + 1;
                nVar.f1256b = i16;
                nVar.f1257c = i6;
            }
            arrayList.add(nVar);
            nVar3 = nVar;
        }
        int i17 = nVar3.f1256b;
        ArrayList arrayList2 = nVar3.f1255a;
        if (arrayList2.contains(dVar)) {
            return nVar3;
        }
        arrayList2.add(dVar);
        if (dVar instanceof a0.h) {
            a0.h hVar = (a0.h) dVar;
            a0.c cVar = hVar.f109t0;
            if (hVar.f110u0 == 0) {
                i12 = 1;
            }
            cVar.c(i12, nVar3, arrayList);
        }
        if (i6 == 0) {
            dVar.f56n0 = i17;
            dVar.I.c(i6, nVar3, arrayList);
            dVar.K.c(i6, nVar3, arrayList);
        } else {
            dVar.o0 = i17;
            dVar.J.c(i6, nVar3, arrayList);
            dVar.M.c(i6, nVar3, arrayList);
            dVar.L.c(i6, nVar3, arrayList);
        }
        dVar.P.c(i6, nVar3, arrayList);
        return nVar3;
    }

    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, b0.b] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, b0.b] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, b0.b] */
    public static void c(int i6, a0.d dVar, d0.f fVar, boolean z10) {
        boolean z11;
        a0.c cVar;
        a0.c cVar2;
        boolean z12;
        a0.c cVar3;
        a0.c cVar4;
        if (!dVar.f53m) {
            if (!(dVar instanceof a0.e) && dVar.z() && a(dVar)) {
                a0.e.V(dVar, fVar, new Object());
            }
            a0.c i10 = dVar.i(2);
            a0.c i11 = dVar.i(4);
            int d10 = i10.d();
            int d11 = i11.d();
            HashSet hashSet = i10.f21a;
            if (hashSet != null && i10.f23c) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    a0.c cVar5 = (a0.c) it.next();
                    a0.d dVar2 = cVar5.f24d;
                    int i12 = i6 + 1;
                    boolean a10 = a(dVar2);
                    a0.c cVar6 = dVar2.I;
                    a0.c cVar7 = dVar2.K;
                    if (dVar2.z() && a10) {
                        a0.e.V(dVar2, fVar, new Object());
                    }
                    if ((cVar5 == cVar6 && (cVar4 = cVar7.f26f) != null && cVar4.f23c) || (cVar5 == cVar7 && (cVar3 = cVar6.f26f) != null && cVar3.f23c)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    int i13 = dVar2.f59p0[0];
                    if (i13 == 3 && !a10) {
                        if (i13 == 3 && dVar2.f64v >= 0 && dVar2.f63u >= 0 && (dVar2.f43g0 == 8 || (dVar2.f61r == 0 && dVar2.W == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
                            if (!dVar2.x() && !dVar2.F && z12 && !dVar2.x()) {
                                e(i12, dVar, fVar, dVar2, z10);
                            }
                        }
                    } else if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f26f == null) {
                            int e10 = cVar6.e() + d10;
                            dVar2.J(e10, dVar2.q() + e10);
                            c(i12, dVar2, fVar, z10);
                        } else if (cVar5 == cVar7 && cVar6.f26f == null) {
                            int e11 = d10 - cVar7.e();
                            dVar2.J(e11 - dVar2.q(), e11);
                            c(i12, dVar2, fVar, z10);
                        } else if (z12 && !dVar2.x()) {
                            d(i12, dVar2, fVar, z10);
                        }
                    }
                }
            }
            if (dVar instanceof a0.h) {
                return;
            }
            HashSet hashSet2 = i11.f21a;
            if (hashSet2 != null && i11.f23c) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    a0.c cVar8 = (a0.c) it2.next();
                    a0.d dVar3 = cVar8.f24d;
                    int i14 = i6 + 1;
                    boolean a11 = a(dVar3);
                    a0.c cVar9 = dVar3.I;
                    a0.c cVar10 = dVar3.K;
                    if (dVar3.z() && a11) {
                        a0.e.V(dVar3, fVar, new Object());
                    }
                    if ((cVar8 == cVar9 && (cVar2 = cVar10.f26f) != null && cVar2.f23c) || (cVar8 == cVar10 && (cVar = cVar9.f26f) != null && cVar.f23c)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i15 = dVar3.f59p0[0];
                    if (i15 == 3 && !a11) {
                        if (i15 == 3 && dVar3.f64v >= 0 && dVar3.f63u >= 0) {
                            if (dVar3.f43g0 == 8 || (dVar3.f61r == 0 && dVar3.W == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                                if (!dVar3.x() && !dVar3.F && z11 && !dVar3.x()) {
                                    e(i14, dVar, fVar, dVar3, z10);
                                }
                            }
                        }
                    } else if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f26f == null) {
                            int e12 = cVar9.e() + d11;
                            dVar3.J(e12, dVar3.q() + e12);
                            c(i14, dVar3, fVar, z10);
                        } else if (cVar8 == cVar10 && cVar9.f26f == null) {
                            int e13 = d11 - cVar10.e();
                            dVar3.J(e13 - dVar3.q(), e13);
                            c(i14, dVar3, fVar, z10);
                        } else if (z11 && !dVar3.x()) {
                            d(i14, dVar3, fVar, z10);
                        }
                    }
                }
            }
            dVar.f53m = true;
        }
    }

    public static void d(int i6, a0.d dVar, d0.f fVar, boolean z10) {
        float f3;
        float f10 = dVar.f37d0;
        a0.c cVar = dVar.I;
        int d10 = cVar.f26f.d();
        a0.c cVar2 = dVar.K;
        int d11 = cVar2.f26f.d();
        int e10 = cVar.e() + d10;
        int e11 = d11 - cVar2.e();
        if (d10 == d11) {
            f10 = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int q9 = dVar.q();
        int i10 = (d11 - d10) - q9;
        if (d10 > d11) {
            i10 = (d10 - d11) - q9;
        }
        if (i10 > 0) {
            f3 = (f10 * i10) + 0.5f;
        } else {
            f3 = f10 * i10;
        }
        int i11 = ((int) f3) + d10;
        int i12 = i11 + q9;
        if (d10 > d11) {
            i12 = i11 - q9;
        }
        dVar.J(i11, i12);
        c(i6 + 1, dVar, fVar, z10);
    }

    public static void e(int i6, a0.d dVar, d0.f fVar, a0.d dVar2, boolean z10) {
        int q9;
        float f3 = dVar2.f37d0;
        a0.c cVar = dVar2.I;
        int e10 = cVar.e() + cVar.f26f.d();
        a0.c cVar2 = dVar2.K;
        int d10 = cVar2.f26f.d() - cVar2.e();
        if (d10 >= e10) {
            int q10 = dVar2.q();
            if (dVar2.f43g0 != 8) {
                int i10 = dVar2.f61r;
                if (i10 == 2) {
                    if (dVar instanceof a0.e) {
                        q9 = dVar.q();
                    } else {
                        q9 = dVar.T.q();
                    }
                    q10 = (int) (dVar2.f37d0 * 0.5f * q9);
                } else if (i10 == 0) {
                    q10 = d10 - e10;
                }
                q10 = Math.max(dVar2.f63u, q10);
                int i11 = dVar2.f64v;
                if (i11 > 0) {
                    q10 = Math.min(i11, q10);
                }
            }
            int i12 = e10 + ((int) ((f3 * ((d10 - e10) - q10)) + 0.5f));
            dVar2.J(i12, q10 + i12);
            c(i6 + 1, dVar2, fVar, z10);
        }
    }

    public static void f(int i6, a0.d dVar, d0.f fVar) {
        float f3;
        float f10 = dVar.f39e0;
        a0.c cVar = dVar.J;
        int d10 = cVar.f26f.d();
        a0.c cVar2 = dVar.L;
        int d11 = cVar2.f26f.d();
        int e10 = cVar.e() + d10;
        int e11 = d11 - cVar2.e();
        if (d10 == d11) {
            f10 = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int k8 = dVar.k();
        int i10 = (d11 - d10) - k8;
        if (d10 > d11) {
            i10 = (d10 - d11) - k8;
        }
        if (i10 > 0) {
            f3 = (f10 * i10) + 0.5f;
        } else {
            f3 = f10 * i10;
        }
        int i11 = (int) f3;
        int i12 = d10 + i11;
        int i13 = i12 + k8;
        if (d10 > d11) {
            i12 = d10 - i11;
            i13 = i12 - k8;
        }
        dVar.K(i12, i13);
        i(i6 + 1, dVar, fVar);
    }

    public static void g(int i6, a0.d dVar, d0.f fVar, a0.d dVar2) {
        int k8;
        float f3 = dVar2.f39e0;
        a0.c cVar = dVar2.J;
        int e10 = cVar.e() + cVar.f26f.d();
        a0.c cVar2 = dVar2.L;
        int d10 = cVar2.f26f.d() - cVar2.e();
        if (d10 >= e10) {
            int k9 = dVar2.k();
            if (dVar2.f43g0 != 8) {
                int i10 = dVar2.s;
                if (i10 == 2) {
                    if (dVar instanceof a0.e) {
                        k8 = dVar.k();
                    } else {
                        k8 = dVar.T.k();
                    }
                    k9 = (int) (f3 * 0.5f * k8);
                } else if (i10 == 0) {
                    k9 = d10 - e10;
                }
                k9 = Math.max(dVar2.f66x, k9);
                int i11 = dVar2.f67y;
                if (i11 > 0) {
                    k9 = Math.min(i11, k9);
                }
            }
            int i12 = e10 + ((int) ((f3 * ((d10 - e10) - k9)) + 0.5f));
            dVar2.K(i12, k9 + i12);
            i(i6 + 1, dVar2, fVar);
        }
    }

    public static boolean h(int i6, int i10, int i11, int i12) {
        boolean z10;
        boolean z11;
        if (i11 != 1 && i11 != 2 && (i11 != 4 || i6 == 2)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i12 != 1 && i12 != 2 && (i12 != 4 || i10 == 2)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 || z11) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, b0.b] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, b0.b] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, b0.b] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, b0.b] */
    public static void i(int i6, a0.d dVar, d0.f fVar) {
        boolean z10;
        a0.c cVar;
        a0.c cVar2;
        boolean z11;
        a0.c cVar3;
        a0.c cVar4;
        if (!dVar.f55n) {
            if (!(dVar instanceof a0.e) && dVar.z() && a(dVar)) {
                a0.e.V(dVar, fVar, new Object());
            }
            a0.c i10 = dVar.i(3);
            a0.c i11 = dVar.i(5);
            int d10 = i10.d();
            int d11 = i11.d();
            HashSet hashSet = i10.f21a;
            if (hashSet != null && i10.f23c) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    a0.c cVar5 = (a0.c) it.next();
                    a0.d dVar2 = cVar5.f24d;
                    int i12 = i6 + 1;
                    boolean a10 = a(dVar2);
                    a0.c cVar6 = dVar2.J;
                    a0.c cVar7 = dVar2.L;
                    if (dVar2.z() && a10) {
                        a0.e.V(dVar2, fVar, new Object());
                    }
                    if ((cVar5 == cVar6 && (cVar4 = cVar7.f26f) != null && cVar4.f23c) || (cVar5 == cVar7 && (cVar3 = cVar6.f26f) != null && cVar3.f23c)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i13 = dVar2.f59p0[1];
                    if (i13 == 3 && !a10) {
                        if (i13 == 3 && dVar2.f67y >= 0 && dVar2.f66x >= 0 && (dVar2.f43g0 == 8 || (dVar2.s == 0 && dVar2.W == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
                            if (!dVar2.y() && !dVar2.F && z11 && !dVar2.y()) {
                                g(i12, dVar, fVar, dVar2);
                            }
                        }
                    } else if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f26f == null) {
                            int e10 = cVar6.e() + d10;
                            dVar2.K(e10, dVar2.k() + e10);
                            i(i12, dVar2, fVar);
                        } else if (cVar5 == cVar7 && cVar6.f26f == null) {
                            int e11 = d10 - cVar7.e();
                            dVar2.K(e11 - dVar2.k(), e11);
                            i(i12, dVar2, fVar);
                        } else if (z11 && !dVar2.y()) {
                            f(i12, dVar2, fVar);
                        }
                    }
                }
            }
            char c10 = 1;
            if (dVar instanceof a0.h) {
                return;
            }
            HashSet hashSet2 = i11.f21a;
            if (hashSet2 != null && i11.f23c) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    a0.c cVar8 = (a0.c) it2.next();
                    a0.d dVar3 = cVar8.f24d;
                    int i14 = i6 + 1;
                    boolean a11 = a(dVar3);
                    a0.c cVar9 = dVar3.J;
                    a0.c cVar10 = dVar3.L;
                    if (dVar3.z() && a11) {
                        a0.e.V(dVar3, fVar, new Object());
                    }
                    if ((cVar8 == cVar9 && (cVar2 = cVar10.f26f) != null && cVar2.f23c) || (cVar8 == cVar10 && (cVar = cVar9.f26f) != null && cVar.f23c)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i15 = dVar3.f59p0[1];
                    if (i15 == 3 && !a11) {
                        if (i15 == 3 && dVar3.f67y >= 0 && dVar3.f66x >= 0 && (dVar3.f43g0 == 8 || (dVar3.s == 0 && dVar3.W == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
                            if (!dVar3.y() && !dVar3.F && z10 && !dVar3.y()) {
                                g(i14, dVar, fVar, dVar3);
                            }
                        }
                    } else if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f26f == null) {
                            int e12 = cVar9.e() + d11;
                            dVar3.K(e12, dVar3.k() + e12);
                            i(i14, dVar3, fVar);
                        } else if (cVar8 == cVar10 && cVar9.f26f == null) {
                            int e13 = d11 - cVar10.e();
                            dVar3.K(e13 - dVar3.k(), e13);
                            i(i14, dVar3, fVar);
                        } else if (z10 && !dVar3.y()) {
                            f(i14, dVar3, fVar);
                        }
                    }
                }
            }
            a0.c i16 = dVar.i(6);
            if (i16.f21a != null && i16.f23c) {
                int d12 = i16.d();
                Iterator it3 = i16.f21a.iterator();
                while (it3.hasNext()) {
                    a0.c cVar11 = (a0.c) it3.next();
                    a0.d dVar4 = cVar11.f24d;
                    int i17 = i6 + 1;
                    boolean a12 = a(dVar4);
                    a0.c cVar12 = dVar4.M;
                    if (dVar4.z() && a12) {
                        a0.e.V(dVar4, fVar, new Object());
                    }
                    if (dVar4.f59p0[c10] != 3 || a12) {
                        if (dVar4.z()) {
                            continue;
                        } else if (cVar11 == cVar12) {
                            int e14 = cVar11.e() + d12;
                            if (dVar4.E) {
                                int i18 = e14 - dVar4.f31a0;
                                int i19 = dVar4.V + i18;
                                dVar4.Z = i18;
                                dVar4.J.l(i18);
                                dVar4.L.l(i19);
                                cVar12.l(e14);
                                dVar4.f51l = true;
                            }
                            i(i17, dVar4, fVar);
                        }
                    }
                    c10 = 1;
                }
            }
            dVar.f55n = true;
        }
    }
}
