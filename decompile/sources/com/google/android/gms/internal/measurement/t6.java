package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t6 {

    /* renamed from: f, reason: collision with root package name */
    public static final t6 f2446f = new t6(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f2447a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f2448b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f2449c;

    /* renamed from: d, reason: collision with root package name */
    public int f2450d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2451e;

    public t6(int i6, int[] iArr, Object[] objArr, boolean z10) {
        this.f2447a = i6;
        this.f2448b = iArr;
        this.f2449c = objArr;
        this.f2451e = z10;
    }

    public static t6 a() {
        return new t6(0, new int[8], new Object[8], true);
    }

    public final void b(a6 a6Var) {
        if (this.f2447a != 0) {
            for (int i6 = 0; i6 < this.f2447a; i6++) {
                int i10 = this.f2448b[i6];
                Object obj = this.f2449c[i6];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 == 5) {
                                    ((d5) a6Var.f2145a).u(i12, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(new u5());
                                }
                            } else {
                                ((d5) a6Var.f2145a).r(i12, 3);
                                ((t6) obj).b(a6Var);
                                ((d5) a6Var.f2145a).r(i12, 4);
                            }
                        } else {
                            d5 d5Var = (d5) a6Var.f2145a;
                            d5Var.A((i12 << 3) | 2);
                            d5Var.x((c5) obj);
                        }
                    } else {
                        ((d5) a6Var.f2145a).w(i12, ((Long) obj).longValue());
                    }
                } else {
                    ((d5) a6Var.f2145a).v(i12, ((Long) obj).longValue());
                }
            }
        }
    }

    public final int c() {
        int G;
        int p10;
        int G2;
        int i6 = this.f2450d;
        if (i6 == -1) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f2447a; i11++) {
                int i12 = this.f2448b[i11];
                int i13 = i12 >>> 3;
                int i14 = i12 & 7;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                if (i14 == 5) {
                                    ((Integer) this.f2449c[i11]).getClass();
                                    G2 = d5.G(i13 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(new u5());
                                }
                            } else {
                                int G3 = d5.G(i13 << 3);
                                G = G3 + G3;
                                p10 = ((t6) this.f2449c[i11]).c();
                            }
                        } else {
                            int i15 = i13 << 3;
                            c5 c5Var = (c5) this.f2449c[i11];
                            int G4 = d5.G(i15);
                            int c10 = c5Var.c();
                            i10 = r4.a.h(c10, c10, G4, i10);
                        }
                    } else {
                        ((Long) this.f2449c[i11]).getClass();
                        G2 = d5.G(i13 << 3) + 8;
                    }
                    i10 = G2 + i10;
                } else {
                    int i16 = i13 << 3;
                    long longValue = ((Long) this.f2449c[i11]).longValue();
                    G = d5.G(i16);
                    p10 = d5.p(longValue);
                }
                i10 = p10 + G + i10;
            }
            this.f2450d = i10;
            return i10;
        }
        return i6;
    }

    public final void d(int i6, Object obj) {
        if (this.f2451e) {
            e(this.f2447a + 1);
            int[] iArr = this.f2448b;
            int i10 = this.f2447a;
            iArr[i10] = i6;
            this.f2449c[i10] = obj;
            this.f2447a = i10 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void e(int i6) {
        int[] iArr = this.f2448b;
        if (i6 > iArr.length) {
            int i10 = this.f2447a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i6) {
                i6 = i11;
            }
            if (i6 < 8) {
                i6 = 8;
            }
            this.f2448b = Arrays.copyOf(iArr, i6);
            this.f2449c = Arrays.copyOf(this.f2449c, i6);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof t6)) {
            return false;
        }
        t6 t6Var = (t6) obj;
        int i6 = this.f2447a;
        if (i6 == t6Var.f2447a) {
            int[] iArr = this.f2448b;
            int[] iArr2 = t6Var.f2448b;
            int i10 = 0;
            while (true) {
                if (i10 < i6) {
                    if (iArr[i10] != iArr2[i10]) {
                        break;
                    }
                    i10++;
                } else {
                    Object[] objArr = this.f2449c;
                    Object[] objArr2 = t6Var.f2449c;
                    int i11 = this.f2447a;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (objArr[i12].equals(objArr2[i12])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6 = this.f2447a;
        int i10 = i6 + 527;
        int[] iArr = this.f2448b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i6; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i10 * 31) + i12) * 31;
        Object[] objArr = this.f2449c;
        int i15 = this.f2447a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }
}
