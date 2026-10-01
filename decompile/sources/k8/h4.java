package k8;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class h4 extends d4 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f7570y;

    public h4(n4 n4Var) {
        super(n4Var);
        this.f7447x.M++;
    }

    public final void E() {
        if (!this.f7570y) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void F() {
        if (this.f7570y) {
            throw new IllegalStateException("Can't initialize twice");
        }
        G();
        this.f7447x.N++;
        this.f7570y = true;
    }

    public abstract void G();
}
