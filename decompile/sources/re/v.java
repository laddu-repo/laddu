package re;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v implements sd.f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f11405v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ThreadLocal f11406w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final w f11407x;

    public v(Object obj, ThreadLocal threadLocal) {
        this.f11405v = obj;
        this.f11406w = threadLocal;
        this.f11407x = new w(threadLocal);
    }

    @Override // sd.h
    public final sd.f A(sd.g gVar) {
        if (this.f11407x.equals(gVar)) {
            return this;
        }
        return null;
    }

    public final void b(Object obj) {
        this.f11406w.set(obj);
    }

    public final Object c(sd.h hVar) {
        ThreadLocal threadLocal = this.f11406w;
        Object obj = threadLocal.get();
        threadLocal.set(this.f11405v);
        return obj;
    }

    @Override // sd.f
    public final sd.g getKey() {
        return this.f11407x;
    }

    @Override // sd.h
    public final sd.h l(sd.g gVar) {
        return this.f11407x.equals(gVar) ? sd.i.f11797v : this;
    }

    @Override // sd.h
    public final Object m(Object obj, ce.p pVar) {
        return pVar.i(obj, this);
    }

    @Override // sd.h
    public final sd.h n0(sd.h hVar) {
        return com.bumptech.glide.d.G(this, hVar);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f11405v + ", threadLocal = " + this.f11406w + ')';
    }
}
