package y2;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f14889a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f14890b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14891c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14892d;

    public e0(int i6, byte[] bArr, int i10, int i11) {
        this.f14889a = i6;
        this.f14890b = bArr;
        this.f14891c = i10;
        this.f14892d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e0.class == obj.getClass()) {
            e0 e0Var = (e0) obj;
            if (this.f14889a == e0Var.f14889a && this.f14891c == e0Var.f14891c && this.f14892d == e0Var.f14892d && Arrays.equals(this.f14890b, e0Var.f14890b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f14890b) + (this.f14889a * 31)) * 31) + this.f14891c) * 31) + this.f14892d;
    }
}
