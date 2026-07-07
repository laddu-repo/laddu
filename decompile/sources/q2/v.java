package q2;

import a2.c2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v implements a0, z {
    public a A;
    public a0 B;
    public z C;
    public long D = -9223372036854775807L;

    /* renamed from: x, reason: collision with root package name */
    public final c0 f10971x;

    /* renamed from: y, reason: collision with root package name */
    public final long f10972y;

    /* renamed from: z, reason: collision with root package name */
    public final u2.e f10973z;

    public v(c0 c0Var, u2.e eVar, long j) {
        this.f10971x = c0Var;
        this.f10973z = eVar;
        this.f10972y = j;
    }

    @Override // q2.b1
    public final boolean a() {
        a0 a0Var = this.B;
        if (a0Var != null && a0Var.a()) {
            return true;
        }
        return false;
    }

    public final void b(c0 c0Var) {
        long j = this.D;
        if (j == -9223372036854775807L) {
            j = this.f10972y;
        }
        a aVar = this.A;
        aVar.getClass();
        a0 c10 = aVar.c(c0Var, this.f10973z, j);
        this.B = c10;
        if (this.C != null) {
            c10.l(this, j);
        }
    }

    @Override // q2.a0
    public final long c(long j, c2 c2Var) {
        a0 a0Var = this.B;
        String str = u1.a0.f12750a;
        return a0Var.c(j, c2Var);
    }

    @Override // q2.b1
    public final long e() {
        a0 a0Var = this.B;
        String str = u1.a0.f12750a;
        return a0Var.e();
    }

    @Override // q2.b1
    public final boolean f(a2.a1 a1Var) {
        a0 a0Var = this.B;
        if (a0Var != null && a0Var.f(a1Var)) {
            return true;
        }
        return false;
    }

    @Override // q2.a0
    public final void g() {
        a0 a0Var = this.B;
        if (a0Var != null) {
            a0Var.g();
            return;
        }
        a aVar = this.A;
        if (aVar != null) {
            aVar.l();
        }
    }

    @Override // q2.a0
    public final long h(long j) {
        a0 a0Var = this.B;
        String str = u1.a0.f12750a;
        return a0Var.h(j);
    }

    @Override // q2.a0
    public final void i(long j) {
        a0 a0Var = this.B;
        String str = u1.a0.f12750a;
        a0Var.i(j);
    }

    @Override // q2.a1
    public final void j(b1 b1Var) {
        z zVar = this.C;
        String str = u1.a0.f12750a;
        zVar.j(this);
    }

    @Override // q2.z
    public final void k(a0 a0Var) {
        z zVar = this.C;
        String str = u1.a0.f12750a;
        zVar.k(this);
    }

    @Override // q2.a0
    public final void l(z zVar, long j) {
        this.C = zVar;
        a0 a0Var = this.B;
        if (a0Var != null) {
            long j10 = this.D;
            if (j10 == -9223372036854775807L) {
                j10 = this.f10972y;
            }
            a0Var.l(this, j10);
        }
    }

    @Override // q2.a0
    public final long m() {
        a0 a0Var = this.B;
        String str = u1.a0.f12750a;
        return a0Var.m();
    }

    @Override // q2.a0
    public final long p(t2.s[] sVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j) {
        long j10;
        long j11 = this.D;
        if (j11 != -9223372036854775807L && j == this.f10972y) {
            j10 = j11;
        } else {
            j10 = j;
        }
        this.D = -9223372036854775807L;
        a0 a0Var = this.B;
        String str = u1.a0.f12750a;
        return a0Var.p(sVarArr, zArr, z0VarArr, zArr2, j10);
    }

    @Override // q2.a0
    public final k1 q() {
        a0 a0Var = this.B;
        String str = u1.a0.f12750a;
        return a0Var.q();
    }

    @Override // q2.b1
    public final long r() {
        a0 a0Var = this.B;
        String str = u1.a0.f12750a;
        return a0Var.r();
    }

    @Override // q2.b1
    public final void s(long j) {
        a0 a0Var = this.B;
        String str = u1.a0.f12750a;
        a0Var.s(j);
    }
}
