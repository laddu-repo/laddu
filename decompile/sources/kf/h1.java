package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h1 extends ne.c {
    public final /* synthetic */ i1 A;
    public int B;

    /* renamed from: x, reason: collision with root package name */
    public i1 f7955x;

    /* renamed from: y, reason: collision with root package name */
    public lf.v f7956y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f7957z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(i1 i1Var, ne.c cVar) {
        super(cVar);
        this.A = i1Var;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f7957z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.a(this);
    }
}
