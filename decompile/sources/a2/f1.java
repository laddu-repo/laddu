package a2;

import android.util.Pair;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: c, reason: collision with root package name */
    public final b2.f f230c;

    /* renamed from: d, reason: collision with root package name */
    public final u1.x f231d;

    /* renamed from: e, reason: collision with root package name */
    public final e0 f232e;

    /* renamed from: f, reason: collision with root package name */
    public long f233f;

    /* renamed from: g, reason: collision with root package name */
    public int f234g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f235h;

    /* renamed from: i, reason: collision with root package name */
    public c1 f236i;
    public c1 j;

    /* renamed from: k, reason: collision with root package name */
    public c1 f237k;

    /* renamed from: l, reason: collision with root package name */
    public c1 f238l;

    /* renamed from: m, reason: collision with root package name */
    public c1 f239m;

    /* renamed from: n, reason: collision with root package name */
    public int f240n;

    /* renamed from: o, reason: collision with root package name */
    public Object f241o;

    /* renamed from: p, reason: collision with root package name */
    public long f242p;

    /* renamed from: a, reason: collision with root package name */
    public final r1.a1 f228a = new r1.a1();

    /* renamed from: b, reason: collision with root package name */
    public final r1.c1 f229b = new r1.c1();

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f243q = new ArrayList();

    public f1(b2.f fVar, u1.x xVar, e0 e0Var) {
        this.f230c = fVar;
        this.f231d = xVar;
        this.f232e = e0Var;
    }

    public static q2.c0 o(r1.d1 d1Var, Object obj, long j, long j10, r1.c1 c1Var, r1.a1 a1Var) {
        d1Var.g(obj, a1Var);
        d1Var.n(a1Var.f11297c, c1Var);
        d1Var.b(obj);
        int i6 = a1Var.f11301g.f11305a;
        if (i6 != 0) {
            if (i6 == 1) {
                a1Var.f(0);
            }
            a1Var.f11301g.getClass();
            a1Var.g(0);
        }
        d1Var.g(obj, a1Var);
        int c10 = a1Var.c(j);
        if (c10 == -1) {
            return new q2.c0(obj, j10, a1Var.b(j));
        }
        return new q2.c0(obj, c10, a1Var.e(c10), j10, -1);
    }

    public final c1 a() {
        c1 c1Var = this.f236i;
        if (c1Var == null) {
            return null;
        }
        if (c1Var == this.j) {
            this.j = c1Var.f187m;
        }
        if (c1Var == this.f237k) {
            this.f237k = c1Var.f187m;
        }
        c1Var.i();
        int i6 = this.f240n - 1;
        this.f240n = i6;
        if (i6 == 0) {
            this.f238l = null;
            c1 c1Var2 = this.f236i;
            this.f241o = c1Var2.f177b;
            this.f242p = c1Var2.f182g.f197a.f10837d;
        }
        this.f236i = this.f236i.f187m;
        l();
        return this.f236i;
    }

    public final void b() {
        if (this.f240n == 0) {
            return;
        }
        c1 c1Var = this.f236i;
        u1.c.h(c1Var);
        this.f241o = c1Var.f177b;
        this.f242p = c1Var.f182g.f197a.f10837d;
        while (c1Var != null) {
            c1Var.i();
            c1Var = c1Var.f187m;
        }
        this.f236i = null;
        this.f238l = null;
        this.j = null;
        this.f237k = null;
        this.f240n = 0;
        l();
    }

    public final d1 c(r1.d1 d1Var, c1 c1Var, long j) {
        r1.a1 a1Var;
        long j10;
        r1.d1 d1Var2;
        Object obj;
        long j11;
        long j12;
        long j13;
        long q9;
        d1 d1Var3 = c1Var.f182g;
        long j14 = (c1Var.f190p + d1Var3.f201e) - j;
        if (d1Var3.f204h) {
            d1 d1Var4 = c1Var.f182g;
            q2.c0 c0Var = d1Var4.f197a;
            long j15 = d1Var4.f199c;
            int d10 = d1Var.d(d1Var.b(c0Var.f10834a), this.f228a, this.f229b, this.f234g, this.f235h);
            if (d10 != -1) {
                r1.a1 a1Var2 = this.f228a;
                int i6 = d1Var.f(d10, a1Var2, true).f11297c;
                Object obj2 = a1Var2.f11296b;
                obj2.getClass();
                long j16 = c0Var.f10837d;
                if (d1Var.m(i6, this.f229b, 0L).f11339n == d10) {
                    Pair j17 = d1Var.j(this.f229b, this.f228a, i6, -9223372036854775807L, Math.max(0L, j14));
                    if (j17 != null) {
                        Object obj3 = j17.first;
                        long longValue = ((Long) j17.second).longValue();
                        c1 c1Var2 = c1Var.f187m;
                        if (c1Var2 != null && c1Var2.f177b.equals(obj3)) {
                            q9 = c1Var2.f182g.f197a.f10837d;
                        } else {
                            q9 = q(obj3);
                            if (q9 == -1) {
                                q9 = this.f233f;
                                this.f233f = 1 + q9;
                            }
                        }
                        obj = obj3;
                        j11 = longValue;
                        j13 = q9;
                        j12 = -9223372036854775807L;
                    }
                } else {
                    obj = obj2;
                    j11 = 0;
                    j12 = 0;
                    j13 = j16;
                }
                q2.c0 o10 = o(d1Var, obj, j11, j13, this.f229b, this.f228a);
                if (j12 != -9223372036854775807L && j15 != -9223372036854775807L) {
                    int i10 = d1Var.g(c0Var.f10834a, a1Var2).f11301g.f11305a;
                    a1Var2.f11301g.getClass();
                    if (i10 > 0) {
                        a1Var2.g(0);
                    }
                }
                return d(d1Var, o10, j12, j11);
            }
            return null;
        }
        q2.c0 c0Var2 = d1Var3.f197a;
        Object obj4 = c0Var2.f10834a;
        int i11 = c0Var2.f10838e;
        r1.a1 a1Var3 = this.f228a;
        d1Var.g(obj4, a1Var3);
        boolean z10 = d1Var3.f203g;
        if (c0Var2.b()) {
            int i12 = c0Var2.f10835b;
            int i13 = a1Var3.f11301g.a(i12).f11269a;
            if (i13 != -1) {
                int a10 = a1Var3.f11301g.a(i12).a(c0Var2.f10836c);
                if (a10 < i13) {
                    return e(d1Var, c0Var2.f10834a, i12, a10, d1Var3.f199c, c0Var2.f10837d, z10);
                }
                long j18 = d1Var3.f199c;
                if (j18 == -9223372036854775807L) {
                    int i14 = a1Var3.f11297c;
                    long max = Math.max(0L, j14);
                    j10 = 0;
                    Pair j19 = d1Var.j(this.f229b, a1Var3, i14, -9223372036854775807L, max);
                    a1Var = a1Var3;
                    d1Var2 = d1Var;
                    if (j19 == null) {
                        return null;
                    }
                    j18 = ((Long) j19.second).longValue();
                } else {
                    a1Var = a1Var3;
                    j10 = 0;
                    d1Var2 = d1Var;
                }
                int i15 = c0Var2.f10835b;
                d1Var2.g(obj4, a1Var);
                a1Var.d(i15);
                a1Var.f11301g.a(i15).getClass();
                return f(d1Var, c0Var2.f10834a, Math.max(j10, j18), d1Var3.f199c, c0Var2.f10837d, z10);
            }
            return null;
        }
        if (i11 != -1) {
            a1Var3.f(i11);
        }
        int e10 = a1Var3.e(i11);
        a1Var3.g(i11);
        if (e10 != a1Var3.f11301g.a(i11).f11269a) {
            return e(d1Var, c0Var2.f10834a, c0Var2.f10838e, e10, d1Var3.f201e, c0Var2.f10837d, z10);
        }
        d1Var.g(obj4, a1Var3);
        a1Var3.d(i11);
        a1Var3.f11301g.a(i11).getClass();
        return f(d1Var, c0Var2.f10834a, 0L, d1Var3.f201e, c0Var2.f10837d, false);
    }

    public final d1 d(r1.d1 d1Var, q2.c0 c0Var, long j, long j10) {
        d1Var.g(c0Var.f10834a, this.f228a);
        if (c0Var.b()) {
            return e(d1Var, c0Var.f10834a, c0Var.f10835b, c0Var.f10836c, j, c0Var.f10837d, false);
        }
        return f(d1Var, c0Var.f10834a, j10, j, c0Var.f10837d, false);
    }

    public final d1 e(r1.d1 d1Var, Object obj, int i6, int i10, long j, long j10, boolean z10) {
        q2.c0 c0Var = new q2.c0(obj, i6, i10, j10, -1);
        r1.a1 a1Var = this.f228a;
        long a10 = d1Var.g(obj, a1Var).a(i6, i10);
        if (i10 == a1Var.e(i6)) {
            a1Var.f11301g.getClass();
        }
        a1Var.g(i6);
        long j11 = 0;
        if (a10 != -9223372036854775807L && 0 >= a10) {
            j11 = Math.max(0L, a10 - 1);
        }
        return new d1(c0Var, j11, j, -9223372036854775807L, a10, z10, false, false, false, false);
    }

    public final d1 f(r1.d1 d1Var, Object obj, long j, long j10, long j11, boolean z10) {
        long j12;
        long j13;
        long j14;
        r1.a1 a1Var = this.f228a;
        d1Var.g(obj, a1Var);
        int b10 = a1Var.b(j);
        boolean z11 = false;
        if (b10 == -1) {
            if (a1Var.f11301g.f11305a > 0) {
                a1Var.g(0);
            }
        } else {
            a1Var.g(b10);
        }
        q2.c0 c0Var = new q2.c0(obj, j11, b10);
        if (!c0Var.b() && b10 == -1) {
            z11 = true;
        }
        boolean j15 = j(d1Var, c0Var);
        boolean i6 = i(d1Var, c0Var, z11);
        if (b10 != -1) {
            a1Var.g(b10);
        }
        if (b10 != -1) {
            a1Var.f(b10);
        }
        if (b10 != -1) {
            a1Var.d(b10);
            j12 = 0;
        } else {
            j12 = -9223372036854775807L;
        }
        if (j12 != -9223372036854775807L && j12 != Long.MIN_VALUE) {
            j13 = j12;
        } else {
            j13 = a1Var.f11298d;
        }
        if (j13 != -9223372036854775807L && j >= j13) {
            j14 = Math.max(0L, j13 - 1);
        } else {
            j14 = j;
        }
        return new d1(c0Var, j14, j10, j12, j13, z10, false, z11, j15, i6);
    }

    public final c1 g() {
        return this.f237k;
    }

    public final d1 h(r1.d1 d1Var, d1 d1Var2) {
        boolean z10;
        long j;
        long j10;
        q2.c0 c0Var = d1Var2.f197a;
        boolean b10 = c0Var.b();
        int i6 = c0Var.f10838e;
        if (!b10 && i6 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = c0Var.f10835b;
        boolean j11 = j(d1Var, c0Var);
        boolean i11 = i(d1Var, c0Var, z10);
        Object obj = c0Var.f10834a;
        r1.a1 a1Var = this.f228a;
        d1Var.g(obj, a1Var);
        if (!c0Var.b() && i6 != -1) {
            a1Var.d(i6);
            j = 0;
        } else {
            j = -9223372036854775807L;
        }
        if (c0Var.b()) {
            j10 = a1Var.a(i10, c0Var.f10836c);
        } else if (j != -9223372036854775807L && j != Long.MIN_VALUE) {
            j10 = j;
        } else {
            j10 = a1Var.f11298d;
        }
        if (c0Var.b()) {
            a1Var.g(i10);
        } else if (i6 != -1) {
            a1Var.g(i6);
        }
        return new d1(c0Var, d1Var2.f198b, d1Var2.f199c, j, j10, d1Var2.f202f, false, z10, j11, i11);
    }

    public final boolean i(r1.d1 d1Var, q2.c0 c0Var, boolean z10) {
        int b10 = d1Var.b(c0Var.f10834a);
        if (!d1Var.m(d1Var.f(b10, this.f228a, false).f11297c, this.f229b, 0L).f11335i) {
            if (d1Var.d(b10, this.f228a, this.f229b, this.f234g, this.f235h) == -1 && z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(r1.d1 d1Var, q2.c0 c0Var) {
        boolean z10;
        if (!c0Var.b() && c0Var.f10838e == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object obj = c0Var.f10834a;
        if (z10) {
            int i6 = d1Var.g(obj, this.f228a).f11297c;
            if (d1Var.m(i6, this.f229b, 0L).f11340o == d1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        c1 c1Var = this.f239m;
        if (c1Var == null || c1Var.h()) {
            this.f239m = null;
            for (int i6 = 0; i6 < this.f243q.size(); i6++) {
                c1 c1Var2 = (c1) this.f243q.get(i6);
                if (!c1Var2.h()) {
                    this.f239m = c1Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        q2.c0 c0Var;
        db.h0 j = db.k0.j();
        for (c1 c1Var = this.f236i; c1Var != null; c1Var = c1Var.f187m) {
            j.a(c1Var.f182g.f197a);
        }
        c1 c1Var2 = this.j;
        if (c1Var2 == null) {
            c0Var = null;
        } else {
            c0Var = c1Var2.f182g.f197a;
        }
        this.f231d.c(new e1(this, j, c0Var, 0));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [q2.b1, java.lang.Object] */
    public final void m(long j) {
        boolean z10;
        c1 c1Var = this.f238l;
        if (c1Var != null) {
            if (c1Var.f187m == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            u1.c.g(z10);
            if (c1Var.f180e) {
                c1Var.f176a.s(j - c1Var.f190p);
            }
        }
    }

    public final int n(c1 c1Var) {
        u1.c.h(c1Var);
        int i6 = 0;
        if (c1Var.equals(this.f238l)) {
            return 0;
        }
        this.f238l = c1Var;
        while (true) {
            c1Var = c1Var.f187m;
            if (c1Var == null) {
                break;
            }
            if (c1Var == this.j) {
                c1 c1Var2 = this.f236i;
                this.j = c1Var2;
                this.f237k = c1Var2;
                i6 = 3;
            }
            if (c1Var == this.f237k) {
                this.f237k = this.j;
                i6 |= 2;
            }
            c1Var.i();
            this.f240n--;
        }
        c1 c1Var3 = this.f238l;
        c1Var3.getClass();
        if (c1Var3.f187m != null) {
            c1Var3.b();
            c1Var3.f187m = null;
            c1Var3.c();
        }
        l();
        return i6;
    }

    public final q2.c0 p(r1.d1 d1Var, Object obj, long j) {
        long q9;
        int b10;
        Object obj2 = obj;
        r1.a1 a1Var = this.f228a;
        int i6 = d1Var.g(obj2, a1Var).f11297c;
        Object obj3 = this.f241o;
        if (obj3 != null && (b10 = d1Var.b(obj3)) != -1 && d1Var.f(b10, a1Var, false).f11297c == i6) {
            q9 = this.f242p;
        } else {
            c1 c1Var = this.f236i;
            while (true) {
                if (c1Var != null) {
                    if (c1Var.f177b.equals(obj2)) {
                        q9 = c1Var.f182g.f197a.f10837d;
                        break;
                    }
                    c1Var = c1Var.f187m;
                } else {
                    c1 c1Var2 = this.f236i;
                    while (true) {
                        if (c1Var2 != null) {
                            int b11 = d1Var.b(c1Var2.f177b);
                            if (b11 != -1 && d1Var.f(b11, a1Var, false).f11297c == i6) {
                                q9 = c1Var2.f182g.f197a.f10837d;
                                break;
                            }
                            c1Var2 = c1Var2.f187m;
                        } else {
                            q9 = q(obj2);
                            if (q9 == -1) {
                                q9 = this.f233f;
                                this.f233f = 1 + q9;
                                if (this.f236i == null) {
                                    this.f241o = obj2;
                                    this.f242p = q9;
                                }
                            }
                        }
                    }
                }
            }
        }
        d1Var.g(obj2, a1Var);
        int i10 = a1Var.f11297c;
        r1.c1 c1Var3 = this.f229b;
        d1Var.n(i10, c1Var3);
        boolean z10 = false;
        for (int b12 = d1Var.b(obj); b12 >= c1Var3.f11339n; b12--) {
            boolean z11 = true;
            d1Var.f(b12, a1Var, true);
            if (a1Var.f11301g.f11305a <= 0) {
                z11 = false;
            }
            z10 |= z11;
            if (a1Var.c(a1Var.f11298d) != -1) {
                obj2 = a1Var.f11296b;
                obj2.getClass();
            }
            if (z10 && (!z11 || a1Var.f11298d != 0)) {
                break;
            }
        }
        return o(d1Var, obj2, j, q9, this.f229b, this.f228a);
    }

    public final long q(Object obj) {
        for (int i6 = 0; i6 < this.f243q.size(); i6++) {
            c1 c1Var = (c1) this.f243q.get(i6);
            if (c1Var.f177b.equals(obj)) {
                return c1Var.f182g.f197a.f10837d;
            }
        }
        return -1L;
    }

    public final int r(r1.d1 d1Var) {
        r1.d1 d1Var2;
        c1 c1Var;
        c1 c1Var2 = this.f236i;
        if (c1Var2 == null) {
            return 0;
        }
        int b10 = d1Var.b(c1Var2.f177b);
        while (true) {
            d1Var2 = d1Var;
            b10 = d1Var2.d(b10, this.f228a, this.f229b, this.f234g, this.f235h);
            while (true) {
                c1Var2.getClass();
                c1Var = c1Var2.f187m;
                if (c1Var == null || c1Var2.f182g.f204h) {
                    break;
                }
                c1Var2 = c1Var;
            }
            if (b10 == -1 || c1Var == null || d1Var2.b(c1Var.f177b) != b10) {
                break;
            }
            c1Var2 = c1Var;
            d1Var = d1Var2;
        }
        int n10 = n(c1Var2);
        c1Var2.f182g = h(d1Var2, c1Var2.f182g);
        return n10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b4, code lost:
    
        return n(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int s(r1.d1 r18, long r19, long r21, long r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            a2.c1 r2 = r0.f236i
            r3 = 0
        L7:
            r4 = 0
            if (r2 == 0) goto Lb5
            a2.d1 r5 = r2.f182g
            if (r3 != 0) goto L15
            a2.d1 r3 = r0.h(r1, r5)
            r6 = r19
            goto L30
        L15:
            r6 = r19
            a2.d1 r8 = r0.c(r1, r3, r6)
            if (r8 == 0) goto Lb0
            long r9 = r5.f198b
            long r11 = r8.f198b
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto Lb0
            q2.c0 r9 = r5.f197a
            q2.c0 r10 = r8.f197a
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto Lb0
            r3 = r8
        L30:
            long r8 = r3.f201e
            long r10 = r5.f199c
            long r12 = r5.f201e
            a2.d1 r10 = r3.a(r10)
            r2.f182g = r10
            int r10 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r10 == 0) goto La7
            r2.k()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L52
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L55
        L52:
            long r10 = r2.f190p
            long r8 = r8 + r10
        L55:
            a2.c1 r1 = r0.j
            r10 = 1
            r14 = -9223372036854775808
            if (r2 != r1) goto L6c
            a2.d1 r1 = r2.f182g
            boolean r1 = r1.f203g
            if (r1 != 0) goto L6c
            int r1 = (r21 > r14 ? 1 : (r21 == r14 ? 0 : -1))
            if (r1 == 0) goto L6a
            int r1 = (r21 > r8 ? 1 : (r21 == r8 ? 0 : -1))
            if (r1 < 0) goto L6c
        L6a:
            r1 = 1
            goto L6d
        L6c:
            r1 = 0
        L6d:
            a2.c1 r11 = r0.f237k
            if (r2 != r11) goto L7b
            int r11 = (r23 > r14 ? 1 : (r23 == r14 ? 0 : -1))
            if (r11 == 0) goto L79
            int r11 = (r23 > r8 ? 1 : (r23 == r8 ? 0 : -1))
            if (r11 < 0) goto L7b
        L79:
            r8 = 1
            goto L7c
        L7b:
            r8 = 0
        L7c:
            int r2 = r0.n(r2)
            if (r2 == 0) goto L83
            return r2
        L83:
            int r2 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r2 != 0) goto L99
            long r11 = r5.f200d
            int r5 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r5 != 0) goto L99
            long r11 = r3.f200d
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 == 0) goto L99
            int r3 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r3 == 0) goto L99
            r3 = 1
            goto L9a
        L99:
            r3 = 0
        L9a:
            if (r1 == 0) goto La1
            if (r2 != 0) goto La0
            if (r3 == 0) goto La1
        La0:
            r4 = 1
        La1:
            if (r8 == 0) goto La6
            r1 = r4 | 2
            return r1
        La6:
            return r4
        La7:
            a2.c1 r3 = r2.f187m
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
        throw new UnsupportedOperationException("Method not decompiled: a2.f1.s(r1.d1, long, long, long):int");
    }
}
