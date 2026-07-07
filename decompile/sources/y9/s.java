package y9;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Map.Entry {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f14610v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14611w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ t f14612x;

    public s(t tVar, int i) {
        this.f14612x = tVar;
        Object obj = t.E;
        this.f14610v = tVar.i()[i];
        this.f14611w = i;
    }

    public final void a() {
        int i = this.f14611w;
        Object obj = this.f14610v;
        t tVar = this.f14612x;
        if (i != -1 && i < tVar.size()) {
            if (Objects.equals(obj, tVar.i()[this.f14611w])) {
                return;
            }
        }
        Object obj2 = t.E;
        this.f14611w = tVar.d(obj);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Objects.equals(getKey(), entry.getKey()) && Objects.equals(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f14610v;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        t tVar = this.f14612x;
        Map mapB = tVar.b();
        if (mapB != null) {
            return mapB.get(this.f14610v);
        }
        a();
        int i = this.f14611w;
        if (i == -1) {
            return null;
        }
        return tVar.j()[i];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        t tVar = this.f14612x;
        Map mapB = tVar.b();
        Object obj2 = this.f14610v;
        if (mapB != null) {
            return mapB.put(obj2, obj);
        }
        a();
        int i = this.f14611w;
        if (i == -1) {
            tVar.put(obj2, obj);
            return null;
        }
        Object obj3 = tVar.j()[i];
        tVar.j()[this.f14611w] = obj;
        return obj3;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
