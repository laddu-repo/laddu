package r1;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: c, reason: collision with root package name */
    public static final String f11395c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f11396d;

    /* renamed from: a, reason: collision with root package name */
    public final e1 f11397a;

    /* renamed from: b, reason: collision with root package name */
    public final db.k0 f11398b;

    static {
        String str = u1.a0.f12750a;
        f11395c = Integer.toString(0, 36);
        f11396d = Integer.toString(1, 36);
    }

    public f1(e1 e1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= e1Var.f11386a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f11397a = e1Var;
        this.f11398b = db.k0.k(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f1.class == obj.getClass()) {
            f1 f1Var = (f1) obj;
            if (this.f11397a.equals(f1Var.f11397a) && this.f11398b.equals(f1Var.f11398b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f11398b.hashCode() * 31) + this.f11397a.hashCode();
    }
}
