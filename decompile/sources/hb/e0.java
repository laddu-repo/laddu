package hb;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e0 extends AtomicReference implements Runnable {
    public static final ad.a A;

    /* renamed from: z, reason: collision with root package name */
    public static final ad.a f6020z;

    /* renamed from: x, reason: collision with root package name */
    public final Callable f6021x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f0 f6022y;

    static {
        int i6 = 3;
        f6020z = new ad.a(i6);
        A = new ad.a(i6);
    }

    public e0(f0 f0Var, Callable callable) {
        this.f6022y = f0Var;
        callable.getClass();
        this.f6021x = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        v vVar = null;
        boolean z10 = false;
        int i6 = 0;
        while (true) {
            boolean z11 = runnable instanceof v;
            ad.a aVar = A;
            if (!z11 && runnable != aVar) {
                break;
            }
            if (z11) {
                vVar = (v) runnable;
            }
            i6++;
            if (i6 > 1000) {
                if (runnable == aVar || compareAndSet(runnable, aVar)) {
                    if (!Thread.interrupted() && !z10) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    LockSupport.park(vVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            f0 f0Var = this.f6022y;
            boolean isDone = f0Var.isDone();
            ad.a aVar = f6020z;
            if (!isDone) {
                try {
                    obj = this.f6021x.call();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, aVar)) {
                            a(currentThread);
                        }
                        if (!isDone) {
                            f0Var.l(th);
                            return;
                        }
                        return;
                    } finally {
                        if (!compareAndSet(currentThread, aVar)) {
                            a(currentThread);
                        }
                        if (!isDone) {
                            f0Var.k(null);
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f6020z) {
            str = "running=[DONE]";
        } else if (runnable instanceof v) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + this.f6021x.toString();
    }
}
