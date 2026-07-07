package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s implements fb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f13501a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fb.c f13502b = fb.c.a("batteryLevel");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fb.c f13503c = fb.c.a("batteryVelocity");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fb.c f13504d = fb.c.a("proximityOn");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fb.c f13505e = fb.c.a("orientation");
    public static final fb.c f = fb.c.a("ramUsed");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final fb.c f13506g = fb.c.a("diskUsed");

    @Override // fb.a
    public final void a(Object obj, Object obj2) {
        fb.e eVar = (fb.e) obj2;
        b1 b1Var = (b1) ((e2) obj);
        eVar.a(f13502b, b1Var.f13284a);
        eVar.f(f13503c, b1Var.f13285b);
        eVar.b(f13504d, b1Var.f13286c);
        eVar.f(f13505e, b1Var.f13287d);
        eVar.g(f, b1Var.f13288e);
        eVar.g(f13506g, b1Var.f);
    }
}
