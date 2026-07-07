package a2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: c, reason: collision with root package name */
    public static final y1 f503c = new y1(0, false);

    /* renamed from: a, reason: collision with root package name */
    public final int f504a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f505b;

    public y1(int i6, boolean z10) {
        this.f504a = i6;
        this.f505b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y1.class == obj.getClass()) {
            y1 y1Var = (y1) obj;
            if (this.f504a == y1Var.f504a && this.f505b == y1Var.f505b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f504a << 1) + (this.f505b ? 1 : 0);
    }
}
