package n9;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j2 implements Runnable {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ m2 B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9360x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z1 f9361y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f9362z;

    public /* synthetic */ j2(m2 m2Var, z1 z1Var, long j, boolean z10, int i6) {
        this.f9360x = i6;
        this.f9361y = z1Var;
        this.f9362z = j;
        this.A = z10;
        this.B = m2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9360x) {
            case 0:
                m2 m2Var = this.B;
                z1 z1Var = this.f9361y;
                m2Var.h1(z1Var);
                m2Var.s1(z1Var, this.f9362z, this.A);
                return;
            default:
                m2 m2Var2 = this.B;
                z1 z1Var2 = this.f9361y;
                m2Var2.h1(z1Var2);
                m2Var2.s1(z1Var2, this.f9362z, this.A);
                return;
        }
    }
}
