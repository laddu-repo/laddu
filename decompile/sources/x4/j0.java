package x4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j0 extends ne.c {
    public final /* synthetic */ p0 A;
    public int B;

    /* renamed from: x, reason: collision with root package name */
    public p0 f14590x;

    /* renamed from: y, reason: collision with root package name */
    public y1.c f14591y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f14592z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(p0 p0Var, ne.c cVar) {
        super(cVar);
        this.A = p0Var;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f14592z = obj;
        this.B |= Integer.MIN_VALUE;
        return p0.b(this.A, this);
    }
}
