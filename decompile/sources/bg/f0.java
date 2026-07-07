package bg;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f0 implements m {

    /* renamed from: x, reason: collision with root package name */
    public final l0 f1707x;

    /* renamed from: y, reason: collision with root package name */
    public final k f1708y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1709z;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, bg.k] */
    public f0(l0 source) {
        kotlin.jvm.internal.k.e(source, "source");
        this.f1707x = source;
        this.f1708y = new Object();
    }

    @Override // bg.m
    public final String H(Charset charset) {
        kotlin.jvm.internal.k.e(charset, "charset");
        l0 l0Var = this.f1707x;
        k kVar = this.f1708y;
        kVar.T(l0Var);
        return kVar.H(charset);
    }

    @Override // bg.m
    public final boolean I(long j, n bytes) {
        kotlin.jvm.internal.k.e(bytes, "bytes");
        int d10 = bytes.d();
        if (!this.f1709z) {
            if (j >= 0 && d10 >= 0 && bytes.d() >= d10) {
                for (int i6 = 0; i6 < d10; i6++) {
                    long j10 = i6 + j;
                    if (P(1 + j10) && this.f1708y.y(j10) == bytes.i(i6)) {
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed");
    }

    public final String K(long j) {
        Y(j);
        k kVar = this.f1708y;
        kVar.getClass();
        return kVar.g0(j, df.a.f4115a);
    }

    @Override // bg.m
    public final n N() {
        l0 l0Var = this.f1707x;
        k kVar = this.f1708y;
        kVar.T(l0Var);
        return kVar.g(kVar.f1726y);
    }

    @Override // bg.m
    public final void O(k sink, long j) {
        k kVar = this.f1708y;
        kotlin.jvm.internal.k.e(sink, "sink");
        try {
            Y(j);
            kVar.O(sink, j);
        } catch (EOFException e10) {
            sink.T(kVar);
            throw e10;
        }
    }

    @Override // bg.m
    public final boolean P(long j) {
        k kVar;
        if (j >= 0) {
            if (this.f1709z) {
                throw new IllegalStateException("closed");
            }
            do {
                kVar = this.f1708y;
                if (kVar.f1726y >= j) {
                    return true;
                }
            } while (this.f1707x.read(kVar, 8192L) != -1);
            return false;
        }
        throw new IllegalArgumentException(r4.a.j("byteCount < 0: ", j).toString());
    }

    @Override // bg.m
    public final String R() {
        return x(Long.MAX_VALUE);
    }

    @Override // bg.m
    public final void Y(long j) {
        if (P(j)) {
        } else {
            throw new EOFException();
        }
    }

    @Override // bg.m
    public final k a() {
        return this.f1708y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        a.a.g(16);
        r1 = java.lang.Integer.toString(r2, 16);
        kotlin.jvm.internal.k.d(r1, "toString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r1));
     */
    @Override // bg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c0() {
        /*
            r6 = this;
            r0 = 1
            r6.Y(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r6.P(r2)
            bg.k r3 = r6.f1708y
            if (r2 == 0) goto L4e
            long r4 = (long) r0
            byte r2 = r3.y(r4)
            r4 = 48
            if (r2 < r4) goto L1e
            r4 = 57
            if (r2 <= r4) goto L2f
        L1e:
            r4 = 97
            if (r2 < r4) goto L26
            r4 = 102(0x66, float:1.43E-43)
            if (r2 <= r4) goto L2f
        L26:
            r4 = 65
            if (r2 < r4) goto L31
            r4 = 70
            if (r2 <= r4) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L4e
        L34:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            a.a.g(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.k.d(r1, r2)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L4e:
            long r0 = r3.c0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.f0.c0():long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.f1709z) {
            this.f1709z = true;
            this.f1707x.close();
            this.f1708y.d();
        }
    }

    public final long d(byte b10, long j, long j10) {
        if (!this.f1709z) {
            if (0 <= j10) {
                long j11 = 0;
                while (j11 < j10) {
                    k kVar = this.f1708y;
                    byte b11 = b10;
                    long j12 = j10;
                    long K = kVar.K(b11, j11, j12);
                    if (K != -1) {
                        return K;
                    }
                    long j13 = kVar.f1726y;
                    if (j13 >= j12 || this.f1707x.read(kVar, 8192L) == -1) {
                        break;
                    }
                    j11 = Math.max(j11, j13);
                    b10 = b11;
                    j10 = j12;
                }
                return -1L;
            }
            throw new IllegalArgumentException(r4.a.j("fromIndex=0 toIndex=", j10).toString());
        }
        throw new IllegalStateException("closed");
    }

    @Override // bg.m
    public final InputStream e0() {
        return new j(this, 1);
    }

    public final long f(n targetBytes) {
        kotlin.jvm.internal.k.e(targetBytes, "targetBytes");
        if (!this.f1709z) {
            long j = 0;
            while (true) {
                k kVar = this.f1708y;
                long Q = kVar.Q(j, targetBytes);
                if (Q != -1) {
                    return Q;
                }
                long j10 = kVar.f1726y;
                if (this.f1707x.read(kVar, 8192L) == -1) {
                    return -1L;
                }
                j = Math.max(j, j10);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    @Override // bg.m
    public final n g(long j) {
        Y(j);
        return this.f1708y.g(j);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f1709z;
    }

    public final int l() {
        Y(4L);
        int readInt = this.f1708y.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public final long m() {
        Y(8L);
        long readLong = this.f1708y.readLong();
        return ((readLong & 255) << 56) | (((-72057594037927936L) & readLong) >>> 56) | ((71776119061217280L & readLong) >>> 40) | ((280375465082880L & readLong) >>> 24) | ((1095216660480L & readLong) >>> 8) | ((4278190080L & readLong) << 8) | ((16711680 & readLong) << 24) | ((65280 & readLong) << 40);
    }

    @Override // bg.m
    public final byte[] p() {
        l0 l0Var = this.f1707x;
        k kVar = this.f1708y;
        kVar.T(l0Var);
        return kVar.b0(kVar.f1726y);
    }

    @Override // bg.m
    public final f0 peek() {
        return b.d(new d0(this));
    }

    @Override // bg.m
    public final boolean r() {
        if (!this.f1709z) {
            k kVar = this.f1708y;
            if (kVar.r() && this.f1707x.read(kVar, 8192L) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.k.e(sink, "sink");
        k kVar = this.f1708y;
        if (kVar.f1726y == 0 && this.f1707x.read(kVar, 8192L) == -1) {
            return -1;
        }
        return kVar.read(sink);
    }

    @Override // bg.m
    public final byte readByte() {
        Y(1L);
        return this.f1708y.readByte();
    }

    @Override // bg.m
    public final void readFully(byte[] sink) {
        k kVar = this.f1708y;
        kotlin.jvm.internal.k.e(sink, "sink");
        try {
            Y(sink.length);
            kVar.readFully(sink);
        } catch (EOFException e10) {
            int i6 = 0;
            while (true) {
                long j = kVar.f1726y;
                if (j > 0) {
                    int read = kVar.read(sink, i6, (int) j);
                    if (read != -1) {
                        i6 += read;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e10;
                }
            }
        }
    }

    @Override // bg.m
    public final int readInt() {
        Y(4L);
        return this.f1708y.readInt();
    }

    @Override // bg.m
    public final long readLong() {
        Y(8L);
        return this.f1708y.readLong();
    }

    @Override // bg.m
    public final short readShort() {
        Y(2L);
        return this.f1708y.readShort();
    }

    @Override // bg.m
    public final long s(e0 e0Var) {
        k kVar;
        long j = 0;
        while (true) {
            l0 l0Var = this.f1707x;
            kVar = this.f1708y;
            if (l0Var.read(kVar, 8192L) == -1) {
                break;
            }
            long l10 = kVar.l();
            if (l10 > 0) {
                j += l10;
                e0Var.write(kVar, l10);
            }
        }
        long j10 = kVar.f1726y;
        if (j10 > 0) {
            long j11 = j + j10;
            e0Var.write(kVar, j10);
            return j11;
        }
        return j;
    }

    @Override // bg.m
    public final void skip(long j) {
        if (!this.f1709z) {
            while (j > 0) {
                k kVar = this.f1708y;
                if (kVar.f1726y == 0 && this.f1707x.read(kVar, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, kVar.f1726y);
                kVar.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // bg.l0
    public final o0 timeout() {
        return this.f1707x.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f1707x + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        a.a.g(16);
        r1 = java.lang.Integer.toString(r8, 16);
        kotlin.jvm.internal.k.d(r1, "toString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        throw new java.lang.NumberFormatException("Expected a digit or '-' but was 0x".concat(r1));
     */
    @Override // bg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long u() {
        /*
            r11 = this;
            r0 = 1
            r11.Y(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r11.P(r6)
            bg.k r9 = r11.f1708y
            if (r8 == 0) goto L46
            byte r8 = r9.y(r4)
            r10 = 48
            if (r8 < r10) goto L1e
            r10 = 57
            if (r8 <= r10) goto L27
        L1e:
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 != 0) goto L29
            r4 = 45
            if (r8 == r4) goto L27
            goto L29
        L27:
            r4 = r6
            goto L8
        L29:
            if (r10 == 0) goto L2c
            goto L46
        L2c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            a.a.g(r1)
            java.lang.String r1 = java.lang.Integer.toString(r8, r1)
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.k.d(r1, r2)
            java.lang.String r2 = "Expected a digit or '-' but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L46:
            long r0 = r9.u()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.f0.u():long");
    }

    @Override // bg.m
    public final int w(b0 options) {
        kotlin.jvm.internal.k.e(options, "options");
        if (this.f1709z) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            k kVar = this.f1708y;
            int c10 = cg.a.c(kVar, options, true);
            if (c10 != -2) {
                if (c10 != -1) {
                    kVar.skip(options.f1690x[c10].d());
                    return c10;
                }
            } else if (this.f1707x.read(kVar, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, bg.k] */
    @Override // bg.m
    public final String x(long j) {
        long j10;
        if (j >= 0) {
            if (j == Long.MAX_VALUE) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = j + 1;
            }
            long d10 = d((byte) 10, 0L, j10);
            k kVar = this.f1708y;
            if (d10 != -1) {
                return cg.a.b(kVar, d10);
            }
            if (j10 < Long.MAX_VALUE && P(j10) && kVar.y(j10 - 1) == 13 && P(j10 + 1) && kVar.y(j10) == 10) {
                return cg.a.b(kVar, j10);
            }
            ?? obj = new Object();
            kVar.m(0L, obj, Math.min(32, kVar.f1726y));
            throw new EOFException("\\n not found: limit=" + Math.min(kVar.f1726y, j) + " content=" + obj.g(obj.f1726y).e() + (char) 8230);
        }
        throw new IllegalArgumentException(r4.a.j("limit < 0: ", j).toString());
    }

    public final short y() {
        Y(2L);
        return this.f1708y.f0();
    }

    @Override // bg.l0
    public final long read(k sink, long j) {
        kotlin.jvm.internal.k.e(sink, "sink");
        if (j >= 0) {
            if (!this.f1709z) {
                k kVar = this.f1708y;
                if (kVar.f1726y == 0 && this.f1707x.read(kVar, 8192L) == -1) {
                    return -1L;
                }
                return kVar.read(sink, Math.min(j, kVar.f1726y));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(r4.a.j("byteCount < 0: ", j).toString());
    }
}
