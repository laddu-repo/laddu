package hb;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class z extends AbstractExecutorService implements y, AutoCloseable {

    /* renamed from: x, reason: collision with root package name */
    public final ExecutorService f6041x;

    public z(ExecutorService executorService) {
        executorService.getClass();
        this.f6041x = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f6041x.awaitTermination(j, timeUnit);
    }

    public /* synthetic */ void close() {
        c2.w.w(this);
    }

    public final x d(Callable callable) {
        return (x) super.submit(callable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f6041x.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f6041x.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f6041x.isTerminated();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new f0(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f6041x.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f6041x.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return (x) super.submit(runnable);
    }

    public final String toString() {
        return super.toString() + "[" + this.f6041x + "]";
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new f0(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return (x) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return (x) super.submit(callable);
    }
}
