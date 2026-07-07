package x4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m extends ne.c {

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f14603x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ w4.q0 f14604y;

    /* renamed from: z, reason: collision with root package name */
    public int f14605z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(w4.q0 q0Var, ne.c cVar) {
        super(cVar);
        this.f14604y = q0Var;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f14603x = obj;
        this.f14605z |= Integer.MIN_VALUE;
        this.f14604y.c(null, this);
        return me.a.f8833x;
    }
}
