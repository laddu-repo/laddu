package da;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements ListenableFuture {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final r0 f4441w = new r0(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final u0 f4442x = new u0(r0.class);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f4443v;

    public r0(Object obj) {
        this.f4443v = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        return false;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e7) {
            f4442x.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f4443v;
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
        return super.toString() + "[status=SUCCESS, result=[" + this.f4443v + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f4443v;
    }
}
