package ta;

import b8.h;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o8.o;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Executor {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ExecutorService f12517v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f12518w = new Object();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public o f12519x = h.o(null);

    public b(ExecutorService executorService) {
        this.f12517v = executorService;
    }

    public final o a(Runnable runnable) {
        o oVarF;
        synchronized (this.f12518w) {
            oVarF = this.f12519x.f(this.f12517v, new pa.a(12, runnable));
            this.f12519x = oVarF;
        }
        return oVarF;
    }

    public final o b(Callable callable) {
        o oVarF;
        synchronized (this.f12518w) {
            oVarF = this.f12519x.f(this.f12517v, new pa.a(11, callable));
            this.f12519x = oVarF;
        }
        return oVarF;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f12517v.execute(runnable);
    }
}
