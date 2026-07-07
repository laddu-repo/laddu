package w6;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends e9.f {

    /* renamed from: k, reason: collision with root package name */
    public final int f14123k;

    public a(int i6) {
        this.f14123k = i6;
        if (i6 > 0) {
        } else {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            if (this.f14123k == ((a) obj).f14123k) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14123k;
    }

    public final String toString() {
        return String.valueOf(this.f14123k);
    }
}
