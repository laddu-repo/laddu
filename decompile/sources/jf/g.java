package jf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends ne.c {

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f7447x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f7448y;

    /* renamed from: z, reason: collision with root package name */
    public int f7449z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, ne.c cVar) {
        super(cVar);
        this.f7448y = hVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f7447x = obj;
        this.f7449z |= Integer.MIN_VALUE;
        Object D = this.f7448y.D(null, 0, 0L, this);
        if (D == me.a.f8833x) {
            return D;
        }
        return new o(D);
    }
}
