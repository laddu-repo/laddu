package qb;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final p f11168a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11169b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11170c;

    public h(int i6, int i10, Class cls) {
        this(p.a(cls), i6, i10);
    }

    public static h a(Class cls) {
        return new h(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f11168a.equals(hVar.f11168a) && this.f11169b == hVar.f11169b && this.f11170c == hVar.f11170c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f11168a.hashCode() ^ 1000003) * 1000003) ^ this.f11169b) * 1000003) ^ this.f11170c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f11168a);
        sb2.append(", type=");
        int i6 = this.f11169b;
        if (i6 == 1) {
            str = "required";
        } else if (i6 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i10 = this.f11170c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(h8.c.i(i10, "Unsupported injection: "));
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return r4.a.o(sb2, str2, "}");
    }

    public h(p pVar, int i6, int i10) {
        this.f11168a = pVar;
        this.f11169b = i6;
        this.f11170c = i10;
    }
}
