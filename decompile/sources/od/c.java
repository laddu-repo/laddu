package od;

import gf.o0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends ne.j implements ve.q {
    public /* synthetic */ Object A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10059x = 0;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ jd.y f10060y;

    /* renamed from: z, reason: collision with root package name */
    public int f10061z;

    public /* synthetic */ c(int i6, le.c cVar) {
        super(i6, cVar);
    }

    @Override // ve.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        jd.y yVar = (jd.y) obj;
        switch (this.f10059x) {
            case 0:
                c cVar = new c(3, (le.c) obj3);
                cVar.f10060y = yVar;
                cVar.A = (String) obj2;
                return cVar.invokeSuspend(he.y.f6101a);
            default:
                int intValue = ((Number) obj2).intValue();
                c cVar2 = new c((s) this.A, (le.c) obj3);
                cVar2.f10060y = yVar;
                cVar2.f10061z = intValue;
                return cVar2.invokeSuspend(he.y.f6101a);
        }
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f10059x) {
            case 0:
                jd.y yVar = this.f10060y;
                String str = (String) this.A;
                int i6 = this.f10061z;
                if (i6 != 0) {
                    if (i6 == 1) {
                        he.a.f(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                he.a.f(obj);
                of.d dVar = o0.f5694b;
                androidx.lifecycle.z zVar = new androidx.lifecycle.z(str, yVar, null, 5);
                this.f10060y = null;
                this.A = null;
                this.f10061z = 1;
                Object J = gf.f0.J(dVar, zVar, this);
                me.a aVar = me.a.f8833x;
                if (J == aVar) {
                    return aVar;
                }
                return J;
            default:
                jd.y yVar2 = this.f10060y;
                int i10 = this.f10061z;
                he.a.f(obj);
                s sVar = (s) this.A;
                if (yVar2 instanceof jd.x) {
                    List list = (List) ((jd.x) yVar2).f7412a;
                    if (i10 != 0) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            kd.a0 a0Var = ((kd.u) obj2).C;
                            if (s.k(sVar, i10, a0Var.C, a0Var.D)) {
                                arrayList.add(obj2);
                            }
                        }
                        list = arrayList;
                    }
                    return new jd.x(list);
                }
                if ((yVar2 instanceof jd.v) || (yVar2 instanceof jd.w)) {
                    return yVar2;
                }
                throw new RuntimeException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(s sVar, le.c cVar) {
        super(3, cVar);
        this.A = sVar;
    }
}
