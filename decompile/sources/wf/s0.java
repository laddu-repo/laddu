package wf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s0 implements sf.a {

    /* renamed from: a, reason: collision with root package name */
    public final sf.a f14387a;

    /* renamed from: b, reason: collision with root package name */
    public final d1 f14388b;

    public s0(sf.a serializer) {
        kotlin.jvm.internal.k.e(serializer, "serializer");
        this.f14387a = serializer;
        this.f14388b = new d1(serializer.d());
    }

    @Override // sf.a
    public final Object a(vf.b bVar) {
        if (bVar.v()) {
            return bVar.c(this.f14387a);
        }
        return null;
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        if (obj != null) {
            tVar.q(this.f14387a, obj);
        } else {
            tVar.n();
        }
    }

    @Override // sf.a
    public final uf.g d() {
        return this.f14388b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s0.class == obj.getClass() && kotlin.jvm.internal.k.a(this.f14387a, ((s0) obj).f14387a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14387a.hashCode();
    }
}
