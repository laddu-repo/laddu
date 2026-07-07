package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w0 extends ne.c {
    public gf.j1 A;
    public /* synthetic */ Object B;
    public final /* synthetic */ x0 C;
    public int D;

    /* renamed from: x, reason: collision with root package name */
    public x0 f8027x;

    /* renamed from: y, reason: collision with root package name */
    public i f8028y;

    /* renamed from: z, reason: collision with root package name */
    public z0 f8029z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(x0 x0Var, le.c cVar) {
        super(cVar);
        this.C = x0Var;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        x0.h(this.C, null, this);
        return me.a.f8833x;
    }
}
