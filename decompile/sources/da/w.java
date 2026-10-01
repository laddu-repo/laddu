package da;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class w extends j0 implements Runnable {
    public static final /* synthetic */ int F = 0;
    public ListenableFuture D;
    public Object E;

    public w(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.D = listenableFuture;
        obj.getClass();
        this.E = obj;
    }

    @Override // da.k
    public final void d() {
        ListenableFuture listenableFuture = this.D;
        if ((listenableFuture != null) & (this.f4450v instanceof d)) {
            listenableFuture.cancel(p());
        }
        this.D = null;
        this.E = null;
    }

    @Override // da.k
    public final String l() {
        String str;
        ListenableFuture listenableFuture = this.D;
        Object obj = this.E;
        String strL = super.l();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strL != null) {
                return u5.a.c(str, strL);
            }
            return null;
        }
        return str + "function=[" + obj + "]";
    }

    public abstract Object q(Object obj, Object obj2);

    public abstract void r(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.D;
        Object obj = this.E;
        if (((this.f4450v instanceof d) | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.D = null;
        if (listenableFuture.isCancelled()) {
            o(listenableFuture);
            return;
        }
        try {
            try {
                Object objQ = q(obj, o0.b(listenableFuture));
                this.E = null;
                r(objQ);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    n(th);
                } finally {
                    this.E = null;
                }
            }
        } catch (Error e7) {
            n(e7);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e10) {
            n(e10.getCause());
        } catch (Exception e11) {
            n(e11);
        }
    }
}
