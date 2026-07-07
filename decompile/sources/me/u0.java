package me;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends z0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A = AtomicIntegerFieldUpdater.newUpdater(u0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final y0 f8736z;

    public u0(y0 y0Var) {
        this.f8736z = y0Var;
    }

    @Override // me.z0
    public final boolean k() {
        return true;
    }

    @Override // me.z0
    public final void l(Throwable th) {
        if (A.compareAndSet(this, 0, 1)) {
            this.f8736z.a(th);
        }
    }
}
