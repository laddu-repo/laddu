package o2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1.g f9559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.fragment.app.d1 f9560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a7.j f9561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k8.c0 f9562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9563e;

    public w0(y1.g gVar, w2.m mVar) {
        androidx.fragment.app.d1 d1Var = new androidx.fragment.app.d1(28, mVar);
        a7.j jVar = new a7.j(28);
        k8.c0 c0Var = new k8.c0(24);
        this.f9559a = gVar;
        this.f9560b = d1Var;
        this.f9561c = jVar;
        this.f9562d = c0Var;
        this.f9563e = 1048576;
    }

    @Override // o2.c0
    public final a d(t1.z zVar) {
        zVar.f12179b.getClass();
        return new x0(zVar, this.f9559a, this.f9560b, this.f9561c.h(zVar), this.f9562d, this.f9563e, null);
    }

    @Override // o2.c0
    public final c0 b() {
        return this;
    }

    @Override // o2.c0
    public final c0 a(boolean z2) {
        return this;
    }

    @Override // o2.c0
    public final c0 c(k8.z zVar) {
        return this;
    }
}
