package q2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f10941a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10942b;

    public r0(int i6, boolean z10) {
        this.f10941a = i6;
        this.f10942b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && r0.class == obj.getClass()) {
                r0 r0Var = (r0) obj;
                if (this.f10941a == r0Var.f10941a && this.f10942b == r0Var.f10942b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f10941a * 31) + (this.f10942b ? 1 : 0);
    }
}
