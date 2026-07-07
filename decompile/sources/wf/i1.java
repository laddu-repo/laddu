package wf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i1 implements sf.a {

    /* renamed from: a, reason: collision with root package name */
    public final sf.a f14337a;

    /* renamed from: b, reason: collision with root package name */
    public final sf.a f14338b;

    /* renamed from: c, reason: collision with root package name */
    public final sf.a f14339c;

    /* renamed from: d, reason: collision with root package name */
    public final uf.h f14340d = a.a.d("kotlin.Triple", new uf.g[0], new cf.n(this, 19));

    public i1(sf.a aVar, sf.a aVar2, sf.a aVar3) {
        this.f14337a = aVar;
        this.f14338b = aVar2;
        this.f14339c = aVar3;
    }

    @Override // sf.a
    public final Object a(vf.b bVar) {
        uf.h hVar = this.f14340d;
        vf.a h4 = bVar.h(hVar);
        Object obj = u0.f14400c;
        Object obj2 = obj;
        Object obj3 = obj2;
        Object obj4 = obj3;
        while (true) {
            int b10 = h4.b(hVar);
            if (b10 != -1) {
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 == 2) {
                            obj4 = h4.f(hVar, 2, this.f14339c, null);
                        } else {
                            throw new IllegalArgumentException(h8.c.i(b10, "Unexpected index "));
                        }
                    } else {
                        obj3 = h4.f(hVar, 1, this.f14338b, null);
                    }
                } else {
                    obj2 = h4.f(hVar, 0, this.f14337a, null);
                }
            } else {
                h4.j(hVar);
                if (obj2 != obj) {
                    if (obj3 != obj) {
                        if (obj4 != obj) {
                            return new he.n(obj2, obj3, obj4);
                        }
                        throw new IllegalArgumentException("Element 'third' is missing");
                    }
                    throw new IllegalArgumentException("Element 'second' is missing");
                }
                throw new IllegalArgumentException("Element 'first' is missing");
            }
        }
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        he.n value = (he.n) obj;
        kotlin.jvm.internal.k.e(value, "value");
        uf.h hVar = this.f14340d;
        yf.t a10 = tVar.a(hVar);
        a10.p(hVar, 0, this.f14337a, value.f6086x);
        a10.p(hVar, 1, this.f14338b, value.f6087y);
        a10.p(hVar, 2, this.f14339c, value.f6088z);
        a10.u(hVar);
    }

    @Override // sf.a
    public final uf.g d() {
        return this.f14340d;
    }
}
