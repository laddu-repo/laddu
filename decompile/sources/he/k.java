package he;

import java.io.Serializable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    public final Object f6079x;

    public static final Throwable a(Object obj) {
        if (obj instanceof j) {
            return ((j) obj).f6078x;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (!kotlin.jvm.internal.k.a(this.f6079x, ((k) obj).f6079x)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f6079x;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f6079x;
        if (obj instanceof j) {
            return ((j) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
