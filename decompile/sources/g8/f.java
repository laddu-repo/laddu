package g8;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements ub.d {

    /* renamed from: a, reason: collision with root package name */
    public static final f f5527a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final ub.c f5528b = new ub.c("currentCacheSizeBytes", r4.a.s(r4.a.r(xb.e.class, new xb.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final ub.c f5529c = new ub.c("maxCacheSizeBytes", r4.a.s(r4.a.r(xb.e.class, new xb.a(2))));

    @Override // ub.a
    public final void a(Object obj, Object obj2) {
        j8.f fVar = (j8.f) obj;
        ub.e eVar = (ub.e) obj2;
        eVar.a(f5528b, fVar.f7312a);
        eVar.a(f5529c, fVar.f7313b);
    }
}
