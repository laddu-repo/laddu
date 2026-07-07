package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i0 extends ne.c {
    public final /* synthetic */ j0 A;
    public Object B;

    /* renamed from: x, reason: collision with root package name */
    public j0 f7958x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f7959y;

    /* renamed from: z, reason: collision with root package name */
    public int f7960z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, le.c cVar) {
        super(cVar);
        this.A = j0Var;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f7959y = obj;
        this.f7960z |= Integer.MIN_VALUE;
        return this.A.emit(null, this);
    }
}
