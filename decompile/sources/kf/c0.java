package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c0 extends ne.c {

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f7927x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z f7928y;

    /* renamed from: z, reason: collision with root package name */
    public int f7929z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(z zVar, le.c cVar) {
        super(cVar);
        this.f7928y = zVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f7927x = obj;
        this.f7929z |= Integer.MIN_VALUE;
        return this.f7928y.emit(null, this);
    }
}
