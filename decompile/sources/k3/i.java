package k3;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import t1.e0;
import t1.f0;
import w1.b0;
import w1.t;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i extends u1.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d2.e f7319c = new d2.e(29);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f7320b;

    public i(g gVar) {
        this.f7320b = gVar;
    }

    public static a I(t tVar, int i, int i10) {
        int iA0;
        String strConcat;
        int iX = tVar.x();
        Charset charsetX = X(iX);
        int i11 = i - 1;
        byte[] bArr = new byte[i11];
        tVar.h(bArr, 0, i11);
        if (i10 == 2) {
            strConcat = "image/" + com.bumptech.glide.f.U(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iA0 = 2;
        } else {
            iA0 = a0(0, bArr);
            String strU = com.bumptech.glide.f.U(new String(bArr, 0, iA0, StandardCharsets.ISO_8859_1));
            strConcat = strU.indexOf(47) == -1 ? "image/".concat(strU) : strU;
        }
        int i12 = bArr[iA0 + 1] & 255;
        int i13 = iA0 + 2;
        int iZ = Z(bArr, i13, iX);
        String str = new String(bArr, i13, iZ - i13, charsetX);
        int iW = W(iX) + iZ;
        return new a(strConcat, str, i12, i11 <= iW ? b0.f13688c : Arrays.copyOfRange(bArr, iW, i11));
    }

    public static c J(t tVar, int i, int i10, boolean z2, int i11, g gVar) throws Throwable {
        int i12 = tVar.f13739b;
        int iA0 = a0(i12, tVar.f13738a);
        String str = new String(tVar.f13738a, i12, iA0 - i12, StandardCharsets.ISO_8859_1);
        tVar.J(iA0 + 1);
        int iJ = tVar.j();
        int iJ2 = tVar.j();
        long jZ = tVar.z();
        if (jZ == 4294967295L) {
            jZ = -1;
        }
        long jZ2 = tVar.z();
        long j8 = jZ2 == 4294967295L ? -1L : jZ2;
        ArrayList arrayList = new ArrayList();
        int i13 = i12 + i;
        while (tVar.f13739b < i13) {
            j jVarM = M(i10, tVar, z2, i11, gVar);
            if (jVarM != null) {
                arrayList.add(jVarM);
            }
        }
        return new c(str, iJ, iJ2, jZ, j8, (j[]) arrayList.toArray(new j[0]));
    }

    public static d K(t tVar, int i, int i10, boolean z2, int i11, g gVar) throws Throwable {
        int i12 = tVar.f13739b;
        int iA0 = a0(i12, tVar.f13738a);
        String str = new String(tVar.f13738a, i12, iA0 - i12, StandardCharsets.ISO_8859_1);
        tVar.J(iA0 + 1);
        int iX = tVar.x();
        boolean z10 = (iX & 2) != 0;
        boolean z11 = (iX & 1) != 0;
        int iX2 = tVar.x();
        String[] strArr = new String[iX2];
        for (int i13 = 0; i13 < iX2; i13++) {
            int i14 = tVar.f13739b;
            int iA02 = a0(i14, tVar.f13738a);
            strArr[i13] = new String(tVar.f13738a, i14, iA02 - i14, StandardCharsets.ISO_8859_1);
            tVar.J(iA02 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i15 = i12 + i;
        while (tVar.f13739b < i15) {
            j jVarM = M(i10, tVar, z2, i11, gVar);
            if (jVarM != null) {
                arrayList.add(jVarM);
            }
        }
        return new d(str, z10, z11, strArr, (j[]) arrayList.toArray(new j[0]));
    }

    public static e L(int i, t tVar) {
        if (i < 4) {
            return null;
        }
        int iX = tVar.x();
        Charset charsetX = X(iX);
        byte[] bArr = new byte[3];
        tVar.h(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i10 = i - 4;
        byte[] bArr2 = new byte[i10];
        tVar.h(bArr2, 0, i10);
        int iZ = Z(bArr2, 0, iX);
        String str2 = new String(bArr2, 0, iZ, charsetX);
        int iW = W(iX) + iZ;
        return new e(str, str2, Q(bArr2, iW, Z(bArr2, iW, iX), charsetX));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x022f A[Catch: all -> 0x0216, Exception -> 0x0218, OutOfMemoryError -> 0x021a, TRY_LEAVE, TryCatch #8 {Exception -> 0x0218, OutOfMemoryError -> 0x021a, all -> 0x0216, blocks: (B:171:0x0211, B:184:0x022a, B:185:0x022f), top: B:199:0x01ff }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0251  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [k3.j] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [w1.t] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [w1.t] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [w1.t] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static k3.j M(int r19, w1.t r20, boolean r21, int r22, k3.g r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.i.M(int, w1.t, boolean, int, k3.g):k3.j");
    }

    public static f N(int i, t tVar) {
        int iX = tVar.x();
        Charset charsetX = X(iX);
        int i10 = i - 1;
        byte[] bArr = new byte[i10];
        tVar.h(bArr, 0, i10);
        int iA0 = a0(0, bArr);
        String strP = f0.p(new String(bArr, 0, iA0, StandardCharsets.ISO_8859_1));
        int i11 = iA0 + 1;
        int iZ = Z(bArr, i11, iX);
        String strQ = Q(bArr, i11, iZ, charsetX);
        int iW = W(iX) + iZ;
        int iZ2 = Z(bArr, iW, iX);
        String strQ2 = Q(bArr, iW, iZ2, charsetX);
        int iW2 = W(iX) + iZ2;
        return new f(strP, strQ, strQ2, i10 <= iW2 ? b0.f13688c : Arrays.copyOfRange(bArr, iW2, i10));
    }

    public static m O(int i, t tVar) {
        int iD = tVar.D();
        int iA = tVar.A();
        int iA2 = tVar.A();
        int iX = tVar.x();
        int iX2 = tVar.x();
        u3.f fVar = new u3.f();
        fVar.p(tVar);
        int i10 = ((i - 10) * 8) / (iX + iX2);
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = fVar.i(iX);
            int i13 = fVar.i(iX2);
            iArr[i11] = i12;
            iArr2[i11] = i13;
        }
        return new m(iD, iA, iA2, iArr, iArr2);
    }

    public static n P(int i, t tVar) {
        byte[] bArr = new byte[i];
        tVar.h(bArr, 0, i);
        int iA0 = a0(0, bArr);
        String str = new String(bArr, 0, iA0, StandardCharsets.ISO_8859_1);
        int i10 = iA0 + 1;
        return new n(str, i <= i10 ? b0.f13688c : Arrays.copyOfRange(bArr, i10, i));
    }

    public static String Q(byte[] bArr, int i, int i10, Charset charset) {
        return (i10 <= i || i10 > bArr.length) ? "" : new String(bArr, i, i10 - i, charset);
    }

    public static o R(int i, String str, t tVar) {
        if (i < 1) {
            return null;
        }
        int iX = tVar.x();
        int i10 = i - 1;
        byte[] bArr = new byte[i10];
        tVar.h(bArr, 0, i10);
        return new o(str, null, S(bArr, iX, 0));
    }

    public static z0 S(byte[] bArr, int i, int i10) {
        if (i10 >= bArr.length) {
            return y9.f0.q("");
        }
        y9.b0 b0VarJ = y9.f0.j();
        int iZ = Z(bArr, i10, i);
        while (i10 < iZ) {
            b0VarJ.a(new String(bArr, i10, iZ - i10, X(i)));
            i10 = W(i) + iZ;
            iZ = Z(bArr, i10, i);
        }
        z0 z0VarG = b0VarJ.g();
        return z0VarG.isEmpty() ? y9.f0.q("") : z0VarG;
    }

    public static o T(int i, t tVar) {
        if (i < 1) {
            return null;
        }
        int iX = tVar.x();
        int i10 = i - 1;
        byte[] bArr = new byte[i10];
        tVar.h(bArr, 0, i10);
        int iZ = Z(bArr, 0, iX);
        return new o("TXXX", new String(bArr, 0, iZ, X(iX)), S(bArr, iX, W(iX) + iZ));
    }

    public static p U(int i, String str, t tVar) {
        byte[] bArr = new byte[i];
        tVar.h(bArr, 0, i);
        return new p(str, null, new String(bArr, 0, a0(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static p V(int i, t tVar) {
        if (i < 1) {
            return null;
        }
        int iX = tVar.x();
        int i10 = i - 1;
        byte[] bArr = new byte[i10];
        tVar.h(bArr, 0, i10);
        int iZ = Z(bArr, 0, iX);
        String str = new String(bArr, 0, iZ, X(iX));
        int iW = W(iX) + iZ;
        return new p("WXXX", str, Q(bArr, iW, a0(iW, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int W(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset X(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String Y(int i, int i10, int i11, int i12, int i13) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static int Z(byte[] bArr, int i, int i10) {
        int iA0 = a0(i, bArr);
        if (i10 == 0 || i10 == 3) {
            return iA0;
        }
        while (iA0 < bArr.length - 1) {
            if ((iA0 - i) % 2 == 0 && bArr[iA0 + 1] == 0) {
                return iA0;
            }
            iA0 = a0(iA0 + 1, bArr);
        }
        return bArr.length;
    }

    public static int a0(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int b0(int i, t tVar) {
        byte[] bArr = tVar.f13738a;
        int i10 = tVar.f13739b;
        int i11 = i10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= i10 + i) {
                return i;
            }
            if ((bArr[i11] & 255) == 255 && bArr[i12] == 0) {
                System.arraycopy(bArr, i11 + 2, bArr, i12, (i - (i11 - i10)) - 2);
                i--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[PHI: r3
  0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c0(w1.t r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f13739b
        L6:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.j()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.z()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.D()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r1.A()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.A()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.J(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.J(r2)
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
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = r4
            goto L75
        L74:
            r3 = r6
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L7a
            goto L8c
        L7a:
            r4 = r6
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7a
            goto L8c
        L8a:
            r3 = r6
            r4 = r3
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r1.J(r2)
            return r6
        L99:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.J(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.K(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.J(r2)
            return r4
        Lb0:
            r1.J(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.i.c0(w1.t, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final t1.e0 H(int r13, byte[] r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.i.H(int, byte[]):t1.e0");
    }

    @Override // u1.c
    public final e0 p(f3.a aVar, ByteBuffer byteBuffer) {
        return H(byteBuffer.limit(), byteBuffer.array());
    }
}
