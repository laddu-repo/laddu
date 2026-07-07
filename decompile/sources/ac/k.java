package ac;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f418c;

    public k(j jVar, j jVar2, double d10) {
        this.f416a = jVar;
        this.f417b = jVar2;
        this.f418c = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f416a == kVar.f416a && this.f417b == kVar.f417b && Double.compare(this.f418c, kVar.f418c) == 0;
    }

    public final int hashCode() {
        int iHashCode = (this.f417b.hashCode() + (this.f416a.hashCode() * 31)) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f418c);
        return iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f416a + ", crashlytics=" + this.f417b + ", sessionSamplingRate=" + this.f418c + ')';
    }
}
