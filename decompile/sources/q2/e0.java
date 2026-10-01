package q2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements u1.g {
    public final /* synthetic */ int A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b2.k f10865x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ u f10866y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ n2.g f10867z;

    public /* synthetic */ e0(b2.k kVar, u uVar, n2.g gVar, int i6) {
        this.f10865x = kVar;
        this.f10866y = uVar;
        this.f10867z = gVar;
        this.A = i6;
    }

    @Override // u1.g
    public final void accept(Object obj) {
        i0 i0Var = (i0) obj;
        b2.k kVar = this.f10865x;
        i0Var.u(kVar.f1383y, (c0) kVar.f1384z, this.f10866y, this.f10867z, this.A);
    }
}
