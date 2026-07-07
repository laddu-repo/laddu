package r1;

import android.util.Pair;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final z0 f11368a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final String f11369b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f11370c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f11371d;

    /* JADX WARN: Type inference failed for: r0v0, types: [r1.z0, java.lang.Object] */
    static {
        String str = u1.a0.f12750a;
        f11369b = Integer.toString(0, 36);
        f11370c = Integer.toString(1, 36);
        f11371d = Integer.toString(2, 36);
    }

    public int a(boolean z10) {
        if (p()) {
            return -1;
        }
        return 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i6, a1 a1Var, c1 c1Var, int i10, boolean z10) {
        int i11 = f(i6, a1Var, false).f11297c;
        if (m(i11, c1Var, 0L).f11340o == i6) {
            int e10 = e(z10, i11, i10);
            if (e10 == -1) {
                return -1;
            }
            return m(e10, c1Var, 0L).f11339n;
        }
        return i6 + 1;
    }

    public int e(boolean z10, int i6, int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (i6 == c(z10)) {
                        return a(z10);
                    }
                    return i6 + 1;
                }
                throw new IllegalStateException();
            }
            return i6;
        }
        if (i6 == c(z10)) {
            return -1;
        }
        return i6 + 1;
    }

    public boolean equals(Object obj) {
        int c10;
        if (this != obj) {
            if (obj instanceof d1) {
                d1 d1Var = (d1) obj;
                if (d1Var.o() == o() && d1Var.h() == h()) {
                    c1 c1Var = new c1();
                    a1 a1Var = new a1();
                    c1 c1Var2 = new c1();
                    a1 a1Var2 = new a1();
                    int i6 = 0;
                    while (true) {
                        if (i6 < o()) {
                            if (!m(i6, c1Var, 0L).equals(d1Var.m(i6, c1Var2, 0L))) {
                                break;
                            }
                            i6++;
                        } else {
                            int i10 = 0;
                            while (true) {
                                if (i10 < h()) {
                                    if (!f(i10, a1Var, true).equals(d1Var.f(i10, a1Var2, true))) {
                                        break;
                                    }
                                    i10++;
                                } else {
                                    int a10 = a(true);
                                    if (a10 == d1Var.a(true) && (c10 = c(true)) == d1Var.c(true)) {
                                        while (a10 != c10) {
                                            int e10 = e(true, a10, 0);
                                            if (e10 == d1Var.e(true, a10, 0)) {
                                                a10 = e10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract a1 f(int i6, a1 a1Var, boolean z10);

    public a1 g(Object obj, a1 a1Var) {
        return f(b(obj), a1Var, true);
    }

    public abstract int h();

    public int hashCode() {
        c1 c1Var = new c1();
        a1 a1Var = new a1();
        int o10 = o() + 217;
        for (int i6 = 0; i6 < o(); i6++) {
            o10 = (o10 * 31) + m(i6, c1Var, 0L).hashCode();
        }
        int h4 = h() + (o10 * 31);
        for (int i10 = 0; i10 < h(); i10++) {
            h4 = (h4 * 31) + f(i10, a1Var, true).hashCode();
        }
        int a10 = a(true);
        while (a10 != -1) {
            h4 = (h4 * 31) + a10;
            a10 = e(true, a10, 0);
        }
        return h4;
    }

    public final Pair i(c1 c1Var, a1 a1Var, int i6, long j) {
        Pair j10 = j(c1Var, a1Var, i6, j, 0L);
        j10.getClass();
        return j10;
    }

    public final Pair j(c1 c1Var, a1 a1Var, int i6, long j, long j10) {
        u1.c.c(i6, o());
        m(i6, c1Var, j10);
        if (j == -9223372036854775807L) {
            j = c1Var.f11337l;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i10 = c1Var.f11339n;
        f(i10, a1Var, false);
        while (i10 < c1Var.f11340o && a1Var.f11299e != j) {
            int i11 = i10 + 1;
            if (f(i11, a1Var, false).f11299e > j) {
                break;
            }
            i10 = i11;
        }
        f(i10, a1Var, true);
        long j11 = j - a1Var.f11299e;
        long j12 = a1Var.f11298d;
        if (j12 != -9223372036854775807L) {
            j11 = Math.min(j11, j12 - 1);
        }
        long max = Math.max(0L, j11);
        Object obj = a1Var.f11296b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(boolean z10, int i6, int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (i6 == a(z10)) {
                        return c(z10);
                    }
                    return i6 - 1;
                }
                throw new IllegalStateException();
            }
            return i6;
        }
        if (i6 == a(z10)) {
            return -1;
        }
        return i6 - 1;
    }

    public abstract Object l(int i6);

    public abstract c1 m(int i6, c1 c1Var, long j);

    public final void n(int i6, c1 c1Var) {
        m(i6, c1Var, 0L);
    }

    public abstract int o();

    public final boolean p() {
        if (o() == 0) {
            return true;
        }
        return false;
    }
}
