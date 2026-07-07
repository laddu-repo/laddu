package y9;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class i extends d implements SortedMap {
    public final /* synthetic */ w0 A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public SortedSet f14561z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(w0 w0Var, SortedMap sortedMap) {
        super(w0Var, sortedMap);
        this.A = w0Var;
    }

    public SortedSet b() {
        return new j(this.A, d());
    }

    @Override // y9.d, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f14561z;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetB = b();
        this.f14561z = sortedSetB;
        return sortedSetB;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f14537x;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new i(this.A, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new i(this.A, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new i(this.A, d().tailMap(obj));
    }
}
