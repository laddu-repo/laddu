package n9;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d3 extends p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9218e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h3 f9219f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d3(h3 h3Var, n1 n1Var, int i6) {
        super(n1Var);
        this.f9218e = i6;
        this.f9219f = h3Var;
    }

    @Override // n9.p
    public final void a() {
        switch (this.f9218e) {
            case 0:
                h3 h3Var = this.f9219f;
                h3Var.d1();
                if (h3Var.u1()) {
                    u0 u0Var = ((n1) h3Var.f4301y).C;
                    n1.g(u0Var);
                    u0Var.L.a("Inactivity, disconnecting from the service");
                    h3Var.l1();
                    return;
                }
                return;
            default:
                u0 u0Var2 = ((n1) this.f9219f.f4301y).C;
                n1.g(u0Var2);
                u0Var2.G.a("Tasks have been queued for a long time");
                return;
        }
    }
}
