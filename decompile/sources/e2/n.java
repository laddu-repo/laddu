package e2;

import java.math.RoundingMode;
import java.util.List;
import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class n extends s {

    /* renamed from: d, reason: collision with root package name */
    public final long f4260d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4261e;

    /* renamed from: f, reason: collision with root package name */
    public final List f4262f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4263g;

    /* renamed from: h, reason: collision with root package name */
    public final long f4264h;

    /* renamed from: i, reason: collision with root package name */
    public final long f4265i;

    public n(j jVar, long j, long j10, long j11, long j12, List list, long j13, long j14, long j15) {
        super(jVar, j, j10);
        this.f4260d = j11;
        this.f4261e = j12;
        this.f4262f = list;
        this.f4265i = j13;
        this.f4263g = j14;
        this.f4264h = j15;
    }

    public final long b(long j, long j10) {
        long d10 = d(j);
        if (d10 != -1) {
            return d10;
        }
        return (int) (f((j10 - this.f4264h) + this.f4265i, j) - c(j, j10));
    }

    public final long c(long j, long j10) {
        long d10 = d(j);
        long j11 = this.f4260d;
        if (d10 == -1) {
            long j12 = this.f4263g;
            if (j12 != -9223372036854775807L) {
                return Math.max(j11, f((j10 - this.f4264h) - j12, j));
            }
        }
        return j11;
    }

    public abstract long d(long j);

    public final long e(long j, long j10) {
        long j11 = this.f4273b;
        long j12 = this.f4260d;
        List list = this.f4262f;
        if (list != null) {
            return (((q) list.get((int) (j - j12))).f4269b * 1000000) / j11;
        }
        long d10 = d(j10);
        if (d10 != -1 && j == (j12 + d10) - 1) {
            return j10 - g(j);
        }
        return (this.f4261e * 1000000) / j11;
    }

    public final long f(long j, long j10) {
        long d10 = d(j10);
        long j11 = this.f4260d;
        if (d10 != 0) {
            if (this.f4262f == null) {
                long j12 = (j / ((this.f4261e * 1000000) / this.f4273b)) + j11;
                if (j12 >= j11) {
                    if (d10 == -1) {
                        return j12;
                    }
                    return Math.min(j12, (j11 + d10) - 1);
                }
            } else {
                long j13 = (d10 + j11) - 1;
                long j14 = j11;
                while (j14 <= j13) {
                    long j15 = ((j13 - j14) / 2) + j14;
                    long g10 = g(j15);
                    if (g10 < j) {
                        j14 = j15 + 1;
                    } else if (g10 > j) {
                        j13 = j15 - 1;
                    } else {
                        return j15;
                    }
                }
                if (j14 == j11) {
                    return j14;
                }
                return j13;
            }
        }
        return j11;
    }

    public final long g(long j) {
        long j10;
        long j11 = this.f4260d;
        List list = this.f4262f;
        if (list != null) {
            j10 = ((q) list.get((int) (j - j11))).f4268a - this.f4274c;
        } else {
            j10 = (j - j11) * this.f4261e;
        }
        long j12 = j10;
        String str = a0.f12750a;
        return a0.Y(j12, 1000000L, this.f4273b, RoundingMode.DOWN);
    }

    public abstract j h(k kVar, long j);

    public boolean i() {
        if (this.f4262f != null) {
            return true;
        }
        return false;
    }
}
