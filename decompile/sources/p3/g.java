package p3;

import w1.b0;
import w2.z;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f10255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f10256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10259e;

    public g(long[] jArr, long[] jArr2, long j8, long j9, long j10, int i) {
        this.f10255a = jArr;
        this.f10256b = jArr2;
        this.f10257c = j8;
        this.f10258d = j10;
        this.f10259e = i;
    }

    @Override // p3.f
    public final long b(long j8) {
        return this.f10255a[b0.e(this.f10256b, j8, true)];
    }

    @Override // p3.f
    public final long d() {
        return this.f10258d;
    }

    @Override // w2.a0
    public final boolean i() {
        return true;
    }

    @Override // w2.a0
    public final z j(long j8) {
        long[] jArr = this.f10255a;
        int iE = b0.e(jArr, j8, true);
        long j9 = jArr[iE];
        long[] jArr2 = this.f10256b;
        w2.b0 b0Var = new w2.b0(j9, jArr2[iE]);
        if (j9 >= j8 || iE == jArr.length - 1) {
            return new z(b0Var, b0Var);
        }
        int i = iE + 1;
        return new z(b0Var, new w2.b0(jArr[i], jArr2[i]));
    }

    @Override // p3.f
    public final int k() {
        return this.f10259e;
    }

    @Override // w2.a0
    public final long l() {
        return this.f10257c;
    }
}
