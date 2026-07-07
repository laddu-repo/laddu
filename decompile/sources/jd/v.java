package jd;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v implements y {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f7410a;

    public v(Throwable error) {
        kotlin.jvm.internal.k.e(error, "error");
        this.f7410a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof v) && kotlin.jvm.internal.k.a(this.f7410a, ((v) obj).f7410a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7410a.hashCode();
    }

    public final String toString() {
        return "Failure(error=" + this.f7410a + ")";
    }
}
