package mf;

import gf.d2;
import gf.f0;
import gf.m0;
import gf.y0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends m0 implements ne.d, le.c {
    public static final /* synthetic */ AtomicReferenceFieldUpdater E = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    public final gf.y A;
    public final ne.c B;
    public Object C;
    public final Object D;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    public h(gf.y yVar, ne.c cVar) {
        super(-1);
        this.A = yVar;
        this.B = cVar;
        this.C = a.f8844c;
        this.D = a.l(cVar.getContext());
    }

    @Override // gf.m0
    public final void c(Object obj, CancellationException cancellationException) {
        if (!(obj instanceof gf.u)) {
        } else {
            throw null;
        }
    }

    @Override // ne.d
    public final ne.d getCallerFrame() {
        ne.c cVar = this.B;
        if (r4.a.w(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override // le.c
    public final le.h getContext() {
        return this.B.getContext();
    }

    @Override // gf.m0
    public final Object i() {
        Object obj = this.C;
        this.C = a.f8844c;
        return obj;
    }

    @Override // le.c
    public final void resumeWith(Object obj) {
        Object tVar;
        ne.c cVar = this.B;
        le.h context = cVar.getContext();
        Throwable a10 = he.k.a(obj);
        if (a10 == null) {
            tVar = obj;
        } else {
            tVar = new gf.t(a10, false);
        }
        gf.y yVar = this.A;
        if (yVar.h0()) {
            this.C = tVar;
            this.f5687z = 0;
            yVar.f0(context, this);
            return;
        }
        y0 a11 = d2.a();
        if (a11.f5727y >= 4294967296L) {
            this.C = tVar;
            this.f5687z = 0;
            a11.k0(this);
            return;
        }
        a11.m0(true);
        try {
            le.h context2 = cVar.getContext();
            Object m9 = a.m(context2, this.D);
            try {
                cVar.resumeWith(obj);
                do {
                } while (a11.o0());
            } finally {
                a.g(context2, m9);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.A + ", " + f0.F(this.B) + ']';
    }

    @Override // gf.m0
    public final le.c d() {
        return this;
    }
}
