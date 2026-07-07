package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13338b;

    public f0(String str, String str2) {
        this.f13337a = str;
        this.f13338b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            f0 f0Var = (f0) ((q1) obj);
            if (this.f13337a.equals(f0Var.f13337a) && this.f13338b.equals(f0Var.f13338b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f13337a.hashCode() ^ 1000003) * 1000003) ^ this.f13338b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f13337a);
        sb2.append(", value=");
        return j4.a.n(sb2, this.f13338b, "}");
    }
}
