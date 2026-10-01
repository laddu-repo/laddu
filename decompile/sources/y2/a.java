package y2;

import android.util.Base64;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.UnityAdsConstants;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import i4.u0;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import r1.j0;
import r1.l0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f14826a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f14827b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f14828c = {1, 2, 3, 6};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f14829d = {48000, 44100, 32000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f14830e = {24000, 22050, 16000};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f14831f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f14832g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f14833h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f14834i = {2002, 2000, 1920, 1601, 1600, WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, 960, 800, 800, 480, CommonGatewayClient.CODE_400, CommonGatewayClient.CODE_400, 2048};
    public static final int[] j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f14835k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f14836l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, CodedOutputStream.DEFAULT_BUFFER_SIZE, 6144, 7680};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f14837m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f14838n = {5, 8, 10, 12};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f14839o = {6, 9, 12, 15};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f14840p = {2, 4, 6, 8};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f14841q = {9, 11, 13, 16};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f14842r = {5, 8, 10, 12};
    public static final String[] s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f14843t = {44100, 48000, 32000};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f14844u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f14845v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f14846w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f14847x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f14848y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static void A(u1.s sVar) {
        int i6 = sVar.i(6);
        if (i6 >= 2 && i6 <= 42) {
            sVar.t(i6 * 8);
            return;
        }
        throw l0.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(i6)));
    }

    public static boolean B(int i6, u1.t tVar, boolean z10) {
        if (tVar.a() < 7) {
            if (!z10) {
                throw l0.a(null, "too short header: " + tVar.a());
            }
            return false;
        }
        if (tVar.y() != i6) {
            if (!z10) {
                throw l0.a(null, "expected header type " + Integer.toHexString(i6));
            }
            return false;
        }
        if (tVar.y() == 118 && tVar.y() == 111 && tVar.y() == 114 && tVar.y() == 98 && tVar.y() == 105 && tVar.y() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw l0.a(null, "expected characters 'vorbis'");
    }

    public static byte[] a(int i6, int i10) {
        int i11 = -1;
        for (int i12 = 0; i12 < 13; i12++) {
            if (i6 == f14826a[i12]) {
                i11 = i12;
            }
        }
        int i13 = -1;
        for (int i14 = 0; i14 < 16; i14++) {
            if (i10 == f14827b[i14]) {
                i13 = i14;
            }
        }
        if (i6 != -1 && i13 != -1) {
            return b(2, i11, i13);
        }
        throw new IllegalArgumentException(h8.c.l("Invalid sample rate or number of channels: ", ", ", i6, i10));
    }

    public static byte[] b(int i6, int i10, int i11) {
        return new byte[]{(byte) (((i6 << 3) & 248) | ((i10 >> 1) & 7)), (byte) (((i10 << 7) & 128) | ((i11 << 3) & 120))};
    }

    public static ArrayList c(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        if (r8 == r20.f14936f) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        if ((r19.y() * com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT) == r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
    
        if (r4 == r3) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(u1.t r19, y2.s r20, int r21, mc.i r22) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.a.d(u1.t, y2.s, int, mc.i):boolean");
    }

    public static void e(String str, boolean z10) {
        if (z10) {
        } else {
            throw l0.a(null, str);
        }
    }

    public static void f(long j10, u1.t tVar, f0[] f0VarArr) {
        int i6;
        int i10;
        boolean z10;
        while (true) {
            boolean z11 = true;
            if (tVar.a() > 1) {
                int i11 = 0;
                while (true) {
                    if (tVar.a() == 0) {
                        i6 = -1;
                        break;
                    }
                    int y9 = tVar.y();
                    i11 += y9;
                    if (y9 != 255) {
                        i6 = i11;
                        break;
                    }
                }
                int i12 = 0;
                while (true) {
                    if (tVar.a() == 0) {
                        i12 = -1;
                        break;
                    }
                    int y10 = tVar.y();
                    i12 += y10;
                    if (y10 != 255) {
                        break;
                    }
                }
                int i13 = tVar.f12812b + i12;
                if (i12 != -1 && i12 <= tVar.a()) {
                    if (i6 == 4 && i12 >= 8) {
                        int y11 = tVar.y();
                        int E = tVar.E();
                        if (E == 49) {
                            i10 = tVar.k();
                        } else {
                            i10 = 0;
                        }
                        int y12 = tVar.y();
                        if (E == 47) {
                            tVar.L(1);
                        }
                        if (y11 == 181 && ((E == 49 || E == 47) && y12 == 3)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (E == 49) {
                            if (i10 != 1195456820) {
                                z11 = false;
                            }
                            z10 &= z11;
                        }
                        if (z10) {
                            g(j10, tVar, f0VarArr);
                        }
                    }
                } else {
                    u1.a.p("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i13 = tVar.f12813c;
                }
                tVar.K(i13);
            } else {
                return;
            }
        }
    }

    public static void g(long j10, u1.t tVar, f0[] f0VarArr) {
        boolean z10;
        int y9 = tVar.y();
        if ((y9 & 64) != 0) {
            tVar.L(1);
            int i6 = (y9 & 31) * 3;
            int i10 = tVar.f12812b;
            for (f0 f0Var : f0VarArr) {
                tVar.K(i10);
                f0Var.a(i6, tVar);
                if (j10 != -9223372036854775807L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u1.c.g(z10);
                f0Var.c(j10, 1, i6, 0, null);
            }
        }
    }

    public static int h(int i6, int i10) {
        int i11 = i10 / 2;
        if (i6 >= 0 && i6 < 3 && i10 >= 0 && i11 < 19) {
            int i12 = f14829d[i6];
            if (i12 == 44100) {
                return ((i10 % 2) + f14833h[i11]) * 2;
            }
            int i13 = f14832g[i11];
            if (i12 == 32000) {
                return i13 * 6;
            }
            return i13 * 4;
        }
        return -1;
    }

    public static void i(int i6, u1.t tVar) {
        tVar.H(7);
        byte[] bArr = tVar.f12811a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i6 >> 16) & 255);
        bArr[5] = (byte) ((i6 >> 8) & 255);
        bArr[6] = (byte) (i6 & 255);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int j(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = 1
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.a.j(byte[]):int");
    }

    public static int k(int i6) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if ((i6 & (-2097152)) != -2097152 || (i10 = (i6 >>> 19) & 3) == 1 || (i11 = (i6 >>> 17) & 3) == 0 || (i12 = (i6 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i6 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f14843t[i13];
        if (i10 == 2) {
            i16 /= 2;
        } else if (i10 == 0) {
            i16 /= 4;
        }
        int i17 = (i6 >>> 9) & 1;
        if (i11 == 3) {
            if (i10 == 3) {
                i15 = f14844u[i12 - 1];
            } else {
                i15 = f14845v[i12 - 1];
            }
            return (((i15 * 12) / i16) + i17) * 4;
        }
        if (i10 == 3) {
            if (i11 == 2) {
                i14 = f14846w[i12 - 1];
            } else {
                i14 = f14847x[i12 - 1];
            }
        } else {
            i14 = f14848y[i12 - 1];
        }
        int i18 = 144;
        if (i10 == 3) {
            return ((i14 * 144) / i16) + i17;
        }
        if (i11 == 1) {
            i18 = 72;
        }
        return ((i18 * i14) / i16) + i17;
    }

    public static int l(int i6) {
        if (i6 != 20) {
            if (i6 != 30) {
                switch (i6) {
                    case 5:
                        return 80000;
                    case 6:
                        return 768000;
                    case 7:
                        return 192000;
                    case 8:
                        return 2250000;
                    case 9:
                        return 40000;
                    case 10:
                        return 100000;
                    case 11:
                        return 16000;
                    case 12:
                        return 7000;
                    default:
                        switch (i6) {
                            case 14:
                                return 3062500;
                            case 15:
                                return 8000;
                            case 16:
                                return 256000;
                            case 17:
                                return 336000;
                            case 18:
                                return 768000;
                            default:
                                return -2147483647;
                        }
                }
            }
            return 2250000;
        }
        return 63750;
    }

    public static u1.s m(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 != Byte.MAX_VALUE && b10 != 100 && b10 != 64 && b10 != 113) {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b11 = copyOf[0];
            if (b11 == -2 || b11 == -1 || b11 == 37 || b11 == -14 || b11 == -24) {
                for (int i6 = 0; i6 < copyOf.length - 1; i6 += 2) {
                    byte b12 = copyOf[i6];
                    int i10 = i6 + 1;
                    copyOf[i6] = copyOf[i10];
                    copyOf[i10] = b12;
                }
            }
            u1.s sVar = new u1.s(copyOf.length, copyOf);
            if (copyOf[0] == 31) {
                u1.s sVar2 = new u1.s(copyOf.length, copyOf);
                while (sVar2.b() >= 16) {
                    sVar2.t(2);
                    int i11 = sVar2.i(14) & 16383;
                    int min = Math.min(8 - sVar.f12806d, 14);
                    int i12 = sVar.f12806d;
                    int i13 = (8 - i12) - min;
                    byte[] bArr2 = sVar.f12804b;
                    int i14 = sVar.f12805c;
                    byte b13 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr2[i14]);
                    bArr2[i14] = b13;
                    int i15 = 14 - min;
                    bArr2[i14] = (byte) (b13 | ((i11 >>> i15) << i13));
                    int i16 = i14 + 1;
                    while (i15 > 8) {
                        sVar.f12804b[i16] = (byte) (i11 >>> (i15 - 8));
                        i15 -= 8;
                        i16++;
                    }
                    int i17 = 8 - i15;
                    byte[] bArr3 = sVar.f12804b;
                    byte b14 = (byte) (bArr3[i16] & ((1 << i17) - 1));
                    bArr3[i16] = b14;
                    bArr3[i16] = (byte) (((i11 & ((1 << i15) - 1)) << i17) | b14);
                    sVar.t(14);
                    sVar.a();
                }
            }
            sVar.o(copyOf.length, copyOf);
            return sVar;
        }
        return new u1.s(bArr.length, bArr);
    }

    public static long n(byte b10, byte b11) {
        int i6;
        int i10;
        int i11 = b10 & 255;
        int i12 = b10 & 3;
        if (i12 != 0) {
            i6 = 2;
            if (i12 != 1 && i12 != 2) {
                i6 = b11 & 63;
            }
        } else {
            i6 = 1;
        }
        int i13 = i11 >> 3;
        int i14 = i13 & 3;
        if (i13 >= 16) {
            i10 = UnityAdsConstants.RequestPolicy.RETRY_MAX_INTERVAL << i14;
        } else if (i13 >= 12) {
            i10 = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS << (i13 & 1);
        } else if (i14 == 3) {
            i10 = 60000;
        } else {
            i10 = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS << i14;
        }
        return i6 * i10;
    }

    public static int o(u1.s sVar) {
        int i6 = sVar.i(4);
        if (i6 == 15) {
            if (sVar.b() >= 24) {
                return sVar.i(24);
            }
            throw l0.a(null, "AAC header insufficient data");
        }
        if (i6 < 13) {
            return f14826a[i6];
        }
        throw l0.a(null, "AAC header wrong Sampling Frequency Index");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static y2.b p(u1.s r21) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.a.p(u1.s):y2.b");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r9.h() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r2 = r9.i(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r9.h() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r9.i(3) <= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        r9.t(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r9.h() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r5 = 48000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        r9 = r9.i(4);
        r8 = y2.a.f14834i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r5 != 44100) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (r9 != 13) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        r9 = r8[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
    
        return new a3.c(r5, r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        if (r5 != 48000) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (r9 >= 14) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        r6 = r8[r9];
        r2 = r2 % 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (r2 == 1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        if (r2 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        if (r2 == 3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        if (r2 == 4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
    
        if (r9 == 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        if (r9 == 8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0087, code lost:
    
        r9 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008a, code lost:
    
        if (r9 == 8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008f, code lost:
    
        if (r9 == 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0091, code lost:
    
        if (r9 != 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0096, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0057, code lost:
    
        r5 = 44100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r9.i(2) == 3) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r9.i(2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static a3.c q(u1.s r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.i(r0)
            r2 = 7
            goto L19
        L18:
            r2 = 4
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L47
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L47
            r9.t(r1)
        L47:
            boolean r5 = r9.h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L57
            r5 = 48000(0xbb80, float:6.7262E-41)
            goto L5a
        L57:
            r5 = 44100(0xac44, float:6.1797E-41)
        L5a:
            int r9 = r9.i(r3)
            int[] r8 = y2.a.f14834i
            if (r5 != r6) goto L69
            r6 = 13
            if (r9 != r6) goto L69
            r9 = r8[r9]
            goto L97
        L69:
            if (r5 != r7) goto L96
            r6 = 14
            if (r9 >= r6) goto L96
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 8
            r8 = 1
            if (r2 == r8) goto L8f
            r8 = 11
            if (r2 == r1) goto L8a
            if (r2 == r4) goto L8f
            if (r2 == r3) goto L81
            goto L94
        L81:
            if (r9 == r4) goto L87
            if (r9 == r7) goto L87
            if (r9 != r8) goto L94
        L87:
            int r9 = r6 + 1
            goto L97
        L8a:
            if (r9 == r7) goto L87
            if (r9 != r8) goto L94
            goto L87
        L8f:
            if (r9 == r4) goto L87
            if (r9 != r7) goto L94
            goto L87
        L94:
            r9 = r6
            goto L97
        L96:
            r9 = 0
        L97:
            a3.c r1 = new a3.c
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.a.q(u1.s):a3.c");
    }

    public static jd.s r(u1.s sVar, boolean z10) {
        int i6 = sVar.i(5);
        if (i6 == 31) {
            i6 = sVar.i(6) + 32;
        }
        int o10 = o(sVar);
        int i10 = sVar.i(4);
        String i11 = h8.c.i(i6, "mp4a.40.");
        if (i6 == 5 || i6 == 29) {
            o10 = o(sVar);
            int i12 = sVar.i(5);
            if (i12 == 31) {
                i12 = sVar.i(6) + 32;
            }
            i6 = i12;
            if (i6 == 22) {
                i10 = sVar.i(4);
            }
        }
        if (z10) {
            if (i6 != 1 && i6 != 2 && i6 != 3 && i6 != 4 && i6 != 6 && i6 != 7 && i6 != 17) {
                switch (i6) {
                    case 19:
                    case 20:
                    case 21:
                    case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                    case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
                        break;
                    default:
                        throw l0.c("Unsupported audio object type: " + i6);
                }
            }
            if (sVar.h()) {
                u1.a.p("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (sVar.h()) {
                sVar.t(14);
            }
            boolean h4 = sVar.h();
            if (i10 != 0) {
                if (i6 == 6 || i6 == 20) {
                    sVar.t(3);
                }
                if (h4) {
                    if (i6 == 22) {
                        sVar.t(16);
                    }
                    if (i6 == 17 || i6 == 19 || i6 == 20 || i6 == 23) {
                        sVar.t(3);
                    }
                    sVar.t(1);
                }
                switch (i6) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                    case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
                        int i13 = sVar.i(2);
                        if (i13 == 2 || i13 == 3) {
                            throw l0.c("Unsupported epConfig: " + i13);
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i14 = f14827b[i10];
        if (i14 != -1) {
            return new jd.s(i11, o10, i14);
        }
        throw l0.a(null, null);
    }

    public static void s(u1.s sVar, c cVar) {
        int i6 = sVar.i(5);
        sVar.t(2);
        if (sVar.h()) {
            sVar.t(5);
        }
        if (i6 >= 7 && i6 <= 10) {
            sVar.s();
        }
        if (sVar.h()) {
            int i10 = sVar.i(3);
            if (cVar.f14866b == -1 && i6 >= 0 && i6 <= 15 && (i10 == 0 || i10 == 1)) {
                cVar.f14866b = i6;
            }
            if (sVar.h()) {
                A(sVar);
            }
        }
    }

    public static void t(u1.s sVar, c cVar) {
        sVar.t(2);
        boolean h4 = sVar.h();
        int i6 = sVar.i(8);
        for (int i10 = 0; i10 < i6; i10++) {
            sVar.t(2);
            if (sVar.h()) {
                sVar.t(5);
            }
            if (h4) {
                sVar.t(24);
            } else {
                if (sVar.h()) {
                    if (!sVar.h()) {
                        sVar.t(4);
                    }
                    cVar.f14867c = sVar.i(6) + 1;
                }
                sVar.t(4);
            }
        }
        if (sVar.h()) {
            sVar.t(3);
            if (sVar.h()) {
                A(sVar);
            }
        }
    }

    public static int u(u1.s sVar, int[] iArr) {
        int i6 = 0;
        for (int i10 = 0; i10 < 3 && sVar.h(); i10++) {
            i6++;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i6; i12++) {
            i11 += 1 << iArr[i12];
        }
        return sVar.i(iArr[i6]) + i11;
    }

    public static j0 v(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < list.size(); i6++) {
            String str = (String) list.get(i6);
            String str2 = u1.a0.f12750a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                u1.a.p("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(k3.a.d(new u1.t(Base64.decode(split[1], 0))));
                } catch (RuntimeException e10) {
                    u1.a.q("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new p3.a(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new j0(arrayList);
    }

    public static j0 w(p pVar, boolean z10) {
        u0 u0Var;
        if (z10) {
            u0Var = null;
        } else {
            u0Var = m3.i.f8581e;
        }
        u1.t tVar = new u1.t(10);
        j0 j0Var = null;
        int i6 = 0;
        while (true) {
            try {
                pVar.C(tVar.f12811a, 0, 10);
                tVar.K(0);
                if (tVar.B() != 4801587) {
                    break;
                }
                tVar.L(3);
                int x10 = tVar.x();
                int i10 = x10 + 10;
                if (j0Var == null) {
                    byte[] bArr = new byte[i10];
                    System.arraycopy(tVar.f12811a, 0, bArr, 0, 10);
                    pVar.C(bArr, 10, x10);
                    j0Var = new m3.i(u0Var).x(i10, bArr);
                } else {
                    pVar.o(x10);
                }
                i6 += i10;
            } catch (EOFException unused) {
            }
        }
        pVar.v();
        pVar.o(i6);
        if (j0Var == null || j0Var.f11523a.length == 0) {
            return null;
        }
        return j0Var;
    }

    public static int x(int i6, u1.t tVar) {
        switch (i6) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i6 - 2);
            case 6:
                return tVar.y() + 1;
            case 7:
                return tVar.E() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i6 - 8);
            default:
                return -1;
        }
    }

    public static y1.c y(u1.t tVar) {
        tVar.L(1);
        int B = tVar.B();
        long j10 = tVar.f12812b + B;
        int i6 = B / 18;
        long[] jArr = new long[i6];
        long[] jArr2 = new long[i6];
        int i10 = 0;
        while (true) {
            if (i10 >= i6) {
                break;
            }
            long s7 = tVar.s();
            if (s7 == -1) {
                jArr = Arrays.copyOf(jArr, i10);
                jArr2 = Arrays.copyOf(jArr2, i10);
                break;
            }
            jArr[i10] = s7;
            jArr2[i10] = tVar.s();
            tVar.L(2);
            i10++;
        }
        tVar.L((int) (j10 - tVar.f12812b));
        return new y1.c(jArr, jArr2);
    }

    public static v9.b z(u1.t tVar, boolean z10, boolean z11) {
        if (z10) {
            B(3, tVar, false);
        }
        tVar.w((int) tVar.p(), StandardCharsets.UTF_8);
        long p10 = tVar.p();
        String[] strArr = new String[(int) p10];
        for (int i6 = 0; i6 < p10; i6++) {
            strArr[i6] = tVar.w((int) tVar.p(), StandardCharsets.UTF_8);
        }
        if (z11 && (tVar.y() & 1) == 0) {
            throw l0.a(null, "framing bit expected to be set");
        }
        return new v9.b(strArr);
    }
}
