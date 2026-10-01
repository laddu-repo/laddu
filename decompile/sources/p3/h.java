package p3;

import w1.b0;
import w2.z;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10264e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long[] f10265g;

    public h(long j8, int i, long j9, int i10, long j10, long[] jArr) {
        this.f10260a = j8;
        this.f10261b = i;
        this.f10262c = j9;
        this.f10263d = i10;
        this.f10264e = j10;
        this.f10265g = jArr;
        this.f = j10 != -1 ? j8 + j10 : -1L;
    }

    @Override // p3.f
    public final long b(long j8) {
        long j9 = j8 - this.f10260a;
        if (!i() || j9 <= this.f10261b) {
            return 0L;
        }
        long[] jArr = this.f10265g;
        w1.a.k(jArr);
        double d10 = (j9 * 256.0d) / this.f10264e;
        int iE = b0.e(jArr, (long) d10, true);
        long j10 = this.f10262c;
        long j11 = (((long) iE) * j10) / 100;
        long j12 = jArr[iE];
        int i = iE + 1;
        long j13 = (j10 * ((long) i)) / 100;
        return Math.round((j12 == (iE == 99 ? 256L : jArr[i]) ? 0.0d : (d10 - j12) / (r0 - j12)) * (j13 - j11)) + j11;
    }

    @Override // p3.f
    public final long d() {
        return this.f;
    }

    @Override // w2.a0
    public final boolean i() {
        return this.f10265g != null;
    }

    @Override // w2.a0
    public final z j(long j8) {
        double d10;
        double d11;
        boolean zI = i();
        int i = this.f10261b;
        long j9 = this.f10260a;
        if (!zI) {
            w2.b0 b0Var = new w2.b0(0L, j9 + ((long) i));
            return new z(b0Var, b0Var);
        }
        long jI = b0.i(j8, 0L, this.f10262c);
        double d12 = (jI * 100.0d) / this.f10262c;
        double d13 = 0.0d;
        if (d12 <= 0.0d) {
            d10 = 256.0d;
        } else if (d12 >= 100.0d) {
            d10 = 256.0d;
            d13 = 256.0d;
        } else {
            int i10 = (int) d12;
            long[] jArr = this.f10265g;
            w1.a.k(jArr);
            double d14 = jArr[i10];
            if (i10 == 99) {
                d10 = 256.0d;
                d11 = 256.0d;
            } else {
                d10 = 256.0d;
                d11 = jArr[i10 + 1];
            }
            d13 = ((d11 - d14) * (d12 - ((double) i10))) + d14;
        }
        long j10 = this.f10264e;
        w2.b0 b0Var2 = new w2.b0(jI, j9 + b0.i(Math.round((d13 / d10) * j10), i, j10 - 1));
        return new z(b0Var2, b0Var2);
    }

    @Override // p3.f
    public final int k() {
        return this.f10263d;
    }

    @Override // w2.a0
    public final long l() {
        return this.f10262c;
    }
}
