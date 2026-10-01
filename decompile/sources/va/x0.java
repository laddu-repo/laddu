package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13549e;

    public x0(long j8, String str, String str2, long j9, int i) {
        this.f13545a = j8;
        this.f13546b = str;
        this.f13547c = str2;
        this.f13548d = j9;
        this.f13549e = i;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof z1) {
            x0 x0Var = (x0) ((z1) obj);
            String str2 = x0Var.f13547c;
            if (this.f13545a == x0Var.f13545a && this.f13546b.equals(x0Var.f13546b) && ((str = this.f13547c) != null ? str.equals(str2) : str2 == null) && this.f13548d == x0Var.f13548d && this.f13549e == x0Var.f13549e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f13545a;
        int iHashCode = (((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f13546b.hashCode()) * 1000003;
        String str = this.f13547c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j9 = this.f13548d;
        return ((iHashCode2 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ this.f13549e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f13545a);
        sb2.append(", symbol=");
        sb2.append(this.f13546b);
        sb2.append(", file=");
        sb2.append(this.f13547c);
        sb2.append(", offset=");
        sb2.append(this.f13548d);
        sb2.append(", importance=");
        return j4.a.l(this.f13549e, "}", sb2);
    }
}
