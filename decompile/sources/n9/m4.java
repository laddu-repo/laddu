package n9;

import com.google.android.gms.internal.measurement.y7;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9398a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9399b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.n3 f9400c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f9401d;

    /* renamed from: e, reason: collision with root package name */
    public final BitSet f9402e;

    /* renamed from: f, reason: collision with root package name */
    public final v.e f9403f;

    /* renamed from: g, reason: collision with root package name */
    public final v.e f9404g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f9405h;

    /* JADX WARN: Type inference failed for: r1v1, types: [v.l, v.e] */
    public m4(c cVar, String str, com.google.android.gms.internal.measurement.n3 n3Var, BitSet bitSet, BitSet bitSet2, v.e eVar, v.e eVar2) {
        this.f9405h = cVar;
        this.f9398a = str;
        this.f9401d = bitSet;
        this.f9402e = bitSet2;
        this.f9403f = eVar;
        this.f9404g = new v.l(0);
        Iterator it = ((v.b) eVar2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) eVar2.get(num));
            this.f9404g.put(num, arrayList);
        }
        this.f9399b = false;
        this.f9400c = n3Var;
    }

    public final void a(b bVar) {
        int q9;
        boolean z10;
        boolean v10;
        switch (bVar.f9179g) {
            case 0:
                q9 = ((com.google.android.gms.internal.measurement.p1) bVar.f9181i).q();
                break;
            default:
                q9 = ((com.google.android.gms.internal.measurement.w1) bVar.f9181i).q();
                break;
        }
        if (bVar.f9175c != null) {
            this.f9402e.set(q9, true);
        }
        Boolean bool = bVar.f9176d;
        if (bool != null) {
            this.f9401d.set(q9, bool.booleanValue());
        }
        if (bVar.f9177e != null) {
            Integer valueOf = Integer.valueOf(q9);
            v.e eVar = this.f9403f;
            Long l10 = (Long) eVar.get(valueOf);
            long longValue = bVar.f9177e.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                eVar.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (bVar.f9178f != null) {
            Integer valueOf2 = Integer.valueOf(q9);
            v.e eVar2 = this.f9404g;
            List list = (List) eVar2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                eVar2.put(valueOf2, list);
            }
            switch (bVar.f9179g) {
                case 0:
                    z10 = false;
                    break;
                default:
                    z10 = true;
                    break;
            }
            if (z10) {
                list.clear();
            }
            y7.a();
            n1 n1Var = (n1) this.f9405h.f4301y;
            g gVar = n1Var.A;
            d0 d0Var = e0.G0;
            String str = this.f9398a;
            if (gVar.n1(str, d0Var)) {
                switch (bVar.f9179g) {
                    case 0:
                        v10 = ((com.google.android.gms.internal.measurement.p1) bVar.f9181i).v();
                        break;
                    default:
                        v10 = false;
                        break;
                }
                if (v10) {
                    list.clear();
                }
            }
            y7.a();
            if (n1Var.A.n1(str, d0Var)) {
                Long valueOf3 = Long.valueOf(bVar.f9178f.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(bVar.f9178f.longValue() / 1000));
        }
    }

    public final com.google.android.gms.internal.measurement.u2 b(int i6) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.t2 w10 = com.google.android.gms.internal.measurement.u2.w();
        w10.b();
        ((com.google.android.gms.internal.measurement.u2) w10.f2337y).x(i6);
        w10.b();
        ((com.google.android.gms.internal.measurement.u2) w10.f2337y).A(this.f9399b);
        com.google.android.gms.internal.measurement.n3 n3Var = this.f9400c;
        if (n3Var != null) {
            w10.b();
            ((com.google.android.gms.internal.measurement.u2) w10.f2337y).z(n3Var);
        }
        com.google.android.gms.internal.measurement.m3 x10 = com.google.android.gms.internal.measurement.n3.x();
        ArrayList L1 = y0.L1(this.f9401d);
        x10.b();
        ((com.google.android.gms.internal.measurement.n3) x10.f2337y).B(L1);
        ArrayList L12 = y0.L1(this.f9402e);
        x10.b();
        ((com.google.android.gms.internal.measurement.n3) x10.f2337y).z(L12);
        v.e eVar = this.f9403f;
        if (eVar == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(eVar.f13174z);
            Iterator it = ((v.b) eVar.keySet()).iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                Long l10 = (Long) eVar.get(num);
                if (l10 != null) {
                    com.google.android.gms.internal.measurement.z2 t10 = com.google.android.gms.internal.measurement.a3.t();
                    t10.b();
                    ((com.google.android.gms.internal.measurement.a3) t10.f2337y).u(intValue);
                    long longValue = l10.longValue();
                    t10.b();
                    ((com.google.android.gms.internal.measurement.a3) t10.f2337y).v(longValue);
                    arrayList2.add((com.google.android.gms.internal.measurement.a3) t10.e());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            x10.b();
            ((com.google.android.gms.internal.measurement.n3) x10.f2337y).D(arrayList);
        }
        v.e eVar2 = this.f9404g;
        if (eVar2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(eVar2.f13174z);
            Iterator it2 = ((v.b) eVar2.keySet()).iterator();
            while (it2.hasNext()) {
                Integer num2 = (Integer) it2.next();
                com.google.android.gms.internal.measurement.o3 u3 = com.google.android.gms.internal.measurement.p3.u();
                int intValue2 = num2.intValue();
                u3.b();
                ((com.google.android.gms.internal.measurement.p3) u3.f2337y).v(intValue2);
                List list2 = (List) eVar2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    u3.b();
                    ((com.google.android.gms.internal.measurement.p3) u3.f2337y).w(list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.p3) u3.e());
            }
            list = arrayList3;
        }
        x10.b();
        ((com.google.android.gms.internal.measurement.n3) x10.f2337y).F(list);
        w10.b();
        ((com.google.android.gms.internal.measurement.u2) w10.f2337y).y((com.google.android.gms.internal.measurement.n3) x10.e());
        return (com.google.android.gms.internal.measurement.u2) w10.e();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [v.l, v.e] */
    /* JADX WARN: Type inference failed for: r1v5, types: [v.l, v.e] */
    public m4(c cVar, String str) {
        this.f9405h = cVar;
        this.f9398a = str;
        this.f9399b = true;
        this.f9401d = new BitSet();
        this.f9402e = new BitSet();
        this.f9403f = new v.l(0);
        this.f9404g = new v.l(0);
    }
}
