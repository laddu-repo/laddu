package jf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final n f7475b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f7476a;

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            if (!kotlin.jvm.internal.k.a(this.f7476a, ((o) obj).f7476a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f7476a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f7476a;
        if (obj instanceof m) {
            return ((m) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
