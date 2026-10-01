package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o extends ne.c {

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f7990x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h0 f7991y;

    /* renamed from: z, reason: collision with root package name */
    public int f7992z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(h0 h0Var, le.c cVar) {
        super(cVar);
        this.f7991y = h0Var;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f7990x = obj;
        this.f7992z |= Integer.MIN_VALUE;
        return this.f7991y.emit(null, this);
    }
}
