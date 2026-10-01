package da;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends j0 implements RunnableFuture {
    public volatile t0 D;

    public d1(Callable callable) {
        this.D = new c1(this, callable);
    }

    @Override // da.k
    public final void d() {
        t0 t0Var;
        if (p() && (t0Var = this.D) != null) {
            t0Var.c();
        }
        this.D = null;
    }

    @Override // da.k
    public final String l() {
        t0 t0Var = this.D;
        if (t0Var == null) {
            return super.l();
        }
        return "task=[" + t0Var + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        t0 t0Var = this.D;
        if (t0Var != null) {
            t0Var.run();
        }
        this.D = null;
    }
}
