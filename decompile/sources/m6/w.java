package m6;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w extends ne.c {
    public final /* synthetic */ z A;
    public int B;

    /* renamed from: x, reason: collision with root package name */
    public Object f8689x;

    /* renamed from: y, reason: collision with root package name */
    public kotlin.jvm.internal.s f8690y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f8691z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar, ne.c cVar) {
        super(cVar);
        this.A = zVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f8691z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.a(this);
    }
}
