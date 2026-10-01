package q2;

import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j0 implements t2.s {

    /* renamed from: a, reason: collision with root package name */
    public final t2.s f10896a;

    /* renamed from: b, reason: collision with root package name */
    public final r1.e1 f10897b;

    public j0(t2.s sVar, r1.e1 e1Var) {
        this.f10896a = sVar;
        this.f10897b = e1Var;
    }

    @Override // t2.s
    public final boolean a(int i6, long j) {
        return this.f10896a.a(i6, j);
    }

    @Override // t2.s
    public final void b(long j, long j10, long j11, List list, r2.m[] mVarArr) {
        this.f10896a.b(j, j10, j11, list, mVarArr);
    }

    @Override // t2.s
    public final r1.e1 c() {
        return this.f10897b;
    }

    @Override // t2.s
    public final int d() {
        return this.f10896a.d();
    }

    @Override // t2.s
    public final boolean e(long j, r2.e eVar, List list) {
        return this.f10896a.e(j, eVar, list);
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof j0)) {
            return this.f10897b.equals(((j0) obj).f10897b);
        }
        return false;
    }

    @Override // t2.s
    public final void f(boolean z10) {
        this.f10896a.f(z10);
    }

    @Override // t2.s
    public final int g(r1.q qVar) {
        return this.f10896a.u(this.f10897b.a(qVar));
    }

    @Override // t2.s
    public final r1.q h(int i6) {
        return this.f10897b.f11389d[this.f10896a.j(i6)];
    }

    public final int hashCode() {
        return this.f10897b.hashCode() + (this.f10896a.hashCode() * 31);
    }

    @Override // t2.s
    public final void i() {
        this.f10896a.i();
    }

    @Override // t2.s
    public final int j(int i6) {
        return this.f10896a.j(i6);
    }

    @Override // t2.s
    public final int k(long j, List list) {
        return this.f10896a.k(j, list);
    }

    @Override // t2.s
    public final void l() {
        this.f10896a.l();
    }

    @Override // t2.s
    public final int length() {
        return this.f10896a.length();
    }

    @Override // t2.s
    public final int m() {
        return this.f10896a.m();
    }

    @Override // t2.s
    public final r1.q n() {
        return this.f10897b.f11389d[this.f10896a.m()];
    }

    @Override // t2.s
    public final int o() {
        return this.f10896a.o();
    }

    @Override // t2.s
    public final boolean p(int i6, long j) {
        return this.f10896a.p(i6, j);
    }

    @Override // t2.s
    public final void q(float f3) {
        this.f10896a.q(f3);
    }

    @Override // t2.s
    public final Object r() {
        return this.f10896a.r();
    }

    @Override // t2.s
    public final void s() {
        this.f10896a.s();
    }

    @Override // t2.s
    public final void t() {
        this.f10896a.t();
    }

    @Override // t2.s
    public final int u(int i6) {
        return this.f10896a.u(i6);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        return this.f10896a.equals(((j0) obj).f10896a);
    }
}
