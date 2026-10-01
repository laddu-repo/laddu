package da;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k f4405v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ListenableFuture f4406w;

    public e(k kVar, ListenableFuture listenableFuture) {
        this.f4405v = kVar;
        this.f4406w = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4405v.f4450v != this) {
            return;
        }
        Object objJ = k.j(this.f4406w);
        if (t.B.g(this.f4405v, this, objJ)) {
            k.g(this.f4405v, false);
        }
    }
}
