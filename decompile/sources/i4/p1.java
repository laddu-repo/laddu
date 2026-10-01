package i4;

import java.util.HashSet;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: b, reason: collision with root package name */
    public static final String f6500b;

    /* renamed from: a, reason: collision with root package name */
    public final db.p0 f6501a;

    static {
        new p1(new HashSet());
        String str = u1.a0.f12750a;
        f6500b = Integer.toString(0, 36);
    }

    public p1(HashSet hashSet) {
        this.f6501a = db.p0.k(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        return this.f6501a.equals(((p1) obj).f6501a);
    }

    public final int hashCode() {
        return Objects.hash(this.f6501a);
    }
}
