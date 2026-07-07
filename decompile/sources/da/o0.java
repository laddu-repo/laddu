package da;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import va.t1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {
    public static a a(ListenableFuture listenableFuture, Class cls, b0 b0Var, Executor executor) {
        int i = c.G;
        a aVar = new a(listenableFuture, cls, b0Var);
        listenableFuture.f(aVar, t1.l(executor, aVar));
        return aVar;
    }

    public static Object b(Future future) {
        Object obj;
        boolean z2 = false;
        if (!future.isDone()) {
            throw new IllegalStateException(qf.g.y("Future was expected to be done: %s", future));
        }
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static q0 c(Exception exc) {
        q0 q0Var = new q0();
        q0Var.n(exc);
        return q0Var;
    }

    public static r0 d(Object obj) {
        return obj == null ? r0.f4441w : new r0(obj);
    }

    public static ListenableFuture e(ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        n0 n0Var = new n0();
        n0Var.C = listenableFuture;
        listenableFuture.f(n0Var, f0.f4407v);
        return n0Var;
    }

    public static u f(ListenableFuture listenableFuture, b0 b0Var, Executor executor) {
        int i = w.F;
        u uVar = new u(listenableFuture, b0Var);
        listenableFuture.f(uVar, t1.l(executor, uVar));
        return uVar;
    }
}
