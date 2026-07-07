package jb;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f7320a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7321b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7322c;

    public a(long j, long j10, long j11) {
        this.f7320a = j;
        this.f7321b = j10;
        this.f7322c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f7320a == aVar.f7320a && this.f7321b == aVar.f7321b && this.f7322c == aVar.f7322c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f7320a;
        long j10 = this.f7321b;
        int i6 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f7322c;
        return ((int) (j11 ^ (j11 >>> 32))) ^ i6;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f7320a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f7321b);
        sb2.append(", uptimeMillis=");
        return r4.a.m(sb2, this.f7322c, "}");
    }
}
