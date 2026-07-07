package x;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends lg.c {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f14437a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f14438b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f14439c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f14440d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f14441e;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f14437a = atomicReferenceFieldUpdater;
        this.f14438b = atomicReferenceFieldUpdater2;
        this.f14439c = atomicReferenceFieldUpdater3;
        this.f14440d = atomicReferenceFieldUpdater4;
        this.f14441e = atomicReferenceFieldUpdater5;
    }

    @Override // lg.c
    public final boolean a(g gVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f14440d;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // lg.c
    public final boolean b(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f14441e;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // lg.c
    public final boolean c(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f14439c;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // lg.c
    public final void n(f fVar, f fVar2) {
        this.f14438b.lazySet(fVar, fVar2);
    }

    @Override // lg.c
    public final void o(f fVar, Thread thread) {
        this.f14437a.lazySet(fVar, thread);
    }
}
