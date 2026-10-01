package v5;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: a, reason: collision with root package name */
    public final f f13328a;

    public m(f fVar) {
        this.f13328a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            return this.f13328a.equals(((m) obj).f13328a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13328a.hashCode() + (m.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f13328a + '}';
    }
}
