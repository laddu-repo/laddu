package n9;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v2 implements Runnable {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ x2 B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u2 f9508x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ u2 f9509y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f9510z;

    public v2(x2 x2Var, u2 u2Var, u2 u2Var2, long j, boolean z10) {
        this.f9508x = u2Var;
        this.f9509y = u2Var2;
        this.f9510z = j;
        this.A = z10;
        this.B = x2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.B.n1(this.f9508x, this.f9509y, this.f9510z, this.A, null);
    }
}
