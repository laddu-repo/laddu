package gf;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g0 extends x0 implements Runnable {
    public static final g0 F;
    public static final long G;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX WARN: Type inference failed for: r0v0, types: [gf.g0, gf.y0, gf.x0] */
    static {
        Long l10;
        ?? x0Var = new x0();
        F = x0Var;
        x0Var.m0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        G = timeUnit.toNanos(l10.longValue());
    }

    @Override // gf.x0, gf.k0
    public final q0 S(long j, Runnable runnable, le.h hVar) {
        long j10 = 0;
        if (j > 0) {
            if (j >= 9223372036854L) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = 1000000 * j;
            }
        }
        if (j10 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            u0 u0Var = new u0(runnable, j10 + nanoTime);
            t0(nanoTime, u0Var);
            return u0Var;
        }
        return x1.f5725x;
    }

    @Override // gf.y0
    public final Thread l0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(g0.class.getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
            return thread;
        }
        return thread2;
    }

    @Override // gf.y0
    public final void p0(long j, v0 v0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // gf.x0
    public final void q0(Runnable runnable) {
        if (debugStatus != 4) {
            super.q0(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        boolean s02;
        d2.f5658a.set(this);
        try {
            synchronized (this) {
                int i6 = debugStatus;
                if (i6 != 2 && i6 != 3) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    if (!s02) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long n02 = n0();
                    if (n02 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = G + nanoTime;
                        }
                        long j10 = j - nanoTime;
                        if (j10 <= 0) {
                            _thread = null;
                            u0();
                            if (!s0()) {
                                l0();
                                return;
                            }
                            return;
                        }
                        if (n02 > j10) {
                            n02 = j10;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (n02 > 0) {
                        int i10 = debugStatus;
                        if (i10 != 2 && i10 != 3) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            _thread = null;
                            u0();
                            if (!s0()) {
                                l0();
                                return;
                            }
                            return;
                        }
                        LockSupport.parkNanos(this, n02);
                    }
                }
            }
        } finally {
            _thread = null;
            u0();
            if (!s0()) {
                l0();
            }
        }
    }

    @Override // gf.x0, gf.y0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void u0() {
        boolean z10;
        int i6 = debugStatus;
        if (i6 != 2 && i6 != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return;
        }
        debugStatus = 3;
        x0.C.set(this, null);
        x0.D.set(this, null);
        notifyAll();
    }
}
