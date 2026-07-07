package d2;

import java.util.List;
import r1.a1;
import r1.c1;
import r1.d1;
import r1.e0;
import r1.z;
import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends d1 {

    /* renamed from: e, reason: collision with root package name */
    public final long f3708e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3709f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3710g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3711h;

    /* renamed from: i, reason: collision with root package name */
    public final long f3712i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final long f3713k;

    /* renamed from: l, reason: collision with root package name */
    public final e2.c f3714l;

    /* renamed from: m, reason: collision with root package name */
    public final e0 f3715m;

    /* renamed from: n, reason: collision with root package name */
    public final z f3716n;

    public e(long j, long j10, long j11, int i6, long j12, long j13, long j14, e2.c cVar, e0 e0Var, z zVar) {
        boolean z10;
        boolean z11 = cVar.f4217d;
        if (zVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z11 == z10);
        this.f3708e = j;
        this.f3709f = j10;
        this.f3710g = j11;
        this.f3711h = i6;
        this.f3712i = j12;
        this.j = j13;
        this.f3713k = j14;
        this.f3714l = cVar;
        this.f3715m = e0Var;
        this.f3716n = zVar;
    }

    @Override // r1.d1
    public final int b(Object obj) {
        int intValue;
        if (!(obj instanceof Integer) || (intValue = ((Integer) obj).intValue() - this.f3711h) < 0 || intValue >= h()) {
            return -1;
        }
        return intValue;
    }

    @Override // r1.d1
    public final a1 f(int i6, a1 a1Var, boolean z10) {
        String str;
        u1.c.c(i6, h());
        Integer num = null;
        e2.c cVar = this.f3714l;
        if (z10) {
            str = cVar.b(i6).f4244a;
        } else {
            str = null;
        }
        if (z10) {
            num = Integer.valueOf(this.f3711h + i6);
        }
        long d10 = cVar.d(i6);
        long Q = a0.Q(cVar.b(i6).f4245b - cVar.b(0).f4245b) - this.f3712i;
        a1Var.getClass();
        a1Var.h(str, num, 0, d10, Q, r1.b.f11302c, false);
        return a1Var;
    }

    @Override // r1.d1
    public final int h() {
        return this.f3714l.f4225m.size();
    }

    @Override // r1.d1
    public final Object l(int i6) {
        u1.c.c(i6, h());
        return Integer.valueOf(this.f3711h + i6);
    }

    @Override // r1.d1
    public final c1 m(int i6, c1 c1Var, long j) {
        long j10;
        boolean z10;
        long j11;
        h d10;
        u1.c.c(i6, 1);
        e2.c cVar = this.f3714l;
        boolean z11 = cVar.f4217d;
        long j12 = this.f3713k;
        if (z11 && cVar.f4218e != -9223372036854775807L && cVar.f4215b == -9223372036854775807L) {
            long j13 = 0;
            if (j > 0) {
                j12 += j;
                if (j12 > this.j) {
                    j12 = -9223372036854775807L;
                    j10 = -9223372036854775807L;
                    Object obj = c1.f11318q;
                    if (!cVar.f4217d && cVar.f4218e != j10 && cVar.f4215b == j10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c1Var.b(obj, this.f3715m, cVar, this.f3708e, this.f3709f, this.f3710g, true, z10, this.f3716n, j12, this.j, 0, h() - 1, this.f3712i);
                    return c1Var;
                }
            }
            long j14 = this.f3712i + j12;
            long d11 = cVar.d(0);
            int i10 = 0;
            while (i10 < cVar.f4225m.size() - 1 && j14 >= d11) {
                j14 -= d11;
                i10++;
                d11 = cVar.d(i10);
            }
            e2.h b10 = cVar.b(i10);
            List list = b10.f4246c;
            int size = list.size();
            j10 = -9223372036854775807L;
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    j11 = j13;
                    if (((e2.a) list.get(i11)).f4205b == 2) {
                        break;
                    }
                    i11++;
                    j13 = j11;
                } else {
                    j11 = j13;
                    i11 = -1;
                    break;
                }
            }
            if (i11 != -1 && (d10 = ((e2.m) ((e2.a) b10.f4246c.get(i11)).f4206c.get(0)).d()) != null && d10.E(d11) != j11) {
                j12 = (d10.b(d10.s(j14, d11)) + j12) - j14;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        Object obj2 = c1.f11318q;
        if (!cVar.f4217d) {
        }
        z10 = false;
        c1Var.b(obj2, this.f3715m, cVar, this.f3708e, this.f3709f, this.f3710g, true, z10, this.f3716n, j12, this.j, 0, h() - 1, this.f3712i);
        return c1Var;
    }

    @Override // r1.d1
    public final int o() {
        return 1;
    }
}
