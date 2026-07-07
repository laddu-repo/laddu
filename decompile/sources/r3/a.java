package r3;

import y2.a0;
import y2.y;
import y2.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements f, z {

    /* renamed from: a, reason: collision with root package name */
    public final long f11795a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11796b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11797c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11798d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11799e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11800f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11801g;

    /* renamed from: h, reason: collision with root package name */
    public final long f11802h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11803i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f11804k;

    /* renamed from: l, reason: collision with root package name */
    public final long f11805l;

    public a(long j, long j10, int i6, int i10, boolean z10) {
        int i11;
        this.f11795a = j;
        this.f11796b = j10;
        if (i10 == -1) {
            i11 = 1;
        } else {
            i11 = i10;
        }
        this.f11797c = i11;
        this.f11799e = i6;
        this.f11801g = z10;
        if (j == -1) {
            this.f11798d = -1L;
            this.f11800f = -9223372036854775807L;
        } else {
            long j11 = j - j10;
            this.f11798d = j11;
            this.f11800f = (Math.max(0L, j11) * 8000000) / i6;
        }
        this.f11802h = j10;
        this.f11803i = i6;
        this.j = i10;
        this.f11804k = z10;
        this.f11805l = j == -1 ? -1L : j;
    }

    @Override // r3.f
    public final long b(long j) {
        return (Math.max(0L, j - this.f11796b) * 8000000) / this.f11799e;
    }

    @Override // r3.f
    public final long e() {
        return this.f11805l;
    }

    @Override // y2.z
    public final boolean g() {
        if (this.f11798d == -1 && !this.f11801g) {
            return false;
        }
        return true;
    }

    @Override // y2.z
    public final y j(long j) {
        long j10 = this.f11796b;
        long j11 = this.f11798d;
        if (j11 == -1 && !this.f11801g) {
            a0 a0Var = new a0(0L, j10);
            return new y(a0Var, a0Var);
        }
        int i6 = this.f11799e;
        long j12 = this.f11797c;
        long j13 = (((i6 * j) / 8000000) / j12) * j12;
        if (j11 != -1) {
            j13 = Math.min(j13, j11 - j12);
        }
        long max = Math.max(j13, 0L) + j10;
        long max2 = (Math.max(0L, max - j10) * 8000000) / i6;
        a0 a0Var2 = new a0(max2, max);
        if (j11 != -1 && max2 < j) {
            long j14 = max + j12;
            if (j14 < this.f11795a) {
                return new y(a0Var2, new a0((Math.max(0L, j14 - j10) * 8000000) / i6, j14));
            }
        }
        return new y(a0Var2, a0Var2);
    }

    @Override // r3.f
    public final int k() {
        return this.f11803i;
    }

    @Override // y2.z
    public final long m() {
        return this.f11800f;
    }
}
