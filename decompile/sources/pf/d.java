package pf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends ne.c {
    public int A;

    /* renamed from: x, reason: collision with root package name */
    public e f10767x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f10768y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ e f10769z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ne.c cVar) {
        super(cVar);
        this.f10769z = eVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f10768y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.f10769z.d(this);
    }
}
