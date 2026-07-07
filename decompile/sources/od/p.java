package od;

import com.google.android.gms.internal.measurement.j5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p extends ne.j implements ve.q {
    public /* synthetic */ List A;
    public final /* synthetic */ q B;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f10136x;

    /* renamed from: y, reason: collision with root package name */
    public int f10137y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ jd.y f10138z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, le.c cVar) {
        super(3, cVar);
        this.B = qVar;
    }

    @Override // ve.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p pVar = new p(this.B, (le.c) obj3);
        pVar.f10138z = (jd.y) obj;
        pVar.A = (List) obj2;
        return pVar.invokeSuspend(he.y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        jd.y yVar = this.f10138z;
        List list = this.A;
        int i6 = this.f10137y;
        if (i6 != 0) {
            if (i6 == 1) {
                arrayList = this.f10136x;
                he.a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            he.a.f(obj);
            if (yVar instanceof jd.x) {
                List<kd.l> list2 = (List) ((jd.x) yVar).f7412a;
                ArrayList arrayList2 = new ArrayList(ie.l.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new Long(((kd.l) it.next()).f7876x));
                }
                Set c02 = ie.j.c0(arrayList2);
                ArrayList arrayList3 = new ArrayList(ie.l.x(list2, 10));
                for (kd.l lVar : list2) {
                    lVar.B = c02.contains(new Long(lVar.f7876x));
                    arrayList3.add(lVar);
                }
                hd.e eVar = this.B.f10139e;
                this.f10138z = null;
                this.A = null;
                this.f10136x = arrayList3;
                this.f10137y = 1;
                Object q9 = j5.q(this, new hd.b(0, eVar, arrayList3), eVar.f6053a, false, true);
                Object obj2 = me.a.f8833x;
                if (q9 != obj2) {
                    q9 = he.y.f6101a;
                }
                if (q9 == obj2) {
                    return obj2;
                }
                arrayList = arrayList3;
            } else {
                if ((yVar instanceof jd.v) || (yVar instanceof jd.w)) {
                    return yVar;
                }
                throw new RuntimeException();
            }
        }
        return new jd.x(arrayList);
    }
}
