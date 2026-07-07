package r3;

import u1.a0;
import y2.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f11827a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f11828b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11829c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11830d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11831e;

    public g(long[] jArr, long[] jArr2, long j, long j10, long j11, int i6) {
        this.f11827a = jArr;
        this.f11828b = jArr2;
        this.f11829c = j;
        this.f11830d = j11;
        this.f11831e = i6;
    }

    @Override // r3.f
    public final long b(long j) {
        return this.f11827a[a0.e(this.f11828b, j, true)];
    }

    @Override // r3.f
    public final long e() {
        return this.f11830d;
    }

    @Override // y2.z
    public final boolean g() {
        return true;
    }

    @Override // y2.z
    public final y j(long j) {
        long[] jArr = this.f11827a;
        int e10 = a0.e(jArr, j, true);
        long j10 = jArr[e10];
        long[] jArr2 = this.f11828b;
        y2.a0 a0Var = new y2.a0(j10, jArr2[e10]);
        if (j10 < j && e10 != jArr.length - 1) {
            int i6 = e10 + 1;
            return new y(a0Var, new y2.a0(jArr[i6], jArr2[i6]));
        }
        return new y(a0Var, a0Var);
    }

    @Override // r3.f
    public final int k() {
        return this.f11831e;
    }

    @Override // y2.z
    public final long m() {
        return this.f11829c;
    }
}
