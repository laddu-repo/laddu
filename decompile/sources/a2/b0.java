package a2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements u1.l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f166x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n0 f167y;

    public /* synthetic */ b0(n0 n0Var, int i6) {
        this.f166x = i6;
        this.f167y = n0Var;
    }

    @Override // u1.l
    public void invoke(Object obj) {
        r1.s0 s0Var = (r1.s0) obj;
        switch (this.f166x) {
            case 2:
                s0Var.p(this.f167y.f338m0);
                return;
            default:
                s0Var.P(this.f167y.o0);
                return;
        }
    }
}
