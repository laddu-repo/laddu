package od;

import java.util.List;
import kd.p0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b0 extends ne.j implements ve.q {
    public final /* synthetic */ c0 A;

    /* renamed from: x, reason: collision with root package name */
    public int f10056x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ List f10057y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ int f10058z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, le.c cVar) {
        super(3, cVar);
        this.A = c0Var;
    }

    @Override // ve.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        b0 b0Var = new b0(this.A, (le.c) obj3);
        b0Var.f10057y = (List) obj;
        b0Var.f10058z = intValue;
        return b0Var.invokeSuspend(he.y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        List list = this.f10057y;
        int i6 = this.f10058z;
        int i10 = this.f10056x;
        if (i10 != 0) {
            if (i10 == 1) {
                he.a.f(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        he.a.f(obj);
        if (i6 >= 0 && i6 < list.size()) {
            obj2 = list.get(i6);
        } else {
            obj2 = (p0) ie.j.G(list);
        }
        this.f10057y = null;
        this.f10058z = i6;
        this.f10056x = 1;
        Object g10 = c0.g(this.A, (p0) obj2, this);
        me.a aVar = me.a.f8833x;
        if (g10 == aVar) {
            return aVar;
        }
        return g10;
    }
}
