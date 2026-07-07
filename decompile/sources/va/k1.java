package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f13416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1 f13417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1 f13418c;

    public k1(l1 l1Var, n1 n1Var, m1 m1Var) {
        this.f13416a = l1Var;
        this.f13417b = n1Var;
        this.f13418c = m1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            if (this.f13416a.equals(k1Var.f13416a) && this.f13417b.equals(k1Var.f13417b) && this.f13418c.equals(k1Var.f13418c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f13416a.hashCode() ^ 1000003) * 1000003) ^ this.f13417b.hashCode()) * 1000003) ^ this.f13418c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f13416a + ", osData=" + this.f13417b + ", deviceData=" + this.f13418c + "}";
    }
}
