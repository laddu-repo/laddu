package a2;

import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b2 {

    /* renamed from: b, reason: collision with root package name */
    public static final b2 f168b;

    /* renamed from: a, reason: collision with root package name */
    public final db.p0 f169a;

    static {
        a2 a2Var = new a2(0);
        a2Var.f162y = db.p0.j(2, 1, 5);
        f168b = new b2(a2Var);
    }

    public b2(a2 a2Var) {
        this.f169a = (db.p0) a2Var.f162y;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof b2) && this.f169a.equals(((b2) obj).f169a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f169a, null, null, bool, bool, bool, bool);
    }
}
