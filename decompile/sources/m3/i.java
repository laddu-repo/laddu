package m3;

import db.c1;
import db.h0;
import i4.u0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import okhttp3.HttpUrl;
import r1.j0;
import r1.k0;
import u1.a0;
import u1.s;
import u1.t;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i extends c9.a {

    /* renamed from: e, reason: collision with root package name */
    public static final u0 f8581e = new u0(23);

    /* renamed from: d, reason: collision with root package name */
    public final g f8582d;

    public i(g gVar) {
        this.f8582d = gVar;
    }

    public static d A(t tVar, int i6, int i10, boolean z10, int i11, g gVar) {
        boolean z11;
        boolean z12;
        int i12 = tVar.f12812b;
        int Q = Q(i12, tVar.f12811a);
        String str = new String(tVar.f12811a, i12, Q - i12, StandardCharsets.ISO_8859_1);
        tVar.K(Q + 1);
        int y9 = tVar.y();
        if ((y9 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((y9 & 1) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        int y10 = tVar.y();
        String[] strArr = new String[y10];
        for (int i13 = 0; i13 < y10; i13++) {
            int i14 = tVar.f12812b;
            int Q2 = Q(i14, tVar.f12811a);
            strArr[i13] = new String(tVar.f12811a, i14, Q2 - i14, StandardCharsets.ISO_8859_1);
            tVar.K(Q2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i15 = i12 + i6;
        while (tVar.f12812b < i15) {
            j C = C(i10, tVar, z10, i11, gVar);
            if (C != null) {
                arrayList.add(C);
            }
        }
        return new d(str, z11, z12, strArr, (j[]) arrayList.toArray(new j[0]));
    }

    public static e B(int i6, t tVar) {
        if (i6 < 4) {
            return null;
        }
        int y9 = tVar.y();
        Charset N = N(y9);
        byte[] bArr = new byte[3];
        tVar.i(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i10 = i6 - 4;
        byte[] bArr2 = new byte[i10];
        tVar.i(bArr2, 0, i10);
        int P = P(bArr2, 0, y9);
        String str2 = new String(bArr2, 0, P, N);
        int M = M(y9) + P;
        return new e(str, str2, G(bArr2, M, P(bArr2, M, y9), N));
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x01b2, code lost:
    
        if (r5 == 67) goto L142;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0251  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [m3.j] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [u1.t] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static m3.j C(int r19, u1.t r20, boolean r21, int r22, m3.g r23) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.i.C(int, u1.t, boolean, int, m3.g):m3.j");
    }

    public static f D(int i6, t tVar) {
        byte[] copyOfRange;
        int y9 = tVar.y();
        Charset N = N(y9);
        int i10 = i6 - 1;
        byte[] bArr = new byte[i10];
        tVar.i(bArr, 0, i10);
        int Q = Q(0, bArr);
        String p10 = k0.p(new String(bArr, 0, Q, StandardCharsets.ISO_8859_1));
        int i11 = Q + 1;
        int P = P(bArr, i11, y9);
        String G = G(bArr, i11, P, N);
        int M = M(y9) + P;
        int P2 = P(bArr, M, y9);
        String G2 = G(bArr, M, P2, N);
        int M2 = M(y9) + P2;
        if (i10 <= M2) {
            copyOfRange = a0.f12751b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, M2, i10);
        }
        return new f(p10, G, G2, copyOfRange);
    }

    public static m E(int i6, t tVar) {
        int E = tVar.E();
        int B = tVar.B();
        int B2 = tVar.B();
        int y9 = tVar.y();
        int y10 = tVar.y();
        s sVar = new s();
        sVar.p(tVar);
        int i10 = ((i6 - 10) * 8) / (y9 + y10);
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = sVar.i(y9);
            int i13 = sVar.i(y10);
            iArr[i11] = i12;
            iArr2[i11] = i13;
        }
        return new m(E, B, B2, iArr, iArr2);
    }

    public static n F(int i6, t tVar) {
        byte[] copyOfRange;
        byte[] bArr = new byte[i6];
        tVar.i(bArr, 0, i6);
        int Q = Q(0, bArr);
        String str = new String(bArr, 0, Q, StandardCharsets.ISO_8859_1);
        int i10 = Q + 1;
        if (i6 <= i10) {
            copyOfRange = a0.f12751b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, i10, i6);
        }
        return new n(str, copyOfRange);
    }

    public static String G(byte[] bArr, int i6, int i10, Charset charset) {
        if (i10 > i6 && i10 <= bArr.length) {
            return new String(bArr, i6, i10 - i6, charset);
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public static o H(int i6, String str, t tVar) {
        if (i6 < 1) {
            return null;
        }
        int y9 = tVar.y();
        int i10 = i6 - 1;
        byte[] bArr = new byte[i10];
        tVar.i(bArr, 0, i10);
        return new o(str, null, I(bArr, y9, 0));
    }

    public static c1 I(byte[] bArr, int i6, int i10) {
        if (i10 >= bArr.length) {
            return db.k0.o(HttpUrl.FRAGMENT_ENCODE_SET);
        }
        h0 j = db.k0.j();
        int P = P(bArr, i10, i6);
        while (i10 < P) {
            j.a(new String(bArr, i10, P - i10, N(i6)));
            i10 = M(i6) + P;
            P = P(bArr, i10, i6);
        }
        c1 g10 = j.g();
        if (g10.isEmpty()) {
            return db.k0.o(HttpUrl.FRAGMENT_ENCODE_SET);
        }
        return g10;
    }

    public static o J(int i6, t tVar) {
        if (i6 < 1) {
            return null;
        }
        int y9 = tVar.y();
        int i10 = i6 - 1;
        byte[] bArr = new byte[i10];
        tVar.i(bArr, 0, i10);
        int P = P(bArr, 0, y9);
        return new o("TXXX", new String(bArr, 0, P, N(y9)), I(bArr, y9, M(y9) + P));
    }

    public static p K(int i6, String str, t tVar) {
        byte[] bArr = new byte[i6];
        tVar.i(bArr, 0, i6);
        return new p(str, null, new String(bArr, 0, Q(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static p L(int i6, t tVar) {
        if (i6 < 1) {
            return null;
        }
        int y9 = tVar.y();
        int i10 = i6 - 1;
        byte[] bArr = new byte[i10];
        tVar.i(bArr, 0, i10);
        int P = P(bArr, 0, y9);
        String str = new String(bArr, 0, P, N(y9));
        int M = M(y9) + P;
        return new p("WXXX", str, G(bArr, M, Q(M, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int M(int i6) {
        if (i6 != 0 && i6 != 3) {
            return 2;
        }
        return 1;
    }

    public static Charset N(int i6) {
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    return StandardCharsets.ISO_8859_1;
                }
                return StandardCharsets.UTF_8;
            }
            return StandardCharsets.UTF_16BE;
        }
        return StandardCharsets.UTF_16;
    }

    public static String O(int i6, int i10, int i11, int i12, int i13) {
        if (i6 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static int P(byte[] bArr, int i6, int i10) {
        int Q = Q(i6, bArr);
        if (i10 != 0 && i10 != 3) {
            while (Q < bArr.length - 1) {
                if ((Q - i6) % 2 == 0 && bArr[Q + 1] == 0) {
                    return Q;
                }
                Q = Q(Q + 1, bArr);
            }
            return bArr.length;
        }
        return Q;
    }

    public static int Q(int i6, byte[] bArr) {
        while (i6 < bArr.length) {
            if (bArr[i6] == 0) {
                return i6;
            }
            i6++;
        }
        return bArr.length;
    }

    public static int R(int i6, t tVar) {
        byte[] bArr = tVar.f12811a;
        int i10 = tVar.f12812b;
        int i11 = i10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 < i10 + i6) {
                if ((bArr[i11] & 255) == 255 && bArr[i12] == 0) {
                    System.arraycopy(bArr, i11 + 2, bArr, i12, (i6 - (i11 - i10)) - 2);
                    i6--;
                }
                i11 = i12;
            } else {
                return i6;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0085, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean S(u1.t r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f12812b
        L6:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Laa
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.k()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.A()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.E()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lae
        L23:
            int r7 = r1.B()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.B()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = 0
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.K(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L4c
            r1.K(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7a
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = 1
            goto L75
        L74:
            r3 = 0
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L89
            goto L8a
        L7a:
            if (r0 != r3) goto L88
            r3 = r10 & 32
            if (r3 == 0) goto L82
            r3 = 1
            goto L83
        L82:
            r3 = 0
        L83:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L89
            goto L8a
        L88:
            r3 = 0
        L89:
            r4 = 0
        L8a:
            if (r4 == 0) goto L8e
            int r3 = r3 + 4
        L8e:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L97
            r1.K(r2)
            return r6
        L97:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto La4
            r1.K(r2)
            return r6
        La4:
            int r3 = (int) r8
            r1.L(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Laa:
            r1.K(r2)
            return r4
        Lae:
            r1.K(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.i.S(u1.t, int, int, boolean):boolean");
    }

    public static a y(t tVar, int i6, int i10) {
        int Q;
        String str;
        byte[] copyOfRange;
        int y9 = tVar.y();
        Charset N = N(y9);
        int i11 = i6 - 1;
        byte[] bArr = new byte[i11];
        tVar.i(bArr, 0, i11);
        if (i10 == 2) {
            str = "image/" + dg.b.p(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            Q = 2;
        } else {
            Q = Q(0, bArr);
            String p10 = dg.b.p(new String(bArr, 0, Q, StandardCharsets.ISO_8859_1));
            if (p10.indexOf(47) == -1) {
                str = "image/".concat(p10);
            } else {
                str = p10;
            }
        }
        int i12 = bArr[Q + 1] & 255;
        int i13 = Q + 2;
        int P = P(bArr, i13, y9);
        String str2 = new String(bArr, i13, P - i13, N);
        int M = M(y9) + P;
        if (i11 <= M) {
            copyOfRange = a0.f12751b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, M, i11);
        }
        return new a(str, str2, i12, copyOfRange);
    }

    public static c z(t tVar, int i6, int i10, boolean z10, int i11, g gVar) {
        long j;
        int i12 = tVar.f12812b;
        int Q = Q(i12, tVar.f12811a);
        String str = new String(tVar.f12811a, i12, Q - i12, StandardCharsets.ISO_8859_1);
        tVar.K(Q + 1);
        int k8 = tVar.k();
        int k9 = tVar.k();
        long A = tVar.A();
        if (A == 4294967295L) {
            A = -1;
        }
        long A2 = tVar.A();
        if (A2 == 4294967295L) {
            j = -1;
        } else {
            j = A2;
        }
        ArrayList arrayList = new ArrayList();
        int i13 = i12 + i6;
        while (tVar.f12812b < i13) {
            j C = C(i10, tVar, z10, i11, gVar);
            if (C != null) {
                arrayList.add(C);
            }
        }
        return new c(str, k8, k9, A, j, (j[]) arrayList.toArray(new j[0]));
    }

    @Override // c9.a
    public final j0 e(h3.a aVar, ByteBuffer byteBuffer) {
        return x(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final r1.j0 x(int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.i.x(int, byte[]):r1.j0");
    }
}
