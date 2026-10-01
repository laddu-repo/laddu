package a2;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.unity3d.services.UnityAdsConstants;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w0 implements Handler.Callback, q2.z, t1, w2.v {
    public static final long B0 = u1.a0.e0(10000);
    public final t2.v A;
    public float A0;
    public final t2.w B;
    public final l C;
    public final u2.d D;
    public final u1.x E;
    public final s8.n F;
    public final Looper G;
    public final r1.c1 H;
    public final r1.a1 I;
    public final long J;
    public final m K;
    public final ArrayList L;
    public final u1.v M;
    public final b0 N;
    public final f1 O;
    public final r1 P;
    public final j Q;
    public final long R;
    public final b2.m S;
    public final b2.f T;
    public final u1.x U;
    public final boolean V;
    public final f W;
    public c2 X;
    public b2 Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f458a0;

    /* renamed from: b0, reason: collision with root package name */
    public v0 f459b0;

    /* renamed from: c0, reason: collision with root package name */
    public s1 f460c0;

    /* renamed from: d0, reason: collision with root package name */
    public t0 f461d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f462e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f463f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f464g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f465h0;

    /* renamed from: i0, reason: collision with root package name */
    public long f466i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f467j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f468k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f469l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f470m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f471n0;
    public boolean o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f472p0;

    /* renamed from: q0, reason: collision with root package name */
    public v0 f473q0;

    /* renamed from: r0, reason: collision with root package name */
    public long f474r0;

    /* renamed from: s0, reason: collision with root package name */
    public long f475s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f476t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f477u0;

    /* renamed from: v0, reason: collision with root package name */
    public q f478v0;

    /* renamed from: w0, reason: collision with root package name */
    public long f479w0;

    /* renamed from: x, reason: collision with root package name */
    public final z1[] f480x;

    /* renamed from: x0, reason: collision with root package name */
    public v f481x0;

    /* renamed from: y, reason: collision with root package name */
    public final g[] f482y;

    /* renamed from: y0, reason: collision with root package name */
    public long f483y0;

    /* renamed from: z, reason: collision with root package name */
    public final boolean[] f484z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f485z0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, a2.z1] */
    public w0(Context context, g[] gVarArr, g[] gVarArr2, t2.v vVar, t2.w wVar, l lVar, u2.d dVar, int i6, boolean z10, b2.f fVar, c2 c2Var, j jVar, long j, Looper looper, u1.v vVar2, b0 b0Var, b2.m mVar, final w2.v vVar3) {
        v vVar4 = v.f445a;
        this.f483y0 = -9223372036854775807L;
        this.N = b0Var;
        this.A = vVar;
        this.B = wVar;
        this.C = lVar;
        this.D = dVar;
        this.f468k0 = i6;
        this.f469l0 = z10;
        this.X = c2Var;
        this.Q = jVar;
        this.R = j;
        this.f463f0 = false;
        this.M = vVar2;
        this.S = mVar;
        this.f481x0 = vVar4;
        this.T = fVar;
        this.A0 = 1.0f;
        this.Y = b2.f168b;
        this.f479w0 = -9223372036854775807L;
        this.f466i0 = -9223372036854775807L;
        this.J = lVar.f305g;
        r1.z0 z0Var = r1.d1.f11368a;
        s1 k8 = s1.k(wVar);
        this.f460c0 = k8;
        this.f461d0 = new t0(k8);
        this.f482y = new g[gVarArr.length];
        this.f484z = new boolean[gVarArr.length];
        t2.q qVar = (t2.q) vVar;
        qVar.getClass();
        this.f480x = new z1[gVarArr.length];
        boolean z11 = false;
        for (int i10 = 0; i10 < gVarArr.length; i10++) {
            g gVar = gVarArr[i10];
            gVar.B = i10;
            gVar.C = mVar;
            gVar.D = vVar2;
            this.f482y[i10] = gVar;
            g gVar2 = this.f482y[i10];
            synchronized (gVar2.f244x) {
                gVar2.O = qVar;
            }
            g gVar3 = gVarArr2[i10];
            if (gVar3 != null) {
                gVar3.B = i10;
                gVar3.C = mVar;
                gVar3.D = vVar2;
                z11 = true;
            }
            z1[] z1VarArr = this.f480x;
            g gVar4 = gVarArr[i10];
            ?? obj = new Object();
            obj.f516e = gVar4;
            obj.f514c = i10;
            obj.f517f = gVar3;
            obj.f515d = 0;
            obj.f512a = false;
            obj.f513b = false;
            z1VarArr[i10] = obj;
        }
        this.V = z11;
        this.K = new m(this, vVar2);
        this.L = new ArrayList();
        this.H = new r1.c1();
        this.I = new r1.a1();
        u1.c.g(vVar.f12560a == null);
        vVar.f12560a = this;
        vVar.f12561b = dVar;
        this.f477u0 = true;
        u1.x a10 = vVar2.a(looper, null);
        this.U = a10;
        this.O = new f1(fVar, a10, new e0(this, 5));
        this.P = new r1(this, fVar, a10, mVar);
        s8.n nVar = new s8.n();
        this.F = nVar;
        Looper g10 = nVar.g();
        this.G = g10;
        u1.x a11 = vVar2.a(g10, this);
        this.E = a11;
        this.W = new f(context, g10, this);
        a11.a(35, new w2.v() { // from class: a2.p0
            @Override // w2.v
            public final void c(long j10, long j11, r1.q qVar2, MediaFormat mediaFormat) {
                w0 w0Var = w0.this;
                w0Var.getClass();
                vVar3.c(j10, j11, qVar2, mediaFormat);
                w0Var.c(j10, j11, qVar2, mediaFormat);
            }
        }).b();
    }

    public static Pair S(r1.d1 d1Var, v0 v0Var, boolean z10, int i6, boolean z11, r1.c1 c1Var, r1.a1 a1Var) {
        r1.d1 d1Var2;
        int T;
        r1.d1 d1Var3 = v0Var.f446a;
        if (!d1Var.p()) {
            if (d1Var3.p()) {
                d1Var2 = d1Var;
            } else {
                d1Var2 = d1Var3;
            }
            try {
                Pair i10 = d1Var2.i(c1Var, a1Var, v0Var.f447b, v0Var.f448c);
                if (!d1Var.equals(d1Var2)) {
                    if (d1Var.b(i10.first) != -1) {
                        if (d1Var2.g(i10.first, a1Var).f11300f && d1Var2.m(a1Var.f11297c, c1Var, 0L).f11339n == d1Var2.b(i10.first)) {
                            return d1Var.i(c1Var, a1Var, d1Var.g(i10.first, a1Var).f11297c, v0Var.f448c);
                        }
                    } else {
                        if (z10 && (T = T(c1Var, a1Var, i6, z11, i10.first, d1Var2, d1Var)) != -1) {
                            return d1Var.i(c1Var, a1Var, T, -9223372036854775807L);
                        }
                        return null;
                    }
                }
                return i10;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return null;
    }

    public static int T(r1.c1 c1Var, r1.a1 a1Var, int i6, boolean z10, Object obj, r1.d1 d1Var, r1.d1 d1Var2) {
        r1.c1 c1Var2 = c1Var;
        r1.d1 d1Var3 = d1Var;
        Object obj2 = d1Var3.m(d1Var3.g(obj, a1Var).f11297c, c1Var, 0L).f11327a;
        for (int i10 = 0; i10 < d1Var2.o(); i10++) {
            if (d1Var2.m(i10, c1Var, 0L).f11327a.equals(obj2)) {
                return i10;
            }
        }
        int b10 = d1Var3.b(obj);
        int h4 = d1Var3.h();
        int i11 = 0;
        int i12 = -1;
        while (i11 < h4 && i12 == -1) {
            r1.d1 d1Var4 = d1Var3;
            int d10 = d1Var4.d(b10, a1Var, c1Var2, i6, z10);
            if (d10 == -1) {
                break;
            }
            i12 = d1Var2.b(d1Var4.l(d10));
            i11++;
            d1Var3 = d1Var4;
            b10 = d10;
            c1Var2 = c1Var;
        }
        if (i12 == -1) {
            return -1;
        }
        return d1Var2.f(i12, a1Var, false).f11297c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [q2.b1, q2.a0, java.lang.Object] */
    public static boolean z(c1 c1Var) {
        long e10;
        if (c1Var != null) {
            try {
                ?? r12 = c1Var.f176a;
                if (!c1Var.f180e) {
                    r12.g();
                } else {
                    for (q2.z0 z0Var : c1Var.f178c) {
                        if (z0Var != null) {
                            z0Var.b();
                        }
                    }
                }
                if (!c1Var.f180e) {
                    e10 = 0;
                } else {
                    e10 = r12.e();
                }
                if (e10 != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A(int i6, q2.c0 c0Var) {
        boolean z10;
        boolean z11;
        f1 f1Var = this.O;
        c1 c1Var = f1Var.f237k;
        if (c1Var != null && c1Var.f182g.f197a.equals(c0Var)) {
            z1 z1Var = this.f480x[i6];
            c1 c1Var2 = f1Var.f237k;
            int i10 = z1Var.f515d;
            if ((i10 == 2 || i10 == 4) && z1Var.d(c1Var2) == ((g) z1Var.f516e)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z1Var.f515d == 3 && z1Var.d(c1Var2) == ((g) z1Var.f517f)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 || z11) {
                return true;
            }
        }
        return false;
    }

    public final void A0(r1.d1 d1Var, q2.c0 c0Var, r1.d1 d1Var2, q2.c0 c0Var2, long j, boolean z10) {
        Object obj;
        r1.o0 o0Var;
        boolean r02 = r0(d1Var, c0Var);
        Object obj2 = c0Var.f10834a;
        if (!r02) {
            if (c0Var.b()) {
                o0Var = r1.o0.f11593d;
            } else {
                o0Var = this.f460c0.f407o;
            }
            m mVar = this.K;
            if (!mVar.d().equals(o0Var)) {
                this.E.d(16);
                mVar.e(o0Var);
                x(this.f460c0.f407o, o0Var.f11596a, false, false);
                return;
            }
            return;
        }
        r1.a1 a1Var = this.I;
        int i6 = d1Var.g(obj2, a1Var).f11297c;
        r1.c1 c1Var = this.H;
        d1Var.n(i6, c1Var);
        r1.z zVar = c1Var.j;
        j jVar = this.Q;
        jVar.getClass();
        jVar.f277c = u1.a0.Q(zVar.f11768a);
        jVar.f280f = u1.a0.Q(zVar.f11769b);
        jVar.f281g = u1.a0.Q(zVar.f11770c);
        float f3 = zVar.f11771d;
        if (f3 == -3.4028235E38f) {
            f3 = 0.97f;
        }
        jVar.j = f3;
        float f10 = zVar.f11772e;
        if (f10 == -3.4028235E38f) {
            f10 = 1.03f;
        }
        jVar.f283i = f10;
        if (f3 == 1.0f && f10 == 1.0f) {
            jVar.f277c = -9223372036854775807L;
        }
        jVar.a();
        if (j != -9223372036854775807L) {
            jVar.f278d = m(d1Var, obj2, j);
            jVar.a();
            return;
        }
        Object obj3 = c1Var.f11327a;
        if (!d1Var2.p()) {
            obj = d1Var2.m(d1Var2.g(c0Var2.f10834a, a1Var).f11297c, c1Var, 0L).f11327a;
        } else {
            obj = null;
        }
        if (Objects.equals(obj, obj3) && !z10) {
            return;
        }
        jVar.f278d = -9223372036854775807L;
        jVar.a();
    }

    public final boolean B() {
        c1 c1Var = this.O.f236i;
        long j = c1Var.f182g.f201e;
        if (c1Var.f180e) {
            if (j == -9223372036854775807L || this.f460c0.s < j || !q0()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void B0(boolean z10, boolean z11) {
        long j;
        this.f465h0 = z10;
        if (z10 && !z11) {
            this.M.getClass();
            j = SystemClock.elapsedRealtime();
        } else {
            j = -9223372036854775807L;
        }
        this.f466i0 = j;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [q2.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [q2.b1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [q2.b1, java.lang.Object] */
    public final void C() {
        long e10;
        long j;
        boolean c10;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (!z(this.O.f238l)) {
            c10 = false;
        } else {
            c1 c1Var = this.O.f238l;
            if (!c1Var.f180e) {
                e10 = 0;
            } else {
                e10 = c1Var.f176a.e();
            }
            long p10 = p(e10);
            c1 c1Var2 = this.O.f236i;
            if (r0(this.f460c0.f394a, c1Var.f182g.f197a)) {
                j = this.Q.f282h;
            } else {
                j = -9223372036854775807L;
            }
            b2.m mVar = this.S;
            r1.d1 d1Var = this.f460c0.f394a;
            float f3 = this.K.d().f11596a;
            boolean z13 = this.f460c0.f404l;
            y0 y0Var = new y0(mVar, p10, f3, this.f465h0, j);
            c10 = this.C.c(y0Var);
            c1 c1Var3 = this.O.f236i;
            if (!c10 && c1Var3.f180e && p10 < 500000 && this.J > 0) {
                c1Var3.f176a.i(this.f460c0.s);
                c10 = this.C.c(y0Var);
            }
        }
        this.f467j0 = c10;
        if (c10) {
            c1 c1Var4 = this.O.f238l;
            c1Var4.getClass();
            z0 z0Var = new z0();
            z0Var.f509a = this.f474r0 - c1Var4.f190p;
            float f10 = this.K.d().f11596a;
            if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f10 != -3.4028235E38f) {
                z10 = false;
            } else {
                z10 = true;
            }
            u1.c.b(z10);
            z0Var.f510b = f10;
            long j10 = this.f466i0;
            if (j10 < 0 && j10 != -9223372036854775807L) {
                z11 = false;
            } else {
                z11 = true;
            }
            u1.c.b(z11);
            z0Var.f511c = j10;
            a1 a1Var = new a1(z0Var);
            if (c1Var4.f187m == null) {
                z12 = true;
            }
            u1.c.g(z12);
            c1Var4.f176a.f(a1Var);
        }
        v0();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [q2.b1, q2.a0, java.lang.Object] */
    public final void D() {
        boolean z10;
        boolean z11;
        f1 f1Var = this.O;
        f1Var.k();
        c1 c1Var = f1Var.f239m;
        if (c1Var != null) {
            ?? r12 = c1Var.f176a;
            if ((!c1Var.f179d || c1Var.f180e) && !r12.a()) {
                r1.d1 d1Var = this.f460c0.f394a;
                if (c1Var.f180e) {
                    r12.r();
                }
                Iterator it = this.C.f306h.values().iterator();
                while (it.hasNext()) {
                    if (((k) it.next()).f293a) {
                        return;
                    }
                }
                boolean z12 = true;
                if (!c1Var.f179d) {
                    long j = c1Var.f182g.f198b;
                    c1Var.f179d = true;
                    r12.l(this, j);
                    return;
                }
                z0 z0Var = new z0();
                z0Var.f509a = this.f474r0 - c1Var.f190p;
                float f3 = this.K.d().f11596a;
                if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f3 != -3.4028235E38f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                u1.c.b(z10);
                z0Var.f510b = f3;
                long j10 = this.f466i0;
                if (j10 < 0 && j10 != -9223372036854775807L) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                u1.c.b(z11);
                z0Var.f511c = j10;
                a1 a1Var = new a1(z0Var);
                if (c1Var.f187m != null) {
                    z12 = false;
                }
                u1.c.g(z12);
                r12.f(a1Var);
            }
        }
    }

    public final void E() {
        boolean z10;
        t0 t0Var = this.f461d0;
        s1 s1Var = this.f460c0;
        boolean z11 = t0Var.f415c;
        if (((s1) t0Var.f418f) != s1Var) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        t0Var.f415c = z12;
        t0Var.f418f = s1Var;
        if (z12) {
            n0 n0Var = this.N.f167y;
            n0Var.H.c(new c0(0, n0Var, t0Var));
            this.f461d0 = new t0(this.f460c0);
        }
    }

    public final void F(int i6) {
        z1 z1Var = this.f480x[i6];
        try {
            c1 c1Var = this.O.f236i;
            c1Var.getClass();
            g d10 = z1Var.d(c1Var);
            d10.getClass();
            q2.z0 z0Var = d10.F;
            z0Var.getClass();
            z0Var.b();
        } catch (IOException | RuntimeException e10) {
            int i10 = ((g) z1Var.f516e).f245y;
            if (i10 != 3 && i10 != 5) {
                throw e10;
            }
            t2.w wVar = this.O.f236i.f189o;
            u1.a.h("ExoPlayerImplInternal", "Disabling track due to error: " + r1.q.c(wVar.f12564c[i6].n()), e10);
            t2.w wVar2 = new t2.w((y1[]) wVar.f12563b.clone(), (t2.s[]) wVar.f12564c.clone(), wVar.f12565d, wVar.f12566e);
            wVar2.f12563b[i6] = null;
            wVar2.f12564c[i6] = null;
            g(i6);
            c1 c1Var2 = this.O.f236i;
            c1Var2.a(wVar2, this.f460c0.s, false, new boolean[c1Var2.j.length]);
        }
    }

    public final void G(int i6, boolean z10) {
        boolean[] zArr = this.f484z;
        if (zArr[i6] != z10) {
            zArr[i6] = z10;
            this.U.c(new o0(this, i6, z10));
        }
    }

    public final void H() {
        v(this.P.c(), true);
    }

    public final void I(s0 s0Var) {
        boolean z10;
        r1.d1 c10;
        this.f461d0.f(1);
        int i6 = s0Var.f389a;
        int i10 = s0Var.f390b;
        int i11 = s0Var.f391c;
        q2.c1 c1Var = s0Var.f392d;
        r1 r1Var = this.P;
        ArrayList arrayList = (ArrayList) r1Var.f379c;
        if (i6 >= 0 && i6 <= i10 && i10 <= arrayList.size() && i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        r1Var.f386k = c1Var;
        if (i6 != i10 && i6 != i11) {
            int min = Math.min(i6, i11);
            int max = Math.max(((i10 - i6) + i11) - 1, i10 - 1);
            int i12 = ((q1) arrayList.get(min)).f369d;
            u1.a0.P(arrayList, i6, i10, i11);
            while (min <= max) {
                q1 q1Var = (q1) arrayList.get(min);
                q1Var.f369d = i12;
                i12 += q1Var.f366a.L.f10943e.o();
                min++;
            }
            c10 = r1Var.c();
        } else {
            c10 = r1Var.c();
        }
        v(c10, false);
    }

    public final void J() {
        boolean z10;
        int i6;
        this.f461d0.f(1);
        O(false, false, false, true);
        l lVar = this.C;
        HashMap hashMap = lVar.f306h;
        long id2 = Thread.currentThread().getId();
        long j = lVar.f307i;
        if (j != -1 && j != id2) {
            z10 = false;
        } else {
            z10 = true;
        }
        u1.c.f("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", z10);
        lVar.f307i = id2;
        b2.m mVar = this.S;
        if (!hashMap.containsKey(mVar)) {
            hashMap.put(mVar, new Object());
        }
        k kVar = (k) hashMap.get(mVar);
        kVar.getClass();
        int i10 = lVar.f304f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        kVar.f294b = i10;
        kVar.f293a = false;
        if (this.f460c0.f394a.p()) {
            i6 = 4;
        } else {
            i6 = 2;
        }
        m0(i6);
        s1 s1Var = this.f460c0;
        boolean z11 = s1Var.f404l;
        y0(this.W.d(s1Var.f398e, z11), s1Var.f406n, s1Var.f405m, z11);
        u2.g gVar = (u2.g) this.D;
        gVar.getClass();
        r1 r1Var = this.P;
        ArrayList arrayList = (ArrayList) r1Var.f379c;
        u1.c.g(!r1Var.f377a);
        r1Var.f387l = gVar;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            q1 q1Var = (q1) arrayList.get(i11);
            r1Var.g(q1Var);
            ((HashSet) r1Var.f384h).add(q1Var);
        }
        r1Var.f377a = true;
        this.E.e(2);
    }

    public final void K(u1.f fVar) {
        s8.n nVar = this.F;
        u1.x xVar = this.E;
        try {
            O(true, false, true, false);
            L();
            l lVar = this.C;
            if (lVar.f306h.remove(this.S) != null) {
                lVar.d();
            }
            if (lVar.f306h.isEmpty()) {
                lVar.f307i = -1L;
            }
            f fVar2 = this.W;
            fVar2.f220c = null;
            fVar2.a();
            fVar2.c(0);
            this.A.a();
            m0(1);
        } finally {
            xVar.f12820a.removeCallbacksAndMessages(null);
            nVar.h();
            fVar.e();
        }
    }

    public final void L() {
        boolean z10;
        for (int i6 = 0; i6 < this.f480x.length; i6++) {
            g gVar = this.f482y[i6];
            synchronized (gVar.f244x) {
                gVar.O = null;
            }
            z1 z1Var = this.f480x[i6];
            g gVar2 = (g) z1Var.f516e;
            boolean z11 = true;
            if (gVar2.E == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u1.c.g(z10);
            gVar2.r();
            z1Var.f512a = false;
            g gVar3 = (g) z1Var.f517f;
            if (gVar3 != null) {
                if (gVar3.E != 0) {
                    z11 = false;
                }
                u1.c.g(z11);
                gVar3.r();
                z1Var.f513b = false;
            }
        }
    }

    public final void M(int i6, int i10, q2.c1 c1Var) {
        boolean z10 = true;
        this.f461d0.f(1);
        r1 r1Var = this.P;
        r1Var.getClass();
        if (i6 < 0 || i6 > i10 || i10 > ((ArrayList) r1Var.f379c).size()) {
            z10 = false;
        }
        u1.c.b(z10);
        r1Var.f386k = c1Var;
        r1Var.i(i6, i10);
        v(r1Var.c(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N() {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.w0.N():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O(boolean r36, boolean r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.w0.O(boolean, boolean, boolean, boolean):void");
    }

    public final void P() {
        boolean z10;
        c1 c1Var = this.O.f236i;
        if (c1Var != null && c1Var.f182g.f205i && this.f463f0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f464g0 = z10;
    }

    public final void Q(long j) {
        long j10;
        c1 c1Var = this.O.f236i;
        if (c1Var == null) {
            j10 = 1000000000000L;
        } else {
            j10 = c1Var.f190p;
        }
        long j11 = j + j10;
        this.f474r0 = j11;
        ((d2) this.K.f316z).a(j11);
        for (z1 z1Var : this.f480x) {
            long j12 = this.f474r0;
            g d10 = z1Var.d(c1Var);
            if (d10 != null) {
                d10.K = false;
                d10.I = j12;
                d10.J = j12;
                d10.q(false, j12);
            }
        }
        for (c1 c1Var2 = r0.f236i; c1Var2 != null; c1Var2 = c1Var2.f187m) {
            for (t2.s sVar : c1Var2.f189o.f12564c) {
                if (sVar != null) {
                    sVar.s();
                }
            }
        }
    }

    public final void R(r1.d1 d1Var, r1.d1 d1Var2) {
        if (d1Var.p() && d1Var2.p()) {
            return;
        }
        ArrayList arrayList = this.L;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            r4.a.t(arrayList.get(size));
            throw null;
        }
    }

    public final void U(long j) {
        c1 c1Var;
        long j10;
        boolean z10 = this.Z;
        long j11 = 1000;
        long j12 = B0;
        if (z10) {
            this.Y.getClass();
            if (this.f460c0.f398e != 3) {
                j11 = j12;
            }
            for (z1 z1Var : this.f480x) {
                long j13 = this.f474r0;
                long j14 = this.f475s0;
                g gVar = (g) z1Var.f517f;
                g gVar2 = (g) z1Var.f516e;
                if (z1.h(gVar2)) {
                    j10 = gVar2.c(j13, j14);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (gVar != null && gVar.E != 0) {
                    j10 = Math.min(j10, gVar.c(j13, j14));
                }
                j11 = Math.min(j11, u1.a0.e0(j10));
            }
            if (this.f460c0.m()) {
                c1 c1Var2 = this.O.f236i;
                if (c1Var2 != null) {
                    c1Var = c1Var2.f187m;
                } else {
                    c1Var = null;
                }
                if (c1Var != null) {
                    if ((((float) u1.a0.Q(j11)) * this.f460c0.f407o.f11596a) + ((float) this.f474r0) >= ((float) c1Var.e())) {
                        j11 = Math.min(j11, j12);
                    }
                }
            }
        } else if (this.f460c0.f398e != 3 || q0()) {
            j11 = j12;
        }
        this.E.f12820a.sendEmptyMessageAtTime(2, j + j11);
    }

    public final void V(boolean z10) {
        q2.c0 c0Var = this.O.f236i.f182g.f197a;
        long X = X(c0Var, this.f460c0.s, true, false);
        if (X != this.f460c0.s) {
            s1 s1Var = this.f460c0;
            this.f460c0 = y(c0Var, X, s1Var.f396c, s1Var.f397d, z10, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:(7:(8:27|(1:92)(3:33|(1:37)|38)|39|(1:48)|46|47|17|18)(1:93)|68|69|70|16|17|18)|49|50|(1:52)(1:89)|53|54|(1:56)(1:85)|57|58|(1:60)(1:83)|61|62|63|64|65|66|67) */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0169, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016a, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x016b, code lost:
    
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0174, code lost:
    
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0171, code lost:
    
        r3 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7 A[Catch: all -> 0x00aa, TRY_ENTER, TryCatch #4 {all -> 0x00aa, blocks: (B:14:0x00a7, B:21:0x00b4, B:23:0x00ba, B:24:0x00bd, B:27:0x00d0, B:29:0x00d6, B:33:0x00de, B:37:0x00ec, B:38:0x00f1, B:39:0x00f9, B:41:0x010a, B:46:0x0118), top: B:12:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Type inference failed for: r0v30, types: [q2.a0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W(a2.v0 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.w0.W(a2.v0, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [q2.a0, java.lang.Object] */
    public final long X(q2.c0 c0Var, long j, boolean z10, boolean z11) {
        z1[] z1VarArr;
        u0();
        B0(false, true);
        if (z11 || this.f460c0.f398e == 3) {
            m0(2);
        }
        f1 f1Var = this.O;
        c1 c1Var = f1Var.f236i;
        c1 c1Var2 = c1Var;
        while (c1Var2 != null && !c0Var.equals(c1Var2.f182g.f197a)) {
            c1Var2 = c1Var2.f187m;
        }
        if (z10 || c1Var != c1Var2 || (c1Var2 != null && c1Var2.f190p + j < 0)) {
            int i6 = 0;
            while (true) {
                z1VarArr = this.f480x;
                if (i6 >= z1VarArr.length) {
                    break;
                }
                g(i6);
                i6++;
            }
            this.f483y0 = -9223372036854775807L;
            if (c1Var2 != null) {
                while (f1Var.f236i != c1Var2) {
                    f1Var.a();
                }
                f1Var.n(c1Var2);
                c1Var2.f190p = 1000000000000L;
                l(new boolean[z1VarArr.length], f1Var.j.e());
                c1Var2.f183h = true;
            }
        }
        f();
        if (c1Var2 != null) {
            ?? r10 = c1Var2.f176a;
            f1Var.n(c1Var2);
            if (!c1Var2.f180e) {
                c1Var2.f182g = c1Var2.f182g.b(j);
            } else if (c1Var2.f181f) {
                j = r10.h(j);
                r10.i(j - this.J);
            }
            Q(j);
            C();
        } else {
            f1Var.b();
            Q(j);
        }
        u(false);
        this.E.e(2);
        return j;
    }

    public final void Y(v1 v1Var) {
        v1Var.getClass();
        u1.x xVar = this.E;
        if (v1Var.f453e == this.G) {
            synchronized (v1Var) {
            }
            try {
                v1Var.f449a.h(v1Var.f451c, v1Var.f452d);
                v1Var.a(true);
                int i6 = this.f460c0.f398e;
                if (i6 != 3 && i6 != 2) {
                    return;
                }
                xVar.e(2);
                return;
            } catch (Throwable th) {
                v1Var.a(true);
                throw th;
            }
        }
        xVar.a(15, v1Var).b();
    }

    public final void Z(v1 v1Var) {
        Looper looper = v1Var.f453e;
        if (!looper.getThread().isAlive()) {
            u1.a.p("TAG", "Trying to send message on a dead thread.");
            v1Var.a(false);
        } else {
            this.M.a(looper, null).c(new a(this, v1Var));
        }
    }

    public final void a(r0 r0Var, int i6) {
        this.f461d0.f(1);
        r1 r1Var = this.P;
        if (i6 == -1) {
            i6 = ((ArrayList) r1Var.f379c).size();
        }
        v(r1Var.a(i6, r0Var.f373a, r0Var.f374b), false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r7.f11348a == 1) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a0(r1.d r7, boolean r8) {
        /*
            r6 = this;
            t2.v r0 = r6.A
            t2.q r0 = (t2.q) r0
            r1.d r1 = r0.f12551i
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto Ld
            goto L12
        Ld:
            r0.f12551i = r7
            r0.f()
        L12:
            if (r8 == 0) goto L15
            goto L16
        L15:
            r7 = 0
        L16:
            a2.f r8 = r6.W
            r1.d r0 = r8.f221d
            boolean r0 = java.util.Objects.equals(r0, r7)
            if (r0 != 0) goto L53
            r8.f221d = r7
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L28
        L26:
            r3 = 0
            goto L47
        L28:
            int r2 = r7.f11350c
            r3 = 3
            r4 = 2
            java.lang.String r5 = "AudioFocusManager"
            switch(r2) {
                case 0: goto L41;
                case 1: goto L3f;
                case 2: goto L3d;
                case 3: goto L26;
                case 4: goto L3d;
                case 5: goto L47;
                case 6: goto L47;
                case 7: goto L47;
                case 8: goto L47;
                case 9: goto L47;
                case 10: goto L47;
                case 11: goto L39;
                case 12: goto L47;
                case 13: goto L47;
                case 14: goto L3f;
                case 15: goto L31;
                case 16: goto L37;
                default: goto L31;
            }
        L31:
            java.lang.String r7 = "Unidentified audio usage: "
            h8.c.p(r2, r7, r5)
            goto L26
        L37:
            r3 = 4
            goto L47
        L39:
            int r7 = r7.f11348a
            if (r7 != r1) goto L47
        L3d:
            r3 = 2
            goto L47
        L3f:
            r3 = 1
            goto L47
        L41:
            java.lang.String r7 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            u1.a.p(r5, r7)
            goto L3f
        L47:
            r8.f223f = r3
            if (r3 == r1) goto L4d
            if (r3 != 0) goto L4e
        L4d:
            r0 = 1
        L4e:
            java.lang.String r7 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            u1.c.a(r7, r0)
        L53:
            a2.s1 r7 = r6.f460c0
            boolean r0 = r7.f404l
            int r1 = r7.f406n
            int r2 = r7.f405m
            int r7 = r7.f398e
            int r7 = r8.d(r7, r0)
            r6.y0(r7, r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.w0.a0(r1.d, boolean):void");
    }

    public final void b() {
        b2 b2Var;
        for (z1 z1Var : this.f480x) {
            if (this.Z) {
                b2Var = this.Y;
            } else {
                b2Var = null;
            }
            ((g) z1Var.f516e).h(18, b2Var);
            g gVar = (g) z1Var.f517f;
            if (gVar != null) {
                gVar.h(18, b2Var);
            }
        }
    }

    public final void b0(boolean z10, u1.f fVar) {
        if (this.f470m0 != z10) {
            this.f470m0 = z10;
            if (!z10) {
                for (z1 z1Var : this.f480x) {
                    z1Var.k();
                }
            }
        }
        if (fVar != null) {
            fVar.e();
        }
    }

    @Override // w2.v
    public final void c(long j, long j10, r1.q qVar, MediaFormat mediaFormat) {
        if (this.f458a0) {
            u1.x xVar = this.E;
            xVar.getClass();
            u1.w b10 = u1.x.b();
            b10.f12818a = xVar.f12820a.obtainMessage(37);
            b10.b();
        }
    }

    public final void c0(r0 r0Var) {
        this.f461d0.f(1);
        int i6 = r0Var.f375c;
        q2.c1 c1Var = r0Var.f374b;
        ArrayList arrayList = r0Var.f373a;
        if (i6 != -1) {
            this.f473q0 = new v0(new x1(arrayList, c1Var), r0Var.f375c, r0Var.f376d);
        }
        r1 r1Var = this.P;
        ArrayList arrayList2 = (ArrayList) r1Var.f379c;
        r1Var.i(0, arrayList2.size());
        v(r1Var.a(arrayList2.size(), arrayList, c1Var), false);
    }

    public final boolean d() {
        if (!this.V) {
            return false;
        }
        for (z1 z1Var : this.f480x) {
            if (z1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void d0(boolean z10) {
        this.f463f0 = z10;
        P();
        if (this.f464g0) {
            f1 f1Var = this.O;
            if (f1Var.j != f1Var.f236i) {
                V(true);
                u(false);
            }
        }
    }

    public final void e() {
        N();
        V(true);
    }

    public final void e0(r1.o0 o0Var) {
        this.E.d(16);
        m mVar = this.K;
        mVar.e(o0Var);
        r1.o0 d10 = mVar.d();
        x(d10, d10.f11596a, true, true);
    }

    public final void f() {
        boolean z10;
        g gVar;
        if (this.V && d()) {
            for (z1 z1Var : this.f480x) {
                int c10 = z1Var.c();
                if (z1Var.f()) {
                    int i6 = z1Var.f515d;
                    int i10 = 1;
                    if (i6 != 4 && i6 != 2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (i6 != 4) {
                        i10 = 0;
                    }
                    if (z10) {
                        gVar = (g) z1Var.f516e;
                    } else {
                        gVar = (g) z1Var.f517f;
                        gVar.getClass();
                    }
                    z1Var.a(gVar, this.K);
                    z1Var.i(z10);
                    z1Var.f515d = i10;
                }
                this.f472p0 -= c10 - z1Var.c();
            }
            this.f483y0 = -9223372036854775807L;
        }
    }

    public final void f0(v vVar) {
        this.f481x0 = vVar;
        r1.d1 d1Var = this.f460c0.f394a;
        f1 f1Var = this.O;
        f1Var.getClass();
        vVar.getClass();
        if (!f1Var.f243q.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i6 = 0; i6 < f1Var.f243q.size(); i6++) {
                ((c1) f1Var.f243q.get(i6)).i();
            }
            f1Var.f243q = arrayList;
            f1Var.f239m = null;
            f1Var.k();
        }
    }

    public final void g(int i6) {
        boolean z10;
        z1[] z1VarArr = this.f480x;
        int c10 = z1VarArr[i6].c();
        z1 z1Var = z1VarArr[i6];
        g gVar = (g) z1Var.f516e;
        m mVar = this.K;
        z1Var.a(gVar, mVar);
        g gVar2 = (g) z1Var.f517f;
        if (gVar2 != null) {
            if (gVar2.E != 0 && z1Var.f515d != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            z1Var.a(gVar2, mVar);
            z1Var.i(false);
            if (z10) {
                g gVar3 = (g) z1Var.f516e;
                gVar2.getClass();
                gVar2.h(17, gVar3);
            }
        }
        z1Var.f515d = 0;
        G(i6, false);
        this.f472p0 -= c10;
    }

    public final void g0(int i6) {
        this.f468k0 = i6;
        r1.d1 d1Var = this.f460c0.f394a;
        f1 f1Var = this.O;
        f1Var.f234g = i6;
        int r10 = f1Var.r(d1Var);
        if ((r10 & 1) != 0) {
            V(true);
        } else if ((r10 & 2) != 0) {
            f();
        }
        u(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:536:0x07b4, code lost:
    
        if (r5 >= r2.b()) goto L458;
     */
    /* JADX WARN: Removed duplicated region for block: B:218:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x06ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0230  */
    /* JADX WARN: Type inference failed for: r2v3, types: [q2.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v57, types: [q2.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v96, types: [q2.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v27, types: [q2.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v85, types: [q2.a0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 2293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.w0.h():void");
    }

    public final void h0(boolean z10) {
        if (!z10) {
            this.f458a0 = false;
            this.E.d(37);
            v0 v0Var = this.f459b0;
            if (v0Var != null) {
                W(v0Var, false);
                this.f459b0 = null;
            }
        }
        this.Z = z10;
        b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i6;
        c1 c1Var;
        q2.c0 c0Var;
        c1 c1Var2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10 = UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT;
        try {
            switch (message.what) {
                case 1:
                    if (message.arg1 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i11 = message.arg2;
                    this.f461d0.f(1);
                    y0(this.W.d(this.f460c0.f398e, z10), i11 >> 4, i11 & 15, z10);
                    break;
                case 2:
                    h();
                    break;
                case 3:
                    W((v0) message.obj, true);
                    break;
                case 4:
                    e0((r1.o0) message.obj);
                    break;
                case 5:
                    j0((c2) message.obj);
                    break;
                case 6:
                    t0(false, true);
                    break;
                case 7:
                    K((u1.f) message.obj);
                    return true;
                case 8:
                    w((q2.a0) message.obj);
                    break;
                case 9:
                    s((q2.a0) message.obj);
                    break;
                case 10:
                    N();
                    break;
                case 11:
                    g0(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    k0(z11);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    b0(z12, (u1.f) message.obj);
                    break;
                case 14:
                    Y((v1) message.obj);
                    break;
                case 15:
                    Z((v1) message.obj);
                    break;
                case 16:
                    r1.o0 o0Var = (r1.o0) message.obj;
                    x(o0Var, o0Var.f11596a, true, false);
                    break;
                case 17:
                    c0((r0) message.obj);
                    break;
                case 18:
                    a((r0) message.obj, message.arg1);
                    break;
                case 19:
                    I((s0) message.obj);
                    break;
                case 20:
                    M(message.arg1, message.arg2, (q2.c1) message.obj);
                    break;
                case 21:
                    l0((q2.c1) message.obj);
                    break;
                case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                    H();
                    break;
                case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
                    if (message.arg1 != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    d0(z13);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    e();
                    break;
                case 26:
                    N();
                    V(true);
                    break;
                case 27:
                    x0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    f0((v) message.obj);
                    break;
                case 29:
                    J();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    o0(pair.first, (u1.f) pair.second);
                    break;
                case 31:
                    r1.d dVar = (r1.d) message.obj;
                    if (message.arg1 != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    a0(dVar, z14);
                    break;
                case 32:
                    p0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    q(message.arg1);
                    break;
                case 34:
                    r();
                    break;
                case 35:
                    n0((w2.v) message.obj);
                    break;
                case 36:
                    h0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.f458a0 = false;
                    v0 v0Var = this.f459b0;
                    if (v0Var != null) {
                        W(v0Var, false);
                        this.f459b0 = null;
                        break;
                    }
                    break;
                case 38:
                    i0((b2) message.obj);
                    break;
            }
        } catch (q e10) {
            e = e10;
            int i12 = e.G;
            f1 f1Var = this.O;
            if (i12 == 1 && (c1Var2 = f1Var.j) != null && e.L == null) {
                e = e.a(c1Var2.f182g.f197a);
            }
            int i13 = e.G;
            u1.x xVar = this.E;
            if (i13 == 1 && (c0Var = e.L) != null && A(e.I, c0Var)) {
                this.f485z0 = true;
                f();
                c1 g10 = f1Var.g();
                c1 c1Var3 = f1Var.f236i;
                if (c1Var3 != g10) {
                    while (c1Var3 != null) {
                        c1 c1Var4 = c1Var3.f187m;
                        if (c1Var4 == g10) {
                            break;
                        }
                        c1Var3 = c1Var4;
                    }
                }
                f1Var.n(c1Var3);
                if (this.f460c0.f398e != 4) {
                    C();
                    xVar.e(2);
                }
            } else {
                q qVar = this.f478v0;
                if (qVar != null) {
                    qVar.addSuppressed(e);
                    e = this.f478v0;
                }
                if (e.G == 1 && f1Var.f236i != f1Var.j) {
                    while (true) {
                        c1Var = f1Var.f236i;
                        if (c1Var == f1Var.j) {
                            break;
                        }
                        f1Var.a();
                    }
                    u1.c.d(c1Var);
                    E();
                    d1 d1Var = c1Var.f182g;
                    q2.c0 c0Var2 = d1Var.f197a;
                    long j = d1Var.f198b;
                    this.f460c0 = y(c0Var2, j, d1Var.f199c, j, true, 0);
                }
                if (e.M && (this.f478v0 == null || (i6 = e.f11589x) == 5004 || i6 == 5003)) {
                    u1.a.q("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f478v0 == null) {
                        this.f478v0 = e;
                    }
                    u1.w a10 = xVar.a(25, e);
                    Handler handler = xVar.f12820a;
                    Message message2 = a10.f12818a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    a10.a();
                } else {
                    u1.a.h("ExoPlayerImplInternal", "Playback error", e);
                    t0(true, false);
                    this.f460c0 = this.f460c0.f(e);
                }
            }
        } catch (f2.h e11) {
            t(e11, e11.f4669x);
        } catch (RuntimeException e12) {
            if ((e12 instanceof IllegalStateException) || (e12 instanceof IllegalArgumentException)) {
                i10 = 1004;
            }
            q qVar2 = new q(2, e12, i10);
            u1.a.h("ExoPlayerImplInternal", "Playback error", qVar2);
            t0(true, false);
            this.f460c0 = this.f460c0.f(qVar2);
        } catch (q2.b e13) {
            t(e13, 1002);
        } catch (r1.l0 e14) {
            boolean z15 = e14.f11578x;
            int i14 = e14.f11579y;
            if (i14 == 1) {
                if (z15) {
                    i10 = 3001;
                } else {
                    i10 = 3003;
                }
            } else if (i14 == 4) {
                if (z15) {
                    i10 = 3002;
                } else {
                    i10 = 3004;
                }
            }
            t(e14, i10);
        } catch (w1.j e15) {
            t(e15, e15.f13538x);
        } catch (IOException e16) {
            t(e16, 2000);
        }
        E();
        return true;
    }

    public final void i(c1 c1Var, int i6, boolean z10, long j) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        boolean z14;
        boolean z15;
        z1 z1Var = this.f480x[i6];
        boolean g10 = z1Var.g();
        g gVar = (g) z1Var.f516e;
        if (!g10) {
            if (c1Var == this.O.f236i) {
                z11 = true;
            } else {
                z11 = false;
            }
            t2.w wVar = c1Var.f189o;
            y1 y1Var = wVar.f12563b[i6];
            t2.s sVar = wVar.f12564c[i6];
            if (q0() && this.f460c0.f398e == 3) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z10 && z12) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f472p0++;
            q2.z0 z0Var = c1Var.f178c[i6];
            long j10 = c1Var.f190p;
            q2.c0 c0Var = c1Var.f182g.f197a;
            g gVar2 = (g) z1Var.f517f;
            if (sVar != null) {
                i10 = sVar.length();
            } else {
                i10 = 0;
            }
            r1.q[] qVarArr = new r1.q[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                sVar.getClass();
                qVarArr[i11] = sVar.h(i11);
            }
            int i12 = z1Var.f515d;
            m mVar = this.K;
            if (i12 != 0 && i12 != 2 && i12 != 4) {
                z1Var.f513b = true;
                gVar2.getClass();
                if (gVar2.E == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                u1.c.g(z15);
                gVar2.A = y1Var;
                gVar2.N = c0Var;
                gVar2.E = 1;
                gVar2.p(z13, z11);
                gVar2.y(qVarArr, z0Var, j, j10, c0Var);
                gVar2.K = false;
                gVar2.I = j;
                gVar2.J = j;
                gVar2.q(z13, j);
                mVar.a(gVar2);
            } else {
                z1Var.f512a = true;
                if (gVar.E == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                u1.c.g(z14);
                gVar.A = y1Var;
                gVar.N = c0Var;
                gVar.E = 1;
                gVar.p(z13, z11);
                gVar.y(qVarArr, z0Var, j, j10, c0Var);
                gVar.K = false;
                gVar.I = j;
                gVar.J = j;
                gVar.q(z13, j);
                mVar.a(gVar);
            }
            q0 q0Var = new q0(this);
            g d10 = z1Var.d(c1Var);
            d10.getClass();
            d10.h(11, q0Var);
            if (z12 && z11) {
                z1Var.m();
            }
        }
    }

    public final void i0(b2 b2Var) {
        this.Y = b2Var;
        b();
    }

    @Override // q2.a1
    public final void j(q2.b1 b1Var) {
        this.E.a(9, (q2.a0) b1Var).b();
    }

    public final void j0(c2 c2Var) {
        this.X = c2Var;
    }

    @Override // q2.z
    public final void k(q2.a0 a0Var) {
        this.E.a(8, a0Var).b();
    }

    public final void k0(boolean z10) {
        this.f469l0 = z10;
        r1.d1 d1Var = this.f460c0.f394a;
        f1 f1Var = this.O;
        f1Var.f235h = z10;
        int r10 = f1Var.r(d1Var);
        if ((r10 & 1) != 0) {
            V(true);
        } else if ((r10 & 2) != 0) {
            f();
        }
        u(false);
    }

    public final void l(boolean[] zArr, long j) {
        z1[] z1VarArr;
        long j10;
        c1 c1Var = this.O.j;
        t2.w wVar = c1Var.f189o;
        int i6 = 0;
        while (true) {
            z1VarArr = this.f480x;
            if (i6 >= z1VarArr.length) {
                break;
            }
            if (!wVar.b(i6)) {
                z1VarArr[i6].k();
            }
            i6++;
        }
        int i10 = 0;
        while (i10 < z1VarArr.length) {
            if (!wVar.b(i10) || z1VarArr[i10].d(c1Var) != null) {
                j10 = j;
            } else {
                j10 = j;
                i(c1Var, i10, zArr[i10], j10);
            }
            i10++;
            j = j10;
        }
    }

    public final void l0(q2.c1 c1Var) {
        this.f461d0.f(1);
        r1 r1Var = this.P;
        int size = ((ArrayList) r1Var.f379c).size();
        if (c1Var.f10840b.length != size) {
            c1Var = new q2.c1(new Random(c1Var.f10839a.nextLong())).a(0, size);
        }
        r1Var.f386k = c1Var;
        v(r1Var.c(), false);
    }

    public final long m(r1.d1 d1Var, Object obj, long j) {
        r1.a1 a1Var = this.I;
        int i6 = d1Var.g(obj, a1Var).f11297c;
        r1.c1 c1Var = this.H;
        d1Var.n(i6, c1Var);
        if (c1Var.f11332f == -9223372036854775807L || !c1Var.a() || !c1Var.f11335i) {
            return -9223372036854775807L;
        }
        return u1.a0.Q(u1.a0.A(c1Var.f11333g) - c1Var.f11332f) - (j + a1Var.f11299e);
    }

    public final void m0(int i6) {
        s1 s1Var = this.f460c0;
        if (s1Var.f398e != i6) {
            if (i6 != 2) {
                this.f479w0 = -9223372036854775807L;
            }
            if (i6 != 3 && s1Var.f408p) {
                this.f460c0 = s1Var.i(false);
            }
            this.f460c0 = this.f460c0.h(i6);
        }
    }

    public final long n(c1 c1Var) {
        if (c1Var == null) {
            return 0L;
        }
        long j = c1Var.f190p;
        if (!c1Var.f180e) {
            return j;
        }
        int i6 = 0;
        while (true) {
            z1[] z1VarArr = this.f480x;
            if (i6 < z1VarArr.length) {
                if (z1VarArr[i6].d(c1Var) != null) {
                    g d10 = z1VarArr[i6].d(c1Var);
                    Objects.requireNonNull(d10);
                    long j10 = d10.J;
                    if (j10 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    j = Math.max(j10, j);
                }
                i6++;
            } else {
                return j;
            }
        }
    }

    public final void n0(w2.v vVar) {
        for (z1 z1Var : this.f480x) {
            g gVar = (g) z1Var.f516e;
            if (gVar.f245y == 2) {
                gVar.h(7, vVar);
                g gVar2 = (g) z1Var.f517f;
                if (gVar2 != null) {
                    gVar2.h(7, vVar);
                }
            }
        }
    }

    public final Pair o(r1.d1 d1Var) {
        long j = 0;
        if (d1Var.p()) {
            return Pair.create(s1.f393u, 0L);
        }
        int a10 = d1Var.a(this.f469l0);
        Pair i6 = d1Var.i(this.H, this.I, a10, -9223372036854775807L);
        q2.c0 p10 = this.O.p(d1Var, i6.first, 0L);
        long longValue = ((Long) i6.second).longValue();
        if (p10.b()) {
            Object obj = p10.f10834a;
            r1.a1 a1Var = this.I;
            d1Var.g(obj, a1Var);
            if (p10.f10836c == a1Var.e(p10.f10835b)) {
                a1Var.f11301g.getClass();
            }
        } else {
            j = longValue;
        }
        return Pair.create(p10, Long.valueOf(j));
    }

    public final void o0(Object obj, u1.f fVar) {
        for (z1 z1Var : this.f480x) {
            g gVar = (g) z1Var.f516e;
            if (gVar.f245y == 2) {
                int i6 = z1Var.f515d;
                if (i6 != 4 && i6 != 1) {
                    gVar.h(1, obj);
                } else {
                    g gVar2 = (g) z1Var.f517f;
                    gVar2.getClass();
                    gVar2.h(1, obj);
                }
            }
        }
        int i10 = this.f460c0.f398e;
        if (i10 == 3 || i10 == 2) {
            this.E.e(2);
        }
        if (fVar != null) {
            fVar.e();
        }
    }

    public final long p(long j) {
        c1 c1Var = this.O.f238l;
        if (c1Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.f474r0 - c1Var.f190p));
    }

    public final void p0(float f3) {
        this.A0 = f3;
        float f10 = f3 * this.W.f224g;
        for (z1 z1Var : this.f480x) {
            g gVar = (g) z1Var.f516e;
            if (gVar.f245y == 1) {
                gVar.h(2, Float.valueOf(f10));
                g gVar2 = (g) z1Var.f517f;
                if (gVar2 != null) {
                    gVar2.h(2, Float.valueOf(f10));
                }
            }
        }
    }

    public final void q(int i6) {
        s1 s1Var = this.f460c0;
        y0(i6, s1Var.f406n, s1Var.f405m, s1Var.f404l);
    }

    public final boolean q0() {
        s1 s1Var = this.f460c0;
        if (s1Var.f404l && s1Var.f406n == 0) {
            return true;
        }
        return false;
    }

    public final void r() {
        p0(this.A0);
    }

    public final boolean r0(r1.d1 d1Var, q2.c0 c0Var) {
        if (!c0Var.b() && !d1Var.p()) {
            int i6 = d1Var.g(c0Var.f10834a, this.I).f11297c;
            r1.c1 c1Var = this.H;
            d1Var.n(i6, c1Var);
            if (c1Var.a() && c1Var.f11335i && c1Var.f11332f != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void s(q2.a0 a0Var) {
        f1 f1Var = this.O;
        c1 c1Var = f1Var.f238l;
        if (c1Var != null && c1Var.f176a == a0Var) {
            f1Var.m(this.f474r0);
            C();
            return;
        }
        c1 c1Var2 = f1Var.f239m;
        if (c1Var2 != null && c1Var2.f176a == a0Var) {
            D();
        }
    }

    public final void s0() {
        c1 c1Var = this.O.f236i;
        if (c1Var != null) {
            t2.w wVar = c1Var.f189o;
            int i6 = 0;
            while (true) {
                z1[] z1VarArr = this.f480x;
                if (i6 < z1VarArr.length) {
                    if (wVar.b(i6)) {
                        z1VarArr[i6].m();
                    }
                    i6++;
                } else {
                    return;
                }
            }
        }
    }

    public final void t(IOException iOException, int i6) {
        q qVar = new q(0, iOException, i6);
        c1 c1Var = this.O.f236i;
        if (c1Var != null) {
            qVar = qVar.a(c1Var.f182g.f197a);
        }
        u1.a.h("ExoPlayerImplInternal", "Playback error", qVar);
        t0(false, false);
        this.f460c0 = this.f460c0.f(qVar);
    }

    public final void t0(boolean z10, boolean z11) {
        boolean z12;
        if (!z10 && this.f470m0) {
            z12 = false;
        } else {
            z12 = true;
        }
        O(z12, false, true, false);
        this.f461d0.f(z11 ? 1 : 0);
        l lVar = this.C;
        if (lVar.f306h.remove(this.S) != null) {
            lVar.d();
        }
        this.W.d(1, this.f460c0.f404l);
        m0(1);
    }

    public final void u(boolean z10) {
        q2.c0 c0Var;
        long d10;
        c1 c1Var = this.O.f238l;
        if (c1Var == null) {
            c0Var = this.f460c0.f395b;
        } else {
            c0Var = c1Var.f182g.f197a;
        }
        boolean equals = this.f460c0.f403k.equals(c0Var);
        if (!equals) {
            this.f460c0 = this.f460c0.c(c0Var);
        }
        s1 s1Var = this.f460c0;
        if (c1Var == null) {
            d10 = s1Var.s;
        } else {
            d10 = c1Var.d();
        }
        s1Var.f409q = d10;
        s1 s1Var2 = this.f460c0;
        s1Var2.f410r = p(s1Var2.f409q);
        if ((!equals || z10) && c1Var != null && c1Var.f180e) {
            w0(c1Var.f189o);
        }
    }

    public final void u0() {
        m mVar = this.K;
        mVar.f315y = false;
        d2 d2Var = (d2) mVar.f316z;
        if (d2Var.f207y) {
            d2Var.a(d2Var.f());
            d2Var.f207y = false;
        }
        for (z1 z1Var : this.f480x) {
            g gVar = (g) z1Var.f517f;
            g gVar2 = (g) z1Var.f516e;
            if (z1.h(gVar2)) {
                z1.b(gVar2);
            }
            if (gVar != null && gVar.E != 0) {
                z1.b(gVar);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:114|115|(1:117)(1:153)|118|(8:(11:123|125|126|127|128|129|130|131|132|133|(2:135|136)(2:137|(1:139)))|128|129|130|131|132|133|(0)(0))|151|125|126|127) */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02e9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02ea, code lost:
    
        r8 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02ec, code lost:
    
        r20 = r3;
        r8 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02d6 A[Catch: all -> 0x02d1, TryCatch #0 {all -> 0x02d1, blocks: (B:136:0x02cd, B:137:0x02d6, B:139:0x02d9, B:30:0x02f2, B:62:0x02fe, B:64:0x0304, B:66:0x030e, B:68:0x031b), top: B:28:0x0294 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r2v34, types: [a2.f1] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v23, types: [r1.d1] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(r1.d1 r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.w0.v(r1.d1, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [q2.b1, java.lang.Object] */
    public final void v0() {
        boolean z10;
        c1 c1Var = this.O.f238l;
        if (!this.f467j0 && (c1Var == null || !c1Var.f176a.a())) {
            z10 = false;
        } else {
            z10 = true;
        }
        s1 s1Var = this.f460c0;
        if (z10 != s1Var.f400g) {
            this.f460c0 = s1Var.b(z10);
        }
    }

    public final void w(q2.a0 a0Var) {
        c1 c1Var;
        f1 f1Var = this.O;
        c1 c1Var2 = f1Var.f238l;
        m mVar = this.K;
        if (c1Var2 != null && c1Var2.f176a == a0Var) {
            c1Var2.getClass();
            if (!c1Var2.f180e) {
                float f3 = mVar.d().f11596a;
                s1 s1Var = this.f460c0;
                c1Var2.f(f3, s1Var.f394a, s1Var.f404l);
            }
            w0(c1Var2.f189o);
            if (c1Var2 == f1Var.f236i) {
                Q(c1Var2.f182g.f198b);
                l(new boolean[this.f480x.length], f1Var.j.e());
                c1Var2.f183h = true;
                s1 s1Var2 = this.f460c0;
                q2.c0 c0Var = s1Var2.f395b;
                long j = c1Var2.f182g.f198b;
                this.f460c0 = y(c0Var, j, s1Var2.f396c, j, false, 5);
            }
            C();
            return;
        }
        int i6 = 0;
        while (true) {
            if (i6 < f1Var.f243q.size()) {
                c1Var = (c1) f1Var.f243q.get(i6);
                if (c1Var.f176a == a0Var) {
                    break;
                } else {
                    i6++;
                }
            } else {
                c1Var = null;
                break;
            }
        }
        if (c1Var != null) {
            u1.c.g(true ^ c1Var.f180e);
            float f10 = mVar.d().f11596a;
            s1 s1Var3 = this.f460c0;
            c1Var.f(f10, s1Var3.f394a, s1Var3.f404l);
            c1 c1Var3 = f1Var.f239m;
            if (c1Var3 != null && c1Var3.f176a == a0Var) {
                D();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x005a. Please report as an issue. */
    public final void w0(t2.w wVar) {
        c1 c1Var = this.O.f238l;
        c1Var.getClass();
        p(c1Var.d());
        if (r0(this.f460c0.f394a, c1Var.f182g.f197a)) {
            long j = this.Q.f282h;
        }
        r1.d1 d1Var = this.f460c0.f394a;
        float f3 = this.K.d().f11596a;
        boolean z10 = this.f460c0.f404l;
        t2.s[] sVarArr = wVar.f12564c;
        l lVar = this.C;
        k kVar = (k) lVar.f306h.get(this.S);
        kVar.getClass();
        int i6 = lVar.f304f;
        if (i6 == -1) {
            int length = sVarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = 13107200;
                if (i10 < length) {
                    t2.s sVar = sVarArr[i10];
                    if (sVar != null) {
                        switch (sVar.c().f11388c) {
                            case -2:
                                i12 = 0;
                                i11 += i12;
                                break;
                            case -1:
                            case 1:
                                i11 += i12;
                                break;
                            case 0:
                                i12 = 144310272;
                                i11 += i12;
                                break;
                            case 2:
                                i12 = 131072000;
                                i11 += i12;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i12 = 131072;
                                i11 += i12;
                                break;
                            case 4:
                                i12 = 26214400;
                                i11 += i12;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i10++;
                } else {
                    i6 = Math.max(13107200, i11);
                }
            }
        }
        kVar.f294b = i6;
        lVar.d();
    }

    public final void x(r1.o0 o0Var, float f3, boolean z10, boolean z11) {
        int i6;
        if (z10) {
            if (z11) {
                this.f461d0.f(1);
            }
            this.f460c0 = this.f460c0.g(o0Var);
        }
        float f10 = o0Var.f11596a;
        c1 c1Var = this.O.f236i;
        while (true) {
            i6 = 0;
            if (c1Var == null) {
                break;
            }
            t2.s[] sVarArr = c1Var.f189o.f12564c;
            int length = sVarArr.length;
            while (i6 < length) {
                t2.s sVar = sVarArr[i6];
                if (sVar != null) {
                    sVar.q(f10);
                }
                i6++;
            }
            c1Var = c1Var.f187m;
        }
        z1[] z1VarArr = this.f480x;
        int length2 = z1VarArr.length;
        while (i6 < length2) {
            z1 z1Var = z1VarArr[i6];
            float f11 = o0Var.f11596a;
            ((g) z1Var.f516e).z(f3, f11);
            g gVar = (g) z1Var.f517f;
            if (gVar != null) {
                gVar.z(f3, f11);
            }
            i6++;
        }
    }

    public final void x0(int i6, int i10, List list) {
        boolean z10;
        boolean z11 = true;
        this.f461d0.f(1);
        r1 r1Var = this.P;
        r1Var.getClass();
        ArrayList arrayList = (ArrayList) r1Var.f379c;
        if (i6 >= 0 && i6 <= i10 && i10 <= arrayList.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        if (list.size() != i10 - i6) {
            z11 = false;
        }
        u1.c.b(z11);
        for (int i11 = i6; i11 < i10; i11++) {
            ((q1) arrayList.get(i11)).f366a.v((r1.e0) list.get(i11 - i6));
        }
        v(r1Var.c(), false);
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [db.e0, db.h0] */
    public final s1 y(q2.c0 c0Var, long j, long j10, long j11, boolean z10, int i6) {
        boolean z11;
        boolean z12;
        db.c1 c1Var;
        boolean z13;
        boolean z14;
        if (!this.f477u0 && j == this.f460c0.s && c0Var.equals(this.f460c0.f395b)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f477u0 = z11;
        P();
        s1 s1Var = this.f460c0;
        q2.k1 k1Var = s1Var.f401h;
        t2.w wVar = s1Var.f402i;
        List list = s1Var.j;
        if (this.P.f377a) {
            c1 c1Var2 = this.O.f236i;
            if (c1Var2 == null) {
                k1Var = q2.k1.f10907d;
            } else {
                k1Var = c1Var2.f188n;
            }
            if (c1Var2 == null) {
                wVar = this.B;
            } else {
                wVar = c1Var2.f189o;
            }
            t2.s[] sVarArr = wVar.f12564c;
            ?? e0Var = new db.e0(4);
            boolean z15 = false;
            for (t2.s sVar : sVarArr) {
                if (sVar != null) {
                    r1.j0 j0Var = sVar.h(0).f11668l;
                    if (j0Var == null) {
                        e0Var.a(new r1.j0(new r1.i0[0]));
                    } else {
                        e0Var.a(j0Var);
                        z15 = true;
                    }
                }
            }
            if (z15) {
                c1Var = e0Var.g();
            } else {
                db.i0 i0Var = db.k0.f4008y;
                c1Var = db.c1.B;
            }
            list = c1Var;
            if (c1Var2 != null) {
                d1 d1Var = c1Var2.f182g;
                if (d1Var.f199c != j10) {
                    c1Var2.f182g = d1Var.a(j10);
                }
            }
            z1[] z1VarArr = this.f480x;
            f1 f1Var = this.O;
            c1 c1Var3 = f1Var.f236i;
            if (c1Var3 == f1Var.j && c1Var3 != null) {
                t2.w wVar2 = c1Var3.f189o;
                int i10 = 0;
                boolean z16 = false;
                while (true) {
                    if (i10 < z1VarArr.length) {
                        if (wVar2.b(i10)) {
                            if (((g) z1VarArr[i10].f516e).f245y != 1) {
                                z13 = false;
                                break;
                            }
                            if (wVar2.f12563b[i10].f504a != 0) {
                                z16 = true;
                            }
                        }
                        i10++;
                    } else {
                        z13 = true;
                        break;
                    }
                }
                if (z16 && z13) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14 != this.o0) {
                    this.o0 = z14;
                    if (!z14 && this.f460c0.f408p) {
                        this.E.e(2);
                    }
                }
            }
        } else if (!c0Var.equals(s1Var.f395b)) {
            k1Var = q2.k1.f10907d;
            wVar = this.B;
            list = db.c1.B;
        }
        q2.k1 k1Var2 = k1Var;
        t2.w wVar3 = wVar;
        List list2 = list;
        if (z10) {
            t0 t0Var = this.f461d0;
            if (t0Var.f416d && t0Var.f417e != 5) {
                if (i6 == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                u1.c.b(z12);
            } else {
                t0Var.f415c = true;
                t0Var.f416d = true;
                t0Var.f417e = i6;
            }
        }
        s1 s1Var2 = this.f460c0;
        return s1Var2.d(c0Var, j, j10, j11, p(s1Var2.f409q), k1Var2, wVar3, list2);
    }

    public final void y0(int i6, int i10, int i11, boolean z10) {
        boolean z11;
        if (z10 && i6 != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i6 == -1) {
            i11 = 2;
        } else if (i11 == 2) {
            i11 = 1;
        }
        if (i6 == 0) {
            i10 = 1;
        } else if (i10 == 1) {
            i10 = 0;
        }
        s1 s1Var = this.f460c0;
        if (s1Var.f404l != z11 || s1Var.f406n != i10 || s1Var.f405m != i11) {
            this.f460c0 = s1Var.e(z11, i11, i10);
            B0(false, false);
            f1 f1Var = this.O;
            for (c1 c1Var = f1Var.f236i; c1Var != null; c1Var = c1Var.f187m) {
                for (t2.s sVar : c1Var.f189o.f12564c) {
                    if (sVar != null) {
                        sVar.f(z11);
                    }
                }
            }
            if (!q0()) {
                u0();
                z0();
                s1 s1Var2 = this.f460c0;
                if (s1Var2.f408p) {
                    this.f460c0 = s1Var2.i(false);
                }
                f1Var.m(this.f474r0);
                return;
            }
            int i12 = this.f460c0.f398e;
            u1.x xVar = this.E;
            if (i12 == 3) {
                m mVar = this.K;
                mVar.f315y = true;
                ((d2) mVar.f316z).b();
                s0();
                xVar.e(2);
                return;
            }
            if (i12 == 2) {
                xVar.e(2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v21, types: [q2.a0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z0() {
        /*
            Method dump skipped, instructions count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.w0.z0():void");
    }
}
