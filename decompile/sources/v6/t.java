package v6;

import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public static final t f13431b = new t(ie.s.f6847x);

    /* renamed from: a, reason: collision with root package name */
    public final Map f13432a;

    public t(Map map) {
        this.f13432a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            if (kotlin.jvm.internal.k.a(this.f13432a, ((t) obj).f13432a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13432a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.f13432a + ')';
    }
}
