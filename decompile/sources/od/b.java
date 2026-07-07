package od;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends ne.j implements ve.q {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10053x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ List f10054y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ String f10055z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i6, le.c cVar, int i10) {
        super(i6, cVar);
        this.f10053x = i10;
    }

    @Override // ve.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        String str = (String) obj2;
        le.c cVar = (le.c) obj3;
        switch (this.f10053x) {
            case 0:
                b bVar = new b(3, cVar, 0);
                bVar.f10054y = list;
                bVar.f10055z = str;
                return bVar.invokeSuspend(he.y.f6101a);
            default:
                b bVar2 = new b(3, cVar, 1);
                bVar2.f10054y = list;
                bVar2.f10055z = str;
                return bVar2.invokeSuspend(he.y.f6101a);
        }
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f10053x) {
            case 0:
                List<kd.i> list = this.f10054y;
                String str = this.f10055z;
                he.a.f(obj);
                ArrayList arrayList = new ArrayList(ie.l.x(list, 10));
                for (kd.i iVar : list) {
                    arrayList.add(kd.i.a(iVar, kotlin.jvm.internal.k.a(iVar.f7861b, str)));
                }
                return arrayList;
            default:
                List list2 = this.f10054y;
                String str2 = this.f10055z;
                he.a.f(obj);
                if (!df.m.S(str2)) {
                    return cf.m.i(str2, list2);
                }
                return list2;
        }
    }
}
