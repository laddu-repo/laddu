package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Comparable f872v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f873w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w0 f874x;

    public x0(w0 w0Var, Comparable comparable, Object obj) {
        this.f874x = w0Var;
        this.f872v = comparable;
        this.f873w = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f872v.compareTo(((x0) obj).f872v);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f872v;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f873w;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f872v;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f873w;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f872v;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f873w;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f874x.b();
        Object obj2 = this.f873w;
        this.f873w = obj;
        return obj2;
    }

    public final String toString() {
        return this.f872v + "=" + this.f873w;
    }
}
