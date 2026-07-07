package k8;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.f6;
import com.google.android.gms.internal.measurement.gb;
import com.google.android.gms.internal.measurement.h7;
import com.google.android.gms.internal.measurement.hb;
import com.google.android.gms.internal.measurement.nb;
import com.google.android.gms.internal.measurement.ob;
import com.google.android.gms.internal.measurement.ub;
import com.google.android.gms.internal.measurement.wb;
import com.google.android.gms.internal.measurement.ya;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p1 implements z1 {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static volatile p1 f7691a0;
    public final v0 A;
    public final n1 B;
    public final x3 C;
    public final t4 D;
    public final q0 E;
    public final x7.a F;
    public final f3 G;
    public final u2 H;
    public final y I;
    public final y2 J;
    public final String K;
    public p0 L;
    public p3 M;
    public q N;
    public n0 O;
    public z2 P;
    public Boolean R;
    public long S;
    public volatile Boolean T;
    public volatile boolean U;
    public int V;
    public int W;
    public final long Y;
    public final long Z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Context f7692v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f7693w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final oa.b f7694x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g f7695y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final d1 f7696z;
    public boolean Q = false;
    public final AtomicInteger X = new AtomicInteger(0);

    public p1(h2 h2Var) {
        Context applicationContext;
        long jCurrentTimeMillis;
        long jElapsedRealtime;
        Context context = h2Var.f7562a;
        oa.b bVar = new oa.b(16);
        this.f7694x = bVar;
        e2.f7471n = bVar;
        this.f7692v = context;
        this.f7693w = h2Var.f7566e;
        this.T = h2Var.f7563b;
        this.K = h2Var.f7568h;
        this.U = true;
        if (ub.f3138b == null && context != null) {
            Object obj = ub.f3137a;
            synchronized (obj) {
                try {
                    if (ub.f3138b == null) {
                        synchronized (obj) {
                            gb gbVar = ub.f3138b;
                            Context applicationContext2 = context.getApplicationContext();
                            if (applicationContext2 == null) {
                                applicationContext2 = context;
                            }
                            if (gbVar == null || gbVar.f2660a != applicationContext2) {
                                if (gbVar != null) {
                                    Iterator it = hb.f2691a.values().iterator();
                                    if (it.hasNext()) {
                                        if (it.next() != null) {
                                            throw new ClassCastException();
                                        }
                                        throw null;
                                    }
                                    wb.a();
                                }
                                ub.f3138b = new gb(applicationContext2, u1.c.z(new ob(applicationContext2, 2)));
                                ub.f3139c.incrementAndGet();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                } finally {
                }
            }
        }
        this.F = x7.a.f14252a;
        ya yaVar = new ya(context, com.google.android.gms.internal.measurement.e1.f2594v, r7.b.f11341a, r7.e.f11343c);
        String strConcat = "com.google.android.gms.measurement#".concat(String.valueOf(context.getPackageName()));
        com.bumptech.glide.manager.t tVarB = com.bumptech.glide.manager.t.b();
        tVarB.f2438x = new f6(2, strConcat, new String[0]);
        yaVar.b(0, tVarB.a());
        AtomicReference atomicReference = nb.f2920k;
        if (atomicReference.get() == null) {
            try {
                applicationContext = context.getApplicationContext();
            } catch (NullPointerException unused) {
                nb.b();
                com.google.android.gms.internal.measurement.e1.i(Level.WARNING, (Executor) nb.f2922m.get(), null, "context.getApplicationContext() yielded NullPointerException", new Object[0]);
                applicationContext = null;
            }
            if (applicationContext != null) {
                while (!atomicReference.compareAndSet(null, applicationContext) && atomicReference.get() == null) {
                }
            }
        }
        Long l10 = h2Var.f;
        if (l10 != null) {
            jCurrentTimeMillis = l10.longValue();
        } else {
            this.F.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.Y = jCurrentTimeMillis;
        Long l11 = h2Var.f7567g;
        if (l11 != null) {
            jElapsedRealtime = l11.longValue();
        } else {
            this.F.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.Z = jElapsedRealtime;
        g gVar = new g(this);
        gVar.f7543z = t7.k.f12375x;
        this.f7695y = gVar;
        d1 d1Var = new d1(this);
        d1Var.G();
        this.f7696z = d1Var;
        v0 v0Var = new v0(this);
        v0Var.G();
        this.A = v0Var;
        t4 t4Var = new t4(this);
        t4Var.G();
        this.D = t4Var;
        this.E = new q0(new g2(h2Var, this));
        this.I = new y(this);
        f3 f3Var = new f3(this);
        f3Var.F();
        this.G = f3Var;
        u2 u2Var = new u2(this);
        u2Var.F();
        this.H = u2Var;
        x3 x3Var = new x3(this);
        x3Var.F();
        this.C = x3Var;
        y2 y2Var = new y2(this);
        y2Var.G();
        this.J = y2Var;
        n1 n1Var = new n1(this);
        n1Var.G();
        this.B = n1Var;
        h7 h7Var = h2Var.f7565d;
        boolean z2 = h7Var == null || h7Var.f2687w == 0;
        if (this.f7692v.getApplicationContext() instanceof Application) {
            k(u2Var);
            if (((p1) u2Var.f2053w).f7692v.getApplicationContext() instanceof Application) {
                Application application = (Application) ((p1) u2Var.f2053w).f7692v.getApplicationContext();
                if (u2Var.f7784y == null) {
                    u2Var.f7784y = new r2(u2Var);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(u2Var.f7784y);
                    application.registerActivityLifecycleCallbacks(u2Var.f7784y);
                    v0 v0Var2 = ((p1) u2Var.f2053w).A;
                    l(v0Var2);
                    v0Var2.J.a("Registered activity lifecycle callback");
                }
            }
        } else {
            l(v0Var);
            v0Var.E.a("Application context is not an Application");
        }
        n1Var.M(new da.m0(this, h2Var, false, 9));
    }

    public static final void i(d0 d0Var) {
        if (d0Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void j(c3.e eVar) {
        if (eVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void k(h0 h0Var) {
        if (h0Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!h0Var.f7558x) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(h0Var.getClass())));
        }
    }

    public static final void l(y1 y1Var) {
        if (y1Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!y1Var.f7851x) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(y1Var.getClass())));
        }
    }

    public static p1 r(Context context, h7 h7Var, Long l10, Long l11) {
        Bundle bundle;
        if (h7Var != null) {
            Bundle bundle2 = h7Var.f2689y;
            h7Var = new h7(h7Var.f2686v, h7Var.f2687w, h7Var.f2688x, bundle2, null);
        }
        t7.y.g(context);
        t7.y.g(context.getApplicationContext());
        if (f7691a0 == null) {
            synchronized (p1.class) {
                try {
                    if (f7691a0 == null) {
                        f7691a0 = new p1(new h2(context, h7Var, l10, l11));
                    }
                } finally {
                }
            }
        } else if (h7Var != null && (bundle = h7Var.f2689y) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            t7.y.g(f7691a0);
            f7691a0.T = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        t7.y.g(f7691a0);
        return f7691a0;
    }

    @Override // k8.z1
    public final oa.b a() {
        return this.f7694x;
    }

    public final boolean b() {
        return f() == 0;
    }

    @Override // k8.z1
    public final v0 c() {
        v0 v0Var = this.A;
        l(v0Var);
        return v0Var;
    }

    @Override // k8.z1
    public final n1 d() {
        n1 n1Var = this.B;
        l(n1Var);
        return n1Var;
    }

    @Override // k8.z1
    public final Context e() {
        return this.f7692v;
    }

    public final int f() {
        n1 n1Var = this.B;
        l(n1Var);
        n1Var.D();
        g gVar = this.f7695y;
        if (gVar.R()) {
            return 1;
        }
        l(n1Var);
        n1Var.D();
        if (!this.U) {
            return 8;
        }
        d1 d1Var = this.f7696z;
        j(d1Var);
        d1Var.D();
        Boolean boolValueOf = d1Var.H().contains("measurement_enabled") ? Boolean.valueOf(d1Var.H().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        oa.b bVar = ((p1) gVar.f2053w).f7694x;
        Boolean boolQ = gVar.Q("firebase_analytics_collection_enabled");
        return boolQ != null ? boolQ.booleanValue() ? 0 : 4 : (this.T == null || this.T.booleanValue()) ? 0 : 7;
    }

    @Override // k8.z1
    public final x7.a g() {
        return this.F;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h() {
        /*
            r6 = this;
            boolean r0 = r6.Q
            if (r0 == 0) goto L96
            k8.n1 r0 = r6.B
            l(r0)
            r0.D()
            java.lang.Boolean r0 = r6.R
            x7.a r1 = r6.F
            if (r0 == 0) goto L34
            long r2 = r6.S
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L34
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L8f
            r1.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.S
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L8f
        L34:
            r1.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.S = r0
            k8.t4 r0 = r6.D
            j(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.h0(r1)
            r2 = 0
            if (r1 == 0) goto L75
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.h0(r1)
            if (r1 == 0) goto L75
            android.content.Context r1 = r6.f7692v
            androidx.emoji2.text.p r3 = z7.c.a(r1)
            boolean r3 = r3.d()
            r4 = 1
            if (r3 != 0) goto L74
            k8.g r3 = r6.f7695y
            boolean r3 = r3.G()
            if (r3 != 0) goto L74
            boolean r3 = k8.t4.z0(r1)
            if (r3 == 0) goto L75
            boolean r1 = k8.t4.Y(r1)
            if (r1 == 0) goto L75
        L74:
            r2 = r4
        L75:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r6.R = r1
            if (r2 == 0) goto L8f
            k8.n0 r1 = r6.q()
            java.lang.String r1 = r1.K()
            boolean r0 = r0.J(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.R = r0
        L8f:
            java.lang.Boolean r0 = r6.R
            boolean r0 = r0.booleanValue()
            return r0
        L96:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.p1.h():boolean");
    }

    public final q0 m() {
        return this.E;
    }

    public final p0 n() {
        k(this.L);
        return this.L;
    }

    public final p3 o() {
        k(this.M);
        return this.M;
    }

    public final q p() {
        l(this.N);
        return this.N;
    }

    public final n0 q() {
        k(this.O);
        return this.O;
    }
}
