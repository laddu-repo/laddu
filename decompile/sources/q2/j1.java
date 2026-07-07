package q2;

import a2.c2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j1 implements a0, z {

    /* renamed from: x, reason: collision with root package name */
    public final a0 f10898x;

    /* renamed from: y, reason: collision with root package name */
    public final long f10899y;

    /* renamed from: z, reason: collision with root package name */
    public z f10900z;

    public j1(a0 a0Var, long j) {
        this.f10898x = a0Var;
        this.f10899y = j;
    }

    @Override // q2.b1
    public final boolean a() {
        return this.f10898x.a();
    }

    @Override // q2.a0
    public final long c(long j, c2 c2Var) {
        long j10 = this.f10899y;
        return this.f10898x.c(j - j10, c2Var) + j10;
    }

    @Override // q2.b1
    public final long e() {
        long e10 = this.f10898x.e();
        if (e10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return e10 + this.f10899y;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, a2.z0] */
    @Override // q2.b1
    public final boolean f(a2.a1 a1Var) {
        ?? obj = new Object();
        long j = a1Var.f158a;
        obj.f510b = a1Var.f159b;
        obj.f511c = a1Var.f160c;
        obj.f509a = j - this.f10899y;
        return this.f10898x.f(new a2.a1(obj));
    }

    @Override // q2.a0
    public final void g() {
        this.f10898x.g();
    }

    @Override // q2.a0
    public final long h(long j) {
        long j10 = this.f10899y;
        return this.f10898x.h(j - j10) + j10;
    }

    @Override // q2.a0
    public final void i(long j) {
        this.f10898x.i(j - this.f10899y);
    }

    @Override // q2.a1
    public final void j(b1 b1Var) {
        z zVar = this.f10900z;
        zVar.getClass();
        zVar.j(this);
    }

    @Override // q2.z
    public final void k(a0 a0Var) {
        z zVar = this.f10900z;
        zVar.getClass();
        zVar.k(this);
    }

    @Override // q2.a0
    public final void l(z zVar, long j) {
        this.f10900z = zVar;
        this.f10898x.l(this, j - this.f10899y);
    }

    @Override // q2.a0
    public final long m() {
        long m9 = this.f10898x.m();
        if (m9 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return m9 + this.f10899y;
    }

    @Override // q2.a0
    public final long p(t2.s[] sVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j) {
        z0[] z0VarArr2 = new z0[z0VarArr.length];
        int i6 = 0;
        while (true) {
            z0 z0Var = null;
            if (i6 >= z0VarArr.length) {
                break;
            }
            i1 i1Var = (i1) z0VarArr[i6];
            if (i1Var != null) {
                z0Var = i1Var.f10891x;
            }
            z0VarArr2[i6] = z0Var;
            i6++;
        }
        a0 a0Var = this.f10898x;
        long j10 = this.f10899y;
        long p10 = a0Var.p(sVarArr, zArr, z0VarArr2, zArr2, j - j10);
        for (int i10 = 0; i10 < z0VarArr.length; i10++) {
            z0 z0Var2 = z0VarArr2[i10];
            if (z0Var2 == null) {
                z0VarArr[i10] = null;
            } else {
                z0 z0Var3 = z0VarArr[i10];
                if (z0Var3 == null || ((i1) z0Var3).f10891x != z0Var2) {
                    z0VarArr[i10] = new i1(z0Var2, j10);
                }
            }
        }
        return p10 + j10;
    }

    @Override // q2.a0
    public final k1 q() {
        return this.f10898x.q();
    }

    @Override // q2.b1
    public final long r() {
        long r10 = this.f10898x.r();
        if (r10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return r10 + this.f10899y;
    }

    @Override // q2.b1
    public final void s(long j) {
        this.f10898x.s(j - this.f10899y);
    }
}
