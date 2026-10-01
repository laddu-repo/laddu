package k8;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class y1 extends c3.e {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f7851x;

    public y1(p1 p1Var) {
        super(p1Var);
        ((p1) this.f2053w).V++;
    }

    public abstract boolean E();

    public final void F() {
        if (!this.f7851x) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void G() {
        if (this.f7851x) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (E()) {
            return;
        }
        ((p1) this.f2053w).X.incrementAndGet();
        this.f7851x = true;
    }
}
