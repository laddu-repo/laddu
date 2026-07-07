package i4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a1 implements g1 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6296x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g1 f6297y;

    public /* synthetic */ a1(g1 g1Var, int i6) {
        this.f6296x = i6;
        this.f6297y = g1Var;
    }

    @Override // i4.g1
    public final Object c(b0 b0Var, s sVar, int i6) {
        switch (this.f6296x) {
            case 0:
                if (b0Var == null) {
                    h1.K(null, sVar, i6, this.f6297y, new a2.w(i6, 2, sVar));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return h1.K(b0Var, sVar, i6, this.f6297y, new a2.g0(i6, b0Var, sVar));
        }
    }
}
