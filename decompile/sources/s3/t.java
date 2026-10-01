package s3;

import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final q f12177a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12178b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f12179c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f12180d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12181e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f12182f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f12183g;

    /* renamed from: h, reason: collision with root package name */
    public final long f12184h;

    public t(q qVar, long[] jArr, int[] iArr, int i6, long[] jArr2, int[] iArr2, long j) {
        boolean z10;
        boolean z11;
        if (iArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        if (jArr.length == jArr2.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        u1.c.b(z11);
        u1.c.b(iArr2.length == jArr2.length);
        this.f12177a = qVar;
        this.f12179c = jArr;
        this.f12180d = iArr;
        this.f12181e = i6;
        this.f12182f = jArr2;
        this.f12183g = iArr2;
        this.f12184h = j;
        this.f12178b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f12182f;
        for (int a10 = a0.a(jArr, j, true); a10 < jArr.length; a10++) {
            if ((this.f12183g[a10] & 1) != 0) {
                return a10;
            }
        }
        return -1;
    }
}
