package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p implements fb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f13471a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fb.c f13472b = fb.c.a("name");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fb.c f13473c = fb.c.a("importance");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fb.c f13474d = fb.c.a("frames");

    @Override // fb.a
    public final void a(Object obj, Object obj2) {
        fb.e eVar = (fb.e) obj2;
        v0 v0Var = (v0) ((a2) obj);
        eVar.a(f13472b, v0Var.f13532a);
        eVar.f(f13473c, v0Var.f13533b);
        eVar.a(f13474d, v0Var.f13534c);
    }
}
