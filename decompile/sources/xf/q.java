package xf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q extends a0 {

    /* renamed from: x, reason: collision with root package name */
    public final boolean f14743x;

    /* renamed from: y, reason: collision with root package name */
    public final String f14744y;

    public q(String body, boolean z10) {
        kotlin.jvm.internal.k.e(body, "body");
        this.f14743x = z10;
        this.f14744y = body.toString();
    }

    @Override // xf.a0
    public final String a() {
        return this.f14744y;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && q.class == obj.getClass()) {
                q qVar = (q) obj;
                if (this.f14743x == qVar.f14743x && kotlin.jvm.internal.k.a(this.f14744y, qVar.f14744y)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i6;
        if (this.f14743x) {
            i6 = 1231;
        } else {
            i6 = 1237;
        }
        return this.f14744y.hashCode() + (i6 * 31);
    }

    @Override // xf.a0
    public final String toString() {
        boolean z10 = this.f14743x;
        String str = this.f14744y;
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            yf.w.a(sb2, str);
            return sb2.toString();
        }
        return str;
    }
}
