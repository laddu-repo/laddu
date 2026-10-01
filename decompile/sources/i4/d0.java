package i4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements n0 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6336x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o0 f6337y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f6338z;

    public /* synthetic */ d0(o0 o0Var, long j, int i6) {
        this.f6336x = i6;
        this.f6337y = o0Var;
        this.f6338z = j;
    }

    @Override // i4.n0
    public final void f(s sVar) {
        switch (this.f6336x) {
            case 0:
                this.f6337y.f6473g.f6318t.W((int) this.f6338z);
                return;
            default:
                this.f6337y.f6473g.f6318t.M(this.f6338z);
                return;
        }
    }
}
