package n9;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.o4;
import com.google.android.gms.internal.measurement.s4;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n1 implements v1 {

    /* renamed from: b0, reason: collision with root package name */
    public static volatile n1 f9411b0;
    public final g A;
    public final c1 B;
    public final u0 C;
    public final l1 D;
    public final p3 E;
    public final j4 F;
    public final p0 G;
    public final a9.a H;
    public final x2 I;
    public final m2 J;
    public final b0 K;
    public final q2 L;
    public final String M;
    public o0 N;
    public h3 O;
    public r P;
    public m0 Q;
    public r2 R;
    public Boolean T;
    public long U;
    public volatile Boolean V;
    public volatile boolean W;
    public int X;
    public int Y;

    /* renamed from: a0, reason: collision with root package name */
    public final long f9412a0;

    /* renamed from: x, reason: collision with root package name */
    public final Context f9413x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f9414y;

    /* renamed from: z, reason: collision with root package name */
    public final w8.l f9415z;
    public boolean S = false;
    public final AtomicInteger Z = new AtomicInteger(0);

    /* JADX WARN: Type inference failed for: r3v6, types: [n9.g, e3.e] */
    /* JADX WARN: Type inference failed for: r5v2, types: [n9.u1, n9.q2] */
    public n1(b2 b2Var) {
        long currentTimeMillis;
        Context context = b2Var.f9188a;
        w8.l lVar = new w8.l(19);
        this.f9415z = lVar;
        a2.f9166k = lVar;
        this.f9413x = context;
        this.f9414y = b2Var.f9192e;
        this.V = b2Var.f9189b;
        this.M = b2Var.f9194g;
        this.W = true;
        if (o4.f2372h == null && context != null) {
            Object obj = o4.f2371g;
            synchronized (obj) {
                try {
                    if (o4.f2372h == null) {
                        synchronized (obj) {
                            com.google.android.gms.internal.measurement.f4 f4Var = o4.f2372h;
                            final Context applicationContext = context.getApplicationContext();
                            if (applicationContext == null) {
                                applicationContext = context;
                            }
                            if (f4Var != null) {
                                if (f4Var.f2205a != applicationContext) {
                                }
                            }
                            if (f4Var != null) {
                                com.google.android.gms.internal.measurement.g4.c();
                                s4.a();
                                com.google.android.gms.internal.measurement.j4.g();
                            }
                            o4.f2372h = new com.google.android.gms.internal.measurement.f4(applicationContext, lg.c.l(new cb.l() { // from class: com.google.android.gms.internal.measurement.r4
                                /* JADX WARN: Can't wrap try/catch for region: R(18:8|(4:10|(1:12)|13|14)|15|(4:17|(1:19)|13|14)|20|(2:22|(1:24))|25|26|27|28|29|30|31|(1:33)(1:84)|34|(9:36|37|38|39|40|(2:41|(3:43|(3:61|62|63)(7:45|46|(3:48|(1:59)|51)(1:60)|52|(1:54)(1:58)|55|56)|57)(1:64))|65|66|67)(1:83)|68|14) */
                                /* JADX WARN: Code restructure failed: missing block: B:86:0x0079, code lost:
                                
                                    r0 = move-exception;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:87:0x007a, code lost:
                                
                                    android.util.Log.e("HermeticFileOverrides", "no data dir", r0);
                                    r6 = cb.a.f2003x;
                                 */
                                /* JADX WARN: Finally extract failed */
                                @Override // cb.l
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final java.lang.Object get() {
                                    /*
                                        Method dump skipped, instructions count: 407
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.r4.get():java.lang.Object");
                                }
                            }));
                            o4.f2373i.incrementAndGet();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                } finally {
                }
            }
        }
        this.H = a9.a.f629a;
        Long l10 = b2Var.f9193f;
        if (l10 != null) {
            currentTimeMillis = l10.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        this.f9412a0 = currentTimeMillis;
        ?? eVar = new e3.e(this);
        eVar.B = zb.d.f15325y;
        this.A = eVar;
        c1 c1Var = new c1(this);
        c1Var.g1();
        this.B = c1Var;
        u0 u0Var = new u0(this);
        u0Var.g1();
        this.C = u0Var;
        j4 j4Var = new j4(this);
        j4Var.g1();
        this.F = j4Var;
        this.G = new p0(new k7.d(b2Var, this));
        this.K = new b0(this);
        x2 x2Var = new x2(this);
        x2Var.f1();
        this.I = x2Var;
        m2 m2Var = new m2(this);
        m2Var.f1();
        this.J = m2Var;
        p3 p3Var = new p3(this);
        p3Var.f1();
        this.E = p3Var;
        ?? u1Var = new u1(this);
        u1Var.g1();
        this.L = u1Var;
        l1 l1Var = new l1(this);
        l1Var.g1();
        this.D = l1Var;
        com.google.android.gms.internal.measurement.v0 v0Var = b2Var.f9191d;
        boolean z10 = v0Var == null || v0Var.f2466y == 0;
        if (context.getApplicationContext() instanceof Application) {
            f(m2Var);
            if (((n1) m2Var.f4301y).f9413x.getApplicationContext() instanceof Application) {
                Application application = (Application) ((n1) m2Var.f4301y).f9413x.getApplicationContext();
                if (m2Var.A == null) {
                    m2Var.A = new ic.i(m2Var);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(m2Var.A);
                    application.registerActivityLifecycleCallbacks(m2Var.A);
                    u0 u0Var2 = ((n1) m2Var.f4301y).C;
                    g(u0Var2);
                    u0Var2.L.a("Registered activity lifecycle callback");
                }
            }
        } else {
            g(u0Var);
            u0Var.G.a("Application context is not an Application");
        }
        l1Var.m1(new hb.s(this, b2Var, 13, false));
    }

    public static final void d(c0 c0Var) {
        if (c0Var != null) {
        } else {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void e(e3.e eVar) {
        if (eVar != null) {
        } else {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void f(g0 g0Var) {
        if (g0Var != null) {
            if (g0Var.f9322z) {
                return;
            } else {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(g0Var.getClass())));
            }
        }
        throw new IllegalStateException("Component not created");
    }

    public static final void g(u1 u1Var) {
        if (u1Var != null) {
            if (u1Var.f9493z) {
                return;
            } else {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(u1Var.getClass())));
            }
        }
        throw new IllegalStateException("Component not created");
    }

    public static n1 m(Context context, com.google.android.gms.internal.measurement.v0 v0Var, Long l10) {
        Bundle bundle;
        if (v0Var != null) {
            Bundle bundle2 = v0Var.A;
            v0Var = new com.google.android.gms.internal.measurement.v0(v0Var.f2465x, v0Var.f2466y, v0Var.f2467z, bundle2, null);
        }
        w8.x.g(context);
        w8.x.g(context.getApplicationContext());
        if (f9411b0 == null) {
            synchronized (n1.class) {
                try {
                    if (f9411b0 == null) {
                        f9411b0 = new n1(new b2(context, v0Var, l10));
                    }
                } finally {
                }
            }
        } else if (v0Var != null && (bundle = v0Var.A) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            w8.x.g(f9411b0);
            f9411b0.V = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        w8.x.g(f9411b0);
        return f9411b0;
    }

    @Override // n9.v1
    public final l1 D() {
        l1 l1Var = this.D;
        g(l1Var);
        return l1Var;
    }

    @Override // n9.v1
    public final a9.a D0() {
        return this.H;
    }

    @Override // n9.v1
    public final w8.l Q() {
        return this.f9415z;
    }

    public final boolean a() {
        if (b() == 0) {
            return true;
        }
        return false;
    }

    public final int b() {
        Boolean bool;
        l1 l1Var = this.D;
        g(l1Var);
        l1Var.d1();
        g gVar = this.A;
        if (gVar.q1()) {
            return 1;
        }
        g(l1Var);
        l1Var.d1();
        if (this.W) {
            c1 c1Var = this.B;
            e(c1Var);
            c1Var.d1();
            if (c1Var.h1().contains("measurement_enabled")) {
                bool = Boolean.valueOf(c1Var.h1().getBoolean("measurement_enabled", true));
            } else {
                bool = null;
            }
            if (bool != null) {
                if (!bool.booleanValue()) {
                    return 3;
                }
                return 0;
            }
            w8.l lVar = ((n1) gVar.f4301y).f9415z;
            Boolean p12 = gVar.p1("firebase_analytics_collection_enabled");
            if (p12 != null) {
                if (!p12.booleanValue()) {
                    return 4;
                }
                return 0;
            }
            if (this.V != null && !this.V.booleanValue()) {
                return 7;
            }
            return 0;
        }
        return 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r7.U) > 1000) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            r7 = this;
            boolean r0 = r7.S
            if (r0 == 0) goto L96
            n9.l1 r0 = r7.D
            g(r0)
            r0.d1()
            java.lang.Boolean r0 = r7.T
            a9.a r1 = r7.H
            if (r0 == 0) goto L34
            long r2 = r7.U
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L34
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L8f
            r1.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r7.U
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L8f
        L34:
            r1.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.U = r0
            n9.j4 r0 = r7.F
            e(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.B1(r1)
            r2 = 0
            if (r1 == 0) goto L75
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.B1(r1)
            if (r1 == 0) goto L75
            android.content.Context r1 = r7.f9413x
            c9.b r3 = c9.c.a(r1)
            boolean r3 = r3.c()
            r4 = 1
            if (r3 != 0) goto L74
            n9.g r3 = r7.A
            boolean r3 = r3.g1()
            if (r3 != 0) goto L74
            boolean r3 = n9.j4.U1(r1)
            if (r3 == 0) goto L75
            boolean r1 = n9.j4.w1(r1)
            if (r1 == 0) goto L75
        L74:
            r2 = 1
        L75:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r7.T = r1
            if (r2 == 0) goto L8f
            n9.m0 r1 = r7.l()
            java.lang.String r1 = r1.k1()
            boolean r0 = r0.h1(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.T = r0
        L8f:
            java.lang.Boolean r0 = r7.T
            boolean r0 = r0.booleanValue()
            return r0
        L96:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.n1.c():boolean");
    }

    public final p0 h() {
        return this.G;
    }

    public final o0 i() {
        f(this.N);
        return this.N;
    }

    public final h3 j() {
        f(this.O);
        return this.O;
    }

    public final r k() {
        g(this.P);
        return this.P;
    }

    public final m0 l() {
        f(this.Q);
        return this.Q;
    }

    @Override // n9.v1
    public final Context o0() {
        return this.f9413x;
    }

    @Override // n9.v1
    public final u0 r() {
        u0 u0Var = this.C;
        g(u0Var);
        return u0Var;
    }
}
