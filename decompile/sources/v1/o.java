package v1;

import com.unity3d.services.core.device.MimeTypes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import r1.k0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f13247a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f13248b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    public static final Object f13249c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static int[] f13250d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i6, int i10, boolean[] zArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i11 = i10 - i6;
        boolean z13 = false;
        if (i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        if (i11 == 0) {
            return i10;
        }
        if (zArr[0]) {
            a(zArr);
            return i6 - 3;
        }
        if (i11 > 1 && zArr[1] && bArr[i6] == 1) {
            a(zArr);
            return i6 - 2;
        }
        if (i11 > 2 && zArr[2] && bArr[i6] == 0 && bArr[i6 + 1] == 1) {
            a(zArr);
            return i6 - 1;
        }
        int i12 = i10 - 1;
        int i13 = i6 + 2;
        while (i13 < i12) {
            byte b10 = bArr[i13];
            if ((b10 & 254) == 0) {
                int i14 = i13 - 2;
                if (bArr[i14] == 0 && bArr[i13 - 1] == 0 && b10 == 1) {
                    a(zArr);
                    return i14;
                }
                i13 -= 2;
            }
            i13 += 3;
        }
        if (i11 <= 2 ? !(i11 != 2 ? !zArr[1] || bArr[i12] != 1 : !zArr[2] || bArr[i10 - 2] != 0 || bArr[i12] != 1) : !(bArr[i10 - 3] != 0 || bArr[i10 - 2] != 0 || bArr[i12] != 1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        zArr[0] = z11;
        if (i11 <= 1 ? !(!zArr[2] || bArr[i12] != 0) : !(bArr[i10 - 2] != 0 || bArr[i12] != 0)) {
            z12 = true;
        } else {
            z12 = false;
        }
        zArr[1] = z12;
        if (bArr[i12] == 0) {
            z13 = true;
        }
        zArr[2] = z13;
        return i10;
    }

    public static boolean c(byte[] bArr, int i6, r1.q qVar) {
        int i10;
        if (Objects.equals(qVar.f11670n, MimeTypes.VIDEO_H264)) {
            byte b10 = bArr[4];
            if (((b10 & 96) >> 5) == 0 && ((i10 = b10 & 31) == 1 || i10 == 9 || i10 == 14)) {
                return false;
            }
        } else if (Objects.equals(qVar.f11670n, MimeTypes.VIDEO_H265)) {
            a3.c e10 = e(new u1.s(bArr, 4, i6 + 4));
            int i11 = e10.f521a;
            if (i11 != 35) {
                if (i11 <= 14 && i11 % 2 == 0 && e10.f523c == qVar.E - 1) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static int d(r1.q qVar) {
        if (Objects.equals(qVar.f11670n, MimeTypes.VIDEO_H264)) {
            return 1;
        }
        if (!Objects.equals(qVar.f11670n, MimeTypes.VIDEO_H265) && k0.c(qVar.f11667k, MimeTypes.VIDEO_H265) == null) {
            return 0;
        }
        return 2;
    }

    public static a3.c e(u1.s sVar) {
        sVar.s();
        return new a3.c(sVar.i(6), sVar.i(6), sVar.i(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static v1.h f(u1.s r19, boolean r20, int r21, v1.h r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r20 == 0) goto L42
            int r2 = r0.i(r5)
            boolean r8 = r0.h()
            r9 = 5
            int r9 = r0.i(r9)
            r10 = 0
            r11 = 0
        L1e:
            r12 = 32
            if (r10 >= r12) goto L2e
            boolean r12 = r0.h()
            if (r12 == 0) goto L2b
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 | r12
        L2b:
            int r10 = r10 + 1
            goto L1e
        L2e:
            r10 = 0
        L2f:
            if (r10 >= r3) goto L3a
            int r12 = r0.i(r6)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L2f
        L3a:
            r13 = r2
        L3b:
            r17 = r4
            r14 = r8
            r15 = r9
            r16 = r11
            goto L57
        L42:
            if (r2 == 0) goto L50
            int r3 = r2.f13200a
            boolean r8 = r2.f13201b
            int r9 = r2.f13202c
            int r11 = r2.f13203d
            int[] r4 = r2.f13204e
            r13 = r3
            goto L3b
        L50:
            r17 = r4
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L57:
            int r18 = r0.i(r6)
            r2 = 0
        L5c:
            if (r7 >= r1) goto L71
            boolean r3 = r0.h()
            if (r3 == 0) goto L66
            int r2 = r2 + 88
        L66:
            boolean r3 = r0.h()
            if (r3 == 0) goto L6e
            int r2 = r2 + 8
        L6e:
            int r7 = r7 + 1
            goto L5c
        L71:
            r0.t(r2)
            if (r1 <= 0) goto L7c
            int r6 = r6 - r1
            int r6 = r6 * 2
            r0.t(r6)
        L7c:
            v1.h r12 = new v1.h
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.o.f(u1.s, boolean, int, v1.h):v1.h");
    }

    public static v5.o g(byte[] bArr, int i6, int i10) {
        byte b10;
        int i11;
        int max;
        int max2;
        int i12 = i6 + 2;
        do {
            i10--;
            b10 = bArr[i10];
            if (b10 != 0) {
                break;
            }
        } while (i10 > i12);
        if (b10 != 0 && i10 > i12) {
            u1.s sVar = new u1.s(bArr, i12, i10 + 1);
            while (sVar.d(16)) {
                int i13 = sVar.i(8);
                int i14 = 0;
                while (i13 == 255) {
                    i14 += 255;
                    i13 = sVar.i(8);
                }
                int i15 = i14 + i13;
                int i16 = sVar.i(8);
                int i17 = 0;
                while (i16 == 255) {
                    i17 += 255;
                    i16 = sVar.i(8);
                }
                int i18 = i17 + i16;
                if (i18 != 0 && sVar.d(i18)) {
                    if (i15 == 176) {
                        int m9 = sVar.m();
                        boolean h4 = sVar.h();
                        if (h4) {
                            i11 = sVar.m();
                        } else {
                            i11 = 0;
                        }
                        int m10 = sVar.m();
                        int i19 = -1;
                        for (int i20 = 0; i20 <= m10; i20++) {
                            i19 = sVar.m();
                            sVar.m();
                            int i21 = sVar.i(6);
                            if (i21 != 63) {
                                if (i21 == 0) {
                                    max = Math.max(0, m9 - 30);
                                } else {
                                    max = Math.max(0, (i21 + m9) - 31);
                                }
                                sVar.i(max);
                                if (h4) {
                                    int i22 = sVar.i(6);
                                    if (i22 != 63) {
                                        if (i22 == 0) {
                                            max2 = Math.max(0, i11 - 30);
                                        } else {
                                            max2 = Math.max(0, (i22 + i11) - 31);
                                        }
                                        sVar.i(max2);
                                    } else {
                                        return null;
                                    }
                                }
                                if (sVar.h()) {
                                    sVar.t(10);
                                }
                            } else {
                                return null;
                            }
                        }
                        return new v5.o(i19);
                    }
                    sVar.t(i18 * 8);
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static v1.k h(byte[] r32, int r33, int r34, ic.s r35) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.o.h(byte[], int, int, ic.s):v1.k");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ic.s i(byte[] r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 2131
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.o.i(byte[], int, int):ic.s");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x022c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static v1.n j(byte[] r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.o.j(byte[], int, int):v1.n");
    }

    public static void k(u1.s sVar) {
        int m9 = sVar.m() + 1;
        sVar.t(8);
        for (int i6 = 0; i6 < m9; i6++) {
            sVar.m();
            sVar.m();
            sVar.s();
        }
        sVar.t(20);
    }

    public static ArrayList l(ByteBuffer byteBuffer) {
        int remaining;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            byte b10 = asReadOnlyBuffer.get();
            int i6 = (b10 >> 3) & 15;
            if (((b10 >> 2) & 1) != 0) {
                asReadOnlyBuffer.get();
            }
            if (((b10 >> 1) & 1) != 0) {
                remaining = 0;
                for (int i10 = 0; i10 < 8; i10++) {
                    byte b11 = asReadOnlyBuffer.get();
                    remaining |= (b11 & Byte.MAX_VALUE) << (i10 * 7);
                    if ((b11 & 128) == 0) {
                        break;
                    }
                }
            } else {
                remaining = asReadOnlyBuffer.remaining();
            }
            ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
            duplicate.limit(asReadOnlyBuffer.position() + remaining);
            arrayList.add(new q(i6, duplicate));
            asReadOnlyBuffer.position(asReadOnlyBuffer.position() + remaining);
        }
        return arrayList;
    }

    public static int m(int i6, byte[] bArr) {
        int i10;
        synchronized (f13249c) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i6) {
                while (true) {
                    if (i11 < i6 - 2) {
                        try {
                            if (bArr[i11] == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 3) {
                                break;
                            }
                            i11++;
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else {
                        i11 = i6;
                        break;
                    }
                }
                if (i11 < i6) {
                    int[] iArr = f13250d;
                    if (iArr.length <= i12) {
                        f13250d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f13250d[i12] = i11;
                    i11 += 3;
                    i12++;
                }
            }
            i10 = i6 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = f13250d[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i17 + 2;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i10 - i13);
        }
        return i10;
    }
}
