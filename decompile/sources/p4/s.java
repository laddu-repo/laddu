package p4;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f10354a;

    public s(int i) {
        switch (i) {
            case 1:
                this.f10354a = new LinkedHashMap();
                break;
            default:
                this.f10354a = new LinkedHashMap();
                break;
        }
    }

    public void a(w2.k kVar) {
        long[] jArr = kVar.f13833e;
        if (jArr.length > 0) {
            Long lValueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.f10354a;
            if (linkedHashMap.containsKey(lValueOf)) {
                return;
            }
            linkedHashMap.put(Long.valueOf(kVar.f13833e[0]), kVar);
        }
    }

    public void b(bd.a aVar) {
        de.i.e(aVar, "migration");
        int i = aVar.f1610a;
        int i10 = aVar.f1611b;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.f10354a;
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(i10))) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i10)) + " with " + aVar);
        }
        treeMap2.put(Integer.valueOf(i10), aVar);
    }
}
