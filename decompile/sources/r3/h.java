package r3;

import u1.a0;
import y2.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long f11832a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11833b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11834c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11835d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11836e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11837f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f11838g;

    public h(long j, int i6, long j10, int i10, long j11, long[] jArr) {
        this.f11832a = j;
        this.f11833b = i6;
        this.f11834c = j10;
        this.f11835d = i10;
        this.f11836e = j11;
        this.f11838g = jArr;
        this.f11837f = j11 != -1 ? j + j11 : -1L;
    }

    @Override // r3.f
    public final long b(long j) {
        long j10;
        double d10;
        long j11 = j - this.f11832a;
        if (g() && j11 > this.f11833b) {
            long[] jArr = this.f11838g;
            u1.c.h(jArr);
            double d11 = (j11 * 256.0d) / this.f11836e;
            int e10 = a0.e(jArr, (long) d11, true);
            long j12 = this.f11834c;
            long j13 = (e10 * j12) / 100;
            long j14 = jArr[e10];
            int i6 = e10 + 1;
            long j15 = (j12 * i6) / 100;
            if (e10 == 99) {
                j10 = 256;
            } else {
                j10 = jArr[i6];
            }
            if (j14 == j10) {
                d10 = 0.0d;
            } else {
                d10 = (d11 - j14) / (j10 - j14);
            }
            return Math.round(d10 * (j15 - j13)) + j13;
        }
        return 0L;
    }

    @Override // r3.f
    public final long e() {
        return this.f11837f;
    }

    @Override // y2.z
    public final boolean g() {
        if (this.f11838g != null) {
            return true;
        }
        return false;
    }

    @Override // y2.z
    public final y j(long j) {
        double d10;
        double d11;
        boolean g10 = g();
        int i6 = this.f11833b;
        long j10 = this.f11832a;
        if (!g10) {
            y2.a0 a0Var = new y2.a0(0L, j10 + i6);
            return new y(a0Var, a0Var);
        }
        long j11 = a0.j(j, 0L, this.f11834c);
        double d12 = (j11 * 100.0d) / this.f11834c;
        double d13 = 0.0d;
        if (d12 <= 0.0d) {
            d10 = 256.0d;
        } else if (d12 >= 100.0d) {
            d10 = 256.0d;
            d13 = 256.0d;
        } else {
            int i10 = (int) d12;
            long[] jArr = this.f11838g;
            u1.c.h(jArr);
            double d14 = jArr[i10];
            if (i10 == 99) {
                d10 = 256.0d;
                d11 = 256.0d;
            } else {
                d10 = 256.0d;
                d11 = jArr[i10 + 1];
            }
            d13 = ((d11 - d14) * (d12 - i10)) + d14;
        }
        long j12 = this.f11836e;
        y2.a0 a0Var2 = new y2.a0(j11, j10 + a0.j(Math.round((d13 / d10) * j12), i6, j12 - 1));
        return new y(a0Var2, a0Var2);
    }

    @Override // r3.f
    public final int k() {
        return this.f11835d;
    }

    @Override // y2.z
    public final long m() {
        return this.f11834c;
    }
}
