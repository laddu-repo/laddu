package nd;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f9720a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9721b;

    public w(String title, boolean z10) {
        kotlin.jvm.internal.k.e(title, "title");
        this.f9720a = title;
        this.f9721b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (kotlin.jvm.internal.k.a(this.f9720a, wVar.f9720a) && this.f9721b == wVar.f9721b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int hashCode = this.f9720a.hashCode() * 31;
        if (this.f9721b) {
            i6 = 1231;
        } else {
            i6 = 1237;
        }
        return hashCode + i6;
    }

    public final String toString() {
        return "InlineCategoryItem(title=" + this.f9720a + ", isSelected=" + this.f9721b + ")";
    }
}
