package db;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class n0 implements Map, Serializable {

    /* renamed from: x, reason: collision with root package name */
    public transient p0 f4021x;

    /* renamed from: y, reason: collision with root package name */
    public transient p0 f4022y;

    /* renamed from: z, reason: collision with root package name */
    public transient f0 f4023z;

    public static n0 a(Map map) {
        int i6;
        if ((map instanceof n0) && !(map instanceof SortedMap)) {
            return (n0) map;
        }
        Set entrySet = map.entrySet();
        if (r4.a.w(entrySet)) {
            i6 = entrySet.size();
        } else {
            i6 = 4;
        }
        b2.k kVar = new b2.k(i6);
        kVar.x(entrySet);
        return (h1) kVar.c();
    }

    public abstract e1 b();

    public abstract f1 c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract f0 d();

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final p0 keySet() {
        p0 p0Var = this.f4022y;
        if (p0Var == null) {
            f1 c10 = c();
            this.f4022y = c10;
            return c10;
        }
        return p0Var;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        p0 p0Var = this.f4021x;
        if (p0Var == null) {
            e1 b10 = b();
            this.f4021x = b10;
            return b10;
        }
        return p0Var;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return r.h(obj, this);
    }

    @Override // java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public f0 values() {
        f0 f0Var = this.f4023z;
        if (f0Var == null) {
            f0 d10 = d();
            this.f4023z = d10;
            return d10;
        }
        return f0Var;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        p0 p0Var = this.f4021x;
        if (p0Var == null) {
            p0Var = b();
            this.f4021x = p0Var;
        }
        return r.m(p0Var);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        r.e(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }
}
