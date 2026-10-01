package y9;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u extends y0 implements Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c4.d f14622v;

    public u(c4.d dVar) {
        this.f14622v = dVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f14622v.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            return this.f14622v.equals(((u) obj).f14622v);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14622v.hashCode();
    }

    public final String toString() {
        return this.f14622v.toString();
    }
}
