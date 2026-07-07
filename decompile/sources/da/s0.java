package da;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends AbstractOwnableSynchronizer implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t0 f4447v;

    public s0(t0 t0Var) {
        this.f4447v = t0Var;
    }

    public static void a(s0 s0Var, Thread thread) {
        s0Var.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.f4447v.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
