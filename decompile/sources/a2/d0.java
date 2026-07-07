package a2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements u1.l, u1.g {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f195x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f196y;

    public /* synthetic */ d0(int i6, boolean z10) {
        this.f195x = i6;
        this.f196y = z10;
    }

    @Override // u1.g
    public void accept(Object obj) {
        switch (this.f195x) {
            case 2:
                ((i4.l1) obj).T(this.f196y);
                return;
            case 3:
                ((i4.l1) obj).q0(this.f196y);
                return;
            default:
                ((i4.l1) obj).q(this.f196y);
                return;
        }
    }

    @Override // u1.l
    public void invoke(Object obj) {
        switch (this.f195x) {
            case 0:
                ((r1.s0) obj).x(this.f196y);
                return;
            default:
                ((r1.s0) obj).d(this.f196y);
                return;
        }
    }
}
