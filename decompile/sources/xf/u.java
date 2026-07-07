package xf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u implements sf.a {

    /* renamed from: a, reason: collision with root package name */
    public static final u f14747a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final uf.h f14748b = a.a.f("kotlinx.serialization.json.JsonNull", uf.i.f13135g, new uf.g[0]);

    @Override // sf.a
    public final Object a(vf.b bVar) {
        a8.c.b(bVar);
        if (!bVar.v()) {
            return t.INSTANCE;
        }
        throw new IllegalArgumentException("Expected 'null' literal");
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        t value = (t) obj;
        kotlin.jvm.internal.k.e(value, "value");
        a8.c.a(tVar);
        tVar.n();
    }

    @Override // sf.a
    public final uf.g d() {
        return f14748b;
    }
}
