package qd;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Map.Entry, ee.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f f10999v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f11000w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f11001x;

    public e(f fVar, int i) {
        de.i.e(fVar, "map");
        this.f10999v = fVar;
        this.f11000w = i;
        this.f11001x = fVar.C;
    }

    public final void a() {
        if (this.f10999v.C != this.f11001x) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return de.i.a(entry.getKey(), getKey()) && de.i.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f10999v.f11002v[this.f11000w];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f10999v.f11003w;
        de.i.b(objArr);
        return objArr[this.f11000w];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        f fVar = this.f10999v;
        fVar.c();
        Object[] objArr = fVar.f11003w;
        if (objArr == null) {
            int length = fVar.f11002v.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            fVar.f11003w = objArr;
        }
        int i = this.f11000w;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
