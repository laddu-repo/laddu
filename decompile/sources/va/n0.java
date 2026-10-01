package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13456e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13458h;
    public final String i;

    public n0(int i, String str, int i10, long j8, long j9, boolean z2, int i11, String str2, String str3) {
        this.f13452a = i;
        this.f13453b = str;
        this.f13454c = i10;
        this.f13455d = j8;
        this.f13456e = j9;
        this.f = z2;
        this.f13457g = i11;
        this.f13458h = str2;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            n0 n0Var = (n0) ((v1) obj);
            if (this.f13452a == n0Var.f13452a && this.f13453b.equals(n0Var.f13453b) && this.f13454c == n0Var.f13454c && this.f13455d == n0Var.f13455d && this.f13456e == n0Var.f13456e && this.f == n0Var.f && this.f13457g == n0Var.f13457g && this.f13458h.equals(n0Var.f13458h) && this.i.equals(n0Var.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f13452a ^ 1000003) * 1000003) ^ this.f13453b.hashCode()) * 1000003) ^ this.f13454c) * 1000003;
        long j8 = this.f13455d;
        int i = (iHashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f13456e;
        return ((((((((i ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.f13457g) * 1000003) ^ this.f13458h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f13452a);
        sb2.append(", model=");
        sb2.append(this.f13453b);
        sb2.append(", cores=");
        sb2.append(this.f13454c);
        sb2.append(", ram=");
        sb2.append(this.f13455d);
        sb2.append(", diskSpace=");
        sb2.append(this.f13456e);
        sb2.append(", simulator=");
        sb2.append(this.f);
        sb2.append(", state=");
        sb2.append(this.f13457g);
        sb2.append(", manufacturer=");
        sb2.append(this.f13458h);
        sb2.append(", modelClass=");
        return j4.a.n(sb2, this.i, "}");
    }
}
