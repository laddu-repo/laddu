package g2;

import a2.a1;
import a2.z0;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import com.google.android.gms.internal.measurement.j4;
import j2.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o5.e0;
import q2.b1;
import q2.k1;
import q2.u;
import q2.x0;
import r1.e1;
import r1.j0;
import r1.k0;
import u1.a0;
import w1.v;
import y2.f0;
import y2.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q implements u2.j, u2.m, b1, y2.q, x0 {

    /* renamed from: v0, reason: collision with root package name */
    public static final Set f5360v0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final i A;
    public final u2.e B;
    public final r1.q C;
    public final f2.o D;
    public final f2.l E;
    public final e0 F;
    public final u2.o G = new u2.o("Loader:HlsSampleStreamWrapper");
    public final b2.k H;
    public final int I;
    public final j4 J;
    public final ArrayList K;
    public final List L;
    public final n M;
    public final n N;
    public final Handler O;
    public final ArrayList P;
    public final Map Q;
    public r2.e R;
    public p[] S;
    public int[] T;
    public final HashSet U;
    public final SparseIntArray V;
    public o W;
    public int X;
    public int Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f5361a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f5362b0;

    /* renamed from: c0, reason: collision with root package name */
    public r1.q f5363c0;

    /* renamed from: d0, reason: collision with root package name */
    public r1.q f5364d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f5365e0;

    /* renamed from: f0, reason: collision with root package name */
    public k1 f5366f0;

    /* renamed from: g0, reason: collision with root package name */
    public Set f5367g0;

    /* renamed from: h0, reason: collision with root package name */
    public int[] f5368h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f5369i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f5370j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean[] f5371k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean[] f5372l0;

    /* renamed from: m0, reason: collision with root package name */
    public long f5373m0;

    /* renamed from: n0, reason: collision with root package name */
    public long f5374n0;
    public boolean o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f5375p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f5376q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f5377r0;

    /* renamed from: s0, reason: collision with root package name */
    public long f5378s0;

    /* renamed from: t0, reason: collision with root package name */
    public r1.m f5379t0;

    /* renamed from: u0, reason: collision with root package name */
    public j f5380u0;

    /* renamed from: x, reason: collision with root package name */
    public final String f5381x;

    /* renamed from: y, reason: collision with root package name */
    public final int f5382y;

    /* renamed from: z, reason: collision with root package name */
    public final u5.r f5383z;

    /* JADX WARN: Type inference failed for: r1v12, types: [g2.n] */
    /* JADX WARN: Type inference failed for: r1v13, types: [g2.n] */
    public q(String str, int i6, u5.r rVar, i iVar, Map map, u2.e eVar, long j, r1.q qVar, f2.o oVar, f2.l lVar, e0 e0Var, b2.k kVar, int i10) {
        this.f5381x = str;
        this.f5382y = i6;
        this.f5383z = rVar;
        this.A = iVar;
        this.Q = map;
        this.B = eVar;
        this.C = qVar;
        this.D = oVar;
        this.E = lVar;
        this.F = e0Var;
        this.H = kVar;
        this.I = i10;
        j4 j4Var = new j4(1);
        j4Var.f2311z = null;
        final int i11 = 0;
        j4Var.f2310y = false;
        j4Var.A = null;
        this.J = j4Var;
        this.T = new int[0];
        Set set = f5360v0;
        this.U = new HashSet(set.size());
        this.V = new SparseIntArray(set.size());
        this.S = new p[0];
        this.f5372l0 = new boolean[0];
        this.f5371k0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.K = arrayList;
        this.L = Collections.unmodifiableList(arrayList);
        this.P = new ArrayList();
        this.M = new Runnable(this) { // from class: g2.n

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ q f5352y;

            {
                this.f5352y = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f5352y.F();
                        return;
                    default:
                        q qVar2 = this.f5352y;
                        qVar2.Z = true;
                        qVar2.F();
                        return;
                }
            }
        };
        final int i12 = 1;
        this.N = new Runnable(this) { // from class: g2.n

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ q f5352y;

            {
                this.f5352y = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.f5352y.F();
                        return;
                    default:
                        q qVar2 = this.f5352y;
                        qVar2.Z = true;
                        qVar2.F();
                        return;
                }
            }
        };
        this.O = a0.n(null);
        this.f5373m0 = j;
        this.f5374n0 = j;
    }

    public static int B(int i6) {
        if (i6 == 1) {
            return 2;
        }
        if (i6 == 2) {
            return 3;
        }
        if (i6 == 3) {
            return 1;
        }
        return 0;
    }

    public static y2.n u(int i6, int i10) {
        u1.a.p("HlsSampleStreamWrapper", "Unmapped track with id " + i6 + " of type " + i10);
        return new y2.n();
    }

    public static r1.q w(r1.q qVar, r1.q qVar2, boolean z10) {
        String c10;
        int i6;
        int i10;
        if (qVar == null) {
            return qVar2;
        }
        String str = qVar.f11667k;
        String str2 = qVar2.f11670n;
        int i11 = k0.i(str2);
        if (a0.u(i11, str) == 1) {
            c10 = a0.v(i11, str);
            str2 = k0.e(c10);
        } else {
            c10 = k0.c(str, str2);
        }
        r1.p a10 = qVar2.a();
        a10.f11600a = qVar.f11658a;
        a10.f11601b = qVar.f11659b;
        a10.f11602c = db.k0.k(qVar.f11660c);
        a10.f11603d = qVar.f11661d;
        a10.f11604e = qVar.f11662e;
        a10.f11605f = qVar.f11663f;
        if (z10) {
            i6 = qVar.f11665h;
        } else {
            i6 = -1;
        }
        a10.f11607h = i6;
        if (z10) {
            i10 = qVar.f11666i;
        } else {
            i10 = -1;
        }
        a10.f11608i = i10;
        a10.j = c10;
        if (i11 == 2) {
            a10.f11617t = qVar.f11676u;
            a10.f11618u = qVar.f11677v;
            a10.f11621x = qVar.f11680y;
        }
        if (str2 != null) {
            a10.f11611m = k0.p(str2);
        }
        int i12 = qVar.F;
        if (i12 != -1 && i11 == 1) {
            a10.E = i12;
        }
        j0 j0Var = qVar.f11668l;
        if (j0Var != null) {
            j0 j0Var2 = qVar2.f11668l;
            if (j0Var2 != null) {
                j0Var = j0Var2.b(j0Var);
            }
            a10.f11609k = j0Var;
        }
        return new r1.q(a10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [g2.p[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [g2.p[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [y2.f0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [g2.p, q2.y0] */
    /* JADX WARN: Type inference failed for: r5v6, types: [y2.n] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // y2.q
    public final f0 A(int i6, int i10) {
        Integer valueOf = Integer.valueOf(i10);
        Set set = f5360v0;
        boolean contains = set.contains(valueOf);
        boolean z10 = false;
        HashSet hashSet = this.U;
        SparseIntArray sparseIntArray = this.V;
        ?? r52 = 0;
        r52 = 0;
        if (contains) {
            u1.c.b(set.contains(Integer.valueOf(i10)));
            int i11 = sparseIntArray.get(i10, -1);
            if (i11 != -1) {
                if (hashSet.add(Integer.valueOf(i10))) {
                    this.T[i11] = i6;
                }
                r52 = this.T[i11] == i6 ? this.S[i11] : u(i6, i10);
            }
        } else {
            int i12 = 0;
            while (true) {
                ?? r12 = this.S;
                if (i12 >= r12.length) {
                    break;
                }
                if (this.T[i12] == i6) {
                    r52 = r12[i12];
                    break;
                }
                i12++;
            }
        }
        if (r52 == 0) {
            if (this.f5377r0) {
                return u(i6, i10);
            }
            int length = this.S.length;
            if (i10 == 1 || i10 == 2) {
                z10 = true;
            }
            r52 = new p(this.B, this.D, this.E, this.Q);
            r52.f11004t = this.f5373m0;
            if (z10) {
                r52.I = this.f5379t0;
                r52.f11010z = true;
            }
            long j = this.f5378s0;
            if (r52.F != j) {
                r52.F = j;
                r52.f11010z = true;
            }
            if (this.f5380u0 != null) {
                r52.C = r6.H;
            }
            r52.f10992f = this;
            int i13 = length + 1;
            int[] copyOf = Arrays.copyOf(this.T, i13);
            this.T = copyOf;
            copyOf[length] = i6;
            p[] pVarArr = this.S;
            String str = a0.f12750a;
            ?? copyOf2 = Arrays.copyOf(pVarArr, pVarArr.length + 1);
            copyOf2[pVarArr.length] = r52;
            this.S = (p[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f5372l0, i13);
            this.f5372l0 = copyOf3;
            copyOf3[length] = z10;
            this.f5370j0 |= z10;
            hashSet.add(Integer.valueOf(i10));
            sparseIntArray.append(i10, length);
            if (B(i10) > B(this.X)) {
                this.Y = length;
                this.X = i10;
            }
            this.f5371k0 = Arrays.copyOf(this.f5371k0, i13);
        }
        if (i10 == 5) {
            if (this.W == null) {
                this.W = new o(r52, this.I);
            }
            return this.W;
        }
        return r52;
    }

    @Override // u2.j
    public final ef.g C(u2.l lVar, long j, long j10, IOException iOException, int i6) {
        boolean z10;
        ef.g gVar;
        int i10;
        r2.e eVar = (r2.e) lVar;
        boolean z11 = eVar instanceof j;
        if (z11 && !((j) eVar).f() && (iOException instanceof v) && ((i10 = ((v) iOException).A) == 410 || i10 == 404)) {
            return u2.o.A;
        }
        long j11 = eVar.F.f13559y;
        Uri uri = eVar.F.f13560z;
        u uVar = new u(j10);
        a0.e0(eVar.D);
        a0.e0(eVar.E);
        y yVar = new y(i6, 6, iOException);
        i iVar = this.A;
        u2.h I = a8.f.I(iVar.f5334r);
        this.F.getClass();
        ef.g e10 = e0.e(I, yVar);
        boolean z12 = false;
        if (e10 != null && e10.f4580a == 2) {
            long j12 = e10.f4581b;
            t2.s sVar = iVar.f5334r;
            z10 = sVar.p(sVar.u(iVar.f5325h.a(eVar.A)), j12);
        } else {
            z10 = false;
        }
        if (z10) {
            if (z11 && j11 == 0) {
                ArrayList arrayList = this.K;
                if (((j) arrayList.remove(arrayList.size() - 1)) == eVar) {
                    z12 = true;
                }
                u1.c.g(z12);
                if (arrayList.isEmpty()) {
                    this.f5374n0 = this.f5373m0;
                } else {
                    ((j) db.r.l(arrayList)).f5342g0 = true;
                }
            }
            gVar = u2.o.B;
        } else {
            long h4 = e0.h(yVar);
            if (h4 != -9223372036854775807L) {
                gVar = new ef.g(0, h4, false);
            } else {
                gVar = u2.o.C;
            }
        }
        ef.g gVar2 = gVar;
        boolean a10 = gVar2.a();
        this.H.q(uVar, eVar.f11787z, this.f5382y, eVar.A, eVar.B, eVar.C, eVar.D, eVar.E, iOException, !a10);
        if (!a10) {
            this.R = null;
        }
        if (z10) {
            if (!this.f5361a0) {
                z0 z0Var = new z0();
                z0Var.f509a = this.f5373m0;
                f(new a1(z0Var));
                return gVar2;
            }
            this.f5383z.j(this);
        }
        return gVar2;
    }

    @Override // q2.x0
    public final void D() {
        this.O.post(this.M);
    }

    public final boolean E() {
        if (this.f5374n0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void F() {
        boolean z10;
        r1.q w10;
        if (!this.f5365e0 && this.f5368h0 == null && this.Z) {
            int i6 = 0;
            for (p pVar : this.S) {
                if (pVar.w() == null) {
                    return;
                }
            }
            k1 k1Var = this.f5366f0;
            if (k1Var != null) {
                int i10 = k1Var.f10909a;
                int[] iArr = new int[i10];
                this.f5368h0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i11 = 0; i11 < i10; i11++) {
                    int i12 = 0;
                    while (true) {
                        p[] pVarArr = this.S;
                        if (i12 < pVarArr.length) {
                            r1.q w11 = pVarArr[i12].w();
                            u1.c.h(w11);
                            r1.q qVar = this.f5366f0.a(i11).f11389d[0];
                            String str = w11.f11670n;
                            String str2 = qVar.f11670n;
                            int i13 = k0.i(str);
                            if (i13 != 3) {
                                if (i13 == k0.i(str2)) {
                                    break;
                                } else {
                                    i12++;
                                }
                            } else {
                                if (Objects.equals(str, str2)) {
                                    if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || w11.K == qVar.K) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i12++;
                            }
                        }
                    }
                    this.f5368h0[i11] = i12;
                }
                ArrayList arrayList = this.P;
                int size = arrayList.size();
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    ((m) obj).a();
                }
                return;
            }
            int length = this.S.length;
            int i14 = 0;
            int i15 = -2;
            int i16 = -1;
            while (true) {
                int i17 = 1;
                if (i14 >= length) {
                    break;
                }
                r1.q w12 = this.S[i14].w();
                u1.c.h(w12);
                String str3 = w12.f11670n;
                if (k0.o(str3)) {
                    i17 = 2;
                } else if (!k0.k(str3)) {
                    if (k0.n(str3)) {
                        i17 = 3;
                    } else {
                        i17 = -2;
                    }
                }
                if (B(i17) > B(i15)) {
                    i16 = i14;
                    i15 = i17;
                } else if (i17 == i15 && i16 != -1) {
                    i16 = -1;
                }
                i14++;
            }
            e1 e1Var = this.A.f5325h;
            int i18 = e1Var.f11386a;
            this.f5369i0 = -1;
            this.f5368h0 = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                this.f5368h0[i19] = i19;
            }
            e1[] e1VarArr = new e1[length];
            for (int i20 = 0; i20 < length; i20++) {
                r1.q w13 = this.S[i20].w();
                u1.c.h(w13);
                String str4 = this.f5381x;
                r1.q qVar2 = this.C;
                if (i20 == i16) {
                    r1.q[] qVarArr = new r1.q[i18];
                    for (int i21 = 0; i21 < i18; i21++) {
                        r1.q qVar3 = e1Var.f11389d[i21];
                        if (i15 == 1 && qVar2 != null) {
                            qVar3 = qVar3.d(qVar2);
                        }
                        if (i18 == 1) {
                            w10 = w13.d(qVar3);
                        } else {
                            w10 = w(qVar3, w13, true);
                        }
                        qVarArr[i21] = w10;
                    }
                    e1VarArr[i20] = new e1(str4, qVarArr);
                    this.f5369i0 = i20;
                } else {
                    if (i15 != 2 || !k0.k(w13.f11670n)) {
                        qVar2 = null;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str4);
                    sb2.append(":muxed:");
                    sb2.append(i20 < i16 ? i20 : i20 - 1);
                    e1VarArr[i20] = new e1(sb2.toString(), w(qVar2, w13, false));
                }
            }
            this.f5366f0 = v(e1VarArr);
            if (this.f5367g0 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            u1.c.g(z10);
            this.f5367g0 = Collections.EMPTY_SET;
            this.f5361a0 = true;
            this.f5383z.x();
        }
    }

    public final void G() {
        this.G.b();
        i iVar = this.A;
        q2.b bVar = iVar.f5330n;
        if (bVar == null) {
            Uri uri = iVar.f5331o;
            if (uri != null && uri.equals(iVar.f5332p)) {
                h2.c cVar = iVar.f5324g;
                h2.b bVar2 = (h2.b) cVar.A.get(iVar.f5331o);
                bVar2.f5858y.b();
                IOException iOException = bVar2.G;
                if (iOException != null) {
                    throw iOException;
                }
                return;
            }
            return;
        }
        throw bVar;
    }

    public final void H(e1[] e1VarArr, int... iArr) {
        this.f5366f0 = v(e1VarArr);
        this.f5367g0 = new HashSet();
        for (int i6 : iArr) {
            this.f5367g0.add(this.f5366f0.a(i6));
        }
        this.f5369i0 = 0;
        this.O.post(new a2.a(this.f5383z, 24));
        this.f5361a0 = true;
    }

    public final void I() {
        for (p pVar : this.S) {
            pVar.E(this.o0);
        }
        this.o0 = false;
    }

    public final boolean J(boolean z10, long j) {
        j jVar;
        boolean z11;
        boolean z12;
        boolean H;
        this.f5373m0 = j;
        if (E()) {
            this.f5374n0 = j;
            return true;
        }
        boolean z13 = this.A.f5333q;
        ArrayList arrayList = this.K;
        if (z13) {
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                jVar = (j) arrayList.get(i6);
                if (jVar.D == j) {
                    break;
                }
            }
        }
        jVar = null;
        if (this.Z && !z10 && !arrayList.isEmpty()) {
            int length = this.S.length;
            for (int i10 = 0; i10 < length; i10++) {
                p pVar = this.S[i10];
                if (jVar != null) {
                    H = pVar.G(jVar.e(i10));
                } else {
                    long e10 = e();
                    if (e10 != Long.MIN_VALUE && j >= e10) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    H = pVar.H(z12, j);
                }
                if (!H && (this.f5372l0[i10] || !this.f5370j0)) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
            if (z11) {
                return false;
            }
        }
        this.f5374n0 = j;
        this.f5376q0 = false;
        arrayList.clear();
        u2.o oVar = this.G;
        if (oVar.d()) {
            if (this.Z) {
                for (p pVar2 : this.S) {
                    pVar2.k();
                }
            }
            oVar.a();
            return true;
        }
        oVar.f12870z = null;
        I();
        return true;
    }

    @Override // q2.b1
    public final boolean a() {
        return this.G.d();
    }

    public final void b() {
        u1.c.g(this.f5361a0);
        this.f5366f0.getClass();
        this.f5367g0.getClass();
    }

    @Override // u2.m
    public final void d() {
        for (p pVar : this.S) {
            pVar.D();
        }
    }

    @Override // q2.b1
    public final long e() {
        if (E()) {
            return this.f5374n0;
        }
        if (this.f5376q0) {
            return Long.MIN_VALUE;
        }
        return y().E;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02dc  */
    /* JADX WARN: Type inference failed for: r2v19, types: [q2.b, java.io.IOException] */
    @Override // q2.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(a2.a1 r73) {
        /*
            Method dump skipped, instructions count: 1335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.q.f(a2.a1):boolean");
    }

    public final boolean j(int i6) {
        int i10 = i6;
        while (true) {
            ArrayList arrayList = this.K;
            if (i10 < arrayList.size()) {
                if (((j) arrayList.get(i10)).f5344i0) {
                    return false;
                }
                i10++;
            } else {
                j jVar = (j) arrayList.get(i6);
                for (int i11 = 0; i11 < this.S.length; i11++) {
                    if (this.S[i11].t() > jVar.e(i11)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u2.j
    public final void k(u2.l lVar, long j, long j10) {
        r2.e eVar = (r2.e) lVar;
        this.R = null;
        if (eVar instanceof e) {
            e eVar2 = (e) eVar;
            byte[] bArr = eVar2.G;
            i iVar = this.A;
            iVar.f5329m = bArr;
            lc.c cVar = iVar.j;
            Uri uri = eVar2.f11786y.f13542a;
            byte[] bArr2 = eVar2.I;
            bArr2.getClass();
            d dVar = (d) cVar.f8328x;
            uri.getClass();
        }
        long j11 = eVar.f11785x;
        Uri uri2 = eVar.F.f13560z;
        u uVar = new u(j10);
        this.F.getClass();
        this.H.p(uVar, eVar.f11787z, this.f5382y, eVar.A, eVar.B, eVar.C, eVar.D, eVar.E);
        if (!this.f5361a0) {
            z0 z0Var = new z0();
            z0Var.f509a = this.f5373m0;
            f(new a1(z0Var));
            return;
        }
        this.f5383z.j(this);
    }

    @Override // u2.j
    public final void o(u2.l lVar, long j, long j10, boolean z10) {
        r2.e eVar = (r2.e) lVar;
        this.R = null;
        long j11 = eVar.f11785x;
        Uri uri = eVar.F.f13560z;
        u uVar = new u(j10);
        this.F.getClass();
        this.H.n(uVar, eVar.f11787z, this.f5382y, eVar.A, eVar.B, eVar.C, eVar.D, eVar.E);
        if (!z10) {
            if (E() || this.f5362b0 == 0) {
                I();
            }
            if (this.f5362b0 > 0) {
                this.f5383z.j(this);
            }
        }
    }

    @Override // q2.b1
    public final long r() {
        if (this.f5376q0) {
            return Long.MIN_VALUE;
        }
        if (E()) {
            return this.f5374n0;
        }
        long j = this.f5373m0;
        j y9 = y();
        if (!y9.f5340e0) {
            ArrayList arrayList = this.K;
            if (arrayList.size() > 1) {
                y9 = (j) arrayList.get(arrayList.size() - 2);
            } else {
                y9 = null;
            }
        }
        if (y9 != null) {
            j = Math.max(j, y9.E);
        }
        if (this.Z) {
            for (p pVar : this.S) {
                j = Math.max(j, pVar.q());
            }
        }
        return j;
    }

    @Override // q2.b1
    public final void s(long j) {
        int size;
        boolean e10;
        u2.o oVar = this.G;
        if (!oVar.c() && !E()) {
            boolean d10 = oVar.d();
            i iVar = this.A;
            List list = this.L;
            if (d10) {
                this.R.getClass();
                r2.e eVar = this.R;
                if (iVar.f5330n != null) {
                    e10 = false;
                } else {
                    e10 = iVar.f5334r.e(j, eVar, list);
                }
                if (e10) {
                    oVar.a();
                    return;
                }
                return;
            }
            int size2 = list.size();
            while (size2 > 0 && iVar.b((j) list.get(size2 - 1)) == 2) {
                size2--;
            }
            if (size2 < list.size()) {
                x(size2);
            }
            if (iVar.f5330n == null && iVar.f5334r.length() >= 2) {
                size = iVar.f5334r.k(j, list);
            } else {
                size = list.size();
            }
            if (size < this.K.size()) {
                x(size);
            }
        }
    }

    @Override // y2.q
    public final void t() {
        this.f5377r0 = true;
        this.O.post(this.N);
    }

    public final k1 v(e1[] e1VarArr) {
        for (int i6 = 0; i6 < e1VarArr.length; i6++) {
            e1 e1Var = e1VarArr[i6];
            r1.q[] qVarArr = new r1.q[e1Var.f11386a];
            for (int i10 = 0; i10 < e1Var.f11386a; i10++) {
                r1.q qVar = e1Var.f11389d[i10];
                int l10 = this.D.l(qVar);
                r1.p a10 = qVar.a();
                a10.N = l10;
                qVarArr[i10] = new r1.q(a10);
            }
            e1VarArr[i6] = new e1(e1Var.f11387b, qVarArr);
        }
        return new k1(e1VarArr);
    }

    public final void x(int i6) {
        ArrayList arrayList;
        u1.c.g(!this.G.d());
        while (true) {
            arrayList = this.K;
            if (i6 < arrayList.size()) {
                if (j(i6)) {
                    break;
                } else {
                    i6++;
                }
            } else {
                i6 = -1;
                break;
            }
        }
        if (i6 == -1) {
            return;
        }
        long j = y().E;
        j jVar = (j) arrayList.get(i6);
        a0.V(arrayList, i6, arrayList.size());
        for (int i10 = 0; i10 < this.S.length; i10++) {
            this.S[i10].n(jVar.e(i10));
        }
        if (arrayList.isEmpty()) {
            this.f5374n0 = this.f5373m0;
        } else {
            ((j) db.r.l(arrayList)).f5342g0 = true;
        }
        this.f5376q0 = false;
        this.H.C(this.X, jVar.D, j);
    }

    public final j y() {
        return (j) this.K.get(r0.size() - 1);
    }

    @Override // u2.j
    public final void z(u2.l lVar, long j, long j10, int i6) {
        u uVar;
        r2.e eVar = (r2.e) lVar;
        if (i6 == 0) {
            long j11 = eVar.f11785x;
            uVar = new u(eVar.f11786y);
        } else {
            long j12 = eVar.f11785x;
            Uri uri = eVar.F.f13560z;
            uVar = new u(j10);
        }
        u uVar2 = uVar;
        this.H.s(uVar2, eVar.f11787z, this.f5382y, eVar.A, eVar.B, eVar.C, eVar.D, eVar.E, i6);
    }

    @Override // y2.q
    public final void n(z zVar) {
    }
}
