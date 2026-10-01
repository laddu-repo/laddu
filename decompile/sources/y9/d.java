package y9;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class d extends AbstractMap {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public transient b f14535v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public transient m f14536w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final transient Map f14537x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ w0 f14538y;

    public d(w0 w0Var, Map map) {
        this.f14538y = w0Var;
        this.f14537x = map;
    }

    public final AbstractMap.SimpleImmutableEntry a(Map.Entry entry) {
        Object key = entry.getKey();
        List list = (List) ((Collection) entry.getValue());
        boolean z2 = list instanceof RandomAccess;
        w0 w0Var = this.f14538y;
        return new AbstractMap.SimpleImmutableEntry(key, z2 ? new h(w0Var, key, list, null) : new l(w0Var, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        w0 w0Var = this.f14538y;
        if (this.f14537x == w0Var.f14625y) {
            w0Var.b();
            return;
        }
        c cVar = new c(this);
        while (cVar.hasNext()) {
            cVar.next();
            cVar.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f14537x;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        b bVar = this.f14535v;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f14535v = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f14537x.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f14537x;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        List list = (List) collection;
        boolean z2 = list instanceof RandomAccess;
        w0 w0Var = this.f14538y;
        return z2 ? new h(w0Var, obj, list, null) : new l(w0Var, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f14537x.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        w0 w0Var = this.f14538y;
        Set set = w0Var.f14588v;
        if (set != null) {
            return set;
        }
        Map map = w0Var.f14625y;
        Set gVar = map instanceof NavigableMap ? new g(w0Var, (NavigableMap) map) : map instanceof SortedMap ? new j(w0Var, (SortedMap) map) : new e(w0Var, map);
        w0Var.f14588v = gVar;
        return gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f14537x.remove(obj);
        if (collection == null) {
            return null;
        }
        w0 w0Var = this.f14538y;
        Collection collectionC = w0Var.c();
        collectionC.addAll(collection);
        w0Var.f14626z -= collection.size();
        collection.clear();
        return collectionC;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f14537x.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f14537x.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        m mVar = this.f14536w;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(this);
        this.f14536w = mVar2;
        return mVar2;
    }
}
