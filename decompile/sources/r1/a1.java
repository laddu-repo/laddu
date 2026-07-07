package r1;

import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: h, reason: collision with root package name */
    public static final String f11291h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f11292i;
    public static final String j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f11293k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f11294l;

    /* renamed from: a, reason: collision with root package name */
    public Object f11295a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11296b;

    /* renamed from: c, reason: collision with root package name */
    public int f11297c;

    /* renamed from: d, reason: collision with root package name */
    public long f11298d;

    /* renamed from: e, reason: collision with root package name */
    public long f11299e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11300f;

    /* renamed from: g, reason: collision with root package name */
    public b f11301g = b.f11302c;

    static {
        String str = u1.a0.f12750a;
        f11291h = Integer.toString(0, 36);
        f11292i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        f11293k = Integer.toString(3, 36);
        f11294l = Integer.toString(4, 36);
    }

    public final long a(int i6, int i10) {
        a a10 = this.f11301g.a(i6);
        if (a10.f11269a != -1) {
            return a10.f11274f[i10];
        }
        return -9223372036854775807L;
    }

    public final int b(long j10) {
        a a10;
        int i6;
        b bVar = this.f11301g;
        long j11 = this.f11298d;
        int i10 = bVar.f11305a;
        if (j10 != Long.MIN_VALUE && (j11 == -9223372036854775807L || j10 < j11)) {
            int i11 = 0;
            while (i11 < i10) {
                bVar.a(i11).getClass();
                bVar.a(i11).getClass();
                if (0 > j10 && ((i6 = (a10 = bVar.a(i11)).f11269a) == -1 || a10.a(-1) < i6)) {
                    break;
                }
                i11++;
            }
            if (i11 < i10) {
                if (j11 != -9223372036854775807L) {
                    bVar.a(i11).getClass();
                    if (0 <= j11) {
                    }
                }
                return i11;
            }
        }
        return -1;
    }

    public final int c(long j10) {
        b bVar = this.f11301g;
        int i6 = bVar.f11305a;
        int i10 = i6 - 1;
        if (i10 == i6 - 1) {
            bVar.a(i10).getClass();
        }
        while (i10 >= 0 && j10 != Long.MIN_VALUE) {
            bVar.a(i10).getClass();
            if (j10 >= 0) {
                break;
            }
            i10--;
        }
        if (i10 >= 0) {
            a a10 = bVar.a(i10);
            int i11 = a10.f11269a;
            if (i11 != -1) {
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = a10.f11273e[i12];
                    if (i13 != 0 && i13 != 1) {
                    }
                }
            }
            return i10;
        }
        return -1;
    }

    public final long d(int i6) {
        this.f11301g.a(i6).getClass();
        return 0L;
    }

    public final int e(int i6) {
        return this.f11301g.a(i6).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class.equals(obj.getClass())) {
            a1 a1Var = (a1) obj;
            if (Objects.equals(this.f11295a, a1Var.f11295a) && Objects.equals(this.f11296b, a1Var.f11296b) && this.f11297c == a1Var.f11297c && this.f11298d == a1Var.f11298d && this.f11299e == a1Var.f11299e && this.f11300f == a1Var.f11300f && Objects.equals(this.f11301g, a1Var.f11301g)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(int i6) {
        b bVar = this.f11301g;
        int i10 = bVar.f11305a;
        if (i6 == i10 - 1 && i6 == i10 - 1) {
            bVar.a(i6).getClass();
            return false;
        }
        return false;
    }

    public final boolean g(int i6) {
        this.f11301g.a(i6).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i6, long j10, long j11, b bVar, boolean z10) {
        this.f11295a = obj;
        this.f11296b = obj2;
        this.f11297c = i6;
        this.f11298d = j10;
        this.f11299e = j11;
        this.f11301g = bVar;
        this.f11300f = z10;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f11295a;
        int i6 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = (217 + hashCode) * 31;
        Object obj2 = this.f11296b;
        if (obj2 != null) {
            i6 = obj2.hashCode();
        }
        int i11 = (((i10 + i6) * 31) + this.f11297c) * 31;
        long j10 = this.f11298d;
        int i12 = (i11 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f11299e;
        return this.f11301g.hashCode() + ((((i12 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f11300f ? 1 : 0)) * 31);
    }
}
