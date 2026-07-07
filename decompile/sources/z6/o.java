package z6;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f14797a;

    public o(r rVar) {
        z zVar = z.f14819v;
        this.f14797a = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        if (!this.f14797a.equals(((o) ((a0) obj)).f14797a)) {
            return false;
        }
        Object obj2 = z.f14819v;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.f14797a.hashCode() ^ 1000003) * 1000003) ^ z.f14819v.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f14797a + ", productIdOrigin=" + z.f14819v + "}";
    }
}
