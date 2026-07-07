package x4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i0 extends ne.c {
    public final /* synthetic */ lf.j A;
    public int B;

    /* renamed from: x, reason: collision with root package name */
    public lf.j f14586x;

    /* renamed from: y, reason: collision with root package name */
    public int[] f14587y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f14588z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(lf.j jVar, le.c cVar) {
        super(cVar);
        this.A = jVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f14588z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.a(null, this);
    }
}
