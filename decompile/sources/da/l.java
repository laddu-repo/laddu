package da;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l extends qf.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4429c = AtomicReferenceFieldUpdater.newUpdater(s.class, Thread.class, "a");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4430d = AtomicReferenceFieldUpdater.newUpdater(s.class, s.class, "b");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4431e = AtomicReferenceFieldUpdater.newUpdater(t.class, s.class, "x");
    public static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(t.class, h.class, "w");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4432g = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "v");

    @Override // qf.g
    public final void C(s sVar, s sVar2) {
        f4430d.lazySet(sVar, sVar2);
    }

    @Override // qf.g
    public final void D(s sVar, Thread thread) {
        f4429c.lazySet(sVar, thread);
    }

    @Override // qf.g
    public final boolean f(k kVar, h hVar, h hVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f;
            if (atomicReferenceFieldUpdater.compareAndSet(kVar, hVar, hVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(kVar) == hVar);
        return false;
    }

    @Override // qf.g
    public final boolean g(t tVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f4432g;
            if (atomicReferenceFieldUpdater.compareAndSet(tVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(tVar) == obj);
        return false;
    }

    @Override // qf.g
    public final boolean h(t tVar, s sVar, s sVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f4431e;
            if (atomicReferenceFieldUpdater.compareAndSet(tVar, sVar, sVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(tVar) == sVar);
        return false;
    }

    @Override // qf.g
    public final h r(k kVar) {
        return (h) f.getAndSet(kVar, h.f4416d);
    }

    @Override // qf.g
    public final s s(k kVar) {
        return (s) f4431e.getAndSet(kVar, s.f4444c);
    }
}
