package af;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends a {
    public static final c A = new a(1, 0, 1);

    @Override // af.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f709x == cVar.f709x && this.f710y == cVar.f710y) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // af.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f709x * 31) + this.f710y;
    }

    @Override // af.a
    public final boolean isEmpty() {
        if (this.f709x > this.f710y) {
            return true;
        }
        return false;
    }

    @Override // af.a
    public final String toString() {
        return this.f709x + ".." + this.f710y;
    }
}
