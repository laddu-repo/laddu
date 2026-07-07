package ac;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e implements fb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f345a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fb.c f346b = fb.c.a("performance");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fb.c f347c = fb.c.a("crashlytics");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fb.c f348d = fb.c.a("sessionSamplingRate");

    @Override // fb.a
    public final void a(Object obj, Object obj2) {
        k kVar = (k) obj;
        fb.e eVar = (fb.e) obj2;
        eVar.a(f346b, kVar.f416a);
        eVar.a(f347c, kVar.f417b);
        eVar.d(f348d, kVar.f418c);
    }
}
