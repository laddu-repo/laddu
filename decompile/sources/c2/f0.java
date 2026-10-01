package c2;

import android.os.SystemClock;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public Exception f1796a;

    /* renamed from: b, reason: collision with root package name */
    public long f1797b = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    public long f1798c = -9223372036854775807L;

    public final void a(Exception exc) {
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f1796a == null) {
            this.f1796a = exc;
        }
        if (this.f1797b == -9223372036854775807L) {
            synchronized (i0.o0) {
                if (i0.f1817q0 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                this.f1797b = 200 + elapsedRealtime;
            }
        }
        long j = this.f1797b;
        if (j != -9223372036854775807L && elapsedRealtime >= j) {
            Exception exc2 = this.f1796a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f1796a;
            this.f1796a = null;
            this.f1797b = -9223372036854775807L;
            this.f1798c = -9223372036854775807L;
            throw exc3;
        }
        this.f1798c = elapsedRealtime + 50;
    }
}
