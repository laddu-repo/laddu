package af;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i implements we.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f510a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f511b = new n("kotlin.Long", ye.b.f14657e);

    @Override // we.a
    public final Object b(cf.k kVar) {
        de.i.e(kVar, "decoder");
        return Long.valueOf(kVar.j());
    }

    @Override // we.a
    public final void c(cf.l lVar, Object obj) {
        lVar.d(((Number) obj).longValue());
    }

    @Override // we.a
    public final ye.d d() {
        return f511b;
    }
}
