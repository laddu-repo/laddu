package r1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: d, reason: collision with root package name */
    public static final h1 f11487d = new h1(new g1());

    /* renamed from: e, reason: collision with root package name */
    public static final String f11488e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f11489f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f11490g;

    /* renamed from: a, reason: collision with root package name */
    public final int f11491a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11492b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11493c;

    static {
        String str = u1.a0.f12750a;
        f11488e = Integer.toString(1, 36);
        f11489f = Integer.toString(2, 36);
        f11490g = Integer.toString(3, 36);
    }

    public h1(g1 g1Var) {
        this.f11491a = g1Var.f11428a;
        this.f11492b = g1Var.f11429b;
        this.f11493c = g1Var.f11430c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h1.class == obj.getClass()) {
            h1 h1Var = (h1) obj;
            if (this.f11491a == h1Var.f11491a && this.f11492b == h1Var.f11492b && this.f11493c == h1Var.f11493c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f11491a + 31) * 31) + (this.f11492b ? 1 : 0)) * 31) + (this.f11493c ? 1 : 0);
    }
}
