package xf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b0 implements sf.a {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f14723a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final uf.h f14724b = a.a.f("kotlinx.serialization.json.JsonPrimitive", uf.e.f13123n, new uf.g[0]);

    @Override // sf.a
    public final Object a(vf.b bVar) {
        k X = a8.c.b(bVar).X();
        if (X instanceof a0) {
            return (a0) X;
        }
        throw yf.n.b(-1, "Unexpected JSON element, expected JsonPrimitive, had " + kotlin.jvm.internal.x.a(X.getClass()), X.toString());
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        a0 value = (a0) obj;
        kotlin.jvm.internal.k.e(value, "value");
        a8.c.a(tVar);
        if (value instanceof t) {
            tVar.q(u.f14747a, t.INSTANCE);
        } else {
            tVar.q(r.f14745a, (q) value);
        }
    }

    @Override // sf.a
    public final uf.g d() {
        return f14724b;
    }
}
