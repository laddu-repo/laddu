package h4;

import va.t1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g extends t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f6141a;

    public g(b bVar) {
        de.i.e(bVar, "latestEvent");
        this.f6141a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && g.class == obj.getClass() && de.i.a(this.f6141a, ((g) obj).f6141a);
    }

    public final int hashCode() {
        return this.f6141a.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.f6141a + ", direction=-1)";
    }
}
