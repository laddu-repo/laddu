package c2;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2.d0 f2007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f2011e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f2013h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f2014j;

    public y0(o2.d0 d0Var, long j8, long j9, long j10, long j11, boolean z2, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        w1.a.d(!z13 || z11);
        w1.a.d(!z12 || z11);
        if (z10 && (z11 || z12 || z13)) {
            z14 = false;
        }
        w1.a.d(z14);
        this.f2007a = d0Var;
        this.f2008b = j8;
        this.f2009c = j9;
        this.f2010d = j10;
        this.f2011e = j11;
        this.f = z2;
        this.f2012g = z10;
        this.f2013h = z11;
        this.i = z12;
        this.f2014j = z13;
    }

    public final y0 a(long j8) {
        if (j8 == this.f2009c) {
            return this;
        }
        return new y0(this.f2007a, this.f2008b, j8, this.f2010d, this.f2011e, this.f, this.f2012g, this.f2013h, this.i, this.f2014j);
    }

    public final y0 b(long j8) {
        if (j8 == this.f2008b) {
            return this;
        }
        return new y0(this.f2007a, j8, this.f2009c, this.f2010d, this.f2011e, this.f, this.f2012g, this.f2013h, this.i, this.f2014j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y0.class == obj.getClass()) {
            y0 y0Var = (y0) obj;
            if (this.f2008b == y0Var.f2008b && this.f2009c == y0Var.f2009c && this.f2010d == y0Var.f2010d && this.f2011e == y0Var.f2011e && this.f == y0Var.f && this.f2012g == y0Var.f2012g && this.f2013h == y0Var.f2013h && this.i == y0Var.i && this.f2014j == y0Var.f2014j && Objects.equals(this.f2007a, y0Var.f2007a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f2007a.hashCode() + 527) * 31) + ((int) this.f2008b)) * 31) + ((int) this.f2009c)) * 31) + ((int) this.f2010d)) * 31) + ((int) this.f2011e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.f2012g ? 1 : 0)) * 31) + (this.f2013h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.f2014j ? 1 : 0);
    }
}
