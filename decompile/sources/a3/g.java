package a3;

import java.math.RoundingMode;
import u1.a0;
import y2.f0;
import y2.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final f f548a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f549b;

    /* renamed from: c, reason: collision with root package name */
    public final int f550c;

    /* renamed from: d, reason: collision with root package name */
    public final int f551d;

    /* renamed from: e, reason: collision with root package name */
    public final long f552e;

    /* renamed from: f, reason: collision with root package name */
    public int f553f;

    /* renamed from: g, reason: collision with root package name */
    public int f554g;

    /* renamed from: h, reason: collision with root package name */
    public int f555h;

    /* renamed from: i, reason: collision with root package name */
    public int f556i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f557k;

    /* renamed from: l, reason: collision with root package name */
    public long f558l;

    /* renamed from: m, reason: collision with root package name */
    public long[] f559m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f560n;

    public g(int i6, f fVar, f0 f0Var) {
        int i10;
        int i11;
        int i12 = fVar.f545d;
        this.f548a = fVar;
        int a10 = fVar.a();
        boolean z10 = true;
        if (a10 != 1 && a10 != 2) {
            z10 = false;
        }
        u1.c.b(z10);
        if (a10 == 2) {
            i10 = 1667497984;
        } else {
            i10 = 1651965952;
        }
        int i13 = (((i6 % 10) + 48) << 8) | ((i6 / 10) + 48);
        this.f550c = i10 | i13;
        long j = fVar.f543b * 1000000;
        long j10 = fVar.f544c;
        String str = a0.f12750a;
        this.f552e = a0.Y(i12, j, j10, RoundingMode.DOWN);
        this.f549b = f0Var;
        if (a10 == 2) {
            i11 = i13 | 1650720768;
        } else {
            i11 = -1;
        }
        this.f551d = i11;
        this.f558l = -1L;
        this.f559m = new long[512];
        this.f560n = new int[512];
        this.f553f = i12;
    }

    public final y2.a0 a(int i6) {
        return new y2.a0(((this.f552e * 1) / this.f553f) * this.f560n[i6], this.f559m[i6]);
    }

    public final y b(long j) {
        if (this.f557k == 0) {
            y2.a0 a0Var = new y2.a0(0L, this.f558l);
            return new y(a0Var, a0Var);
        }
        int i6 = (int) (j / ((this.f552e * 1) / this.f553f));
        int d10 = a0.d(this.f560n, i6, true, true);
        if (this.f560n[d10] == i6) {
            y2.a0 a10 = a(d10);
            return new y(a10, a10);
        }
        y2.a0 a11 = a(d10);
        int i10 = d10 + 1;
        if (i10 < this.f559m.length) {
            return new y(a11, a(i10));
        }
        return new y(a11, a11);
    }
}
