package jf;

import gf.f0;
import gf.k1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u extends gf.a implements v, l {
    public final h A;

    public u(le.h hVar, h hVar2) {
        super(hVar, true);
        this.A = hVar2;
    }

    @Override // gf.a
    public final void W(Throwable th, boolean z10) {
        if (!this.A.l(th, false) && !z10) {
            f0.s(this.f5647z, th);
        }
    }

    @Override // gf.a
    public final void X(Object obj) {
        this.A.k(null);
    }

    public final boolean Z(Throwable th) {
        return this.A.l(th, false);
    }

    @Override // jf.x
    public final j1.f0 b() {
        return this.A.b();
    }

    @Override // jf.x
    public final Object c(lf.p pVar) {
        h hVar = this.A;
        hVar.getClass();
        return h.C(hVar, pVar);
    }

    public final void c0(b1.r rVar) {
        h hVar = this.A;
        hVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.G;
        while (!atomicReferenceFieldUpdater.compareAndSet(hVar, null, rVar)) {
            if (atomicReferenceFieldUpdater.get(hVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(hVar);
                    h5.a aVar = j.f7469q;
                    if (obj == aVar) {
                        h5.a aVar2 = j.f7470r;
                        while (!atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, aVar2)) {
                            if (atomicReferenceFieldUpdater.get(hVar) != aVar) {
                                break;
                            }
                        }
                        rVar.invoke(hVar.q());
                        return;
                    }
                    if (obj == j.f7470r) {
                        throw new IllegalStateException("Another handler was already registered and successfully invoked");
                    }
                    throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                }
            }
        }
    }

    @Override // gf.t1, gf.j1
    public final void d(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new k1(t(), null, this);
        }
        r(cancellationException);
    }

    @Override // jf.x
    public final Object g() {
        return this.A.g();
    }

    @Override // jf.y
    public final Object h(Object obj) {
        return this.A.h(obj);
    }

    @Override // jf.y
    public final Object i(Object obj, le.c cVar) {
        return this.A.i(obj, cVar);
    }

    @Override // jf.x
    public final b iterator() {
        h hVar = this.A;
        hVar.getClass();
        return new b(hVar);
    }

    @Override // gf.t1
    public final void r(CancellationException cancellationException) {
        this.A.l(cancellationException, true);
        q(cancellationException);
    }
}
