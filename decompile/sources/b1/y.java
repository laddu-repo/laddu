package b1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y extends ne.c {
    public kotlin.jvm.internal.w A;
    public g0 B;
    public /* synthetic */ Object C;
    public final /* synthetic */ z D;
    public int E;

    /* renamed from: x, reason: collision with root package name */
    public Object f1337x;

    /* renamed from: y, reason: collision with root package name */
    public Object f1338y;

    /* renamed from: z, reason: collision with root package name */
    public Object f1339z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, ne.c cVar) {
        super(cVar);
        this.D = zVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.a(null, this);
    }
}
