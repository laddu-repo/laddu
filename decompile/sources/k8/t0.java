package k8;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v0 f7766d;

    public t0(v0 v0Var, int i, boolean z2, boolean z10) {
        this.f7766d = v0Var;
        this.f7763a = i;
        this.f7764b = z2;
        this.f7765c = z10;
    }

    public final void a(String str) {
        this.f7766d.M(this.f7763a, this.f7764b, this.f7765c, str, null, null, null);
    }

    public final void b(Object obj, String str) {
        this.f7766d.M(this.f7763a, this.f7764b, this.f7765c, str, obj, null, null);
    }

    public final void c(Object obj, Object obj2, String str) {
        this.f7766d.M(this.f7763a, this.f7764b, this.f7765c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.f7766d.M(this.f7763a, this.f7764b, this.f7765c, str, obj, obj2, obj3);
    }
}
