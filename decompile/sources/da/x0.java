package da;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends y9.p implements ScheduledFuture, ListenableFuture, Future {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k f4462w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ScheduledFuture f4463x;

    public x0(k kVar, ScheduledFuture scheduledFuture) {
        this.f4462w = kVar;
        this.f4463x = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        boolean z10 = z(z2);
        if (z10) {
            this.f4463x.cancel(z2);
        }
        return z10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f4463x.compareTo(delayed);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void f(Runnable runnable, Executor executor) {
        this.f4462w.f(runnable, executor);
    }

    @Override // y9.p
    public final Object g() {
        return this.f4462w;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f4462w.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f4463x.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4462w.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f4462w.isDone();
    }

    public final boolean z(boolean z2) {
        return this.f4462w.cancel(z2);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        return this.f4462w.get(j8, timeUnit);
    }
}
