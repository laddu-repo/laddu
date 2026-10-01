package o2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class k1 extends l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f9474k;

    public k1(a aVar) {
        this.f9474k = aVar;
    }

    public final void A() {
        x(null, this.f9474k);
    }

    public void B() {
        A();
    }

    @Override // o2.a
    public final t1.s0 g() {
        return this.f9474k.g();
    }

    @Override // o2.a
    public final t1.z h() {
        return this.f9474k.h();
    }

    @Override // o2.a
    public final boolean i() {
        return this.f9474k.i();
    }

    @Override // o2.a
    public final void l(y1.z zVar) {
        this.f9476j = zVar;
        this.i = w1.b0.m(null);
        B();
    }

    @Override // o2.a
    public void s(t1.z zVar) {
        this.f9474k.s(zVar);
    }

    @Override // o2.l
    public final d0 t(Object obj, d0 d0Var) {
        return y(d0Var);
    }

    @Override // o2.l
    public final long u(long j8, Object obj) {
        return j8;
    }

    @Override // o2.l
    public final int v(int i, Object obj) {
        return i;
    }

    @Override // o2.l
    public final void w(Object obj, a aVar, t1.s0 s0Var) {
        z(s0Var);
    }

    public abstract void z(t1.s0 s0Var);

    public d0 y(d0 d0Var) {
        return d0Var;
    }
}
