package cf;

import he.y;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r extends ne.i implements ve.p {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ he.i C;
    public final /* synthetic */ i D;
    public final /* synthetic */ ve.p E;

    /* renamed from: y, reason: collision with root package name */
    public Object f2077y;

    /* renamed from: z, reason: collision with root package name */
    public Iterator f2078z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(he.i iVar, i iVar2, ve.p pVar, le.c cVar) {
        super(2, cVar);
        this.C = iVar;
        this.D = iVar2;
        this.E = pVar;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        r rVar = new r(this.C, this.D, this.E, cVar);
        rVar.B = obj;
        return rVar;
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((k) obj, (le.c) obj2)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        k kVar = (k) this.B;
        int i6 = this.A;
        Object obj2 = this.C;
        me.a aVar = me.a.f8833x;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    it = this.f2078z;
                    obj2 = this.f2077y;
                    he.a.f(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                he.a.f(obj);
                it = this.D.iterator();
            }
            if (it.hasNext()) {
                Object invoke = this.E.invoke(obj2, it.next());
                this.B = kVar;
                this.f2077y = invoke;
                this.f2078z = it;
                this.A = 2;
                kVar.f2068y = invoke;
                kVar.f2067x = 3;
                kVar.A = this;
                return aVar;
            }
            return y.f6101a;
        }
        he.a.f(obj);
        this.B = kVar;
        this.A = 1;
        kVar.f2068y = obj2;
        kVar.f2067x = 3;
        kVar.A = this;
        return aVar;
    }
}
