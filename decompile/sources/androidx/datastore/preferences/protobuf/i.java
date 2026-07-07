package androidx.datastore.preferences.protobuf;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FileInputStream f784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f786e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f788h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f789j = Integer.MAX_VALUE;

    public i(FileInputStream fileInputStream) {
        Charset charset = x.f870a;
        this.f784c = fileInputStream;
        this.f785d = new byte[4096];
        this.f786e = 0;
        this.f787g = 0;
        this.i = 0;
    }

    public final byte[] A(int i) throws IOException {
        byte[] bArrB = B(i);
        if (bArrB != null) {
            return bArrB;
        }
        int i10 = this.f787g;
        int i11 = this.f786e;
        int length = i11 - i10;
        this.i += i11;
        this.f787g = 0;
        this.f786e = 0;
        ArrayList arrayListC = C(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f785d, i10, bArr, 0, length);
        int size = arrayListC.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayListC.get(i12);
            i12++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] B(int i) throws IOException {
        if (i == 0) {
            return x.f871b;
        }
        if (i < 0) {
            throw z.d();
        }
        int i10 = this.i;
        int i11 = this.f787g;
        int i12 = i10 + i11 + i;
        if (i12 - Integer.MAX_VALUE > 0) {
            throw new z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i13 = this.f789j;
        if (i12 > i13) {
            K((i13 - i10) - i11);
            throw z.e();
        }
        int i14 = this.f786e - i11;
        int i15 = i - i14;
        FileInputStream fileInputStream = this.f784c;
        if (i15 >= 4096) {
            try {
                if (i15 > fileInputStream.available()) {
                    return null;
                }
            } catch (z e7) {
                e7.f880v = true;
                throw e7;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f785d, this.f787g, bArr, 0, i14);
        this.i += this.f786e;
        this.f787g = 0;
        this.f786e = 0;
        while (i14 < i) {
            try {
                int i16 = fileInputStream.read(bArr, i14, i - i14);
                if (i16 == -1) {
                    throw z.e();
                }
                this.i += i16;
                i14 += i16;
            } catch (z e10) {
                e10.f880v = true;
                throw e10;
            }
        }
        return bArr;
    }

    public final ArrayList C(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = this.f784c.read(bArr, i10, iMin - i10);
                if (i11 == -1) {
                    throw z.e();
                }
                this.i += i11;
                i10 += i11;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int D() throws z {
        int i = this.f787g;
        if (this.f786e - i < 4) {
            J(4);
            i = this.f787g;
        }
        this.f787g = i + 4;
        byte[] bArr = this.f785d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long E() throws z {
        int i = this.f787g;
        if (this.f786e - i < 8) {
            J(8);
            i = this.f787g;
        }
        this.f787g = i + 8;
        byte[] bArr = this.f785d;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public final int F() {
        int i;
        int i10 = this.f787g;
        int i11 = this.f786e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f785d;
            byte b9 = bArr[i10];
            if (b9 >= 0) {
                this.f787g = i12;
                return b9;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b9;
                if (i14 < 0) {
                    i = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b10 = bArr[i17];
                            int i19 = (i18 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i19;
                            }
                            i = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.f787g = i13;
                return i;
            }
        }
        return (int) H();
    }

    public final long G() {
        long j8;
        long j9;
        long j10;
        long j11;
        int i = this.f787g;
        int i10 = this.f786e;
        if (i10 != i) {
            int i11 = i + 1;
            byte[] bArr = this.f785d;
            byte b9 = bArr[i];
            if (b9 >= 0) {
                this.f787g = i11;
                return b9;
            }
            if (i10 - i11 >= 9) {
                int i12 = i + 2;
                int i13 = (bArr[i11] << 7) ^ b9;
                if (i13 < 0) {
                    j8 = i13 ^ (-128);
                } else {
                    int i14 = i + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j8 = i15 ^ 16256;
                        i12 = i14;
                    } else {
                        int i16 = i + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            j11 = (-2080896) ^ i17;
                        } else {
                            long j12 = i17;
                            i12 = i + 5;
                            long j13 = j12 ^ (((long) bArr[i16]) << 28);
                            if (j13 >= 0) {
                                j10 = 266354560;
                            } else {
                                i16 = i + 6;
                                long j14 = j13 ^ (((long) bArr[i12]) << 35);
                                if (j14 < 0) {
                                    j9 = -34093383808L;
                                } else {
                                    i12 = i + 7;
                                    j13 = j14 ^ (((long) bArr[i16]) << 42);
                                    if (j13 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        i16 = i + 8;
                                        j14 = j13 ^ (((long) bArr[i12]) << 49);
                                        if (j14 < 0) {
                                            j9 = -558586000294016L;
                                        } else {
                                            i12 = i + 9;
                                            long j15 = (j14 ^ (((long) bArr[i16]) << 56)) ^ 71499008037633920L;
                                            if (j15 < 0) {
                                                int i18 = i + 10;
                                                if (bArr[i12] >= 0) {
                                                    i12 = i18;
                                                }
                                            }
                                            j8 = j15;
                                        }
                                    }
                                }
                                j11 = j9 ^ j14;
                            }
                            j8 = j10 ^ j13;
                        }
                        i12 = i16;
                        j8 = j11;
                    }
                }
                this.f787g = i12;
                return j8;
            }
        }
        return H();
    }

    public final long H() throws z {
        long j8 = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f787g == this.f786e) {
                J(1);
            }
            int i10 = this.f787g;
            this.f787g = i10 + 1;
            byte b9 = this.f785d[i10];
            j8 |= ((long) (b9 & 127)) << i;
            if ((b9 & 128) == 0) {
                return j8;
            }
        }
        throw z.c();
    }

    public final void I() {
        int i = this.f786e + this.f;
        this.f786e = i;
        int i10 = this.i + i;
        int i11 = this.f789j;
        if (i10 <= i11) {
            this.f = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f = i12;
        this.f786e = i - i12;
    }

    public final void J(int i) throws z {
        if (L(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.i) - this.f787g) {
            throw z.e();
        }
        throw new z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void K(int i) throws z {
        int i10 = this.f786e;
        int i11 = this.f787g;
        int i12 = i10 - i11;
        if (i <= i12 && i >= 0) {
            this.f787g = i11 + i;
            return;
        }
        FileInputStream fileInputStream = this.f784c;
        if (i < 0) {
            throw z.d();
        }
        int i13 = this.i;
        int i14 = i13 + i11;
        int i15 = i14 + i;
        int i16 = this.f789j;
        if (i15 > i16) {
            K((i16 - i13) - i11);
            throw z.e();
        }
        this.i = i14;
        this.f786e = 0;
        this.f787g = 0;
        while (i12 < i) {
            long j8 = i - i12;
            try {
                try {
                    long jSkip = fileInputStream.skip(j8);
                    if (jSkip < 0 || jSkip > j8) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i12 += (int) jSkip;
                    }
                } catch (z e7) {
                    e7.f880v = true;
                    throw e7;
                }
            } catch (Throwable th) {
                this.i += i12;
                I();
                throw th;
            }
        }
        this.i += i12;
        I();
        if (i12 >= i) {
            return;
        }
        int i17 = this.f786e;
        int i18 = i17 - this.f787g;
        this.f787g = i17;
        J(1);
        while (true) {
            int i19 = i - i18;
            int i20 = this.f786e;
            if (i19 <= i20) {
                this.f787g = i19;
                return;
            } else {
                i18 += i20;
                this.f787g = i20;
                J(1);
            }
        }
    }

    public final boolean L(int i) throws IOException {
        FileInputStream fileInputStream = this.f784c;
        int i10 = this.f787g;
        int i11 = i10 + i;
        int i12 = this.f786e;
        if (i11 <= i12) {
            throw new IllegalStateException(d0.d.i(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i13 = this.i;
        if (i <= (Integer.MAX_VALUE - i13) - i10 && i13 + i10 + i <= this.f789j) {
            byte[] bArr = this.f785d;
            if (i10 > 0) {
                if (i12 > i10) {
                    System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                this.i += i10;
                this.f786e -= i10;
                this.f787g = 0;
            }
            int i14 = this.f786e;
            try {
                int i15 = fileInputStream.read(bArr, i14, Math.min(bArr.length - i14, (Integer.MAX_VALUE - this.i) - i14));
                if (i15 == 0 || i15 < -1 || i15 > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i15 + "\nThe InputStream implementation is buggy.");
                }
                if (i15 > 0) {
                    this.f786e += i15;
                    I();
                    if (this.f786e >= i) {
                        return true;
                    }
                    return L(i);
                }
            } catch (z e7) {
                e7.f880v = true;
                throw e7;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void a(int i) throws z {
        if (this.f788h != i) {
            throw new z("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int b() {
        return this.i + this.f787g;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean c() {
        return this.f787g == this.f786e && !L(1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void d(int i) {
        this.f789j = i;
        I();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int e(int i) throws z {
        if (i < 0) {
            throw z.d();
        }
        int i10 = this.i + this.f787g + i;
        if (i10 < 0) {
            throw new z("Failed to parse the message.");
        }
        int i11 = this.f789j;
        if (i10 > i11) {
            throw z.e();
        }
        this.f789j = i10;
        I();
        return i11;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean f() {
        return G() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final g g() throws IOException {
        int iF = F();
        int i = this.f786e;
        int i10 = this.f787g;
        int i11 = i - i10;
        byte[] bArr = this.f785d;
        if (iF <= i11 && iF > 0) {
            g gVarC = g.c(bArr, i10, iF);
            this.f787g += iF;
            return gVarC;
        }
        if (iF == 0) {
            return g.f765x;
        }
        if (iF < 0) {
            throw z.d();
        }
        byte[] bArrB = B(iF);
        if (bArrB != null) {
            return g.c(bArrB, 0, bArrB.length);
        }
        int i12 = this.f787g;
        int i13 = this.f786e;
        int length = i13 - i12;
        this.i += i13;
        this.f787g = 0;
        this.f786e = 0;
        ArrayList arrayListC = C(iF - length);
        byte[] bArr2 = new byte[iF];
        System.arraycopy(bArr, i12, bArr2, 0, length);
        int size = arrayListC.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayListC.get(i14);
            i14++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        g gVar = g.f765x;
        return new g(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final double h() {
        return Double.longBitsToDouble(E());
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int i() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int j() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long k() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final float l() {
        return Float.intBitsToFloat(D());
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int m() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long n() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int o() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long p() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int q() {
        int iF = F();
        return (-(iF & 1)) ^ (iF >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long r() {
        long jG = G();
        return (-(jG & 1)) ^ (jG >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final String s() throws z {
        int iF = F();
        byte[] bArr = this.f785d;
        if (iF > 0) {
            int i = this.f786e;
            int i10 = this.f787g;
            if (iF <= i - i10) {
                String str = new String(bArr, i10, iF, x.f870a);
                this.f787g += iF;
                return str;
            }
        }
        if (iF == 0) {
            return "";
        }
        if (iF < 0) {
            throw z.d();
        }
        if (iF > this.f786e) {
            return new String(A(iF), x.f870a);
        }
        J(iF);
        String str2 = new String(bArr, this.f787g, iF, x.f870a);
        this.f787g += iF;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final String t() throws IOException {
        int iF = F();
        int i = this.f787g;
        int i10 = this.f786e;
        int i11 = i10 - i;
        byte[] bArrA = this.f785d;
        if (iF <= i11 && iF > 0) {
            this.f787g = i + iF;
        } else {
            if (iF == 0) {
                return "";
            }
            if (iF < 0) {
                throw z.d();
            }
            i = 0;
            if (iF <= i10) {
                J(iF);
                this.f787g = iF;
            } else {
                bArrA = A(iF);
            }
        }
        return k1.f799a.h(bArrA, i, iF);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int u() throws z {
        if (c()) {
            this.f788h = 0;
            return 0;
        }
        int iF = F();
        this.f788h = iF;
        if ((iF >>> 3) != 0) {
            return iF;
        }
        throw new z("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int v() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long w() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean x(int i) throws z {
        int i10 = i & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                K(8);
                return true;
            }
            if (i10 == 2) {
                K(F());
                return true;
            }
            if (i10 == 3) {
                y();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw z.b();
            }
            K(4);
            return true;
        }
        int i12 = this.f786e - this.f787g;
        byte[] bArr = this.f785d;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f787g;
                this.f787g = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw z.c();
        }
        while (i11 < 10) {
            if (this.f787g == this.f786e) {
                J(1);
            }
            int i14 = this.f787g;
            this.f787g = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw z.c();
        return true;
    }
}
