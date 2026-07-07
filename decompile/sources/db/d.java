package db;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class d extends AbstractMap {
    public final /* synthetic */ y0 A;

    /* renamed from: x, reason: collision with root package name */
    public transient b f3989x;

    /* renamed from: y, reason: collision with root package name */
    public transient n f3990y;

    /* renamed from: z, reason: collision with root package name */
    public final transient Map f3991z;

    public d(y0 y0Var, Map map) {
        this.A = y0Var;
        this.f3991z = map;
    }

    public final g0 a(Map.Entry entry) {
        l lVar;
        Object key = entry.getKey();
        List list = (List) ((Collection) entry.getValue());
        boolean z10 = list instanceof RandomAccess;
        y0 y0Var = this.A;
        if (z10) {
            lVar = new l(y0Var, key, list, null);
        } else {
            lVar = new l(y0Var, key, list, null);
        }
        return new g0(key, lVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        y0 y0Var = this.A;
        if (this.f3991z == y0Var.A) {
            y0Var.c();
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
        Map map = this.f3991z;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        b bVar = this.f3989x;
        if (bVar == null) {
            b bVar2 = new b(this);
            this.f3989x = bVar2;
            return bVar2;
        }
        return bVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj && !this.f3991z.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        l lVar;
        Map map = this.f3991z;
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
        boolean z10 = list instanceof RandomAccess;
        y0 y0Var = this.A;
        if (z10) {
            lVar = new l(y0Var, obj, list, null);
        } else {
            lVar = new l(y0Var, obj, list, null);
        }
        return lVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f3991z.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set eVar;
        y0 y0Var = this.A;
        Set set = y0Var.f4024x;
        if (set == null) {
            Map map = y0Var.A;
            if (map instanceof NavigableMap) {
                eVar = new g(y0Var, (NavigableMap) map);
            } else if (map instanceof SortedMap) {
                eVar = new j(y0Var, (SortedMap) map);
            } else {
                eVar = new e(y0Var, map);
            }
            y0Var.f4024x = eVar;
            return eVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f3991z.remove(obj);
        if (collection == null) {
            return null;
        }
        y0 y0Var = this.A;
        Collection d10 = y0Var.d();
        d10.addAll(collection);
        y0Var.B -= collection.size();
        collection.clear();
        return d10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f3991z.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f3991z.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        n nVar = this.f3990y;
        if (nVar == null) {
            n nVar2 = new n(this);
            this.f3990y = nVar2;
            return nVar2;
        }
        return nVar;
    }
}
