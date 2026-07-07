package x4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c0 extends ne.c {
    public final /* synthetic */ x A;
    public int B;

    /* renamed from: x, reason: collision with root package name */
    public x f14558x;

    /* renamed from: y, reason: collision with root package name */
    public int f14559y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f14560z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(x xVar, ne.c cVar) {
        super(cVar);
        this.A = xVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f14560z = obj;
        this.B |= Integer.MIN_VALUE;
        return x.i(this.A, this);
    }
}
