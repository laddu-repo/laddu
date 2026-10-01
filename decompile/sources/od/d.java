package od;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends ne.c {
    public kf.i A;
    public int B;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f10070x;

    /* renamed from: y, reason: collision with root package name */
    public int f10071y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ kf.j0 f10072z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kf.j0 j0Var, le.c cVar) {
        super(cVar);
        this.f10072z = j0Var;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f10070x = obj;
        this.f10071y |= Integer.MIN_VALUE;
        return this.f10072z.emit(null, this);
    }
}
