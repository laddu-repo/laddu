package t2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f12498a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12499b;

    public a(long j, long j10) {
        this.f12498a = j;
        this.f12499b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f12498a == aVar.f12498a && this.f12499b == aVar.f12499b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f12498a) * 31) + ((int) this.f12499b);
    }
}
