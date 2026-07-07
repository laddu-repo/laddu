package gf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class o1 extends mf.k implements g1, q0, d1 {
    public t1 A;

    @Override // gf.d1
    public final v1 c() {
        return null;
    }

    @Override // gf.q0
    public final void d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        t1 j = j();
        while (true) {
            Object E = j.E();
            if (E instanceof o1) {
                if (E == this) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = t1.f5712x;
                    s0 s0Var = f0.j;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(j, E, s0Var)) {
                        if (atomicReferenceFieldUpdater2.get(j) != E) {
                            break;
                        }
                    }
                    return;
                }
                return;
            }
            if (!(E instanceof d1) || ((d1) E).c() == null) {
                return;
            }
            while (true) {
                Object g10 = g();
                if (!(g10 instanceof mf.r)) {
                    if (g10 == this) {
                        return;
                    }
                    kotlin.jvm.internal.k.c(g10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    mf.k kVar = (mf.k) g10;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = mf.k.f8865z;
                    mf.r rVar = (mf.r) atomicReferenceFieldUpdater3.get(kVar);
                    if (rVar == null) {
                        rVar = new mf.r(kVar);
                        atomicReferenceFieldUpdater3.set(kVar, rVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = mf.k.f8863x;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, g10, rVar)) {
                            kVar.e();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == g10);
                } else {
                    return;
                }
            }
        }
    }

    public j1 getParent() {
        return j();
    }

    @Override // gf.d1
    public final boolean isActive() {
        return true;
    }

    public final t1 j() {
        t1 t1Var = this.A;
        if (t1Var != null) {
            return t1Var;
        }
        kotlin.jvm.internal.k.k("job");
        throw null;
    }

    @Override // mf.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + f0.p(this) + "[job@" + f0.p(j()) + ']';
    }
}
