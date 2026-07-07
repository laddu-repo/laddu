package y1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import y9.j1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n extends y9.p implements Map {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Map f14390w;

    public n(Map map) {
        this.f14390w = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f14390w.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f14390w.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((j1) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return y9.p.j(this.f14390w.entrySet(), new m(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && y9.p.h(this, obj);
    }

    @Override // y9.p
    public final Object g() {
        return this.f14390w;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f14390w.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return y9.p.n(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f14390w;
        return map.isEmpty() || (map.size() == 1 && map.containsKey(null));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return y9.p.j(this.f14390w.keySet(), new m(1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f14390w.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f14390w.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f14390w.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f14390w;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f14390w.values();
    }
}
