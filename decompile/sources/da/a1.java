package da;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements Executor {
    public static final u0 A = new u0(a1.class);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Executor f4390v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayDeque f4391w = new ArrayDeque();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4392x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f4393y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final m0 f4394z = new m0(this, 2);

    public a1(Executor executor) {
        executor.getClass();
        this.f4390v = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f4391w) {
            int i = this.f4392x;
            if (i != 4 && i != 3) {
                long j8 = this.f4393y;
                a7.r rVar = new a7.r(runnable, 2);
                this.f4391w.add(rVar);
                this.f4392x = 2;
                try {
                    this.f4390v.execute(this.f4394z);
                    if (this.f4392x != 2) {
                        return;
                    }
                    synchronized (this.f4391w) {
                        try {
                            if (this.f4393y == j8 && this.f4392x == 2) {
                                this.f4392x = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    synchronized (this.f4391w) {
                        try {
                            int i10 = this.f4392x;
                            boolean z2 = true;
                            if ((i10 != 1 && i10 != 2) || !this.f4391w.removeLastOccurrence(rVar)) {
                                z2 = false;
                            }
                            if (!(th instanceof RejectedExecutionException) || z2) {
                                throw th;
                            }
                            return;
                        } finally {
                        }
                    }
                }
            }
            this.f4391w.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f4390v + "}";
    }
}
