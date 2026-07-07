package bg;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements l0 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f1704x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final Object f1705y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f1706z;

    public f(InputStream input, o0 timeout) {
        kotlin.jvm.internal.k.e(input, "input");
        kotlin.jvm.internal.k.e(timeout, "timeout");
        this.f1705y = input;
        this.f1706z = timeout;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f1704x) {
            case 0:
                g gVar = (g) this.f1705y;
                l0 l0Var = (l0) this.f1706z;
                gVar.enter();
                try {
                    l0Var.close();
                    if (!gVar.exit()) {
                        return;
                    } else {
                        throw gVar.access$newTimeoutException(null);
                    }
                } catch (IOException e10) {
                    if (!gVar.exit()) {
                        throw e10;
                    }
                    throw gVar.access$newTimeoutException(e10);
                } finally {
                    gVar.exit();
                }
            default:
                ((InputStream) this.f1705y).close();
                return;
        }
    }

    @Override // bg.l0
    public final long read(k sink, long j) {
        switch (this.f1704x) {
            case 0:
                kotlin.jvm.internal.k.e(sink, "sink");
                g gVar = (g) this.f1705y;
                l0 l0Var = (l0) this.f1706z;
                gVar.enter();
                try {
                    long read = l0Var.read(sink, j);
                    if (!gVar.exit()) {
                        return read;
                    }
                    throw gVar.access$newTimeoutException(null);
                } catch (IOException e10) {
                    if (!gVar.exit()) {
                        throw e10;
                    }
                    throw gVar.access$newTimeoutException(e10);
                } finally {
                    gVar.exit();
                }
            default:
                kotlin.jvm.internal.k.e(sink, "sink");
                if (j == 0) {
                    return 0L;
                }
                if (j >= 0) {
                    try {
                        ((o0) this.f1706z).throwIfReached();
                        g0 j02 = sink.j0(1);
                        int read2 = ((InputStream) this.f1705y).read(j02.f1710a, j02.f1712c, (int) Math.min(j, 8192 - j02.f1712c));
                        if (read2 == -1) {
                            if (j02.f1711b == j02.f1712c) {
                                sink.f1725x = j02.a();
                                h0.a(j02);
                            }
                            return -1L;
                        }
                        j02.f1712c += read2;
                        long j10 = read2;
                        sink.f1726y += j10;
                        return j10;
                    } catch (AssertionError e11) {
                        if (b.g(e11)) {
                            throw new IOException(e11);
                        }
                        throw e11;
                    }
                }
                throw new IllegalArgumentException(r4.a.j("byteCount < 0: ", j).toString());
        }
    }

    @Override // bg.l0
    public final o0 timeout() {
        switch (this.f1704x) {
            case 0:
                return (g) this.f1705y;
            default:
                return (o0) this.f1706z;
        }
    }

    public final String toString() {
        switch (this.f1704x) {
            case 0:
                return "AsyncTimeout.source(" + ((l0) this.f1706z) + ')';
            default:
                return "source(" + ((InputStream) this.f1705y) + ')';
        }
    }

    public f(g gVar, l0 l0Var) {
        this.f1705y = gVar;
        this.f1706z = l0Var;
    }
}
