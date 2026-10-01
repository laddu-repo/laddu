package c2;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final o2.d0 f1839u = new o2.d0(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1.s0 f1840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o2.d0 f1841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1844e;
    public final o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f1845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o2.j1 f1846h;
    public final r2.w i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f1847j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o2.d0 f1848k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f1849l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f1850m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f1851n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t1.i0 f1852o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f1853p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f1854q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f1855r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile long f1856s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile long f1857t;

    public l1(t1.s0 s0Var, o2.d0 d0Var, long j8, long j9, int i, o oVar, boolean z2, o2.j1 j1Var, r2.w wVar, List list, o2.d0 d0Var2, boolean z10, int i10, int i11, t1.i0 i0Var, long j10, long j11, long j12, long j13, boolean z11) {
        this.f1840a = s0Var;
        this.f1841b = d0Var;
        this.f1842c = j8;
        this.f1843d = j9;
        this.f1844e = i;
        this.f = oVar;
        this.f1845g = z2;
        this.f1846h = j1Var;
        this.i = wVar;
        this.f1847j = list;
        this.f1848k = d0Var2;
        this.f1849l = z10;
        this.f1850m = i10;
        this.f1851n = i11;
        this.f1852o = i0Var;
        this.f1854q = j10;
        this.f1855r = j11;
        this.f1856s = j12;
        this.f1857t = j13;
        this.f1853p = z11;
    }

    public static l1 k(r2.w wVar) {
        t1.p0 p0Var = t1.s0.f12110a;
        o2.j1 j1Var = o2.j1.f9467d;
        y9.z0 z0Var = y9.z0.f14637z;
        t1.i0 i0Var = t1.i0.f12003d;
        o2.d0 d0Var = f1839u;
        return new l1(p0Var, d0Var, -9223372036854775807L, 0L, 1, null, false, j1Var, wVar, z0Var, d0Var, false, 1, 0, i0Var, 0L, 0L, 0L, 0L, false);
    }

    public final l1 a() {
        return new l1(this.f1840a, this.f1841b, this.f1842c, this.f1843d, this.f1844e, this.f, this.f1845g, this.f1846h, this.i, this.f1847j, this.f1848k, this.f1849l, this.f1850m, this.f1851n, this.f1852o, this.f1854q, this.f1855r, l(), SystemClock.elapsedRealtime(), this.f1853p);
    }

    public final l1 b(boolean z2) {
        return new l1(this.f1840a, this.f1841b, this.f1842c, this.f1843d, this.f1844e, this.f, z2, this.f1846h, this.i, this.f1847j, this.f1848k, this.f1849l, this.f1850m, this.f1851n, this.f1852o, this.f1854q, this.f1855r, this.f1856s, this.f1857t, this.f1853p);
    }

    public final l1 c(o2.d0 d0Var) {
        return new l1(this.f1840a, this.f1841b, this.f1842c, this.f1843d, this.f1844e, this.f, this.f1845g, this.f1846h, this.i, this.f1847j, d0Var, this.f1849l, this.f1850m, this.f1851n, this.f1852o, this.f1854q, this.f1855r, this.f1856s, this.f1857t, this.f1853p);
    }

    public final l1 d(o2.d0 d0Var, long j8, long j9, long j10, long j11, o2.j1 j1Var, r2.w wVar, List list) {
        return new l1(this.f1840a, d0Var, j9, j10, this.f1844e, this.f, this.f1845g, j1Var, wVar, list, this.f1848k, this.f1849l, this.f1850m, this.f1851n, this.f1852o, this.f1854q, j11, j8, SystemClock.elapsedRealtime(), this.f1853p);
    }

    public final l1 e(int i, int i10, boolean z2) {
        return new l1(this.f1840a, this.f1841b, this.f1842c, this.f1843d, this.f1844e, this.f, this.f1845g, this.f1846h, this.i, this.f1847j, this.f1848k, z2, i, i10, this.f1852o, this.f1854q, this.f1855r, this.f1856s, this.f1857t, this.f1853p);
    }

    public final l1 f(o oVar) {
        return new l1(this.f1840a, this.f1841b, this.f1842c, this.f1843d, this.f1844e, oVar, this.f1845g, this.f1846h, this.i, this.f1847j, this.f1848k, this.f1849l, this.f1850m, this.f1851n, this.f1852o, this.f1854q, this.f1855r, this.f1856s, this.f1857t, this.f1853p);
    }

    public final l1 g(t1.i0 i0Var) {
        return new l1(this.f1840a, this.f1841b, this.f1842c, this.f1843d, this.f1844e, this.f, this.f1845g, this.f1846h, this.i, this.f1847j, this.f1848k, this.f1849l, this.f1850m, this.f1851n, i0Var, this.f1854q, this.f1855r, this.f1856s, this.f1857t, this.f1853p);
    }

    public final l1 h(int i) {
        return new l1(this.f1840a, this.f1841b, this.f1842c, this.f1843d, i, this.f, this.f1845g, this.f1846h, this.i, this.f1847j, this.f1848k, this.f1849l, this.f1850m, this.f1851n, this.f1852o, this.f1854q, this.f1855r, this.f1856s, this.f1857t, this.f1853p);
    }

    public final l1 i(boolean z2) {
        return new l1(this.f1840a, this.f1841b, this.f1842c, this.f1843d, this.f1844e, this.f, this.f1845g, this.f1846h, this.i, this.f1847j, this.f1848k, this.f1849l, this.f1850m, this.f1851n, this.f1852o, this.f1854q, this.f1855r, this.f1856s, this.f1857t, z2);
    }

    public final l1 j(t1.s0 s0Var) {
        return new l1(s0Var, this.f1841b, this.f1842c, this.f1843d, this.f1844e, this.f, this.f1845g, this.f1846h, this.i, this.f1847j, this.f1848k, this.f1849l, this.f1850m, this.f1851n, this.f1852o, this.f1854q, this.f1855r, this.f1856s, this.f1857t, this.f1853p);
    }

    public final long l() {
        long j8;
        long j9;
        if (!m()) {
            return this.f1856s;
        }
        do {
            j8 = this.f1857t;
            j9 = this.f1856s;
        } while (j8 != this.f1857t);
        return w1.b0.M(w1.b0.Y(j9) + ((long) ((SystemClock.elapsedRealtime() - j8) * this.f1852o.f12004a)));
    }

    public final boolean m() {
        return this.f1844e == 3 && this.f1849l && this.f1851n == 0;
    }
}
