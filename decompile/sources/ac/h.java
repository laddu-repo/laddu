package ac;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h implements fb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f376a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fb.c f377b = fb.c.a("sessionId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fb.c f378c = fb.c.a("firstSessionId");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fb.c f379d = fb.c.a("sessionIndex");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fb.c f380e = fb.c.a("eventTimestampUs");
    public static final fb.c f = fb.c.a("dataCollectionStatus");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final fb.c f381g = fb.c.a("firebaseInstallationId");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final fb.c f382h = fb.c.a("firebaseAuthenticationToken");

    @Override // fb.a
    public final void a(Object obj, Object obj2) {
        y0 y0Var = (y0) obj;
        fb.e eVar = (fb.e) obj2;
        eVar.a(f377b, y0Var.f467a);
        eVar.a(f378c, y0Var.f468b);
        eVar.f(f379d, y0Var.f469c);
        eVar.g(f380e, y0Var.f470d);
        eVar.a(f, y0Var.f471e);
        eVar.a(f381g, y0Var.f);
        eVar.a(f382h, y0Var.f472g);
    }
}
