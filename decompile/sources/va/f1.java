package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13340b;

    public f1(String str, String str2) {
        this.f13339a = str;
        this.f13340b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g2) {
            f1 f1Var = (f1) ((g2) obj);
            if (this.f13339a.equals(f1Var.f13339a) && this.f13340b.equals(f1Var.f13340b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f13339a.hashCode() ^ 1000003) * 1000003) ^ this.f13340b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f13339a);
        sb2.append(", variantId=");
        return j4.a.n(sb2, this.f13340b, "}");
    }
}
