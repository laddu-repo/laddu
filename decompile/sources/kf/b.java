package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends ne.c {
    public int A;

    /* renamed from: x, reason: collision with root package name */
    public jf.v f7919x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f7920y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ c f7921z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ne.c cVar2) {
        super(cVar2);
        this.f7921z = cVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f7920y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.f7921z.a(null, this);
    }
}
