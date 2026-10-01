package oe;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import me.c1;
import me.d1;
import me.w0;
import me.x;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p extends me.a implements q, g {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c f10166y;

    public p(sd.h hVar, c cVar) {
        super(hVar, true);
        this.f10166y = cVar;
    }

    @Override // me.a
    public final void a0(Throwable th, boolean z2) {
        if (this.f10166y.f(th, false) || z2) {
            return;
        }
        x.i(th, this.f8675x);
    }

    @Override // me.a
    public final void b0(Object obj) {
        this.f10166y.f(null, false);
    }

    @Override // oe.s
    public final Object d(Object obj, sd.c cVar) {
        return this.f10166y.d(obj, cVar);
    }

    public final void e0(o oVar) {
        c cVar = this.f10166y;
        cVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.E;
        while (!atomicReferenceFieldUpdater.compareAndSet(cVar, null, oVar)) {
            if (atomicReferenceFieldUpdater.get(cVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(cVar);
                    re.t tVar = e.f10153q;
                    if (obj != tVar) {
                        if (obj == e.f10154r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    re.t tVar2 = e.f10154r;
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, tVar, tVar2)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != tVar) {
                            break;
                        }
                    }
                    oVar.a(cVar.n());
                    return;
                }
            }
        }
    }

    @Override // oe.s
    public final Object h(Object obj) {
        return this.f10166y.h(od.l.f10126a);
    }

    @Override // me.d1, me.v0
    public final void i(CancellationException cancellationException) {
        Object obj = d1.f8687v.get(this);
        if (obj instanceof me.p) {
            return;
        }
        if ((obj instanceof c1) && ((c1) obj).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new w0(s(), null, this);
        }
        q(cancellationException);
    }

    @Override // me.d1
    public final void q(CancellationException cancellationException) {
        this.f10166y.f(cancellationException, true);
        p(cancellationException);
    }
}
