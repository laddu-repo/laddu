package x4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a0 extends ne.j implements ve.p {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f14554x;

    /* renamed from: y, reason: collision with root package name */
    public int f14555y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ x f14556z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(x xVar, le.c cVar, int i6) {
        super(2, cVar);
        this.f14554x = i6;
        this.f14556z = xVar;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        switch (this.f14554x) {
            case 0:
                return new a0(this.f14556z, cVar, 0);
            default:
                return new a0(this.f14556z, cVar, 1);
        }
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        gf.c0 c0Var = (gf.c0) obj;
        le.c cVar = (le.c) obj2;
        switch (this.f14554x) {
            case 0:
                return ((a0) create(c0Var, cVar)).invokeSuspend(he.y.f6101a);
            default:
                return ((a0) create(c0Var, cVar)).invokeSuspend(he.y.f6101a);
        }
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f14554x) {
            case 0:
                int i6 = this.f14555y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        he.a.f(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    he.a.f(obj);
                    this.f14555y = 1;
                    Object i10 = x.i(this.f14556z, this);
                    me.a aVar = me.a.f8833x;
                    if (i10 == aVar) {
                        return aVar;
                    }
                }
                return he.y.f6101a;
            default:
                int i11 = this.f14555y;
                if (i11 != 0) {
                    if (i11 == 1) {
                        he.a.f(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    he.a.f(obj);
                    this.f14555y = 1;
                    Object i12 = x.i(this.f14556z, this);
                    me.a aVar2 = me.a.f8833x;
                    if (i12 == aVar2) {
                        return aVar2;
                    }
                }
                return he.y.f6101a;
        }
    }
}
