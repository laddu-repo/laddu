package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r implements fb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f13491a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fb.c f13492b = fb.c.a("processName");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fb.c f13493c = fb.c.a("pid");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fb.c f13494d = fb.c.a("importance");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fb.c f13495e = fb.c.a("defaultProcess");

    @Override // fb.a
    public final void a(Object obj, Object obj2) {
        fb.e eVar = (fb.e) obj2;
        z0 z0Var = (z0) ((c2) obj);
        eVar.a(f13492b, z0Var.f13562a);
        eVar.f(f13493c, z0Var.f13563b);
        eVar.f(f13494d, z0Var.f13564c);
        eVar.b(f13495e, z0Var.f13565d);
    }
}
