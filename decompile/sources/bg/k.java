package bg;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import okhttp3.HttpUrl;
import okhttp3.internal.connection.RealConnection;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k implements m, l, Cloneable, ByteChannel {

    /* renamed from: x, reason: collision with root package name */
    public g0 f1725x;

    /* renamed from: y, reason: collision with root package name */
    public long f1726y;

    @Override // bg.l
    public final /* bridge */ /* synthetic */ l F(String str) {
        s0(str);
        return this;
    }

    @Override // bg.m
    public final String H(Charset charset) {
        kotlin.jvm.internal.k.e(charset, "charset");
        return g0(this.f1726y, charset);
    }

    @Override // bg.m
    public final boolean I(long j, n bytes) {
        kotlin.jvm.internal.k.e(bytes, "bytes");
        int d10 = bytes.d();
        if (j >= 0 && d10 >= 0 && this.f1726y - j >= d10 && bytes.d() >= d10) {
            for (int i6 = 0; i6 < d10; i6++) {
                if (y(i6 + j) == bytes.i(i6)) {
                }
            }
            return true;
        }
        return false;
    }

    public final long K(byte b10, long j, long j10) {
        g0 g0Var;
        long j11 = j;
        long j12 = j10;
        long j13 = 0;
        if (0 <= j11 && j11 <= j12) {
            long j14 = this.f1726y;
            if (j12 > j14) {
                j12 = j14;
            }
            long j15 = -1;
            if (j11 == j12 || (g0Var = this.f1725x) == null) {
                return -1L;
            }
            if (j14 - j11 < j11) {
                while (j14 > j11) {
                    g0Var = g0Var.f1716g;
                    kotlin.jvm.internal.k.b(g0Var);
                    j14 -= g0Var.f1712c - g0Var.f1711b;
                }
                while (j14 < j12) {
                    byte[] bArr = g0Var.f1710a;
                    long j16 = j15;
                    int min = (int) Math.min(g0Var.f1712c, (g0Var.f1711b + j12) - j14);
                    for (int i6 = (int) ((g0Var.f1711b + j11) - j14); i6 < min; i6++) {
                        if (bArr[i6] == b10) {
                            return (i6 - g0Var.f1711b) + j14;
                        }
                    }
                    j14 += g0Var.f1712c - g0Var.f1711b;
                    g0Var = g0Var.f1715f;
                    kotlin.jvm.internal.k.b(g0Var);
                    j15 = j16;
                    j11 = j14;
                }
                return j15;
            }
            while (true) {
                long j17 = (g0Var.f1712c - g0Var.f1711b) + j13;
                if (j17 > j11) {
                    break;
                }
                g0Var = g0Var.f1715f;
                kotlin.jvm.internal.k.b(g0Var);
                j13 = j17;
            }
            while (j13 < j12) {
                byte[] bArr2 = g0Var.f1710a;
                int min2 = (int) Math.min(g0Var.f1712c, (g0Var.f1711b + j12) - j13);
                for (int i10 = (int) ((g0Var.f1711b + j11) - j13); i10 < min2; i10++) {
                    if (bArr2[i10] == b10) {
                        return (i10 - g0Var.f1711b) + j13;
                    }
                }
                j13 += g0Var.f1712c - g0Var.f1711b;
                g0Var = g0Var.f1715f;
                kotlin.jvm.internal.k.b(g0Var);
                j11 = j13;
            }
            return -1L;
        }
        throw new IllegalArgumentException(("size=" + this.f1726y + " fromIndex=" + j11 + " toIndex=" + j12).toString());
    }

    @Override // bg.l
    public final /* bridge */ /* synthetic */ l L(long j) {
        n0(j);
        return this;
    }

    @Override // bg.m
    public final n N() {
        return g(this.f1726y);
    }

    @Override // bg.m
    public final void O(k sink, long j) {
        kotlin.jvm.internal.k.e(sink, "sink");
        long j10 = this.f1726y;
        if (j10 >= j) {
            sink.write(this, j);
        } else {
            sink.write(this, j10);
            throw new EOFException();
        }
    }

    @Override // bg.m
    public final boolean P(long j) {
        if (this.f1726y >= j) {
            return true;
        }
        return false;
    }

    public final long Q(long j, n targetBytes) {
        long j10 = j;
        kotlin.jvm.internal.k.e(targetBytes, "targetBytes");
        long j11 = 0;
        if (j10 >= 0) {
            g0 g0Var = this.f1725x;
            if (g0Var == null) {
                return -1L;
            }
            long j12 = this.f1726y;
            if (j12 - j10 < j10) {
                while (j12 > j10) {
                    g0Var = g0Var.f1716g;
                    kotlin.jvm.internal.k.b(g0Var);
                    j12 -= g0Var.f1712c - g0Var.f1711b;
                }
                if (targetBytes.d() == 2) {
                    byte i6 = targetBytes.i(0);
                    byte i10 = targetBytes.i(1);
                    while (j12 < this.f1726y) {
                        byte[] bArr = g0Var.f1710a;
                        int i11 = g0Var.f1712c;
                        for (int i12 = (int) ((g0Var.f1711b + j10) - j12); i12 < i11; i12++) {
                            byte b10 = bArr[i12];
                            if (b10 == i6 || b10 == i10) {
                                return (i12 - g0Var.f1711b) + j12;
                            }
                        }
                        j12 += g0Var.f1712c - g0Var.f1711b;
                        g0Var = g0Var.f1715f;
                        kotlin.jvm.internal.k.b(g0Var);
                        j10 = j12;
                    }
                } else {
                    byte[] h4 = targetBytes.h();
                    while (j12 < this.f1726y) {
                        byte[] bArr2 = g0Var.f1710a;
                        int i13 = g0Var.f1712c;
                        for (int i14 = (int) ((g0Var.f1711b + j10) - j12); i14 < i13; i14++) {
                            byte b11 = bArr2[i14];
                            for (byte b12 : h4) {
                                if (b11 == b12) {
                                    return (i14 - g0Var.f1711b) + j12;
                                }
                            }
                        }
                        j12 += g0Var.f1712c - g0Var.f1711b;
                        g0Var = g0Var.f1715f;
                        kotlin.jvm.internal.k.b(g0Var);
                        j10 = j12;
                    }
                }
                return -1L;
            }
            while (true) {
                long j13 = (g0Var.f1712c - g0Var.f1711b) + j11;
                if (j13 > j10) {
                    break;
                }
                g0Var = g0Var.f1715f;
                kotlin.jvm.internal.k.b(g0Var);
                j11 = j13;
            }
            if (targetBytes.d() == 2) {
                byte i15 = targetBytes.i(0);
                byte i16 = targetBytes.i(1);
                while (j11 < this.f1726y) {
                    byte[] bArr3 = g0Var.f1710a;
                    int i17 = g0Var.f1712c;
                    for (int i18 = (int) ((g0Var.f1711b + j10) - j11); i18 < i17; i18++) {
                        byte b13 = bArr3[i18];
                        if (b13 == i15 || b13 == i16) {
                            return (i18 - g0Var.f1711b) + j11;
                        }
                    }
                    j11 += g0Var.f1712c - g0Var.f1711b;
                    g0Var = g0Var.f1715f;
                    kotlin.jvm.internal.k.b(g0Var);
                    j10 = j11;
                }
            } else {
                byte[] h10 = targetBytes.h();
                while (j11 < this.f1726y) {
                    byte[] bArr4 = g0Var.f1710a;
                    int i19 = g0Var.f1712c;
                    for (int i20 = (int) ((g0Var.f1711b + j10) - j11); i20 < i19; i20++) {
                        byte b14 = bArr4[i20];
                        for (byte b15 : h10) {
                            if (b14 == b15) {
                                return (i20 - g0Var.f1711b) + j11;
                            }
                        }
                    }
                    j11 += g0Var.f1712c - g0Var.f1711b;
                    g0Var = g0Var.f1715f;
                    kotlin.jvm.internal.k.b(g0Var);
                    j10 = j11;
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(r4.a.j("fromIndex < 0: ", j10).toString());
    }

    @Override // bg.m
    public final String R() {
        return x(Long.MAX_VALUE);
    }

    public final long S(n targetBytes) {
        kotlin.jvm.internal.k.e(targetBytes, "targetBytes");
        return Q(0L, targetBytes);
    }

    @Override // bg.l
    public final long T(l0 source) {
        kotlin.jvm.internal.k.e(source, "source");
        long j = 0;
        while (true) {
            long read = source.read(this, 8192L);
            if (read != -1) {
                j += read;
            } else {
                return j;
            }
        }
    }

    @Override // bg.m
    public final void Y(long j) {
        if (this.f1726y >= j) {
        } else {
            throw new EOFException();
        }
    }

    @Override // bg.l
    public final /* bridge */ /* synthetic */ l Z(long j) {
        m0(j);
        return this;
    }

    public final i a0(i unsafeCursor) {
        kotlin.jvm.internal.k.e(unsafeCursor, "unsafeCursor");
        byte[] bArr = cg.a.f2088a;
        if (unsafeCursor == b.f1689a) {
            unsafeCursor = new i();
        }
        if (unsafeCursor.f1720x == null) {
            unsafeCursor.f1720x = this;
            unsafeCursor.f1721y = true;
            return unsafeCursor;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    public final byte[] b0(long j) {
        if (j >= 0 && j <= 2147483647L) {
            if (this.f1726y >= j) {
                byte[] bArr = new byte[(int) j];
                readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(r4.a.j("byteCount: ", j).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4 A[EDGE_INSN: B:40:0x00a4->B:37:0x00a4 BREAK  A[LOOP:0: B:4:0x000e->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, bg.k] */
    @Override // bg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c0() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f1726y
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto Lab
            r1 = 0
            r5 = r3
            r2 = 0
            r7 = 0
        Le:
            bg.g0 r8 = r0.f1725x
            kotlin.jvm.internal.k.b(r8)
            byte[] r9 = r8.f1710a
            int r10 = r8.f1711b
            int r11 = r8.f1712c
        L19:
            if (r10 >= r11) goto L90
            r12 = r9[r10]
            r13 = 48
            if (r12 < r13) goto L28
            r13 = 57
            if (r12 > r13) goto L28
            int r13 = r12 + (-48)
            goto L3d
        L28:
            r13 = 97
            if (r12 < r13) goto L33
            r13 = 102(0x66, float:1.43E-43)
            if (r12 > r13) goto L33
            int r13 = r12 + (-87)
            goto L3d
        L33:
            r13 = 65
            if (r12 < r13) goto L68
            r13 = 70
            if (r12 > r13) goto L68
            int r13 = r12 + (-55)
        L3d:
            r14 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r14 = r14 & r5
            int r16 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r16 != 0) goto L4d
            r12 = 4
            long r5 = r5 << r12
            long r12 = (long) r13
            long r5 = r5 | r12
            int r10 = r10 + 1
            int r2 = r2 + 1
            goto L19
        L4d:
            bg.k r1 = new bg.k
            r1.<init>()
            r1.n0(r5)
            r1.l0(r12)
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r1 = r1.h0()
            java.lang.String r3 = "Number too large: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L68:
            r7 = 1
            if (r2 == 0) goto L6c
            goto L90
        L6c:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            int r3 = r12 >> 4
            r3 = r3 & 15
            char[] r4 = cg.b.f2089a
            char r3 = r4[r3]
            r5 = r12 & 15
            char r4 = r4[r5]
            r5 = 2
            char[] r5 = new char[r5]
            r5[r1] = r3
            r5[r7] = r4
            java.lang.String r1 = new java.lang.String
            r1.<init>(r5)
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L90:
            if (r10 != r11) goto L9c
            bg.g0 r9 = r8.a()
            r0.f1725x = r9
            bg.h0.a(r8)
            goto L9e
        L9c:
            r8.f1711b = r10
        L9e:
            if (r7 != 0) goto La4
            bg.g0 r8 = r0.f1725x
            if (r8 != 0) goto Le
        La4:
            long r3 = r0.f1726y
            long r1 = (long) r2
            long r3 = r3 - r1
            r0.f1726y = r3
            return r5
        Lab:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.k.c0():long");
    }

    public final void d() {
        skip(this.f1726y);
    }

    @Override // bg.m
    public final InputStream e0() {
        return new j(this, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        long j = this.f1726y;
        k kVar = (k) obj;
        if (j != kVar.f1726y) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        g0 g0Var = this.f1725x;
        kotlin.jvm.internal.k.b(g0Var);
        g0 g0Var2 = kVar.f1725x;
        kotlin.jvm.internal.k.b(g0Var2);
        int i6 = g0Var.f1711b;
        int i10 = g0Var2.f1711b;
        long j10 = 0;
        while (j10 < this.f1726y) {
            long min = Math.min(g0Var.f1712c - i6, g0Var2.f1712c - i10);
            long j11 = 0;
            while (j11 < min) {
                int i11 = i6 + 1;
                int i12 = i10 + 1;
                if (g0Var.f1710a[i6] != g0Var2.f1710a[i10]) {
                    return false;
                }
                j11++;
                i6 = i11;
                i10 = i12;
            }
            if (i6 == g0Var.f1712c) {
                g0Var = g0Var.f1715f;
                kotlin.jvm.internal.k.b(g0Var);
                i6 = g0Var.f1711b;
            }
            if (i10 == g0Var2.f1712c) {
                g0Var2 = g0Var2.f1715f;
                kotlin.jvm.internal.k.b(g0Var2);
                i10 = g0Var2.f1711b;
            }
            j10 += min;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, bg.k] */
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final k clone() {
        ?? obj = new Object();
        if (this.f1726y == 0) {
            return obj;
        }
        g0 g0Var = this.f1725x;
        kotlin.jvm.internal.k.b(g0Var);
        g0 c10 = g0Var.c();
        obj.f1725x = c10;
        c10.f1716g = c10;
        c10.f1715f = c10;
        for (g0 g0Var2 = g0Var.f1715f; g0Var2 != g0Var; g0Var2 = g0Var2.f1715f) {
            g0 g0Var3 = c10.f1716g;
            kotlin.jvm.internal.k.b(g0Var3);
            kotlin.jvm.internal.k.b(g0Var2);
            g0Var3.b(g0Var2.c());
        }
        obj.f1726y = this.f1726y;
        return obj;
    }

    public final short f0() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    @Override // bg.m
    public final n g(long j) {
        if (j >= 0 && j <= 2147483647L) {
            if (this.f1726y >= j) {
                if (j >= 4096) {
                    n i02 = i0((int) j);
                    skip(j);
                    return i02;
                }
                return new n(b0(j));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(r4.a.j("byteCount: ", j).toString());
    }

    public final String g0(long j, Charset charset) {
        kotlin.jvm.internal.k.e(charset, "charset");
        if (j >= 0 && j <= 2147483647L) {
            if (this.f1726y >= j) {
                if (j == 0) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                g0 g0Var = this.f1725x;
                kotlin.jvm.internal.k.b(g0Var);
                int i6 = g0Var.f1711b;
                if (i6 + j > g0Var.f1712c) {
                    return new String(b0(j), charset);
                }
                int i10 = (int) j;
                String str = new String(g0Var.f1710a, i6, i10, charset);
                int i11 = g0Var.f1711b + i10;
                g0Var.f1711b = i11;
                this.f1726y -= j;
                if (i11 == g0Var.f1712c) {
                    this.f1725x = g0Var.a();
                    h0.a(g0Var);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(r4.a.j("byteCount: ", j).toString());
    }

    public final String h0() {
        return g0(this.f1726y, df.a.f4115a);
    }

    public final int hashCode() {
        g0 g0Var = this.f1725x;
        if (g0Var == null) {
            return 0;
        }
        int i6 = 1;
        do {
            int i10 = g0Var.f1712c;
            for (int i11 = g0Var.f1711b; i11 < i10; i11++) {
                i6 = (i6 * 31) + g0Var.f1710a[i11];
            }
            g0Var = g0Var.f1715f;
            kotlin.jvm.internal.k.b(g0Var);
        } while (g0Var != this.f1725x);
        return i6;
    }

    public final n i0(int i6) {
        if (i6 == 0) {
            return n.A;
        }
        b.f(this.f1726y, 0L, i6);
        g0 g0Var = this.f1725x;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i6) {
            kotlin.jvm.internal.k.b(g0Var);
            int i13 = g0Var.f1712c;
            int i14 = g0Var.f1711b;
            if (i13 != i14) {
                i11 += i13 - i14;
                i12++;
                g0Var = g0Var.f1715f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i12];
        int[] iArr = new int[i12 * 2];
        g0 g0Var2 = this.f1725x;
        int i15 = 0;
        while (i10 < i6) {
            kotlin.jvm.internal.k.b(g0Var2);
            bArr[i15] = g0Var2.f1710a;
            i10 += g0Var2.f1712c - g0Var2.f1711b;
            iArr[i15] = Math.min(i10, i6);
            iArr[i15 + i12] = g0Var2.f1711b;
            g0Var2.f1713d = true;
            i15++;
            g0Var2 = g0Var2.f1715f;
        }
        return new i0(bArr, iArr);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final g0 j0(int i6) {
        if (i6 >= 1 && i6 <= 8192) {
            g0 g0Var = this.f1725x;
            if (g0Var == null) {
                g0 b10 = h0.b();
                this.f1725x = b10;
                b10.f1716g = b10;
                b10.f1715f = b10;
                return b10;
            }
            g0 g0Var2 = g0Var.f1716g;
            kotlin.jvm.internal.k.b(g0Var2);
            if (g0Var2.f1712c + i6 <= 8192 && g0Var2.f1714e) {
                return g0Var2;
            }
            g0 b11 = h0.b();
            g0Var2.b(b11);
            return b11;
        }
        throw new IllegalArgumentException("unexpected capacity");
    }

    public final void k0(n byteString) {
        kotlin.jvm.internal.k.e(byteString, "byteString");
        byteString.r(byteString.d(), this);
    }

    public final long l() {
        long j = this.f1726y;
        if (j == 0) {
            return 0L;
        }
        g0 g0Var = this.f1725x;
        kotlin.jvm.internal.k.b(g0Var);
        g0 g0Var2 = g0Var.f1716g;
        kotlin.jvm.internal.k.b(g0Var2);
        if (g0Var2.f1712c < 8192 && g0Var2.f1714e) {
            return j - (r3 - g0Var2.f1711b);
        }
        return j;
    }

    public final void l0(int i6) {
        g0 j02 = j0(1);
        byte[] bArr = j02.f1710a;
        int i10 = j02.f1712c;
        j02.f1712c = i10 + 1;
        bArr[i10] = (byte) i6;
        this.f1726y++;
    }

    public final void m(long j, k out, long j10) {
        kotlin.jvm.internal.k.e(out, "out");
        long j11 = j;
        b.f(this.f1726y, j11, j10);
        if (j10 != 0) {
            out.f1726y += j10;
            g0 g0Var = this.f1725x;
            while (true) {
                kotlin.jvm.internal.k.b(g0Var);
                long j12 = g0Var.f1712c - g0Var.f1711b;
                if (j11 < j12) {
                    break;
                }
                j11 -= j12;
                g0Var = g0Var.f1715f;
            }
            g0 g0Var2 = g0Var;
            long j13 = j10;
            while (j13 > 0) {
                kotlin.jvm.internal.k.b(g0Var2);
                g0 c10 = g0Var2.c();
                int i6 = c10.f1711b + ((int) j11);
                c10.f1711b = i6;
                c10.f1712c = Math.min(i6 + ((int) j13), c10.f1712c);
                g0 g0Var3 = out.f1725x;
                if (g0Var3 == null) {
                    c10.f1716g = c10;
                    c10.f1715f = c10;
                    out.f1725x = c10;
                } else {
                    g0 g0Var4 = g0Var3.f1716g;
                    kotlin.jvm.internal.k.b(g0Var4);
                    g0Var4.b(c10);
                }
                j13 -= c10.f1712c - c10.f1711b;
                g0Var2 = g0Var2.f1715f;
                j11 = 0;
            }
        }
    }

    public final void m0(long j) {
        boolean z10;
        if (j == 0) {
            l0(48);
            return;
        }
        int i6 = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                s0("-9223372036854775808");
                return;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j < 100) {
                    if (j >= 10) {
                        i6 = 2;
                    }
                } else if (j < 1000) {
                    i6 = 3;
                } else {
                    i6 = 4;
                }
            } else if (j < 1000000) {
                if (j < 100000) {
                    i6 = 5;
                } else {
                    i6 = 6;
                }
            } else if (j < 10000000) {
                i6 = 7;
            } else {
                i6 = 8;
            }
        } else if (j < 1000000000000L) {
            if (j < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                if (j < 1000000000) {
                    i6 = 9;
                } else {
                    i6 = 10;
                }
            } else if (j < 100000000000L) {
                i6 = 11;
            } else {
                i6 = 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i6 = 13;
            } else if (j < 100000000000000L) {
                i6 = 14;
            } else {
                i6 = 15;
            }
        } else if (j < 100000000000000000L) {
            if (j < 10000000000000000L) {
                i6 = 16;
            } else {
                i6 = 17;
            }
        } else if (j < 1000000000000000000L) {
            i6 = 18;
        } else {
            i6 = 19;
        }
        if (z10) {
            i6++;
        }
        g0 j02 = j0(i6);
        byte[] bArr = j02.f1710a;
        int i10 = j02.f1712c + i6;
        while (j != 0) {
            long j10 = 10;
            i10--;
            bArr[i10] = cg.a.f2088a[(int) (j % j10)];
            j /= j10;
        }
        if (z10) {
            bArr[i10 - 1] = 45;
        }
        j02.f1712c += i6;
        this.f1726y += i6;
    }

    @Override // bg.l
    public final /* bridge */ /* synthetic */ l n(n nVar) {
        k0(nVar);
        return this;
    }

    public final void n0(long j) {
        if (j == 0) {
            l0(48);
            return;
        }
        long j10 = (j >>> 1) | j;
        long j11 = j10 | (j10 >>> 2);
        long j12 = j11 | (j11 >>> 4);
        long j13 = j12 | (j12 >>> 8);
        long j14 = j13 | (j13 >>> 16);
        long j15 = j14 | (j14 >>> 32);
        long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
        long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
        long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
        long j19 = j18 + (j18 >>> 8);
        long j20 = j19 + (j19 >>> 16);
        int i6 = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + 3) / 4);
        g0 j02 = j0(i6);
        byte[] bArr = j02.f1710a;
        int i10 = j02.f1712c;
        for (int i11 = (i10 + i6) - 1; i11 >= i10; i11--) {
            bArr[i11] = cg.a.f2088a[(int) (15 & j)];
            j >>>= 4;
        }
        j02.f1712c += i6;
        this.f1726y += i6;
    }

    public final void o0(int i6) {
        g0 j02 = j0(4);
        byte[] bArr = j02.f1710a;
        int i10 = j02.f1712c;
        bArr[i10] = (byte) ((i6 >>> 24) & 255);
        bArr[i10 + 1] = (byte) ((i6 >>> 16) & 255);
        bArr[i10 + 2] = (byte) ((i6 >>> 8) & 255);
        bArr[i10 + 3] = (byte) (i6 & 255);
        j02.f1712c = i10 + 4;
        this.f1726y += 4;
    }

    @Override // bg.m
    public final byte[] p() {
        return b0(this.f1726y);
    }

    public final void p0(long j) {
        g0 j02 = j0(8);
        byte[] bArr = j02.f1710a;
        int i6 = j02.f1712c;
        bArr[i6] = (byte) ((j >>> 56) & 255);
        bArr[i6 + 1] = (byte) ((j >>> 48) & 255);
        bArr[i6 + 2] = (byte) ((j >>> 40) & 255);
        bArr[i6 + 3] = (byte) ((j >>> 32) & 255);
        bArr[i6 + 4] = (byte) ((j >>> 24) & 255);
        bArr[i6 + 5] = (byte) ((j >>> 16) & 255);
        bArr[i6 + 6] = (byte) ((j >>> 8) & 255);
        bArr[i6 + 7] = (byte) (j & 255);
        j02.f1712c = i6 + 8;
        this.f1726y += 8;
    }

    @Override // bg.m
    public final f0 peek() {
        return b.d(new d0(this));
    }

    public final void q0(int i6) {
        g0 j02 = j0(2);
        byte[] bArr = j02.f1710a;
        int i10 = j02.f1712c;
        bArr[i10] = (byte) ((i6 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (i6 & 255);
        j02.f1712c = i10 + 2;
        this.f1726y += 2;
    }

    @Override // bg.m
    public final boolean r() {
        if (this.f1726y == 0) {
            return true;
        }
        return false;
    }

    public final void r0(String str, int i6, int i10, Charset charset) {
        if (i6 >= 0) {
            if (i10 >= i6) {
                if (i10 <= str.length()) {
                    if (charset.equals(df.a.f4115a)) {
                        t0(str, i6, i10);
                        return;
                    }
                    String substring = str.substring(i6, i10);
                    kotlin.jvm.internal.k.d(substring, "substring(...)");
                    byte[] bytes = substring.getBytes(charset);
                    kotlin.jvm.internal.k.d(bytes, "getBytes(...)");
                    m1write(bytes, 0, bytes.length);
                    return;
                }
                StringBuilder n10 = h8.c.n(i10, "endIndex > string.length: ", " > ");
                n10.append(str.length());
                throw new IllegalArgumentException(n10.toString().toString());
            }
            throw new IllegalArgumentException(h8.c.l("endIndex < beginIndex: ", " < ", i10, i6).toString());
        }
        throw new IllegalArgumentException(h8.c.i(i6, "beginIndex < 0: ").toString());
    }

    @Override // bg.l0
    public final long read(k sink, long j) {
        kotlin.jvm.internal.k.e(sink, "sink");
        if (j >= 0) {
            long j10 = this.f1726y;
            if (j10 == 0) {
                return -1L;
            }
            if (j > j10) {
                j = j10;
            }
            sink.write(this, j);
            return j;
        }
        throw new IllegalArgumentException(r4.a.j("byteCount < 0: ", j).toString());
    }

    @Override // bg.m
    public final byte readByte() {
        if (this.f1726y != 0) {
            g0 g0Var = this.f1725x;
            kotlin.jvm.internal.k.b(g0Var);
            int i6 = g0Var.f1711b;
            int i10 = g0Var.f1712c;
            int i11 = i6 + 1;
            byte b10 = g0Var.f1710a[i6];
            this.f1726y--;
            if (i11 == i10) {
                this.f1725x = g0Var.a();
                h0.a(g0Var);
                return b10;
            }
            g0Var.f1711b = i11;
            return b10;
        }
        throw new EOFException();
    }

    @Override // bg.m
    public final void readFully(byte[] sink) {
        kotlin.jvm.internal.k.e(sink, "sink");
        int i6 = 0;
        while (i6 < sink.length) {
            int read = read(sink, i6, sink.length - i6);
            if (read != -1) {
                i6 += read;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // bg.m
    public final int readInt() {
        if (this.f1726y >= 4) {
            g0 g0Var = this.f1725x;
            kotlin.jvm.internal.k.b(g0Var);
            int i6 = g0Var.f1711b;
            int i10 = g0Var.f1712c;
            if (i10 - i6 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = g0Var.f1710a;
            int i11 = i6 + 3;
            int i12 = ((bArr[i6 + 1] & 255) << 16) | ((bArr[i6] & 255) << 24) | ((bArr[i6 + 2] & 255) << 8);
            int i13 = i6 + 4;
            int i14 = (bArr[i11] & 255) | i12;
            this.f1726y -= 4;
            if (i13 == i10) {
                this.f1725x = g0Var.a();
                h0.a(g0Var);
                return i14;
            }
            g0Var.f1711b = i13;
            return i14;
        }
        throw new EOFException();
    }

    @Override // bg.m
    public final long readLong() {
        if (this.f1726y >= 8) {
            g0 g0Var = this.f1725x;
            kotlin.jvm.internal.k.b(g0Var);
            int i6 = g0Var.f1711b;
            int i10 = g0Var.f1712c;
            if (i10 - i6 < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = g0Var.f1710a;
            int i11 = i6 + 7;
            long j = ((bArr[i6 + 3] & 255) << 32) | ((bArr[i6] & 255) << 56) | ((bArr[i6 + 1] & 255) << 48) | ((bArr[i6 + 2] & 255) << 40) | ((bArr[i6 + 4] & 255) << 24) | ((bArr[i6 + 5] & 255) << 16) | ((bArr[i6 + 6] & 255) << 8);
            int i12 = i6 + 8;
            long j10 = j | (bArr[i11] & 255);
            this.f1726y -= 8;
            if (i12 == i10) {
                this.f1725x = g0Var.a();
                h0.a(g0Var);
                return j10;
            }
            g0Var.f1711b = i12;
            return j10;
        }
        throw new EOFException();
    }

    @Override // bg.m
    public final short readShort() {
        if (this.f1726y >= 2) {
            g0 g0Var = this.f1725x;
            kotlin.jvm.internal.k.b(g0Var);
            int i6 = g0Var.f1711b;
            int i10 = g0Var.f1712c;
            if (i10 - i6 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = g0Var.f1710a;
            int i11 = i6 + 1;
            int i12 = (bArr[i6] & 255) << 8;
            int i13 = i6 + 2;
            int i14 = (bArr[i11] & 255) | i12;
            this.f1726y -= 2;
            if (i13 == i10) {
                this.f1725x = g0Var.a();
                h0.a(g0Var);
            } else {
                g0Var.f1711b = i13;
            }
            return (short) i14;
        }
        throw new EOFException();
    }

    @Override // bg.m
    public final long s(e0 e0Var) {
        long j = this.f1726y;
        if (j > 0) {
            e0Var.write(this, j);
        }
        return j;
    }

    public final void s0(String string) {
        kotlin.jvm.internal.k.e(string, "string");
        t0(string, 0, string.length());
    }

    @Override // bg.m
    public final void skip(long j) {
        while (j > 0) {
            g0 g0Var = this.f1725x;
            if (g0Var != null) {
                int min = (int) Math.min(j, g0Var.f1712c - g0Var.f1711b);
                long j10 = min;
                this.f1726y -= j10;
                j -= j10;
                int i6 = g0Var.f1711b + min;
                g0Var.f1711b = i6;
                if (i6 == g0Var.f1712c) {
                    this.f1725x = g0Var.a();
                    h0.a(g0Var);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final void t0(String string, int i6, int i10) {
        char charAt;
        char c10;
        kotlin.jvm.internal.k.e(string, "string");
        if (i6 >= 0) {
            if (i10 >= i6) {
                if (i10 <= string.length()) {
                    while (i6 < i10) {
                        char charAt2 = string.charAt(i6);
                        if (charAt2 < 128) {
                            g0 j02 = j0(1);
                            byte[] bArr = j02.f1710a;
                            int i11 = j02.f1712c - i6;
                            int min = Math.min(i10, 8192 - i11);
                            int i12 = i6 + 1;
                            bArr[i6 + i11] = (byte) charAt2;
                            while (true) {
                                i6 = i12;
                                if (i6 >= min || (charAt = string.charAt(i6)) >= 128) {
                                    break;
                                }
                                i12 = i6 + 1;
                                bArr[i6 + i11] = (byte) charAt;
                            }
                            int i13 = j02.f1712c;
                            int i14 = (i11 + i6) - i13;
                            j02.f1712c = i13 + i14;
                            this.f1726y += i14;
                        } else {
                            if (charAt2 < 2048) {
                                g0 j03 = j0(2);
                                byte[] bArr2 = j03.f1710a;
                                int i15 = j03.f1712c;
                                bArr2[i15] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i15 + 1] = (byte) ((charAt2 & '?') | 128);
                                j03.f1712c = i15 + 2;
                                this.f1726y += 2;
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i16 = i6 + 1;
                                if (i16 < i10) {
                                    c10 = string.charAt(i16);
                                } else {
                                    c10 = 0;
                                }
                                if (charAt2 <= 56319 && 56320 <= c10 && c10 < 57344) {
                                    int i17 = (((charAt2 & 1023) << 10) | (c10 & 1023)) + 65536;
                                    g0 j04 = j0(4);
                                    byte[] bArr3 = j04.f1710a;
                                    int i18 = j04.f1712c;
                                    bArr3[i18] = (byte) ((i17 >> 18) | 240);
                                    bArr3[i18 + 1] = (byte) (((i17 >> 12) & 63) | 128);
                                    bArr3[i18 + 2] = (byte) (((i17 >> 6) & 63) | 128);
                                    bArr3[i18 + 3] = (byte) ((i17 & 63) | 128);
                                    j04.f1712c = i18 + 4;
                                    this.f1726y += 4;
                                    i6 += 2;
                                } else {
                                    l0(63);
                                    i6 = i16;
                                }
                            } else {
                                g0 j05 = j0(3);
                                byte[] bArr4 = j05.f1710a;
                                int i19 = j05.f1712c;
                                bArr4[i19] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i19 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i19 + 2] = (byte) ((charAt2 & '?') | 128);
                                j05.f1712c = i19 + 3;
                                this.f1726y += 3;
                            }
                            i6++;
                        }
                    }
                    return;
                }
                StringBuilder n10 = h8.c.n(i10, "endIndex > string.length: ", " > ");
                n10.append(string.length());
                throw new IllegalArgumentException(n10.toString().toString());
            }
            throw new IllegalArgumentException(h8.c.l("endIndex < beginIndex: ", " < ", i10, i6).toString());
        }
        throw new IllegalArgumentException(h8.c.i(i6, "beginIndex < 0: ").toString());
    }

    @Override // bg.l0
    public final o0 timeout() {
        return o0.NONE;
    }

    public final String toString() {
        long j = this.f1726y;
        if (j <= 2147483647L) {
            return i0((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f1726y).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        r3 = r20.f1726y - r2;
        r20.f1726y = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
    
        if (r9 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a6, code lost:
    
        r5 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
    
        if (r2 >= r5) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ad, code lost:
    
        if (r3 == r18) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00af, code lost:
    
        if (r9 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
    
        r2 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b6, code lost:
    
        r4 = new java.lang.StringBuilder();
        r4.append(r2);
        r4.append(" but was 0x");
        r2 = y(r18);
        r6 = cg.b.f2089a;
        r5 = r6[(r2 >> 4) & 15];
        r2 = r6[r2 & 15];
        r1 = new char[2];
        r1[r16] = r5;
        r1[r17] = r2;
        r4.append(new java.lang.String(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ec, code lost:
    
        throw new java.lang.NumberFormatException(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b4, code lost:
    
        r2 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f2, code lost:
    
        throw new java.io.EOFException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f3, code lost:
    
        if (r9 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f5, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f7, code lost:
    
        return -r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a8, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, bg.k] */
    @Override // bg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long u() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.k.u():long");
    }

    public final void u0(int i6) {
        if (i6 < 128) {
            l0(i6);
            return;
        }
        if (i6 < 2048) {
            g0 j02 = j0(2);
            byte[] bArr = j02.f1710a;
            int i10 = j02.f1712c;
            bArr[i10] = (byte) ((i6 >> 6) | 192);
            bArr[i10 + 1] = (byte) ((i6 & 63) | 128);
            j02.f1712c = i10 + 2;
            this.f1726y += 2;
            return;
        }
        if (55296 <= i6 && i6 < 57344) {
            l0(63);
            return;
        }
        if (i6 < 65536) {
            g0 j03 = j0(3);
            byte[] bArr2 = j03.f1710a;
            int i11 = j03.f1712c;
            bArr2[i11] = (byte) ((i6 >> 12) | 224);
            bArr2[i11 + 1] = (byte) (((i6 >> 6) & 63) | 128);
            bArr2[i11 + 2] = (byte) ((i6 & 63) | 128);
            j03.f1712c = i11 + 3;
            this.f1726y += 3;
            return;
        }
        if (i6 <= 1114111) {
            g0 j04 = j0(4);
            byte[] bArr3 = j04.f1710a;
            int i12 = j04.f1712c;
            bArr3[i12] = (byte) ((i6 >> 18) | 240);
            bArr3[i12 + 1] = (byte) (((i6 >> 12) & 63) | 128);
            bArr3[i12 + 2] = (byte) (((i6 >> 6) & 63) | 128);
            bArr3[i12 + 3] = (byte) ((i6 & 63) | 128);
            j04.f1712c = i12 + 4;
            this.f1726y += 4;
            return;
        }
        throw new IllegalArgumentException("Unexpected code point: 0x".concat(b.n(i6)));
    }

    @Override // bg.m
    public final int w(b0 options) {
        kotlin.jvm.internal.k.e(options, "options");
        int c10 = cg.a.c(this, options, false);
        if (c10 == -1) {
            return -1;
        }
        skip(options.f1690x[c10].d());
        return c10;
    }

    @Override // bg.l
    public final /* bridge */ /* synthetic */ l write(byte[] bArr) {
        m0write(bArr);
        return this;
    }

    @Override // bg.l
    public final /* bridge */ /* synthetic */ l writeByte(int i6) {
        l0(i6);
        return this;
    }

    @Override // bg.l
    public final /* bridge */ /* synthetic */ l writeInt(int i6) {
        o0(i6);
        return this;
    }

    @Override // bg.l
    public final /* bridge */ /* synthetic */ l writeShort(int i6) {
        q0(i6);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, bg.k] */
    @Override // bg.m
    public final String x(long j) {
        if (j >= 0) {
            long j10 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j10 = j + 1;
            }
            long j11 = j10;
            long K = K((byte) 10, 0L, j11);
            if (K != -1) {
                return cg.a.b(this, K);
            }
            if (j11 < this.f1726y && y(j11 - 1) == 13 && y(j11) == 10) {
                return cg.a.b(this, j11);
            }
            ?? obj = new Object();
            m(0L, obj, Math.min(32, this.f1726y));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f1726y, j) + " content=" + obj.g(obj.f1726y).e() + (char) 8230);
        }
        throw new IllegalArgumentException(r4.a.j("limit < 0: ", j).toString());
    }

    public final byte y(long j) {
        b.f(this.f1726y, j, 1L);
        g0 g0Var = this.f1725x;
        if (g0Var != null) {
            long j10 = this.f1726y;
            if (j10 - j < j) {
                while (j10 > j) {
                    g0Var = g0Var.f1716g;
                    kotlin.jvm.internal.k.b(g0Var);
                    j10 -= g0Var.f1712c - g0Var.f1711b;
                }
                return g0Var.f1710a[(int) ((g0Var.f1711b + j) - j10)];
            }
            long j11 = 0;
            while (true) {
                int i6 = g0Var.f1712c;
                int i10 = g0Var.f1711b;
                long j12 = (i6 - i10) + j11;
                if (j12 <= j) {
                    g0Var = g0Var.f1715f;
                    kotlin.jvm.internal.k.b(g0Var);
                    j11 = j12;
                } else {
                    return g0Var.f1710a[(int) ((i10 + j) - j11)];
                }
            }
        } else {
            kotlin.jvm.internal.k.b(null);
            throw null;
        }
    }

    @Override // bg.l
    public final /* bridge */ /* synthetic */ l write(byte[] bArr, int i6, int i10) {
        m1write(bArr, i6, i10);
        return this;
    }

    @Override // bg.j0
    public final void write(k source, long j) {
        g0 b10;
        kotlin.jvm.internal.k.e(source, "source");
        if (source != this) {
            b.f(source.f1726y, 0L, j);
            while (j > 0) {
                g0 g0Var = source.f1725x;
                kotlin.jvm.internal.k.b(g0Var);
                int i6 = g0Var.f1712c;
                kotlin.jvm.internal.k.b(source.f1725x);
                int i10 = 0;
                if (j < i6 - r1.f1711b) {
                    g0 g0Var2 = this.f1725x;
                    g0 g0Var3 = g0Var2 != null ? g0Var2.f1716g : null;
                    if (g0Var3 != null && g0Var3.f1714e) {
                        if ((g0Var3.f1712c + j) - (g0Var3.f1713d ? 0 : g0Var3.f1711b) <= 8192) {
                            g0 g0Var4 = source.f1725x;
                            kotlin.jvm.internal.k.b(g0Var4);
                            g0Var4.d(g0Var3, (int) j);
                            source.f1726y -= j;
                            this.f1726y += j;
                            return;
                        }
                    }
                    g0 g0Var5 = source.f1725x;
                    kotlin.jvm.internal.k.b(g0Var5);
                    int i11 = (int) j;
                    if (i11 > 0 && i11 <= g0Var5.f1712c - g0Var5.f1711b) {
                        if (i11 >= 1024) {
                            b10 = g0Var5.c();
                        } else {
                            b10 = h0.b();
                            byte[] bArr = g0Var5.f1710a;
                            byte[] bArr2 = b10.f1710a;
                            int i12 = g0Var5.f1711b;
                            ie.i.b0(0, i12, i12 + i11, bArr, bArr2);
                        }
                        b10.f1712c = b10.f1711b + i11;
                        g0Var5.f1711b += i11;
                        g0 g0Var6 = g0Var5.f1716g;
                        kotlin.jvm.internal.k.b(g0Var6);
                        g0Var6.b(b10);
                        source.f1725x = b10;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range");
                    }
                }
                g0 g0Var7 = source.f1725x;
                kotlin.jvm.internal.k.b(g0Var7);
                long j10 = g0Var7.f1712c - g0Var7.f1711b;
                source.f1725x = g0Var7.a();
                g0 g0Var8 = this.f1725x;
                if (g0Var8 == null) {
                    this.f1725x = g0Var7;
                    g0Var7.f1716g = g0Var7;
                    g0Var7.f1715f = g0Var7;
                } else {
                    g0 g0Var9 = g0Var8.f1716g;
                    kotlin.jvm.internal.k.b(g0Var9);
                    g0Var9.b(g0Var7);
                    g0 g0Var10 = g0Var7.f1716g;
                    if (g0Var10 != g0Var7) {
                        kotlin.jvm.internal.k.b(g0Var10);
                        if (g0Var10.f1714e) {
                            int i13 = g0Var7.f1712c - g0Var7.f1711b;
                            g0 g0Var11 = g0Var7.f1716g;
                            kotlin.jvm.internal.k.b(g0Var11);
                            int i14 = 8192 - g0Var11.f1712c;
                            g0 g0Var12 = g0Var7.f1716g;
                            kotlin.jvm.internal.k.b(g0Var12);
                            if (!g0Var12.f1713d) {
                                g0 g0Var13 = g0Var7.f1716g;
                                kotlin.jvm.internal.k.b(g0Var13);
                                i10 = g0Var13.f1711b;
                            }
                            if (i13 <= i14 + i10) {
                                g0 g0Var14 = g0Var7.f1716g;
                                kotlin.jvm.internal.k.b(g0Var14);
                                g0Var7.d(g0Var14, i13);
                                g0Var7.a();
                                h0.a(g0Var7);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact");
                    }
                }
                source.f1726y -= j10;
                this.f1726y += j10;
                j -= j10;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.k.e(sink, "sink");
        g0 g0Var = this.f1725x;
        if (g0Var == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), g0Var.f1712c - g0Var.f1711b);
        sink.put(g0Var.f1710a, g0Var.f1711b, min);
        int i6 = g0Var.f1711b + min;
        g0Var.f1711b = i6;
        this.f1726y -= min;
        if (i6 == g0Var.f1712c) {
            this.f1725x = g0Var.a();
            h0.a(g0Var);
        }
        return min;
    }

    @Override // bg.m
    public final k a() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, bg.j0
    public final void close() {
    }

    @Override // bg.l, bg.j0, java.io.Flushable
    public final void flush() {
    }

    @Override // bg.l
    public final l j() {
        return this;
    }

    public final int read(byte[] sink, int i6, int i10) {
        kotlin.jvm.internal.k.e(sink, "sink");
        b.f(sink.length, i6, i10);
        g0 g0Var = this.f1725x;
        if (g0Var == null) {
            return -1;
        }
        int min = Math.min(i10, g0Var.f1712c - g0Var.f1711b);
        byte[] bArr = g0Var.f1710a;
        int i11 = g0Var.f1711b;
        ie.i.b0(i6, i11, i11 + min, bArr, sink);
        int i12 = g0Var.f1711b + min;
        g0Var.f1711b = i12;
        this.f1726y -= min;
        if (i12 == g0Var.f1712c) {
            this.f1725x = g0Var.a();
            h0.a(g0Var);
        }
        return min;
    }

    @Override // bg.l
    public final l t() {
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.k.e(source, "source");
        int remaining = source.remaining();
        int i6 = remaining;
        while (i6 > 0) {
            g0 j02 = j0(1);
            int min = Math.min(i6, 8192 - j02.f1712c);
            source.get(j02.f1710a, j02.f1712c, min);
            i6 -= min;
            j02.f1712c += min;
        }
        this.f1726y += remaining;
        return remaining;
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m0write(byte[] source) {
        kotlin.jvm.internal.k.e(source, "source");
        m1write(source, 0, source.length);
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m1write(byte[] source, int i6, int i10) {
        kotlin.jvm.internal.k.e(source, "source");
        long j = i10;
        b.f(source.length, i6, j);
        int i11 = i10 + i6;
        while (i6 < i11) {
            g0 j02 = j0(1);
            int min = Math.min(i11 - i6, 8192 - j02.f1712c);
            int i12 = i6 + min;
            ie.i.b0(j02.f1712c, i6, i12, source, j02.f1710a);
            j02.f1712c += min;
            i6 = i12;
        }
        this.f1726y += j;
    }
}
