package bg;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v implements l0 {
    public boolean A;

    /* renamed from: x, reason: collision with root package name */
    public final f0 f1746x;

    /* renamed from: y, reason: collision with root package name */
    public final Inflater f1747y;

    /* renamed from: z, reason: collision with root package name */
    public int f1748z;

    public v(f0 f0Var, Inflater inflater) {
        this.f1746x = f0Var;
        this.f1747y = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.A) {
            return;
        }
        this.f1747y.end();
        this.A = true;
        this.f1746x.close();
    }

    public final long d(k sink, long j) {
        Inflater inflater = this.f1747y;
        kotlin.jvm.internal.k.e(sink, "sink");
        if (j >= 0) {
            if (!this.A) {
                if (j != 0) {
                    try {
                        g0 j02 = sink.j0(1);
                        int min = (int) Math.min(j, 8192 - j02.f1712c);
                        boolean needsInput = inflater.needsInput();
                        f0 f0Var = this.f1746x;
                        if (needsInput && !f0Var.r()) {
                            g0 g0Var = f0Var.f1708y.f1725x;
                            kotlin.jvm.internal.k.b(g0Var);
                            int i6 = g0Var.f1712c;
                            int i10 = g0Var.f1711b;
                            int i11 = i6 - i10;
                            this.f1748z = i11;
                            inflater.setInput(g0Var.f1710a, i10, i11);
                        }
                        int inflate = inflater.inflate(j02.f1710a, j02.f1712c, min);
                        int i12 = this.f1748z;
                        if (i12 != 0) {
                            int remaining = i12 - inflater.getRemaining();
                            this.f1748z -= remaining;
                            f0Var.skip(remaining);
                        }
                        if (inflate > 0) {
                            j02.f1712c += inflate;
                            long j10 = inflate;
                            sink.f1726y += j10;
                            return j10;
                        }
                        if (j02.f1711b == j02.f1712c) {
                            sink.f1725x = j02.a();
                            h0.a(j02);
                        }
                    } catch (DataFormatException e10) {
                        throw new IOException(e10);
                    }
                }
                return 0L;
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(r4.a.j("byteCount < 0: ", j).toString());
    }

    @Override // bg.l0
    public final long read(k sink, long j) {
        kotlin.jvm.internal.k.e(sink, "sink");
        do {
            long d10 = d(sink, j);
            if (d10 > 0) {
                return d10;
            }
            Inflater inflater = this.f1747y;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f1746x.r());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // bg.l0
    public final o0 timeout() {
        return this.f1746x.f1707x.timeout();
    }
}
