package o2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements r2.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r2.s f9477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1.t0 f9478b;

    public l0(r2.s sVar, t1.t0 t0Var) {
        this.f9477a = sVar;
        this.f9478b = t0Var;
    }

    @Override // r2.s
    public final void a(boolean z2) {
        this.f9477a.a(z2);
    }

    @Override // r2.s
    public final boolean b(int i, long j8) {
        return this.f9477a.b(i, j8);
    }

    @Override // r2.s
    public final t1.o c(int i) {
        return this.f9478b.f12114d[this.f9477a.e(i)];
    }

    @Override // r2.s
    public final void d() {
        this.f9477a.d();
    }

    @Override // r2.s
    public final int e(int i) {
        return this.f9477a.e(i);
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof l0)) {
            return this.f9478b.equals(((l0) obj).f9478b);
        }
        return false;
    }

    @Override // r2.s
    public final int f(long j8, List list) {
        return this.f9477a.f(j8, list);
    }

    @Override // r2.s
    public final void g() {
        this.f9477a.g();
    }

    @Override // r2.s
    public final boolean h(long j8, p2.f fVar, List list) {
        return this.f9477a.h(j8, fVar, list);
    }

    public final int hashCode() {
        return this.f9478b.hashCode() + (this.f9477a.hashCode() * 31);
    }

    @Override // r2.s
    public final int i() {
        return this.f9477a.i();
    }

    @Override // r2.s
    public final t1.t0 j() {
        return this.f9478b;
    }

    @Override // r2.s
    public final t1.o k() {
        return this.f9478b.f12114d[this.f9477a.i()];
    }

    @Override // r2.s
    public final int l() {
        return this.f9477a.l();
    }

    @Override // r2.s
    public final int length() {
        return this.f9477a.length();
    }

    @Override // r2.s
    public final int m() {
        return this.f9477a.m();
    }

    @Override // r2.s
    public final int n(t1.o oVar) {
        return this.f9477a.u(this.f9478b.a(oVar));
    }

    @Override // r2.s
    public final boolean o(int i, long j8) {
        return this.f9477a.o(i, j8);
    }

    @Override // r2.s
    public final void p(float f) {
        this.f9477a.p(f);
    }

    @Override // r2.s
    public final Object q() {
        return this.f9477a.q();
    }

    @Override // r2.s
    public final void r() {
        this.f9477a.r();
    }

    @Override // r2.s
    public final void s(long j8, long j9, long j10, List list, p2.m[] mVarArr) {
        this.f9477a.s(j8, j9, j10, list, mVarArr);
    }

    @Override // r2.s
    public final void t() {
        this.f9477a.t();
    }

    @Override // r2.s
    public final int u(int i) {
        return this.f9477a.u(i);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l0) {
            return this.f9477a.equals(((l0) obj).f9477a);
        }
        return false;
    }
}
