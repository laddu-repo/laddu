package gf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m extends l1 {
    public final k B;

    public m(k kVar) {
        this.B = kVar;
    }

    @Override // gf.g1
    public final void a(Throwable th) {
        t1 j = j();
        k kVar = this.B;
        Throwable q9 = kVar.q(j);
        if (kVar.w()) {
            le.c cVar = kVar.A;
            kotlin.jvm.internal.k.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            mf.h hVar = (mf.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mf.h.E;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                h5.a aVar = mf.a.f8845d;
                if (kotlin.jvm.internal.k.a(obj, aVar)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, q9)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != aVar) {
                            break;
                        }
                    }
                    return;
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
            }
        }
        kVar.n(q9);
        if (!kVar.w()) {
            kVar.o();
        }
    }
}
