package z6;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j implements fb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f14773a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fb.c f14774b = fb.c.a("requestTimeMs");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fb.c f14775c = fb.c.a("requestUptimeMs");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fb.c f14776d = fb.c.a("clientInfo");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fb.c f14777e = fb.c.a("logSource");
    public static final fb.c f = fb.c.a("logSourceName");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final fb.c f14778g = fb.c.a("logEvent");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final fb.c f14779h = fb.c.a("qosTier");

    @Override // fb.a
    public final void a(Object obj, Object obj2) {
        fb.e eVar = (fb.e) obj2;
        t tVar = (t) ((f0) obj);
        eVar.g(f14774b, tVar.f14809a);
        eVar.g(f14775c, tVar.f14810b);
        eVar.a(f14776d, tVar.f14811c);
        eVar.a(f14777e, tVar.f14812d);
        eVar.a(f, tVar.f14813e);
        eVar.a(f14778g, tVar.f);
        eVar.a(f14779h, j0.f14780v);
    }
}
