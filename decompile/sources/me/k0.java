package me;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends l0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final m1 f8704x;

    public k0(long j8, m1 m1Var) {
        super(j8);
        this.f8704x = m1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8704x.run();
    }

    @Override // me.l0
    public final String toString() {
        return super.toString() + this.f8704x;
    }
}
