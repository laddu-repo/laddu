package gf;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a1 extends z0 implements k0 {

    /* renamed from: y, reason: collision with root package name */
    public final Executor f5648y;

    public a1(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.f5648y = executor;
        Method method2 = mf.c.f8855a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = mf.c.f8855a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    public static void k0(le.h hVar, RejectedExecutionException rejectedExecutionException) {
        CancellationException cancellationException = new CancellationException("The task was rejected");
        cancellationException.initCause(rejectedExecutionException);
        f0.h(hVar, cancellationException);
    }

    @Override // gf.k0
    public final void K(long j, k kVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f5648y;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            hb.s sVar = new hb.s(4, this, kVar);
            le.h hVar = kVar.B;
            try {
                scheduledFuture = scheduledExecutorService.schedule(sVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                k0(hVar, e10);
            }
        }
        if (scheduledFuture != null) {
            kVar.v(new h(scheduledFuture, 0));
        } else {
            g0.F.K(j, kVar);
        }
    }

    @Override // gf.k0
    public final q0 S(long j, Runnable runnable, le.h hVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f5648y;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                k0(hVar, e10);
            }
        }
        if (scheduledFuture != null) {
            return new p0(scheduledFuture);
        }
        return g0.F.S(j, runnable, hVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f5648y;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof a1) && ((a1) obj).f5648y == this.f5648y) {
            return true;
        }
        return false;
    }

    @Override // gf.y
    public final void f0(le.h hVar, Runnable runnable) {
        try {
            this.f5648y.execute(runnable);
        } catch (RejectedExecutionException e10) {
            k0(hVar, e10);
            o0.f5694b.f0(hVar, runnable);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f5648y);
    }

    @Override // gf.z0
    public final Executor j0() {
        return this.f5648y;
    }

    @Override // gf.y
    public final String toString() {
        return this.f5648y.toString();
    }
}
