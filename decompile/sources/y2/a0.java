package y2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f14849c = new a0(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f14850a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14851b;

    public a0(long j, long j10) {
        this.f14850a = j;
        this.f14851b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0.class == obj.getClass()) {
            a0 a0Var = (a0) obj;
            if (this.f14850a == a0Var.f14850a && this.f14851b == a0Var.f14851b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f14850a) * 31) + ((int) this.f14851b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f14850a);
        sb2.append(", position=");
        return r4.a.m(sb2, this.f14851b, "]");
    }
}
