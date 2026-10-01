package e2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final long f4268a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4269b;

    public q(long j, long j10) {
        this.f4268a = j;
        this.f4269b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f4268a == qVar.f4268a && this.f4269b == qVar.f4269b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f4268a) * 31) + ((int) this.f4269b);
    }
}
