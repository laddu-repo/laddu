package qe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.d1;
import me.q;
import me.t;
import me.v0;
import od.l;
import pd.k;
import pd.p;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f extends ud.c implements pe.d {
    public final int A;
    public sd.h B;
    public sd.c C;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final pe.d f11018y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final sd.h f11019z;

    public f(pe.d dVar, sd.h hVar) {
        super(e.f11017v, sd.i.f11797v);
        this.f11018y = dVar;
        this.f11019z = hVar;
        this.A = ((Number) hVar.m(0, new q(3))).intValue();
    }

    @Override // ud.a, ud.d
    public final ud.d c() {
        sd.c cVar = this.C;
        if (cVar instanceof ud.d) {
            return (ud.d) cVar;
        }
        return null;
    }

    @Override // ud.c, sd.c
    public final sd.h f() {
        sd.h hVar = this.B;
        return hVar == null ? sd.i.f11797v : hVar;
    }

    @Override // pe.d
    public final Object j(Object obj, sd.c cVar) {
        try {
            Object objQ = q(cVar, obj);
            return objQ == td.a.f12544v ? objQ : l.f10126a;
        } catch (Throwable th) {
            this.B = new c(th, cVar.f());
            throw th;
        }
    }

    @Override // ud.a
    public final StackTraceElement m() {
        return null;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        Throwable thA = od.h.a(obj);
        if (thA != null) {
            this.B = new c(thA, f());
        }
        sd.c cVar = this.C;
        if (cVar != null) {
            cVar.g(obj);
        }
        return td.a.f12544v;
    }

    public final Object q(sd.c cVar, Object obj) {
        List listS;
        Comparable comparable;
        String strSubstring;
        sd.h hVarF = cVar.f();
        v0 v0Var = (v0) hVarF.A(t.f8732w);
        if (v0Var != null && !v0Var.a()) {
            throw ((d1) v0Var).x();
        }
        sd.h hVar = this.B;
        if (hVar != hVarF) {
            if (hVar instanceof c) {
                String str = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((c) hVar).f11016w + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                de.i.e(str, "<this>");
                ke.c cVar2 = new ke.c(str);
                if (cVar2.hasNext()) {
                    Object next = cVar2.next();
                    if (cVar2.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (cVar2.hasNext()) {
                            arrayList.add(cVar2.next());
                        }
                        listS = arrayList;
                    } else {
                        listS = fa.b.s(next);
                    }
                } else {
                    listS = p.f10551v;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listS) {
                    if (!ke.h.L((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(pd.l.C(arrayList2, 10));
                int size = arrayList2.size();
                int i = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList2.get(i10);
                    i10++;
                    String str2 = (String) obj3;
                    int length = str2.length();
                    int length2 = 0;
                    while (true) {
                        if (length2 >= length) {
                            length2 = -1;
                            break;
                        }
                        if (!com.bumptech.glide.d.B(str2.charAt(length2))) {
                            break;
                        }
                        length2++;
                    }
                    if (length2 == -1) {
                        length2 = str2.length();
                    }
                    arrayList3.add(Integer.valueOf(length2));
                }
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    comparable = (Comparable) it.next();
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) it.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int iIntValue = num != null ? num.intValue() : 0;
                int length3 = str.length();
                listS.size();
                int iA = k.A(listS);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : listS) {
                    int i11 = i + 1;
                    if (i < 0) {
                        k.B();
                        throw null;
                    }
                    String str3 = (String) obj4;
                    if ((i == 0 || i == iA) && ke.h.L(str3)) {
                        strSubstring = null;
                    } else {
                        de.i.e(str3, "<this>");
                        if (iIntValue < 0) {
                            throw new IllegalArgumentException(d0.d.i(iIntValue, "Requested character count ", " is less than zero.").toString());
                        }
                        int length4 = str3.length();
                        if (iIntValue <= length4) {
                            length4 = iIntValue;
                        }
                        strSubstring = str3.substring(length4);
                        de.i.d(strSubstring, "substring(...)");
                    }
                    if (strSubstring != null) {
                        arrayList4.add(strSubstring);
                    }
                    i = i11;
                }
                StringBuilder sb2 = new StringBuilder(length3);
                pd.j.G(arrayList4, sb2, "\n", "", "", "...", null);
                throw new IllegalStateException(sb2.toString().toString());
            }
            if (((Number) hVarF.m(0, new ke.q(1, this))).intValue() != this.A) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f11019z + ",\n\t\tbut emission happened in " + hVarF + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.B = hVarF;
        }
        this.C = cVar;
        ce.q qVar = h.f11020a;
        pe.d dVar = this.f11018y;
        de.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objH = qVar.h(dVar, obj, this);
        if (!de.i.a(objH, td.a.f12544v)) {
            this.C = null;
        }
        return objH;
    }
}
