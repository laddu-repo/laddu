package y2;

import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f14970a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f14971b;

    public y(a0 a0Var, a0 a0Var2) {
        this.f14970a = a0Var;
        this.f14971b = a0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            if (this.f14970a.equals(yVar.f14970a) && this.f14971b.equals(yVar.f14971b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f14971b.hashCode() + (this.f14970a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        a0 a0Var = this.f14970a;
        sb2.append(a0Var);
        a0 a0Var2 = this.f14971b;
        if (a0Var.equals(a0Var2)) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str = ", " + a0Var2;
        }
        return r4.a.o(sb2, str, "]");
    }
}
