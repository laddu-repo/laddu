package a2;

import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final q2.c0 f197a;

    /* renamed from: b, reason: collision with root package name */
    public final long f198b;

    /* renamed from: c, reason: collision with root package name */
    public final long f199c;

    /* renamed from: d, reason: collision with root package name */
    public final long f200d;

    /* renamed from: e, reason: collision with root package name */
    public final long f201e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f202f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f203g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f204h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f205i;
    public final boolean j;

    public d1(q2.c0 c0Var, long j, long j10, long j11, long j12, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        boolean z16;
        boolean z17 = true;
        if (z14 && !z12) {
            z15 = false;
        } else {
            z15 = true;
        }
        u1.c.b(z15);
        if (z13 && !z12) {
            z16 = false;
        } else {
            z16 = true;
        }
        u1.c.b(z16);
        if (z11 && (z12 || z13 || z14)) {
            z17 = false;
        }
        u1.c.b(z17);
        this.f197a = c0Var;
        this.f198b = j;
        this.f199c = j10;
        this.f200d = j11;
        this.f201e = j12;
        this.f202f = z10;
        this.f203g = z11;
        this.f204h = z12;
        this.f205i = z13;
        this.j = z14;
    }

    public final d1 a(long j) {
        if (j == this.f199c) {
            return this;
        }
        return new d1(this.f197a, this.f198b, j, this.f200d, this.f201e, this.f202f, this.f203g, this.f204h, this.f205i, this.j);
    }

    public final d1 b(long j) {
        if (j == this.f198b) {
            return this;
        }
        return new d1(this.f197a, j, this.f199c, this.f200d, this.f201e, this.f202f, this.f203g, this.f204h, this.f205i, this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d1.class == obj.getClass()) {
            d1 d1Var = (d1) obj;
            if (this.f198b == d1Var.f198b && this.f199c == d1Var.f199c && this.f200d == d1Var.f200d && this.f201e == d1Var.f201e && this.f202f == d1Var.f202f && this.f203g == d1Var.f203g && this.f204h == d1Var.f204h && this.f205i == d1Var.f205i && this.j == d1Var.j && Objects.equals(this.f197a, d1Var.f197a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f197a.hashCode() + 527) * 31) + ((int) this.f198b)) * 31) + ((int) this.f199c)) * 31) + ((int) this.f200d)) * 31) + ((int) this.f201e)) * 31) + (this.f202f ? 1 : 0)) * 31) + (this.f203g ? 1 : 0)) * 31) + (this.f204h ? 1 : 0)) * 31) + (this.f205i ? 1 : 0)) * 31) + (this.j ? 1 : 0);
    }
}
