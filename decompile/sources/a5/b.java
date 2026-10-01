package a5;

import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements z4.b {

    /* renamed from: x, reason: collision with root package name */
    public final k7.c f569x;

    public b(k7.c cVar) {
        this.f569x = cVar;
    }

    @Override // z4.b
    public final Object V(boolean z10, p pVar, ne.c cVar) {
        h5.d dVar = (h5.d) this.f569x.f7745y;
        dVar.getClass();
        return pVar.invoke(new e(new a(dVar.G())), cVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ((h5.d) this.f569x.f7745y).close();
    }
}
