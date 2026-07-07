package da;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends j implements Runnable {
    public ListenableFuture C;

    @Override // da.k
    public final void d() {
        this.C = null;
    }

    @Override // da.k
    public final String l() {
        ListenableFuture listenableFuture = this.C;
        if (listenableFuture == null) {
            return null;
        }
        return "delegate=[" + listenableFuture + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.C;
        if (listenableFuture != null) {
            o(listenableFuture);
        }
    }
}
