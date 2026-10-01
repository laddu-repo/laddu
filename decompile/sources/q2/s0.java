package q2;

import a2.c2;
import android.net.Uri;
import android.os.Handler;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s0 implements a0, y2.q, u2.j, u2.m, x0 {

    /* renamed from: n0, reason: collision with root package name */
    public static final Map f10944n0;
    public static final r1.q o0;
    public final o5.e0 A;
    public final b2.k B;
    public final f2.l C;
    public final u0 D;
    public final u2.e E;
    public final String F;
    public final long G;
    public final r1.q H;
    public final long I;
    public final u2.o J;
    public final n9.j K;
    public final u1.f L;
    public final n0 M;
    public final n0 N;
    public final Handler O;
    public z P;
    public l3.b Q;
    public y0[] R;
    public r0[] S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public ic.s X;
    public y2.z Y;
    public long Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f10945a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f10946b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f10947c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f10948d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f10949e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f10950f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f10951g0;

    /* renamed from: h0, reason: collision with root package name */
    public long f10952h0;

    /* renamed from: i0, reason: collision with root package name */
    public long f10953i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f10954j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f10955k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f10956l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f10957m0;

    /* renamed from: x, reason: collision with root package name */
    public final Uri f10958x;

    /* renamed from: y, reason: collision with root package name */
    public final w1.h f10959y;

    /* renamed from: z, reason: collision with root package name */
    public final f2.o f10960z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        f10944n0 = Collections.unmodifiableMap(hashMap);
        r1.p pVar = new r1.p();
        pVar.f11600a = "icy";
        pVar.f11611m = r1.k0.p("application/x-icy");
        o0 = new r1.q(pVar);
    }

    public s0(Uri uri, w1.h hVar, n9.j jVar, f2.o oVar, f2.l lVar, o5.e0 e0Var, b2.k kVar, u0 u0Var, u2.e eVar, String str, int i6, r1.q qVar, long j, v2.a aVar) {
        u2.o oVar2;
        this.f10958x = uri;
        this.f10959y = hVar;
        this.f10960z = oVar;
        this.C = lVar;
        this.A = e0Var;
        this.B = kVar;
        this.D = u0Var;
        this.E = eVar;
        this.F = str;
        this.G = i6;
        this.H = qVar;
        if (aVar != null) {
            oVar2 = new u2.o(aVar);
        } else {
            oVar2 = new u2.o("ProgressiveMediaPeriod");
        }
        this.J = oVar2;
        this.K = jVar;
        this.I = j;
        this.L = new u1.f();
        this.M = new n0(this, 1);
        this.N = new n0(this, 2);
        this.O = u1.a0.n(null);
        this.S = new r0[0];
        this.R = new y0[0];
        this.f10953i0 = -9223372036854775807L;
        this.f10946b0 = 1;
    }

    @Override // y2.q
    public final y2.f0 A(int i6, int i10) {
        return B(new r0(i6, false));
    }

    public final y2.f0 B(r0 r0Var) {
        int length = this.R.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (r0Var.equals(this.S[i6])) {
                return this.R[i6];
            }
        }
        if (this.T) {
            u1.a.p("ProgressiveMediaPeriod", "Extractor added new track (id=" + r0Var.f10941a + ") after finishing tracks.");
            return new y2.n();
        }
        f2.o oVar = this.f10960z;
        oVar.getClass();
        y0 y0Var = new y0(this.E, oVar, this.C);
        y0Var.f10992f = this;
        int i10 = length + 1;
        r0[] r0VarArr = (r0[]) Arrays.copyOf(this.S, i10);
        r0VarArr[length] = r0Var;
        String str = u1.a0.f12750a;
        this.S = r0VarArr;
        y0[] y0VarArr = (y0[]) Arrays.copyOf(this.R, i10);
        y0VarArr[length] = y0Var;
        this.R = y0VarArr;
        return y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    @Override // u2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ef.g C(u2.l r15, long r16, long r18, java.io.IOException r20, int r21) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.s0.C(u2.l, long, long, java.io.IOException, int):ef.g");
    }

    @Override // q2.x0
    public final void D() {
        this.O.post(this.M);
    }

    public final void E(y2.z zVar) {
        y2.z bVar;
        boolean z10;
        if (this.Q == null) {
            bVar = zVar;
        } else {
            bVar = new a3.b(-9223372036854775807L);
        }
        this.Y = bVar;
        this.Z = zVar.m();
        int i6 = 1;
        if (!this.f10951g0 && zVar.m() == -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10945a0 = z10;
        if (z10) {
            i6 = 7;
        }
        this.f10946b0 = i6;
        if (this.U) {
            this.D.x(this.Z, zVar, z10);
        } else {
            w();
        }
    }

    public final void F() {
        p0 p0Var = new p0(this, this.f10958x, this.f10959y, this.K, this, this.L);
        if (this.U) {
            u1.c.g(v());
            long j = this.Z;
            if (j != -9223372036854775807L && this.f10953i0 > j) {
                this.f10956l0 = true;
                this.f10953i0 = -9223372036854775807L;
                return;
            }
            y2.z zVar = this.Y;
            zVar.getClass();
            long j10 = zVar.j(this.f10953i0).f14970a.f14851b;
            long j11 = this.f10953i0;
            p0Var.C.f8812a = j10;
            p0Var.F = j11;
            p0Var.E = true;
            p0Var.I = false;
            for (y0 y0Var : this.R) {
                y0Var.f11004t = this.f10953i0;
            }
            this.f10953i0 = -9223372036854775807L;
        }
        this.f10955k0 = j();
        this.J.f(p0Var, this, this.A.f(this.f10946b0));
    }

    public final boolean G() {
        if (!this.f10948d0 && !v()) {
            return false;
        }
        return true;
    }

    @Override // q2.b1
    public final boolean a() {
        boolean z10;
        if (this.J.d()) {
            u1.f fVar = this.L;
            synchronized (fVar) {
                z10 = fVar.f12772b;
            }
            if (z10) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void b() {
        u1.c.g(this.U);
        this.X.getClass();
        this.Y.getClass();
    }

    @Override // q2.a0
    public final long c(long j, c2 c2Var) {
        b();
        if (!this.Y.g()) {
            return 0L;
        }
        y2.y j10 = this.Y.j(j);
        return c2Var.a(j, j10.f14970a.f14850a, j10.f14971b.f14850a);
    }

    @Override // u2.m
    public final void d() {
        for (y0 y0Var : this.R) {
            y0Var.D();
        }
        n9.j jVar = this.K;
        y2.o oVar = (y2.o) jVar.f9356z;
        if (oVar != null) {
            oVar.a();
            jVar.f9356z = null;
        }
        jVar.A = null;
    }

    @Override // q2.b1
    public final long e() {
        return r();
    }

    @Override // q2.b1
    public final boolean f(a2.a1 a1Var) {
        if (!this.f10956l0) {
            u2.o oVar = this.J;
            if (!oVar.c() && !this.f10954j0) {
                if ((!this.U && this.H == null) || this.f10950f0 != 0) {
                    boolean e10 = this.L.e();
                    if (!oVar.d()) {
                        F();
                        return true;
                    }
                    return e10;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // q2.a0
    public final void g() {
        int f3 = this.A.f(this.f10946b0);
        u2.o oVar = this.J;
        IOException iOException = oVar.f12870z;
        if (iOException == null) {
            u2.k kVar = oVar.f12869y;
            if (kVar != null) {
                if (f3 == Integer.MIN_VALUE) {
                    f3 = kVar.f12865x;
                }
                IOException iOException2 = kVar.B;
                if (iOException2 != null && kVar.C > f3) {
                    throw iOException2;
                }
            }
            if (this.f10956l0 && !this.U) {
                throw r1.l0.a(null, "Loading finished before preparation is complete.");
            }
            return;
        }
        throw iOException;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        if (r4 != false) goto L49;
     */
    @Override // q2.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long h(long r10) {
        /*
            r9 = this;
            r9.b()
            ic.s r0 = r9.X
            java.lang.Object r0 = r0.f6782y
            boolean[] r0 = (boolean[]) r0
            y2.z r1 = r9.Y
            boolean r1 = r1.g()
            if (r1 == 0) goto L12
            goto L14
        L12:
            r10 = 0
        L14:
            r1 = 0
            r9.f10948d0 = r1
            long r2 = r9.f10952h0
            r4 = 1
            int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r5 != 0) goto L20
            r2 = 1
            goto L21
        L20:
            r2 = 0
        L21:
            r9.f10952h0 = r10
            boolean r3 = r9.v()
            if (r3 == 0) goto L2c
            r9.f10953i0 = r10
            return r10
        L2c:
            int r3 = r9.f10946b0
            r5 = 7
            u2.o r6 = r9.J
            if (r3 == r5) goto L73
            boolean r3 = r9.f10956l0
            if (r3 != 0) goto L3d
            boolean r3 = r6.d()
            if (r3 == 0) goto L73
        L3d:
            q2.y0[] r3 = r9.R
            int r3 = r3.length
            r5 = 0
        L41:
            if (r5 >= r3) goto L70
            q2.y0[] r7 = r9.R
            r7 = r7[r5]
            int r8 = r7.t()
            if (r8 != 0) goto L50
            if (r2 == 0) goto L50
            goto L6d
        L50:
            boolean r8 = r9.W
            if (r8 == 0) goto L5b
            int r8 = r7.f11002q
            boolean r7 = r7.G(r8)
            goto L61
        L5b:
            boolean r8 = r9.f10956l0
            boolean r7 = r7.H(r8, r10)
        L61:
            if (r7 != 0) goto L6d
            boolean r7 = r0[r5]
            if (r7 != 0) goto L6b
            boolean r7 = r9.V
            if (r7 != 0) goto L6d
        L6b:
            r4 = 0
            goto L70
        L6d:
            int r5 = r5 + 1
            goto L41
        L70:
            if (r4 == 0) goto L73
            goto La3
        L73:
            r9.f10954j0 = r1
            r9.f10953i0 = r10
            r9.f10956l0 = r1
            r9.f10949e0 = r1
            boolean r0 = r6.d()
            if (r0 == 0) goto L92
            q2.y0[] r0 = r9.R
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
            r6.f12870z = r0
            q2.y0[] r0 = r9.R
            int r2 = r0.length
            r3 = 0
        L99:
            if (r3 >= r2) goto La3
            r4 = r0[r3]
            r4.E(r1)
            int r3 = r3 + 1
            goto L99
        La3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.s0.h(long):long");
    }

    @Override // q2.a0
    public final void i(long j) {
        if (!this.W) {
            b();
            if (!v()) {
                boolean[] zArr = (boolean[]) this.X.f6783z;
                int length = this.R.length;
                for (int i6 = 0; i6 < length; i6++) {
                    this.R[i6].j(zArr[i6], j);
                }
            }
        }
    }

    public final int j() {
        int i6 = 0;
        for (y0 y0Var : this.R) {
            i6 += y0Var.f11002q + y0Var.f11001p;
        }
        return i6;
    }

    @Override // u2.j
    public final void k(u2.l lVar, long j, long j10) {
        long j11;
        p0 p0Var = (p0) lVar;
        if (this.Z == -9223372036854775807L && this.Y != null) {
            long u3 = u(true);
            if (u3 == Long.MIN_VALUE) {
                j11 = 0;
            } else {
                j11 = u3 + 10000;
            }
            this.Z = j11;
            this.D.x(j11, this.Y, this.f10945a0);
        }
        Uri uri = p0Var.f10928y.f13560z;
        u uVar = new u(j10);
        this.A.getClass();
        this.B.p(uVar, 1, -1, null, 0, null, p0Var.F, this.Z);
        this.f10956l0 = true;
        z zVar = this.P;
        zVar.getClass();
        zVar.j(this);
    }

    @Override // q2.a0
    public final void l(z zVar, long j) {
        this.P = zVar;
        r1.q qVar = this.H;
        if (qVar != null) {
            A(0, 3).f(qVar);
            E(new y2.w(-9223372036854775807L, new long[]{0}, new long[]{0}));
            t();
            this.f10953i0 = j;
            return;
        }
        this.L.e();
        F();
    }

    @Override // q2.a0
    public final long m() {
        if (this.f10949e0) {
            this.f10949e0 = false;
            return this.f10952h0;
        }
        if (this.f10948d0) {
            if (this.f10956l0 || j() > this.f10955k0) {
                this.f10948d0 = false;
                return this.f10952h0;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // y2.q
    public final void n(y2.z zVar) {
        this.O.post(new m8.c(2, this, zVar));
    }

    @Override // u2.j
    public final void o(u2.l lVar, long j, long j10, boolean z10) {
        p0 p0Var = (p0) lVar;
        Uri uri = p0Var.f10928y.f13560z;
        u uVar = new u(j10);
        this.A.getClass();
        this.B.n(uVar, 1, -1, null, 0, null, p0Var.F, this.Z);
        if (!z10) {
            for (y0 y0Var : this.R) {
                y0Var.E(false);
            }
            if (this.f10950f0 > 0) {
                z zVar = this.P;
                zVar.getClass();
                zVar.j(this);
            }
        }
    }

    @Override // q2.a0
    public final long p(t2.s[] sVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j) {
        boolean z10;
        t2.s sVar;
        boolean z11;
        boolean z12;
        b();
        ic.s sVar2 = this.X;
        k1 k1Var = (k1) sVar2.f6781x;
        boolean[] zArr3 = (boolean[]) sVar2.f6783z;
        int i6 = this.f10950f0;
        int i10 = 0;
        for (int i11 = 0; i11 < sVarArr.length; i11++) {
            z0 z0Var = z0VarArr[i11];
            if (z0Var != null && (sVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((q0) z0Var).f10939x;
                u1.c.g(zArr3[i12]);
                this.f10950f0--;
                zArr3[i12] = false;
                z0VarArr[i11] = null;
            }
        }
        if (!this.f10947c0 ? !(j == 0 || this.W) : i6 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i13 = 0; i13 < sVarArr.length; i13++) {
            if (z0VarArr[i13] == null && (sVar = sVarArr[i13]) != null) {
                if (sVar.length() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                u1.c.g(z11);
                if (sVar.j(0) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                u1.c.g(z12);
                int b10 = k1Var.b(sVar.c());
                u1.c.g(!zArr3[b10]);
                this.f10950f0++;
                zArr3[b10] = true;
                this.f10949e0 = sVar.n().f11675t | this.f10949e0;
                z0VarArr[i13] = new q0(this, b10);
                zArr2[i13] = true;
                if (!z10) {
                    y0 y0Var = this.R[b10];
                    if (y0Var.t() != 0 && !y0Var.H(true, j)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (this.f10950f0 == 0) {
            this.f10954j0 = false;
            this.f10948d0 = false;
            this.f10949e0 = false;
            u2.o oVar = this.J;
            if (oVar.d()) {
                y0[] y0VarArr = this.R;
                int length = y0VarArr.length;
                while (i10 < length) {
                    y0VarArr[i10].k();
                    i10++;
                }
                oVar.a();
            } else {
                this.f10956l0 = false;
                for (y0 y0Var2 : this.R) {
                    y0Var2.E(false);
                }
            }
        } else if (z10) {
            j = h(j);
            while (i10 < z0VarArr.length) {
                if (z0VarArr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.f10947c0 = true;
        return j;
    }

    @Override // q2.a0
    public final k1 q() {
        b();
        return (k1) this.X.f6781x;
    }

    @Override // q2.b1
    public final long r() {
        long j;
        boolean z10;
        b();
        if (this.f10956l0 || this.f10950f0 == 0) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.f10953i0;
        }
        if (this.V) {
            int length = this.R.length;
            j = Long.MAX_VALUE;
            for (int i6 = 0; i6 < length; i6++) {
                ic.s sVar = this.X;
                if (((boolean[]) sVar.f6782y)[i6] && ((boolean[]) sVar.f6783z)[i6]) {
                    y0 y0Var = this.R[i6];
                    synchronized (y0Var) {
                        z10 = y0Var.f11007w;
                    }
                    if (!z10) {
                        j = Math.min(j, this.R[i6].q());
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = u(false);
        }
        if (j == Long.MIN_VALUE) {
            return this.f10952h0;
        }
        return j;
    }

    @Override // y2.q
    public final void t() {
        this.T = true;
        this.O.post(this.M);
    }

    public final long u(boolean z10) {
        long j = Long.MIN_VALUE;
        for (int i6 = 0; i6 < this.R.length; i6++) {
            if (!z10) {
                ic.s sVar = this.X;
                sVar.getClass();
                if (!((boolean[]) sVar.f6783z)[i6]) {
                }
            }
            j = Math.max(j, this.R[i6].q());
        }
        return j;
    }

    public final boolean v() {
        if (this.f10953i0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, ic.s] */
    public final void w() {
        boolean z10;
        boolean z11;
        r1.j0 a10;
        long j = this.I;
        if (!this.f10957m0 && !this.U && this.T && this.Y != null) {
            for (y0 y0Var : this.R) {
                if (y0Var.w() == null) {
                    return;
                }
            }
            u1.f fVar = this.L;
            synchronized (fVar) {
                fVar.f12772b = false;
            }
            int length = this.R.length;
            r1.e1[] e1VarArr = new r1.e1[length];
            boolean[] zArr = new boolean[length];
            for (int i6 = 0; i6 < length; i6++) {
                r1.q w10 = this.R[i6].w();
                w10.getClass();
                String str = w10.f11670n;
                boolean k8 = r1.k0.k(str);
                if (!k8 && !r1.k0.o(str)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                zArr[i6] = z10;
                this.V = z10 | this.V;
                boolean m9 = r1.k0.m(str);
                if (j != -9223372036854775807L && length == 1 && m9) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.W = z11;
                l3.b bVar = this.Q;
                if (bVar != null) {
                    int i10 = bVar.f8095a;
                    if (k8 || this.S[i6].f10942b) {
                        r1.j0 j0Var = w10.f11668l;
                        if (j0Var == null) {
                            a10 = new r1.j0(bVar);
                        } else {
                            a10 = j0Var.a(bVar);
                        }
                        r1.p a11 = w10.a();
                        a11.f11609k = a10;
                        w10 = new r1.q(a11);
                    }
                    if (k8 && w10.f11665h == -1 && w10.f11666i == -1 && i10 != -1) {
                        r1.p a12 = w10.a();
                        a12.f11607h = i10;
                        w10 = new r1.q(a12);
                    }
                }
                int l10 = this.f10960z.l(w10);
                r1.p a13 = w10.a();
                a13.N = l10;
                r1.q qVar = new r1.q(a13);
                e1VarArr[i6] = new r1.e1(Integer.toString(i6), qVar);
                this.f10949e0 = qVar.f11675t | this.f10949e0;
            }
            k1 k1Var = new k1(e1VarArr);
            ?? obj = new Object();
            obj.f6781x = k1Var;
            obj.f6782y = zArr;
            int i11 = k1Var.f10909a;
            obj.f6783z = new boolean[i11];
            obj.A = new boolean[i11];
            this.X = obj;
            if (this.W && this.Z == -9223372036854775807L) {
                this.Z = j;
                this.Y = new o0(this, this.Y);
            }
            this.D.x(this.Z, this.Y, this.f10945a0);
            this.U = true;
            z zVar = this.P;
            zVar.getClass();
            zVar.k(this);
        }
    }

    public final void x(int i6) {
        b();
        ic.s sVar = this.X;
        boolean[] zArr = (boolean[]) sVar.A;
        if (!zArr[i6]) {
            r1.q qVar = ((k1) sVar.f6781x).a(i6).f11389d[0];
            this.B.h(r1.k0.i(qVar.f11670n), qVar, 0, null, this.f10952h0);
            zArr[i6] = true;
        }
    }

    public final void y(int i6) {
        b();
        if (this.f10954j0) {
            if ((!this.V || ((boolean[]) this.X.f6782y)[i6]) && !this.R[i6].x(false)) {
                this.f10953i0 = 0L;
                this.f10954j0 = false;
                this.f10948d0 = true;
                this.f10952h0 = 0L;
                this.f10955k0 = 0;
                for (y0 y0Var : this.R) {
                    y0Var.E(false);
                }
                z zVar = this.P;
                zVar.getClass();
                zVar.j(this);
            }
        }
    }

    @Override // u2.j
    public final void z(u2.l lVar, long j, long j10, int i6) {
        u uVar;
        p0 p0Var = (p0) lVar;
        w1.z zVar = p0Var.f10928y;
        if (i6 == 0) {
            uVar = new u(p0Var.G);
        } else {
            Uri uri = zVar.f13560z;
            uVar = new u(j10);
        }
        this.B.s(uVar, 1, -1, null, 0, null, p0Var.F, this.Z, i6);
    }

    @Override // q2.b1
    public final void s(long j) {
    }
}
