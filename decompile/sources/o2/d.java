package o2;

import c2.u1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b0, a0 {
    public long A;
    public g B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b0 f9399v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a0 f9400w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c[] f9401x = new c[0];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f9402y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f9403z;

    public d(b0 b0Var, boolean z2, long j8, long j9) {
        this.f9399v = b0Var;
        this.f9402y = z2 ? j8 : -9223372036854775807L;
        this.f9403z = j8;
        this.A = j9;
    }

    @Override // o2.d1
    public final void a(e1 e1Var) {
        a0 a0Var = this.f9400w;
        a0Var.getClass();
        a0Var.a(this);
    }

    public final boolean b() {
        return this.f9402y != -9223372036854775807L;
    }

    @Override // o2.e1
    public final boolean c() {
        return this.f9399v.c();
    }

    @Override // o2.e1
    public final boolean d(c2.v0 v0Var) {
        return this.f9399v.d(v0Var);
    }

    @Override // o2.e1
    public final long h() {
        long jH = this.f9399v.h();
        if (jH != Long.MIN_VALUE) {
            long j8 = this.A;
            if (j8 == Long.MIN_VALUE || jH < j8) {
                return jH;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // o2.b0
    public final void i(boolean z2, long j8) {
        this.f9399v.i(z2, j8);
    }

    @Override // o2.b0
    public final long j() {
        if (b()) {
            long j8 = this.f9402y;
            this.f9402y = -9223372036854775807L;
            long j9 = j();
            return j9 != -9223372036854775807L ? j9 : j8;
        }
        long j10 = this.f9399v.j();
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.f9403z;
        long j12 = this.A;
        long jMax = Math.max(j10, j11);
        return j12 != Long.MIN_VALUE ? Math.min(jMax, j12) : jMax;
    }

    @Override // o2.b0
    public final long l(long j8, u1 u1Var) {
        long j9 = this.f9403z;
        if (j8 == j9) {
            return j9;
        }
        long jI = w1.b0.i(u1Var.f1973a, 0L, j8 - j9);
        long j10 = u1Var.f1974b;
        long j11 = this.A;
        long jI2 = w1.b0.i(j10, 0L, j11 == Long.MIN_VALUE ? Long.MAX_VALUE : j11 - j8);
        if (jI != u1Var.f1973a || jI2 != u1Var.f1974b) {
            u1Var = new u1(jI, jI2);
        }
        return this.f9399v.l(j8, u1Var);
    }

    @Override // o2.b0
    public final long m(r2.s[] sVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j8) {
        long j9;
        this.f9401x = new c[c1VarArr.length];
        c1[] c1VarArr2 = new c1[c1VarArr.length];
        for (int i = 0; i < c1VarArr.length; i++) {
            c[] cVarArr = this.f9401x;
            c cVar = (c) c1VarArr[i];
            cVarArr[i] = cVar;
            c1VarArr2[i] = cVar != null ? cVar.f9396v : null;
        }
        long jM = this.f9399v.m(sVarArr, zArr, c1VarArr2, zArr2, j8);
        long j10 = this.A;
        long jMax = Math.max(jM, j8);
        if (j10 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j10);
        }
        if (b()) {
            if (jM >= j8) {
                if (jM != 0) {
                    for (r2.s sVar : sVarArr) {
                        if (sVar != null) {
                            t1.o oVarK = sVar.k();
                            if (!t1.f0.a(oVarK.f12061n, oVarK.f12058k)) {
                            }
                        }
                    }
                }
                j9 = -9223372036854775807L;
            }
            j9 = jMax;
            break;
        } else {
            j9 = -9223372036854775807L;
        }
        this.f9402y = j9;
        for (int i10 = 0; i10 < c1VarArr.length; i10++) {
            c1 c1Var = c1VarArr2[i10];
            if (c1Var == null) {
                this.f9401x[i10] = null;
            } else {
                c[] cVarArr2 = this.f9401x;
                c cVar2 = cVarArr2[i10];
                if (cVar2 == null || cVar2.f9396v != c1Var) {
                    cVarArr2[i10] = new c(this, c1Var);
                }
            }
            c1VarArr[i10] = this.f9401x[i10];
        }
        return jMax;
    }

    @Override // o2.b0
    public final void n(a0 a0Var, long j8) {
        this.f9400w = a0Var;
        this.f9399v.n(this, j8);
    }

    @Override // o2.b0
    public final j1 q() {
        return this.f9399v.q();
    }

    @Override // o2.a0
    public final void s(b0 b0Var) {
        if (this.B != null) {
            return;
        }
        a0 a0Var = this.f9400w;
        a0Var.getClass();
        a0Var.s(this);
    }

    @Override // o2.e1
    public final long u() {
        long jU = this.f9399v.u();
        if (jU != Long.MIN_VALUE) {
            long j8 = this.A;
            if (j8 == Long.MIN_VALUE || jU < j8) {
                return jU;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // o2.b0
    public final void v() throws g {
        g gVar = this.B;
        if (gVar != null) {
            throw gVar;
        }
        this.f9399v.v();
    }

    @Override // o2.b0
    public final long w(long j8) {
        this.f9402y = -9223372036854775807L;
        for (c cVar : this.f9401x) {
            if (cVar != null) {
                cVar.f9397w = false;
            }
        }
        long jW = this.f9399v.w(j8);
        long j9 = this.f9403z;
        long j10 = this.A;
        long jMax = Math.max(jW, j9);
        return j10 != Long.MIN_VALUE ? Math.min(jMax, j10) : jMax;
    }

    @Override // o2.e1
    public final void x(long j8) {
        this.f9399v.x(j8);
    }
}
