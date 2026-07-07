package wf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g1 implements sf.a {

    /* renamed from: a, reason: collision with root package name */
    public static final g1 f14326a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final a1 f14327b = new a1("kotlin.Short", uf.e.f13122m);

    @Override // sf.a
    public final Object a(vf.b bVar) {
        return Short.valueOf(bVar.A());
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        tVar.r(((Number) obj).shortValue());
    }

    @Override // sf.a
    public final uf.g d() {
        return f14327b;
    }
}
