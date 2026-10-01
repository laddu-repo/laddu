package p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h0 extends w1 {
    public final /* synthetic */ n0 G;
    public final /* synthetic */ q0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(q0 q0Var, q0 q0Var2, n0 n0Var) {
        super(q0Var2);
        this.H = q0Var;
        this.G = n0Var;
    }

    @Override // p.w1
    public final o.b0 b() {
        return this.G;
    }

    @Override // p.w1
    public final boolean c() {
        q0 q0Var = this.H;
        if (!q0Var.getInternalPopup().a()) {
            q0Var.C.m(q0Var.getTextDirection(), q0Var.getTextAlignment());
            return true;
        }
        return true;
    }
}
