package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j implements fb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f13382a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fb.c f13383b = fb.c.a("generator");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fb.c f13384c = fb.c.a("identifier");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fb.c f13385d = fb.c.a("appQualitySessionId");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fb.c f13386e = fb.c.a("startedAt");
    public static final fb.c f = fb.c.a("endedAt");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final fb.c f13387g = fb.c.a("crashed");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final fb.c f13388h = fb.c.a("app");
    public static final fb.c i = fb.c.a("user");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final fb.c f13389j = fb.c.a("os");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final fb.c f13390k = fb.c.a("device");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final fb.c f13391l = fb.c.a("events");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final fb.c f13392m = fb.c.a("generatorType");

    @Override // fb.a
    public final void a(Object obj, Object obj2) {
        fb.e eVar = (fb.e) obj2;
        j0 j0Var = (j0) ((m2) obj);
        eVar.a(f13383b, j0Var.f13393a);
        eVar.a(f13384c, j0Var.f13394b.getBytes(n2.f13460a));
        eVar.a(f13385d, j0Var.f13395c);
        eVar.g(f13386e, j0Var.f13396d);
        eVar.a(f, j0Var.f13397e);
        eVar.b(f13387g, j0Var.f);
        eVar.a(f13388h, j0Var.f13398g);
        eVar.a(i, j0Var.f13399h);
        eVar.a(f13389j, j0Var.i);
        eVar.a(f13390k, j0Var.f13400j);
        eVar.a(f13391l, j0Var.f13401k);
        eVar.f(f13392m, j0Var.f13402l);
    }
}
