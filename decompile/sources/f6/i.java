package f6;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements Executor {
    public volatile Runnable A;

    /* renamed from: y, reason: collision with root package name */
    public final Executor f5040y;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayDeque f5039x = new ArrayDeque();

    /* renamed from: z, reason: collision with root package name */
    public final Object f5041z = new Object();

    public i(Executor executor) {
        this.f5040y = executor;
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f5041z) {
            z10 = !this.f5039x.isEmpty();
        }
        return z10;
    }

    public final void b() {
        synchronized (this.f5041z) {
            try {
                Runnable runnable = (Runnable) this.f5039x.poll();
                this.A = runnable;
                if (runnable != null) {
                    this.f5040y.execute(this.A);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f5041z) {
            try {
                this.f5039x.add(new hb.s(3, this, runnable));
                if (this.A == null) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
