package cc;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2019a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2020b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2021c;

    public a(String str, long j, long j10) {
        this.f2019a = str;
        this.f2020b = j;
        this.f2021c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f2019a.equals(aVar.f2019a) && this.f2020b == aVar.f2020b && this.f2021c == aVar.f2021c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f2019a.hashCode() ^ 1000003) * 1000003;
        long j = this.f2020b;
        long j10 = this.f2021c;
        return ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f2019a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f2020b);
        sb2.append(", tokenCreationTimestamp=");
        return r4.a.m(sb2, this.f2021c, "}");
    }
}
