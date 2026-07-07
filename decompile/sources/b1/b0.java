package b1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b0 extends ne.c {
    public int A;

    /* renamed from: x, reason: collision with root package name */
    public g0 f1272x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f1273y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ g0 f1274z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(g0 g0Var, ne.c cVar) {
        super(cVar);
        this.f1274z = g0Var;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f1273y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.f1274z.e(this);
    }
}
