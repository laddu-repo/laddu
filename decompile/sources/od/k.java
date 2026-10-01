package od;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k extends ne.j implements ve.q {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10113x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ jd.y f10114y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ String f10115z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i6, le.c cVar, int i10) {
        super(i6, cVar);
        this.f10113x = i10;
    }

    @Override // ve.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        jd.y yVar = (jd.y) obj;
        String str = (String) obj2;
        le.c cVar = (le.c) obj3;
        switch (this.f10113x) {
            case 0:
                k kVar = new k(3, cVar, 0);
                kVar.f10114y = yVar;
                kVar.f10115z = str;
                return kVar.invokeSuspend(he.y.f6101a);
            case 1:
                k kVar2 = new k(3, cVar, 1);
                kVar2.f10114y = yVar;
                kVar2.f10115z = str;
                return kVar2.invokeSuspend(he.y.f6101a);
            default:
                k kVar3 = new k(3, cVar, 2);
                kVar3.f10114y = yVar;
                kVar3.f10115z = str;
                return kVar3.invokeSuspend(he.y.f6101a);
        }
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f10113x) {
            case 0:
                jd.y yVar = this.f10114y;
                String str = this.f10115z;
                he.a.f(obj);
                if (!df.m.S(str)) {
                    if (yVar instanceof jd.x) {
                        Object obj2 = ((jd.x) yVar).f7412a;
                        if (obj2 instanceof List) {
                            obj2 = cf.m.i(str, (List) obj2);
                        }
                        return new jd.x(obj2);
                    }
                    if ((yVar instanceof jd.v) || (yVar instanceof jd.w)) {
                        return yVar;
                    }
                    throw new RuntimeException();
                }
                return yVar;
            case 1:
                jd.y yVar2 = this.f10114y;
                String str2 = this.f10115z;
                he.a.f(obj);
                if (!kotlin.jvm.internal.k.a(str2, "All")) {
                    if (yVar2 instanceof jd.x) {
                        List list = (List) ((jd.x) yVar2).f7412a;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            if (kotlin.jvm.internal.k.a(((kd.h0) obj3).f7858y, str2)) {
                                arrayList.add(obj3);
                            }
                        }
                        return new jd.x(arrayList);
                    }
                    if ((yVar2 instanceof jd.v) || (yVar2 instanceof jd.w)) {
                        return yVar2;
                    }
                    throw new RuntimeException();
                }
                return yVar2;
            default:
                jd.y yVar3 = this.f10114y;
                String str3 = this.f10115z;
                he.a.f(obj);
                if (!df.m.S(str3)) {
                    if (yVar3 instanceof jd.x) {
                        return new jd.x(cf.m.i(str3, (List) ((jd.x) yVar3).f7412a));
                    }
                    if ((yVar3 instanceof jd.v) || (yVar3 instanceof jd.w)) {
                        return yVar3;
                    }
                    throw new RuntimeException();
                }
                return yVar3;
        }
    }
}
