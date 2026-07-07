package o2;

import android.net.Uri;
import android.os.Handler;
import c2.u1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements b0, w2.q, s2.i, s2.l, a1 {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final Map f9534k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final t1.o f9535l0;
    public final h2.k A;
    public final x0 B;
    public final s2.e C;
    public final long D;
    public final t1.o E;
    public final long F;
    public final s2.n G;
    public final hd.a H;
    public final w1.e I;
    public final p0 J;
    public final p0 K;
    public final Handler L;
    public a0 M;
    public j3.b N;
    public b1[] O;
    public t0[] P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public sb.p U;
    public w2.a0 V;
    public long W;
    public boolean X;
    public int Y;
    public boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f9536a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f9537b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f9538c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f9539d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public long f9540e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public long f9541f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f9542g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f9543h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f9544i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f9545j0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Uri f9546v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y1.h f9547w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h2.n f9548x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k8.c0 f9549y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b3.a f9550z;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f9534k0 = Collections.unmodifiableMap(map);
        t1.n nVar = new t1.n();
        nVar.f12026a = "icy";
        nVar.f12036m = t1.f0.p("application/x-icy");
        f9535l0 = new t1.o(nVar);
    }

    public u0(Uri uri, y1.h hVar, hd.a aVar, h2.n nVar, h2.k kVar, k8.c0 c0Var, b3.a aVar2, x0 x0Var, s2.e eVar, int i, t1.o oVar, long j8, t2.a aVar3) {
        this.f9546v = uri;
        this.f9547w = hVar;
        this.f9548x = nVar;
        this.A = kVar;
        this.f9549y = c0Var;
        this.f9550z = aVar2;
        this.B = x0Var;
        this.C = eVar;
        this.D = i;
        this.E = oVar;
        this.G = aVar3 != null ? new s2.n(aVar3) : new s2.n("ProgressiveMediaPeriod");
        this.H = aVar;
        this.F = j8;
        this.I = new w1.e();
        this.J = new p0(this, 1);
        this.K = new p0(this, 2);
        this.L = w1.b0.m(null);
        this.P = new t0[0];
        this.O = new b1[0];
        this.f9541f0 = -9223372036854775807L;
        this.Y = 1;
    }

    public final void A() {
        long j8 = this.F;
        if (this.f9545j0 || this.R || !this.Q || this.V == null) {
            return;
        }
        for (b1 b1Var : this.O) {
            if (b1Var.w() == null) {
                return;
            }
        }
        w1.e eVar = this.I;
        synchronized (eVar) {
            eVar.f13705b = false;
        }
        int length = this.O.length;
        t1.t0[] t0VarArr = new t1.t0[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            t1.o oVarW = this.O[i].w();
            oVarW.getClass();
            String str = oVarW.f12061n;
            boolean zK = t1.f0.k(str);
            boolean z2 = zK || t1.f0.o(str);
            zArr[i] = z2;
            this.S = z2 | this.S;
            this.T = j8 != -9223372036854775807L && length == 1 && t1.f0.m(str);
            j3.b bVar = this.N;
            if (bVar != null) {
                int i10 = bVar.f6777a;
                if (zK || this.P[i].f9531b) {
                    t1.e0 e0Var = oVarW.f12059l;
                    t1.e0 e0Var2 = e0Var == null ? new t1.e0(bVar) : e0Var.a(bVar);
                    t1.n nVarA = oVarW.a();
                    nVarA.f12034k = e0Var2;
                    oVarW = new t1.o(nVarA);
                }
                if (zK && oVarW.f12056h == -1 && oVarW.i == -1 && i10 != -1) {
                    t1.n nVarA2 = oVarW.a();
                    nVarA2.f12032h = i10;
                    oVarW = new t1.o(nVarA2);
                }
            }
            int iC = this.f9548x.c(oVarW);
            t1.n nVarA3 = oVarW.a();
            nVarA3.N = iC;
            t1.o oVar = new t1.o(nVarA3);
            t0VarArr[i] = new t1.t0(Integer.toString(i), oVar);
            this.f9537b0 = oVar.f12067t | this.f9537b0;
        }
        this.U = new sb.p(new j1(t0VarArr), zArr);
        if (this.T && this.W == -9223372036854775807L) {
            this.W = j8;
            this.V = new q0(this, this.V);
        }
        this.B.u(this.W, this.V, this.X);
        this.R = true;
        a0 a0Var = this.M;
        a0Var.getClass();
        a0Var.s(this);
    }

    public final void B(int i) {
        b();
        sb.p pVar = this.U;
        boolean[] zArr = (boolean[]) pVar.f11745z;
        if (zArr[i]) {
            return;
        }
        t1.o oVar = ((j1) pVar.f11742w).a(i).f12114d[0];
        this.f9550z.e(t1.f0.i(oVar.f12061n), oVar, 0, null, this.f9540e0);
        zArr[i] = true;
    }

    public final void C(int i) {
        b();
        if (this.f9542g0) {
            if ((!this.S || ((boolean[]) this.U.f11743x)[i]) && !this.O[i].x(false)) {
                this.f9541f0 = 0L;
                this.f9542g0 = false;
                this.f9536a0 = true;
                this.f9540e0 = 0L;
                this.f9543h0 = 0;
                for (b1 b1Var : this.O) {
                    b1Var.D(false);
                }
                a0 a0Var = this.M;
                a0Var.getClass();
                a0Var.a(this);
            }
        }
    }

    public final w2.g0 D(t0 t0Var) {
        int length = this.O.length;
        for (int i = 0; i < length; i++) {
            if (t0Var.equals(this.P[i])) {
                return this.O[i];
            }
        }
        if (this.Q) {
            w1.a.C("ProgressiveMediaPeriod", "Extractor added new track (id=" + t0Var.f9530a + ") after finishing tracks.");
            return new w2.n();
        }
        h2.n nVar = this.f9548x;
        nVar.getClass();
        b1 b1Var = new b1(this.C, nVar, this.A);
        b1Var.f = this;
        int i10 = length + 1;
        t0[] t0VarArr = (t0[]) Arrays.copyOf(this.P, i10);
        t0VarArr[length] = t0Var;
        int i11 = w1.b0.f13686a;
        this.P = t0VarArr;
        b1[] b1VarArr = (b1[]) Arrays.copyOf(this.O, i10);
        b1VarArr[length] = b1Var;
        this.O = b1VarArr;
        return b1Var;
    }

    public final void E(w2.a0 a0Var) {
        this.V = this.N == null ? a0Var : new w2.s(-9223372036854775807L);
        this.W = a0Var.l();
        boolean z2 = !this.f9539d0 && a0Var.l() == -9223372036854775807L;
        this.X = z2;
        this.Y = z2 ? 7 : 1;
        if (this.R) {
            this.B.u(this.W, a0Var, z2);
        } else {
            A();
        }
    }

    public final void F() {
        r0 r0Var = new r0(this, this.f9546v, this.f9547w, this.H, this, this.I);
        if (this.R) {
            w1.a.j(z());
            long j8 = this.W;
            if (j8 != -9223372036854775807L && this.f9541f0 > j8) {
                this.f9544i0 = true;
                this.f9541f0 = -9223372036854775807L;
                return;
            }
            w2.a0 a0Var = this.V;
            a0Var.getClass();
            long j9 = a0Var.j(this.f9541f0).f13886a.f13780b;
            long j10 = this.f9541f0;
            r0Var.A.f12092a = j9;
            r0Var.D = j10;
            r0Var.C = true;
            r0Var.G = false;
            for (b1 b1Var : this.O) {
                b1Var.f9389t = this.f9541f0;
            }
            this.f9541f0 = -9223372036854775807L;
        }
        this.f9543h0 = s();
        this.G.f(r0Var, this, this.f9549y.w(this.Y));
    }

    public final boolean G() {
        return this.f9536a0 || z();
    }

    @Override // o2.a1
    public final void a() {
        this.L.post(this.J);
    }

    public final void b() {
        w1.a.j(this.R);
        this.U.getClass();
        this.V.getClass();
    }

    @Override // o2.e1
    public final boolean c() {
        boolean z2;
        if (!this.G.d()) {
            return false;
        }
        w1.e eVar = this.I;
        synchronized (eVar) {
            z2 = eVar.f13705b;
        }
        return z2;
    }

    @Override // o2.e1
    public final boolean d(c2.v0 v0Var) {
        if (this.f9544i0) {
            return false;
        }
        s2.n nVar = this.G;
        if (nVar.c() || this.f9542g0) {
            return false;
        }
        if ((this.R || this.E != null) && this.f9538c0 == 0) {
            return false;
        }
        boolean zE = this.I.e();
        if (nVar.d()) {
            return zE;
        }
        F();
        return true;
    }

    @Override // w2.q
    public final void e() {
        this.Q = true;
        this.L.post(this.J);
    }

    @Override // s2.i
    public final void f(s2.k kVar, long j8, long j9) {
        r0 r0Var = (r0) kVar;
        if (this.W == -9223372036854775807L && this.V != null) {
            long jY = y(true);
            long j10 = jY == Long.MIN_VALUE ? 0L : jY + 10000;
            this.W = j10;
            this.B.u(j10, this.V, this.X);
        }
        Uri uri = r0Var.f9518w.f14401x;
        u uVar = new u(j9);
        this.f9549y.getClass();
        this.f9550z.k(uVar, 1, -1, null, 0, null, r0Var.D, this.W);
        this.f9544i0 = true;
        a0 a0Var = this.M;
        a0Var.getClass();
        a0Var.a(this);
    }

    @Override // s2.l
    public final void g() {
        for (b1 b1Var : this.O) {
            b1Var.D(true);
            h2.h hVar = b1Var.f9378h;
            if (hVar != null) {
                hVar.d(b1Var.f9376e);
                b1Var.f9378h = null;
                b1Var.f9377g = null;
            }
        }
        hd.a aVar = this.H;
        w2.o oVar = (w2.o) aVar.f6280x;
        if (oVar != null) {
            oVar.release();
            aVar.f6280x = null;
        }
        aVar.f6281y = null;
    }

    @Override // o2.e1
    public final long h() {
        return u();
    }

    @Override // o2.b0
    public final void i(boolean z2, long j8) throws Throwable {
        if (this.T) {
            return;
        }
        b();
        if (z()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.U.f11744y;
        int length = this.O.length;
        for (int i = 0; i < length; i++) {
            this.O[i].j(j8, z2, zArr[i]);
        }
    }

    @Override // o2.b0
    public final long j() {
        if (this.f9537b0) {
            this.f9537b0 = false;
            return this.f9540e0;
        }
        if (!this.f9536a0) {
            return -9223372036854775807L;
        }
        if (!this.f9544i0 && s() <= this.f9543h0) {
            return -9223372036854775807L;
        }
        this.f9536a0 = false;
        return this.f9540e0;
    }

    @Override // w2.q
    public final void k(w2.a0 a0Var) {
        this.L.post(new i0(1, this, a0Var));
    }

    @Override // o2.b0
    public final long l(long j8, u1 u1Var) {
        b();
        if (!this.V.i()) {
            return 0L;
        }
        w2.z zVarJ = this.V.j(j8);
        return u1Var.a(j8, zVarJ.f13886a.f13779a, zVarJ.f13887b.f13779a);
    }

    @Override // o2.b0
    public final long m(r2.s[] sVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j8) {
        r2.s sVar;
        b();
        sb.p pVar = this.U;
        j1 j1Var = (j1) pVar.f11742w;
        boolean[] zArr3 = (boolean[]) pVar.f11744y;
        int i = this.f9538c0;
        int i10 = 0;
        for (int i11 = 0; i11 < sVarArr.length; i11++) {
            c1 c1Var = c1VarArr[i11];
            if (c1Var != null && (sVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((s0) c1Var).f9523v;
                w1.a.j(zArr3[i12]);
                this.f9538c0--;
                zArr3[i12] = false;
                c1VarArr[i11] = null;
            }
        }
        boolean z2 = !this.Z ? j8 == 0 || this.T : i != 0;
        for (int i13 = 0; i13 < sVarArr.length; i13++) {
            if (c1VarArr[i13] == null && (sVar = sVarArr[i13]) != null) {
                w1.a.j(sVar.length() == 1);
                w1.a.j(sVar.e(0) == 0);
                int iB = j1Var.b(sVar.j());
                w1.a.j(!zArr3[iB]);
                this.f9538c0++;
                zArr3[iB] = true;
                this.f9537b0 = sVar.k().f12067t | this.f9537b0;
                c1VarArr[i13] = new s0(this, iB);
                zArr2[i13] = true;
                if (!z2) {
                    b1 b1Var = this.O[iB];
                    z2 = (b1Var.t() == 0 || b1Var.G(true, j8)) ? false : true;
                }
            }
        }
        if (this.f9538c0 == 0) {
            this.f9542g0 = false;
            this.f9536a0 = false;
            this.f9537b0 = false;
            s2.n nVar = this.G;
            if (nVar.d()) {
                b1[] b1VarArr = this.O;
                int length = b1VarArr.length;
                while (i10 < length) {
                    b1VarArr[i10].k();
                    i10++;
                }
                nVar.a();
            } else {
                this.f9544i0 = false;
                for (b1 b1Var2 : this.O) {
                    b1Var2.D(false);
                }
            }
        } else if (z2) {
            j8 = w(j8);
            while (i10 < c1VarArr.length) {
                if (c1VarArr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.Z = true;
        return j8;
    }

    @Override // o2.b0
    public final void n(a0 a0Var, long j8) {
        this.M = a0Var;
        t1.o oVar = this.E;
        if (oVar == null) {
            this.I.e();
            F();
        } else {
            r(0, 3).c(oVar);
            E(new w2.x(-9223372036854775807L, new long[]{0}, new long[]{0}));
            e();
            this.f9541f0 = j8;
        }
    }

    @Override // s2.i
    public final void o(s2.k kVar, long j8, long j9, int i) {
        u uVar;
        r0 r0Var = (r0) kVar;
        y1.y yVar = r0Var.f9518w;
        if (i == 0) {
            uVar = new u(r0Var.E);
        } else {
            Uri uri = yVar.f14401x;
            uVar = new u(j9);
        }
        this.f9550z.o(uVar, 1, -1, null, 0, null, r0Var.D, this.W, i);
    }

    @Override // s2.i
    public final e4.e p(s2.k kVar, long j8, long j9, IOException iOException, int i) {
        long jMin;
        e4.e eVar;
        w2.a0 a0Var;
        r0 r0Var = (r0) kVar;
        Uri uri = r0Var.f9518w.f14401x;
        u uVar = new u(j9);
        int i10 = w1.b0.f13686a;
        this.f9549y.getClass();
        if ((iOException instanceof t1.g0) || (iOException instanceof FileNotFoundException) || (iOException instanceof y1.r) || (iOException instanceof s2.m)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i11 = y1.i.f14370w;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof y1.i) && ((y1.i) cause).f14371v == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            eVar = s2.n.f;
        } else {
            int iS = s();
            int i12 = iS > this.f9543h0 ? 1 : 0;
            if (this.f9539d0 || !((a0Var = this.V) == null || a0Var.l() == -9223372036854775807L)) {
                this.f9543h0 = iS;
            } else if (!this.R || G()) {
                this.f9536a0 = this.R;
                this.f9540e0 = 0L;
                this.f9543h0 = 0;
                for (b1 b1Var : this.O) {
                    b1Var.D(false);
                }
                r0Var.A.f12092a = 0L;
                r0Var.D = 0L;
                r0Var.C = true;
                r0Var.G = false;
            } else {
                this.f9542g0 = true;
                eVar = s2.n.f11466e;
            }
            eVar = new e4.e(i12, jMin, false);
        }
        e4.e eVar2 = eVar;
        this.f9550z.l(uVar, 1, -1, null, 0, null, r0Var.D, this.W, iOException, !eVar2.a());
        return eVar2;
    }

    @Override // o2.b0
    public final j1 q() {
        b();
        return (j1) this.U.f11742w;
    }

    @Override // w2.q
    public final w2.g0 r(int i, int i10) {
        return D(new t0(i, false));
    }

    public final int s() {
        int i = 0;
        for (b1 b1Var : this.O) {
            i += b1Var.f9386q + b1Var.f9385p;
        }
        return i;
    }

    @Override // s2.i
    public final void t(s2.k kVar, long j8, long j9, boolean z2) {
        r0 r0Var = (r0) kVar;
        Uri uri = r0Var.f9518w.f14401x;
        u uVar = new u(j9);
        this.f9549y.getClass();
        this.f9550z.j(uVar, 1, -1, null, 0, null, r0Var.D, this.W);
        if (z2) {
            return;
        }
        for (b1 b1Var : this.O) {
            b1Var.D(false);
        }
        if (this.f9538c0 > 0) {
            a0 a0Var = this.M;
            a0Var.getClass();
            a0Var.a(this);
        }
    }

    @Override // o2.e1
    public final long u() {
        long jY;
        boolean z2;
        b();
        if (this.f9544i0 || this.f9538c0 == 0) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.f9541f0;
        }
        if (this.S) {
            int length = this.O.length;
            jY = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                sb.p pVar = this.U;
                if (((boolean[]) pVar.f11743x)[i] && ((boolean[]) pVar.f11744y)[i]) {
                    b1 b1Var = this.O[i];
                    synchronized (b1Var) {
                        z2 = b1Var.f9392w;
                    }
                    if (!z2) {
                        jY = Math.min(jY, this.O[i].q());
                    }
                }
            }
        } else {
            jY = Long.MAX_VALUE;
        }
        if (jY == Long.MAX_VALUE) {
            jY = y(false);
        }
        return jY == Long.MIN_VALUE ? this.f9540e0 : jY;
    }

    @Override // o2.b0
    public final void v() throws IOException {
        int iW = this.f9549y.w(this.Y);
        s2.n nVar = this.G;
        IOException iOException = nVar.f11469c;
        if (iOException != null) {
            throw iOException;
        }
        s2.j jVar = nVar.f11468b;
        if (jVar != null) {
            if (iW == Integer.MIN_VALUE) {
                iW = jVar.f11460v;
            }
            IOException iOException2 = jVar.f11464z;
            if (iOException2 != null && jVar.A > iW) {
                throw iOException2;
            }
        }
        if (this.f9544i0 && !this.R) {
            throw t1.g0.a(null, "Loading finished before preparation is complete.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    @Override // o2.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long w(long r10) {
        /*
            r9 = this;
            r9.b()
            sb.p r0 = r9.U
            java.lang.Object r0 = r0.f11743x
            boolean[] r0 = (boolean[]) r0
            w2.a0 r1 = r9.V
            boolean r1 = r1.i()
            if (r1 == 0) goto L12
            goto L14
        L12:
            r10 = 0
        L14:
            r1 = 0
            r9.f9536a0 = r1
            long r2 = r9.f9540e0
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            r3 = 1
            if (r2 != 0) goto L20
            r2 = r3
            goto L21
        L20:
            r2 = r1
        L21:
            r9.f9540e0 = r10
            boolean r4 = r9.z()
            if (r4 == 0) goto L2c
            r9.f9541f0 = r10
            return r10
        L2c:
            int r4 = r9.Y
            r5 = 7
            s2.n r6 = r9.G
            if (r4 == r5) goto L73
            boolean r4 = r9.f9544i0
            if (r4 != 0) goto L3d
            boolean r4 = r6.d()
            if (r4 == 0) goto L73
        L3d:
            o2.b1[] r4 = r9.O
            int r4 = r4.length
            r5 = r1
        L41:
            if (r5 >= r4) goto L70
            o2.b1[] r7 = r9.O
            r7 = r7[r5]
            int r8 = r7.t()
            if (r8 != 0) goto L50
            if (r2 == 0) goto L50
            goto L6d
        L50:
            boolean r8 = r9.T
            if (r8 == 0) goto L5b
            int r8 = r7.f9386q
            boolean r7 = r7.F(r8)
            goto L61
        L5b:
            boolean r8 = r9.f9544i0
            boolean r7 = r7.G(r8, r10)
        L61:
            if (r7 != 0) goto L6d
            boolean r7 = r0[r5]
            if (r7 != 0) goto L6b
            boolean r7 = r9.S
            if (r7 != 0) goto L6d
        L6b:
            r3 = r1
            goto L70
        L6d:
            int r5 = r5 + 1
            goto L41
        L70:
            if (r3 == 0) goto L73
            goto La3
        L73:
            r9.f9542g0 = r1
            r9.f9541f0 = r10
            r9.f9544i0 = r1
            r9.f9537b0 = r1
            boolean r0 = r6.d()
            if (r0 == 0) goto L92
            o2.b1[] r0 = r9.O
            int r2 = r0.length
        L84:
            if (r1 >= r2) goto L8e
            r3 = r0[r1]
            r3.k()
            int r1 = r1 + 1
            goto L84
        L8e:
            r6.a()
            return r10
        L92:
            r0 = 0
            r6.f11469c = r0
            o2.b1[] r0 = r9.O
            int r2 = r0.length
            r3 = r1
        L99:
            if (r3 >= r2) goto La3
            r4 = r0[r3]
            r4.D(r1)
            int r3 = r3 + 1
            goto L99
        La3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.u0.w(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long y(boolean r6) {
        /*
            r5 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            o2.b1[] r3 = r5.O
            int r3 = r3.length
            if (r2 >= r3) goto L26
            if (r6 != 0) goto L17
            sb.p r3 = r5.U
            r3.getClass()
            java.lang.Object r3 = r3.f11744y
            boolean[] r3 = (boolean[]) r3
            boolean r3 = r3[r2]
            if (r3 == 0) goto L23
        L17:
            o2.b1[] r3 = r5.O
            r3 = r3[r2]
            long r3 = r3.q()
            long r0 = java.lang.Math.max(r0, r3)
        L23:
            int r2 = r2 + 1
            goto L3
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.u0.y(boolean):long");
    }

    public final boolean z() {
        return this.f9541f0 != -9223372036854775807L;
    }

    @Override // o2.e1
    public final void x(long j8) {
    }
}
