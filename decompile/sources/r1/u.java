package r1;

import android.net.Uri;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public static final String f11711b;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f11712a;

    static {
        String str = u1.a0.f12750a;
        f11711b = Integer.toString(0, 36);
    }

    public u(p0 p0Var) {
        this.f11712a = (Uri) p0Var.f11625a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof u) && this.f11712a.equals(((u) obj).f11712a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11712a.hashCode() * 31;
    }
}
