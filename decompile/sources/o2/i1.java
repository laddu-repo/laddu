package o2;

import c2.u1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements b0, a0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b0 f9458v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f9459w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a0 f9460x;

    public i1(b0 b0Var, long j8) {
        this.f9458v = b0Var;
        this.f9459w = j8;
    }

    @Override // o2.d1
    public final void a(e1 e1Var) {
        a0 a0Var = this.f9460x;
        a0Var.getClass();
        a0Var.a(this);
    }

    @Override // o2.e1
    public final boolean c() {
        return this.f9458v.c();
    }

    @Override // o2.e1
    public final boolean d(c2.v0 v0Var) {
        c2.u0 u0Var = new c2.u0();
        long j8 = v0Var.f1978a;
        u0Var.f1970b = v0Var.f1979b;
        u0Var.f1971c = v0Var.f1980c;
        u0Var.f1969a = j8 - this.f9459w;
        return this.f9458v.d(new c2.v0(u0Var));
    }

    @Override // o2.e1
    public final long h() {
        long jH = this.f9458v.h();
        if (jH == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jH + this.f9459w;
    }

    @Override // o2.b0
    public final void i(boolean z2, long j8) {
        this.f9458v.i(z2, j8 - this.f9459w);
    }

    @Override // o2.b0
    public final long j() {
        long j8 = this.f9458v.j();
        if (j8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j8 + this.f9459w;
    }

    @Override // o2.b0
    public final long l(long j8, u1 u1Var) {
        long j9 = this.f9459w;
        return this.f9458v.l(j8 - j9, u1Var) + j9;
    }

    @Override // o2.b0
    public final long m(r2.s[] sVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j8) {
        c1[] c1VarArr2 = new c1[c1VarArr.length];
        int i = 0;
        while (true) {
            c1 c1Var = null;
            if (i >= c1VarArr.length) {
                break;
            }
            h1 h1Var = (h1) c1VarArr[i];
            if (h1Var != null) {
                c1Var = h1Var.f9451v;
            }
            c1VarArr2[i] = c1Var;
            i++;
        }
        b0 b0Var = this.f9458v;
        long j9 = this.f9459w;
        long jM = b0Var.m(sVarArr, zArr, c1VarArr2, zArr2, j8 - j9);
        for (int i10 = 0; i10 < c1VarArr.length; i10++) {
            c1 c1Var2 = c1VarArr2[i10];
            if (c1Var2 == null) {
                c1VarArr[i10] = null;
            } else {
                c1 c1Var3 = c1VarArr[i10];
                if (c1Var3 == null || ((h1) c1Var3).f9451v != c1Var2) {
                    c1VarArr[i10] = new h1(c1Var2, j9);
                }
            }
        }
        return jM + j9;
    }

    @Override // o2.b0
    public final void n(a0 a0Var, long j8) {
        this.f9460x = a0Var;
        this.f9458v.n(this, j8 - this.f9459w);
    }

    @Override // o2.b0
    public final j1 q() {
        return this.f9458v.q();
    }

    @Override // o2.a0
    public final void s(b0 b0Var) {
        a0 a0Var = this.f9460x;
        a0Var.getClass();
        a0Var.s(this);
    }

    @Override // o2.e1
    public final long u() {
        long jU = this.f9458v.u();
        if (jU == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jU + this.f9459w;
    }

    @Override // o2.b0
    public final void v() {
        this.f9458v.v();
    }

    @Override // o2.b0
    public final long w(long j8) {
        long j9 = this.f9459w;
        return this.f9458v.w(j8 - j9) + j9;
    }

    @Override // o2.e1
    public final void x(long j8) {
        this.f9458v.x(j8 - this.f9459w);
    }
}
