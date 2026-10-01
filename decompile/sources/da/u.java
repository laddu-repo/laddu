package da;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u extends w {
    @Override // da.w
    public final Object q(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        ListenableFuture listenableFutureApply = b0Var.apply(obj2);
        p4.v.m(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", b0Var);
        return listenableFutureApply;
    }

    @Override // da.w
    public final void r(Object obj) {
        o((ListenableFuture) obj);
    }
}
