package a2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements u1.l, cb.e, u1.g {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f156x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f157y;

    public /* synthetic */ a0(int i6, int i10) {
        this.f156x = i10;
        this.f157y = i6;
    }

    @Override // u1.g
    public void accept(Object obj) {
        switch (this.f156x) {
            case 4:
                ((i4.l1) obj).f0(this.f157y);
                return;
            case 5:
                ((i4.l1) obj).H(this.f157y);
                return;
            case 6:
                ((i4.l1) obj).p0(this.f157y);
                return;
            default:
                ((i4.l1) obj).J0(this.f157y);
                return;
        }
    }

    @Override // cb.e
    public Object apply(Object obj) {
        return Integer.valueOf(this.f157y);
    }

    @Override // u1.l
    public void invoke(Object obj) {
        switch (this.f156x) {
            case 0:
                ((r1.s0) obj).c(this.f157y);
                return;
            case 1:
                ((r1.s0) obj).a(this.f157y);
                return;
            default:
                b2.l lVar = (b2.l) obj;
                lVar.getClass();
                int i6 = this.f157y;
                if (i6 == 1) {
                    lVar.f1404v = true;
                }
                lVar.f1395l = i6;
                return;
        }
    }

    public /* synthetic */ a0(b2.a aVar, int i6, r1.t0 t0Var, r1.t0 t0Var2) {
        this.f156x = 3;
        this.f157y = i6;
    }
}
