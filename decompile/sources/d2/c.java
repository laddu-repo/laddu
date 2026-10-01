package d2;

import a2.c2;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.p4;
import db.c1;
import db.i0;
import db.k0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o5.e0;
import okhttp3.HttpUrl;
import q2.a0;
import q2.a1;
import q2.b1;
import q2.k1;
import q2.y0;
import q2.z;
import q2.z0;
import r1.e1;
import r1.q;
import t2.s;
import u5.r;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements a0, a1, r2.g {
    public static final Pattern W = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern X = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final f2.o A;
    public final e0 B;
    public final c6.h C;
    public final long D;
    public final u2.p E;
    public final u2.e F;
    public final k1 G;
    public final b[] H;
    public final e0 I;
    public final p J;
    public final b2.k L;
    public final f2.l M;
    public z N;
    public q2.n Q;
    public e2.c R;
    public int S;
    public List T;
    public long V;

    /* renamed from: x, reason: collision with root package name */
    public final int f3703x;

    /* renamed from: y, reason: collision with root package name */
    public final b2.k f3704y;

    /* renamed from: z, reason: collision with root package name */
    public final w1.a0 f3705z;
    public boolean U = true;
    public r2.h[] O = new r2.h[0];
    public m[] P = new m[0];
    public final IdentityHashMap K = new IdentityHashMap();

    public c(int i6, e2.c cVar, c6.h hVar, int i10, b2.k kVar, w1.a0 a0Var, f2.o oVar, f2.l lVar, e0 e0Var, b2.k kVar2, long j, u2.p pVar, u2.e eVar, e0 e0Var2, r rVar, b2.m mVar) {
        String i11;
        int i12;
        int i13;
        int[][] iArr;
        boolean[] zArr;
        q[][] qVarArr;
        q[] qVarArr2;
        e2.f d10;
        Integer num;
        f2.o oVar2 = oVar;
        this.f3703x = i6;
        this.R = cVar;
        this.C = hVar;
        this.S = i10;
        this.f3704y = kVar;
        this.f3705z = a0Var;
        this.A = oVar2;
        this.M = lVar;
        this.B = e0Var;
        this.L = kVar2;
        this.D = j;
        this.E = pVar;
        this.F = eVar;
        this.I = e0Var2;
        this.J = new p(cVar, rVar, eVar);
        e0Var2.getClass();
        i0 i0Var = k0.f4008y;
        c1 c1Var = c1.B;
        this.Q = new q2.n(c1Var, c1Var);
        e2.h b10 = cVar.b(i10);
        List list = b10.f4247d;
        this.T = list;
        List list2 = b10.f4246c;
        int size = list2.size();
        HashMap hashMap = new HashMap(db.r.b(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i14 = 0; i14 < size; i14++) {
            hashMap.put(Long.valueOf(((e2.a) list2.get(i14)).f4204a), Integer.valueOf(i14));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i14));
            arrayList.add(arrayList2);
            sparseArray.put(i14, arrayList2);
        }
        for (int i15 = 0; i15 < size; i15++) {
            e2.a aVar = (e2.a) list2.get(i15);
            List list3 = aVar.f4208e;
            List list4 = aVar.f4209f;
            e2.f d11 = d("http://dashif.org/guidelines/trickmode", list3);
            d11 = d11 == null ? d("http://dashif.org/guidelines/trickmode", list4) : d11;
            int intValue = (d11 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(d11.f4238b)))) == null || !b(aVar, (e2.a) list2.get(num.intValue()))) ? i15 : num.intValue();
            if (intValue == i15 && (d10 = d("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = d10.f4238b;
                String str2 = u1.a0.f12750a;
                for (String str3 : str.split(",", -1)) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(str3)));
                    if (num2 != null && b(aVar, (e2.a) list2.get(num2.intValue()))) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i15) {
                List list5 = (List) sparseArray.get(i15);
                List list6 = (List) sparseArray.get(intValue);
                list6.addAll(list5);
                sparseArray.put(i15, list6);
                arrayList.remove(list5);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2];
        for (int i16 = 0; i16 < size2; i16++) {
            int[] U = a8.f.U((Collection) arrayList.get(i16));
            iArr2[i16] = U;
            Arrays.sort(U);
        }
        boolean[] zArr2 = new boolean[size2];
        q[][] qVarArr3 = new q[size2];
        int i17 = 0;
        int i18 = 0;
        while (i17 < size2) {
            int[] iArr3 = iArr2[i17];
            int length = iArr3.length;
            int i19 = 0;
            while (true) {
                if (i19 >= length) {
                    iArr = iArr2;
                    break;
                }
                List list7 = ((e2.a) list2.get(iArr3[i19])).f4206c;
                iArr = iArr2;
                for (int i20 = 0; i20 < list7.size(); i20++) {
                    if (!((e2.m) list7.get(i20)).A.isEmpty()) {
                        zArr2[i17] = true;
                        i18++;
                        break;
                    }
                }
                i19++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i17];
            int length2 = iArr4.length;
            int i21 = 0;
            while (true) {
                if (i21 < length2) {
                    int i22 = iArr4[i21];
                    e2.a aVar2 = (e2.a) list2.get(i22);
                    List list8 = ((e2.a) list2.get(i22)).f4207d;
                    int[] iArr5 = iArr4;
                    int i23 = 0;
                    while (i23 < list8.size()) {
                        e2.f fVar = (e2.f) list8.get(i23);
                        zArr = zArr2;
                        qVarArr = qVarArr3;
                        if ("urn:scte:dash:cc:cea-608:2015".equals(fVar.f4237a)) {
                            r1.p pVar2 = new r1.p();
                            pVar2.f11611m = r1.k0.p("application/cea-608");
                            pVar2.f11600a = r4.a.m(new StringBuilder(), aVar2.f4204a, ":cea608");
                            qVarArr2 = t(fVar, W, new q(pVar2));
                            break;
                        }
                        if ("urn:scte:dash:cc:cea-708:2015".equals(fVar.f4237a)) {
                            r1.p pVar3 = new r1.p();
                            pVar3.f11611m = r1.k0.p("application/cea-708");
                            pVar3.f11600a = r4.a.m(new StringBuilder(), aVar2.f4204a, ":cea708");
                            qVarArr2 = t(fVar, X, new q(pVar3));
                            break;
                        }
                        i23++;
                        qVarArr3 = qVarArr;
                        zArr2 = zArr;
                    }
                    i21++;
                    iArr4 = iArr5;
                } else {
                    zArr = zArr2;
                    qVarArr = qVarArr3;
                    qVarArr2 = new q[0];
                    break;
                }
            }
            qVarArr[i17] = qVarArr2;
            if (qVarArr2.length != 0) {
                i18++;
            }
            i17++;
            qVarArr3 = qVarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        q[][] qVarArr4 = qVarArr3;
        int size3 = list.size() + i18 + size2;
        e1[] e1VarArr = new e1[size3];
        b[] bVarArr = new b[size3];
        int i24 = 0;
        int i25 = 0;
        while (i25 < size2) {
            int[] iArr7 = iArr6[i25];
            ArrayList arrayList3 = new ArrayList();
            for (int i26 : iArr7) {
                arrayList3.addAll(((e2.a) list2.get(i26)).f4206c);
            }
            int size4 = arrayList3.size();
            q[] qVarArr5 = new q[size4];
            int i27 = 0;
            while (i27 < size4) {
                int i28 = size2;
                q qVar = ((e2.m) arrayList3.get(i27)).f4257x;
                int i29 = i24;
                r1.p a10 = qVar.a();
                a10.N = oVar2.l(qVar);
                qVarArr5[i27] = new q(a10);
                i27++;
                size2 = i28;
                i24 = i29;
            }
            int i30 = size2;
            int i31 = i24;
            e2.a aVar3 = (e2.a) list2.get(iArr7[0]);
            long j10 = aVar3.f4204a;
            if (j10 != -1) {
                i11 = Long.toString(j10);
            } else {
                i11 = h8.c.i(i25, "unset:");
            }
            int i32 = i31 + 1;
            if (zArr3[i25]) {
                i12 = i31 + 2;
            } else {
                i12 = i32;
                i32 = -1;
            }
            if (qVarArr4[i25].length != 0) {
                i13 = i12 + 1;
            } else {
                i13 = i12;
                i12 = -1;
            }
            o(kVar, qVarArr5);
            List list9 = list2;
            e1VarArr[i31] = new e1(i11, qVarArr5);
            int i33 = aVar3.f4205b;
            i0 i0Var2 = k0.f4008y;
            c1 c1Var2 = c1.B;
            b bVar = new b(i33, 0, iArr7, i31, i32, i12, -1, c1Var2);
            int[] iArr8 = iArr7;
            int i34 = i31;
            bVarArr[i34] = bVar;
            int i35 = -1;
            if (i32 != -1) {
                String c10 = w8.k.c(i11, ":emsg");
                r1.p pVar4 = new r1.p();
                pVar4.f11600a = c10;
                pVar4.f11611m = r1.k0.p("application/x-emsg");
                e1VarArr[i32] = new e1(c10, new q(pVar4));
                b bVar2 = new b(5, 1, iArr8, i34, -1, -1, -1, c1Var2);
                iArr8 = iArr8;
                i34 = i34;
                bVarArr[i32] = bVar2;
                i35 = -1;
            }
            if (i12 != i35) {
                String c11 = w8.k.c(i11, ":cc");
                bVarArr[i12] = new b(3, 1, iArr8, i34, -1, -1, -1, k0.l(qVarArr4[i25]));
                o(kVar, qVarArr4[i25]);
                e1VarArr[i12] = new e1(c11, qVarArr4[i25]);
            }
            i25++;
            size2 = i30;
            oVar2 = oVar;
            i24 = i13;
            list2 = list9;
        }
        int i36 = 0;
        while (i36 < list.size()) {
            e2.g gVar = (e2.g) list.get(i36);
            r1.p pVar5 = new r1.p();
            pVar5.f11600a = gVar.a();
            pVar5.f11611m = r1.k0.p("application/x-emsg");
            e1VarArr[i24] = new e1(gVar.a() + ":" + i36, new q(pVar5));
            i0 i0Var3 = k0.f4008y;
            bVarArr[i24] = new b(5, 2, new int[0], -1, -1, -1, i36, c1.B);
            i36++;
            i24++;
        }
        Pair create = Pair.create(new k1(e1VarArr), bVarArr);
        this.G = (k1) create.first;
        this.H = (b[]) create.second;
    }

    public static boolean b(e2.a aVar, e2.a aVar2) {
        int i6 = aVar.f4205b;
        List list = aVar.f4206c;
        int i10 = aVar2.f4205b;
        List list2 = aVar2.f4206c;
        if (i6 == i10) {
            if (!list.isEmpty() && !list2.isEmpty()) {
                q qVar = ((e2.m) list.get(0)).f4257x;
                q qVar2 = ((e2.m) list2.get(0)).f4257x;
                int i11 = qVar.f11663f & (-16385);
                int i12 = qVar2.f11663f & (-16385);
                if (Objects.equals(qVar.f11661d, qVar2.f11661d) && i11 == i12) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static e2.f d(String str, List list) {
        for (int i6 = 0; i6 < list.size(); i6++) {
            e2.f fVar = (e2.f) list.get(i6);
            if (str.equals(fVar.f4237a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void o(b2.k kVar, q[] qVarArr) {
        String str;
        for (int i6 = 0; i6 < qVarArr.length; i6++) {
            q qVar = qVarArr[i6];
            p4 p4Var = (p4) kVar.A;
            if (p4Var.f2388a && ((p.l) p4Var.f2389b).g(qVar)) {
                r1.p a10 = qVar.a();
                String str2 = qVar.f11667k;
                a10.f11611m = r1.k0.p("application/x-media3-cues");
                a10.K = ((p.l) p4Var.f2389b).o(qVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(qVar.f11670n);
                if (str2 != null) {
                    str = " ".concat(str2);
                } else {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                sb2.append(str);
                a10.j = sb2.toString();
                a10.f11616r = Long.MAX_VALUE;
                qVar = new q(a10);
            }
            qVarArr[i6] = qVar;
        }
    }

    public static q[] t(e2.f fVar, Pattern pattern, q qVar) {
        String str = fVar.f4238b;
        if (str == null) {
            return new q[]{qVar};
        }
        String str2 = u1.a0.f12750a;
        String[] split = str.split(";", -1);
        q[] qVarArr = new q[split.length];
        for (int i6 = 0; i6 < split.length; i6++) {
            Matcher matcher = pattern.matcher(split[i6]);
            if (!matcher.matches()) {
                return new q[]{qVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            r1.p a10 = qVar.a();
            a10.f11600a = qVar.f11658a + ":" + parseInt;
            a10.J = parseInt;
            a10.f11603d = matcher.group(2);
            qVarArr[i6] = new q(a10);
        }
        return qVarArr;
    }

    @Override // q2.b1
    public final boolean a() {
        return this.Q.a();
    }

    @Override // q2.a0
    public final long c(long j, c2 c2Var) {
        for (r2.h hVar : this.O) {
            if (hVar.f11791x == 2) {
                return hVar.B.c(j, c2Var);
            }
        }
        return j;
    }

    @Override // q2.b1
    public final long e() {
        return this.Q.e();
    }

    @Override // q2.b1
    public final boolean f(a2.a1 a1Var) {
        return this.Q.f(a1Var);
    }

    @Override // q2.a0
    public final void g() {
        this.E.b();
    }

    @Override // q2.a0
    public final long h(long j) {
        long j10;
        for (r2.h hVar : this.O) {
            hVar.B(j);
        }
        for (m mVar : this.P) {
            int a10 = u1.a0.a(mVar.f3756z, j, true);
            mVar.D = a10;
            if (mVar.A && a10 == mVar.f3756z.length) {
                j10 = j;
            } else {
                j10 = -9223372036854775807L;
            }
            mVar.E = j10;
        }
        return j;
    }

    @Override // q2.a0
    public final void i(long j) {
        for (r2.h hVar : this.O) {
            hVar.i(j);
        }
    }

    @Override // q2.a1
    public final void j(b1 b1Var) {
        this.N.j(this);
    }

    @Override // q2.a0
    public final void l(z zVar, long j) {
        this.N = zVar;
        zVar.k(this);
    }

    @Override // q2.a0
    public final long m() {
        r2.h[] hVarArr = this.O;
        int length = hVarArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            r2.h hVar = hVarArr[i6];
            hVar.getClass();
            try {
                if (hVar.U) {
                    return this.V;
                }
            } finally {
                hVar.U = false;
            }
        }
        return -9223372036854775807L;
    }

    public final int n(int[] iArr, int i6) {
        int i10 = iArr[i6];
        if (i10 != -1) {
            b[] bVarArr = this.H;
            int i11 = bVarArr[i10].f3699e;
            for (int i12 = 0; i12 < iArr.length; i12++) {
                int i13 = iArr[i12];
                if (i13 == i11 && bVarArr[i13].f3697c == 0) {
                    return i12;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [db.k0] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v4 */
    @Override // q2.a0
    public final long p(s[] sVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j) {
        int i6;
        boolean z10;
        int i10;
        int[] iArr;
        int[] iArr2;
        int i11;
        boolean z11;
        e1 e1Var;
        int i12;
        c1 c1Var;
        int i13;
        o oVar;
        boolean z12;
        int[] iArr3 = new int[sVarArr.length];
        char c10 = 0;
        int i14 = 0;
        while (true) {
            i6 = -1;
            if (i14 >= sVarArr.length) {
                break;
            }
            s sVar = sVarArr[i14];
            if (sVar != null) {
                iArr3[i14] = this.G.b(sVar.c());
            } else {
                iArr3[i14] = -1;
            }
            i14++;
        }
        for (int i15 = 0; i15 < sVarArr.length; i15++) {
            if (sVarArr[i15] == null || !zArr[i15]) {
                ?? r32 = z0VarArr[i15];
                if (r32 instanceof r2.h) {
                    ((r2.h) r32).A(this);
                } else if (r32 instanceof r2.f) {
                    r2.f fVar = (r2.f) r32;
                    r2.h hVar = fVar.B;
                    boolean[] zArr3 = hVar.A;
                    int i16 = fVar.f11790z;
                    u1.c.g(zArr3[i16]);
                    hVar.A[i16] = false;
                }
                z0VarArr[i15] = 0;
            }
        }
        int i17 = 0;
        while (true) {
            z10 = true;
            boolean z13 = true;
            if (i17 >= sVarArr.length) {
                break;
            }
            ?? r33 = z0VarArr[i17];
            if ((r33 instanceof q2.r) || (r33 instanceof r2.f)) {
                int n10 = n(iArr3, i17);
                if (n10 == -1) {
                    z12 = z0VarArr[i17] instanceof q2.r;
                } else {
                    ?? r72 = z0VarArr[i17];
                    if (!(r72 instanceof r2.f) || ((r2.f) r72).f11788x != z0VarArr[n10]) {
                        z13 = false;
                    }
                    z12 = z13;
                }
                if (!z12) {
                    ?? r34 = z0VarArr[i17];
                    if (r34 instanceof r2.f) {
                        r2.f fVar2 = (r2.f) r34;
                        r2.h hVar2 = fVar2.B;
                        boolean[] zArr4 = hVar2.A;
                        int i18 = fVar2.f11790z;
                        u1.c.g(zArr4[i18]);
                        hVar2.A[i18] = false;
                    }
                    z0VarArr[i17] = 0;
                }
            }
            i17++;
        }
        int i19 = 0;
        while (true) {
            i10 = 3;
            if (i19 >= sVarArr.length) {
                break;
            }
            s sVar2 = sVarArr[i19];
            if (sVar2 == null) {
                iArr2 = iArr3;
                i11 = i19;
            } else {
                ?? r35 = z0VarArr[i19];
                if (r35 == 0) {
                    zArr2[i19] = z10;
                    b bVar = this.H[iArr3[i19]];
                    int i20 = bVar.f3697c;
                    if (i20 == 0) {
                        int i21 = bVar.f3700f;
                        if (i21 != i6) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            e1Var = this.G.a(i21);
                            i12 = 1;
                        } else {
                            e1Var = null;
                            i12 = 0;
                        }
                        int i22 = bVar.f3701g;
                        if (i22 != i6) {
                            c1Var = this.H[i22].f3702h;
                        } else {
                            i0 i0Var = k0.f4008y;
                            c1Var = c1.B;
                        }
                        int size = c1Var.size() + i12;
                        q[] qVarArr = new q[size];
                        int[] iArr4 = new int[size];
                        if (z11) {
                            qVarArr[c10] = e1Var.f11389d[c10];
                            iArr4[c10] = 5;
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i23 = 0; i23 < c1Var.size(); i23++) {
                            q qVar = (q) c1Var.get(i23);
                            qVarArr[i13] = qVar;
                            iArr4[i13] = 3;
                            arrayList.add(qVar);
                            i13 += z10 ? 1 : 0;
                        }
                        if (this.R.f4217d && z11) {
                            p pVar = this.J;
                            oVar = new o(pVar, pVar.f3764x);
                        } else {
                            oVar = null;
                        }
                        b2.k kVar = this.f3704y;
                        u2.p pVar2 = this.E;
                        e2.c cVar = this.R;
                        c6.h hVar3 = this.C;
                        int i24 = this.S;
                        int[] iArr5 = bVar.f3695a;
                        int i25 = bVar.f3696b;
                        long j10 = this.D;
                        iArr2 = iArr3;
                        w1.a0 a0Var = this.f3705z;
                        i11 = i19;
                        w1.h c11 = ((w1.g) kVar.f1384z).c();
                        if (a0Var != null) {
                            c11.q(a0Var);
                        }
                        o oVar2 = oVar;
                        r2.h hVar4 = new r2.h(bVar.f3696b, iArr4, qVarArr, new l((p4) kVar.A, pVar2, cVar, hVar3, i24, iArr5, sVar2, i25, c11, j10, kVar.f1383y, z11, arrayList, oVar), this, this.F, j, this.A, this.M, this.B, this.L, this.U);
                        synchronized (this) {
                            this.K.put(hVar4, oVar2);
                        }
                        z0VarArr[i11] = hVar4;
                    } else {
                        iArr2 = iArr3;
                        i11 = i19;
                        if (i20 == 2) {
                            z0VarArr[i11] = new m((e2.g) this.T.get(bVar.f3698d), sVar2.c().f11389d[0], this.R.f4217d);
                        }
                    }
                } else {
                    iArr2 = iArr3;
                    i11 = i19;
                    if (r35 instanceof r2.h) {
                        ((l) ((r2.h) r35).B).j = sVar2;
                    }
                }
            }
            i19 = i11 + 1;
            iArr3 = iArr2;
            c10 = 0;
            i6 = -1;
            z10 = true;
        }
        int[] iArr6 = iArr3;
        int i26 = 0;
        while (i26 < sVarArr.length) {
            if (z0VarArr[i26] == 0 && sVarArr[i26] != null) {
                b bVar2 = this.H[iArr6[i26]];
                if (bVar2.f3697c == 1) {
                    iArr = iArr6;
                    int n11 = n(iArr, i26);
                    if (n11 == -1) {
                        z0VarArr[i26] = new Object();
                    } else {
                        r2.h hVar5 = (r2.h) z0VarArr[n11];
                        int i27 = bVar2.f3696b;
                        boolean[] zArr5 = hVar5.A;
                        y0[] y0VarArr = hVar5.K;
                        for (int i28 = 0; i28 < y0VarArr.length; i28++) {
                            if (hVar5.f11792y[i28] == i27) {
                                u1.c.g(!zArr5[i28]);
                                zArr5[i28] = true;
                                y0VarArr[i28].H(true, j);
                                z0VarArr[i26] = new r2.f(hVar5, hVar5, y0VarArr[i28], i28);
                            }
                        }
                        throw new IllegalStateException();
                    }
                    i26++;
                    iArr6 = iArr;
                } else {
                    iArr = iArr6;
                }
            } else {
                iArr = iArr6;
            }
            i26++;
            iArr6 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (?? r82 : z0VarArr) {
            if (r82 instanceof r2.h) {
                arrayList2.add((r2.h) r82);
            } else if (r82 instanceof m) {
                arrayList3.add((m) r82);
            }
        }
        r2.h[] hVarArr = new r2.h[arrayList2.size()];
        this.O = hVarArr;
        arrayList2.toArray(hVarArr);
        m[] mVarArr = new m[arrayList3.size()];
        this.P = mVarArr;
        arrayList3.toArray(mVarArr);
        e0 e0Var = this.I;
        AbstractList w10 = db.r.w(arrayList2, new com.unity3d.ads.adplayer.b(i10));
        e0Var.getClass();
        this.Q = new q2.n(arrayList2, w10);
        if (this.U) {
            this.U = false;
            this.V = j;
        }
        return j;
    }

    @Override // q2.a0
    public final k1 q() {
        return this.G;
    }

    @Override // q2.b1
    public final long r() {
        return this.Q.r();
    }

    @Override // q2.b1
    public final void s(long j) {
        int i6;
        r2.h[] hVarArr = this.O;
        int length = hVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            r2.h hVar = hVarArr[i10];
            if (!hVar.F.d()) {
                long d10 = this.R.d(this.S);
                y0 y0Var = hVar.J;
                u1.c.g(!hVar.F.d());
                if (!hVar.w() && d10 != -9223372036854775807L && !hVar.H.isEmpty()) {
                    r2.a u3 = hVar.u();
                    long j10 = u3.I;
                    if (j10 == -9223372036854775807L) {
                        j10 = u3.E;
                    }
                    if (j10 > d10) {
                        long q9 = y0Var.q();
                        if (q9 > d10) {
                            y0Var.l(Math.max(d10, y0Var.r() + 1));
                            y0[] y0VarArr = hVar.K;
                            int length2 = y0VarArr.length;
                            int i11 = 0;
                            while (i11 < length2) {
                                y0 y0Var2 = y0VarArr[i11];
                                y0Var2.l(Math.max(d10, y0Var2.r() + 1));
                                i11++;
                                i10 = i10;
                            }
                            i6 = i10;
                            hVar.D.C(hVar.f11791x, d10, q9);
                            i10 = i6 + 1;
                        }
                    }
                }
            }
            i6 = i10;
            i10 = i6 + 1;
        }
        this.Q.s(j);
    }
}
