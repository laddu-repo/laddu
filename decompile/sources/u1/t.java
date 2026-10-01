package u1;

import db.p0;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f12808d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f12809e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    public static final p0 f12810f = p0.j(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* renamed from: a, reason: collision with root package name */
    public byte[] f12811a;

    /* renamed from: b, reason: collision with root package name */
    public int f12812b;

    /* renamed from: c, reason: collision with root package name */
    public int f12813c;

    public t() {
        this.f12811a = a0.f12751b;
    }

    public static int b(int i6, int i10, int i11, int i12) {
        byte b10 = (byte) i11;
        return a8.f.O((byte) 0, a8.i.b(((i6 & 7) << 2) | ((i10 & 48) >> 4)), a8.i.b(((((byte) i10) & 15) << 4) | ((b10 & 60) >> 2)), a8.i.b(((b10 & 3) << 6) | (((byte) i12) & 63)));
    }

    public static int d(Charset charset) {
        c.a("Unsupported charset: " + charset, f12810f.contains(charset));
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(StandardCharsets.US_ASCII)) {
            return 2;
        }
        return 1;
    }

    public static boolean e(byte b10) {
        if ((b10 & 192) == 128) {
            return true;
        }
        return false;
    }

    public final long A() {
        byte[] bArr = this.f12811a;
        int i6 = this.f12812b;
        this.f12812b = i6 + 1;
        this.f12812b = i6 + 2;
        long j = ((bArr[i6] & 255) << 24) | ((bArr[r2] & 255) << 16);
        this.f12812b = i6 + 3;
        long j10 = j | ((bArr[r7] & 255) << 8);
        this.f12812b = i6 + 4;
        return (bArr[r2] & 255) | j10;
    }

    public final int B() {
        byte[] bArr = this.f12811a;
        int i6 = this.f12812b;
        int i10 = i6 + 1;
        this.f12812b = i10;
        int i11 = (bArr[i6] & 255) << 16;
        int i12 = i6 + 2;
        this.f12812b = i12;
        int i13 = ((bArr[i10] & 255) << 8) | i11;
        this.f12812b = i6 + 3;
        return (bArr[i12] & 255) | i13;
    }

    public final int C() {
        int k8 = k();
        if (k8 >= 0) {
            return k8;
        }
        throw new IllegalStateException(h8.c.i(k8, "Top bit not zero: "));
    }

    public final long D() {
        long s = s();
        if (s >= 0) {
            return s;
        }
        throw new IllegalStateException(r4.a.j("Top bit not zero: ", s));
    }

    public final int E() {
        byte[] bArr = this.f12811a;
        int i6 = this.f12812b;
        int i10 = i6 + 1;
        this.f12812b = i10;
        int i11 = (bArr[i6] & 255) << 8;
        this.f12812b = i6 + 2;
        return (bArr[i10] & 255) | i11;
    }

    public final long F() {
        int i6;
        int i10;
        long j = this.f12811a[this.f12812b];
        int i11 = 7;
        while (true) {
            if (i11 < 0) {
                break;
            }
            if (((1 << i11) & j) != 0) {
                i11--;
            } else if (i11 < 6) {
                j &= r6 - 1;
                i10 = 7 - i11;
            } else if (i11 == 7) {
                i10 = 1;
            }
        }
        i10 = 0;
        if (i10 != 0) {
            for (i6 = 1; i6 < i10; i6++) {
                if ((this.f12811a[this.f12812b + i6] & 192) == 128) {
                    j = (j << 6) | (r3 & 63);
                } else {
                    throw new NumberFormatException(r4.a.j("Invalid UTF-8 sequence continuation byte: ", j));
                }
            }
            this.f12812b += i10;
            return j;
        }
        throw new NumberFormatException(r4.a.j("Invalid UTF-8 sequence first byte: ", j));
    }

    public final Charset G() {
        if (a() >= 3) {
            byte[] bArr = this.f12811a;
            int i6 = this.f12812b;
            if (bArr[i6] == -17 && bArr[i6 + 1] == -69 && bArr[i6 + 2] == -65) {
                this.f12812b = i6 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() >= 2) {
            byte[] bArr2 = this.f12811a;
            int i10 = this.f12812b;
            byte b10 = bArr2[i10];
            if (b10 == -2 && bArr2[i10 + 1] == -1) {
                this.f12812b = i10 + 2;
                return StandardCharsets.UTF_16BE;
            }
            if (b10 == -1 && bArr2[i10 + 1] == -2) {
                this.f12812b = i10 + 2;
                return StandardCharsets.UTF_16LE;
            }
            return null;
        }
        return null;
    }

    public final void H(int i6) {
        byte[] bArr = this.f12811a;
        if (bArr.length < i6) {
            bArr = new byte[i6];
        }
        I(i6, bArr);
    }

    public final void I(int i6, byte[] bArr) {
        this.f12811a = bArr;
        this.f12813c = i6;
        this.f12812b = 0;
    }

    public final void J(int i6) {
        boolean z10;
        if (i6 >= 0 && i6 <= this.f12811a.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        c.b(z10);
        this.f12813c = i6;
    }

    public final void K(int i6) {
        boolean z10;
        if (i6 >= 0 && i6 <= this.f12813c) {
            z10 = true;
        } else {
            z10 = false;
        }
        c.b(z10);
        this.f12812b = i6;
    }

    public final void L(int i6) {
        K(this.f12812b + i6);
    }

    public final int a() {
        return Math.max(this.f12813c - this.f12812b, 0);
    }

    public final void c(int i6) {
        byte[] bArr = this.f12811a;
        if (i6 > bArr.length) {
            this.f12811a = Arrays.copyOf(bArr, i6);
        }
    }

    public final char f(int i6, ByteOrder byteOrder) {
        byte b10;
        byte b11;
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f12811a;
            int i10 = this.f12812b + i6;
            b10 = bArr[i10];
            b11 = bArr[i10 + 1];
        } else {
            byte[] bArr2 = this.f12811a;
            int i11 = this.f12812b + i6;
            b10 = bArr2[i11 + 1];
            b11 = bArr2[i11];
        }
        return (char) ((b10 << 8) | (b11 & 255));
    }

    public final int g(Charset charset) {
        ByteOrder byteOrder;
        int i6;
        int i10;
        int i11;
        c.a("Unsupported charset: " + charset, f12810f.contains(charset));
        if (a() >= d(charset)) {
            int i12 = 1;
            if (charset.equals(StandardCharsets.US_ASCII)) {
                byte b10 = this.f12811a[this.f12812b];
                if ((b10 & 128) == 0) {
                    i6 = b10 & 255;
                    return (i6 << 8) | i12;
                }
                return 0;
            }
            if (charset.equals(StandardCharsets.UTF_8)) {
                byte b11 = this.f12811a[this.f12812b];
                if ((b11 & 128) == 0) {
                    i10 = 1;
                } else if ((b11 & 224) == 192 && a() >= 2 && e(this.f12811a[this.f12812b + 1])) {
                    i10 = 2;
                } else if ((this.f12811a[this.f12812b] & 240) == 224 && a() >= 3 && e(this.f12811a[this.f12812b + 1]) && e(this.f12811a[this.f12812b + 2])) {
                    i10 = 3;
                } else if ((this.f12811a[this.f12812b] & 248) == 240 && a() >= 4 && e(this.f12811a[this.f12812b + 1]) && e(this.f12811a[this.f12812b + 2]) && e(this.f12811a[this.f12812b + 3])) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                byte[] bArr = this.f12811a;
                                int i13 = this.f12812b;
                                i11 = b(bArr[i13], bArr[i13 + 1], bArr[i13 + 2], bArr[i13 + 3]);
                            }
                            return 0;
                        }
                        byte[] bArr2 = this.f12811a;
                        int i14 = this.f12812b;
                        i11 = b(0, bArr2[i14] & 15, bArr2[i14 + 1], bArr2[i14 + 2]);
                    } else {
                        byte[] bArr3 = this.f12811a;
                        int i15 = this.f12812b;
                        i11 = b(0, 0, bArr3[i15], bArr3[i15 + 1]);
                    }
                } else {
                    i11 = this.f12811a[this.f12812b] & 255;
                }
                i12 = i10;
                i6 = i11;
            } else {
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                } else {
                    byteOrder = ByteOrder.BIG_ENDIAN;
                }
                char f3 = f(0, byteOrder);
                if (Character.isHighSurrogate(f3) && a() >= 4) {
                    i6 = Character.toCodePoint(f3, f(2, byteOrder));
                    i12 = 4;
                } else {
                    i6 = f3;
                    i12 = 2;
                }
            }
            return (i6 << 8) | i12;
        }
        throw new IndexOutOfBoundsException("position=" + this.f12812b + ", limit=" + this.f12813c);
    }

    public final int h() {
        return this.f12811a[this.f12812b] & 255;
    }

    public final void i(byte[] bArr, int i6, int i10) {
        System.arraycopy(this.f12811a, this.f12812b, bArr, i6, i10);
        this.f12812b += i10;
    }

    public final char j(Charset charset, char[] cArr) {
        int g10;
        boolean z10;
        if (a() >= d(charset) && (g10 = g(charset)) != 0) {
            long j = g10 >>> 8;
            boolean z11 = true;
            if ((j >> 32) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            jb.b.c(j, "out of range: %s", z10);
            int i6 = (int) j;
            if (!Character.isSupplementaryCodePoint(i6)) {
                long j10 = i6;
                char c10 = (char) j10;
                if (c10 != j10) {
                    z11 = false;
                }
                jb.b.c(j10, "Out of range: %s", z11);
                for (char c11 : cArr) {
                    if (c11 == c10) {
                        this.f12812b = a8.f.G(g10 & 255) + this.f12812b;
                        return c10;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int k() {
        byte[] bArr = this.f12811a;
        int i6 = this.f12812b;
        int i10 = i6 + 1;
        this.f12812b = i10;
        int i11 = (bArr[i6] & 255) << 24;
        int i12 = i6 + 2;
        this.f12812b = i12;
        int i13 = ((bArr[i10] & 255) << 16) | i11;
        int i14 = i6 + 3;
        this.f12812b = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.f12812b = i6 + 4;
        return (bArr[i14] & 255) | i15;
    }

    public final String l(Charset charset) {
        int i6;
        c.a("Unsupported charset: " + charset, f12810f.contains(charset));
        if (a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            G();
        }
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(charset2)) {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i6 = 2;
        } else {
            i6 = 1;
        }
        int i10 = this.f12812b;
        while (true) {
            int i11 = this.f12813c;
            if (i10 < i11 - (i6 - 1)) {
                if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && a0.N(this.f12811a[i10])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    byte[] bArr = this.f12811a;
                    if (bArr[i10] == 0 && a0.N(bArr[i10 + 1])) {
                        break;
                    }
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    byte[] bArr2 = this.f12811a;
                    if (bArr2[i10 + 1] == 0 && a0.N(bArr2[i10])) {
                        break;
                    }
                }
                i10 += i6;
            } else {
                i10 = i11;
                break;
            }
        }
        String w10 = w(i10 - this.f12812b, charset);
        if (this.f12812b != this.f12813c && j(charset, f12808d) == '\r') {
            j(charset, f12809e);
        }
        return w10;
    }

    public final int m() {
        byte[] bArr = this.f12811a;
        int i6 = this.f12812b;
        int i10 = i6 + 1;
        this.f12812b = i10;
        int i11 = bArr[i6] & 255;
        int i12 = i6 + 2;
        this.f12812b = i12;
        int i13 = ((bArr[i10] & 255) << 8) | i11;
        int i14 = i6 + 3;
        this.f12812b = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.f12812b = i6 + 4;
        return ((bArr[i14] & 255) << 24) | i15;
    }

    public final long n() {
        byte[] bArr = this.f12811a;
        int i6 = this.f12812b;
        this.f12812b = i6 + 1;
        this.f12812b = i6 + 2;
        this.f12812b = i6 + 3;
        long j = (bArr[i6] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f12812b = i6 + 4;
        long j10 = j | ((bArr[r8] & 255) << 24);
        this.f12812b = i6 + 5;
        long j11 = j10 | ((bArr[r7] & 255) << 32);
        this.f12812b = i6 + 6;
        long j12 = j11 | ((bArr[r8] & 255) << 40);
        this.f12812b = i6 + 7;
        long j13 = j12 | ((bArr[r7] & 255) << 48);
        this.f12812b = i6 + 8;
        return ((bArr[r8] & 255) << 56) | j13;
    }

    public final short o() {
        byte[] bArr = this.f12811a;
        int i6 = this.f12812b;
        int i10 = i6 + 1;
        this.f12812b = i10;
        int i11 = bArr[i6] & 255;
        this.f12812b = i6 + 2;
        return (short) (((bArr[i10] & 255) << 8) | i11);
    }

    public final long p() {
        byte[] bArr = this.f12811a;
        int i6 = this.f12812b;
        this.f12812b = i6 + 1;
        this.f12812b = i6 + 2;
        long j = (bArr[i6] & 255) | ((bArr[r2] & 255) << 8);
        this.f12812b = i6 + 3;
        long j10 = j | ((bArr[r7] & 255) << 16);
        this.f12812b = i6 + 4;
        return ((bArr[r2] & 255) << 24) | j10;
    }

    public final int q() {
        int m9 = m();
        if (m9 >= 0) {
            return m9;
        }
        throw new IllegalStateException(h8.c.i(m9, "Top bit not zero: "));
    }

    public final int r() {
        byte[] bArr = this.f12811a;
        int i6 = this.f12812b;
        int i10 = i6 + 1;
        this.f12812b = i10;
        int i11 = bArr[i6] & 255;
        this.f12812b = i6 + 2;
        return ((bArr[i10] & 255) << 8) | i11;
    }

    public final long s() {
        byte[] bArr = this.f12811a;
        int i6 = this.f12812b;
        this.f12812b = i6 + 1;
        this.f12812b = i6 + 2;
        long j = ((bArr[i6] & 255) << 56) | ((bArr[r2] & 255) << 48);
        this.f12812b = i6 + 3;
        long j10 = j | ((bArr[r7] & 255) << 40);
        this.f12812b = i6 + 4;
        long j11 = j10 | ((bArr[r2] & 255) << 32);
        this.f12812b = i6 + 5;
        long j12 = j11 | ((bArr[r7] & 255) << 24);
        this.f12812b = i6 + 6;
        long j13 = j12 | ((bArr[r2] & 255) << 16);
        this.f12812b = i6 + 7;
        long j14 = j13 | ((bArr[r7] & 255) << 8);
        this.f12812b = i6 + 8;
        return (bArr[r2] & 255) | j14;
    }

    public final String t() {
        if (a() == 0) {
            return null;
        }
        int i6 = this.f12812b;
        while (i6 < this.f12813c && this.f12811a[i6] != 0) {
            i6++;
        }
        byte[] bArr = this.f12811a;
        int i10 = this.f12812b;
        String str = a0.f12750a;
        String str2 = new String(bArr, i10, i6 - i10, StandardCharsets.UTF_8);
        this.f12812b = i6;
        if (i6 < this.f12813c) {
            this.f12812b = i6 + 1;
        }
        return str2;
    }

    public final String u(int i6) {
        int i10;
        if (i6 == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int i11 = this.f12812b;
        int i12 = (i11 + i6) - 1;
        if (i12 < this.f12813c && this.f12811a[i12] == 0) {
            i10 = i6 - 1;
        } else {
            i10 = i6;
        }
        byte[] bArr = this.f12811a;
        String str = a0.f12750a;
        String str2 = new String(bArr, i11, i10, StandardCharsets.UTF_8);
        this.f12812b += i6;
        return str2;
    }

    public final short v() {
        byte[] bArr = this.f12811a;
        int i6 = this.f12812b;
        int i10 = i6 + 1;
        this.f12812b = i10;
        int i11 = (bArr[i6] & 255) << 8;
        this.f12812b = i6 + 2;
        return (short) ((bArr[i10] & 255) | i11);
    }

    public final String w(int i6, Charset charset) {
        String str = new String(this.f12811a, this.f12812b, i6, charset);
        this.f12812b += i6;
        return str;
    }

    public final int x() {
        return (y() << 21) | (y() << 14) | (y() << 7) | y();
    }

    public final int y() {
        byte[] bArr = this.f12811a;
        int i6 = this.f12812b;
        this.f12812b = i6 + 1;
        return bArr[i6] & 255;
    }

    public final int z() {
        byte[] bArr = this.f12811a;
        int i6 = this.f12812b;
        int i10 = i6 + 1;
        this.f12812b = i10;
        int i11 = (bArr[i6] & 255) << 8;
        this.f12812b = i6 + 2;
        int i12 = (bArr[i10] & 255) | i11;
        this.f12812b = i6 + 4;
        return i12;
    }

    public t(int i6) {
        this.f12811a = new byte[i6];
        this.f12813c = i6;
    }

    public t(byte[] bArr) {
        this.f12811a = bArr;
        this.f12813c = bArr.length;
    }

    public t(int i6, byte[] bArr) {
        this.f12811a = bArr;
        this.f12813c = i6;
    }
}
