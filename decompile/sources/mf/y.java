package mf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y implements le.f {

    /* renamed from: x, reason: collision with root package name */
    public final Object f8883x;

    /* renamed from: y, reason: collision with root package name */
    public final ThreadLocal f8884y;

    /* renamed from: z, reason: collision with root package name */
    public final z f8885z;

    public y(z4.r rVar, ThreadLocal threadLocal) {
        this.f8883x = rVar;
        this.f8884y = threadLocal;
        this.f8885z = new z(threadLocal);
    }

    public final void a(Object obj) {
        this.f8884y.set(obj);
    }

    public final Object b(le.h hVar) {
        ThreadLocal threadLocal = this.f8884y;
        Object obj = threadLocal.get();
        threadLocal.set(this.f8883x);
        return obj;
    }

    @Override // le.h
    public final Object fold(Object obj, ve.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // le.h
    public final le.f get(le.g gVar) {
        if (this.f8885z.equals(gVar)) {
            return this;
        }
        return null;
    }

    @Override // le.f
    public final le.g getKey() {
        return this.f8885z;
    }

    @Override // le.h
    public final le.h minusKey(le.g gVar) {
        if (this.f8885z.equals(gVar)) {
            return le.i.f8353x;
        }
        return this;
    }

    @Override // le.h
    public final le.h plus(le.h hVar) {
        return cf.m.A(this, hVar);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f8883x + ", threadLocal = " + this.f8884y + ')';
    }
}
