package ne;

import gf.y;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c extends a {
    private final le.h _context;
    private transient le.c intercepted;

    public c(le.c cVar, le.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override // le.c
    public le.h getContext() {
        le.h hVar = this._context;
        k.b(hVar);
        return hVar;
    }

    public final le.c intercepted() {
        le.c cVar;
        le.c cVar2 = this.intercepted;
        if (cVar2 == null) {
            le.e eVar = (le.e) getContext().get(le.d.f8352x);
            if (eVar != null) {
                cVar = new mf.h((y) eVar, this);
            } else {
                cVar = this;
            }
            this.intercepted = cVar;
            return cVar;
        }
        return cVar2;
    }

    @Override // ne.a
    public void releaseIntercepted() {
        gf.k kVar;
        le.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            le.f fVar = getContext().get(le.d.f8352x);
            k.b(fVar);
            mf.h hVar = (mf.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mf.h.E;
            do {
            } while (atomicReferenceFieldUpdater.get(hVar) == mf.a.f8845d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            if (obj instanceof gf.k) {
                kVar = (gf.k) obj;
            } else {
                kVar = null;
            }
            if (kVar != null) {
                kVar.o();
            }
        }
        this.intercepted = b.f9729x;
    }

    public c(le.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
