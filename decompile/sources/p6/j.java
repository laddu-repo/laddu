package p6;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends ne.c {

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f10599x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l f10600y;

    /* renamed from: z, reason: collision with root package name */
    public int f10601z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, ne.c cVar) {
        super(cVar);
        this.f10600y = lVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f10599x = obj;
        this.f10601z |= Integer.MIN_VALUE;
        return this.f10600y.b(null, this);
    }
}
