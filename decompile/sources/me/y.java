package me;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y extends n0 implements Runnable {
    public static final y E;
    public static final long F;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l10;
        y yVar = new y();
        E = yVar;
        yVar.t0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        F = timeUnit.toNanos(l10.longValue());
    }

    public final synchronized void C0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            n0.B.set(this, null);
            n0.C.set(this, null);
            notifyAll();
        }
    }

    @Override // me.n0, me.b0
    public final h0 G(long j8, m1 m1Var, sd.h hVar) {
        long j9 = j8 > 0 ? j8 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j8 : 0L;
        if (j9 >= 4611686018427387903L) {
            return f1.f8692v;
        }
        long jNanoTime = System.nanoTime();
        k0 k0Var = new k0(j9 + jNanoTime, m1Var);
        B0(jNanoTime, k0Var);
        return k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zA0;
        j1.f8703a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zA0) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j8 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jU0 = u0();
                    if (jU0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j8 == Long.MAX_VALUE) {
                            j8 = F + jNanoTime;
                        }
                        long j9 = j8 - jNanoTime;
                        if (j9 <= 0) {
                            _thread = null;
                            C0();
                            if (A0()) {
                                return;
                            }
                            s0();
                            return;
                        }
                        if (jU0 > j9) {
                            jU0 = j9;
                        }
                    } else {
                        j8 = Long.MAX_VALUE;
                    }
                    if (jU0 > 0) {
                        int i10 = debugStatus;
                        if (i10 == 2 || i10 == 3) {
                            _thread = null;
                            C0();
                            if (A0()) {
                                return;
                            }
                            s0();
                            return;
                        }
                        LockSupport.parkNanos(this, jU0);
                    }
                }
            }
        } finally {
            _thread = null;
            C0();
            if (!A0()) {
                s0();
            }
        }
    }

    @Override // me.o0
    public final Thread s0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(E.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // me.n0, me.o0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // me.s
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // me.o0
    public final void w0(long j8, l0 l0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // me.n0
    public final void x0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.x0(runnable);
    }
}
