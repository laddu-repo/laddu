package lf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q implements le.h {

    /* renamed from: x, reason: collision with root package name */
    public final Throwable f8389x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ le.h f8390y;

    public q(le.h hVar, Throwable th) {
        this.f8389x = th;
        this.f8390y = hVar;
    }

    @Override // le.h
    public final Object fold(Object obj, ve.p pVar) {
        return this.f8390y.fold(obj, pVar);
    }

    @Override // le.h
    public final le.f get(le.g gVar) {
        return this.f8390y.get(gVar);
    }

    @Override // le.h
    public final le.h minusKey(le.g gVar) {
        return this.f8390y.minusKey(gVar);
    }

    @Override // le.h
    public final le.h plus(le.h hVar) {
        return this.f8390y.plus(hVar);
    }
}
