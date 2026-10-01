package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13526c;

    public u0(long j8, String str, String str2) {
        this.f13524a = str;
        this.f13525b = str2;
        this.f13526c = j8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            u0 u0Var = (u0) ((y1) obj);
            if (this.f13524a.equals(u0Var.f13524a) && this.f13525b.equals(u0Var.f13525b) && this.f13526c == u0Var.f13526c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f13524a.hashCode() ^ 1000003) * 1000003) ^ this.f13525b.hashCode()) * 1000003;
        long j8 = this.f13526c;
        return iHashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f13524a);
        sb2.append(", code=");
        sb2.append(this.f13525b);
        sb2.append(", address=");
        return j4.a.m(sb2, this.f13526c, "}");
    }
}
