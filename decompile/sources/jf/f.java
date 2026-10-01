package jf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends ne.c {

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f7444x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f7445y;

    /* renamed from: z, reason: collision with root package name */
    public int f7446z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, ne.c cVar) {
        super(cVar);
        this.f7445y = hVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f7444x = obj;
        this.f7446z |= Integer.MIN_VALUE;
        Object C = h.C(this.f7445y, this);
        if (C == me.a.f8833x) {
            return C;
        }
        return new o(C);
    }
}
