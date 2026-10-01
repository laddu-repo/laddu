package gf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p1 extends k {
    public final t1 F;

    public p1(le.c cVar, t1 t1Var) {
        super(1, cVar);
        this.F = t1Var;
    }

    @Override // gf.k
    public final Throwable q(t1 t1Var) {
        Throwable b10;
        Object E = this.F.E();
        if ((E instanceof r1) && (b10 = ((r1) E).b()) != null) {
            return b10;
        }
        if (E instanceof t) {
            return ((t) E).f5710a;
        }
        return t1Var.m();
    }

    @Override // gf.k
    public final String y() {
        return "AwaitContinuation";
    }
}
