package b1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e0 extends ne.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ g0 B;
    public int C;

    /* renamed from: x, reason: collision with root package name */
    public g0 f1286x;

    /* renamed from: y, reason: collision with root package name */
    public Object f1287y;

    /* renamed from: z, reason: collision with root package name */
    public Object f1288z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, ne.c cVar) {
        super(cVar);
        this.B = g0Var;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.h(null, null, this);
    }
}
