package ac;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g implements fb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f361a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fb.c f362b = fb.c.a("eventType");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fb.c f363c = fb.c.a("sessionData");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fb.c f364d = fb.c.a("applicationInfo");

    @Override // fb.a
    public final void a(Object obj, Object obj2) {
        r0 r0Var = (r0) obj;
        fb.e eVar = (fb.e) obj2;
        r0Var.getClass();
        eVar.a(f362b, n.f429w);
        eVar.a(f363c, r0Var.f442a);
        eVar.a(f364d, r0Var.f443b);
    }
}
