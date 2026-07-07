package na;

import a7.r;
import da.m0;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import t7.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Executor {
    public static final Logger A = Logger.getLogger(i.class.getName());

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Executor f9061v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayDeque f9062w = new ArrayDeque();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9063x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f9064y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final m0 f9065z = new m0(this, 23);

    public i(Executor executor) {
        y.g(executor);
        this.f9061v = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        y.g(runnable);
        synchronized (this.f9062w) {
            int i = this.f9063x;
            if (i != 4 && i != 3) {
                long j8 = this.f9064y;
                r rVar = new r(runnable, 3);
                this.f9062w.add(rVar);
                this.f9063x = 2;
                try {
                    this.f9061v.execute(this.f9065z);
                    if (this.f9063x != 2) {
                        return;
                    }
                    synchronized (this.f9062w) {
                        try {
                            if (this.f9064y == j8 && this.f9063x == 2) {
                                this.f9063x = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e7) {
                    synchronized (this.f9062w) {
                        try {
                            int i10 = this.f9063x;
                            boolean z2 = true;
                            if ((i10 != 1 && i10 != 2) || !this.f9062w.removeLastOccurrence(rVar)) {
                                z2 = false;
                            }
                            if (!(e7 instanceof RejectedExecutionException) || z2) {
                                throw e7;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f9062w.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f9061v + "}";
    }
}
