package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d2 f13477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e2 f13478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f2 f13479e;
    public final i2 f;

    public p0(long j8, String str, d2 d2Var, e2 e2Var, f2 f2Var, i2 i2Var) {
        this.f13475a = j8;
        this.f13476b = str;
        this.f13477c = d2Var;
        this.f13478d = e2Var;
        this.f13479e = f2Var;
        this.f = i2Var;
    }

    public final o0 a() {
        o0 o0Var = new o0();
        o0Var.f13465a = this.f13475a;
        o0Var.f13466b = this.f13476b;
        o0Var.f13467c = this.f13477c;
        o0Var.f13468d = this.f13478d;
        o0Var.f13469e = this.f13479e;
        o0Var.f = this.f;
        o0Var.f13470g = (byte) 1;
        return o0Var;
    }

    public final boolean equals(Object obj) {
        f2 f2Var;
        i2 i2Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2) {
            p0 p0Var = (p0) ((j2) obj);
            i2 i2Var2 = p0Var.f;
            f2 f2Var2 = p0Var.f13479e;
            if (this.f13475a == p0Var.f13475a && this.f13476b.equals(p0Var.f13476b) && this.f13477c.equals(p0Var.f13477c) && this.f13478d.equals(p0Var.f13478d) && ((f2Var = this.f13479e) != null ? f2Var.equals(f2Var2) : f2Var2 == null) && ((i2Var = this.f) != null ? i2Var.equals(i2Var2) : i2Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f13475a;
        int iHashCode = (((((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f13476b.hashCode()) * 1000003) ^ this.f13477c.hashCode()) * 1000003) ^ this.f13478d.hashCode()) * 1000003;
        f2 f2Var = this.f13479e;
        int iHashCode2 = (iHashCode ^ (f2Var == null ? 0 : f2Var.hashCode())) * 1000003;
        i2 i2Var = this.f;
        return iHashCode2 ^ (i2Var != null ? i2Var.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f13475a + ", type=" + this.f13476b + ", app=" + this.f13477c + ", device=" + this.f13478d + ", log=" + this.f13479e + ", rollouts=" + this.f + "}";
    }
}
