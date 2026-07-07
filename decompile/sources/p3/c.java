package p3;

import android.util.Pair;
import w1.b0;
import w2.z;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f10234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f10235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10236c;

    public c(long j8, long[] jArr, long[] jArr2) {
        this.f10234a = jArr;
        this.f10235b = jArr2;
        this.f10236c = j8 == -9223372036854775807L ? b0.M(jArr2[jArr2.length - 1]) : j8;
    }

    public static Pair a(long j8, long[] jArr, long[] jArr2) {
        int iE = b0.e(jArr, j8, true);
        long j9 = jArr[iE];
        long j10 = jArr2[iE];
        int i = iE + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j9), Long.valueOf(j10));
        }
        return Pair.create(Long.valueOf(j8), Long.valueOf(((long) ((jArr[i] == j9 ? 0.0d : (j8 - j9) / (r6 - j9)) * (jArr2[i] - j10))) + j10));
    }

    @Override // p3.f
    public final long b(long j8) {
        return b0.M(((Long) a(j8, this.f10234a, this.f10235b).second).longValue());
    }

    @Override // p3.f
    public final long d() {
        return -1L;
    }

    @Override // w2.a0
    public final boolean i() {
        return true;
    }

    @Override // w2.a0
    public final z j(long j8) {
        Pair pairA = a(b0.Y(b0.i(j8, 0L, this.f10236c)), this.f10235b, this.f10234a);
        w2.b0 b0Var = new w2.b0(b0.M(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue());
        return new z(b0Var, b0Var);
    }

    @Override // p3.f
    public final int k() {
        return -2147483647;
    }

    @Override // w2.a0
    public final long l() {
        return this.f10236c;
    }
}
