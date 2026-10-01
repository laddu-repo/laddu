package i2;

import android.net.Uri;
import android.util.SparseArray;
import c2.u0;
import c2.u1;
import c2.v0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import k8.a0;
import k8.c0;
import o2.b0;
import o2.j1;
import t1.e0;
import t1.g0;
import t1.t0;
import y1.z;
import y9.f0;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k implements b0, j2.t {
    public final h2.k A;
    public final c0 B;
    public final b3.a C;
    public final s2.e D;
    public final IdentityHashMap E;
    public final a9.g F;
    public final a0 G;
    public final boolean H;
    public final int I;
    public final d2.l J;
    public final s5.d K = new s5.d(this);
    public o2.a0 L;
    public int M;
    public j1 N;
    public q[] O;
    public q[] P;
    public int Q;
    public o2.n R;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f6394v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j2.c f6395w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a9.g f6396x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final z f6397y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final h2.n f6398z;

    public k(c cVar, j2.c cVar2, a9.g gVar, z zVar, h2.n nVar, h2.k kVar, c0 c0Var, b3.a aVar, s2.e eVar, a0 a0Var, boolean z2, int i, d2.l lVar) {
        this.f6394v = cVar;
        this.f6395w = cVar2;
        this.f6396x = gVar;
        this.f6397y = zVar;
        this.f6398z = nVar;
        this.A = kVar;
        this.B = c0Var;
        this.C = aVar;
        this.D = eVar;
        this.G = a0Var;
        this.H = z2;
        this.I = i;
        this.J = lVar;
        a0Var.getClass();
        y9.c0 c0Var2 = f0.f14553w;
        z0 z0Var = z0.f14637z;
        this.R = new o2.n(z0Var, z0Var);
        this.E = new IdentityHashMap();
        this.F = new a9.g(24);
        this.O = new q[0];
        this.P = new q[0];
    }

    public static t1.o f(t1.o oVar, t1.o oVar2, boolean z2) {
        e0 e0Var;
        int i;
        String str;
        String str2;
        f0 f0Var;
        int i10;
        int i11;
        String str3;
        y9.c0 c0Var = f0.f14553w;
        z0 z0Var = z0.f14637z;
        if (oVar2 != null) {
            str2 = oVar2.f12058k;
            e0Var = oVar2.f12059l;
            i10 = oVar2.F;
            i = oVar2.f12054e;
            i11 = oVar2.f;
            str = oVar2.f12053d;
            str3 = oVar2.f12051b;
            f0Var = oVar2.f12052c;
        } else {
            String strS = w1.b0.s(1, oVar.f12058k);
            e0Var = oVar.f12059l;
            if (z2) {
                i10 = oVar.F;
                i = oVar.f12054e;
                i11 = oVar.f;
                str = oVar.f12053d;
                str3 = oVar.f12051b;
                str2 = strS;
                f0Var = oVar.f12052c;
            } else {
                i = 0;
                str = null;
                str2 = strS;
                f0Var = z0Var;
                i10 = -1;
                i11 = 0;
                str3 = null;
            }
        }
        String strE = t1.f0.e(str2);
        int i12 = z2 ? oVar.f12056h : -1;
        int i13 = z2 ? oVar.i : -1;
        t1.n nVar = new t1.n();
        nVar.f12026a = oVar.f12050a;
        nVar.f12027b = str3;
        nVar.f12028c = f0.m(f0Var);
        nVar.f12035l = t1.f0.p(oVar.f12060m);
        nVar.f12036m = t1.f0.p(strE);
        nVar.f12033j = str2;
        nVar.f12034k = e0Var;
        nVar.f12032h = i12;
        nVar.i = i13;
        nVar.E = i10;
        nVar.f12030e = i;
        nVar.f = i11;
        nVar.f12029d = str;
        return new t1.o(nVar);
    }

    @Override // j2.t
    public final void a() {
        for (q qVar : this.O) {
            s2.n nVar = qVar.E;
            i iVar = qVar.f6443y;
            ArrayList arrayList = qVar.I;
            if (!arrayList.isEmpty()) {
                j jVar = (j) y9.p.l(arrayList);
                int iB = iVar.b(jVar);
                int i = jVar.J;
                if (iB == 1) {
                    if (!jVar.g()) {
                        w1.a.j(i != -1);
                        j2.l lVarA = iVar.f6374g.a(iVar.f6373e[iVar.f6375h.a(jVar.f10211y)], false);
                        lVarA.getClass();
                        f0 f0Var = lVarA.f6720r;
                        int i10 = (int) (jVar.E - lVarA.f6713k);
                        jVar.f6392f0 = i10 < 0 ? 0L : ((j2.g) (i10 < f0Var.size() ? ((j2.i) f0Var.get(i10)).H : lVarA.f6721s).get(i)).f6700x;
                    }
                } else if (iB == 0) {
                    qVar.M.post(new androidx.fragment.app.d(19, qVar, jVar));
                } else if (iB == 2 && !qVar.o0 && nVar.d()) {
                    nVar.a();
                }
            }
        }
        this.L.a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0056 A[SYNTHETIC] */
    @Override // j2.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.net.Uri r18, c6.i r19, boolean r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            i2.q[] r2 = r0.O
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto L90
            r8 = r2[r6]
            i2.i r9 = r8.f6443y
            android.net.Uri[] r10 = r9.f6373e
            boolean r11 = w1.b0.k(r10, r1)
            if (r11 != 0) goto L1e
            r8 = r19
            r4 = 1
            r16 = 1
            goto L8b
        L1e:
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r20 != 0) goto L40
            k8.c0 r8 = r8.D
            r2.s r13 = r9.f6384r
            s2.h r13 = com.bumptech.glide.d.h(r13)
            r8.getClass()
            r8 = r19
            e4.e r13 = k8.c0.v(r13, r8)
            if (r13 == 0) goto L42
            int r14 = r13.f4776a
            r15 = 2
            if (r14 != r15) goto L42
            long r13 = r13.f4777b
            goto L43
        L40:
            r8 = r19
        L42:
            r13 = r11
        L43:
            r15 = 0
            r16 = 1
        L46:
            int r4 = r10.length
            r5 = -1
            if (r15 >= r4) goto L56
            r4 = r10[r15]
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L53
            goto L57
        L53:
            int r15 = r15 + 1
            goto L46
        L56:
            r15 = r5
        L57:
            if (r15 != r5) goto L5a
            goto L87
        L5a:
            r2.s r4 = r9.f6384r
            int r4 = r4.u(r15)
            if (r4 != r5) goto L63
            goto L87
        L63:
            r9.f6381o = r1
            int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r5 == 0) goto L8a
            r2.s r5 = r9.f6384r
            boolean r4 = r5.o(r4, r13)
            if (r4 == 0) goto L8a
            j2.c r4 = r9.f6374g
            java.util.HashMap r4 = r4.f6659y
            java.lang.Object r4 = r4.get(r1)
            j2.b r4 = (j2.b) r4
            if (r4 == 0) goto L84
            boolean r4 = j2.b.a(r4, r13)
            r4 = r4 ^ 1
            goto L85
        L84:
            r4 = 0
        L85:
            if (r4 == 0) goto L8a
        L87:
            r4 = r16
            goto L8b
        L8a:
            r4 = 0
        L8b:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        L90:
            o2.a0 r1 = r0.L
            r1.a(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.k.b(android.net.Uri, c6.i, boolean):boolean");
    }

    @Override // o2.e1
    public final boolean c() {
        return this.R.c();
    }

    @Override // o2.e1
    public final boolean d(v0 v0Var) {
        if (this.N != null) {
            return this.R.d(v0Var);
        }
        for (q qVar : this.O) {
            if (!qVar.Y) {
                u0 u0Var = new u0();
                u0Var.f1969a = qVar.f6432k0;
                qVar.d(new v0(u0Var));
            }
        }
        return false;
    }

    public final q e(String str, int i, Uri[] uriArr, t1.o[] oVarArr, t1.o oVar, List list, Map map, long j8) {
        return new q(str, i, this.K, new i(this.f6394v, this.f6395w, uriArr, oVarArr, this.f6396x, this.f6397y, this.F, list, this.J), map, this.D, j8, oVar, this.f6398z, this.A, this.B, this.C, this.I);
    }

    @Override // o2.e1
    public final long h() {
        return this.R.h();
    }

    @Override // o2.b0
    public final void i(boolean z2, long j8) throws Throwable {
        for (q qVar : this.P) {
            if (qVar.X && !qVar.E()) {
                int length = qVar.Q.length;
                for (int i = 0; i < length; i++) {
                    qVar.Q[i].j(j8, z2, qVar.f6430i0[i]);
                }
            }
        }
    }

    @Override // o2.b0
    public final long j() {
        return -9223372036854775807L;
    }

    @Override // o2.b0
    public final long l(long j8, u1 u1Var) {
        q[] qVarArr = this.P;
        int length = qVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            q qVar = qVarArr[i];
            if (qVar.V == 2) {
                i iVar = qVar.f6443y;
                j2.c cVar = iVar.f6374g;
                int iM = iVar.f6384r.m();
                Uri[] uriArr = iVar.f6373e;
                j2.l lVarA = (iM >= uriArr.length || iM == -1) ? null : cVar.a(uriArr[iVar.f6384r.i()], true);
                if (lVarA != null) {
                    f0 f0Var = lVarA.f6720r;
                    if (!f0Var.isEmpty()) {
                        long j9 = lVarA.f6711h - cVar.I;
                        long j10 = j8 - j9;
                        int iC = w1.b0.c(f0Var, Long.valueOf(j10), true);
                        long j11 = ((j2.i) f0Var.get(iC)).f6702z;
                        return u1Var.a(j10, j11, (!lVarA.f6743c || iC == f0Var.size() - 1) ? j11 : ((j2.i) f0Var.get(iC + 1)).f6702z) + j9;
                    }
                }
            } else {
                i++;
            }
        }
        return j8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0199  */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3, types: [int] */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // o2.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m(r2.s[] r40, boolean[] r41, o2.c1[] r42, boolean[] r43, long r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 855
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.k.m(r2.s[], boolean[], o2.c1[], boolean[], long):long");
    }

    @Override // o2.b0
    public final void n(o2.a0 a0Var, long j8) {
        c cVar;
        boolean z2;
        List list;
        List list2;
        int i;
        HashSet hashSet;
        HashSet hashSet2;
        int i10;
        boolean z10;
        c cVar2;
        int i11;
        boolean z11;
        Uri[] uriArr;
        this.L = a0Var;
        j2.c cVar3 = this.f6395w;
        cVar3.getClass();
        cVar3.f6660z.add(this);
        j2.o oVar = cVar3.E;
        oVar.getClass();
        List list3 = oVar.f;
        List list4 = oVar.f6736e;
        Map map = Collections.EMPTY_MAP;
        boolean zIsEmpty = list4.isEmpty();
        List list5 = oVar.f6737g;
        int i12 = 0;
        this.M = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        c cVar4 = this.f6394v;
        boolean z12 = this.H;
        if (zIsEmpty) {
            cVar = cVar4;
            z2 = z12;
            list = list3;
            list2 = list5;
        } else {
            t1.o oVar2 = oVar.f6738h;
            int size = list4.size();
            int[] iArr = new int[size];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                list2 = list5;
                if (i13 >= list4.size()) {
                    break;
                }
                t1.o oVar3 = ((j2.n) list4.get(i13)).f6730b;
                int i15 = oVar3.f12069v;
                String str = oVar3.f12058k;
                if (i15 > 0 || w1.b0.s(2, str) != null) {
                    iArr[i13] = 2;
                    i14++;
                } else if (w1.b0.s(1, str) != null) {
                    iArr[i13] = 1;
                    i12++;
                } else {
                    iArr[i13] = -1;
                }
                i13++;
                list5 = list2;
            }
            if (i14 > 0) {
                z11 = false;
                cVar2 = cVar4;
                i11 = i14;
                z10 = true;
            } else if (i12 < size) {
                z10 = false;
                cVar2 = cVar4;
                i11 = size - i12;
                z11 = true;
            } else {
                z10 = false;
                cVar2 = cVar4;
                i11 = size;
                z11 = false;
            }
            Uri[] uriArr2 = new Uri[i11];
            t1.o[] oVarArr = new t1.o[i11];
            int[] iArr2 = new int[i11];
            int i16 = 0;
            int i17 = 0;
            while (i16 < list4.size()) {
                if (z10) {
                    uriArr = uriArr2;
                    if (iArr[i16] == 2) {
                    }
                    i16++;
                    uriArr2 = uriArr;
                } else {
                    uriArr = uriArr2;
                }
                if (!z11 || iArr[i16] != 1) {
                    j2.n nVar = (j2.n) list4.get(i16);
                    uriArr[i17] = nVar.f6729a;
                    oVarArr[i17] = nVar.f6730b;
                    iArr2[i17] = i16;
                    i17++;
                }
                i16++;
                uriArr2 = uriArr;
            }
            Uri[] uriArr3 = uriArr2;
            String str2 = oVarArr[0].f12058k;
            int iR = w1.b0.r(2, str2);
            int iR2 = w1.b0.r(1, str2);
            boolean z13 = (iR2 == 1 || (iR2 == 0 && list3.isEmpty())) && iR <= 1 && iR2 + iR > 0;
            c cVar5 = cVar2;
            list = list3;
            z2 = z12;
            q qVarE = e("main", (z10 || iR2 <= 0) ? 0 : 1, uriArr3, oVarArr, oVar.f6738h, oVar.i, map, j8);
            arrayList.add(qVarE);
            arrayList2.add(iArr2);
            if (z2 && z13) {
                ArrayList arrayList3 = new ArrayList();
                if (iR > 0) {
                    t1.o[] oVarArr2 = new t1.o[i11];
                    int i18 = 0;
                    while (i18 < i11) {
                        t1.o oVar4 = oVarArr[i18];
                        String strS = w1.b0.s(2, oVar4.f12058k);
                        String strE = t1.f0.e(strS);
                        t1.n nVar2 = new t1.n();
                        nVar2.f12026a = oVar4.f12050a;
                        nVar2.f12027b = oVar4.f12051b;
                        nVar2.f12028c = f0.m(oVar4.f12052c);
                        nVar2.f12035l = t1.f0.p(oVar4.f12060m);
                        nVar2.f12036m = t1.f0.p(strE);
                        nVar2.f12033j = strS;
                        nVar2.f12034k = oVar4.f12059l;
                        nVar2.f12032h = oVar4.f12056h;
                        nVar2.i = oVar4.i;
                        nVar2.f12043t = oVar4.f12068u;
                        nVar2.f12044u = oVar4.f12069v;
                        nVar2.f12047x = oVar4.f12072y;
                        nVar2.f12030e = oVar4.f12054e;
                        nVar2.f = oVar4.f;
                        oVarArr2[i18] = new t1.o(nVar2);
                        i18++;
                        oVarArr = oVarArr;
                    }
                    t1.o[] oVarArr3 = oVarArr;
                    arrayList3.add(new t0("main", oVarArr2));
                    if (iR2 > 0 && (oVar2 != null || list.isEmpty())) {
                        arrayList3.add(new t0("main:audio", f(oVarArr3[0], oVar2, false)));
                    }
                    List list6 = oVar.i;
                    if (list6 != null) {
                        for (int i19 = 0; i19 < list6.size(); i19++) {
                            arrayList3.add(new t0(d0.d.h(i19, "main:cc:"), cVar5.b((t1.o) list6.get(i19))));
                        }
                    }
                    cVar = cVar5;
                } else {
                    cVar = cVar5;
                    t1.o[] oVarArr4 = new t1.o[i11];
                    for (int i20 = 0; i20 < i11; i20++) {
                        oVarArr4[i20] = f(oVarArr[i20], oVar2, true);
                    }
                    arrayList3.add(new t0("main", oVarArr4));
                }
                t1.n nVar3 = new t1.n();
                nVar3.f12026a = "ID3";
                nVar3.f12036m = t1.f0.p("application/id3");
                t0 t0Var = new t0("main:id3", new t1.o(nVar3));
                arrayList3.add(t0Var);
                qVarE.H((t0[]) arrayList3.toArray(new t0[0]), arrayList3.indexOf(t0Var));
            } else {
                cVar = cVar5;
            }
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        HashSet hashSet3 = new HashSet();
        int i21 = 0;
        while (i21 < list.size()) {
            List list7 = list;
            String str3 = ((j2.m) list7.get(i21)).f6728c;
            if (hashSet3.add(str3)) {
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
                boolean z14 = true;
                for (int i22 = 0; i22 < list7.size(); i22++) {
                    if (str3.equals(((j2.m) list7.get(i22)).f6728c)) {
                        j2.m mVar = (j2.m) list7.get(i22);
                        arrayList6.add(Integer.valueOf(i22));
                        Uri uri = mVar.f6726a;
                        t1.o oVar5 = mVar.f6727b;
                        arrayList4.add(uri);
                        arrayList5.add(oVar5);
                        z14 &= w1.b0.r(1, oVar5.f12058k) == 1;
                    }
                }
                String strConcat = "audio:".concat(str3);
                int i23 = w1.b0.f13686a;
                list = list7;
                hashSet2 = hashSet3;
                i10 = i21;
                q qVarE2 = e(strConcat, 1, (Uri[]) arrayList4.toArray(new Uri[0]), (t1.o[]) arrayList5.toArray(new t1.o[0]), null, Collections.EMPTY_LIST, map, j8);
                arrayList2.add(z7.b.N(arrayList6));
                arrayList.add(qVarE2);
                if (z2 && z14) {
                    qVarE2.H(new t0[]{new t0(strConcat, (t1.o[]) arrayList5.toArray(new t1.o[0]))}, new int[0]);
                }
            } else {
                hashSet2 = hashSet3;
                i10 = i21;
                list = list7;
            }
            i21 = i10 + 1;
            hashSet3 = hashSet2;
        }
        this.Q = arrayList.size();
        ArrayList arrayList7 = new ArrayList(list2.size());
        ArrayList arrayList8 = new ArrayList(list2.size());
        ArrayList arrayList9 = new ArrayList(list2.size());
        HashSet hashSet4 = new HashSet();
        int i24 = 0;
        while (i24 < list2.size()) {
            List list8 = list2;
            String str4 = ((j2.m) list8.get(i24)).f6728c;
            if (hashSet4.add(str4)) {
                arrayList7.clear();
                arrayList8.clear();
                arrayList9.clear();
                for (int i25 = 0; i25 < list8.size(); i25++) {
                    if (str4.equals(((j2.m) list8.get(i25)).f6728c)) {
                        j2.m mVar2 = (j2.m) list8.get(i25);
                        arrayList9.add(Integer.valueOf(i25));
                        arrayList7.add(mVar2.f6726a);
                        arrayList8.add(mVar2.f6727b);
                    }
                }
                String strConcat2 = "subtitle:".concat(str4);
                t1.o[] oVarArr5 = (t1.o[]) arrayList8.toArray(new t1.o[0]);
                int i26 = w1.b0.f13686a;
                Uri[] uriArr4 = (Uri[]) arrayList7.toArray(new Uri[0]);
                y9.c0 c0Var = f0.f14553w;
                list2 = list8;
                i = i24;
                hashSet = hashSet4;
                q qVarE3 = e(strConcat2, 3, uriArr4, oVarArr5, null, z0.f14637z, map, j8);
                arrayList2.add(z7.b.N(arrayList9));
                arrayList.add(qVarE3);
                int length = oVarArr5.length;
                t1.o[] oVarArr6 = new t1.o[length];
                for (int i27 = 0; i27 < length; i27++) {
                    oVarArr6[i27] = cVar.b(oVarArr5[i27]);
                }
                qVarE3.H(new t0[]{new t0(strConcat2, oVarArr6)}, new int[0]);
            } else {
                hashSet = hashSet4;
                i = i24;
                list2 = list8;
            }
            i24 = i + 1;
            hashSet4 = hashSet;
        }
        this.O = (q[]) arrayList.toArray(new q[0]);
        this.M = this.O.length;
        for (int i28 = 0; i28 < this.Q; i28++) {
            this.O[i28].f6443y.f6378l = true;
        }
        for (q qVar : this.O) {
            if (!qVar.Y) {
                u0 u0Var = new u0();
                u0Var.f1969a = qVar.f6432k0;
                qVar.d(new v0(u0Var));
            }
        }
        this.P = this.O;
    }

    @Override // o2.b0
    public final j1 q() {
        j1 j1Var = this.N;
        j1Var.getClass();
        return j1Var;
    }

    @Override // o2.e1
    public final long u() {
        return this.R.u();
    }

    @Override // o2.b0
    public final void v() throws IOException {
        for (q qVar : this.O) {
            qVar.G();
            if (qVar.o0 && !qVar.Y) {
                throw g0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // o2.b0
    public final long w(long j8) throws Throwable {
        q[] qVarArr = this.P;
        if (qVarArr.length > 0) {
            boolean zJ = qVarArr[0].J(false, j8);
            int i = 1;
            while (true) {
                q[] qVarArr2 = this.P;
                if (i >= qVarArr2.length) {
                    break;
                }
                qVarArr2[i].J(zJ, j8);
                i++;
            }
            if (zJ) {
                ((SparseArray) this.F.f273w).clear();
            }
        }
        return j8;
    }

    @Override // o2.e1
    public final void x(long j8) {
        this.R.x(j8);
    }
}
