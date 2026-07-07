package da;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class t0 extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final androidx.emoji2.text.q f4453v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final androidx.emoji2.text.q f4454w;

    static {
        int i = 1;
        f4453v = new androidx.emoji2.text.q(i);
        f4454w = new androidx.emoji2.text.q(i);
    }

    public abstract void a(Throwable th);

    public abstract void b(Object obj);

    public final void c() {
        androidx.emoji2.text.q qVar = f4454w;
        androidx.emoji2.text.q qVar2 = f4453v;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            s0 s0Var = new s0(this);
            s0.a(s0Var, Thread.currentThread());
            if (compareAndSet(runnable, s0Var)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(qVar2)) == qVar) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean d();

    public abstract Object e();

    public abstract String f();

    public final void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        s0 s0Var = null;
        boolean z2 = false;
        int i = 0;
        while (true) {
            boolean z10 = runnable instanceof s0;
            androidx.emoji2.text.q qVar = f4454w;
            if (!z10 && runnable != qVar) {
                break;
            }
            if (z10) {
                s0Var = (s0) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == qVar || compareAndSet(runnable, qVar)) {
                z2 = Thread.interrupted() || z2;
                LockSupport.park(s0Var);
            }
            runnable = (Runnable) get();
        }
        if (z2) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objE = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zD = d();
            androidx.emoji2.text.q qVar = f4453v;
            if (!zD) {
                try {
                    objE = e();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, qVar)) {
                            g(threadCurrentThread);
                        }
                        if (zD) {
                            return;
                        }
                        a(th);
                        return;
                    } finally {
                        if (!compareAndSet(threadCurrentThread, qVar)) {
                            g(threadCurrentThread);
                        }
                        if (!zD) {
                            b(null);
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
        if (runnable == f4453v) {
            str = "running=[DONE]";
        } else if (runnable instanceof s0) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + f();
    }
}
