package af;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j implements we.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final we.a f512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f513b;

    public j(we.a aVar) {
        de.i.e(aVar, "serializer");
        this.f512a = aVar;
        this.f513b = new o(aVar.d());
    }

    @Override // we.a
    public final Object b(cf.k kVar) {
        de.i.e(kVar, "decoder");
        if (kVar.l()) {
            return kVar.o(this.f512a);
        }
        return null;
    }

    @Override // we.a
    public final void c(cf.l lVar, Object obj) {
        if (obj != null) {
            lVar.i(this.f512a, obj);
        } else {
            lVar.f();
        }
    }

    @Override // we.a
    public final ye.d d() {
        return this.f513b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && j.class == obj.getClass() && de.i.a(this.f512a, ((j) obj).f512a);
    }

    public final int hashCode() {
        return this.f512a.hashCode();
    }
}
