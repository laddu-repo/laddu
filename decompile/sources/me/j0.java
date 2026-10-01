package me;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends l0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h f8701x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n0 f8702y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(n0 n0Var, long j8, h hVar) {
        super(j8);
        this.f8702y = n0Var;
        this.f8701x = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8701x.E(this.f8702y);
    }

    @Override // me.l0
    public final String toString() {
        return super.toString() + this.f8701x;
    }
}
