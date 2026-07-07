package af;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p implements we.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f531a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f532b = new n("kotlin.String", ye.b.f);

    @Override // we.a
    public final Object b(cf.k kVar) {
        de.i.e(kVar, "decoder");
        return kVar.p();
    }

    @Override // we.a
    public final void c(cf.l lVar, Object obj) {
        String str = (String) obj;
        de.i.e(str, "value");
        lVar.j(str);
    }

    @Override // we.a
    public final ye.d d() {
        return f532b;
    }
}
