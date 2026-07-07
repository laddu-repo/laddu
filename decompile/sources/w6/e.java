package w6;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final h f14129a;

    public e(h hVar) {
        this.f14129a = hVar;
    }

    @Override // w6.i
    public final Object a(l6.h hVar) {
        return this.f14129a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            if (kotlin.jvm.internal.k.a(this.f14129a, ((e) obj).f14129a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14129a.hashCode();
    }
}
