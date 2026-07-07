package r1;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final String f11259h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f11260i;
    public static final String j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f11261k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f11262l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f11263m;

    /* renamed from: n, reason: collision with root package name */
    public static final String f11264n;

    /* renamed from: o, reason: collision with root package name */
    public static final String f11265o;

    /* renamed from: p, reason: collision with root package name */
    public static final String f11266p;

    /* renamed from: q, reason: collision with root package name */
    public static final String f11267q;

    /* renamed from: r, reason: collision with root package name */
    public static final String f11268r;

    /* renamed from: a, reason: collision with root package name */
    public final int f11269a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11270b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri[] f11271c;

    /* renamed from: d, reason: collision with root package name */
    public final e0[] f11272d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f11273e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f11274f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f11275g;

    static {
        String str = u1.a0.f12750a;
        f11259h = Integer.toString(0, 36);
        f11260i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        f11261k = Integer.toString(3, 36);
        f11262l = Integer.toString(4, 36);
        f11263m = Integer.toString(5, 36);
        f11264n = Integer.toString(6, 36);
        f11265o = Integer.toString(7, 36);
        f11266p = Integer.toString(8, 36);
        f11267q = Integer.toString(9, 36);
        f11268r = Integer.toString(10, 36);
    }

    public a(int i6, int i10, int[] iArr, e0[] e0VarArr, long[] jArr, String[] strArr) {
        boolean z10;
        Uri uri;
        int i11 = 0;
        if (iArr.length == e0VarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        this.f11269a = i6;
        this.f11270b = i10;
        this.f11273e = iArr;
        this.f11272d = e0VarArr;
        this.f11274f = jArr;
        this.f11271c = new Uri[e0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f11271c;
            if (i11 < uriArr.length) {
                e0 e0Var = e0VarArr[i11];
                if (e0Var == null) {
                    uri = null;
                } else {
                    a0 a0Var = e0Var.f11379b;
                    a0Var.getClass();
                    uri = a0Var.f11283a;
                }
                uriArr[i11] = uri;
                i11++;
            } else {
                this.f11275g = strArr;
                return;
            }
        }
    }

    public final int a(int i6) {
        int i10;
        int i11 = i6 + 1;
        while (true) {
            int[] iArr = this.f11273e;
            if (i11 >= iArr.length || (i10 = iArr[i11]) == 0 || i10 == 1) {
                break;
            }
            i11++;
        }
        return i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f11269a == aVar.f11269a && this.f11270b == aVar.f11270b && Arrays.equals(this.f11272d, aVar.f11272d) && Arrays.equals(this.f11273e, aVar.f11273e) && Arrays.equals(this.f11274f, aVar.f11274f) && Arrays.equals(this.f11275g, aVar.f11275g)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i6 = (int) 0;
        return (((((Arrays.hashCode(this.f11274f) + ((Arrays.hashCode(this.f11273e) + ((Arrays.hashCode(this.f11272d) + (((((this.f11269a * 31) + this.f11270b) * 31) + i6) * 31)) * 31)) * 31)) * 31) + i6) * 961) + Arrays.hashCode(this.f11275g)) * 31;
    }
}
