package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f13284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13288e;
    public final long f;

    public b1(Double d10, int i, boolean z2, int i10, long j8, long j9) {
        this.f13284a = d10;
        this.f13285b = i;
        this.f13286c = z2;
        this.f13287d = i10;
        this.f13288e = j8;
        this.f = j9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e2) {
            e2 e2Var = (e2) obj;
            Double d10 = this.f13284a;
            if (d10 != null ? d10.equals(((b1) e2Var).f13284a) : ((b1) e2Var).f13284a == null) {
                b1 b1Var = (b1) e2Var;
                if (this.f13285b == b1Var.f13285b && this.f13286c == b1Var.f13286c && this.f13287d == b1Var.f13287d && this.f13288e == b1Var.f13288e && this.f == b1Var.f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d10 = this.f13284a;
        int iHashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f13285b) * 1000003) ^ (this.f13286c ? 1231 : 1237)) * 1000003) ^ this.f13287d) * 1000003;
        long j8 = this.f13288e;
        long j9 = this.f;
        return ((iHashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f13284a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f13285b);
        sb2.append(", proximityOn=");
        sb2.append(this.f13286c);
        sb2.append(", orientation=");
        sb2.append(this.f13287d);
        sb2.append(", ramUsed=");
        sb2.append(this.f13288e);
        sb2.append(", diskUsed=");
        return j4.a.m(sb2, this.f, "}");
    }
}
