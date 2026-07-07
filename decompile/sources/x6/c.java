package x6;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14247a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f14247a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f14247a.equals(((c) obj).f14247a);
    }

    public final int hashCode() {
        return this.f14247a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return j4.a.n(new StringBuilder("Encoding{name=\""), this.f14247a, "\"}");
    }
}
