package i4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6350x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o0 f6351y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ l1 f6352z;

    public /* synthetic */ f0(o0 o0Var, l1 l1Var, int i6) {
        this.f6350x = i6;
        this.f6351y = o0Var;
        this.f6352z = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r1.d1 d1Var;
        switch (this.f6350x) {
            case 0:
                o0 o0Var = this.f6351y;
                j4.b0 b0Var = o0Var.f6476k;
                l1 l1Var = this.f6352z;
                b0Var.E(o0Var.G(l1Var));
                m0 m0Var = o0Var.f6475i;
                if (l1Var.l().a(17)) {
                    d1Var = l1Var.y0();
                } else {
                    d1Var = r1.d1.f11368a;
                }
                m0Var.q(d1Var);
                return;
            default:
                o0 o0Var2 = this.f6351y;
                o0Var2.f6476k.E(o0Var2.G(this.f6352z));
                return;
        }
    }
}
