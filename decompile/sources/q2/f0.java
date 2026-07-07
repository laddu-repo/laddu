package q2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements u1.g {
    public final /* synthetic */ n2.g A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10875x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b2.k f10876y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ u f10877z;

    public /* synthetic */ f0(b2.k kVar, u uVar, n2.g gVar, int i6) {
        this.f10875x = i6;
        this.f10876y = kVar;
        this.f10877z = uVar;
        this.A = gVar;
    }

    @Override // u1.g
    public final void accept(Object obj) {
        i0 i0Var = (i0) obj;
        switch (this.f10875x) {
            case 0:
                b2.k kVar = this.f10876y;
                i0Var.v(kVar.f1383y, (c0) kVar.f1384z, this.f10877z, this.A);
                return;
            default:
                b2.k kVar2 = this.f10876y;
                i0Var.L(kVar2.f1383y, (c0) kVar2.f1384z, this.f10877z, this.A);
                return;
        }
    }
}
