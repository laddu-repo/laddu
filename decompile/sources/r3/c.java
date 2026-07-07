package r3;

import android.util.Pair;
import u1.a0;
import y2.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f11806a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f11807b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11808c;

    public c(long j, long[] jArr, long[] jArr2) {
        this.f11806a = jArr;
        this.f11807b = jArr2;
        this.f11808c = j == -9223372036854775807L ? a0.Q(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair a(long j, long[] jArr, long[] jArr2) {
        double d10;
        int e10 = a0.e(jArr, j, true);
        long j10 = jArr[e10];
        long j11 = jArr2[e10];
        int i6 = e10 + 1;
        if (i6 == jArr.length) {
            return Pair.create(Long.valueOf(j10), Long.valueOf(j11));
        }
        long j12 = jArr[i6];
        long j13 = jArr2[i6];
        if (j12 == j10) {
            d10 = 0.0d;
        } else {
            d10 = (j - j10) / (j12 - j10);
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) (d10 * (j13 - j11))) + j11));
    }

    @Override // r3.f
    public final long b(long j) {
        return a0.Q(((Long) a(j, this.f11806a, this.f11807b).second).longValue());
    }

    @Override // r3.f
    public final long e() {
        return -1L;
    }

    @Override // y2.z
    public final boolean g() {
        return true;
    }

    @Override // y2.z
    public final y j(long j) {
        Pair a10 = a(a0.e0(a0.j(j, 0L, this.f11808c)), this.f11807b, this.f11806a);
        y2.a0 a0Var = new y2.a0(a0.Q(((Long) a10.first).longValue()), ((Long) a10.second).longValue());
        return new y(a0Var, a0Var);
    }

    @Override // r3.f
    public final int k() {
        return -2147483647;
    }

    @Override // y2.z
    public final long m() {
        return this.f11808c;
    }
}
