package cb;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends g {

    /* renamed from: x, reason: collision with root package name */
    public final Object f2008x;

    public j(Object obj) {
        this.f2008x = obj;
    }

    @Override // cb.g
    public final Object a() {
        return this.f2008x;
    }

    @Override // cb.g
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f2008x.equals(((j) obj).f2008x);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2008x.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f2008x + ")";
    }
}
