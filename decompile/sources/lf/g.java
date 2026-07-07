package lf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends f {
    public g(kf.h hVar, le.h hVar2, int i6, jf.a aVar, int i10) {
        super(hVar, (i10 & 2) != 0 ? le.i.f8353x : hVar2, (i10 & 4) != 0 ? -3 : i6, (i10 & 8) != 0 ? jf.a.f7436x : aVar);
    }

    @Override // lf.e
    public final e b(le.h hVar, int i6, jf.a aVar) {
        return new f(this.A, hVar, i6, aVar);
    }

    @Override // lf.e
    public final kf.h c() {
        return this.A;
    }

    @Override // lf.f
    public final Object d(kf.i iVar, le.c cVar) {
        Object collect = this.A.collect(iVar, cVar);
        if (collect == me.a.f8833x) {
            return collect;
        }
        return he.y.f6101a;
    }
}
