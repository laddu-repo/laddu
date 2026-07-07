package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v extends ne.c {
    public u A;
    public i B;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f8018x;

    /* renamed from: y, reason: collision with root package name */
    public int f8019y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ u f8020z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(u uVar, le.c cVar) {
        super(cVar);
        this.f8020z = uVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f8018x = obj;
        this.f8019y |= Integer.MIN_VALUE;
        return this.f8020z.collect(null, this);
    }
}
