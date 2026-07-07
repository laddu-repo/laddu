package x4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l0 extends ne.c {
    public String[] A;
    public int B;
    public int C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ p0 F;
    public int G;

    /* renamed from: x, reason: collision with root package name */
    public p0 f14600x;

    /* renamed from: y, reason: collision with root package name */
    public o f14601y;

    /* renamed from: z, reason: collision with root package name */
    public String f14602z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(p0 p0Var, ne.c cVar) {
        super(cVar);
        this.F = p0Var;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return p0.c(this.F, null, 0, this);
    }
}
