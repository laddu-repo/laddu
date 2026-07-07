package ef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Iterable, ee.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final q f5026w = new q(new String[0]);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String[] f5027v;

    public q(String[] strArr) {
        de.i.e(strArr, "namesAndValues");
        this.f5027v = strArr;
    }

    public static final q d(HashMap map) {
        String[] strArr = new String[map.size() * 2];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String string = ke.h.U(str).toString();
            String string2 = ke.h.U(str2).toString();
            b8.h.x(string);
            b8.h.y(string2, string);
            strArr[i] = string;
            strArr[i + 1] = string2;
            i += 2;
        }
        return new q(strArr);
    }

    public final String a(String str) {
        String[] strArr = this.f5027v;
        de.i.e(strArr, "namesAndValues");
        int length = strArr.length - 2;
        int iU = android.support.v4.media.session.b.u(length, 0, -2);
        if (iU > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iU) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String b(int i) {
        String str = (String) pd.i.f0(i * 2, this.f5027v);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    public final p c() {
        p pVar = new p(0);
        ArrayList arrayList = pVar.f5025a;
        de.i.e(arrayList, "<this>");
        String[] strArr = this.f5027v;
        de.i.e(strArr, "elements");
        arrayList.addAll(pd.i.W(strArr));
        return pVar;
    }

    public final TreeMap e() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        de.i.d(comparator, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(comparator);
        int size = size();
        for (int i = 0; i < size; i++) {
            String strB = b(i);
            Locale locale = Locale.US;
            de.i.d(locale, "US");
            String lowerCase = strB.toLowerCase(locale);
            de.i.d(lowerCase, "toLowerCase(...)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(f(i));
        }
        return treeMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return Arrays.equals(this.f5027v, ((q) obj).f5027v);
        }
        return false;
    }

    public final String f(int i) {
        String str = (String) pd.i.f0((i * 2) + 1, this.f5027v);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5027v);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        od.f[] fVarArr = new od.f[size];
        for (int i = 0; i < size; i++) {
            fVarArr[i] = new od.f(b(i), f(i));
        }
        return new de.b(fVarArr);
    }

    public final int size() {
        return this.f5027v.length / 2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strB = b(i);
            String strF = f(i);
            sb2.append(strB);
            sb2.append(": ");
            if (ff.d.j(strB)) {
                strF = "██";
            }
            sb2.append(strF);
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
