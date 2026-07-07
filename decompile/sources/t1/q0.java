package t1;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f12086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f12089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f12090e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f12091g = b.f11920c;

    static {
        d0.d.p(0, 1, 2, 3, 4);
    }

    public final long a(int i, int i10) {
        a aVarA = this.f12091g.a(i);
        if (aVarA.f11911a != -1) {
            return aVarA.f[i10];
        }
        return -9223372036854775807L;
    }

    public final int b(long j8) {
        a aVarA;
        int i;
        b bVar = this.f12091g;
        long j9 = this.f12089d;
        int i10 = bVar.f11922a;
        if (j8 != Long.MIN_VALUE && (j9 == -9223372036854775807L || j8 < j9)) {
            int i11 = 0;
            while (i11 < i10) {
                bVar.a(i11).getClass();
                bVar.a(i11).getClass();
                if (0 > j8 && ((i = (aVarA = bVar.a(i11)).f11911a) == -1 || aVarA.a(-1) < i)) {
                    break;
                }
                i11++;
            }
            if (i11 < i10) {
                if (j9 != -9223372036854775807L) {
                    bVar.a(i11).getClass();
                    if (0 <= j9) {
                    }
                }
                return i11;
            }
        }
        return -1;
    }

    public final int c(long j8) {
        b bVar = this.f12091g;
        int i = bVar.f11922a;
        int i10 = i - 1;
        if (i10 == i - 1) {
            bVar.a(i10).getClass();
        }
        while (i10 >= 0 && j8 != Long.MIN_VALUE) {
            bVar.a(i10).getClass();
            if (j8 >= 0) {
                break;
            }
            i10--;
        }
        if (i10 >= 0) {
            a aVarA = bVar.a(i10);
            int i11 = aVarA.f11911a;
            if (i11 != -1) {
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = aVarA.f11915e[i12];
                    if (i13 != 0 && i13 != 1) {
                    }
                }
            }
            return i10;
        }
        return -1;
    }

    public final long d(int i) {
        this.f12091g.a(i).getClass();
        return 0L;
    }

    public final int e(int i) {
        return this.f12091g.a(i).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !q0.class.equals(obj.getClass())) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Objects.equals(this.f12086a, q0Var.f12086a) && Objects.equals(this.f12087b, q0Var.f12087b) && this.f12088c == q0Var.f12088c && this.f12089d == q0Var.f12089d && this.f12090e == q0Var.f12090e && this.f == q0Var.f && Objects.equals(this.f12091g, q0Var.f12091g);
    }

    public final boolean f(int i) {
        b bVar = this.f12091g;
        int i10 = bVar.f11922a;
        if (i != i10 - 1 || i != i10 - 1) {
            return false;
        }
        bVar.a(i).getClass();
        return false;
    }

    public final boolean g(int i) {
        this.f12091g.a(i).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i, long j8, long j9, b bVar, boolean z2) {
        this.f12086a = obj;
        this.f12087b = obj2;
        this.f12088c = i;
        this.f12089d = j8;
        this.f12090e = j9;
        this.f12091g = bVar;
        this.f = z2;
    }

    public final int hashCode() {
        Object obj = this.f12086a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f12087b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f12088c) * 31;
        long j8 = this.f12089d;
        int i = (iHashCode2 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f12090e;
        return this.f12091g.hashCode() + ((((i + ((int) (j9 ^ (j9 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }
}
