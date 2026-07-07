package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j1 extends ne.c {

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f7967x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j1.f0 f7968y;

    /* renamed from: z, reason: collision with root package name */
    public int f7969z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(j1.f0 f0Var, le.c cVar) {
        super(cVar);
        this.f7968y = f0Var;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f7967x = obj;
        this.f7969z |= Integer.MIN_VALUE;
        this.f7968y.collect(null, this);
        return me.a.f8833x;
    }
}
