package da;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends k0 {
    public final ListenableFuture D;

    public l0(ListenableFuture listenableFuture) {
        this.D = listenableFuture;
    }

    @Override // da.k, java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        return this.D.cancel(z2);
    }

    @Override // da.k, com.google.common.util.concurrent.ListenableFuture
    public final void f(Runnable runnable, Executor executor) {
        this.D.f(runnable, executor);
    }

    @Override // da.k, java.util.concurrent.Future
    public final Object get() {
        return this.D.get();
    }

    @Override // da.k, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.D.isCancelled();
    }

    @Override // da.k, java.util.concurrent.Future
    public final boolean isDone() {
        return this.D.isDone();
    }

    @Override // da.k
    public final String toString() {
        return this.D.toString();
    }

    @Override // da.k, java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        return this.D.get(j8, timeUnit);
    }
}
