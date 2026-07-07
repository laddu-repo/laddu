package df;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class n extends a8.b {
    public static String r(String str) {
        kotlin.jvm.internal.k.e(str, "<this>");
        return cf.l.N(new cf.t(new cf.o(str, 1), new cf.n("    ", 2), 1), "\n");
    }

    public static String s(String str) {
        List list;
        Comparable comparable;
        int i6;
        String str2;
        kotlin.jvm.internal.k.e(str, "<this>");
        g gVar = new g(str);
        if (!gVar.hasNext()) {
            list = ie.r.f6846x;
        } else {
            Object next = gVar.next();
            if (!gVar.hasNext()) {
                list = a8.g.m(next);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (gVar.hasNext()) {
                    arrayList.add(gVar.next());
                }
                list = arrayList;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!m.S((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(ie.l.x(arrayList2, 10));
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            String str3 = (String) obj2;
            int length = str3.length();
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    if (!a.a.n(str3.charAt(i12))) {
                        break;
                    }
                    i12++;
                } else {
                    i12 = -1;
                    break;
                }
            }
            if (i12 == -1) {
                i12 = str3.length();
            }
            arrayList3.add(Integer.valueOf(i12));
        }
        Iterator it = arrayList3.iterator();
        if (!it.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            i6 = num.intValue();
        } else {
            i6 = 0;
        }
        int length2 = str.length();
        list.size();
        int s = ie.k.s(list);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : list) {
            int i13 = i10 + 1;
            if (i10 >= 0) {
                String str4 = (String) obj3;
                if ((i10 == 0 || i10 == s) && m.S(str4)) {
                    str2 = null;
                } else {
                    str2 = m.K(i6, str4);
                }
                if (str2 != null) {
                    arrayList4.add(str2);
                }
                i10 = i13;
            } else {
                ie.k.w();
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder(length2);
        ie.j.K(arrayList4, sb2, "\n", null, 124);
        return sb2.toString();
    }

    public static String t(String str) {
        List list;
        kotlin.jvm.internal.k.e(str, "<this>");
        if (!m.S("|")) {
            g gVar = new g(str);
            if (!gVar.hasNext()) {
                list = ie.r.f6846x;
            } else {
                Object next = gVar.next();
                if (!gVar.hasNext()) {
                    list = a8.g.m(next);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(next);
                    while (gVar.hasNext()) {
                        arrayList.add(gVar.next());
                    }
                    list = arrayList;
                }
            }
            int length = str.length();
            list.size();
            int s = ie.k.s(list);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            int i6 = 0;
            while (true) {
                String str2 = null;
                if (it.hasNext()) {
                    Object next2 = it.next();
                    int i10 = i6 + 1;
                    if (i6 >= 0) {
                        String str3 = (String) next2;
                        if ((i6 != 0 && i6 != s) || !m.S(str3)) {
                            int length2 = str3.length();
                            int i11 = 0;
                            while (true) {
                                if (i11 < length2) {
                                    if (!a.a.n(str3.charAt(i11))) {
                                        break;
                                    }
                                    i11++;
                                } else {
                                    i11 = -1;
                                    break;
                                }
                            }
                            if (i11 != -1 && u.G(i11, str3, "|", false)) {
                                str2 = str3.substring("|".length() + i11);
                                kotlin.jvm.internal.k.d(str2, "substring(...)");
                            }
                            if (str2 == null) {
                                str2 = str3;
                            }
                        }
                        if (str2 != null) {
                            arrayList2.add(str2);
                        }
                        i6 = i10;
                    } else {
                        ie.k.w();
                        throw null;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(length);
                    ie.j.K(arrayList2, sb2, "\n", null, 124);
                    return sb2.toString();
                }
            }
        } else {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
    }
}
