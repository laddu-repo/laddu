package k8;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 extends d0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f7558x;

    public h0(p1 p1Var) {
        super(p1Var);
        ((p1) this.f2053w).V++;
    }

    public final void E() {
        if (!this.f7558x) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void F() {
        if (this.f7558x) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (G()) {
            return;
        }
        ((p1) this.f2053w).X.incrementAndGet();
        this.f7558x = true;
    }

    public abstract boolean G();
}
