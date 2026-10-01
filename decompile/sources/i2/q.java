package i2;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.emoji2.text.v;
import androidx.media3.decoder.DecoderInputBuffer;
import c2.u0;
import c2.v0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k8.c0;
import o2.a1;
import o2.e1;
import o2.j1;
import o2.u;
import t1.e0;
import t1.f0;
import t1.t0;
import w1.b0;
import w2.a0;
import w2.g0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q implements s2.i, s2.l, e1, w2.q, a1 {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Set f6421t0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final t1.o A;
    public final h2.n B;
    public final h2.k C;
    public final c0 D;
    public final s2.n E = new s2.n("Loader:HlsSampleStreamWrapper");
    public final b3.a F;
    public final int G;
    public final com.bumptech.glide.manager.t H;
    public final ArrayList I;
    public final List J;
    public final n K;
    public final n L;
    public final Handler M;
    public final ArrayList N;
    public final Map O;
    public p2.f P;
    public p[] Q;
    public int[] R;
    public final HashSet S;
    public final SparseIntArray T;
    public o U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public t1.o f6422a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public t1.o f6423b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f6424c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public j1 f6425d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Set f6426e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int[] f6427f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f6428g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f6429h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean[] f6430i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean[] f6431j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public long f6432k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public long f6433l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f6434m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f6435n0;
    public boolean o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f6436p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public long f6437q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public t1.k f6438r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public j f6439s0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f6440v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f6441w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final s5.d f6442x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i f6443y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final s2.e f6444z;

    /* JADX WARN: Type inference failed for: r1v12, types: [i2.n] */
    /* JADX WARN: Type inference failed for: r1v13, types: [i2.n] */
    public q(String str, int i, s5.d dVar, i iVar, Map map, s2.e eVar, long j8, t1.o oVar, h2.n nVar, h2.k kVar, c0 c0Var, b3.a aVar, int i10) {
        this.f6440v = str;
        this.f6441w = i;
        this.f6442x = dVar;
        this.f6443y = iVar;
        this.O = map;
        this.f6444z = eVar;
        this.A = oVar;
        this.B = nVar;
        this.C = kVar;
        this.D = c0Var;
        this.F = aVar;
        this.G = i10;
        final int i11 = 0;
        com.bumptech.glide.manager.t tVar = new com.bumptech.glide.manager.t(3, false);
        tVar.f2438x = null;
        tVar.f2437w = false;
        tVar.f2439y = null;
        this.H = tVar;
        this.R = new int[0];
        Set set = f6421t0;
        this.S = new HashSet(set.size());
        this.T = new SparseIntArray(set.size());
        this.Q = new p[0];
        this.f6431j0 = new boolean[0];
        this.f6430i0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.I = arrayList;
        this.J = Collections.unmodifiableList(arrayList);
        this.N = new ArrayList();
        this.K = new Runnable(this) { // from class: i2.n

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ q f6414w;

            {
                this.f6414w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        this.f6414w.F();
                        break;
                    default:
                        q qVar = this.f6414w;
                        qVar.X = true;
                        qVar.F();
                        break;
                }
            }
        };
        final int i12 = 1;
        this.L = new Runnable(this) { // from class: i2.n

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ q f6414w;

            {
                this.f6414w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        this.f6414w.F();
                        break;
                    default:
                        q qVar = this.f6414w;
                        qVar.X = true;
                        qVar.F();
                        break;
                }
            }
        };
        this.M = b0.m(null);
        this.f6432k0 = j8;
        this.f6433l0 = j8;
    }

    public static t1.o A(t1.o oVar, t1.o oVar2, boolean z2) {
        String strC;
        if (oVar == null) {
            return oVar2;
        }
        String str = oVar.f12058k;
        String strE = oVar2.f12061n;
        int i = f0.i(strE);
        if (b0.r(i, str) == 1) {
            strC = b0.s(i, str);
            strE = f0.e(strC);
        } else {
            strC = f0.c(str, strE);
        }
        t1.n nVarA = oVar2.a();
        nVarA.f12026a = oVar.f12050a;
        nVarA.f12027b = oVar.f12051b;
        nVarA.f12028c = y9.f0.m(oVar.f12052c);
        nVarA.f12029d = oVar.f12053d;
        nVarA.f12030e = oVar.f12054e;
        nVarA.f = oVar.f;
        nVarA.f12032h = z2 ? oVar.f12056h : -1;
        nVarA.i = z2 ? oVar.i : -1;
        nVarA.f12033j = strC;
        if (i == 2) {
            nVarA.f12043t = oVar.f12068u;
            nVarA.f12044u = oVar.f12069v;
            nVarA.f12047x = oVar.f12072y;
        }
        if (strE != null) {
            nVarA.f12036m = f0.p(strE);
        }
        int i10 = oVar.F;
        if (i10 != -1 && i == 1) {
            nVarA.E = i10;
        }
        e0 e0VarB = oVar.f12059l;
        if (e0VarB != null) {
            e0 e0Var = oVar2.f12059l;
            if (e0Var != null) {
                e0VarB = e0Var.b(e0VarB);
            }
            nVarA.f12034k = e0VarB;
        }
        return new t1.o(nVarA);
    }

    public static int D(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    public static w2.n y(int i, int i10) {
        w1.a.C("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i10);
        return new w2.n();
    }

    public final void B(int i) {
        ArrayList arrayList;
        w1.a.j(!this.E.d());
        while (true) {
            arrayList = this.I;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (s(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j8 = C().C;
        j jVar = (j) arrayList.get(i);
        b0.R(arrayList, i, arrayList.size());
        for (int i10 = 0; i10 < this.Q.length; i10++) {
            this.Q[i10].n(jVar.f(i10));
        }
        if (arrayList.isEmpty()) {
            this.f6433l0 = this.f6432k0;
        } else {
            ((j) y9.p.l(arrayList)).f6391e0 = true;
        }
        this.o0 = false;
        this.F.u(this.V, jVar.B, j8);
    }

    public final j C() {
        return (j) this.I.get(r0.size() - 1);
    }

    public final boolean E() {
        return this.f6433l0 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F() {
        int i;
        if (!this.f6424c0 && this.f6427f0 == null && this.X) {
            int i10 = 0;
            for (p pVar : this.Q) {
                if (pVar.w() == null) {
                    return;
                }
            }
            j1 j1Var = this.f6425d0;
            if (j1Var != null) {
                int i11 = j1Var.f9468a;
                int[] iArr = new int[i11];
                this.f6427f0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = 0;
                    while (true) {
                        p[] pVarArr = this.Q;
                        if (i13 < pVarArr.length) {
                            t1.o oVarW = pVarArr[i13].w();
                            w1.a.k(oVarW);
                            t1.o oVar = this.f6425d0.a(i12).f12114d[0];
                            String str = oVarW.f12061n;
                            String str2 = oVar.f12061n;
                            int i14 = f0.i(str);
                            if (i14 != 3) {
                                if (i14 == f0.i(str2)) {
                                    break;
                                } else {
                                    i13++;
                                }
                            } else if (Objects.equals(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || oVarW.K == oVar.K)) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                    this.f6427f0[i12] = i13;
                }
                ArrayList arrayList = this.N;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((m) obj).c();
                }
                return;
            }
            int length = this.Q.length;
            int i15 = 0;
            int i16 = -1;
            int i17 = -2;
            while (true) {
                int i18 = 1;
                if (i15 >= length) {
                    break;
                }
                t1.o oVarW2 = this.Q[i15].w();
                w1.a.k(oVarW2);
                String str3 = oVarW2.f12061n;
                if (f0.o(str3)) {
                    i18 = 2;
                } else if (!f0.k(str3)) {
                    i18 = f0.n(str3) ? 3 : -2;
                }
                if (D(i18) > D(i17)) {
                    i16 = i15;
                    i17 = i18;
                } else if (i18 == i17 && i16 != -1) {
                    i16 = -1;
                }
                i15++;
            }
            t0 t0Var = this.f6443y.f6375h;
            int i19 = t0Var.f12111a;
            this.f6428g0 = -1;
            this.f6427f0 = new int[length];
            for (int i20 = 0; i20 < length; i20++) {
                this.f6427f0[i20] = i20;
            }
            t0[] t0VarArr = new t0[length];
            int i21 = 0;
            while (i21 < length) {
                t1.o oVarW3 = this.Q[i21].w();
                w1.a.k(oVarW3);
                String str4 = this.f6440v;
                t1.o oVar2 = this.A;
                if (i21 == i16) {
                    t1.o[] oVarArr = new t1.o[i19];
                    for (int i22 = i10; i22 < i19; i22++) {
                        t1.o oVarD = t0Var.f12114d[i22];
                        if (i17 == 1 && oVar2 != null) {
                            oVarD = oVarD.d(oVar2);
                        }
                        oVarArr[i22] = i19 == 1 ? oVarW3.d(oVarD) : A(oVarD, oVarW3, true);
                    }
                    t0VarArr[i21] = new t0(str4, oVarArr);
                    this.f6428g0 = i21;
                    i = 0;
                } else {
                    if (i17 != 2 || !f0.k(oVarW3.f12061n)) {
                        oVar2 = null;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str4);
                    sb2.append(":muxed:");
                    sb2.append(i21 < i16 ? i21 : i21 - 1);
                    i = 0;
                    t0VarArr[i21] = new t0(sb2.toString(), A(oVar2, oVarW3, false));
                }
                i21++;
                i10 = i;
            }
            int i23 = i10;
            this.f6425d0 = z(t0VarArr);
            w1.a.j(this.f6426e0 == null ? 1 : i23);
            this.f6426e0 = Collections.EMPTY_SET;
            this.Y = true;
            this.f6442x.y();
        }
    }

    public final void G() throws IOException {
        this.E.b();
        i iVar = this.f6443y;
        o2.b bVar = iVar.f6380n;
        if (bVar != null) {
            throw bVar;
        }
        Uri uri = iVar.f6381o;
        if (uri == null || !uri.equals(iVar.f6382p)) {
            return;
        }
        j2.c cVar = iVar.f6374g;
        j2.b bVar2 = (j2.b) cVar.f6659y.get(iVar.f6381o);
        bVar2.f6652w.b();
        IOException iOException = bVar2.E;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void H(t0[] t0VarArr, int... iArr) {
        this.f6425d0 = z(t0VarArr);
        this.f6426e0 = new HashSet();
        for (int i : iArr) {
            this.f6426e0.add(this.f6425d0.a(i));
        }
        this.f6428g0 = 0;
        this.M.post(new v(27, this.f6442x));
        this.Y = true;
    }

    public final void I() {
        for (p pVar : this.Q) {
            pVar.D(this.f6434m0);
        }
        this.f6434m0 = false;
    }

    public final boolean J(boolean z2, long j8) throws Throwable {
        j jVar;
        boolean z10;
        boolean zG;
        this.f6432k0 = j8;
        if (E()) {
            this.f6433l0 = j8;
            return true;
        }
        boolean z11 = this.f6443y.f6383q;
        ArrayList arrayList = this.I;
        if (z11) {
            for (int i = 0; i < arrayList.size(); i++) {
                jVar = (j) arrayList.get(i);
                if (jVar.B == j8) {
                    break;
                }
            }
            jVar = null;
        } else {
            jVar = null;
        }
        if (this.X && !z2 && !arrayList.isEmpty()) {
            int length = this.Q.length;
            for (int i10 = 0; i10 < length; i10++) {
                p pVar = this.Q[i10];
                if (jVar != null) {
                    zG = pVar.F(jVar.f(i10));
                } else {
                    long jH = h();
                    zG = pVar.G(jH == Long.MIN_VALUE || j8 < jH, j8);
                }
                if (!zG && (this.f6431j0[i10] || !this.f6429h0)) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
            if (z10) {
                return false;
            }
        }
        this.f6433l0 = j8;
        this.o0 = false;
        arrayList.clear();
        s2.n nVar = this.E;
        if (!nVar.d()) {
            nVar.f11469c = null;
            I();
            return true;
        }
        if (this.X) {
            for (p pVar2 : this.Q) {
                pVar2.k();
            }
        }
        nVar.a();
        return true;
    }

    @Override // o2.a1
    public final void a() {
        this.M.post(this.K);
    }

    public final void b() {
        w1.a.j(this.Y);
        this.f6425d0.getClass();
        this.f6426e0.getClass();
    }

    @Override // o2.e1
    public final boolean c() {
        return this.E.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0203  */
    @Override // o2.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(c2.v0 r73) {
        /*
            Method dump skipped, instruction units count: 1339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.q.d(c2.v0):boolean");
    }

    @Override // w2.q
    public final void e() {
        this.f6436p0 = true;
        this.M.post(this.L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s2.i
    public final void f(s2.k kVar, long j8, long j9) {
        p2.f fVar = (p2.f) kVar;
        this.P = null;
        if (fVar instanceof e) {
            e eVar = (e) fVar;
            byte[] bArr = eVar.E;
            i iVar = this.f6443y;
            iVar.f6379m = bArr;
            s5.c cVar = iVar.f6376j;
            Uri uri = eVar.f10209w.f14377a;
            byte[] bArr2 = eVar.G;
            bArr2.getClass();
            d dVar = (d) cVar.f11492w;
            uri.getClass();
        }
        long j10 = fVar.f10208v;
        Uri uri2 = fVar.D.f14401x;
        u uVar = new u(j9);
        this.D.getClass();
        this.F.k(uVar, fVar.f10210x, this.f6441w, fVar.f10211y, fVar.f10212z, fVar.A, fVar.B, fVar.C);
        if (this.Y) {
            this.f6442x.a(this);
            return;
        }
        u0 u0Var = new u0();
        u0Var.f1969a = this.f6432k0;
        d(new v0(u0Var));
    }

    @Override // s2.l
    public final void g() {
        for (p pVar : this.Q) {
            pVar.D(true);
            h2.h hVar = pVar.f9378h;
            if (hVar != null) {
                hVar.d(pVar.f9376e);
                pVar.f9378h = null;
                pVar.f9377g = null;
            }
        }
    }

    @Override // o2.e1
    public final long h() {
        if (E()) {
            return this.f6433l0;
        }
        if (this.o0) {
            return Long.MIN_VALUE;
        }
        return C().C;
    }

    @Override // s2.i
    public final void o(s2.k kVar, long j8, long j9, int i) {
        u uVar;
        p2.f fVar = (p2.f) kVar;
        if (i == 0) {
            long j10 = fVar.f10208v;
            uVar = new u(fVar.f10209w);
        } else {
            long j11 = fVar.f10208v;
            Uri uri = fVar.D.f14401x;
            uVar = new u(j9);
        }
        u uVar2 = uVar;
        this.F.o(uVar2, fVar.f10210x, this.f6441w, fVar.f10211y, fVar.f10212z, fVar.A, fVar.B, fVar.C, i);
    }

    @Override // s2.i
    public final e4.e p(s2.k kVar, long j8, long j9, IOException iOException, int i) {
        boolean zO;
        e4.e eVar;
        int i10;
        p2.f fVar = (p2.f) kVar;
        boolean z2 = fVar instanceof j;
        if (z2 && !((j) fVar).g() && (iOException instanceof y1.u) && ((i10 = ((y1.u) iOException).f14394y) == 410 || i10 == 404)) {
            return s2.n.f11465d;
        }
        long j10 = fVar.D.f14400w;
        Uri uri = fVar.D.f14401x;
        u uVar = new u(j9);
        b0.Y(fVar.B);
        b0.Y(fVar.C);
        c6.i iVar = new c6.i(i, 6, iOException);
        i iVar2 = this.f6443y;
        s2.h hVarH = com.bumptech.glide.d.h(iVar2.f6384r);
        this.D.getClass();
        e4.e eVarV = c0.v(hVarH, iVar);
        if (eVarV == null || eVarV.f4776a != 2) {
            zO = false;
        } else {
            long j11 = eVarV.f4777b;
            r2.s sVar = iVar2.f6384r;
            zO = sVar.o(sVar.u(iVar2.f6375h.a(fVar.f10211y)), j11);
        }
        if (zO) {
            if (z2 && j10 == 0) {
                ArrayList arrayList = this.I;
                w1.a.j(((j) arrayList.remove(arrayList.size() - 1)) == fVar);
                if (arrayList.isEmpty()) {
                    this.f6433l0 = this.f6432k0;
                } else {
                    ((j) y9.p.l(arrayList)).f6391e0 = true;
                }
            }
            eVar = s2.n.f11466e;
        } else {
            long jX = c0.x(iVar);
            eVar = jX != -9223372036854775807L ? new e4.e(0, jX, false) : s2.n.f;
        }
        e4.e eVar2 = eVar;
        boolean zA = eVar2.a();
        this.F.l(uVar, fVar.f10210x, this.f6441w, fVar.f10211y, fVar.f10212z, fVar.A, fVar.B, fVar.C, iOException, !zA);
        if (!zA) {
            this.P = null;
        }
        if (zO) {
            if (!this.Y) {
                u0 u0Var = new u0();
                u0Var.f1969a = this.f6432k0;
                d(new v0(u0Var));
                return eVar2;
            }
            this.f6442x.a(this);
        }
        return eVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [i2.p[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [i2.p[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [w2.g0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [i2.p, o2.b1] */
    /* JADX WARN: Type inference failed for: r5v6, types: [w2.n] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // w2.q
    public final g0 r(int i, int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        Set set = f6421t0;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.S;
        SparseIntArray sparseIntArray = this.T;
        ?? pVar = 0;
        pVar = 0;
        if (zContains) {
            w1.a.d(set.contains(Integer.valueOf(i10)));
            int i11 = sparseIntArray.get(i10, -1);
            if (i11 != -1) {
                if (hashSet.add(Integer.valueOf(i10))) {
                    this.R[i11] = i;
                }
                pVar = this.R[i11] == i ? this.Q[i11] : y(i, i10);
            }
        } else {
            int i12 = 0;
            while (true) {
                ?? r12 = this.Q;
                if (i12 >= r12.length) {
                    break;
                }
                if (this.R[i12] == i) {
                    pVar = r12[i12];
                    break;
                }
                i12++;
            }
        }
        if (pVar == 0) {
            if (this.f6436p0) {
                return y(i, i10);
            }
            int length = this.Q.length;
            boolean z2 = i10 == 1 || i10 == 2;
            pVar = new p(this.f6444z, this.B, this.C, this.O);
            pVar.f9389t = this.f6432k0;
            if (z2) {
                pVar.I = this.f6438r0;
                pVar.f9395z = true;
            }
            long j8 = this.f6437q0;
            if (pVar.F != j8) {
                pVar.F = j8;
                pVar.f9395z = true;
            }
            if (this.f6439s0 != null) {
                pVar.C = r6.F;
            }
            pVar.f = this;
            int i13 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.R, i13);
            this.R = iArrCopyOf;
            iArrCopyOf[length] = i;
            p[] pVarArr = this.Q;
            int i14 = b0.f13686a;
            ?? CopyOf = Arrays.copyOf(pVarArr, pVarArr.length + 1);
            CopyOf[pVarArr.length] = pVar;
            this.Q = (p[]) CopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.f6431j0, i13);
            this.f6431j0 = zArrCopyOf;
            zArrCopyOf[length] = z2;
            this.f6429h0 |= z2;
            hashSet.add(Integer.valueOf(i10));
            sparseIntArray.append(i10, length);
            if (D(i10) > D(this.V)) {
                this.W = length;
                this.V = i10;
            }
            this.f6430i0 = Arrays.copyOf(this.f6430i0, i13);
        }
        if (i10 != 5) {
            return pVar;
        }
        if (this.U == null) {
            this.U = new o(pVar, this.G);
        }
        return this.U;
    }

    public final boolean s(int i) {
        int i10 = i;
        while (true) {
            ArrayList arrayList = this.I;
            if (i10 >= arrayList.size()) {
                j jVar = (j) arrayList.get(i);
                for (int i11 = 0; i11 < this.Q.length; i11++) {
                    if (this.Q[i11].t() > jVar.f(i11)) {
                        return false;
                    }
                }
                return true;
            }
            if (((j) arrayList.get(i10)).f6393g0) {
                return false;
            }
            i10++;
        }
    }

    @Override // s2.i
    public final void t(s2.k kVar, long j8, long j9, boolean z2) {
        p2.f fVar = (p2.f) kVar;
        this.P = null;
        long j10 = fVar.f10208v;
        Uri uri = fVar.D.f14401x;
        u uVar = new u(j9);
        this.D.getClass();
        this.F.j(uVar, fVar.f10210x, this.f6441w, fVar.f10211y, fVar.f10212z, fVar.A, fVar.B, fVar.C);
        if (z2) {
            return;
        }
        if (E() || this.Z == 0) {
            I();
        }
        if (this.Z > 0) {
            this.f6442x.a(this);
        }
    }

    @Override // o2.e1
    public final long u() {
        if (this.o0) {
            return Long.MIN_VALUE;
        }
        if (E()) {
            return this.f6433l0;
        }
        long jMax = this.f6432k0;
        j jVarC = C();
        if (!jVarC.f6389c0) {
            ArrayList arrayList = this.I;
            jVarC = arrayList.size() > 1 ? (j) arrayList.get(arrayList.size() - 2) : null;
        }
        if (jVarC != null) {
            jMax = Math.max(jMax, jVarC.C);
        }
        if (this.X) {
            for (p pVar : this.Q) {
                jMax = Math.max(jMax, pVar.q());
            }
        }
        return jMax;
    }

    @Override // o2.e1
    public final void x(long j8) {
        s2.n nVar = this.E;
        if (nVar.c() || E()) {
            return;
        }
        boolean zD = nVar.d();
        i iVar = this.f6443y;
        List list = this.J;
        if (zD) {
            this.P.getClass();
            if (iVar.f6380n != null ? false : iVar.f6384r.h(j8, this.P, list)) {
                nVar.a();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && iVar.b((j) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            B(size);
        }
        int size2 = (iVar.f6380n != null || iVar.f6384r.length() < 2) ? list.size() : iVar.f6384r.f(j8, list);
        if (size2 < this.I.size()) {
            B(size2);
        }
    }

    public final j1 z(t0[] t0VarArr) {
        for (int i = 0; i < t0VarArr.length; i++) {
            t0 t0Var = t0VarArr[i];
            t1.o[] oVarArr = new t1.o[t0Var.f12111a];
            for (int i10 = 0; i10 < t0Var.f12111a; i10++) {
                t1.o oVar = t0Var.f12114d[i10];
                int iC = this.B.c(oVar);
                t1.n nVarA = oVar.a();
                nVarA.N = iC;
                oVarArr[i10] = new t1.o(nVarA);
            }
            t0VarArr[i] = new t0(t0Var.f12112b, oVarArr);
        }
        return new j1(t0VarArr);
    }

    @Override // w2.q
    public final void k(a0 a0Var) {
    }
}
