package r1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static final j f11518c = new j(new Object());

    /* renamed from: d, reason: collision with root package name */
    public static final String f11519d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f11520e;

    /* renamed from: a, reason: collision with root package name */
    public final int f11521a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f11522b = 0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, r1.m1] */
    static {
        String str = u1.a0.f12750a;
        Integer.toString(0, 36);
        f11519d = Integer.toString(1, 36);
        f11520e = Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public j(m1 m1Var) {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if (this.f11521a == jVar.f11521a && this.f11522b == jVar.f11522b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f11521a) * 31) + this.f11522b) * 31;
    }
}
