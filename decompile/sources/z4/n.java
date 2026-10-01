package z4;

import x4.f0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n extends ne.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ r B;
    public int C;

    /* renamed from: x, reason: collision with root package name */
    public r f15200x;

    /* renamed from: y, reason: collision with root package name */
    public f0 f15201y;

    /* renamed from: z, reason: collision with root package name */
    public g f15202z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, ne.c cVar) {
        super(cVar);
        this.B = rVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.e(null, this);
    }
}
