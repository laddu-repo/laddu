package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i implements fb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f13359a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fb.c f13360b = fb.c.a("arch");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fb.c f13361c = fb.c.a("model");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fb.c f13362d = fb.c.a("cores");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fb.c f13363e = fb.c.a("ram");
    public static final fb.c f = fb.c.a("diskSpace");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final fb.c f13364g = fb.c.a("simulator");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final fb.c f13365h = fb.c.a("state");
    public static final fb.c i = fb.c.a("manufacturer");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final fb.c f13366j = fb.c.a("modelClass");

    @Override // fb.a
    public final void a(Object obj, Object obj2) {
        fb.e eVar = (fb.e) obj2;
        n0 n0Var = (n0) ((v1) obj);
        eVar.f(f13360b, n0Var.f13452a);
        eVar.a(f13361c, n0Var.f13453b);
        eVar.f(f13362d, n0Var.f13454c);
        eVar.g(f13363e, n0Var.f13455d);
        eVar.g(f, n0Var.f13456e);
        eVar.b(f13364g, n0Var.f);
        eVar.f(f13365h, n0Var.f13457g);
        eVar.a(i, n0Var.f13458h);
        eVar.a(f13366j, n0Var.i);
    }
}
