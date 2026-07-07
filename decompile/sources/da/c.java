package da;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends j0 implements Runnable {
    public static final /* synthetic */ int G = 0;
    public ListenableFuture D;
    public Class E;
    public Object F;

    public c(ListenableFuture listenableFuture, Class cls, Object obj) {
        this.D = listenableFuture;
        this.E = cls;
        this.F = obj;
    }

    @Override // da.k
    public final void d() {
        ListenableFuture listenableFuture = this.D;
        if ((listenableFuture != null) & (this.f4450v instanceof d)) {
            listenableFuture.cancel(p());
        }
        this.D = null;
        this.E = null;
        this.F = null;
    }

    @Override // da.k
    public final String l() {
        String str;
        ListenableFuture listenableFuture = this.D;
        Class cls = this.E;
        Object obj = this.F;
        String strL = super.l();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strL != null) {
                return u5.a.c(str, strL);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
    }

    public abstract Object q(Object obj, Throwable th);

    public abstract void r(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.D;
        Class cls = this.E;
        Object obj = this.F;
        if (((obj == null) || ((listenableFuture == 0) | (cls == null))) || (this.f4450v instanceof d)) {
            return;
        }
        this.D = null;
        try {
            th = listenableFuture instanceof ea.a ? ((ea.a) listenableFuture).a() : null;
        } catch (ExecutionException e7) {
            Throwable cause = e7.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + listenableFuture.getClass() + " threw " + e7.getClass() + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        Object objB = th == null ? o0.b(listenableFuture) : null;
        if (th == null) {
            m(objB);
            return;
        }
        if (!cls.isInstance(th)) {
            o(listenableFuture);
            return;
        }
        try {
            Object objQ = q(obj, th);
            this.E = null;
            this.F = null;
            r(objQ);
        } catch (Throwable th2) {
            try {
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                n(th2);
            } finally {
                this.E = null;
                this.F = null;
            }
        }
    }
}
