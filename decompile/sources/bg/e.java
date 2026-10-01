package bg;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements j0 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f1698x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f1699y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f1700z;

    public /* synthetic */ e(int i6, Object obj, Object obj2) {
        this.f1698x = i6;
        this.f1699y = obj;
        this.f1700z = obj2;
    }

    @Override // bg.j0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f1698x) {
            case 0:
                g gVar = (g) this.f1699y;
                j0 j0Var = (j0) this.f1700z;
                gVar.enter();
                try {
                    j0Var.close();
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
                ((OutputStream) this.f1699y).close();
                return;
        }
    }

    @Override // bg.j0, java.io.Flushable
    public final void flush() {
        switch (this.f1698x) {
            case 0:
                g gVar = (g) this.f1699y;
                j0 j0Var = (j0) this.f1700z;
                gVar.enter();
                try {
                    j0Var.flush();
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
                ((OutputStream) this.f1699y).flush();
                return;
        }
    }

    @Override // bg.j0
    public final o0 timeout() {
        switch (this.f1698x) {
            case 0:
                return (g) this.f1699y;
            default:
                return (o0) this.f1700z;
        }
    }

    public final String toString() {
        switch (this.f1698x) {
            case 0:
                return "AsyncTimeout.sink(" + ((j0) this.f1700z) + ')';
            default:
                return "sink(" + ((OutputStream) this.f1699y) + ')';
        }
    }

    @Override // bg.j0
    public final void write(k source, long j) {
        switch (this.f1698x) {
            case 0:
                kotlin.jvm.internal.k.e(source, "source");
                b.f(source.f1726y, 0L, j);
                long j10 = j;
                while (true) {
                    long j11 = 0;
                    if (j10 > 0) {
                        g0 g0Var = source.f1725x;
                        kotlin.jvm.internal.k.b(g0Var);
                        while (true) {
                            if (j11 < 65536) {
                                j11 += g0Var.f1712c - g0Var.f1711b;
                                if (j11 >= j10) {
                                    j11 = j10;
                                } else {
                                    g0Var = g0Var.f1715f;
                                    kotlin.jvm.internal.k.b(g0Var);
                                }
                            }
                        }
                        g gVar = (g) this.f1699y;
                        j0 j0Var = (j0) this.f1700z;
                        gVar.enter();
                        try {
                            try {
                                j0Var.write(source, j11);
                                if (!gVar.exit()) {
                                    j10 -= j11;
                                } else {
                                    throw gVar.access$newTimeoutException(null);
                                }
                            } catch (IOException e10) {
                                if (!gVar.exit()) {
                                    throw e10;
                                }
                                throw gVar.access$newTimeoutException(e10);
                            }
                        } catch (Throwable th) {
                            gVar.exit();
                            throw th;
                        }
                    } else {
                        return;
                    }
                }
            default:
                kotlin.jvm.internal.k.e(source, "source");
                b.f(source.f1726y, 0L, j);
                while (j > 0) {
                    ((o0) this.f1700z).throwIfReached();
                    g0 g0Var2 = source.f1725x;
                    kotlin.jvm.internal.k.b(g0Var2);
                    int min = (int) Math.min(j, g0Var2.f1712c - g0Var2.f1711b);
                    ((OutputStream) this.f1699y).write(g0Var2.f1710a, g0Var2.f1711b, min);
                    int i6 = g0Var2.f1711b + min;
                    g0Var2.f1711b = i6;
                    long j12 = min;
                    j -= j12;
                    source.f1726y -= j12;
                    if (i6 == g0Var2.f1712c) {
                        source.f1725x = g0Var2.a();
                        h0.a(g0Var2);
                    }
                }
                return;
        }
    }
}
