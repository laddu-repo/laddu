package he;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements Comparable {

    /* renamed from: y, reason: collision with root package name */
    public static final e f6071y = new e();

    /* renamed from: x, reason: collision with root package name */
    public final int f6072x = 131605;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e other = (e) obj;
        kotlin.jvm.internal.k.e(other, "other");
        return this.f6072x - other.f6072x;
    }

    public final boolean equals(Object obj) {
        e eVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            eVar = (e) obj;
        } else {
            eVar = null;
        }
        if (eVar != null && this.f6072x == eVar.f6072x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6072x;
    }

    public final String toString() {
        return "2.2.21";
    }
}
