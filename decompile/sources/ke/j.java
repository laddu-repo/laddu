package ke;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends com.bumptech.glide.e {
    public static String v(String str) {
        de.i.e(str, "<this>");
        return je.g.R(new je.d(new je.h(1, str), new i(0, "    "), 1), "\n");
    }

    public static String w(String str) {
        List listS;
        de.i.e(str, "<this>");
        if (h.L("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        c cVar = new c(str);
        if (cVar.hasNext()) {
            Object next = cVar.next();
            if (cVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (cVar.hasNext()) {
                    arrayList.add(cVar.next());
                }
                listS = arrayList;
            } else {
                listS = fa.b.s(next);
            }
        } else {
            listS = pd.p.f10551v;
        }
        int length = str.length();
        listS.size();
        int iA = pd.k.A(listS);
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : listS) {
            int i10 = i + 1;
            String strSubstring = null;
            if (i < 0) {
                pd.k.B();
                throw null;
            }
            String str2 = (String) obj;
            if ((i != 0 && i != iA) || !h.L(str2)) {
                int length2 = str2.length();
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        i11 = -1;
                        break;
                    }
                    if (!com.bumptech.glide.d.B(str2.charAt(i11))) {
                        break;
                    }
                    i11++;
                }
                if (i11 != -1 && p.A(i11, str2, "|", false)) {
                    strSubstring = str2.substring("|".length() + i11);
                    de.i.d(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList2.add(strSubstring);
            }
            i = i10;
        }
        StringBuilder sb2 = new StringBuilder(length);
        pd.j.G(arrayList2, sb2, "\n", "", "", "...", null);
        return sb2.toString();
    }
}
