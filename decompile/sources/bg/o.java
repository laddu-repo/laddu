package bg;

import java.io.IOException;
import java.util.zip.Deflater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o implements j0 {

    /* renamed from: x, reason: collision with root package name */
    public final e0 f1731x;

    /* renamed from: y, reason: collision with root package name */
    public final Deflater f1732y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1733z;

    public o(k kVar, Deflater deflater) {
        this.f1731x = b.c(kVar);
        this.f1732y = deflater;
    }

    @Override // bg.j0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Deflater deflater = this.f1732y;
        if (!this.f1733z) {
            try {
                deflater.finish();
                d(false);
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                deflater.end();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            try {
                this.f1731x.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f1733z = true;
            if (th == null) {
            } else {
                throw th;
            }
        }
    }

    public final void d(boolean z10) {
        g0 j02;
        int deflate;
        e0 e0Var = this.f1731x;
        k kVar = e0Var.f1702y;
        while (true) {
            j02 = kVar.j0(1);
            byte[] bArr = j02.f1710a;
            Deflater deflater = this.f1732y;
            if (z10) {
                try {
                    int i6 = j02.f1712c;
                    deflate = deflater.deflate(bArr, i6, 8192 - i6, 2);
                } catch (NullPointerException e10) {
                    throw new IOException("Deflater already closed", e10);
                }
            } else {
                int i10 = j02.f1712c;
                deflate = deflater.deflate(bArr, i10, 8192 - i10);
            }
            if (deflate > 0) {
                j02.f1712c += deflate;
                kVar.f1726y += deflate;
                e0Var.t();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (j02.f1711b == j02.f1712c) {
            kVar.f1725x = j02.a();
            h0.a(j02);
        }
    }

    @Override // bg.j0, java.io.Flushable
    public final void flush() {
        d(true);
        this.f1731x.flush();
    }

    @Override // bg.j0
    public final o0 timeout() {
        return this.f1731x.f1701x.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f1731x + ')';
    }

    @Override // bg.j0
    public final void write(k source, long j) {
        kotlin.jvm.internal.k.e(source, "source");
        b.f(source.f1726y, 0L, j);
        while (j > 0) {
            g0 g0Var = source.f1725x;
            kotlin.jvm.internal.k.b(g0Var);
            int min = (int) Math.min(j, g0Var.f1712c - g0Var.f1711b);
            this.f1732y.setInput(g0Var.f1710a, g0Var.f1711b, min);
            d(false);
            long j10 = min;
            source.f1726y -= j10;
            int i6 = g0Var.f1711b + min;
            g0Var.f1711b = i6;
            if (i6 == g0Var.f1712c) {
                source.f1725x = g0Var.a();
                h0.a(g0Var);
            }
            j -= j10;
        }
    }
}
