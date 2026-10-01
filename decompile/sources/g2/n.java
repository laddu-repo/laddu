package g2;

import java.math.RoundingMode;
import java.util.List;
import w1.b0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5462e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f5463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f5464h;
    public final long i;

    public n(j jVar, long j8, long j9, long j10, long j11, List list, long j12, long j13, long j14) {
        super(jVar, j8, j9);
        this.f5461d = j10;
        this.f5462e = j11;
        this.f = list;
        this.i = j12;
        this.f5463g = j13;
        this.f5464h = j14;
    }

    public final long b(long j8, long j9) {
        long jD = d(j8);
        return jD != -1 ? jD : (int) (f((j9 - this.f5464h) + this.i, j8) - c(j8, j9));
    }

    public final long c(long j8, long j9) {
        long jD = d(j8);
        long j10 = this.f5461d;
        if (jD == -1) {
            long j11 = this.f5463g;
            if (j11 != -9223372036854775807L) {
                return Math.max(j10, f((j9 - this.f5464h) - j11, j8));
            }
        }
        return j10;
    }

    public abstract long d(long j8);

    public final long e(long j8, long j9) {
        long j10 = this.f5474b;
        long j11 = this.f5461d;
        List list = this.f;
        if (list != null) {
            return (((q) list.get((int) (j8 - j11))).f5470b * 1000000) / j10;
        }
        long jD = d(j9);
        return (jD == -1 || j8 != (j11 + jD) - 1) ? (this.f5462e * 1000000) / j10 : j9 - g(j8);
    }

    public final long f(long j8, long j9) {
        long jD = d(j9);
        long j10 = this.f5461d;
        if (jD != 0) {
            if (this.f != null) {
                long j11 = (jD + j10) - 1;
                long j12 = j10;
                while (j12 <= j11) {
                    long j13 = ((j11 - j12) / 2) + j12;
                    long jG = g(j13);
                    if (jG < j8) {
                        j12 = j13 + 1;
                    } else {
                        if (jG <= j8) {
                            return j13;
                        }
                        j11 = j13 - 1;
                    }
                }
                return j12 == j10 ? j12 : j11;
            }
            long j14 = (j8 / ((this.f5462e * 1000000) / this.f5474b)) + j10;
            if (j14 >= j10) {
                return jD == -1 ? j14 : Math.min(j14, (j10 + jD) - 1);
            }
        }
        return j10;
    }

    public final long g(long j8) {
        long j9 = this.f5461d;
        List list = this.f;
        long j10 = list != null ? ((q) list.get((int) (j8 - j9))).f5469a - this.f5475c : (j8 - j9) * this.f5462e;
        int i = b0.f13686a;
        return b0.U(j10, 1000000L, this.f5474b, RoundingMode.DOWN);
    }

    public abstract j h(k kVar, long j8);

    public boolean i() {
        return this.f != null;
    }
}
