package lf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a0 implements le.c, ne.d {

    /* renamed from: x, reason: collision with root package name */
    public final le.c f8357x;

    /* renamed from: y, reason: collision with root package name */
    public final le.h f8358y;

    public a0(le.c cVar, le.h hVar) {
        this.f8357x = cVar;
        this.f8358y = hVar;
    }

    @Override // ne.d
    public final ne.d getCallerFrame() {
        le.c cVar = this.f8357x;
        if (cVar instanceof ne.d) {
            return (ne.d) cVar;
        }
        return null;
    }

    @Override // le.c
    public final le.h getContext() {
        return this.f8358y;
    }

    @Override // le.c
    public final void resumeWith(Object obj) {
        this.f8357x.resumeWith(obj);
    }
}
