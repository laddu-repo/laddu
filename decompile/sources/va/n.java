package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n implements fb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f13447a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fb.c f13448b = fb.c.a("type");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fb.c f13449c = fb.c.a("reason");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fb.c f13450d = fb.c.a("frames");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fb.c f13451e = fb.c.a("causedBy");
    public static final fb.c f = fb.c.a("overflowCount");

    @Override // fb.a
    public final void a(Object obj, Object obj2) {
        fb.e eVar = (fb.e) obj2;
        t0 t0Var = (t0) ((x1) obj);
        eVar.a(f13448b, t0Var.f13517a);
        eVar.a(f13449c, t0Var.f13518b);
        eVar.a(f13450d, t0Var.f13519c);
        eVar.a(f13451e, t0Var.f13520d);
        eVar.f(f, t0Var.f13521e);
    }
}
