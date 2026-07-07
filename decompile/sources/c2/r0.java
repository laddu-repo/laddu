package c2;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements Handler.Callback, o2.a0, m1, u2.v {
    public static final long A0 = w1.b0.Y(10000);
    public final t0 A;
    public final s2.d B;
    public final w1.x C;
    public final p7.m D;
    public final Looper E;
    public final t1.r0 F;
    public final t1.q0 G;
    public final long H;
    public final boolean I;
    public final l J;
    public final ArrayList K;
    public final w1.v L;
    public final b0 M;
    public final z0 N;
    public final k1 O;
    public final i P;
    public final long Q;
    public final d2.l R;
    public final d2.f S;
    public final w1.x T;
    public final boolean U;
    public final e V;
    public u1 W;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public q0 f1902a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public l1 f1903b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public o0 f1904c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f1905d0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f1907f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f1908g0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f1910i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f1911j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f1912k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f1913l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f1914m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f1915n0;
    public int o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public q0 f1916p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public long f1917q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public long f1918r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f1919s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f1920t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public o f1921u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s1[] f1922v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f[] f1924w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public t f1925w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean[] f1926x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final r2.v f1928y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f1929y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final r2.w f1930z;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public long f1927x0 = -9223372036854775807L;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f1906e0 = false;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public float f1931z0 = 1.0f;
    public t1 X = t1.f1967b;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public long f1923v0 = -9223372036854775807L;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public long f1909h0 = -9223372036854775807L;

    public r0(Context context, f[] fVarArr, f[] fVarArr2, r2.v vVar, r2.w wVar, t0 t0Var, s2.d dVar, int i, boolean z2, d2.f fVar, u1 u1Var, i iVar, long j8, Looper looper, w1.v vVar2, b0 b0Var, d2.l lVar, t tVar, final u2.v vVar3) {
        this.M = b0Var;
        this.f1928y = vVar;
        this.f1930z = wVar;
        this.A = t0Var;
        this.B = dVar;
        this.f1911j0 = i;
        this.f1912k0 = z2;
        this.W = u1Var;
        this.P = iVar;
        this.Q = j8;
        this.L = vVar2;
        this.R = lVar;
        this.f1925w0 = tVar;
        this.S = fVar;
        this.H = t0Var.i();
        this.I = t0Var.a();
        t1.p0 p0Var = t1.s0.f12110a;
        l1 l1VarK = l1.k(wVar);
        this.f1903b0 = l1VarK;
        this.f1904c0 = new o0(l1VarK);
        this.f1924w = new f[fVarArr.length];
        this.f1926x = new boolean[fVarArr.length];
        r2.q qVar = (r2.q) vVar;
        qVar.getClass();
        this.f1922v = new s1[fVarArr.length];
        boolean z10 = false;
        for (int i10 = 0; i10 < fVarArr.length; i10++) {
            f fVar2 = fVarArr[i10];
            fVar2.f1726z = i10;
            fVar2.A = lVar;
            fVar2.B = vVar2;
            this.f1924w[i10] = fVar2;
            f fVar3 = this.f1924w[i10];
            synchronized (fVar3.f1722v) {
                fVar3.M = qVar;
            }
            f fVar4 = fVarArr2[i10];
            if (fVar4 != null) {
                fVar4.f1726z = i10;
                fVar4.A = lVar;
                fVar4.B = vVar2;
                z10 = true;
            }
            s1[] s1VarArr = this.f1922v;
            f fVar5 = fVarArr[i10];
            s1 s1Var = new s1();
            s1Var.f1965e = fVar5;
            s1Var.f1963c = i10;
            s1Var.f = fVar4;
            s1Var.f1964d = 0;
            s1Var.f1961a = false;
            s1Var.f1962b = false;
            s1VarArr[i10] = s1Var;
        }
        this.U = z10;
        this.J = new l(this, vVar2);
        this.K = new ArrayList();
        this.F = new t1.r0();
        this.G = new t1.q0();
        w1.a.j(vVar.f11126a == null);
        vVar.f11126a = this;
        vVar.f11127b = dVar;
        this.f1920t0 = true;
        w1.x xVarA = vVar2.a(looper, null);
        this.T = xVarA;
        this.N = new z0(fVar, xVarA, new androidx.fragment.app.d1(10, this), tVar);
        this.O = new k1(this, fVar, xVarA, lVar);
        p7.m mVar = new p7.m();
        this.D = mVar;
        Looper looperB = mVar.b();
        this.E = looperB;
        w1.x xVarA2 = vVar2.a(looperB, this);
        this.C = xVarA2;
        this.V = new e(context, looperB, this);
        xVarA2.a(35, new u2.v() { // from class: c2.l0
            @Override // u2.v
            public final void b(long j9, long j10, t1.o oVar, MediaFormat mediaFormat) {
                r0 r0Var = this.f1837v;
                r0Var.getClass();
                vVar3.b(j9, j10, oVar, mediaFormat);
                r0Var.b(j9, j10, oVar, mediaFormat);
            }
        }).b();
    }

    public static Pair S(t1.s0 s0Var, q0 q0Var, boolean z2, int i, boolean z10, t1.r0 r0Var, t1.q0 q0Var2) {
        int iT;
        t1.s0 s0Var2 = q0Var.f1890a;
        if (s0Var.p()) {
            return null;
        }
        t1.s0 s0Var3 = s0Var2.p() ? s0Var : s0Var2;
        try {
            Pair pairI = s0Var3.i(r0Var, q0Var2, q0Var.f1891b, q0Var.f1892c);
            if (!s0Var.equals(s0Var3)) {
                if (s0Var.b(pairI.first) == -1) {
                    if (!z2 || (iT = T(r0Var, q0Var2, i, z10, pairI.first, s0Var3, s0Var)) == -1) {
                        return null;
                    }
                    return s0Var.i(r0Var, q0Var2, iT, -9223372036854775807L);
                }
                if (s0Var3.g(pairI.first, q0Var2).f && s0Var3.m(q0Var2.f12088c, r0Var, 0L).f12106n == s0Var3.b(pairI.first)) {
                    return s0Var.i(r0Var, q0Var2, s0Var.g(pairI.first, q0Var2).f12088c, q0Var.f1892c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int T(t1.r0 r0Var, t1.q0 q0Var, int i, boolean z2, Object obj, t1.s0 s0Var, t1.s0 s0Var2) {
        t1.r0 r0Var2 = r0Var;
        t1.s0 s0Var3 = s0Var;
        Object obj2 = s0Var3.m(s0Var3.g(obj, q0Var).f12088c, r0Var, 0L).f12095a;
        for (int i10 = 0; i10 < s0Var2.o(); i10++) {
            if (s0Var2.m(i10, r0Var, 0L).f12095a.equals(obj2)) {
                return i10;
            }
        }
        int iB = s0Var3.b(obj);
        int iH = s0Var3.h();
        int iB2 = -1;
        int i11 = 0;
        while (i11 < iH && iB2 == -1) {
            t1.s0 s0Var4 = s0Var3;
            int iD = s0Var4.d(iB, q0Var, r0Var2, i, z2);
            if (iD == -1) {
                break;
            }
            iB2 = s0Var2.b(s0Var4.l(iD));
            i11++;
            s0Var3 = s0Var4;
            iB = iD;
            r0Var2 = r0Var;
        }
        if (iB2 == -1) {
            return -1;
        }
        return s0Var2.f(iB2, q0Var, false).f12088c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, o2.b0, o2.e1] */
    public static boolean z(x0 x0Var) {
        if (x0Var != null) {
            try {
                ?? r12 = x0Var.f1991a;
                if (x0Var.f1995e) {
                    for (o2.c1 c1Var : x0Var.f1993c) {
                        if (c1Var != null) {
                            c1Var.b();
                        }
                    }
                } else {
                    r12.v();
                }
                if ((!x0Var.f1995e ? 0L : r12.h()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A(int i, o2.d0 d0Var) {
        z0 z0Var = this.N;
        x0 x0Var = z0Var.f2025k;
        if (x0Var != null && x0Var.f1996g.f2007a.equals(d0Var)) {
            s1 s1Var = this.f1922v[i];
            x0 x0Var2 = z0Var.f2025k;
            int i10 = s1Var.f1964d;
            boolean z2 = (i10 == 2 || i10 == 4) && s1Var.d(x0Var2) == ((f) s1Var.f1965e);
            boolean z10 = s1Var.f1964d == 3 && s1Var.d(x0Var2) == ((f) s1Var.f);
            if (z2 || z10) {
                return true;
            }
        }
        return false;
    }

    public final void A0(t1.s0 s0Var, o2.d0 d0Var, t1.s0 s0Var2, o2.d0 d0Var2, long j8, boolean z2) {
        boolean zR0 = r0(s0Var, d0Var);
        Object obj = d0Var.f9404a;
        if (!zR0) {
            t1.i0 i0Var = d0Var.b() ? t1.i0.f12003d : this.f1903b0.f1852o;
            l lVar = this.J;
            if (lVar.d().equals(i0Var)) {
                return;
            }
            this.C.d(16);
            lVar.b(i0Var);
            x(this.f1903b0.f1852o, i0Var.f12004a, false, false);
            return;
        }
        t1.q0 q0Var = this.G;
        int i = s0Var.g(obj, q0Var).f12088c;
        t1.r0 r0Var = this.F;
        s0Var.n(i, r0Var);
        t1.v vVar = r0Var.f12102j;
        i iVar = this.P;
        iVar.getClass();
        iVar.f1762c = w1.b0.M(vVar.f12123a);
        iVar.f = w1.b0.M(vVar.f12124b);
        iVar.f1765g = w1.b0.M(vVar.f12125c);
        float f = vVar.f12126d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        iVar.f1767j = f;
        float f4 = vVar.f12127e;
        if (f4 == -3.4028235E38f) {
            f4 = 1.03f;
        }
        iVar.i = f4;
        if (f == 1.0f && f4 == 1.0f) {
            iVar.f1762c = -9223372036854775807L;
        }
        iVar.a();
        if (j8 != -9223372036854775807L) {
            iVar.f1763d = l(s0Var, obj, j8);
            iVar.a();
            return;
        }
        if (!Objects.equals(!s0Var2.p() ? s0Var2.m(s0Var2.g(d0Var2.f9404a, q0Var).f12088c, r0Var, 0L).f12095a : null, r0Var.f12095a) || z2) {
            iVar.f1763d = -9223372036854775807L;
            iVar.a();
        }
    }

    public final boolean B() {
        x0 x0Var = this.N.i;
        long j8 = x0Var.f1996g.f2011e;
        if (x0Var.f1995e) {
            return j8 == -9223372036854775807L || this.f1903b0.f1856s < j8 || !q0();
        }
        return false;
    }

    public final void B0(boolean z2, boolean z10) {
        long jElapsedRealtime;
        this.f1908g0 = z2;
        if (!z2 || z10) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.L.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.f1909h0 = jElapsedRealtime;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, o2.b0] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, o2.e1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, o2.e1] */
    public final void C() {
        boolean zG;
        if (z(this.N.f2026l)) {
            x0 x0Var = this.N.f2026l;
            long jO = o(!x0Var.f1995e ? 0L : x0Var.f1991a.h());
            x0 x0Var2 = this.N.i;
            long j8 = r0(this.f1903b0.f1840a, x0Var.f1996g.f2007a) ? this.P.f1766h : -9223372036854775807L;
            d2.l lVar = this.R;
            t1.s0 s0Var = this.f1903b0.f1840a;
            float f = this.J.d().f12004a;
            boolean z2 = this.f1903b0.f1849l;
            s0 s0Var2 = new s0(lVar, jO, f, this.f1908g0, j8);
            zG = this.A.g(s0Var2);
            x0 x0Var3 = this.N.i;
            if (!zG && x0Var3.f1995e && jO < 500000 && (this.H > 0 || this.I)) {
                x0Var3.f1991a.i(false, this.f1903b0.f1856s);
                zG = this.A.g(s0Var2);
            }
        } else {
            zG = false;
        }
        this.f1910i0 = zG;
        if (zG) {
            x0 x0Var4 = this.N.f2026l;
            x0Var4.getClass();
            u0 u0Var = new u0();
            u0Var.f1969a = this.f1917q0 - x0Var4.f2004p;
            float f4 = this.J.d().f12004a;
            w1.a.d(f4 > 0.0f || f4 == -3.4028235E38f);
            u0Var.f1970b = f4;
            long j9 = this.f1909h0;
            w1.a.d(j9 >= 0 || j9 == -9223372036854775807L);
            u0Var.f1971c = j9;
            v0 v0Var = new v0(u0Var);
            w1.a.j(x0Var4.f2001m == null);
            x0Var4.f1991a.d(v0Var);
        }
        v0();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, o2.b0, o2.e1] */
    public final void D() {
        z0 z0Var = this.N;
        z0Var.k();
        x0 x0Var = z0Var.f2027m;
        if (x0Var != null) {
            ?? r12 = x0Var.f1991a;
            if ((!x0Var.f1994d || x0Var.f1995e) && !r12.c()) {
                t1.s0 s0Var = this.f1903b0.f1840a;
                if (x0Var.f1995e) {
                    r12.u();
                }
                if (this.A.c()) {
                    if (!x0Var.f1994d) {
                        long j8 = x0Var.f1996g.f2008b;
                        x0Var.f1994d = true;
                        r12.n(this, j8);
                        return;
                    }
                    u0 u0Var = new u0();
                    u0Var.f1969a = this.f1917q0 - x0Var.f2004p;
                    float f = this.J.d().f12004a;
                    w1.a.d(f > 0.0f || f == -3.4028235E38f);
                    u0Var.f1970b = f;
                    long j9 = this.f1909h0;
                    w1.a.d(j9 >= 0 || j9 == -9223372036854775807L);
                    u0Var.f1971c = j9;
                    v0 v0Var = new v0(u0Var);
                    w1.a.j(x0Var.f2001m == null);
                    r12.d(v0Var);
                }
            }
        }
    }

    public final void E() {
        o0 o0Var = this.f1904c0;
        l1 l1Var = this.f1903b0;
        boolean z2 = o0Var.f1872c | (((l1) o0Var.f) != l1Var);
        o0Var.f1872c = z2;
        o0Var.f = l1Var;
        if (z2) {
            j0 j0Var = this.M.f1689v;
            j0Var.F.c(new androidx.fragment.app.d(2, j0Var, o0Var));
            this.f1904c0 = new o0(this.f1903b0);
        }
    }

    public final void F(int i) {
        s1 s1Var = this.f1922v[i];
        try {
            x0 x0Var = this.N.i;
            x0Var.getClass();
            f fVarD = s1Var.d(x0Var);
            fVarD.getClass();
            o2.c1 c1Var = fVarD.D;
            c1Var.getClass();
            c1Var.b();
        } catch (IOException | RuntimeException e7) {
            int i10 = ((f) s1Var.f1965e).f1723w;
            if (i10 != 3 && i10 != 5) {
                throw e7;
            }
            r2.w wVar = this.N.i.f2003o;
            w1.a.p("ExoPlayerImplInternal", "Disabling track due to error: " + t1.o.c(wVar.f11130c[i].k()), e7);
            r2.w wVar2 = new r2.w((r1[]) wVar.f11129b.clone(), (r2.s[]) wVar.f11130c.clone(), wVar.f11131d, wVar.f11132e);
            wVar2.f11129b[i] = null;
            wVar2.f11130c[i] = null;
            h(i);
            x0 x0Var2 = this.N.i;
            x0Var2.a(wVar2, this.f1903b0.f1856s, false, new boolean[x0Var2.f1998j.length]);
        }
    }

    public final void G(int i, boolean z2) {
        boolean[] zArr = this.f1926x;
        if (zArr[i] != z2) {
            zArr[i] = z2;
            this.T.c(new k0(this, i, z2));
        }
    }

    public final void H() throws Throwable {
        v(this.O.c(), true);
    }

    public final void I() {
        this.f1904c0.f(1);
        throw null;
    }

    public final void J() {
        this.f1904c0.f(1);
        O(false, false, false, true);
        this.A.d(this.R);
        m0(this.f1903b0.f1840a.p() ? 4 : 2);
        l1 l1Var = this.f1903b0;
        boolean z2 = l1Var.f1849l;
        y0(this.V.d(l1Var.f1844e, z2), l1Var.f1851n, l1Var.f1850m, z2);
        s2.g gVar = (s2.g) this.B;
        gVar.getClass();
        k1 k1Var = this.O;
        ArrayList arrayList = (ArrayList) k1Var.f1824c;
        w1.a.j(!k1Var.f1822a);
        k1Var.f1831l = gVar;
        for (int i = 0; i < arrayList.size(); i++) {
            j1 j1Var = (j1) arrayList.get(i);
            k1Var.g(j1Var);
            ((HashSet) k1Var.f1828h).add(j1Var);
        }
        k1Var.f1822a = true;
        this.C.e(2);
    }

    public final void K(w1.e eVar) {
        p7.m mVar = this.D;
        w1.x xVar = this.C;
        try {
            O(true, false, true, false);
            L();
            this.A.j(this.R);
            e eVar2 = this.V;
            eVar2.f1710c = null;
            eVar2.a();
            eVar2.c(0);
            this.f1928y.a();
            m0(1);
        } finally {
            xVar.f13747a.removeCallbacksAndMessages(null);
            mVar.c();
            eVar.e();
        }
    }

    public final void L() {
        for (int i = 0; i < this.f1922v.length; i++) {
            f fVar = this.f1924w[i];
            synchronized (fVar.f1722v) {
                fVar.M = null;
            }
            s1 s1Var = this.f1922v[i];
            f fVar2 = (f) s1Var.f1965e;
            w1.a.j(fVar2.C == 0);
            fVar2.r();
            s1Var.f1961a = false;
            f fVar3 = (f) s1Var.f;
            if (fVar3 != null) {
                w1.a.j(fVar3.C == 0);
                fVar3.r();
                s1Var.f1962b = false;
            }
        }
    }

    public final void M(int i, int i10, o2.f1 f1Var) throws Throwable {
        this.f1904c0.f(1);
        k1 k1Var = this.O;
        k1Var.getClass();
        w1.a.d(i >= 0 && i <= i10 && i10 <= ((ArrayList) k1Var.f1824c).size());
        k1Var.f1830k = f1Var;
        k1Var.i(i, i10);
        v(k1Var.c(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N() {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.r0.N():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O(boolean r36, boolean r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.r0.O(boolean, boolean, boolean, boolean):void");
    }

    public final void P() {
        x0 x0Var = this.N.i;
        this.f1907f0 = x0Var != null && x0Var.f1996g.i && this.f1906e0;
    }

    public final void Q(long j8) {
        x0 x0Var = this.N.i;
        long j9 = j8 + (x0Var == null ? 1000000000000L : x0Var.f2004p);
        this.f1917q0 = j9;
        ((v1) this.J.f1834x).c(j9);
        for (s1 s1Var : this.f1922v) {
            long j10 = this.f1917q0;
            f fVarD = s1Var.d(x0Var);
            if (fVarD != null) {
                fVarD.I = false;
                fVarD.G = j10;
                fVarD.H = j10;
                fVarD.q(false, j10);
            }
        }
        for (x0 x0Var2 = r0.i; x0Var2 != null; x0Var2 = x0Var2.f2001m) {
            for (r2.s sVar : x0Var2.f2003o.f11130c) {
                if (sVar != null) {
                    sVar.r();
                }
            }
        }
    }

    public final void R(t1.s0 s0Var, t1.s0 s0Var2) {
        if (s0Var.p() && s0Var2.p()) {
            return;
        }
        ArrayList arrayList = this.K;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            j4.a.r(arrayList.get(size));
            throw null;
        }
    }

    public final void U(long j8) {
        boolean z2 = this.Y;
        long j9 = A0;
        if (z2) {
            this.X.getClass();
            jMin = this.f1903b0.f1844e != 3 ? j9 : 1000L;
            for (s1 s1Var : this.f1922v) {
                long j10 = this.f1917q0;
                long j11 = this.f1918r0;
                f fVar = (f) s1Var.f;
                f fVar2 = (f) s1Var.f1965e;
                long jH = s1.h(fVar2) ? fVar2.h(j10, j11) : Long.MAX_VALUE;
                if (fVar != null && fVar.C != 0) {
                    jH = Math.min(jH, fVar.h(j10, j11));
                }
                jMin = Math.min(jMin, w1.b0.Y(jH));
            }
            if (this.f1903b0.m()) {
                x0 x0Var = this.N.i;
                if ((x0Var != null ? x0Var.f2001m : null) != null) {
                    if ((w1.b0.M(jMin) * this.f1903b0.f1852o.f12004a) + this.f1917q0 >= r1.e()) {
                        jMin = Math.min(jMin, j9);
                    }
                }
            }
        } else if (this.f1903b0.f1844e != 3 || q0()) {
            jMin = j9;
        }
        this.C.f13747a.sendEmptyMessageAtTime(2, j8 + jMin);
    }

    public final void V(boolean z2) {
        o2.d0 d0Var = this.N.i.f1996g.f2007a;
        long jX = X(d0Var, this.f1903b0.f1856s, true, false);
        if (jX != this.f1903b0.f1856s) {
            l1 l1Var = this.f1903b0;
            this.f1903b0 = y(d0Var, jX, l1Var.f1842c, l1Var.f1843d, z2, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:6|(1:8)(4:10|(1:12)(1:13)|14|(3:16|(1:18)|19)(10:20|(1:22)(1:23)|106|24|110|(1:26)(6:29|(3:31|(1:33)|34)(24:36|(8:38|(1:50)(3:44|(1:48)|49)|51|(1:58)|59|60|61|62)(1:63)|102|64|(1:66)(1:67)|113|68|(1:70)(1:71)|72|73|(1:75)(1:76)|77|111|78|79|108|80|81|104|82|83|84|61|62)|97|95|100|101)|35|84|61|62))|9|106|24|110|(0)(0)|35|84|61|62) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:(7:(8:38|(1:50)(3:44|(1:48)|49)|51|(1:58)|59|60|61|62)(1:63)|104|82|83|84|61|62)|102|64|(1:66)(1:67)|113|68|(1:70)(1:71)|72|73|(1:75)(1:76)|77|111|78|79|108|80|81) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
    
        r9 = r2;
        r2 = r6;
        r3 = r11;
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0169, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x016a, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x016b, code lost:
    
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x016d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x016f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0176, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0177, code lost:
    
        r9 = r2;
        r2 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7 A[Catch: all -> 0x00aa, TRY_ENTER, TryCatch #4 {all -> 0x00aa, blocks: (B:26:0x00a7, B:31:0x00b4, B:33:0x00ba, B:34:0x00bd, B:38:0x00d0, B:40:0x00d6, B:44:0x00de, B:48:0x00ec, B:49:0x00f1, B:51:0x00f9, B:53:0x010a, B:59:0x0118), top: B:110:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, o2.b0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W(c2.q0 r18, boolean r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.r0.W(c2.q0, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, o2.b0] */
    public final long X(o2.d0 d0Var, long j8, boolean z2, boolean z10) {
        s1[] s1VarArr;
        u0();
        B0(false, true);
        if (z10 || this.f1903b0.f1844e == 3) {
            m0(2);
        }
        z0 z0Var = this.N;
        x0 x0Var = z0Var.i;
        x0 x0Var2 = x0Var;
        while (x0Var2 != null && !d0Var.equals(x0Var2.f1996g.f2007a)) {
            x0Var2 = x0Var2.f2001m;
        }
        if (z2 || x0Var != x0Var2 || (x0Var2 != null && x0Var2.f2004p + j8 < 0)) {
            int i = 0;
            while (true) {
                s1VarArr = this.f1922v;
                if (i >= s1VarArr.length) {
                    break;
                }
                h(i);
                i++;
            }
            this.f1927x0 = -9223372036854775807L;
            if (x0Var2 != null) {
                while (z0Var.i != x0Var2) {
                    z0Var.a();
                }
                z0Var.n(x0Var2);
                x0Var2.f2004p = 1000000000000L;
                k(new boolean[s1VarArr.length], z0Var.f2024j.e());
                x0Var2.f1997h = true;
            }
        }
        g();
        if (x0Var2 != null) {
            ?? r10 = x0Var2.f1991a;
            z0Var.n(x0Var2);
            if (!x0Var2.f1995e) {
                x0Var2.f1996g = x0Var2.f1996g.b(j8);
            } else if (x0Var2.f) {
                j8 = r10.w(j8);
                r10.i(this.I, j8 - this.H);
            }
            Q(j8);
            C();
        } else {
            z0Var.b();
            Q(j8);
        }
        u(false);
        this.C.e(2);
        return j8;
    }

    public final void Y(o1 o1Var) {
        o1Var.getClass();
        w1.x xVar = this.C;
        if (o1Var.f1879e != this.E) {
            xVar.a(15, o1Var).b();
            return;
        }
        synchronized (o1Var) {
        }
        try {
            o1Var.f1875a.c(o1Var.f1877c, o1Var.f1878d);
            o1Var.a(true);
            int i = this.f1903b0.f1844e;
            if (i == 3 || i == 2) {
                xVar.e(2);
            }
        } catch (Throwable th) {
            o1Var.a(true);
            throw th;
        }
    }

    public final void Z(o1 o1Var) {
        Looper looper = o1Var.f1879e;
        if (looper.getThread().isAlive()) {
            this.L.a(looper, null).c(new androidx.emoji2.text.v(this, o1Var));
        } else {
            w1.a.C("TAG", "Trying to send message on a dead thread.");
            o1Var.a(false);
        }
    }

    @Override // o2.d1
    public final void a(o2.e1 e1Var) {
        this.C.a(9, (o2.b0) e1Var).b();
    }

    public final void a0(t1.c cVar, boolean z2) {
        r2.q qVar = (r2.q) this.f1928y;
        if (!qVar.i.equals(cVar)) {
            qVar.i = cVar;
            qVar.f();
        }
        if (!z2) {
            cVar = null;
        }
        e eVar = this.V;
        if (!Objects.equals(eVar.f1711d, cVar)) {
            eVar.f1711d = cVar;
            int i = cVar == null ? 0 : 1;
            eVar.f = i;
            w1.a.c("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i == 1 || i == 0);
        }
        l1 l1Var = this.f1903b0;
        boolean z10 = l1Var.f1849l;
        y0(eVar.d(l1Var.f1844e, z10), l1Var.f1851n, l1Var.f1850m, z10);
    }

    @Override // u2.v
    public final void b(long j8, long j9, t1.o oVar, MediaFormat mediaFormat) {
        if (this.Z) {
            w1.x xVar = this.C;
            xVar.getClass();
            w1.w wVarB = w1.x.b();
            wVarB.f13745a = xVar.f13747a.obtainMessage(37);
            wVarB.b();
        }
    }

    public final void b0(boolean z2, w1.e eVar) {
        if (this.f1913l0 != z2) {
            this.f1913l0 = z2;
            if (!z2) {
                for (s1 s1Var : this.f1922v) {
                    s1Var.k();
                }
            }
        }
        if (eVar != null) {
            eVar.e();
        }
    }

    public final void c(n0 n0Var, int i) throws Throwable {
        this.f1904c0.f(1);
        k1 k1Var = this.O;
        if (i == -1) {
            i = ((ArrayList) k1Var.f1824c).size();
        }
        v(k1Var.a(i, n0Var.f1863a, n0Var.f1864b), false);
    }

    public final void c0(n0 n0Var) throws Throwable {
        this.f1904c0.f(1);
        int i = n0Var.f1865c;
        o2.f1 f1Var = n0Var.f1864b;
        ArrayList arrayList = n0Var.f1863a;
        if (i != -1) {
            this.f1916p0 = new q0(new q1(arrayList, f1Var), n0Var.f1865c, n0Var.f1866d);
        }
        k1 k1Var = this.O;
        ArrayList arrayList2 = (ArrayList) k1Var.f1824c;
        k1Var.i(0, arrayList2.size());
        v(k1Var.a(arrayList2.size(), arrayList, f1Var), false);
    }

    public final void d() {
        for (s1 s1Var : this.f1922v) {
            t1 t1Var = this.Y ? this.X : null;
            ((f) s1Var.f1965e).c(18, t1Var);
            f fVar = (f) s1Var.f;
            if (fVar != null) {
                fVar.c(18, t1Var);
            }
        }
    }

    public final void d0(boolean z2) {
        this.f1906e0 = z2;
        P();
        if (this.f1907f0) {
            z0 z0Var = this.N;
            if (z0Var.f2024j != z0Var.i) {
                V(true);
                u(false);
            }
        }
    }

    public final boolean e() {
        if (!this.U) {
            return false;
        }
        for (s1 s1Var : this.f1922v) {
            if (s1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void e0(t1.i0 i0Var) {
        this.C.d(16);
        l lVar = this.J;
        lVar.b(i0Var);
        t1.i0 i0VarD = lVar.d();
        x(i0VarD, i0VarD.f12004a, true, true);
    }

    public final void f() {
        N();
        V(true);
    }

    public final void f0(t tVar) {
        this.f1925w0 = tVar;
        t1.s0 s0Var = this.f1903b0.f1840a;
        z0 z0Var = this.N;
        z0Var.getClass();
        tVar.getClass();
        if (z0Var.f2031q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < z0Var.f2031q.size(); i++) {
            ((x0) z0Var.f2031q.get(i)).i();
        }
        z0Var.f2031q = arrayList;
        z0Var.f2027m = null;
        z0Var.k();
    }

    public final void g() {
        f fVar;
        if (this.U && e()) {
            for (s1 s1Var : this.f1922v) {
                int iC = s1Var.c();
                if (s1Var.f()) {
                    int i = s1Var.f1964d;
                    boolean z2 = i == 4 || i == 2;
                    int i10 = i != 4 ? 0 : 1;
                    if (z2) {
                        fVar = (f) s1Var.f1965e;
                    } else {
                        fVar = (f) s1Var.f;
                        fVar.getClass();
                    }
                    s1Var.a(fVar, this.J);
                    s1Var.i(z2);
                    s1Var.f1964d = i10;
                }
                this.o0 -= iC - s1Var.c();
            }
            this.f1927x0 = -9223372036854775807L;
        }
    }

    public final void g0(int i) {
        this.f1911j0 = i;
        t1.s0 s0Var = this.f1903b0.f1840a;
        z0 z0Var = this.N;
        z0Var.f2022g = i;
        int iR = z0Var.r(s0Var);
        if ((iR & 1) != 0) {
            V(true);
        } else if ((iR & 2) != 0) {
            g();
        }
        u(false);
    }

    public final void h(int i) {
        s1[] s1VarArr = this.f1922v;
        int iC = s1VarArr[i].c();
        s1 s1Var = s1VarArr[i];
        f fVar = (f) s1Var.f1965e;
        l lVar = this.J;
        s1Var.a(fVar, lVar);
        f fVar2 = (f) s1Var.f;
        if (fVar2 != null) {
            boolean z2 = (fVar2.C == 0 || s1Var.f1964d == 3) ? false : true;
            s1Var.a(fVar2, lVar);
            s1Var.i(false);
            if (z2) {
                f fVar3 = (f) s1Var.f1965e;
                fVar2.getClass();
                fVar2.c(17, fVar3);
            }
        }
        s1Var.f1964d = 0;
        G(i, false);
        this.o0 -= iC;
    }

    public final void h0(boolean z2) throws Throwable {
        if (!z2) {
            this.Z = false;
            this.C.d(37);
            q0 q0Var = this.f1902a0;
            if (q0Var != null) {
                W(q0Var, false);
                this.f1902a0 = null;
            }
        }
        this.Y = z2;
        d();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        int i10;
        x0 x0Var;
        o2.d0 d0Var;
        x0 x0Var2;
        try {
            switch (message.what) {
                case 1:
                    boolean z2 = message.arg1 != 0;
                    int i11 = message.arg2;
                    this.f1904c0.f(1);
                    y0(this.V.d(this.f1903b0.f1844e, z2), i11 >> 4, i11 & 15, z2);
                    break;
                case 2:
                    i();
                    break;
                case 3:
                    W((q0) message.obj, true);
                    break;
                case g1.g.LONG_FIELD_NUMBER /* 4 */:
                    e0((t1.i0) message.obj);
                    break;
                case g1.g.STRING_FIELD_NUMBER /* 5 */:
                    j0((u1) message.obj);
                    break;
                case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    t0(false, true);
                    break;
                case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    K((w1.e) message.obj);
                    return true;
                case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                    w((o2.b0) message.obj);
                    break;
                case 9:
                    r((o2.b0) message.obj);
                    break;
                case 10:
                    N();
                    break;
                case 11:
                    g0(message.arg1);
                    break;
                case 12:
                    k0(message.arg1 != 0);
                    break;
                case 13:
                    b0(message.arg1 != 0, (w1.e) message.obj);
                    break;
                case 14:
                    Y((o1) message.obj);
                    break;
                case 15:
                    Z((o1) message.obj);
                    break;
                case 16:
                    t1.i0 i0Var = (t1.i0) message.obj;
                    x(i0Var, i0Var.f12004a, true, false);
                    break;
                case 17:
                    c0((n0) message.obj);
                    break;
                case 18:
                    c((n0) message.obj, message.arg1);
                    break;
                case 19:
                    j4.a.r(message.obj);
                    I();
                    throw null;
                case 20:
                    M(message.arg1, message.arg2, (o2.f1) message.obj);
                    break;
                case 21:
                    l0((o2.f1) message.obj);
                    break;
                case 22:
                    H();
                    break;
                case 23:
                    d0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    f();
                    break;
                case 26:
                    N();
                    V(true);
                    break;
                case 27:
                    x0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    f0((t) message.obj);
                    break;
                case 29:
                    J();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    o0(pair.first, (w1.e) pair.second);
                    break;
                case 31:
                    a0((t1.c) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    p0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    p(message.arg1);
                    break;
                case 34:
                    q();
                    break;
                case 35:
                    n0((u2.v) message.obj);
                    break;
                case 36:
                    h0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.Z = false;
                    q0 q0Var = this.f1902a0;
                    if (q0Var != null) {
                        W(q0Var, false);
                        this.f1902a0 = null;
                    }
                    break;
                case 38:
                    i0((t1) message.obj);
                    break;
            }
        } catch (o e7) {
            e = e7;
            int i12 = e.f1867x;
            z0 z0Var = this.N;
            if (i12 == 1 && (x0Var2 = z0Var.f2024j) != null && e.C == null) {
                e = e.a(x0Var2.f1996g.f2007a);
            }
            int i13 = e.f1867x;
            w1.x xVar = this.C;
            if (i13 == 1 && (d0Var = e.C) != null && A(e.f1869z, d0Var)) {
                this.f1929y0 = true;
                g();
                x0 x0VarG = z0Var.g();
                x0 x0Var3 = z0Var.i;
                if (x0Var3 != x0VarG) {
                    while (x0Var3 != null) {
                        x0 x0Var4 = x0Var3.f2001m;
                        if (x0Var4 == x0VarG) {
                            break;
                        }
                        x0Var3 = x0Var4;
                    }
                }
                z0Var.n(x0Var3);
                if (this.f1903b0.f1844e != 4) {
                    C();
                    xVar.e(2);
                }
            } else {
                o oVar = this.f1921u0;
                if (oVar != null) {
                    oVar.addSuppressed(e);
                    e = this.f1921u0;
                }
                if (e.f1867x == 1 && z0Var.i != z0Var.f2024j) {
                    while (true) {
                        x0Var = z0Var.i;
                        if (x0Var == z0Var.f2024j) {
                            break;
                        }
                        z0Var.a();
                    }
                    w1.a.h(x0Var);
                    E();
                    y0 y0Var = x0Var.f1996g;
                    o2.d0 d0Var2 = y0Var.f2007a;
                    long j8 = y0Var.f2008b;
                    this.f1903b0 = y(d0Var2, j8, y0Var.f2009c, j8, true, 0);
                }
                if (e.D && (this.f1921u0 == null || (i10 = e.f12000v) == 5004 || i10 == 5003)) {
                    w1.a.D("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f1921u0 == null) {
                        this.f1921u0 = e;
                    }
                    w1.w wVarA = xVar.a(25, e);
                    Handler handler = xVar.f13747a;
                    Message message2 = wVarA.f13745a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    wVarA.a();
                } else {
                    w1.a.p("ExoPlayerImplInternal", "Playback error", e);
                    t0(true, false);
                    this.f1903b0 = this.f1903b0.f(e);
                }
            }
        } catch (h2.g e10) {
            t(e10, e10.f6089v);
        } catch (y1.i e11) {
            t(e11, e11.f14371v);
        } catch (IOException e12) {
            t(e12, 2000);
        } catch (RuntimeException e13) {
            o oVar2 = new o(2, e13, ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) ? 1004 : 1000);
            w1.a.p("ExoPlayerImplInternal", "Playback error", oVar2);
            t0(true, false);
            this.f1903b0 = this.f1903b0.f(oVar2);
        } catch (o2.b e14) {
            t(e14, 1002);
        } catch (t1.g0 e15) {
            boolean z10 = e15.f11995v;
            int i14 = e15.f11996w;
            if (i14 == 1) {
                i = z10 ? 3001 : 3003;
            } else {
                if (i14 == 4) {
                    i = z10 ? 3002 : 3004;
                }
                t(e15, i);
            }
            i = i;
            t(e15, i);
        }
        E();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0890  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0897  */
    /* JADX WARN: Type inference failed for: r1v74, types: [java.lang.Object, o2.b0] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, o2.b0] */
    /* JADX WARN: Type inference failed for: r2v70, types: [java.lang.Object, o2.b0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, o2.b0] */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object, o2.b0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instruction units count: 2244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.r0.i():void");
    }

    public final void i0(t1 t1Var) {
        this.X = t1Var;
        d();
    }

    public final void j(x0 x0Var, int i, boolean z2, long j8) {
        s1 s1Var = this.f1922v[i];
        boolean zG = s1Var.g();
        f fVar = (f) s1Var.f1965e;
        if (zG) {
            return;
        }
        boolean z10 = x0Var == this.N.i;
        r2.w wVar = x0Var.f2003o;
        r1 r1Var = wVar.f11129b[i];
        r2.s sVar = wVar.f11130c[i];
        boolean z11 = q0() && this.f1903b0.f1844e == 3;
        boolean z12 = !z2 && z11;
        this.o0++;
        o2.c1 c1Var = x0Var.f1993c[i];
        long j9 = x0Var.f2004p;
        o2.d0 d0Var = x0Var.f1996g.f2007a;
        f fVar2 = (f) s1Var.f;
        int length = sVar != null ? sVar.length() : 0;
        t1.o[] oVarArr = new t1.o[length];
        for (int i10 = 0; i10 < length; i10++) {
            sVar.getClass();
            oVarArr[i10] = sVar.c(i10);
        }
        int i11 = s1Var.f1964d;
        l lVar = this.J;
        if (i11 == 0 || i11 == 2 || i11 == 4) {
            s1Var.f1961a = true;
            w1.a.j(fVar.C == 0);
            fVar.f1725y = r1Var;
            fVar.L = d0Var;
            fVar.C = 1;
            fVar.p(z12, z10);
            fVar.y(oVarArr, c1Var, j8, j9, d0Var);
            fVar.I = false;
            fVar.G = j8;
            fVar.H = j8;
            fVar.q(z12, j8);
            lVar.c(fVar);
        } else {
            s1Var.f1962b = true;
            fVar2.getClass();
            w1.a.j(fVar2.C == 0);
            fVar2.f1725y = r1Var;
            fVar2.L = d0Var;
            fVar2.C = 1;
            fVar2.p(z12, z10);
            fVar2.y(oVarArr, c1Var, j8, j9, d0Var);
            fVar2.I = false;
            fVar2.G = j8;
            fVar2.H = j8;
            fVar2.q(z12, j8);
            lVar.c(fVar2);
        }
        m0 m0Var = new m0(this);
        f fVarD = s1Var.d(x0Var);
        fVarD.getClass();
        fVarD.c(11, m0Var);
        if (z11 && z10) {
            s1Var.m();
        }
    }

    public final void j0(u1 u1Var) {
        this.W = u1Var;
    }

    public final void k(boolean[] zArr, long j8) {
        s1[] s1VarArr;
        long j9;
        x0 x0Var = this.N.f2024j;
        r2.w wVar = x0Var.f2003o;
        int i = 0;
        while (true) {
            s1VarArr = this.f1922v;
            if (i >= s1VarArr.length) {
                break;
            }
            if (!wVar.b(i)) {
                s1VarArr[i].k();
            }
            i++;
        }
        int i10 = 0;
        while (i10 < s1VarArr.length) {
            if (wVar.b(i10) && s1VarArr[i10].d(x0Var) == null) {
                j9 = j8;
                j(x0Var, i10, zArr[i10], j9);
            } else {
                j9 = j8;
            }
            i10++;
            j8 = j9;
        }
    }

    public final void k0(boolean z2) {
        this.f1912k0 = z2;
        t1.s0 s0Var = this.f1903b0.f1840a;
        z0 z0Var = this.N;
        z0Var.f2023h = z2;
        int iR = z0Var.r(s0Var);
        if ((iR & 1) != 0) {
            V(true);
        } else if ((iR & 2) != 0) {
            g();
        }
        u(false);
    }

    public final long l(t1.s0 s0Var, Object obj, long j8) {
        t1.q0 q0Var = this.G;
        int i = s0Var.g(obj, q0Var).f12088c;
        t1.r0 r0Var = this.F;
        s0Var.n(i, r0Var);
        if (r0Var.f != -9223372036854775807L && r0Var.a() && r0Var.i) {
            return w1.b0.M(w1.b0.x(r0Var.f12100g) - r0Var.f) - (j8 + q0Var.f12090e);
        }
        return -9223372036854775807L;
    }

    public final void l0(o2.f1 f1Var) throws Throwable {
        this.f1904c0.f(1);
        k1 k1Var = this.O;
        int size = ((ArrayList) k1Var.f1824c).size();
        if (f1Var.f9421b.length != size) {
            f1Var = new o2.f1(new Random(f1Var.f9420a.nextLong())).a(size);
        }
        k1Var.f1830k = f1Var;
        v(k1Var.c(), false);
    }

    public final long m(x0 x0Var) {
        if (x0Var == null) {
            return 0L;
        }
        long jMax = x0Var.f2004p;
        if (!x0Var.f1995e) {
            return jMax;
        }
        int i = 0;
        while (true) {
            s1[] s1VarArr = this.f1922v;
            if (i >= s1VarArr.length) {
                return jMax;
            }
            if (s1VarArr[i].d(x0Var) != null) {
                f fVarD = s1VarArr[i].d(x0Var);
                Objects.requireNonNull(fVarD);
                long j8 = fVarD.H;
                if (j8 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(j8, jMax);
            }
            i++;
        }
    }

    public final void m0(int i) {
        l1 l1Var = this.f1903b0;
        if (l1Var.f1844e != i) {
            if (i != 2) {
                this.f1923v0 = -9223372036854775807L;
            }
            if (i != 3 && l1Var.f1853p) {
                this.f1903b0 = l1Var.i(false);
            }
            this.f1903b0 = this.f1903b0.h(i);
        }
    }

    public final Pair n(t1.s0 s0Var) {
        long j8 = 0;
        if (s0Var.p()) {
            return Pair.create(l1.f1839u, 0L);
        }
        int iA = s0Var.a(this.f1912k0);
        Pair pairI = s0Var.i(this.F, this.G, iA, -9223372036854775807L);
        o2.d0 d0VarP = this.N.p(s0Var, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (d0VarP.b()) {
            Object obj = d0VarP.f9404a;
            t1.q0 q0Var = this.G;
            s0Var.g(obj, q0Var);
            if (d0VarP.f9406c == q0Var.e(d0VarP.f9405b)) {
                q0Var.f12091g.getClass();
            }
        } else {
            j8 = jLongValue;
        }
        return Pair.create(d0VarP, Long.valueOf(j8));
    }

    public final void n0(u2.v vVar) {
        for (s1 s1Var : this.f1922v) {
            f fVar = (f) s1Var.f1965e;
            if (fVar.f1723w == 2) {
                fVar.c(7, vVar);
                f fVar2 = (f) s1Var.f;
                if (fVar2 != null) {
                    fVar2.c(7, vVar);
                }
            }
        }
    }

    public final long o(long j8) {
        x0 x0Var = this.N.f2026l;
        if (x0Var == null) {
            return 0L;
        }
        return Math.max(0L, j8 - (this.f1917q0 - x0Var.f2004p));
    }

    public final void o0(Object obj, w1.e eVar) {
        for (s1 s1Var : this.f1922v) {
            f fVar = (f) s1Var.f1965e;
            if (fVar.f1723w == 2) {
                int i = s1Var.f1964d;
                if (i == 4 || i == 1) {
                    f fVar2 = (f) s1Var.f;
                    fVar2.getClass();
                    fVar2.c(1, obj);
                } else {
                    fVar.c(1, obj);
                }
            }
        }
        int i10 = this.f1903b0.f1844e;
        if (i10 == 3 || i10 == 2) {
            this.C.e(2);
        }
        if (eVar != null) {
            eVar.e();
        }
    }

    public final void p(int i) {
        l1 l1Var = this.f1903b0;
        y0(i, l1Var.f1851n, l1Var.f1850m, l1Var.f1849l);
    }

    public final void p0(float f) {
        this.f1931z0 = f;
        float f4 = f * this.V.f1713g;
        for (s1 s1Var : this.f1922v) {
            f fVar = (f) s1Var.f1965e;
            if (fVar.f1723w == 1) {
                fVar.c(2, Float.valueOf(f4));
                f fVar2 = (f) s1Var.f;
                if (fVar2 != null) {
                    fVar2.c(2, Float.valueOf(f4));
                }
            }
        }
    }

    public final void q() {
        p0(this.f1931z0);
    }

    public final boolean q0() {
        l1 l1Var = this.f1903b0;
        return l1Var.f1849l && l1Var.f1851n == 0;
    }

    public final void r(o2.b0 b0Var) {
        z0 z0Var = this.N;
        x0 x0Var = z0Var.f2026l;
        if (x0Var != null && x0Var.f1991a == b0Var) {
            z0Var.m(this.f1917q0);
            C();
            return;
        }
        x0 x0Var2 = z0Var.f2027m;
        if (x0Var2 == null || x0Var2.f1991a != b0Var) {
            return;
        }
        D();
    }

    public final boolean r0(t1.s0 s0Var, o2.d0 d0Var) {
        if (d0Var.b() || s0Var.p()) {
            return false;
        }
        int i = s0Var.g(d0Var.f9404a, this.G).f12088c;
        t1.r0 r0Var = this.F;
        s0Var.n(i, r0Var);
        return r0Var.a() && r0Var.i && r0Var.f != -9223372036854775807L;
    }

    @Override // o2.a0
    public final void s(o2.b0 b0Var) {
        this.C.a(8, b0Var).b();
    }

    public final void s0() {
        x0 x0Var = this.N.i;
        if (x0Var == null) {
            return;
        }
        r2.w wVar = x0Var.f2003o;
        int i = 0;
        while (true) {
            s1[] s1VarArr = this.f1922v;
            if (i >= s1VarArr.length) {
                return;
            }
            if (wVar.b(i)) {
                s1VarArr[i].m();
            }
            i++;
        }
    }

    public final void t(IOException iOException, int i) {
        o oVar = new o(0, iOException, i);
        x0 x0Var = this.N.i;
        if (x0Var != null) {
            oVar = oVar.a(x0Var.f1996g.f2007a);
        }
        w1.a.p("ExoPlayerImplInternal", "Playback error", oVar);
        t0(false, false);
        this.f1903b0 = this.f1903b0.f(oVar);
    }

    public final void t0(boolean z2, boolean z10) {
        O(z2 || !this.f1913l0, false, true, false);
        this.f1904c0.f(z10 ? 1 : 0);
        this.A.b(this.R);
        this.V.d(1, this.f1903b0.f1849l);
        m0(1);
    }

    public final void u(boolean z2) {
        x0 x0Var = this.N.f2026l;
        o2.d0 d0Var = x0Var == null ? this.f1903b0.f1841b : x0Var.f1996g.f2007a;
        boolean zEquals = this.f1903b0.f1848k.equals(d0Var);
        if (!zEquals) {
            this.f1903b0 = this.f1903b0.c(d0Var);
        }
        l1 l1Var = this.f1903b0;
        l1Var.f1854q = x0Var == null ? l1Var.f1856s : x0Var.d();
        l1 l1Var2 = this.f1903b0;
        l1Var2.f1855r = o(l1Var2.f1854q);
        if ((!zEquals || z2) && x0Var != null && x0Var.f1995e) {
            w0(x0Var.f2002n, x0Var.f2003o);
        }
    }

    public final void u0() {
        l lVar = this.J;
        lVar.f1833w = false;
        v1 v1Var = (v1) lVar.f1834x;
        if (v1Var.f1982w) {
            v1Var.c(v1Var.e());
            v1Var.f1982w = false;
        }
        for (s1 s1Var : this.f1922v) {
            f fVar = (f) s1Var.f;
            f fVar2 = (f) s1Var.f1965e;
            if (s1.h(fVar2)) {
                s1.b(fVar2);
            }
            if (fVar != null && fVar.C != 0) {
                s1.b(fVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0436  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [t1.s0] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v16 */
    /* JADX WARN: Type inference failed for: r25v17 */
    /* JADX WARN: Type inference failed for: r25v19 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v20 */
    /* JADX WARN: Type inference failed for: r25v21 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r2v10, types: [t1.s0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [c2.l1] */
    /* JADX WARN: Type inference failed for: r2v35, types: [c2.z0] */
    /* JADX WARN: Type inference failed for: r35v0, types: [c2.r0] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v25, types: [t1.s0] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(t1.s0 r36, boolean r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1091
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.r0.v(t1.s0, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, o2.e1] */
    public final void v0() {
        x0 x0Var = this.N.f2026l;
        boolean z2 = this.f1910i0 || (x0Var != null && x0Var.f1991a.c());
        l1 l1Var = this.f1903b0;
        if (z2 != l1Var.f1845g) {
            this.f1903b0 = l1Var.b(z2);
        }
    }

    public final void w(o2.b0 b0Var) {
        x0 x0Var;
        z0 z0Var = this.N;
        x0 x0Var2 = z0Var.f2026l;
        l lVar = this.J;
        if (x0Var2 != null && x0Var2.f1991a == b0Var) {
            x0Var2.getClass();
            if (!x0Var2.f1995e) {
                float f = lVar.d().f12004a;
                l1 l1Var = this.f1903b0;
                x0Var2.f(f, l1Var.f1840a, l1Var.f1849l);
            }
            w0(x0Var2.f2002n, x0Var2.f2003o);
            if (x0Var2 == z0Var.i) {
                Q(x0Var2.f1996g.f2008b);
                k(new boolean[this.f1922v.length], z0Var.f2024j.e());
                x0Var2.f1997h = true;
                l1 l1Var2 = this.f1903b0;
                o2.d0 d0Var = l1Var2.f1841b;
                long j8 = x0Var2.f1996g.f2008b;
                this.f1903b0 = y(d0Var, j8, l1Var2.f1842c, j8, false, 5);
            }
            C();
            return;
        }
        int i = 0;
        while (true) {
            if (i >= z0Var.f2031q.size()) {
                x0Var = null;
                break;
            }
            x0Var = (x0) z0Var.f2031q.get(i);
            if (x0Var.f1991a == b0Var) {
                break;
            } else {
                i++;
            }
        }
        if (x0Var != null) {
            w1.a.j(true ^ x0Var.f1995e);
            float f4 = lVar.d().f12004a;
            l1 l1Var3 = this.f1903b0;
            x0Var.f(f4, l1Var3.f1840a, l1Var3.f1849l);
            x0 x0Var3 = z0Var.f2027m;
            if (x0Var3 == null || x0Var3.f1991a != b0Var) {
                return;
            }
            D();
        }
    }

    public final void w0(o2.j1 j1Var, r2.w wVar) {
        x0 x0Var = this.N.f2026l;
        x0Var.getClass();
        long jO = o(x0Var.d());
        long j8 = r0(this.f1903b0.f1840a, x0Var.f1996g.f2007a) ? this.P.f1766h : -9223372036854775807L;
        t1.s0 s0Var = this.f1903b0.f1840a;
        float f = this.J.d().f12004a;
        boolean z2 = this.f1903b0.f1849l;
        this.A.h(new s0(this.R, jO, f, this.f1908g0, j8), wVar.f11130c);
    }

    public final void x(t1.i0 i0Var, float f, boolean z2, boolean z10) {
        int i;
        if (z2) {
            if (z10) {
                this.f1904c0.f(1);
            }
            this.f1903b0 = this.f1903b0.g(i0Var);
        }
        float f4 = i0Var.f12004a;
        x0 x0Var = this.N.i;
        while (true) {
            i = 0;
            if (x0Var == null) {
                break;
            }
            r2.s[] sVarArr = x0Var.f2003o.f11130c;
            int length = sVarArr.length;
            while (i < length) {
                r2.s sVar = sVarArr[i];
                if (sVar != null) {
                    sVar.p(f4);
                }
                i++;
            }
            x0Var = x0Var.f2001m;
        }
        s1[] s1VarArr = this.f1922v;
        int length2 = s1VarArr.length;
        while (i < length2) {
            s1 s1Var = s1VarArr[i];
            float f10 = i0Var.f12004a;
            ((f) s1Var.f1965e).z(f, f10);
            f fVar = (f) s1Var.f;
            if (fVar != null) {
                fVar.z(f, f10);
            }
            i++;
        }
    }

    public final void x0(int i, int i10, List list) throws Throwable {
        this.f1904c0.f(1);
        k1 k1Var = this.O;
        k1Var.getClass();
        ArrayList arrayList = (ArrayList) k1Var.f1824c;
        w1.a.d(i >= 0 && i <= i10 && i10 <= arrayList.size());
        w1.a.d(list.size() == i10 - i);
        for (int i11 = i; i11 < i10; i11++) {
            ((j1) arrayList.get(i11)).f1807a.s((t1.z) list.get(i11 - i));
        }
        v(k1Var.c(), false);
    }

    public final l1 y(o2.d0 d0Var, long j8, long j9, long j10, boolean z2, int i) {
        y9.z0 z0VarG;
        boolean z10;
        this.f1920t0 = (!this.f1920t0 && j8 == this.f1903b0.f1856s && d0Var.equals(this.f1903b0.f1841b)) ? false : true;
        P();
        l1 l1Var = this.f1903b0;
        o2.j1 j1Var = l1Var.f1846h;
        r2.w wVar = l1Var.i;
        List list = l1Var.f1847j;
        if (this.O.f1822a) {
            x0 x0Var = this.N.i;
            j1Var = x0Var == null ? o2.j1.f9467d : x0Var.f2002n;
            wVar = x0Var == null ? this.f1930z : x0Var.f2003o;
            r2.s[] sVarArr = wVar.f11130c;
            y9.b0 b0Var = new y9.b0(4);
            boolean z11 = false;
            for (r2.s sVar : sVarArr) {
                if (sVar != null) {
                    t1.e0 e0Var = sVar.c(0).f12059l;
                    if (e0Var == null) {
                        b0Var.a(new t1.e0(new t1.d0[0]));
                    } else {
                        b0Var.a(e0Var);
                        z11 = true;
                    }
                }
            }
            if (z11) {
                z0VarG = b0Var.g();
            } else {
                y9.c0 c0Var = y9.f0.f14553w;
                z0VarG = y9.z0.f14637z;
            }
            list = z0VarG;
            if (x0Var != null) {
                y0 y0Var = x0Var.f1996g;
                if (y0Var.f2009c != j9) {
                    x0Var.f1996g = y0Var.a(j9);
                }
            }
            s1[] s1VarArr = this.f1922v;
            z0 z0Var = this.N;
            x0 x0Var2 = z0Var.i;
            if (x0Var2 == z0Var.f2024j && x0Var2 != null) {
                r2.w wVar2 = x0Var2.f2003o;
                int i10 = 0;
                boolean z12 = false;
                while (true) {
                    if (i10 >= s1VarArr.length) {
                        z10 = true;
                        break;
                    }
                    if (wVar2.b(i10)) {
                        if (((f) s1VarArr[i10].f1965e).f1723w != 1) {
                            z10 = false;
                            break;
                        }
                        if (wVar2.f11129b[i10].f1933a != 0) {
                            z12 = true;
                        }
                    }
                    i10++;
                }
                boolean z13 = z12 && z10;
                if (z13 != this.f1915n0) {
                    this.f1915n0 = z13;
                    if (!z13 && this.f1903b0.f1853p) {
                        this.C.e(2);
                    }
                }
            }
        } else if (!d0Var.equals(l1Var.f1841b)) {
            j1Var = o2.j1.f9467d;
            wVar = this.f1930z;
            list = y9.z0.f14637z;
        }
        o2.j1 j1Var2 = j1Var;
        r2.w wVar3 = wVar;
        List list2 = list;
        if (z2) {
            o0 o0Var = this.f1904c0;
            if (!o0Var.f1873d || o0Var.f1874e == 5) {
                o0Var.f1872c = true;
                o0Var.f1873d = true;
                o0Var.f1874e = i;
            } else {
                w1.a.d(i == 5);
            }
        }
        l1 l1Var2 = this.f1903b0;
        return l1Var2.d(d0Var, j8, j9, j10, o(l1Var2.f1854q), j1Var2, wVar3, list2);
    }

    public final void y0(int i, int i10, int i11, boolean z2) {
        boolean z10 = z2 && i != -1;
        if (i == -1) {
            i11 = 2;
        } else if (i11 == 2) {
            i11 = 1;
        }
        if (i == 0) {
            i10 = 1;
        } else if (i10 == 1) {
            i10 = 0;
        }
        l1 l1Var = this.f1903b0;
        if (l1Var.f1849l == z10 && l1Var.f1851n == i10 && l1Var.f1850m == i11) {
            return;
        }
        this.f1903b0 = l1Var.e(i11, i10, z10);
        B0(false, false);
        z0 z0Var = this.N;
        for (x0 x0Var = z0Var.i; x0Var != null; x0Var = x0Var.f2001m) {
            for (r2.s sVar : x0Var.f2003o.f11130c) {
                if (sVar != null) {
                    sVar.a(z10);
                }
            }
        }
        if (!q0()) {
            u0();
            z0();
            l1 l1Var2 = this.f1903b0;
            if (l1Var2.f1853p) {
                this.f1903b0 = l1Var2.i(false);
            }
            z0Var.m(this.f1917q0);
            return;
        }
        int i12 = this.f1903b0.f1844e;
        w1.x xVar = this.C;
        if (i12 != 3) {
            if (i12 == 2) {
                xVar.e(2);
            }
        } else {
            l lVar = this.J;
            lVar.f1833w = true;
            ((v1) lVar.f1834x).f();
            s0();
            xVar.e(2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, o2.b0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z0() {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.r0.z0():void");
    }
}
