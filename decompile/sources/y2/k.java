package y2;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k implements z {

    /* renamed from: a, reason: collision with root package name */
    public final int f14917a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f14918b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f14919c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f14920d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f14921e;

    /* renamed from: f, reason: collision with root package name */
    public final long f14922f;

    public k(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f14918b = iArr;
        this.f14919c = jArr;
        this.f14920d = jArr2;
        this.f14921e = jArr3;
        int length = iArr.length;
        this.f14917a = length;
        if (length > 0) {
            this.f14922f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f14922f = 0L;
        }
    }

    @Override // y2.z
    public final boolean g() {
        return true;
    }

    @Override // y2.z
    public final y j(long j) {
        long[] jArr = this.f14921e;
        int e10 = u1.a0.e(jArr, j, true);
        long j10 = jArr[e10];
        long[] jArr2 = this.f14919c;
        a0 a0Var = new a0(j10, jArr2[e10]);
        if (j10 < j && e10 != this.f14917a - 1) {
            int i6 = e10 + 1;
            return new y(a0Var, new a0(jArr[i6], jArr2[i6]));
        }
        return new y(a0Var, a0Var);
    }

    @Override // y2.z
    public final long m() {
        return this.f14922f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f14917a + ", sizes=" + Arrays.toString(this.f14918b) + ", offsets=" + Arrays.toString(this.f14919c) + ", timeUs=" + Arrays.toString(this.f14921e) + ", durationsUs=" + Arrays.toString(this.f14920d) + ")";
    }
}
