package te;

import me.x;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j extends i {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Runnable f12568x;

    public j(Runnable runnable, long j8, boolean z2) {
        super(z2, j8);
        this.f12568x = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12568x.run();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f12568x;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(x.g(runnable));
        sb2.append(", ");
        sb2.append(this.f12566v);
        sb2.append(", ");
        sb2.append(this.f12567w ? "Blocking" : "Non-blocking");
        sb2.append(']');
        return sb2.toString();
    }
}
