package z6;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f14796a;

    public n(l lVar) {
        this.f14796a = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        Object obj2 = x.f14817v;
        if (obj2.equals(obj2)) {
            return this.f14796a.equals(((n) yVar).f14796a);
        }
        return false;
    }

    public final int hashCode() {
        return ((x.f14817v.hashCode() ^ 1000003) * 1000003) ^ this.f14796a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + x.f14817v + ", androidClientInfo=" + this.f14796a + "}";
    }
}
