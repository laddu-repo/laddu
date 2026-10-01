package c2;

import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d2.f f2019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1.x f2020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.fragment.app.d1 f2021e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2023h;
    public x0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x0 f2024j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public x0 f2025k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public x0 f2026l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public x0 f2027m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2028n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f2029o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f2030p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1.q0 f2017a = new t1.q0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1.r0 f2018b = new t1.r0();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f2031q = new ArrayList();

    public z0(d2.f fVar, w1.x xVar, androidx.fragment.app.d1 d1Var, t tVar) {
        this.f2019c = fVar;
        this.f2020d = xVar;
        this.f2021e = d1Var;
    }

    public static o2.d0 o(t1.s0 s0Var, Object obj, long j8, long j9, t1.r0 r0Var, t1.q0 q0Var) {
        s0Var.g(obj, q0Var);
        s0Var.n(q0Var.f12088c, r0Var);
        s0Var.b(obj);
        int i = q0Var.f12091g.f11922a;
        if (i != 0) {
            if (i == 1) {
                q0Var.f(0);
            }
            q0Var.f12091g.getClass();
            q0Var.g(0);
        }
        s0Var.g(obj, q0Var);
        int iC = q0Var.c(j8);
        return iC == -1 ? new o2.d0(obj, j9, q0Var.b(j8)) : new o2.d0(obj, iC, q0Var.e(iC), j9, -1);
    }

    public final x0 a() {
        x0 x0Var = this.i;
        if (x0Var == null) {
            return null;
        }
        if (x0Var == this.f2024j) {
            this.f2024j = x0Var.f2001m;
        }
        if (x0Var == this.f2025k) {
            this.f2025k = x0Var.f2001m;
        }
        x0Var.i();
        int i = this.f2028n - 1;
        this.f2028n = i;
        if (i == 0) {
            this.f2026l = null;
            x0 x0Var2 = this.i;
            this.f2029o = x0Var2.f1992b;
            this.f2030p = x0Var2.f1996g.f2007a.f9407d;
        }
        this.i = this.i.f2001m;
        l();
        return this.i;
    }

    public final void b() {
        if (this.f2028n == 0) {
            return;
        }
        x0 x0Var = this.i;
        w1.a.k(x0Var);
        this.f2029o = x0Var.f1992b;
        this.f2030p = x0Var.f1996g.f2007a.f9407d;
        while (x0Var != null) {
            x0Var.i();
            x0Var = x0Var.f2001m;
        }
        this.i = null;
        this.f2026l = null;
        this.f2024j = null;
        this.f2025k = null;
        this.f2028n = 0;
        l();
    }

    public final y0 c(t1.s0 s0Var, x0 x0Var, long j8) {
        long j9;
        t1.q0 q0Var;
        t1.s0 s0Var2;
        Object obj;
        long j10;
        long j11;
        long j12;
        long jQ;
        y0 y0Var = x0Var.f1996g;
        long j13 = (x0Var.f2004p + y0Var.f2011e) - j8;
        if (!y0Var.f2013h) {
            o2.d0 d0Var = y0Var.f2007a;
            Object obj2 = d0Var.f9404a;
            int i = d0Var.f9408e;
            t1.q0 q0Var2 = this.f2017a;
            s0Var.g(obj2, q0Var2);
            boolean z2 = y0Var.f2012g;
            if (!d0Var.b()) {
                if (i != -1) {
                    q0Var2.f(i);
                }
                int iE = q0Var2.e(i);
                q0Var2.g(i);
                if (iE != q0Var2.f12091g.a(i).f11911a) {
                    return e(s0Var, d0Var.f9404a, d0Var.f9408e, iE, y0Var.f2011e, d0Var.f9407d, z2);
                }
                s0Var.g(obj2, q0Var2);
                q0Var2.d(i);
                q0Var2.f12091g.a(i).getClass();
                return f(s0Var, d0Var.f9404a, 0L, y0Var.f2011e, d0Var.f9407d, false);
            }
            int i10 = d0Var.f9405b;
            int i11 = q0Var2.f12091g.a(i10).f11911a;
            if (i11 == -1) {
                return null;
            }
            int iA = q0Var2.f12091g.a(i10).a(d0Var.f9406c);
            if (iA < i11) {
                return e(s0Var, d0Var.f9404a, i10, iA, y0Var.f2009c, d0Var.f9407d, z2);
            }
            long jLongValue = y0Var.f2009c;
            if (jLongValue == -9223372036854775807L) {
                int i12 = q0Var2.f12088c;
                long jMax = Math.max(0L, j13);
                j9 = 0;
                Pair pairJ = s0Var.j(this.f2018b, q0Var2, i12, -9223372036854775807L, jMax);
                q0Var = q0Var2;
                s0Var2 = s0Var;
                if (pairJ == null) {
                    return null;
                }
                jLongValue = ((Long) pairJ.second).longValue();
            } else {
                j9 = 0;
                q0Var = q0Var2;
                s0Var2 = s0Var;
            }
            int i13 = d0Var.f9405b;
            s0Var2.g(obj2, q0Var);
            q0Var.d(i13);
            q0Var.f12091g.a(i13).getClass();
            return f(s0Var, d0Var.f9404a, Math.max(j9, jLongValue), y0Var.f2009c, d0Var.f9407d, z2);
        }
        y0 y0Var2 = x0Var.f1996g;
        o2.d0 d0Var2 = y0Var2.f2007a;
        long j14 = y0Var2.f2009c;
        int iD = s0Var.d(s0Var.b(d0Var2.f9404a), this.f2017a, this.f2018b, this.f2022g, this.f2023h);
        if (iD != -1) {
            t1.q0 q0Var3 = this.f2017a;
            int i14 = s0Var.f(iD, q0Var3, true).f12088c;
            Object obj3 = q0Var3.f12087b;
            obj3.getClass();
            long j15 = d0Var2.f9407d;
            if (s0Var.m(i14, this.f2018b, 0L).f12106n == iD) {
                Pair pairJ2 = s0Var.j(this.f2018b, this.f2017a, i14, -9223372036854775807L, Math.max(0L, j13));
                if (pairJ2 != null) {
                    Object obj4 = pairJ2.first;
                    long jLongValue2 = ((Long) pairJ2.second).longValue();
                    x0 x0Var2 = x0Var.f2001m;
                    if (x0Var2 == null || !x0Var2.f1992b.equals(obj4)) {
                        jQ = q(obj4);
                        if (jQ == -1) {
                            jQ = this.f;
                            this.f = 1 + jQ;
                        }
                    } else {
                        jQ = x0Var2.f1996g.f2007a.f9407d;
                    }
                    obj = obj4;
                    j10 = jLongValue2;
                    j12 = jQ;
                    j11 = -9223372036854775807L;
                }
            } else {
                obj = obj3;
                j10 = 0;
                j11 = 0;
                j12 = j15;
            }
            o2.d0 d0VarO = o(s0Var, obj, j10, j12, this.f2018b, this.f2017a);
            if (j11 != -9223372036854775807L && j14 != -9223372036854775807L) {
                int i15 = s0Var.g(d0Var2.f9404a, q0Var3).f12091g.f11922a;
                q0Var3.f12091g.getClass();
                if (i15 > 0) {
                    q0Var3.g(0);
                }
            }
            return d(s0Var, d0VarO, j11, j10);
        }
        return null;
    }

    public final y0 d(t1.s0 s0Var, o2.d0 d0Var, long j8, long j9) {
        s0Var.g(d0Var.f9404a, this.f2017a);
        return d0Var.b() ? e(s0Var, d0Var.f9404a, d0Var.f9405b, d0Var.f9406c, j8, d0Var.f9407d, false) : f(s0Var, d0Var.f9404a, j9, j8, d0Var.f9407d, false);
    }

    public final y0 e(t1.s0 s0Var, Object obj, int i, int i10, long j8, long j9, boolean z2) {
        o2.d0 d0Var = new o2.d0(obj, i, i10, j9, -1);
        t1.q0 q0Var = this.f2017a;
        long jA = s0Var.g(obj, q0Var).a(i, i10);
        if (i10 == q0Var.e(i)) {
            q0Var.f12091g.getClass();
        }
        q0Var.g(i);
        long jMax = 0;
        if (jA != -9223372036854775807L && 0 >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new y0(d0Var, jMax, j8, -9223372036854775807L, jA, z2, false, false, false, false);
    }

    public final y0 f(t1.s0 s0Var, Object obj, long j8, long j9, long j10, boolean z2) {
        long j11;
        t1.q0 q0Var = this.f2017a;
        s0Var.g(obj, q0Var);
        int iB = q0Var.b(j8);
        boolean z10 = false;
        if (iB != -1) {
            q0Var.g(iB);
        } else if (q0Var.f12091g.f11922a > 0) {
            q0Var.g(0);
        }
        o2.d0 d0Var = new o2.d0(obj, j10, iB);
        if (!d0Var.b() && iB == -1) {
            z10 = true;
        }
        boolean zJ = j(s0Var, d0Var);
        boolean zI = i(s0Var, d0Var, z10);
        if (iB != -1) {
            q0Var.g(iB);
        }
        if (iB != -1) {
            q0Var.f(iB);
        }
        if (iB != -1) {
            q0Var.d(iB);
            j11 = 0;
        } else {
            j11 = -9223372036854775807L;
        }
        long j12 = (j11 == -9223372036854775807L || j11 == Long.MIN_VALUE) ? q0Var.f12089d : j11;
        return new y0(d0Var, (j12 == -9223372036854775807L || j8 < j12) ? j8 : Math.max(0L, j12 - ((long) 1)), j9, j11, j12, z2, false, z10, zJ, zI);
    }

    public final x0 g() {
        return this.f2025k;
    }

    public final y0 h(t1.s0 s0Var, y0 y0Var) {
        long j8;
        o2.d0 d0Var = y0Var.f2007a;
        boolean zB = d0Var.b();
        int i = d0Var.f9408e;
        boolean z2 = !zB && i == -1;
        int i10 = d0Var.f9405b;
        boolean zJ = j(s0Var, d0Var);
        boolean zI = i(s0Var, d0Var, z2);
        Object obj = d0Var.f9404a;
        t1.q0 q0Var = this.f2017a;
        s0Var.g(obj, q0Var);
        if (d0Var.b() || i == -1) {
            j8 = -9223372036854775807L;
        } else {
            q0Var.d(i);
            j8 = 0;
        }
        long jA = d0Var.b() ? q0Var.a(i10, d0Var.f9406c) : (j8 == -9223372036854775807L || j8 == Long.MIN_VALUE) ? q0Var.f12089d : j8;
        if (d0Var.b()) {
            q0Var.g(i10);
        } else if (i != -1) {
            q0Var.g(i);
        }
        return new y0(d0Var, y0Var.f2008b, y0Var.f2009c, j8, jA, y0Var.f, false, z2, zJ, zI);
    }

    public final boolean i(t1.s0 s0Var, o2.d0 d0Var, boolean z2) {
        int iB = s0Var.b(d0Var.f9404a);
        if (!s0Var.m(s0Var.f(iB, this.f2017a, false).f12088c, this.f2018b, 0L).i) {
            if (s0Var.d(iB, this.f2017a, this.f2018b, this.f2022g, this.f2023h) == -1 && z2) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(t1.s0 s0Var, o2.d0 d0Var) {
        boolean z2 = !d0Var.b() && d0Var.f9408e == -1;
        Object obj = d0Var.f9404a;
        if (z2) {
            if (s0Var.m(s0Var.g(obj, this.f2017a).f12088c, this.f2018b, 0L).f12107o == s0Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        x0 x0Var = this.f2027m;
        if (x0Var == null || x0Var.h()) {
            this.f2027m = null;
            for (int i = 0; i < this.f2031q.size(); i++) {
                x0 x0Var2 = (x0) this.f2031q.get(i);
                if (!x0Var2.h()) {
                    this.f2027m = x0Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        y9.b0 b0VarJ = y9.f0.j();
        for (x0 x0Var = this.i; x0Var != null; x0Var = x0Var.f2001m) {
            b0VarJ.a(x0Var.f1996g.f2007a);
        }
        x0 x0Var2 = this.f2024j;
        this.f2020d.c(new androidx.emoji2.text.n(this, b0VarJ, x0Var2 == null ? null : x0Var2.f1996g.f2007a, 2));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, o2.e1] */
    public final void m(long j8) {
        x0 x0Var = this.f2026l;
        if (x0Var != null) {
            w1.a.j(x0Var.f2001m == null);
            if (x0Var.f1995e) {
                x0Var.f1991a.x(j8 - x0Var.f2004p);
            }
        }
    }

    public final int n(x0 x0Var) {
        w1.a.k(x0Var);
        int i = 0;
        if (x0Var.equals(this.f2026l)) {
            return 0;
        }
        this.f2026l = x0Var;
        while (true) {
            x0Var = x0Var.f2001m;
            if (x0Var == null) {
                break;
            }
            if (x0Var == this.f2024j) {
                x0 x0Var2 = this.i;
                this.f2024j = x0Var2;
                this.f2025k = x0Var2;
                i = 3;
            }
            if (x0Var == this.f2025k) {
                this.f2025k = this.f2024j;
                i |= 2;
            }
            x0Var.i();
            this.f2028n--;
        }
        x0 x0Var3 = this.f2026l;
        x0Var3.getClass();
        if (x0Var3.f2001m != null) {
            x0Var3.b();
            x0Var3.f2001m = null;
            x0Var3.c();
        }
        l();
        return i;
    }

    public final o2.d0 p(t1.s0 s0Var, Object obj, long j8) {
        long jQ;
        int iB;
        Object obj2 = obj;
        t1.q0 q0Var = this.f2017a;
        int i = s0Var.g(obj2, q0Var).f12088c;
        Object obj3 = this.f2029o;
        if (obj3 == null || (iB = s0Var.b(obj3)) == -1 || s0Var.f(iB, q0Var, false).f12088c != i) {
            x0 x0Var = this.i;
            while (true) {
                if (x0Var == null) {
                    x0 x0Var2 = this.i;
                    while (true) {
                        if (x0Var2 != null) {
                            int iB2 = s0Var.b(x0Var2.f1992b);
                            if (iB2 != -1 && s0Var.f(iB2, q0Var, false).f12088c == i) {
                                jQ = x0Var2.f1996g.f2007a.f9407d;
                                break;
                            }
                            x0Var2 = x0Var2.f2001m;
                        } else {
                            jQ = q(obj2);
                            if (jQ == -1) {
                                jQ = this.f;
                                this.f = 1 + jQ;
                                if (this.i == null) {
                                    this.f2029o = obj2;
                                    this.f2030p = jQ;
                                }
                            }
                        }
                    }
                } else {
                    if (x0Var.f1992b.equals(obj2)) {
                        jQ = x0Var.f1996g.f2007a.f9407d;
                        break;
                    }
                    x0Var = x0Var.f2001m;
                }
            }
        } else {
            jQ = this.f2030p;
        }
        s0Var.g(obj2, q0Var);
        int i10 = q0Var.f12088c;
        t1.r0 r0Var = this.f2018b;
        s0Var.n(i10, r0Var);
        boolean z2 = false;
        for (int iB3 = s0Var.b(obj); iB3 >= r0Var.f12106n; iB3--) {
            s0Var.f(iB3, q0Var, true);
            boolean z10 = q0Var.f12091g.f11922a > 0;
            z2 |= z10;
            if (q0Var.c(q0Var.f12089d) != -1) {
                obj2 = q0Var.f12087b;
                obj2.getClass();
            }
            if (z2 && (!z10 || q0Var.f12089d != 0)) {
                break;
            }
        }
        return o(s0Var, obj2, j8, jQ, this.f2018b, this.f2017a);
    }

    public final long q(Object obj) {
        for (int i = 0; i < this.f2031q.size(); i++) {
            x0 x0Var = (x0) this.f2031q.get(i);
            if (x0Var.f1992b.equals(obj)) {
                return x0Var.f1996g.f2007a.f9407d;
            }
        }
        return -1L;
    }

    public final int r(t1.s0 s0Var) {
        t1.s0 s0Var2;
        x0 x0Var;
        x0 x0Var2 = this.i;
        if (x0Var2 == null) {
            return 0;
        }
        int iB = s0Var.b(x0Var2.f1992b);
        while (true) {
            s0Var2 = s0Var;
            iB = s0Var2.d(iB, this.f2017a, this.f2018b, this.f2022g, this.f2023h);
            while (true) {
                x0Var2.getClass();
                x0Var = x0Var2.f2001m;
                if (x0Var == null || x0Var2.f1996g.f2013h) {
                    break;
                }
                x0Var2 = x0Var;
            }
            if (iB == -1 || x0Var == null || s0Var2.b(x0Var.f1992b) != iB) {
                break;
            }
            x0Var2 = x0Var;
            s0Var = s0Var2;
        }
        int iN = n(x0Var2);
        x0Var2.f1996g = h(s0Var2, x0Var2.f1996g);
        return iN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b4, code lost:
    
        return n(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int s(t1.s0 r18, long r19, long r21, long r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            c2.x0 r2 = r0.i
            r3 = 0
        L7:
            r4 = 0
            if (r2 == 0) goto Lb5
            c2.y0 r5 = r2.f1996g
            if (r3 != 0) goto L15
            c2.y0 r3 = r0.h(r1, r5)
            r6 = r19
            goto L30
        L15:
            r6 = r19
            c2.y0 r8 = r0.c(r1, r3, r6)
            if (r8 == 0) goto Lb0
            long r9 = r5.f2008b
            long r11 = r8.f2008b
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto Lb0
            o2.d0 r9 = r5.f2007a
            o2.d0 r10 = r8.f2007a
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto Lb0
            r3 = r8
        L30:
            long r8 = r3.f2011e
            long r10 = r5.f2009c
            long r12 = r5.f2011e
            c2.y0 r10 = r3.a(r10)
            r2.f1996g = r10
            int r10 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r10 == 0) goto La7
            r2.k()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L52
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L55
        L52:
            long r10 = r2.f2004p
            long r8 = r8 + r10
        L55:
            c2.x0 r1 = r0.f2024j
            r10 = 1
            r14 = -9223372036854775808
            if (r2 != r1) goto L6c
            c2.y0 r1 = r2.f1996g
            boolean r1 = r1.f2012g
            if (r1 != 0) goto L6c
            int r1 = (r21 > r14 ? 1 : (r21 == r14 ? 0 : -1))
            if (r1 == 0) goto L6a
            int r1 = (r21 > r8 ? 1 : (r21 == r8 ? 0 : -1))
            if (r1 < 0) goto L6c
        L6a:
            r1 = r10
            goto L6d
        L6c:
            r1 = r4
        L6d:
            c2.x0 r11 = r0.f2025k
            if (r2 != r11) goto L7b
            int r11 = (r23 > r14 ? 1 : (r23 == r14 ? 0 : -1))
            if (r11 == 0) goto L79
            int r8 = (r23 > r8 ? 1 : (r23 == r8 ? 0 : -1))
            if (r8 < 0) goto L7b
        L79:
            r8 = r10
            goto L7c
        L7b:
            r8 = r4
        L7c:
            int r2 = r0.n(r2)
            if (r2 == 0) goto L83
            return r2
        L83:
            int r2 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r2 != 0) goto L99
            long r11 = r5.f2010d
            int r5 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r5 != 0) goto L99
            long r11 = r3.f2010d
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 == 0) goto L99
            int r3 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r3 == 0) goto L99
            r3 = r10
            goto L9a
        L99:
            r3 = r4
        L9a:
            if (r1 == 0) goto La1
            if (r2 != 0) goto La0
            if (r3 == 0) goto La1
        La0:
            r4 = r10
        La1:
            if (r8 == 0) goto La6
            r1 = r4 | 2
            return r1
        La6:
            return r4
        La7:
            c2.x0 r3 = r2.f2001m
            r16 = r3
            r3 = r2
            r2 = r16
            goto L7
        Lb0:
            int r1 = r0.n(r3)
            return r1
        Lb5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.z0.s(t1.s0, long, long, long):int");
    }
}
