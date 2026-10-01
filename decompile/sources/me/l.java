package me;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l extends z0 implements k {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final d1 f8706z;

    public l(d1 d1Var) {
        this.f8706z = d1Var;
    }

    @Override // me.k
    public final boolean c(Throwable th) {
        return j().t(th);
    }

    @Override // me.z0
    public final boolean k() {
        return true;
    }

    @Override // me.z0
    public final void l(Throwable th) {
        this.f8706z.p(j());
    }
}
