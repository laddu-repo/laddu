package yf;

import j2.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p extends ne.i implements ve.q {
    public final /* synthetic */ y A;

    /* renamed from: y, reason: collision with root package name */
    public int f15079y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ he.b f15080z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(y yVar, le.c cVar) {
        super(3, cVar);
        this.A = yVar;
    }

    @Override // ve.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p pVar = new p(this.A, (le.c) obj3);
        pVar.f15080z = (he.b) obj;
        return pVar.invokeSuspend(he.y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        y yVar = this.A;
        y2.j jVar = (y2.j) yVar.f7145z;
        he.b bVar = this.f15080z;
        int i6 = this.f15079y;
        if (i6 != 0) {
            if (i6 == 1) {
                he.a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            he.a.f(obj);
            byte w10 = jVar.w();
            if (w10 == 1) {
                return yVar.t(true);
            }
            if (w10 == 0) {
                return yVar.t(false);
            }
            if (w10 == 6) {
                this.f15080z = null;
                this.f15079y = 1;
                obj = y.d(yVar, bVar, this);
                me.a aVar = me.a.f8833x;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (w10 == 8) {
                    return yVar.r();
                }
                y2.j.q(jVar, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
        }
        return (xf.k) obj;
    }
}
