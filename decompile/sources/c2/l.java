package c2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j4.b0 f1880x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f1881y;

    public /* synthetic */ l(j4.b0 b0Var, boolean z10) {
        this.f1880x = b0Var;
        this.f1881y = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar = (m) this.f1880x.f7159y;
        String str = u1.a0.f12750a;
        a2.n0 n0Var = ((a2.k0) mVar).f295x;
        boolean z10 = n0Var.f351z0;
        boolean z11 = this.f1881y;
        if (z10 == z11) {
            return;
        }
        n0Var.f351z0 = z11;
        n0Var.K.e(23, new a2.d0(1, z11));
    }
}
