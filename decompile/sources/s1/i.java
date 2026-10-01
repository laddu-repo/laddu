package s1;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f11994a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11995b;

    /* renamed from: c, reason: collision with root package name */
    public final float f11996c;

    /* renamed from: d, reason: collision with root package name */
    public final float f11997d;

    /* renamed from: e, reason: collision with root package name */
    public final float f11998e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11999f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12000g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12001h;

    /* renamed from: i, reason: collision with root package name */
    public final short[] f12002i;
    public short[] j;

    /* renamed from: k, reason: collision with root package name */
    public int f12003k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f12004l;

    /* renamed from: m, reason: collision with root package name */
    public int f12005m;

    /* renamed from: n, reason: collision with root package name */
    public short[] f12006n;

    /* renamed from: o, reason: collision with root package name */
    public int f12007o;

    /* renamed from: p, reason: collision with root package name */
    public int f12008p;

    /* renamed from: q, reason: collision with root package name */
    public int f12009q;

    /* renamed from: r, reason: collision with root package name */
    public int f12010r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public int f12011t;

    /* renamed from: u, reason: collision with root package name */
    public int f12012u;

    /* renamed from: v, reason: collision with root package name */
    public int f12013v;

    /* renamed from: w, reason: collision with root package name */
    public double f12014w;

    public i(int i6, int i10, float f3, float f10, int i11) {
        this.f11994a = i6;
        this.f11995b = i10;
        this.f11996c = f3;
        this.f11997d = f10;
        this.f11998e = i6 / i11;
        this.f11999f = i6 / CommonGatewayClient.CODE_400;
        int i12 = i6 / 65;
        this.f12000g = i12;
        int i13 = i12 * 2;
        this.f12001h = i13;
        this.f12002i = new short[i13];
        this.j = new short[i13 * i10];
        this.f12004l = new short[i13 * i10];
        this.f12006n = new short[i13 * i10];
    }

    public static void e(int i6, int i10, short[] sArr, int i11, short[] sArr2, int i12, short[] sArr3, int i13) {
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i11 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i12 * i10) + i14;
            for (int i18 = 0; i18 < i6; i18++) {
                sArr[i15] = (short) (((sArr3[i16] * i18) + ((i6 - i18) * sArr2[i17])) / i6);
                i15 += i10;
                i17 += i10;
                i16 += i10;
            }
        }
    }

    public final void a(short[] sArr, int i6, int i10) {
        short[] c10 = c(this.f12004l, this.f12005m, i10);
        this.f12004l = c10;
        int i11 = this.f11995b;
        System.arraycopy(sArr, i6 * i11, c10, this.f12005m * i11, i11 * i10);
        this.f12005m += i10;
    }

    public final void b(short[] sArr, int i6, int i10) {
        int i11 = this.f12001h / i10;
        int i12 = this.f11995b;
        int i13 = i10 * i12;
        int i14 = i6 * i12;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                i16 += sArr[(i15 * i13) + i14 + i17];
            }
            this.f12002i[i15] = (short) (i16 / i13);
        }
    }

    public final short[] c(short[] sArr, int i6, int i10) {
        int length = sArr.length;
        int i11 = this.f11995b;
        int i12 = length / i11;
        if (i6 + i10 <= i12) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public final int d(short[] sArr, int i6, int i10, int i11) {
        int i12 = i6 * this.f11995b;
        int i13 = 255;
        int i14 = 1;
        int i15 = 0;
        int i16 = 0;
        while (i10 <= i11) {
            int i17 = 0;
            for (int i18 = 0; i18 < i10; i18++) {
                i17 += Math.abs(sArr[i12 + i18] - sArr[(i12 + i10) + i18]);
            }
            if (i17 * i15 < i14 * i10) {
                i15 = i10;
                i14 = i17;
            }
            if (i17 * i13 > i16 * i10) {
                i13 = i10;
                i16 = i17;
            }
            i10++;
        }
        this.f12012u = i14 / i15;
        this.f12013v = i16 / i13;
        return i15;
    }

    public final void f() {
        int i6;
        float f3;
        double d10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j;
        long j10;
        boolean z10;
        int i18 = this.f12005m;
        float f10 = this.f11996c;
        float f11 = this.f11997d;
        double d11 = f10 / f11;
        float f12 = this.f11998e * f11;
        int i19 = this.f11994a;
        int i20 = 1;
        int i21 = this.f11995b;
        int i22 = 0;
        if (d11 <= 1.0000100135803223d && d11 >= 0.9999899864196777d) {
            a(this.j, 0, this.f12003k);
            this.f12003k = 0;
        } else {
            int i23 = this.f12003k;
            int i24 = this.f12001h;
            if (i23 >= i24) {
                int i25 = 0;
                while (true) {
                    int i26 = this.f12010r;
                    if (i26 > 0) {
                        int min = Math.min(i24, i26);
                        a(this.j, i25, min);
                        this.f12010r -= min;
                        i25 += min;
                        f3 = f12;
                        d10 = d11;
                    } else {
                        short[] sArr = this.j;
                        if (i19 > 4000) {
                            i6 = i19 / 4000;
                        } else {
                            i6 = 1;
                        }
                        int i27 = this.f12000g;
                        int i28 = this.f11999f;
                        if (i21 == i20 && i6 == i20) {
                            i10 = d(sArr, i25, i28, i27);
                            f3 = f12;
                            d10 = d11;
                        } else {
                            b(sArr, i25, i6);
                            f3 = f12;
                            d10 = d11;
                            short[] sArr2 = this.f12002i;
                            int d12 = d(sArr2, i22, i28 / i6, i27 / i6);
                            if (i6 != 1) {
                                int i29 = d12 * i6;
                                int i30 = i6 * 4;
                                int i31 = i29 - i30;
                                int i32 = i29 + i30;
                                if (i31 >= i28) {
                                    i28 = i31;
                                }
                                if (i32 <= i27) {
                                    i27 = i32;
                                }
                                if (i21 == 1) {
                                    i10 = d(sArr, i25, i28, i27);
                                } else {
                                    b(sArr, i25, 1);
                                    i10 = d(sArr2, i22, i28, i27);
                                }
                            } else {
                                i10 = d12;
                            }
                        }
                        int i33 = this.f12012u;
                        int i34 = this.f12013v;
                        if (i33 == 0 || (i11 = this.s) == 0 || i34 > i33 * 3 || i33 * 2 <= this.f12011t * 3) {
                            i11 = i10;
                        }
                        this.f12011t = i33;
                        this.s = i10;
                        if (d10 > 1.0d) {
                            short[] sArr3 = this.j;
                            if (d10 >= 2.0d) {
                                i13 = i25;
                                double d13 = (i11 / (d10 - 1.0d)) + this.f12014w;
                                int round = (int) Math.round(d13);
                                this.f12014w = d13 - round;
                                i14 = round;
                            } else {
                                i13 = i25;
                                double d14 = (((2.0d - d10) * i11) / (d10 - 1.0d)) + this.f12014w;
                                int round2 = (int) Math.round(d14);
                                this.f12010r = round2;
                                this.f12014w = d14 - round2;
                                i14 = i11;
                            }
                            short[] c10 = c(this.f12004l, this.f12005m, i14);
                            this.f12004l = c10;
                            int i35 = i13;
                            e(i14, this.f11995b, c10, this.f12005m, sArr3, i35, sArr3, i35 + i11);
                            this.f12005m += i14;
                            i25 = i11 + i14 + i35;
                        } else {
                            int i36 = i25;
                            short[] sArr4 = this.j;
                            if (d10 < 0.5d) {
                                double d15 = ((i11 * d10) / (1.0d - d10)) + this.f12014w;
                                int round3 = (int) Math.round(d15);
                                this.f12014w = d15 - round3;
                                i12 = round3;
                            } else {
                                double d16 = ((((2.0d * d10) - 1.0d) * i11) / (1.0d - d10)) + this.f12014w;
                                int round4 = (int) Math.round(d16);
                                this.f12010r = round4;
                                this.f12014w = d16 - round4;
                                i12 = i11;
                            }
                            int i37 = i11 + i12;
                            short[] c11 = c(this.f12004l, this.f12005m, i37);
                            this.f12004l = c11;
                            System.arraycopy(sArr4, i36 * i21, c11, this.f12005m * i21, i11 * i21);
                            e(i12, this.f11995b, this.f12004l, this.f12005m + i11, sArr4, i36 + i11, sArr4, i36);
                            this.f12005m += i37;
                            i25 = i36 + i12;
                        }
                    }
                    if (i25 + i24 > i23) {
                        break;
                    }
                    f12 = f3;
                    d11 = d10;
                    i20 = 1;
                    i22 = 0;
                }
                int i38 = this.f12003k - i25;
                short[] sArr5 = this.j;
                System.arraycopy(sArr5, i25 * i21, sArr5, 0, i38 * i21);
                this.f12003k = i38;
                if (f3 == 1.0f && this.f12005m != i18) {
                    long j11 = i19 / f3;
                    long j12 = i19;
                    while (j11 != 0 && j12 != 0 && j11 % 2 == 0 && j12 % 2 == 0) {
                        j11 /= 2;
                        j12 /= 2;
                    }
                    int i39 = this.f12005m - i18;
                    short[] c12 = c(this.f12006n, this.f12007o, i39);
                    this.f12006n = c12;
                    System.arraycopy(this.f12004l, i18 * i21, c12, this.f12007o * i21, i39 * i21);
                    this.f12005m = i18;
                    this.f12007o += i39;
                    int i40 = 0;
                    while (true) {
                        i15 = this.f12007o;
                        i16 = i15 - 1;
                        if (i40 >= i16) {
                            break;
                        }
                        while (true) {
                            i17 = this.f12008p + 1;
                            j = i17;
                            long j13 = j * j11;
                            j10 = this.f12009q;
                            if (j13 <= j10 * j12) {
                                break;
                            }
                            this.f12004l = c(this.f12004l, this.f12005m, 1);
                            int i41 = 0;
                            while (i41 < i21) {
                                short[] sArr6 = this.f12004l;
                                int i42 = (this.f12005m * i21) + i41;
                                short[] sArr7 = this.f12006n;
                                int i43 = (i40 * i21) + i41;
                                short s = sArr7[i43];
                                short s7 = sArr7[i43 + i21];
                                int i44 = i40;
                                long j14 = (r12 + 1) * j11;
                                long j15 = j14 - (this.f12009q * j12);
                                long j16 = j14 - (this.f12008p * j11);
                                sArr6[i42] = (short) ((((j16 - j15) * s7) + (s * j15)) / j16);
                                i41++;
                                i40 = i44;
                            }
                            this.f12009q++;
                            this.f12005m++;
                            i40 = i40;
                        }
                        int i45 = i40;
                        this.f12008p = i17;
                        if (j == j12) {
                            this.f12008p = 0;
                            if (j10 == j11) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            u1.c.g(z10);
                            this.f12009q = 0;
                        }
                        i40 = i45 + 1;
                    }
                    if (i16 != 0) {
                        short[] sArr8 = this.f12006n;
                        System.arraycopy(sArr8, i16 * i21, sArr8, 0, (i15 - i16) * i21);
                        this.f12007o -= i16;
                        return;
                    }
                    return;
                }
            }
        }
        f3 = f12;
        if (f3 == 1.0f) {
        }
    }
}
