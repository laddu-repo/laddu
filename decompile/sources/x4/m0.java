package x4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m0 extends ne.c {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ p0 D;
    public int E;

    /* renamed from: x, reason: collision with root package name */
    public o f14606x;

    /* renamed from: y, reason: collision with root package name */
    public String f14607y;

    /* renamed from: z, reason: collision with root package name */
    public String[] f14608z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(p0 p0Var, ne.c cVar) {
        super(cVar);
        this.D = p0Var;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return p0.d(this.D, null, 0, this);
    }
}
