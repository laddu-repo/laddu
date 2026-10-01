package hb;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u implements x {

    /* renamed from: y, reason: collision with root package name */
    public static final u f6034y = new u(null);

    /* renamed from: z, reason: collision with root package name */
    public static final w f6035z = new w(u.class);

    /* renamed from: x, reason: collision with root package name */
    public final Object f6036x;

    public u(Object obj) {
        this.f6036x = obj;
    }

    @Override // hb.x
    public final void a(Runnable runnable, Executor executor) {
        jb.b.f(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f6035z.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f6036x;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f6036x + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f6036x;
    }
}
