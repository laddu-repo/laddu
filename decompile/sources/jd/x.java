package jd;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x implements y {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7412a;

    public x(Object obj) {
        this.f7412a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x) && kotlin.jvm.internal.k.a(this.f7412a, ((x) obj).f7412a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f7412a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(data=" + this.f7412a + ")";
    }
}
