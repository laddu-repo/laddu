package pd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import p4.v;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class s extends v {
    public static Object Q(Map map, Object obj) {
        de.i.e(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int R(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map S(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return q.f10552v;
        }
        if (size == 1) {
            od.f fVar = (od.f) arrayList.get(0);
            de.i.e(fVar, "pair");
            Map mapSingletonMap = Collections.singletonMap(fVar.f10116v, fVar.f10117w);
            de.i.d(mapSingletonMap, "singletonMap(...)");
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(R(arrayList.size()));
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            od.f fVar2 = (od.f) obj;
            linkedHashMap.put(fVar2.f10116v, fVar2.f10117w);
        }
        return linkedHashMap;
    }

    public static Map T(Map map) {
        de.i.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return q.f10552v;
        }
        if (size != 1) {
            return U(map);
        }
        de.i.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        de.i.d(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static LinkedHashMap U(Map map) {
        de.i.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
