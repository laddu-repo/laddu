package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x extends ne.c {
    public int A;

    /* renamed from: x, reason: collision with root package name */
    public f f8030x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f8031y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ f f8032z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(f fVar, le.c cVar) {
        super(cVar);
        this.f8032z = fVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f8031y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.f8032z.emit(null, this);
    }
}
