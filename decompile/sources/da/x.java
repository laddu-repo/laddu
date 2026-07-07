package da;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x extends u1.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4460b = AtomicReferenceFieldUpdater.newUpdater(z.class, Set.class, "C");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4461c = AtomicIntegerFieldUpdater.newUpdater(z.class, "D");

    @Override // u1.c
    public final void j(e0 e0Var, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f4460b;
            if (atomicReferenceFieldUpdater.compareAndSet(e0Var, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(e0Var) == null);
    }

    @Override // u1.c
    public final int q(e0 e0Var) {
        return f4461c.decrementAndGet(e0Var);
    }
}
