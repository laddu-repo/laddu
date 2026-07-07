package he;

import java.io.Serializable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    public final Throwable f6078x;

    public j(Throwable exception) {
        kotlin.jvm.internal.k.e(exception, "exception");
        this.f6078x = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (kotlin.jvm.internal.k.a(this.f6078x, ((j) obj).f6078x)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6078x.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f6078x + ')';
    }
}
