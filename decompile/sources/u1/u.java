package u1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: c, reason: collision with root package name */
    public static final u f12814c = new u(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f12815a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12816b;

    static {
        new u(0, 0);
    }

    public u(int i6, int i10) {
        boolean z10;
        if ((i6 != -1 && i6 < 0) || (i10 != -1 && i10 < 0)) {
            z10 = false;
        } else {
            z10 = true;
        }
        c.b(z10);
        this.f12815a = i6;
        this.f12816b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f12815a == uVar.f12815a && this.f12816b == uVar.f12816b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6 = this.f12815a;
        return ((i6 >>> 16) | (i6 << 16)) ^ this.f12816b;
    }

    public final String toString() {
        return this.f12815a + "x" + this.f12816b;
    }
}
