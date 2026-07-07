package ie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class w extends a8.i {
    public static Map A(Map map, he.i iVar) {
        kotlin.jvm.internal.k.e(map, "<this>");
        if (map.isEmpty()) {
            return x(iVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(iVar.f6076x, iVar.f6077y);
        return linkedHashMap;
    }

    public static final void B(HashMap hashMap, he.i[] iVarArr) {
        for (he.i iVar : iVarArr) {
            hashMap.put(iVar.f6076x, iVar.f6077y);
        }
    }

    public static Map C(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(w(arrayList.size()));
                int size2 = arrayList.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    he.i iVar = (he.i) obj;
                    linkedHashMap.put(iVar.f6076x, iVar.f6077y);
                }
                return linkedHashMap;
            }
            return x((he.i) arrayList.get(0));
        }
        return s.f6847x;
    }

    public static Map D(Map map) {
        kotlin.jvm.internal.k.e(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return E(map);
            }
            return F(map);
        }
        return s.f6847x;
    }

    public static LinkedHashMap E(Map map) {
        kotlin.jvm.internal.k.e(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static final Map F(Map map) {
        kotlin.jvm.internal.k.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.k.d(singletonMap, "with(...)");
        return singletonMap;
    }

    public static Object u(Object obj, Map map) {
        kotlin.jvm.internal.k.e(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            throw new NoSuchElementException("Key " + obj + " is missing in the map.");
        }
        return obj2;
    }

    public static HashMap v(he.i... iVarArr) {
        HashMap hashMap = new HashMap(w(iVarArr.length));
        B(hashMap, iVarArr);
        return hashMap;
    }

    public static int w(int i6) {
        if (i6 < 0) {
            return i6;
        }
        if (i6 < 3) {
            return i6 + 1;
        }
        if (i6 < 1073741824) {
            return (int) ((i6 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map x(he.i pair) {
        kotlin.jvm.internal.k.e(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.f6076x, pair.f6077y);
        kotlin.jvm.internal.k.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static Map y(he.i... iVarArr) {
        if (iVarArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(w(iVarArr.length));
            B(linkedHashMap, iVarArr);
            return linkedHashMap;
        }
        return s.f6847x;
    }

    public static LinkedHashMap z(he.i... iVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(w(iVarArr.length));
        B(linkedHashMap, iVarArr);
        return linkedHashMap;
    }
}
