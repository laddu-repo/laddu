package r1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: b, reason: collision with root package name */
    public static final l1 f11580b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f11581c;

    /* renamed from: a, reason: collision with root package name */
    public final db.k0 f11582a;

    static {
        db.i0 i0Var = db.k0.f4008y;
        f11580b = new l1(db.c1.B);
        String str = u1.a0.f12750a;
        f11581c = Integer.toString(0, 36);
    }

    public l1(db.c1 c1Var) {
        this.f11582a = db.k0.k(c1Var);
    }

    public final boolean a(int i6) {
        int i10 = 0;
        while (true) {
            db.k0 k0Var = this.f11582a;
            if (i10 >= k0Var.size()) {
                return false;
            }
            k1 k1Var = (k1) k0Var.get(i10);
            boolean[] zArr = k1Var.f11574e;
            int length = zArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (zArr[i11]) {
                    if (k1Var.f11571b.f11388c == i6) {
                        return true;
                    }
                } else {
                    i11++;
                }
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l1.class == obj.getClass()) {
            return this.f11582a.equals(((l1) obj).f11582a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11582a.hashCode();
    }
}
