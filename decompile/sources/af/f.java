package af;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f implements we.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f504a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f505b = new n("kotlin.Int", ye.b.f14656d);

    @Override // we.a
    public final Object b(cf.k kVar) {
        de.i.e(kVar, "decoder");
        return Integer.valueOf(kVar.h());
    }

    @Override // we.a
    public final void c(cf.l lVar, Object obj) {
        lVar.c(((Number) obj).intValue());
    }

    @Override // we.a
    public final ye.d d() {
        return f505b;
    }
}
