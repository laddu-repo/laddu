package p4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o extends w4.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0.e f10334c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(b0.e eVar, int i) {
        super(i, 0);
        this.f10334c = eVar;
    }

    @Override // w4.b
    public final void i(x4.c cVar) throws Exception {
        this.f10334c.j(new y4.a(cVar));
    }

    @Override // w4.b
    public final void j(x4.c cVar, int i, int i10) throws Exception {
        l(cVar, i, i10);
    }

    @Override // w4.b
    public final void k(x4.c cVar) throws Exception {
        y4.a aVar = new y4.a(cVar);
        b0.e eVar = this.f10334c;
        eVar.l(aVar);
        eVar.f1454h = cVar;
    }

    @Override // w4.b
    public final void l(x4.c cVar, int i, int i10) throws Exception {
        this.f10334c.k(new y4.a(cVar), i, i10);
    }
}
