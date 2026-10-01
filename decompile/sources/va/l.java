package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l implements fb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f13419a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fb.c f13420b = fb.c.a("baseAddress");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fb.c f13421c = fb.c.a("size");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fb.c f13422d = fb.c.a("name");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fb.c f13423e = fb.c.a("uuid");

    @Override // fb.a
    public final void a(Object obj, Object obj2) {
        fb.e eVar = (fb.e) obj2;
        s0 s0Var = (s0) ((w1) obj);
        eVar.g(f13420b, s0Var.f13507a);
        eVar.g(f13421c, s0Var.f13508b);
        eVar.a(f13422d, s0Var.f13509c);
        String str = s0Var.f13510d;
        eVar.a(f13423e, str != null ? str.getBytes(n2.f13460a) : null);
    }
}
