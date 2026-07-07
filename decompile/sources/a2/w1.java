package a2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w1 extends q2.s {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f486f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final Object f487g;

    public w1(r1.d1 d1Var, r1.e0 e0Var) {
        super(d1Var);
        this.f487g = e0Var;
    }

    @Override // q2.s, r1.d1
    public r1.a1 f(int i6, r1.a1 a1Var, boolean z10) {
        switch (this.f486f) {
            case 0:
                r1.d1 d1Var = this.f10943e;
                r1.a1 f3 = d1Var.f(i6, a1Var, z10);
                if (d1Var.m(f3.f11297c, (r1.c1) this.f487g, 0L).a()) {
                    f3.h(a1Var.f11295a, a1Var.f11296b, a1Var.f11297c, a1Var.f11298d, a1Var.f11299e, r1.b.f11302c, true);
                } else {
                    f3.f11300f = true;
                }
                return f3;
            default:
                return super.f(i6, a1Var, z10);
        }
    }

    @Override // q2.s, r1.d1
    public r1.c1 m(int i6, r1.c1 c1Var, long j) {
        switch (this.f486f) {
            case 1:
                super.m(i6, c1Var, j);
                r1.e0 e0Var = (r1.e0) this.f487g;
                c1Var.f11329c = e0Var;
                r1.a0 a0Var = e0Var.f11379b;
                c1Var.getClass();
                return c1Var;
            default:
                return super.m(i6, c1Var, j);
        }
    }

    public w1(r1.d1 d1Var) {
        super(d1Var);
        this.f487g = new r1.c1();
    }
}
