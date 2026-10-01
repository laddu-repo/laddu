package me;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends z0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(k1.class, "_state$volatile");
    public h0 A;
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Thread f8705z = Thread.currentThread();

    public static void n(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // me.z0
    public final boolean k() {
        return true;
    }

    @Override // me.z0
    public final void l(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = B;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                n(i);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.f8705z.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void m() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = B;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        n(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                h0 h0Var = this.A;
                if (h0Var != null) {
                    h0Var.b();
                    return;
                }
                return;
            }
        }
    }
}
