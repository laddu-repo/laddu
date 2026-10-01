package fa;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5324c;

    public a(long j8, long j9, long j10) {
        this.f5322a = j8;
        this.f5323b = j9;
        this.f5324c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f5322a == aVar.f5322a && this.f5323b == aVar.f5323b && this.f5324c == aVar.f5324c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f5322a;
        long j9 = this.f5323b;
        int i = (((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f5324c;
        return i ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f5322a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f5323b);
        sb2.append(", uptimeMillis=");
        return j4.a.m(sb2, this.f5324c, "}");
    }
}
