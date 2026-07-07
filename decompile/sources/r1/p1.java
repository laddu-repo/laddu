package r1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: d, reason: collision with root package name */
    public static final p1 f11626d = new p1(0, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final String f11627e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f11628f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f11629g;

    /* renamed from: a, reason: collision with root package name */
    public final int f11630a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11631b;

    /* renamed from: c, reason: collision with root package name */
    public final float f11632c;

    static {
        String str = u1.a0.f12750a;
        f11627e = Integer.toString(0, 36);
        f11628f = Integer.toString(1, 36);
        f11629g = Integer.toString(3, 36);
    }

    public p1(int i6, int i10) {
        this(1.0f, i6, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (this.f11630a == p1Var.f11630a && this.f11631b == p1Var.f11631b && this.f11632c == p1Var.f11632c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f11632c) + ((((217 + this.f11630a) * 31) + this.f11631b) * 31);
    }

    public p1(float f3, int i6, int i10) {
        this.f11630a = i6;
        this.f11631b = i10;
        this.f11632c = f3;
    }
}
