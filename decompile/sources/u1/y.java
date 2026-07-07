package u1;

import java.math.RoundingMode;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public long f12821a;

    /* renamed from: b, reason: collision with root package name */
    public long f12822b;

    /* renamed from: c, reason: collision with root package name */
    public long f12823c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f12824d = new ThreadLocal();

    public y(long j) {
        g(j);
    }

    public final synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!f()) {
                long j10 = this.f12821a;
                if (j10 == 9223372036854775806L) {
                    Long l10 = (Long) this.f12824d.get();
                    l10.getClass();
                    j10 = l10.longValue();
                }
                this.f12822b = j10 - j;
                notifyAll();
            }
            this.f12823c = j;
            return j + this.f12822b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j10 = this.f12823c;
            if (j10 != -9223372036854775807L) {
                String str = a0.f12750a;
                long Y = a0.Y(j10, 90000L, 1000000L, RoundingMode.DOWN);
                long j11 = (4294967296L + Y) / 8589934592L;
                long j12 = ((j11 - 1) * 8589934592L) + j;
                long j13 = (j11 * 8589934592L) + j;
                if (Math.abs(j12 - Y) < Math.abs(j13 - Y)) {
                    j = j12;
                } else {
                    j = j13;
                }
            }
            long j14 = j;
            String str2 = a0.f12750a;
            return a(a0.Y(j14, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j10 = this.f12823c;
        if (j10 != -9223372036854775807L) {
            String str = a0.f12750a;
            long Y = a0.Y(j10, 90000L, 1000000L, RoundingMode.DOWN);
            long j11 = Y / 8589934592L;
            Long.signum(j11);
            long j12 = (j11 * 8589934592L) + j;
            long j13 = ((j11 + 1) * 8589934592L) + j;
            if (j12 >= Y) {
                j = j12;
            } else {
                j = j13;
            }
        }
        long j14 = j;
        String str2 = a0.f12750a;
        return a(a0.Y(j14, 1000000L, 90000L, RoundingMode.DOWN));
    }

    public final synchronized long d() {
        long j;
        j = this.f12821a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized long e() {
        return this.f12822b;
    }

    public final synchronized boolean f() {
        boolean z10;
        if (this.f12822b != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public final synchronized void g(long j) {
        long j10;
        this.f12821a = j;
        if (j == Long.MAX_VALUE) {
            j10 = 0;
        } else {
            j10 = -9223372036854775807L;
        }
        this.f12822b = j10;
        this.f12823c = -9223372036854775807L;
    }

    public final synchronized void h(boolean z10, long j) {
        boolean z11;
        try {
            if (this.f12821a == 9223372036854775806L) {
                z11 = true;
            } else {
                z11 = false;
            }
            c.g(z11);
            if (f()) {
                return;
            }
            if (z10) {
                this.f12824d.set(Long.valueOf(j));
            } else {
                while (!f()) {
                    wait();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
