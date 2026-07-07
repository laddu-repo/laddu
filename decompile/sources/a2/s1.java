package a2;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: u, reason: collision with root package name */
    public static final q2.c0 f393u = new q2.c0(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final r1.d1 f394a;

    /* renamed from: b, reason: collision with root package name */
    public final q2.c0 f395b;

    /* renamed from: c, reason: collision with root package name */
    public final long f396c;

    /* renamed from: d, reason: collision with root package name */
    public final long f397d;

    /* renamed from: e, reason: collision with root package name */
    public final int f398e;

    /* renamed from: f, reason: collision with root package name */
    public final q f399f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f400g;

    /* renamed from: h, reason: collision with root package name */
    public final q2.k1 f401h;

    /* renamed from: i, reason: collision with root package name */
    public final t2.w f402i;
    public final List j;

    /* renamed from: k, reason: collision with root package name */
    public final q2.c0 f403k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f404l;

    /* renamed from: m, reason: collision with root package name */
    public final int f405m;

    /* renamed from: n, reason: collision with root package name */
    public final int f406n;

    /* renamed from: o, reason: collision with root package name */
    public final r1.o0 f407o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f408p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f409q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f410r;
    public volatile long s;

    /* renamed from: t, reason: collision with root package name */
    public volatile long f411t;

    public s1(r1.d1 d1Var, q2.c0 c0Var, long j, long j10, int i6, q qVar, boolean z10, q2.k1 k1Var, t2.w wVar, List list, q2.c0 c0Var2, boolean z11, int i10, int i11, r1.o0 o0Var, long j11, long j12, long j13, long j14, boolean z12) {
        this.f394a = d1Var;
        this.f395b = c0Var;
        this.f396c = j;
        this.f397d = j10;
        this.f398e = i6;
        this.f399f = qVar;
        this.f400g = z10;
        this.f401h = k1Var;
        this.f402i = wVar;
        this.j = list;
        this.f403k = c0Var2;
        this.f404l = z11;
        this.f405m = i10;
        this.f406n = i11;
        this.f407o = o0Var;
        this.f409q = j11;
        this.f410r = j12;
        this.s = j13;
        this.f411t = j14;
        this.f408p = z12;
    }

    public static s1 k(t2.w wVar) {
        r1.z0 z0Var = r1.d1.f11368a;
        q2.k1 k1Var = q2.k1.f10907d;
        db.c1 c1Var = db.c1.B;
        r1.o0 o0Var = r1.o0.f11593d;
        q2.c0 c0Var = f393u;
        return new s1(z0Var, c0Var, -9223372036854775807L, 0L, 1, null, false, k1Var, wVar, c1Var, c0Var, false, 1, 0, o0Var, 0L, 0L, 0L, 0L, false);
    }

    public final s1 a() {
        return new s1(this.f394a, this.f395b, this.f396c, this.f397d, this.f398e, this.f399f, this.f400g, this.f401h, this.f402i, this.j, this.f403k, this.f404l, this.f405m, this.f406n, this.f407o, this.f409q, this.f410r, l(), SystemClock.elapsedRealtime(), this.f408p);
    }

    public final s1 b(boolean z10) {
        return new s1(this.f394a, this.f395b, this.f396c, this.f397d, this.f398e, this.f399f, z10, this.f401h, this.f402i, this.j, this.f403k, this.f404l, this.f405m, this.f406n, this.f407o, this.f409q, this.f410r, this.s, this.f411t, this.f408p);
    }

    public final s1 c(q2.c0 c0Var) {
        return new s1(this.f394a, this.f395b, this.f396c, this.f397d, this.f398e, this.f399f, this.f400g, this.f401h, this.f402i, this.j, c0Var, this.f404l, this.f405m, this.f406n, this.f407o, this.f409q, this.f410r, this.s, this.f411t, this.f408p);
    }

    public final s1 d(q2.c0 c0Var, long j, long j10, long j11, long j12, q2.k1 k1Var, t2.w wVar, List list) {
        return new s1(this.f394a, c0Var, j10, j11, this.f398e, this.f399f, this.f400g, k1Var, wVar, list, this.f403k, this.f404l, this.f405m, this.f406n, this.f407o, this.f409q, j12, j, SystemClock.elapsedRealtime(), this.f408p);
    }

    public final s1 e(boolean z10, int i6, int i10) {
        return new s1(this.f394a, this.f395b, this.f396c, this.f397d, this.f398e, this.f399f, this.f400g, this.f401h, this.f402i, this.j, this.f403k, z10, i6, i10, this.f407o, this.f409q, this.f410r, this.s, this.f411t, this.f408p);
    }

    public final s1 f(q qVar) {
        return new s1(this.f394a, this.f395b, this.f396c, this.f397d, this.f398e, qVar, this.f400g, this.f401h, this.f402i, this.j, this.f403k, this.f404l, this.f405m, this.f406n, this.f407o, this.f409q, this.f410r, this.s, this.f411t, this.f408p);
    }

    public final s1 g(r1.o0 o0Var) {
        return new s1(this.f394a, this.f395b, this.f396c, this.f397d, this.f398e, this.f399f, this.f400g, this.f401h, this.f402i, this.j, this.f403k, this.f404l, this.f405m, this.f406n, o0Var, this.f409q, this.f410r, this.s, this.f411t, this.f408p);
    }

    public final s1 h(int i6) {
        return new s1(this.f394a, this.f395b, this.f396c, this.f397d, i6, this.f399f, this.f400g, this.f401h, this.f402i, this.j, this.f403k, this.f404l, this.f405m, this.f406n, this.f407o, this.f409q, this.f410r, this.s, this.f411t, this.f408p);
    }

    public final s1 i(boolean z10) {
        return new s1(this.f394a, this.f395b, this.f396c, this.f397d, this.f398e, this.f399f, this.f400g, this.f401h, this.f402i, this.j, this.f403k, this.f404l, this.f405m, this.f406n, this.f407o, this.f409q, this.f410r, this.s, this.f411t, z10);
    }

    public final s1 j(r1.d1 d1Var) {
        return new s1(d1Var, this.f395b, this.f396c, this.f397d, this.f398e, this.f399f, this.f400g, this.f401h, this.f402i, this.j, this.f403k, this.f404l, this.f405m, this.f406n, this.f407o, this.f409q, this.f410r, this.s, this.f411t, this.f408p);
    }

    public final long l() {
        long j;
        long j10;
        if (!m()) {
            return this.s;
        }
        do {
            j = this.f411t;
            j10 = this.s;
        } while (j != this.f411t);
        return u1.a0.Q(u1.a0.e0(j10) + (((float) (SystemClock.elapsedRealtime() - j)) * this.f407o.f11596a));
    }

    public final boolean m() {
        if (this.f398e == 3 && this.f404l && this.f406n == 0) {
            return true;
        }
        return false;
    }
}
