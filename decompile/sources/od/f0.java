package od;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f0 extends ne.c {

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f10079x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i0 f10080y;

    /* renamed from: z, reason: collision with root package name */
    public int f10081z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(i0 i0Var, ne.c cVar) {
        super(cVar);
        this.f10080y = i0Var;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f10079x = obj;
        this.f10081z |= Integer.MIN_VALUE;
        return i0.g(this.f10080y, this);
    }
}
