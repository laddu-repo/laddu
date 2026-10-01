package r1;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: f, reason: collision with root package name */
    public static final String f11566f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f11567g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f11568h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f11569i;

    /* renamed from: a, reason: collision with root package name */
    public final int f11570a;

    /* renamed from: b, reason: collision with root package name */
    public final e1 f11571b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11572c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f11573d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f11574e;

    static {
        String str = u1.a0.f12750a;
        f11566f = Integer.toString(0, 36);
        f11567g = Integer.toString(1, 36);
        f11568h = Integer.toString(3, 36);
        f11569i = Integer.toString(4, 36);
    }

    public k1(e1 e1Var, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i6 = e1Var.f11386a;
        this.f11570a = i6;
        boolean z12 = false;
        if (i6 == iArr.length && i6 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        u1.c.b(z11);
        this.f11571b = e1Var;
        if (z10 && i6 > 1) {
            z12 = true;
        }
        this.f11572c = z12;
        this.f11573d = (int[]) iArr.clone();
        this.f11574e = (boolean[]) zArr.clone();
    }

    public final boolean a(int i6) {
        if (this.f11573d[i6] != 4) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k1.class == obj.getClass()) {
            k1 k1Var = (k1) obj;
            if (this.f11572c == k1Var.f11572c && this.f11571b.equals(k1Var.f11571b) && Arrays.equals(this.f11573d, k1Var.f11573d) && Arrays.equals(this.f11574e, k1Var.f11574e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11574e) + ((Arrays.hashCode(this.f11573d) + (((this.f11571b.hashCode() * 31) + (this.f11572c ? 1 : 0)) * 31)) * 31);
    }
}
