package bg;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p implements l0 {

    /* renamed from: x, reason: collision with root package name */
    public final w f1734x;

    /* renamed from: y, reason: collision with root package name */
    public long f1735y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1736z;

    public p(w wVar, long j) {
        this.f1734x = wVar;
        this.f1735y = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        w wVar = this.f1734x;
        if (this.f1736z) {
            return;
        }
        this.f1736z = true;
        ReentrantLock reentrantLock = wVar.f1751z;
        reentrantLock.lock();
        try {
            int i6 = wVar.f1750y - 1;
            wVar.f1750y = i6;
            if (i6 == 0) {
                if (wVar.f1749x) {
                    synchronized (wVar) {
                        wVar.A.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bg.l0
    public final long read(k sink, long j) {
        long j10;
        long j11;
        int i6;
        kotlin.jvm.internal.k.e(sink, "sink");
        if (!this.f1736z) {
            w wVar = this.f1734x;
            long j12 = this.f1735y;
            if (j >= 0) {
                long j13 = j + j12;
                long j14 = j12;
                while (true) {
                    if (j14 < j13) {
                        g0 j02 = sink.j0(1);
                        byte[] array = j02.f1710a;
                        int i10 = j02.f1712c;
                        j10 = -1;
                        int min = (int) Math.min(j13 - j14, 8192 - i10);
                        synchronized (wVar) {
                            kotlin.jvm.internal.k.e(array, "array");
                            wVar.A.seek(j14);
                            i6 = 0;
                            while (true) {
                                if (i6 >= min) {
                                    break;
                                }
                                int read = wVar.A.read(array, i10, min - i6);
                                if (read == -1) {
                                    if (i6 == 0) {
                                        i6 = -1;
                                    }
                                } else {
                                    i6 += read;
                                }
                            }
                        }
                        if (i6 == -1) {
                            if (j02.f1711b == j02.f1712c) {
                                sink.f1725x = j02.a();
                                h0.a(j02);
                            }
                            if (j12 == j14) {
                                j11 = -1;
                            }
                        } else {
                            j02.f1712c += i6;
                            long j15 = i6;
                            j14 += j15;
                            sink.f1726y += j15;
                        }
                    } else {
                        j10 = -1;
                        break;
                    }
                }
                j11 = j14 - j12;
                if (j11 != j10) {
                    this.f1735y += j11;
                }
                return j11;
            }
            throw new IllegalArgumentException(r4.a.j("byteCount < 0: ", j).toString());
        }
        throw new IllegalStateException("closed");
    }

    @Override // bg.l0
    public final o0 timeout() {
        return o0.NONE;
    }
}
