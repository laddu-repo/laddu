package k8;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends y1 {
    public static final AtomicLong G = new AtomicLong(Long.MIN_VALUE);
    public final PriorityBlockingQueue A;
    public final LinkedBlockingQueue B;
    public final k1 C;
    public final k1 D;
    public final Object E;
    public final Semaphore F;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public m1 f7641y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public m1 f7642z;

    public n1(p1 p1Var) {
        super(p1Var);
        this.E = new Object();
        this.F = new Semaphore(2);
        this.A = new PriorityBlockingQueue();
        this.B = new LinkedBlockingQueue();
        this.C = new k1(this, "Thread death: Uncaught exception on worker thread");
        this.D = new k1(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // c3.e
    public final void D() {
        if (Thread.currentThread() != this.f7641y) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // k8.y1
    public final boolean E() {
        return false;
    }

    public final void H() {
        if (Thread.currentThread() != this.f7642z) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void I() {
        if (Thread.currentThread() == this.f7641y) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean J() {
        return Thread.currentThread() == this.f7641y;
    }

    public final l1 K(Callable callable) {
        F();
        l1 l1Var = new l1(this, callable, false);
        if (Thread.currentThread() != this.f7641y) {
            Q(l1Var);
            return l1Var;
        }
        if (!this.A.isEmpty()) {
            v0 v0Var = ((p1) this.f2053w).A;
            p1.l(v0Var);
            v0Var.E.a("Callable skipped the worker queue.");
        }
        l1Var.run();
        return l1Var;
    }

    public final l1 L(Callable callable) {
        F();
        l1 l1Var = new l1(this, callable, true);
        if (Thread.currentThread() == this.f7641y) {
            l1Var.run();
            return l1Var;
        }
        Q(l1Var);
        return l1Var;
    }

    public final void M(Runnable runnable) {
        F();
        t7.y.g(runnable);
        Q(new l1(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object N(AtomicReference atomicReference, long j8, String str, Runnable runnable) {
        synchronized (atomicReference) {
            n1 n1Var = ((p1) this.f2053w).B;
            p1.l(n1Var);
            n1Var.M(runnable);
            try {
                atomicReference.wait(j8);
            } catch (InterruptedException unused) {
                v0 v0Var = ((p1) this.f2053w).A;
                p1.l(v0Var);
                t0 t0Var = v0Var.E;
                StringBuilder sb2 = new StringBuilder(str.length() + 24);
                sb2.append("Interrupted waiting for ");
                sb2.append(str);
                t0Var.a(sb2.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            v0 v0Var2 = ((p1) this.f2053w).A;
            p1.l(v0Var2);
            v0Var2.E.a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void O(Runnable runnable) {
        F();
        Q(new l1(this, runnable, true, "Task exception on worker thread"));
    }

    public final void P(Runnable runnable) {
        F();
        l1 l1Var = new l1(this, runnable, false, "Task exception on network thread");
        synchronized (this.E) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.B;
                linkedBlockingQueue.add(l1Var);
                m1 m1Var = this.f7642z;
                if (m1Var == null) {
                    m1 m1Var2 = new m1(this, "Measurement Network", linkedBlockingQueue);
                    this.f7642z = m1Var2;
                    m1Var2.setUncaughtExceptionHandler(this.D);
                    this.f7642z.start();
                } else {
                    m1Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Q(l1 l1Var) {
        synchronized (this.E) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.A;
                priorityBlockingQueue.add(l1Var);
                m1 m1Var = this.f7641y;
                if (m1Var == null) {
                    m1 m1Var2 = new m1(this, "Measurement Worker", priorityBlockingQueue);
                    this.f7641y = m1Var2;
                    m1Var2.setUncaughtExceptionHandler(this.C);
                    this.f7641y.start();
                } else {
                    m1Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
