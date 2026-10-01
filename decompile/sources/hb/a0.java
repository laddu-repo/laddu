package hb;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a0 extends db.r implements ScheduledFuture, x, Future {

    /* renamed from: y, reason: collision with root package name */
    public final o f6009y;

    /* renamed from: z, reason: collision with root package name */
    public final ScheduledFuture f6010z;

    public a0(o oVar, ScheduledFuture scheduledFuture) {
        this.f6009y = oVar;
        this.f6010z = scheduledFuture;
    }

    @Override // hb.x
    public final void a(Runnable runnable, Executor executor) {
        this.f6009y.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean x10 = x(z10);
        if (x10) {
            this.f6010z.cancel(z10);
        }
        return x10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f6010z.compareTo(delayed);
    }

    @Override // db.r
    public final Object g() {
        return this.f6009y;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f6009y.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f6010z.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f6009y.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f6009y.isDone();
    }

    public final boolean x(boolean z10) {
        return this.f6009y.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f6009y.get(j, timeUnit);
    }
}
