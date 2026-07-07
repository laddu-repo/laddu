package od;

import gf.o0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l extends ne.j implements ve.p {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10118x;

    /* renamed from: y, reason: collision with root package name */
    public int f10119y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ m f10120z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, le.c cVar, int i6) {
        super(2, cVar);
        this.f10118x = i6;
        this.f10120z = mVar;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        switch (this.f10118x) {
            case 0:
                return new l(this.f10120z, cVar, 0);
            default:
                return new l(this.f10120z, cVar, 1);
        }
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        gf.c0 c0Var = (gf.c0) obj;
        le.c cVar = (le.c) obj2;
        switch (this.f10118x) {
            case 0:
                return ((l) create(c0Var, cVar)).invokeSuspend(he.y.f6101a);
            default:
                return ((l) create(c0Var, cVar)).invokeSuspend(he.y.f6101a);
        }
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f10118x) {
            case 0:
                int i6 = this.f10119y;
                he.y yVar = he.y.f6101a;
                if (i6 != 0) {
                    if (i6 == 1) {
                        he.a.f(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                he.a.f(obj);
                this.f10119y = 1;
                Object J = gf.f0.J(o0.f5694b, new dd.c(this.f10120z, r7.a.f11841y, (le.c) null, 8), this);
                me.a aVar = me.a.f8833x;
                if (J != aVar) {
                    J = yVar;
                }
                if (J == aVar) {
                    return aVar;
                }
                return yVar;
            default:
                int i10 = this.f10119y;
                he.y yVar2 = he.y.f6101a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        he.a.f(obj);
                        return yVar2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                he.a.f(obj);
                this.f10119y = 1;
                Object J2 = gf.f0.J(o0.f5694b, new dd.c(this.f10120z, r7.a.f11840x, (le.c) null, 8), this);
                me.a aVar2 = me.a.f8833x;
                if (J2 != aVar2) {
                    J2 = yVar2;
                }
                if (J2 == aVar2) {
                    return aVar2;
                }
                return yVar2;
        }
    }
}
