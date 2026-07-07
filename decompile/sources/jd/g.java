package jd;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final int f7380a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7381b;

    public g(int i6, String size) {
        kotlin.jvm.internal.k.e(size, "size");
        this.f7380a = i6;
        this.f7381b = size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f7380a == gVar.f7380a && kotlin.jvm.internal.k.a(this.f7381b, gVar.f7381b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7381b.hashCode() + (this.f7380a * 31);
    }

    public final String toString() {
        return "Progress(progress=" + this.f7380a + ", size=" + this.f7381b + ")";
    }
}
