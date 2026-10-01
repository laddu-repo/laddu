package hb;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c0 extends z implements ScheduledExecutorService {

    /* renamed from: y, reason: collision with root package name */
    public final ScheduledExecutorService f6017y;

    public c0(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f6017y = scheduledExecutorService;
    }

    @Override // hb.z, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        c2.w.x(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        f0 f0Var = new f0(callable);
        return new a0(f0Var, this.f6017y.schedule(f0Var, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j10, TimeUnit timeUnit) {
        b0 b0Var = new b0(runnable);
        return new a0(b0Var, this.f6017y.scheduleAtFixedRate(b0Var, j, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j10, TimeUnit timeUnit) {
        b0 b0Var = new b0(runnable);
        return new a0(b0Var, this.f6017y.scheduleWithFixedDelay(b0Var, j, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        f0 f0Var = new f0(Executors.callable(runnable, null));
        return new a0(f0Var, this.f6017y.schedule(f0Var, j, timeUnit));
    }
}
