package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o0 extends ne.c {

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f7993x;

    /* renamed from: y, reason: collision with root package name */
    public int f7994y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ b1.u f7995z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(b1.u uVar, le.c cVar) {
        super(cVar);
        this.f7995z = uVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f7993x = obj;
        this.f7994y |= Integer.MIN_VALUE;
        return this.f7995z.emit(null, this);
    }
}
