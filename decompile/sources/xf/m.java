package xf;

import od.e0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m implements sf.a {

    /* renamed from: a, reason: collision with root package name */
    public static final m f14740a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final uf.h f14741b = a.a.e("kotlinx.serialization.json.JsonElement", uf.c.f13115g, new uf.g[0], new e0(7));

    @Override // sf.a
    public final Object a(vf.b bVar) {
        return a8.c.b(bVar).X();
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        k value = (k) obj;
        kotlin.jvm.internal.k.e(value, "value");
        a8.c.a(tVar);
        if (value instanceof a0) {
            tVar.q(b0.f14723a, value);
        } else if (value instanceof w) {
            tVar.q(y.f14753a, value);
        } else {
            if (value instanceof e) {
                tVar.q(g.f14733a, value);
                return;
            }
            throw new RuntimeException();
        }
    }

    @Override // sf.a
    public final uf.g d() {
        return f14741b;
    }
}
