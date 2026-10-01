package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c1 extends ne.c {

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f7930x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j0 f7931y;

    /* renamed from: z, reason: collision with root package name */
    public int f7932z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(j0 j0Var, le.c cVar) {
        super(cVar);
        this.f7931y = j0Var;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f7930x = obj;
        this.f7932z |= Integer.MIN_VALUE;
        return this.f7931y.a(0, this);
    }
}
