package r1;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t0 {
    public static final String j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f11696k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f11697l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f11698m;

    /* renamed from: n, reason: collision with root package name */
    public static final String f11699n;

    /* renamed from: o, reason: collision with root package name */
    public static final String f11700o;

    /* renamed from: p, reason: collision with root package name */
    public static final String f11701p;

    /* renamed from: a, reason: collision with root package name */
    public final Object f11702a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11703b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f11704c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f11705d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11706e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11707f;

    /* renamed from: g, reason: collision with root package name */
    public final long f11708g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11709h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11710i;

    static {
        String str = u1.a0.f12750a;
        j = Integer.toString(0, 36);
        f11696k = Integer.toString(1, 36);
        f11697l = Integer.toString(2, 36);
        f11698m = Integer.toString(3, 36);
        f11699n = Integer.toString(4, 36);
        f11700o = Integer.toString(5, 36);
        f11701p = Integer.toString(6, 36);
    }

    public t0(Object obj, int i6, e0 e0Var, Object obj2, int i10, long j10, long j11, int i11, int i12) {
        this.f11702a = obj;
        this.f11703b = i6;
        this.f11704c = e0Var;
        this.f11705d = obj2;
        this.f11706e = i10;
        this.f11707f = j10;
        this.f11708g = j11;
        this.f11709h = i11;
        this.f11710i = i12;
    }

    public final boolean a(t0 t0Var) {
        if (this.f11703b == t0Var.f11703b && this.f11706e == t0Var.f11706e && this.f11707f == t0Var.f11707f && this.f11708g == t0Var.f11708g && this.f11709h == t0Var.f11709h && this.f11710i == t0Var.f11710i && Objects.equals(this.f11704c, t0Var.f11704c)) {
            return true;
        }
        return false;
    }

    public final t0 b(boolean z10, boolean z11) {
        int i6;
        e0 e0Var;
        int i10;
        long j10;
        int i11;
        int i12;
        if (z10 && z11) {
            return this;
        }
        if (z11) {
            i6 = this.f11703b;
        } else {
            i6 = 0;
        }
        if (z10) {
            e0Var = this.f11704c;
        } else {
            e0Var = null;
        }
        if (z11) {
            i10 = this.f11706e;
        } else {
            i10 = 0;
        }
        long j11 = 0;
        if (z10) {
            j10 = this.f11707f;
        } else {
            j10 = 0;
        }
        if (z10) {
            j11 = this.f11708g;
        }
        if (z10) {
            i11 = this.f11709h;
        } else {
            i11 = -1;
        }
        if (z10) {
            i12 = this.f11710i;
        } else {
            i12 = -1;
        }
        return new t0(this.f11702a, i6, e0Var, this.f11705d, i10, j10, j11, i11, i12);
    }

    public final Bundle c(int i6) {
        Bundle bundle = new Bundle();
        int i10 = this.f11703b;
        if (i6 < 3 || i10 != 0) {
            bundle.putInt(j, i10);
        }
        e0 e0Var = this.f11704c;
        if (e0Var != null) {
            bundle.putBundle(f11696k, e0Var.c(false));
        }
        int i11 = this.f11706e;
        if (i6 < 3 || i11 != 0) {
            bundle.putInt(f11697l, i11);
        }
        long j10 = this.f11707f;
        if (i6 < 3 || j10 != 0) {
            bundle.putLong(f11698m, j10);
        }
        long j11 = this.f11708g;
        if (i6 < 3 || j11 != 0) {
            bundle.putLong(f11699n, j11);
        }
        int i12 = this.f11709h;
        if (i12 != -1) {
            bundle.putInt(f11700o, i12);
        }
        int i13 = this.f11710i;
        if (i13 != -1) {
            bundle.putInt(f11701p, i13);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t0.class == obj.getClass()) {
            t0 t0Var = (t0) obj;
            if (a(t0Var) && Objects.equals(this.f11702a, t0Var.f11702a) && Objects.equals(this.f11705d, t0Var.f11705d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f11702a, Integer.valueOf(this.f11703b), this.f11704c, this.f11705d, Integer.valueOf(this.f11706e), Long.valueOf(this.f11707f), Long.valueOf(this.f11708g), Integer.valueOf(this.f11709h), Integer.valueOf(this.f11710i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f11703b + ", period=" + this.f11706e + ", pos=" + this.f11707f;
        int i6 = this.f11709h;
        if (i6 == -1) {
            return str;
        }
        return str + ", contentPos=" + this.f11708g + ", adGroup=" + i6 + ", ad=" + this.f11710i;
    }
}
