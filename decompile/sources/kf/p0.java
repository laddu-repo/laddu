package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p0 extends ne.c {
    public Object A;
    public i B;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f7999x;

    /* renamed from: y, reason: collision with root package name */
    public int f8000y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ j0 f8001z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(j0 j0Var, le.c cVar) {
        super(cVar);
        this.f8001z = j0Var;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f7999x = obj;
        this.f8000y |= Integer.MIN_VALUE;
        return this.f8001z.emit(null, this);
    }
}
