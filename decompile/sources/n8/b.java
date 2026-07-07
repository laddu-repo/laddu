package n8;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f9136a;

    /* renamed from: b, reason: collision with root package name */
    public final g8.i f9137b;

    /* renamed from: c, reason: collision with root package name */
    public final g8.h f9138c;

    public b(long j, g8.i iVar, g8.h hVar) {
        this.f9136a = j;
        this.f9137b = iVar;
        this.f9138c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f9136a == bVar.f9136a && this.f9137b.equals(bVar.f9137b) && this.f9138c.equals(bVar.f9138c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f9136a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f9137b.hashCode()) * 1000003) ^ this.f9138c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f9136a + ", transportContext=" + this.f9137b + ", event=" + this.f9138c + "}";
    }
}
