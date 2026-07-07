package rb;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j implements Executor {
    public static final Logger C = Logger.getLogger(j.class.getName());

    /* renamed from: x, reason: collision with root package name */
    public final Executor f11945x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayDeque f11946y = new ArrayDeque();

    /* renamed from: z, reason: collision with root package name */
    public int f11947z = 1;
    public long A = 0;
    public final i B = new i(this);

    public j(Executor executor) {
        x.g(executor);
        this.f11945x = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        x.g(runnable);
        synchronized (this.f11946y) {
            int i6 = this.f11947z;
            if (i6 != 4 && i6 != 3) {
                long j = this.A;
                b9.b bVar = new b9.b(runnable, 2);
                this.f11946y.add(bVar);
                this.f11947z = 2;
                try {
                    this.f11945x.execute(this.B);
                    if (this.f11947z == 2) {
                        synchronized (this.f11946y) {
                            try {
                                if (this.A == j && this.f11947z == 2) {
                                    this.f11947z = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f11946y) {
                        try {
                            int i10 = this.f11947z;
                            boolean z10 = true;
                            if ((i10 != 1 && i10 != 2) || !this.f11946y.removeLastOccurrence(bVar)) {
                                z10 = false;
                            }
                            if (!(e10 instanceof RejectedExecutionException) || z10) {
                                throw e10;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f11946y.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f11945x + "}";
    }
}
