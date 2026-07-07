package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e1 extends ne.c {
    public gf.j1 A;
    public Object B;
    public /* synthetic */ Object C;
    public final /* synthetic */ f1 D;
    public int E;

    /* renamed from: x, reason: collision with root package name */
    public f1 f7941x;

    /* renamed from: y, reason: collision with root package name */
    public i f7942y;

    /* renamed from: z, reason: collision with root package name */
    public g1 f7943z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, le.c cVar) {
        super(cVar);
        this.D = f1Var;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        this.D.collect(null, this);
        return me.a.f8833x;
    }
}
