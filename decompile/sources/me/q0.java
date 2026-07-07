package me;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends p0 implements b0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Executor f8726x;

    public q0(Executor executor) {
        this.f8726x = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // me.b0
    public final void D(long j8, h hVar) {
        Executor executor = this.f8726x;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            da.m0 m0Var = new da.m0(22, this, hVar);
            sd.h hVar2 = hVar.f8697z;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(m0Var, j8, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e7) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e7);
                v0 v0Var = (v0) hVar2.A(t.f8732w);
                if (v0Var != null) {
                    v0Var.i(cancellationException);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            hVar.x(new e(0, scheduledFutureSchedule));
        } else {
            y.E.D(j8, hVar);
        }
    }

    @Override // me.b0
    public final h0 G(long j8, m1 m1Var, sd.h hVar) {
        Executor executor = this.f8726x;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(m1Var, j8, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e7) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e7);
                v0 v0Var = (v0) hVar.A(t.f8732w);
                if (v0Var != null) {
                    v0Var.i(cancellationException);
                }
            }
        }
        return scheduledFutureSchedule != null ? new g0(scheduledFutureSchedule) : y.E.G(j8, m1Var, hVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f8726x;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q0) && ((q0) obj).f8726x == this.f8726x;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f8726x);
    }

    @Override // me.s
    public final void o0(sd.h hVar, Runnable runnable) {
        try {
            this.f8726x.execute(runnable);
        } catch (RejectedExecutionException e7) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e7);
            v0 v0Var = (v0) hVar.A(t.f8732w);
            if (v0Var != null) {
                v0Var.i(cancellationException);
            }
            te.e eVar = f0.f8691a;
            te.d.f12561x.o0(hVar, runnable);
        }
    }

    @Override // me.s
    public final String toString() {
        return this.f8726x.toString();
    }
}
