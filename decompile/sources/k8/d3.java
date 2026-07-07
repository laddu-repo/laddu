package k8;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d3 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c3 f7442v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c3 f7443w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f7444x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f7445y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ f3 f7446z;

    public d3(f3 f3Var, c3 c3Var, c3 c3Var2, long j8, boolean z2) {
        this.f7442v = c3Var;
        this.f7443w = c3Var2;
        this.f7444x = j8;
        this.f7445y = z2;
        this.f7446z = f3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7446z.J(this.f7442v, this.f7443w, this.f7444x, this.f7445y, null);
    }
}
