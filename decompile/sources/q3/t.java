package q3;

import w1.b0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f10796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f10798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f10799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10800e;
    public final long[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f10801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f10802h;

    public t(q qVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j8) {
        w1.a.d(iArr.length == jArr2.length);
        w1.a.d(jArr.length == jArr2.length);
        w1.a.d(iArr2.length == jArr2.length);
        this.f10796a = qVar;
        this.f10798c = jArr;
        this.f10799d = iArr;
        this.f10800e = i;
        this.f = jArr2;
        this.f10801g = iArr2;
        this.f10802h = j8;
        this.f10797b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j8) {
        long[] jArr = this.f;
        for (int iA = b0.a(jArr, j8, true); iA < jArr.length; iA++) {
            if ((this.f10801g[iA] & 1) != 0) {
                return iA;
            }
        }
        return -1;
    }
}
