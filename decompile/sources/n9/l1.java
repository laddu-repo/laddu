package n9;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l1 extends u1 {
    public static final AtomicLong I = new AtomicLong(Long.MIN_VALUE);
    public k1 A;
    public k1 B;
    public final PriorityBlockingQueue C;
    public final LinkedBlockingQueue D;
    public final i1 E;
    public final i1 F;
    public final Object G;
    public final Semaphore H;

    public l1(n1 n1Var) {
        super(n1Var);
        this.G = new Object();
        this.H = new Semaphore(2);
        this.C = new PriorityBlockingQueue();
        this.D = new LinkedBlockingQueue();
        this.E = new i1(this, "Thread death: Uncaught exception on worker thread");
        this.F = new i1(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // e3.e
    public final void d1() {
        if (Thread.currentThread() == this.A) {
        } else {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // n9.u1
    public final boolean e1() {
        return false;
    }

    public final void h1() {
        if (Thread.currentThread() == this.B) {
        } else {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void i1() {
        if (Thread.currentThread() != this.A) {
        } else {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean j1() {
        if (Thread.currentThread() == this.A) {
            return true;
        }
        return false;
    }

    public final j1 k1(Callable callable) {
        f1();
        j1 j1Var = new j1(this, callable, false);
        if (Thread.currentThread() == this.A) {
            if (!this.C.isEmpty()) {
                u0 u0Var = ((n1) this.f4301y).C;
                n1.g(u0Var);
                u0Var.G.a("Callable skipped the worker queue.");
            }
            j1Var.run();
            return j1Var;
        }
        q1(j1Var);
        return j1Var;
    }

    public final j1 l1(Callable callable) {
        f1();
        j1 j1Var = new j1(this, callable, true);
        if (Thread.currentThread() == this.A) {
            j1Var.run();
            return j1Var;
        }
        q1(j1Var);
        return j1Var;
    }

    public final void m1(Runnable runnable) {
        f1();
        w8.x.g(runnable);
        q1(new j1(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object n1(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            l1 l1Var = ((n1) this.f4301y).D;
            n1.g(l1Var);
            l1Var.m1(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                u0 u0Var = ((n1) this.f4301y).C;
                n1.g(u0Var);
                s0 s0Var = u0Var.G;
                StringBuilder sb2 = new StringBuilder(str.length() + 24);
                sb2.append("Interrupted waiting for ");
                sb2.append(str);
                s0Var.a(sb2.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            u0 u0Var2 = ((n1) this.f4301y).C;
            n1.g(u0Var2);
            u0Var2.G.a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void o1(Runnable runnable) {
        f1();
        q1(new j1(this, runnable, true, "Task exception on worker thread"));
    }

    public final void p1(Runnable runnable) {
        f1();
        j1 j1Var = new j1(this, runnable, false, "Task exception on network thread");
        synchronized (this.G) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.D;
                linkedBlockingQueue.add(j1Var);
                k1 k1Var = this.B;
                if (k1Var == null) {
                    k1 k1Var2 = new k1(this, "Measurement Network", linkedBlockingQueue);
                    this.B = k1Var2;
                    k1Var2.setUncaughtExceptionHandler(this.F);
                    this.B.start();
                } else {
                    k1Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q1(j1 j1Var) {
        synchronized (this.G) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.C;
                priorityBlockingQueue.add(j1Var);
                k1 k1Var = this.A;
                if (k1Var == null) {
                    k1 k1Var2 = new k1(this, "Measurement Worker", priorityBlockingQueue);
                    this.A = k1Var2;
                    k1Var2.setUncaughtExceptionHandler(this.E);
                    this.A.start();
                } else {
                    k1Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
