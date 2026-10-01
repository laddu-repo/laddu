package h;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static l0 f5944e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5945a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f5948d;

    public /* synthetic */ l0() {
    }

    public static void c(l0 l0Var, long j8, long j9, int i) {
        if ((i & 1) != 0) {
            j8 = 0;
        }
        if ((i & 2) != 0) {
            j9 = 0;
        }
        synchronized (l0Var) {
            try {
                if (j8 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j9 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j10 = l0Var.f5947c + j8;
                l0Var.f5947c = j10;
                long j11 = l0Var.f5948d + j9;
                l0Var.f5948d = j11;
                if (j11 > j10) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(double d10, double d11, long j8) {
        double d12 = (0.01720197f * ((j8 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d12) * 0.03341960161924362d) + d12 + 1.796593063d + 3.141592653589793d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d12) * 0.0053d) + ((double) (Math.round(((double) (r2 - 9.0E-4f)) - r6) + 9.0E-4f)) + ((-d11) / 360.0d);
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d13 = 0.01745329238474369d * d10;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d13))) / (Math.cos(dAsin) * Math.cos(d13));
        if (dSin3 >= 1.0d) {
            this.f5946b = 1;
            this.f5947c = -1L;
            this.f5948d = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f5946b = 0;
                this.f5947c = -1L;
                this.f5948d = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f5947c = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f5948d = jRound;
            if (jRound >= j8 || this.f5947c <= j8) {
                this.f5946b = 1;
            } else {
                this.f5946b = 0;
            }
        }
    }

    public synchronized long b() {
        return this.f5947c - this.f5948d;
    }

    public String toString() {
        switch (this.f5945a) {
            case 1:
                return "WindowCounter(streamId=" + this.f5946b + ", total=" + this.f5947c + ", acknowledged=" + this.f5948d + ", unacknowledged=" + b() + ')';
            default:
                return super.toString();
        }
    }

    public l0(int i) {
        this.f5946b = i;
    }
}
