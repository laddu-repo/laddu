package e6;

import v5.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public String f4371a;

    /* renamed from: b, reason: collision with root package name */
    public int f4372b = 1;

    /* renamed from: c, reason: collision with root package name */
    public String f4373c;

    /* renamed from: d, reason: collision with root package name */
    public String f4374d;

    /* renamed from: e, reason: collision with root package name */
    public v5.f f4375e;

    /* renamed from: f, reason: collision with root package name */
    public v5.f f4376f;

    /* renamed from: g, reason: collision with root package name */
    public long f4377g;

    /* renamed from: h, reason: collision with root package name */
    public long f4378h;

    /* renamed from: i, reason: collision with root package name */
    public long f4379i;
    public v5.c j;

    /* renamed from: k, reason: collision with root package name */
    public int f4380k;

    /* renamed from: l, reason: collision with root package name */
    public int f4381l;

    /* renamed from: m, reason: collision with root package name */
    public long f4382m;

    /* renamed from: n, reason: collision with root package name */
    public long f4383n;

    /* renamed from: o, reason: collision with root package name */
    public long f4384o;

    /* renamed from: p, reason: collision with root package name */
    public long f4385p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4386q;

    /* renamed from: r, reason: collision with root package name */
    public int f4387r;

    static {
        o.h("WorkSpec");
    }

    public i(String str, String str2) {
        v5.f fVar = v5.f.f13318c;
        this.f4375e = fVar;
        this.f4376f = fVar;
        this.j = v5.c.f13305i;
        this.f4381l = 1;
        this.f4382m = 30000L;
        this.f4385p = -1L;
        this.f4387r = 1;
        this.f4371a = str;
        this.f4373c = str2;
    }

    public final long a() {
        int i6;
        long scalb;
        if (this.f4372b == 1 && (i6 = this.f4380k) > 0) {
            if (this.f4381l == 2) {
                scalb = this.f4382m * i6;
            } else {
                scalb = Math.scalb((float) this.f4382m, i6 - 1);
            }
            return Math.min(18000000L, scalb) + this.f4383n;
        }
        long j = 0;
        if (c()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.f4383n;
            if (j10 == 0) {
                j10 = this.f4377g + currentTimeMillis;
            }
            long j11 = this.f4379i;
            long j12 = this.f4378h;
            if (j11 != j12) {
                if (j10 == 0) {
                    j = j11 * (-1);
                }
                return j10 + j12 + j;
            }
            if (j10 != 0) {
                j = j12;
            }
            return j10 + j;
        }
        long j13 = this.f4383n;
        if (j13 == 0) {
            j13 = System.currentTimeMillis();
        }
        return j13 + this.f4377g;
    }

    public final boolean b() {
        return !v5.c.f13305i.equals(this.j);
    }

    public final boolean c() {
        if (this.f4378h != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && i.class == obj.getClass()) {
                i iVar = (i) obj;
                if (this.f4377g == iVar.f4377g && this.f4378h == iVar.f4378h && this.f4379i == iVar.f4379i && this.f4380k == iVar.f4380k && this.f4382m == iVar.f4382m && this.f4383n == iVar.f4383n && this.f4384o == iVar.f4384o && this.f4385p == iVar.f4385p && this.f4386q == iVar.f4386q && this.f4371a.equals(iVar.f4371a) && this.f4372b == iVar.f4372b && this.f4373c.equals(iVar.f4373c)) {
                    String str = this.f4374d;
                    if (str != null) {
                        if (!str.equals(iVar.f4374d)) {
                            return false;
                        }
                    } else if (iVar.f4374d != null) {
                        return false;
                    }
                    if (this.f4375e.equals(iVar.f4375e) && this.f4376f.equals(iVar.f4376f) && this.j.equals(iVar.j) && this.f4381l == iVar.f4381l && this.f4387r == iVar.f4387r) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i6;
        int g10 = h8.c.g(this.f4373c, (y.e.c(this.f4372b) + (this.f4371a.hashCode() * 31)) * 31, 31);
        String str = this.f4374d;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int hashCode = (this.f4376f.hashCode() + ((this.f4375e.hashCode() + ((g10 + i6) * 31)) * 31)) * 31;
        long j = this.f4377g;
        int i10 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j10 = this.f4378h;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f4379i;
        int c10 = (y.e.c(this.f4381l) + ((((this.j.hashCode() + ((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31) + this.f4380k) * 31)) * 31;
        long j12 = this.f4382m;
        int i12 = (c10 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f4383n;
        int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f4384o;
        int i14 = (i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f4385p;
        return y.e.c(this.f4387r) + ((((i14 + ((int) (j15 ^ (j15 >>> 32)))) * 31) + (this.f4386q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return r4.a.o(new StringBuilder("{WorkSpec: "), this.f4371a, "}");
    }
}
