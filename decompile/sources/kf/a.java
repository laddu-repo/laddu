package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends ne.c {
    public int A;

    /* renamed from: x, reason: collision with root package name */
    public lf.v f7911x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f7912y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ lc.c f7913z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(lc.c cVar, le.c cVar2) {
        super(cVar2);
        this.f7913z = cVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f7912y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.f7913z.collect(null, this);
    }
}
