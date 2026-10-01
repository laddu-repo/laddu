package q6;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends ne.c {
    public final /* synthetic */ h A;
    public int B;

    /* renamed from: x, reason: collision with root package name */
    public h f11114x;

    /* renamed from: y, reason: collision with root package name */
    public j f11115y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f11116z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, ne.c cVar) {
        super(cVar);
        this.A = hVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f11116z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.d(null, this);
    }
}
