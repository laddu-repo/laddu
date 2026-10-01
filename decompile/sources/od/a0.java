package od;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a0 extends ne.c {

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f10050x;

    /* renamed from: y, reason: collision with root package name */
    public int f10051y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ b1.u f10052z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b1.u uVar, le.c cVar) {
        super(cVar);
        this.f10052z = uVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f10050x = obj;
        this.f10051y |= Integer.MIN_VALUE;
        return this.f10052z.emit(null, this);
    }
}
