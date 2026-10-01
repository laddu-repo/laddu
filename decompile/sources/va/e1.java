package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f13330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13333d;

    public e1(f1 f1Var, String str, String str2, long j8) {
        this.f13330a = f1Var;
        this.f13331b = str;
        this.f13332c = str2;
        this.f13333d = j8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2) {
            e1 e1Var = (e1) ((h2) obj);
            if (this.f13330a.equals(e1Var.f13330a) && this.f13331b.equals(e1Var.f13331b) && this.f13332c.equals(e1Var.f13332c) && this.f13333d == e1Var.f13333d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f13330a.hashCode() ^ 1000003) * 1000003) ^ this.f13331b.hashCode()) * 1000003) ^ this.f13332c.hashCode()) * 1000003;
        long j8 = this.f13333d;
        return iHashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f13330a);
        sb2.append(", parameterKey=");
        sb2.append(this.f13331b);
        sb2.append(", parameterValue=");
        sb2.append(this.f13332c);
        sb2.append(", templateVersion=");
        return j4.a.m(sb2, this.f13333d, "}");
    }
}
