package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d0 extends ne.c {
    public final /* synthetic */ e0 A;

    /* renamed from: x, reason: collision with root package name */
    public e0 f7933x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f7934y;

    /* renamed from: z, reason: collision with root package name */
    public int f7935z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, le.c cVar) {
        super(cVar);
        this.A = e0Var;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f7934y = obj;
        this.f7935z |= Integer.MIN_VALUE;
        return this.A.emit(null, this);
    }
}
