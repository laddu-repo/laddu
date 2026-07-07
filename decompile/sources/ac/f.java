package ac;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f implements fb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f352a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fb.c f353b = fb.c.a("processName");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fb.c f354c = fb.c.a("pid");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fb.c f355d = fb.c.a("importance");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fb.c f356e = fb.c.a("defaultProcess");

    @Override // fb.a
    public final void a(Object obj, Object obj2) {
        i0 i0Var = (i0) obj;
        fb.e eVar = (fb.e) obj2;
        eVar.a(f353b, i0Var.f403a);
        eVar.f(f354c, i0Var.f404b);
        eVar.f(f355d, i0Var.f405c);
        eVar.b(f356e, i0Var.f406d);
    }
}
