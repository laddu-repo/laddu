package qf;

import gf.l2;
import he.y;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import mf.u;
import ve.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements gf.j, l2 {

    /* renamed from: x, reason: collision with root package name */
    public final gf.k f11213x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f11214y;

    public c(d dVar, gf.k kVar) {
        this.f11214y = dVar;
        this.f11213x = kVar;
    }

    @Override // gf.j
    public final h5.a a(l lVar, Object obj) {
        d dVar = this.f11214y;
        b bVar = new b(dVar, this, 1);
        h5.a D = this.f11213x.D(bVar, (y) obj);
        if (D != null) {
            d.E.set(dVar, null);
        }
        return D;
    }

    @Override // gf.l2
    public final void b(u uVar, int i6) {
        this.f11213x.b(uVar, i6);
    }

    @Override // gf.j
    public final void e(l lVar, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.E;
        d dVar = this.f11214y;
        atomicReferenceFieldUpdater.set(dVar, null);
        this.f11213x.e(new b(dVar, this, 0), y.f6101a);
    }

    @Override // le.c
    public final le.h getContext() {
        return this.f11213x.B;
    }

    @Override // gf.j
    public final boolean isActive() {
        return this.f11213x.isActive();
    }

    @Override // gf.j
    public final void j(Object obj) {
        this.f11213x.j(obj);
    }

    @Override // le.c
    public final void resumeWith(Object obj) {
        this.f11213x.resumeWith(obj);
    }
}
