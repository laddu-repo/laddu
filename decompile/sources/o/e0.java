package o;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends u1 {
    public final /* synthetic */ k0 E;
    public final /* synthetic */ n0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(n0 n0Var, n0 n0Var2, k0 k0Var) {
        super(n0Var2);
        this.F = n0Var;
        this.E = k0Var;
    }

    @Override // o.u1
    public final n.b0 b() {
        return this.E;
    }

    @Override // o.u1
    public final boolean c() {
        n0 n0Var = this.F;
        if (n0Var.getInternalPopup().a()) {
            return true;
        }
        n0Var.A.l(n0Var.getTextDirection(), n0Var.getTextAlignment());
        return true;
    }
}
