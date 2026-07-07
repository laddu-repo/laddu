package z4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q extends ne.c {
    public g A;
    public /* synthetic */ Object B;
    public final /* synthetic */ r C;
    public int D;

    /* renamed from: x, reason: collision with root package name */
    public r f15209x;

    /* renamed from: y, reason: collision with root package name */
    public String f15210y;

    /* renamed from: z, reason: collision with root package name */
    public ve.l f15211z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, ne.c cVar) {
        super(cVar);
        this.C = rVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.b(null, null, this);
    }
}
