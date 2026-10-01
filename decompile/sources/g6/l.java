package g6;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5683a;

    public l(String str) {
        this.f5683a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f5683a.equals(((l) obj).f5683a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5683a.hashCode();
    }

    public final String toString() {
        return j4.a.n(new StringBuilder("StringHeaderFactory{value='"), this.f5683a, "'}");
    }
}
