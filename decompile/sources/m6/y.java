package m6;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y extends ne.c {

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f8695x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z f8696y;

    /* renamed from: z, reason: collision with root package name */
    public int f8697z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, ne.c cVar) {
        super(cVar);
        this.f8696y = zVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f8695x = obj;
        this.f8697z |= Integer.MIN_VALUE;
        return this.f8696y.c(null, this);
    }
}
