package x4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends ne.j implements ve.p {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f14572x;

    /* renamed from: y, reason: collision with root package name */
    public int f14573y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ i f14574z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, le.c cVar, int i6) {
        super(2, cVar);
        this.f14572x = i6;
        this.f14574z = iVar;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        switch (this.f14572x) {
            case 0:
                return new h(this.f14574z, cVar, 0);
            case 1:
                return new h(this.f14574z, cVar, 1);
            default:
                return new h(this.f14574z, cVar, 2);
        }
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        gf.c0 c0Var = (gf.c0) obj;
        le.c cVar = (le.c) obj2;
        switch (this.f14572x) {
            case 0:
                return ((h) create(c0Var, cVar)).invokeSuspend(he.y.f6101a);
            case 1:
                return ((h) create(c0Var, cVar)).invokeSuspend(he.y.f6101a);
            default:
                return ((h) create(c0Var, cVar)).invokeSuspend(he.y.f6101a);
        }
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        Object f3;
        switch (this.f14572x) {
            case 0:
                int i6 = this.f14573y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        he.a.f(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    he.a.f(obj);
                    p0 p0Var = this.f14574z.f14579b;
                    this.f14573y = 1;
                    Object f10 = p0Var.f(this);
                    me.a aVar = me.a.f8833x;
                    if (f10 == aVar) {
                        return aVar;
                    }
                }
                return he.y.f6101a;
            case 1:
                int i10 = this.f14573y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        he.a.f(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    he.a.f(obj);
                    p0 p0Var2 = this.f14574z.f14579b;
                    this.f14573y = 1;
                    Object f11 = p0Var2.f(this);
                    me.a aVar2 = me.a.f8833x;
                    if (f11 == aVar2) {
                        return aVar2;
                    }
                }
                return he.y.f6101a;
            default:
                int i11 = this.f14573y;
                he.y yVar = he.y.f6101a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        he.a.f(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                he.a.f(obj);
                this.f14573y = 1;
                i iVar = this.f14574z;
                w wVar = iVar.f14578a;
                boolean n10 = wVar.n();
                me.a aVar3 = me.a.f8833x;
                if ((n10 && !wVar.q()) || (f3 = iVar.f14579b.f(this)) != aVar3) {
                    f3 = yVar;
                }
                if (f3 == aVar3) {
                    return aVar3;
                }
                return yVar;
        }
    }
}
