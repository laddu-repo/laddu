package od;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t extends ne.j implements ve.q {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10146x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ List f10147y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f10148z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i6, le.c cVar, int i10) {
        super(i6, cVar);
        this.f10146x = i10;
    }

    @Override // ve.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f10146x) {
            case 0:
                t tVar = new t(3, (le.c) obj3, 0);
                tVar.f10147y = (List) obj;
                tVar.f10148z = (List) obj2;
                return tVar.invokeSuspend(he.y.f6101a);
            default:
                t tVar2 = new t(3, (le.c) obj3, 1);
                tVar2.f10148z = (jd.y) obj;
                tVar2.f10147y = (List) obj2;
                return tVar2.invokeSuspend(he.y.f6101a);
        }
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f10146x) {
            case 0:
                List list = this.f10147y;
                List list2 = (List) this.f10148z;
                he.a.f(obj);
                return ie.j.P(list2, list);
            default:
                jd.y yVar = (jd.y) this.f10148z;
                List list3 = this.f10147y;
                he.a.f(obj);
                if (yVar instanceof jd.x) {
                    d0 d0Var = (d0) ((jd.x) yVar).f7412a;
                    cf.t tVar = new cf.t(ie.j.C(list3), new e0(0), 1);
                    HashSet hashSet = new HashSet();
                    Iterator it = tVar.iterator();
                    while (true) {
                        cf.u uVar = (cf.u) it;
                        if (uVar.hasNext()) {
                            hashSet.add(uVar.next());
                        } else {
                            for (kd.h0 h0Var : d0Var.f10073a) {
                                h0Var.I = hashSet.contains(h0Var.A);
                            }
                            return new jd.x(d0Var.f10073a);
                        }
                    }
                } else {
                    if ((yVar instanceof jd.v) || (yVar instanceof jd.w)) {
                        return yVar;
                    }
                    throw new RuntimeException();
                }
                break;
        }
    }
}
