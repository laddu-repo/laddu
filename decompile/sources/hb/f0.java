package hb;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f0 extends o implements RunnableFuture, g {
    public volatile e0 E;

    public f0(Callable callable) {
        this.E = new e0(this, callable);
    }

    @Override // hb.o
    public final void c() {
        e0 e0Var;
        Object obj = this.f6026x;
        if ((obj instanceof a) && ((a) obj).f6007a && (e0Var = this.E) != null) {
            ad.a aVar = e0.A;
            ad.a aVar2 = e0.f6020z;
            Runnable runnable = (Runnable) e0Var.get();
            if (runnable instanceof Thread) {
                v vVar = new v(e0Var);
                v.a(vVar, Thread.currentThread());
                if (e0Var.compareAndSet(runnable, vVar)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) e0Var.getAndSet(aVar2)) == aVar) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.E = null;
    }

    @Override // hb.o
    public final String i() {
        e0 e0Var = this.E;
        if (e0Var != null) {
            return "task=[" + e0Var + "]";
        }
        return super.i();
    }

    @Override // hb.o, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f6026x instanceof a;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        e0 e0Var = this.E;
        if (e0Var != null) {
            e0Var.run();
        }
        this.E = null;
    }
}
