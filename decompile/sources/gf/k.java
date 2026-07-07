package gf;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class k extends m0 implements j, ne.d, l2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater C = AtomicIntegerFieldUpdater.newUpdater(k.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater D = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater E = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_parentHandle$volatile");
    public final le.c A;
    public final le.h B;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public k(int i6, le.c cVar) {
        super(i6);
        this.A = cVar;
        this.B = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f5649x;
    }

    public static Object C(y1 y1Var, Object obj, int i6, ve.l lVar) {
        i iVar;
        if (obj instanceof t) {
            return obj;
        }
        if (i6 != 1 && i6 != 2) {
            return obj;
        }
        if (lVar == null && !(y1Var instanceof i)) {
            return obj;
        }
        if (y1Var instanceof i) {
            iVar = (i) y1Var;
        } else {
            iVar = null;
        }
        return new s(obj, iVar, lVar, (Throwable) null, 16);
    }

    public static void x(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void A(Object obj, int i6, ve.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof y1) {
                Object C2 = C((y1) obj2, obj, i6, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    o();
                }
                p(i6);
                return;
            }
            if (obj2 instanceof l) {
                l lVar2 = (l) obj2;
                if (l.f5686c.compareAndSet(lVar2, 0, 1)) {
                    if (lVar != null) {
                        l(lVar, lVar2.f5710a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void B(y yVar) {
        mf.h hVar;
        y yVar2;
        int i6;
        le.c cVar = this.A;
        if (cVar instanceof mf.h) {
            hVar = (mf.h) cVar;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            yVar2 = hVar.A;
        } else {
            yVar2 = null;
        }
        if (yVar2 == yVar) {
            i6 = 4;
        } else {
            i6 = this.f5687z;
        }
        A(he.y.f6101a, i6, null);
    }

    public final h5.a D(ve.l lVar, Object obj) {
        h5.a aVar = f0.f5665a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof y1) {
                Object C2 = C((y1) obj2, obj, this.f5687z, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    o();
                }
                return aVar;
            }
            return null;
        }
    }

    @Override // gf.j
    public final h5.a a(ve.l lVar, Object obj) {
        return D(lVar, obj);
    }

    @Override // gf.l2
    public final void b(mf.u uVar, int i6) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = C;
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + i6));
        v(uVar);
    }

    @Override // gf.m0
    public final void c(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof y1)) {
                if (!(obj2 instanceof t)) {
                    if (obj2 instanceof s) {
                        s sVar = (s) obj2;
                        if (sVar.f5703e == null) {
                            s a10 = s.a(sVar, null, cancellationException, 15);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a10)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    cancellationException2 = cancellationException;
                                }
                            }
                            i iVar = sVar.f5700b;
                            if (iVar != null) {
                                k(iVar, cancellationException);
                            }
                            ve.l lVar = sVar.f5701c;
                            if (lVar != null) {
                                l(lVar, cancellationException);
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Must be called at most once");
                    }
                    cancellationException2 = cancellationException;
                    s sVar2 = new s(obj2, (i) null, (ve.l) null, cancellationException2, 14);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, sVar2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    return;
                    cancellationException = cancellationException2;
                } else {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed");
            }
        }
    }

    @Override // gf.m0
    public final le.c d() {
        return this.A;
    }

    @Override // gf.j
    public final void e(ve.l lVar, Object obj) {
        A(obj, this.f5687z, lVar);
    }

    @Override // gf.m0
    public final Throwable f(Object obj) {
        Throwable f3 = super.f(obj);
        if (f3 != null) {
            return f3;
        }
        return null;
    }

    @Override // gf.m0
    public final Object g(Object obj) {
        if (obj instanceof s) {
            return ((s) obj).f5699a;
        }
        return obj;
    }

    @Override // ne.d
    public final ne.d getCallerFrame() {
        le.c cVar = this.A;
        if (cVar instanceof ne.d) {
            return (ne.d) cVar;
        }
        return null;
    }

    @Override // le.c
    public final le.h getContext() {
        return this.B;
    }

    @Override // gf.m0
    public final Object i() {
        return D.get(this);
    }

    @Override // gf.j
    public final boolean isActive() {
        return D.get(this) instanceof y1;
    }

    @Override // gf.j
    public final void j(Object obj) {
        p(this.f5687z);
    }

    public final void k(i iVar, Throwable th) {
        try {
            iVar.a(th);
        } catch (Throwable th2) {
            f0.s(this.B, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(ve.l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            f0.s(this.B, new RuntimeException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void m(mf.u uVar, Throwable th) {
        le.h hVar = this.B;
        int i6 = C.get(this) & 536870911;
        if (i6 != 536870911) {
            try {
                uVar.h(i6, hVar);
                return;
            } catch (Throwable th2) {
                f0.s(hVar, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
    }

    public final boolean n(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z10 = false;
            if (!(obj instanceof y1)) {
                return false;
            }
            if ((obj instanceof i) || (obj instanceof mf.u)) {
                z10 = true;
            }
            l lVar = new l(this, th, z10);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            y1 y1Var = (y1) obj;
            if (y1Var instanceof i) {
                k((i) obj, th);
            } else if (y1Var instanceof mf.u) {
                m((mf.u) obj, th);
            }
            if (!w()) {
                o();
            }
            p(this.f5687z);
            return true;
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E;
        q0 q0Var = (q0) atomicReferenceFieldUpdater.get(this);
        if (q0Var == null) {
            return;
        }
        q0Var.d();
        atomicReferenceFieldUpdater.set(this, x1.f5725x);
    }

    public final void p(int i6) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        boolean z10;
        boolean z11;
        do {
            atomicIntegerFieldUpdater = C;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    boolean z12 = false;
                    if (i6 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    le.c cVar = this.A;
                    if (!z10 && (cVar instanceof mf.h)) {
                        if (i6 != 1 && i6 != 2) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        int i12 = this.f5687z;
                        if (i12 == 1 || i12 == 2) {
                            z12 = true;
                        }
                        if (z11 == z12) {
                            mf.h hVar = (mf.h) cVar;
                            y yVar = hVar.A;
                            le.h context = hVar.B.getContext();
                            if (yVar.h0()) {
                                yVar.f0(context, this);
                                return;
                            }
                            y0 a10 = d2.a();
                            if (a10.f5727y >= 4294967296L) {
                                a10.k0(this);
                                return;
                            }
                            a10.m0(true);
                            try {
                                f0.A(this, cVar, true);
                                do {
                                } while (a10.o0());
                            } finally {
                                try {
                                    return;
                                } finally {
                                }
                            }
                            return;
                        }
                    }
                    f0.A(this, cVar, z10);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
    }

    public Throwable q(t1 t1Var) {
        return t1Var.m();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i6;
        j1 j1Var;
        boolean w10 = w();
        do {
            atomicIntegerFieldUpdater = C;
            i6 = atomicIntegerFieldUpdater.get(this);
            int i10 = i6 >> 29;
            if (i10 != 0) {
                if (i10 == 2) {
                    if (w10) {
                        z();
                    }
                    Object obj = D.get(this);
                    if (!(obj instanceof t)) {
                        int i11 = this.f5687z;
                        if ((i11 == 1 || i11 == 2) && (j1Var = (j1) this.B.get(i1.f5682x)) != null && !j1Var.isActive()) {
                            CancellationException m9 = j1Var.m();
                            c(obj, m9);
                            throw m9;
                        }
                        return g(obj);
                    }
                    throw ((t) obj).f5710a;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i6, 536870912 + (536870911 & i6)));
        if (((q0) E.get(this)) == null) {
            t();
        }
        if (w10) {
            z();
        }
        return me.a.f8833x;
    }

    @Override // le.c
    public final void resumeWith(Object obj) {
        Throwable a10 = he.k.a(obj);
        if (a10 != null) {
            obj = new t(a10, false);
        }
        A(obj, this.f5687z, null);
    }

    public final void s() {
        q0 t10 = t();
        if (t10 != null && !(D.get(this) instanceof y1)) {
            t10.d();
            E.set(this, x1.f5725x);
        }
    }

    public final q0 t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        j1 j1Var = (j1) this.B.get(i1.f5682x);
        if (j1Var == null) {
            return null;
        }
        q0 t10 = f0.t(j1Var, true, new m(this), 2);
        do {
            atomicReferenceFieldUpdater = E;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, t10)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return t10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(y());
        sb2.append('(');
        sb2.append(f0.F(this.A));
        sb2.append("){");
        Object obj = D.get(this);
        if (obj instanceof y1) {
            str = "Active";
        } else if (obj instanceof l) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb2.append(str);
        sb2.append("}@");
        sb2.append(f0.p(this));
        return sb2.toString();
    }

    public final void u(ve.l lVar) {
        v(new h(lVar, 1));
    }

    public final void v(y1 y1Var) {
        boolean z10;
        boolean z11;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, y1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            boolean z12 = true;
            if (obj instanceof i) {
                z10 = true;
            } else {
                z10 = obj instanceof mf.u;
            }
            if (!z10) {
                if (obj instanceof t) {
                    t tVar = (t) obj;
                    if (t.f5709b.compareAndSet(tVar, 0, 1)) {
                        if (obj instanceof l) {
                            Throwable th = tVar.f5710a;
                            if (y1Var instanceof i) {
                                k((i) y1Var, th);
                                return;
                            } else {
                                kotlin.jvm.internal.k.c(y1Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                m((mf.u) y1Var, th);
                                return;
                            }
                        }
                        return;
                    }
                    x(y1Var, obj);
                    throw null;
                }
                if (obj instanceof s) {
                    s sVar = (s) obj;
                    if (sVar.f5700b == null) {
                        if (y1Var instanceof mf.u) {
                            return;
                        }
                        kotlin.jvm.internal.k.c(y1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        i iVar = (i) y1Var;
                        Throwable th2 = sVar.f5703e;
                        if (th2 != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            k(iVar, th2);
                            return;
                        }
                        s a10 = s.a(sVar, iVar, null, 29);
                        while (true) {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, a10)) {
                                break;
                            } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                                z12 = false;
                                break;
                            }
                        }
                        if (z12) {
                            return;
                        }
                    } else {
                        x(y1Var, obj);
                        throw null;
                    }
                } else {
                    if (y1Var instanceof mf.u) {
                        return;
                    }
                    kotlin.jvm.internal.k.c(y1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    s sVar2 = new s(obj, (i) y1Var, (ve.l) null, (Throwable) null, 28);
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, sVar2)) {
                            break;
                        } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                            z12 = false;
                            break;
                        }
                    }
                    if (z12) {
                        return;
                    }
                }
            } else {
                x(y1Var, obj);
                throw null;
            }
        }
    }

    public final boolean w() {
        if (this.f5687z == 2) {
            le.c cVar = this.A;
            kotlin.jvm.internal.k.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (mf.h.E.get((mf.h) cVar) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        mf.h hVar;
        le.c cVar = this.A;
        Throwable th = null;
        if (cVar instanceof mf.h) {
            hVar = (mf.h) cVar;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mf.h.E;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                h5.a aVar = mf.a.f8845d;
                if (obj != aVar) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, this)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != aVar) {
                        break;
                    }
                }
            }
            if (th != null) {
                o();
                n(th);
            }
        }
    }
}
