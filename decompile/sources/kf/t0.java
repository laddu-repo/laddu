package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t0 implements d1, h, lf.r {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r0 f8014x;

    public t0(r0 r0Var) {
        this.f8014x = r0Var;
    }

    @Override // kf.h
    public final Object collect(i iVar, le.c cVar) {
        ((f1) this.f8014x).collect(iVar, cVar);
        return me.a.f8833x;
    }

    @Override // kf.d1
    public final Object getValue() {
        return ((f1) this.f8014x).getValue();
    }

    @Override // lf.r
    public final h r(le.h hVar, int i6, jf.a aVar) {
        if (((i6 >= 0 && i6 < 2) || i6 == -2) && aVar == jf.a.f7437y) {
            return this;
        }
        return y0.o(this, hVar, i6, aVar);
    }
}
