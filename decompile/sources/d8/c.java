package d8;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f3972a;

    public c(String str) {
        if (str != null) {
            this.f3972a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f3972a.equals(((c) obj).f3972a);
    }

    public final int hashCode() {
        return this.f3972a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return r4.a.o(new StringBuilder("Encoding{name=\""), this.f3972a, "\"}");
    }
}
