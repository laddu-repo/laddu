package o2;

import c2.u1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v implements b0, a0 {
    public a0 A;
    public long B = -9223372036854775807L;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d0 f9551v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f9552w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final s2.e f9553x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a f9554y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public b0 f9555z;

    public v(d0 d0Var, s2.e eVar, long j8) {
        this.f9551v = d0Var;
        this.f9553x = eVar;
        this.f9552w = j8;
    }

    @Override // o2.d1
    public final void a(e1 e1Var) {
        a0 a0Var = this.A;
        int i = w1.b0.f13686a;
        a0Var.a(this);
    }

    public final void b(d0 d0Var) {
        long j8 = this.B;
        if (j8 == -9223372036854775807L) {
            j8 = this.f9552w;
        }
        a aVar = this.f9554y;
        aVar.getClass();
        b0 b0VarB = aVar.b(d0Var, this.f9553x, j8);
        this.f9555z = b0VarB;
        if (this.A != null) {
            b0VarB.n(this, j8);
        }
    }

    @Override // o2.e1
    public final boolean c() {
        b0 b0Var = this.f9555z;
        return b0Var != null && b0Var.c();
    }

    @Override // o2.e1
    public final boolean d(c2.v0 v0Var) {
        b0 b0Var = this.f9555z;
        return b0Var != null && b0Var.d(v0Var);
    }

    @Override // o2.e1
    public final long h() {
        b0 b0Var = this.f9555z;
        int i = w1.b0.f13686a;
        return b0Var.h();
    }

    @Override // o2.b0
    public final void i(boolean z2, long j8) {
        b0 b0Var = this.f9555z;
        int i = w1.b0.f13686a;
        b0Var.i(z2, j8);
    }

    @Override // o2.b0
    public final long j() {
        b0 b0Var = this.f9555z;
        int i = w1.b0.f13686a;
        return b0Var.j();
    }

    @Override // o2.b0
    public final long l(long j8, u1 u1Var) {
        b0 b0Var = this.f9555z;
        int i = w1.b0.f13686a;
        return b0Var.l(j8, u1Var);
    }

    @Override // o2.b0
    public final long m(r2.s[] sVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j8) {
        long j9 = this.B;
        long j10 = (j9 == -9223372036854775807L || j8 != this.f9552w) ? j8 : j9;
        this.B = -9223372036854775807L;
        b0 b0Var = this.f9555z;
        int i = w1.b0.f13686a;
        return b0Var.m(sVarArr, zArr, c1VarArr, zArr2, j10);
    }

    @Override // o2.b0
    public final void n(a0 a0Var, long j8) {
        this.A = a0Var;
        b0 b0Var = this.f9555z;
        if (b0Var != null) {
            long j9 = this.B;
            if (j9 == -9223372036854775807L) {
                j9 = this.f9552w;
            }
            b0Var.n(this, j9);
        }
    }

    @Override // o2.b0
    public final j1 q() {
        b0 b0Var = this.f9555z;
        int i = w1.b0.f13686a;
        return b0Var.q();
    }

    @Override // o2.a0
    public final void s(b0 b0Var) {
        a0 a0Var = this.A;
        int i = w1.b0.f13686a;
        a0Var.s(this);
    }

    @Override // o2.e1
    public final long u() {
        b0 b0Var = this.f9555z;
        int i = w1.b0.f13686a;
        return b0Var.u();
    }

    @Override // o2.b0
    public final void v() {
        b0 b0Var = this.f9555z;
        if (b0Var != null) {
            b0Var.v();
            return;
        }
        a aVar = this.f9554y;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override // o2.b0
    public final long w(long j8) {
        b0 b0Var = this.f9555z;
        int i = w1.b0.f13686a;
        return b0Var.w(j8);
    }

    @Override // o2.e1
    public final void x(long j8) {
        b0 b0Var = this.f9555z;
        int i = w1.b0.f13686a;
        b0Var.x(j8);
    }
}
