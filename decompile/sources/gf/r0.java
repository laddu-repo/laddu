package gf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r0 extends o1 {
    public final /* synthetic */ int B;
    public final Object C;

    public /* synthetic */ r0(Object obj, int i6) {
        this.B = i6;
        this.C = obj;
    }

    @Override // gf.g1
    public final void a(Throwable th) {
        switch (this.B) {
            case 0:
                ((q0) this.C).d();
                return;
            case 1:
                ((g1) this.C).a(th);
                return;
            case 2:
                p1 p1Var = (p1) this.C;
                Object E = j().E();
                if (E instanceof t) {
                    p1Var.resumeWith(he.a.b(((t) E).f5710a));
                    return;
                } else {
                    p1Var.resumeWith(f0.H(E));
                    return;
                }
            default:
                ((k) this.C).resumeWith(he.y.f6101a);
                return;
        }
    }
}
