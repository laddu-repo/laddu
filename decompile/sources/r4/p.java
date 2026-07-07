package r4;

import ac.g0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p implements b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final v4.b f11208v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f11209w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final de.h f11210x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final od.j f11211y = new od.j(new g0(12, this));

    /* JADX WARN: Multi-variable type inference failed */
    public p(v4.b bVar, String str, ce.p pVar) {
        this.f11208v = bVar;
        this.f11209w = str;
        this.f11210x = (de.h) pVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        od.j jVar = this.f11211y;
        if (jVar.a()) {
            ((v4.a) jVar.getValue()).close();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ce.p, de.h] */
    @Override // r4.b
    public final Object w(boolean z2, ce.p pVar, ud.c cVar) {
        o oVar = (o) cVar.f().A(o.f11206w);
        n nVar = oVar != null ? oVar.f11207v : null;
        if (nVar != null) {
            return pVar.i(nVar, cVar);
        }
        n nVar2 = new n(this.f11210x, (v4.a) this.f11211y.getValue());
        return me.x.s(new o(nVar2), new ac.o(pVar, nVar2, (sd.c) null), cVar);
    }
}
