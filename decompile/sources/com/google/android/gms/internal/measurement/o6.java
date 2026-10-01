package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class o6 {

    /* renamed from: a, reason: collision with root package name */
    public static final k5 f2380a;

    static {
        k6 k6Var = k6.f2322c;
        f2380a = new k5(6);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static void b(Object obj, Object obj2) {
        m5 m5Var = (m5) obj;
        t6 t6Var = m5Var.zzc;
        t6 t6Var2 = ((m5) obj2).zzc;
        t6 t6Var3 = t6.f2446f;
        if (!t6Var3.equals(t6Var2)) {
            if (t6Var3.equals(t6Var)) {
                int i6 = t6Var.f2447a + t6Var2.f2447a;
                int[] copyOf = Arrays.copyOf(t6Var.f2448b, i6);
                System.arraycopy(t6Var2.f2448b, 0, copyOf, t6Var.f2447a, t6Var2.f2447a);
                Object[] copyOf2 = Arrays.copyOf(t6Var.f2449c, i6);
                System.arraycopy(t6Var2.f2449c, 0, copyOf2, t6Var.f2447a, t6Var2.f2447a);
                t6Var = new t6(i6, copyOf, copyOf2, true);
            } else {
                t6Var.getClass();
                if (!t6Var2.equals(t6Var3)) {
                    if (t6Var.f2451e) {
                        int i10 = t6Var.f2447a + t6Var2.f2447a;
                        t6Var.e(i10);
                        System.arraycopy(t6Var2.f2448b, 0, t6Var.f2448b, t6Var.f2447a, t6Var2.f2447a);
                        System.arraycopy(t6Var2.f2449c, 0, t6Var.f2449c, t6Var.f2447a, t6Var2.f2447a);
                        t6Var.f2447a = i10;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        m5Var.zzc = t6Var;
    }

    public static void c(int i6, List list, a6 a6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) a6Var.f2145a;
            int i10 = 0;
            if (z10) {
                d5Var.r(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Double) list.get(i12)).getClass();
                    i11 += 8;
                }
                d5Var.A(i11);
                while (i10 < list.size()) {
                    d5Var.D(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                d5Var.w(i6, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
        }
    }

    public static void d(int i6, List list, a6 a6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) a6Var.f2145a;
            int i10 = 0;
            if (z10) {
                d5Var.r(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Float) list.get(i12)).getClass();
                    i11 += 4;
                }
                d5Var.A(i11);
                while (i10 < list.size()) {
                    d5Var.B(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                d5Var.u(i6, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
        }
    }

    public static void e(int i6, List list, a6 a6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) a6Var.f2145a;
            int i10 = 0;
            if (list instanceof y5) {
                y5 y5Var = (y5) list;
                if (z10) {
                    d5Var.r(i6, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < y5Var.f2531z; i12++) {
                        i11 += d5.p(y5Var.b(i12));
                    }
                    d5Var.A(i11);
                    while (i10 < y5Var.f2531z) {
                        d5Var.C(y5Var.b(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < y5Var.f2531z) {
                    d5Var.v(i6, y5Var.b(i10));
                    i10++;
                }
                return;
            }
            if (z10) {
                d5Var.r(i6, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += d5.p(((Long) list.get(i14)).longValue());
                }
                d5Var.A(i13);
                while (i10 < list.size()) {
                    d5Var.C(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                d5Var.v(i6, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void f(int i6, List list, a6 a6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) a6Var.f2145a;
            int i10 = 0;
            if (list instanceof y5) {
                y5 y5Var = (y5) list;
                if (z10) {
                    d5Var.r(i6, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < y5Var.f2531z; i12++) {
                        i11 += d5.p(y5Var.b(i12));
                    }
                    d5Var.A(i11);
                    while (i10 < y5Var.f2531z) {
                        d5Var.C(y5Var.b(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < y5Var.f2531z) {
                    d5Var.v(i6, y5Var.b(i10));
                    i10++;
                }
                return;
            }
            if (z10) {
                d5Var.r(i6, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += d5.p(((Long) list.get(i14)).longValue());
                }
                d5Var.A(i13);
                while (i10 < list.size()) {
                    d5Var.C(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                d5Var.v(i6, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void g(int i6, List list, a6 a6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) a6Var.f2145a;
            int i10 = 0;
            if (list instanceof y5) {
                y5 y5Var = (y5) list;
                if (z10) {
                    d5Var.r(i6, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < y5Var.f2531z; i12++) {
                        long b10 = y5Var.b(i12);
                        i11 += d5.p((b10 >> 63) ^ (b10 + b10));
                    }
                    d5Var.A(i11);
                    while (i10 < y5Var.f2531z) {
                        long b11 = y5Var.b(i10);
                        d5Var.C((b11 >> 63) ^ (b11 + b11));
                        i10++;
                    }
                    return;
                }
                while (i10 < y5Var.f2531z) {
                    long b12 = y5Var.b(i10);
                    d5Var.v(i6, (b12 >> 63) ^ (b12 + b12));
                    i10++;
                }
                return;
            }
            if (z10) {
                d5Var.r(i6, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    long longValue = ((Long) list.get(i14)).longValue();
                    i13 += d5.p((longValue >> 63) ^ (longValue + longValue));
                }
                d5Var.A(i13);
                while (i10 < list.size()) {
                    long longValue2 = ((Long) list.get(i10)).longValue();
                    d5Var.C((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                long longValue3 = ((Long) list.get(i10)).longValue();
                d5Var.v(i6, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i10++;
            }
        }
    }

    public static void h(int i6, List list, a6 a6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) a6Var.f2145a;
            int i10 = 0;
            if (list instanceof y5) {
                y5 y5Var = (y5) list;
                if (z10) {
                    d5Var.r(i6, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < y5Var.f2531z; i12++) {
                        y5Var.b(i12);
                        i11 += 8;
                    }
                    d5Var.A(i11);
                    while (i10 < y5Var.f2531z) {
                        d5Var.D(y5Var.b(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < y5Var.f2531z) {
                    d5Var.w(i6, y5Var.b(i10));
                    i10++;
                }
                return;
            }
            if (z10) {
                d5Var.r(i6, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Long) list.get(i14)).getClass();
                    i13 += 8;
                }
                d5Var.A(i13);
                while (i10 < list.size()) {
                    d5Var.D(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                d5Var.w(i6, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void i(int i6, List list, a6 a6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) a6Var.f2145a;
            int i10 = 0;
            if (list instanceof y5) {
                y5 y5Var = (y5) list;
                if (z10) {
                    d5Var.r(i6, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < y5Var.f2531z; i12++) {
                        y5Var.b(i12);
                        i11 += 8;
                    }
                    d5Var.A(i11);
                    while (i10 < y5Var.f2531z) {
                        d5Var.D(y5Var.b(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < y5Var.f2531z) {
                    d5Var.w(i6, y5Var.b(i10));
                    i10++;
                }
                return;
            }
            if (z10) {
                d5Var.r(i6, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Long) list.get(i14)).getClass();
                    i13 += 8;
                }
                d5Var.A(i13);
                while (i10 < list.size()) {
                    d5Var.D(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                d5Var.w(i6, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void j(int i6, List list, a6 a6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) a6Var.f2145a;
            int i10 = 0;
            if (list instanceof n5) {
                n5 n5Var = (n5) list;
                if (z10) {
                    d5Var.r(i6, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < n5Var.f2363z; i12++) {
                        i11 += d5.p(n5Var.c(i12));
                    }
                    d5Var.A(i11);
                    while (i10 < n5Var.f2363z) {
                        d5Var.z(n5Var.c(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < n5Var.f2363z) {
                    d5Var.s(i6, n5Var.c(i10));
                    i10++;
                }
                return;
            }
            if (z10) {
                d5Var.r(i6, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += d5.p(((Integer) list.get(i14)).intValue());
                }
                d5Var.A(i13);
                while (i10 < list.size()) {
                    d5Var.z(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                d5Var.s(i6, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void k(int i6, List list, a6 a6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) a6Var.f2145a;
            int i10 = 0;
            if (list instanceof n5) {
                n5 n5Var = (n5) list;
                if (z10) {
                    d5Var.r(i6, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < n5Var.f2363z; i12++) {
                        i11 += d5.G(n5Var.c(i12));
                    }
                    d5Var.A(i11);
                    while (i10 < n5Var.f2363z) {
                        d5Var.A(n5Var.c(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < n5Var.f2363z) {
                    d5Var.t(i6, n5Var.c(i10));
                    i10++;
                }
                return;
            }
            if (z10) {
                d5Var.r(i6, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += d5.G(((Integer) list.get(i14)).intValue());
                }
                d5Var.A(i13);
                while (i10 < list.size()) {
                    d5Var.A(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                d5Var.t(i6, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void l(int i6, List list, a6 a6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) a6Var.f2145a;
            int i10 = 0;
            if (list instanceof n5) {
                n5 n5Var = (n5) list;
                if (z10) {
                    d5Var.r(i6, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < n5Var.f2363z; i12++) {
                        int c10 = n5Var.c(i12);
                        i11 += d5.G((c10 >> 31) ^ (c10 + c10));
                    }
                    d5Var.A(i11);
                    while (i10 < n5Var.f2363z) {
                        int c11 = n5Var.c(i10);
                        d5Var.A((c11 >> 31) ^ (c11 + c11));
                        i10++;
                    }
                    return;
                }
                while (i10 < n5Var.f2363z) {
                    int c12 = n5Var.c(i10);
                    d5Var.t(i6, (c12 >> 31) ^ (c12 + c12));
                    i10++;
                }
                return;
            }
            if (z10) {
                d5Var.r(i6, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    int intValue = ((Integer) list.get(i14)).intValue();
                    i13 += d5.G((intValue >> 31) ^ (intValue + intValue));
                }
                d5Var.A(i13);
                while (i10 < list.size()) {
                    int intValue2 = ((Integer) list.get(i10)).intValue();
                    d5Var.A((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                int intValue3 = ((Integer) list.get(i10)).intValue();
                d5Var.t(i6, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i10++;
            }
        }
    }

    public static void m(int i6, List list, a6 a6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) a6Var.f2145a;
            int i10 = 0;
            if (list instanceof n5) {
                n5 n5Var = (n5) list;
                if (z10) {
                    d5Var.r(i6, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < n5Var.f2363z; i12++) {
                        n5Var.c(i12);
                        i11 += 4;
                    }
                    d5Var.A(i11);
                    while (i10 < n5Var.f2363z) {
                        d5Var.B(n5Var.c(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < n5Var.f2363z) {
                    d5Var.u(i6, n5Var.c(i10));
                    i10++;
                }
                return;
            }
            if (z10) {
                d5Var.r(i6, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Integer) list.get(i14)).getClass();
                    i13 += 4;
                }
                d5Var.A(i13);
                while (i10 < list.size()) {
                    d5Var.B(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                d5Var.u(i6, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void n(int i6, List list, a6 a6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) a6Var.f2145a;
            int i10 = 0;
            if (list instanceof n5) {
                n5 n5Var = (n5) list;
                if (z10) {
                    d5Var.r(i6, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < n5Var.f2363z; i12++) {
                        n5Var.c(i12);
                        i11 += 4;
                    }
                    d5Var.A(i11);
                    while (i10 < n5Var.f2363z) {
                        d5Var.B(n5Var.c(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < n5Var.f2363z) {
                    d5Var.u(i6, n5Var.c(i10));
                    i10++;
                }
                return;
            }
            if (z10) {
                d5Var.r(i6, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Integer) list.get(i14)).getClass();
                    i13 += 4;
                }
                d5Var.A(i13);
                while (i10 < list.size()) {
                    d5Var.B(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                d5Var.u(i6, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void o(int i6, List list, a6 a6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) a6Var.f2145a;
            int i10 = 0;
            if (list instanceof n5) {
                n5 n5Var = (n5) list;
                if (z10) {
                    d5Var.r(i6, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < n5Var.f2363z; i12++) {
                        i11 += d5.p(n5Var.c(i12));
                    }
                    d5Var.A(i11);
                    while (i10 < n5Var.f2363z) {
                        d5Var.z(n5Var.c(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < n5Var.f2363z) {
                    d5Var.s(i6, n5Var.c(i10));
                    i10++;
                }
                return;
            }
            if (z10) {
                d5Var.r(i6, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += d5.p(((Integer) list.get(i14)).intValue());
                }
                d5Var.A(i13);
                while (i10 < list.size()) {
                    d5Var.z(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                d5Var.s(i6, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void p(int i6, List list, a6 a6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) a6Var.f2145a;
            int i10 = 0;
            if (z10) {
                d5Var.r(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Boolean) list.get(i12)).getClass();
                    i11++;
                }
                d5Var.A(i11);
                while (i10 < list.size()) {
                    d5Var.y(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                boolean booleanValue = ((Boolean) list.get(i10)).booleanValue();
                d5Var.A(i6 << 3);
                d5Var.y(booleanValue ? (byte) 1 : (byte) 0);
                i10++;
            }
        }
    }

    public static int q(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y5) {
            y5 y5Var = (y5) list;
            int i10 = 0;
            while (i6 < size) {
                i10 += d5.p(y5Var.b(i6));
                i6++;
            }
            return i10;
        }
        int i11 = 0;
        while (i6 < size) {
            i11 += d5.p(((Long) list.get(i6)).longValue());
            i6++;
        }
        return i11;
    }

    public static int r(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y5) {
            y5 y5Var = (y5) list;
            int i10 = 0;
            while (i6 < size) {
                i10 += d5.p(y5Var.b(i6));
                i6++;
            }
            return i10;
        }
        int i11 = 0;
        while (i6 < size) {
            i11 += d5.p(((Long) list.get(i6)).longValue());
            i6++;
        }
        return i11;
    }

    public static int s(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y5) {
            y5 y5Var = (y5) list;
            int i10 = 0;
            while (i6 < size) {
                long b10 = y5Var.b(i6);
                i10 += d5.p((b10 >> 63) ^ (b10 + b10));
                i6++;
            }
            return i10;
        }
        int i11 = 0;
        while (i6 < size) {
            long longValue = ((Long) list.get(i6)).longValue();
            i11 += d5.p((longValue >> 63) ^ (longValue + longValue));
            i6++;
        }
        return i11;
    }

    public static int t(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n5) {
            n5 n5Var = (n5) list;
            int i10 = 0;
            while (i6 < size) {
                i10 += d5.p(n5Var.c(i6));
                i6++;
            }
            return i10;
        }
        int i11 = 0;
        while (i6 < size) {
            i11 += d5.p(((Integer) list.get(i6)).intValue());
            i6++;
        }
        return i11;
    }

    public static int u(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n5) {
            n5 n5Var = (n5) list;
            int i10 = 0;
            while (i6 < size) {
                i10 += d5.p(n5Var.c(i6));
                i6++;
            }
            return i10;
        }
        int i11 = 0;
        while (i6 < size) {
            i11 += d5.p(((Integer) list.get(i6)).intValue());
            i6++;
        }
        return i11;
    }

    public static int v(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n5) {
            n5 n5Var = (n5) list;
            int i10 = 0;
            while (i6 < size) {
                i10 += d5.G(n5Var.c(i6));
                i6++;
            }
            return i10;
        }
        int i11 = 0;
        while (i6 < size) {
            i11 += d5.G(((Integer) list.get(i6)).intValue());
            i6++;
        }
        return i11;
    }

    public static int w(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n5) {
            n5 n5Var = (n5) list;
            int i10 = 0;
            while (i6 < size) {
                int c10 = n5Var.c(i6);
                i10 += d5.G((c10 >> 31) ^ (c10 + c10));
                i6++;
            }
            return i10;
        }
        int i11 = 0;
        while (i6 < size) {
            int intValue = ((Integer) list.get(i6)).intValue();
            i11 += d5.G((intValue >> 31) ^ (intValue + intValue));
            i6++;
        }
        return i11;
    }

    public static int x(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (d5.G(i6 << 3) + 4) * size;
    }

    public static int y(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (d5.G(i6 << 3) + 8) * size;
    }
}
