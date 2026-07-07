package b1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d0 extends ne.c {
    public final /* synthetic */ g0 A;
    public int B;

    /* renamed from: x, reason: collision with root package name */
    public Object f1280x;

    /* renamed from: y, reason: collision with root package name */
    public Object f1281y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f1282z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g0 g0Var, ne.c cVar) {
        super(cVar);
        this.A = g0Var;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f1282z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.g(this);
    }
}
