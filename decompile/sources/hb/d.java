package hb;

import com.google.android.gms.internal.measurement.k4;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends k4 {
    public final AtomicReferenceFieldUpdater A;
    public final AtomicReferenceFieldUpdater B;
    public final AtomicReferenceFieldUpdater C;
    public final AtomicReferenceFieldUpdater D;
    public final AtomicReferenceFieldUpdater E;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.A = atomicReferenceFieldUpdater;
        this.B = atomicReferenceFieldUpdater2;
        this.C = atomicReferenceFieldUpdater3;
        this.D = atomicReferenceFieldUpdater4;
        this.E = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final boolean c(o oVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.D;
            if (atomicReferenceFieldUpdater.compareAndSet(oVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(oVar) == cVar);
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final boolean d(o oVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.E;
            if (atomicReferenceFieldUpdater.compareAndSet(oVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(oVar) == obj);
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final boolean e(o oVar, n nVar, n nVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.C;
            if (atomicReferenceFieldUpdater.compareAndSet(oVar, nVar, nVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(oVar) == nVar);
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final c g(o oVar) {
        return (c) this.D.getAndSet(oVar, c.f6013d);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final n h(o oVar) {
        return (n) this.C.getAndSet(oVar, n.f6023c);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void o(n nVar, n nVar2) {
        this.B.lazySet(nVar, nVar2);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void p(n nVar, Thread thread) {
        this.A.lazySet(nVar, thread);
    }
}
