package o2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0 implements w1.f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b3.a f9416v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f9417w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z f9418x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f9419y;

    public /* synthetic */ f0(b3.a aVar, u uVar, z zVar, int i) {
        this.f9416v = aVar;
        this.f9417w = uVar;
        this.f9418x = zVar;
        this.f9419y = i;
    }

    @Override // w1.f
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        b3.a aVar = this.f9416v;
        k0Var.H(aVar.f1528w, (d0) aVar.f1529x, this.f9417w, this.f9418x, this.f9419y);
    }
}
