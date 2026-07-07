package y9;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends y0 implements Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final y0 f14560v;

    public h1(y0 y0Var) {
        this.f14560v = y0Var;
    }

    @Override // y9.y0
    public final y0 a() {
        return this.f14560v;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f14560v.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            return this.f14560v.equals(((h1) obj).f14560v);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f14560v.hashCode();
    }

    public final String toString() {
        return this.f14560v + ".reverse()";
    }
}
