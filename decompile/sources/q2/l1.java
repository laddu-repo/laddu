package q2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class l1 extends l {
    public final a H;

    public l1(a aVar) {
        this.H = aVar;
    }

    @Override // q2.l
    public final void A(Object obj, a aVar, r1.d1 d1Var) {
        E(d1Var);
    }

    public abstract void E(r1.d1 d1Var);

    public final void F() {
        B(null, this.H);
    }

    public void G() {
        F();
    }

    @Override // q2.a
    public final r1.d1 h() {
        return this.H.h();
    }

    @Override // q2.a
    public final r1.e0 i() {
        return this.H.i();
    }

    @Override // q2.a
    public final boolean j() {
        return this.H.j();
    }

    @Override // q2.a
    public final void n(w1.a0 a0Var) {
        this.G = a0Var;
        this.F = u1.a0.n(null);
        G();
    }

    @Override // q2.a
    public void v(r1.e0 e0Var) {
        this.H.v(e0Var);
    }

    @Override // q2.l
    public final c0 w(Object obj, c0 c0Var) {
        return D(c0Var);
    }

    @Override // q2.l
    public final long x(long j, Object obj) {
        return j;
    }

    @Override // q2.l
    public final int y(int i6, Object obj) {
        return i6;
    }

    public c0 D(c0 c0Var) {
        return c0Var;
    }
}
