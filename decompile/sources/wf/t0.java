package wf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t0 implements sf.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14394a = he.a.c(he.g.f6074y, new d.a0(this, 19));

    @Override // sf.a
    public final Object a(vf.b bVar) {
        uf.g d10 = d();
        vf.a h4 = bVar.h(d10);
        int b10 = h4.b(d());
        if (b10 == -1) {
            h4.j(d10);
            return he.y.f6101a;
        }
        throw new IllegalArgumentException(h8.c.i(b10, "Unexpected index "));
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object value) {
        kotlin.jvm.internal.k.e(value, "value");
        tVar.a(d()).u(d());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [he.f, java.lang.Object] */
    @Override // sf.a
    public final uf.g d() {
        return (uf.g) this.f14394a.getValue();
    }
}
