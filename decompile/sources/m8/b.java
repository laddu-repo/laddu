package m8;

import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f8705a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8706b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f8707c;

    public b(long j, long j10, Set set) {
        this.f8705a = j;
        this.f8706b = j10;
        this.f8707c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f8705a == bVar.f8705a && this.f8706b == bVar.f8706b && this.f8707c.equals(bVar.f8707c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f8705a;
        int i6 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j10 = this.f8706b;
        return this.f8707c.hashCode() ^ ((i6 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f8705a + ", maxAllowedDelay=" + this.f8706b + ", flags=" + this.f8707c + "}";
    }
}
