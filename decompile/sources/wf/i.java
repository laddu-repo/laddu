package wf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements sf.a {

    /* renamed from: a, reason: collision with root package name */
    public static final i f14334a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final a1 f14335b = new a1("kotlin.Byte", uf.e.f13117g);

    @Override // sf.a
    public final Object a(vf.b bVar) {
        return Byte.valueOf(bVar.z());
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        tVar.d(((Number) obj).byteValue());
    }

    @Override // sf.a
    public final uf.g d() {
        return f14335b;
    }
}
