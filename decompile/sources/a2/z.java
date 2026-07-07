package a2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements u1.l, u1.g {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f506x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f507y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f508z;

    public /* synthetic */ z(int i6, int i10, int i11) {
        this.f506x = i11;
        this.f507y = i6;
        this.f508z = i10;
    }

    @Override // u1.g
    public void accept(Object obj) {
        switch (this.f506x) {
            case 1:
                ((i4.l1) obj).G(this.f507y, this.f508z);
                return;
            default:
                ((i4.l1) obj).s0(this.f507y, this.f508z);
                return;
        }
    }

    @Override // u1.l
    public void invoke(Object obj) {
        ((r1.s0) obj).N(this.f507y, this.f508z);
    }
}
