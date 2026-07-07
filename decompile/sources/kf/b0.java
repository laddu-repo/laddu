package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b0 extends ne.c {
    public Object A;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f7922x;

    /* renamed from: y, reason: collision with root package name */
    public int f7923y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ k7.c f7924z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(k7.c cVar, le.c cVar2) {
        super(cVar2);
        this.f7924z = cVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f7922x = obj;
        this.f7923y |= Integer.MIN_VALUE;
        return this.f7924z.collect(null, this);
    }
}
