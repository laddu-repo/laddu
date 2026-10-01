package g6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends a8.e {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5466a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5467b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5468c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5469d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5470e;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f5466a = atomicReferenceFieldUpdater;
        this.f5467b = atomicReferenceFieldUpdater2;
        this.f5468c = atomicReferenceFieldUpdater3;
        this.f5469d = atomicReferenceFieldUpdater4;
        this.f5470e = atomicReferenceFieldUpdater5;
    }

    @Override // a8.e
    public final boolean f(h hVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5469d;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == cVar);
        return false;
    }

    @Override // a8.e
    public final boolean g(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5470e;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // a8.e
    public final boolean h(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5468c;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }

    @Override // a8.e
    public final void x(g gVar, g gVar2) {
        this.f5467b.lazySet(gVar, gVar2);
    }

    @Override // a8.e
    public final void y(g gVar, Thread thread) {
        this.f5466a.lazySet(gVar, thread);
    }
}
