package z6;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f14815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f14816b;

    public v(h0 h0Var, g0 g0Var) {
        this.f14815a = h0Var;
        this.f14816b = g0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            h0 h0Var = this.f14815a;
            if (h0Var != null ? h0Var.equals(((v) i0Var).f14815a) : ((v) i0Var).f14815a == null) {
                g0 g0Var = this.f14816b;
                if (g0Var != null ? g0Var.equals(((v) i0Var).f14816b) : ((v) i0Var).f14816b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        h0 h0Var = this.f14815a;
        int iHashCode = ((h0Var == null ? 0 : h0Var.hashCode()) ^ 1000003) * 1000003;
        g0 g0Var = this.f14816b;
        return (g0Var != null ? g0Var.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f14815a + ", mobileSubtype=" + this.f14816b + "}";
    }
}
