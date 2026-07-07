package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13510d;

    public s0(long j8, long j9, String str, String str2) {
        this.f13507a = j8;
        this.f13508b = j9;
        this.f13509c = str;
        this.f13510d = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            s0 s0Var = (s0) ((w1) obj);
            String str2 = s0Var.f13510d;
            if (this.f13507a == s0Var.f13507a && this.f13508b == s0Var.f13508b && this.f13509c.equals(s0Var.f13509c) && ((str = this.f13510d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f13507a;
        long j9 = this.f13508b;
        int iHashCode = (((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ this.f13509c.hashCode()) * 1000003;
        String str = this.f13510d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f13507a);
        sb2.append(", size=");
        sb2.append(this.f13508b);
        sb2.append(", name=");
        sb2.append(this.f13509c);
        sb2.append(", uuid=");
        return j4.a.n(sb2, this.f13510d, "}");
    }
}
