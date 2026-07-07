package kotlin.jvm.internal;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o implements d {

    /* renamed from: x, reason: collision with root package name */
    public final Class f8050x;

    public o(Class jClass) {
        k.e(jClass, "jClass");
        this.f8050x = jClass;
    }

    @Override // kotlin.jvm.internal.d
    public final Class a() {
        return this.f8050x;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            if (k.a(this.f8050x, ((o) obj).f8050x)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8050x.hashCode();
    }

    public final String toString() {
        return this.f8050x.toString() + " (Kotlin reflection is not available)";
    }
}
