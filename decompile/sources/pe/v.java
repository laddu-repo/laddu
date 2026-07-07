package pe;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v implements c, qe.d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ x f10597v;

    public v(x xVar) {
        this.f10597v = xVar;
    }

    @Override // pe.c
    public final Object g(d dVar, ud.c cVar) {
        this.f10597v.g(dVar, cVar);
        return td.a.f12544v;
    }

    @Override // qe.d
    public final c y(sd.h hVar, int i, oe.a aVar) {
        return ((((i < 0 || i >= 2) && i != -2) || aVar != oe.a.f10128w) && !((i == 0 || i == -3) && aVar == oe.a.f10127v)) ? new b(this, hVar, i, aVar, 1) : this;
    }
}
