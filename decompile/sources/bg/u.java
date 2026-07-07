package bg;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u implements l0 {
    public final v A;
    public final CRC32 B;

    /* renamed from: x, reason: collision with root package name */
    public byte f1743x;

    /* renamed from: y, reason: collision with root package name */
    public final f0 f1744y;

    /* renamed from: z, reason: collision with root package name */
    public final Inflater f1745z;

    public u(l0 source) {
        kotlin.jvm.internal.k.e(source, "source");
        f0 f0Var = new f0(source);
        this.f1744y = f0Var;
        Inflater inflater = new Inflater(true);
        this.f1745z = inflater;
        this.A = new v(f0Var, inflater);
        this.B = new CRC32();
    }

    public static void d(String str, int i6, int i10) {
        if (i10 == i6) {
            return;
        }
        throw new IOException(str + ": actual 0x" + df.m.V(8, b.n(i10)) + " != expected 0x" + df.m.V(8, b.n(i6)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    public final void f(long j, k kVar, long j10) {
        g0 g0Var = kVar.f1725x;
        kotlin.jvm.internal.k.b(g0Var);
        while (true) {
            int i6 = g0Var.f1712c;
            int i10 = g0Var.f1711b;
            if (j < i6 - i10) {
                break;
            }
            j -= i6 - i10;
            g0Var = g0Var.f1715f;
            kotlin.jvm.internal.k.b(g0Var);
        }
        while (j10 > 0) {
            int min = (int) Math.min(g0Var.f1712c - r6, j10);
            this.B.update(g0Var.f1710a, (int) (g0Var.f1711b + j), min);
            j10 -= min;
            g0Var = g0Var.f1715f;
            kotlin.jvm.internal.k.b(g0Var);
            j = 0;
        }
    }

    @Override // bg.l0
    public final long read(k sink, long j) {
        boolean z10;
        u uVar = this;
        kotlin.jvm.internal.k.e(sink, "sink");
        if (j >= 0) {
            if (j == 0) {
                return 0L;
            }
            byte b10 = uVar.f1743x;
            CRC32 crc32 = uVar.B;
            f0 f0Var = uVar.f1744y;
            if (b10 == 0) {
                f0Var.Y(10L);
                k kVar = f0Var.f1708y;
                byte y9 = kVar.y(3L);
                if (((y9 >> 1) & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    uVar.f(0L, kVar, 10L);
                }
                d("ID1ID2", 8075, f0Var.readShort());
                f0Var.skip(8L);
                if (((y9 >> 2) & 1) == 1) {
                    f0Var.Y(2L);
                    if (z10) {
                        f(0L, kVar, 2L);
                    }
                    long f02 = kVar.f0() & 65535;
                    f0Var.Y(f02);
                    if (z10) {
                        f(0L, kVar, f02);
                    }
                    f0Var.skip(f02);
                }
                if (((y9 >> 3) & 1) == 1) {
                    long d10 = f0Var.d((byte) 0, 0L, Long.MAX_VALUE);
                    if (d10 != -1) {
                        if (z10) {
                            f(0L, kVar, d10 + 1);
                        }
                        f0Var.skip(d10 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((y9 >> 4) & 1) == 1) {
                    long d11 = f0Var.d((byte) 0, 0L, Long.MAX_VALUE);
                    if (d11 != -1) {
                        if (z10) {
                            uVar = this;
                            uVar.f(0L, kVar, d11 + 1);
                        } else {
                            uVar = this;
                        }
                        f0Var.skip(d11 + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    uVar = this;
                }
                if (z10) {
                    d("FHCRC", f0Var.y(), (short) crc32.getValue());
                    crc32.reset();
                }
                uVar.f1743x = (byte) 1;
            }
            if (uVar.f1743x == 1) {
                long j10 = sink.f1726y;
                long read = uVar.A.read(sink, j);
                if (read != -1) {
                    uVar.f(j10, sink, read);
                    return read;
                }
                uVar.f1743x = (byte) 2;
            }
            if (uVar.f1743x == 2) {
                d("CRC", f0Var.l(), (int) crc32.getValue());
                d("ISIZE", f0Var.l(), (int) uVar.f1745z.getBytesWritten());
                uVar.f1743x = (byte) 3;
                if (!f0Var.r()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(r4.a.j("byteCount < 0: ", j).toString());
    }

    @Override // bg.l0
    public final o0 timeout() {
        return this.f1744y.f1707x.timeout();
    }
}
