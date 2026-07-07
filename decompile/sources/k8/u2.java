package k8;

import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u2 extends h0 {
    public final CopyOnWriteArraySet A;
    public boolean B;
    public final AtomicReference C;
    public final Object D;
    public boolean E;
    public int F;
    public j2 G;
    public j2 H;
    public PriorityQueue I;
    public d2 J;
    public final AtomicLong K;
    public long L;
    public final k4 M;
    public boolean N;
    public j2 O;
    public t2 P;
    public j2 Q;
    public final s5.c R;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public r2 f7784y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public k2 f7785z;

    public u2(p1 p1Var) {
        super(p1Var);
        this.A = new CopyOnWriteArraySet();
        this.D = new Object();
        this.E = false;
        this.F = 1;
        this.N = true;
        this.R = new s5.c(29, this);
        this.C = new AtomicReference();
        this.J = d2.f7439c;
        this.L = -1L;
        this.K = new AtomicLong(0L);
        this.M = new k4(p1Var);
    }

    @Override // k8.h0
    public final boolean G() {
        return false;
    }

    public final void H(String str, String str2, Bundle bundle) {
        long jElapsedRealtime;
        p1 p1Var = (p1) this.f2053w;
        p1Var.F.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (p1Var.f7695y.O(null, f0.f7493f1)) {
            p1Var.F.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        I(str, str2, bundle, true, true, jCurrentTimeMillis, jElapsedRealtime);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r6 > 500) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        if (r7 > 500) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, boolean r23, boolean r24, long r25, long r27) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.u2.I(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.u2.J():void");
    }

    public final void K(String str, String str2, Bundle bundle) {
        long jElapsedRealtime;
        D();
        p1 p1Var = (p1) this.f2053w;
        p1Var.F.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (p1Var.f7695y.O(null, f0.f7493f1)) {
            p1Var.F.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        L(jCurrentTimeMillis, jElapsedRealtime, bundle, str, str2);
    }

    public final void L(long j8, long j9, Bundle bundle, String str, String str2) {
        D();
        boolean z2 = true;
        if (this.f7785z != null && !t4.i0(str2)) {
            z2 = false;
        }
        M(str, str2, j8, j9, bundle, true, z2, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014c  */
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
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(java.lang.String r26, java.lang.String r27, long r28, long r30, android.os.Bundle r32, boolean r33, boolean r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 1276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.u2.M(java.lang.String, java.lang.String, long, long, android.os.Bundle, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N(java.lang.String r12, java.lang.String r13, java.lang.Object r14, boolean r15, long r16) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.u2.N(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O(long r20, java.lang.Object r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.u2.O(long, java.lang.Object, java.lang.String, java.lang.String):void");
    }

    public final void P() {
        D();
        E();
        p1 p1Var = (p1) this.f2053w;
        if (p1Var.h()) {
            g gVar = p1Var.f7695y;
            ((p1) gVar.f2053w).getClass();
            Boolean boolQ = gVar.Q("google_analytics_deferred_deep_link_enabled");
            if (boolQ != null && boolQ.booleanValue()) {
                v0 v0Var = p1Var.A;
                p1.l(v0Var);
                v0Var.I.a("Deferred Deep Link feature enabled.");
                n1 n1Var = p1Var.B;
                p1.l(n1Var);
                n1Var.M(new i2(this, 2));
            }
            p3 p3VarO = p1Var.o();
            p3VarO.D();
            p3VarO.E();
            v4 v4VarT = p3VarO.T(true);
            p3VarO.P();
            p1 p1Var2 = (p1) p3VarO.f2053w;
            p1Var2.f7695y.O(null, f0.X0);
            p1Var2.n().K(3, new byte[0]);
            p3VarO.R(new k3(p3VarO, v4VarT, 1));
            this.N = false;
            d1 d1Var = p1Var.f7696z;
            p1.j(d1Var);
            d1Var.D();
            String string = d1Var.H().getString("previous_os_version", null);
            ((p1) d1Var.f2053w).p().F();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = d1Var.H().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            p1Var.p().F();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            K("auto", "_ou", bundle);
        }
    }

    public final void Q(Bundle bundle, long j8) {
        p1 p1Var = (p1) this.f2053w;
        t7.y.g(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.E.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        e2.e(bundle2, "app_id", String.class, null);
        e2.e(bundle2, "origin", String.class, null);
        e2.e(bundle2, "name", String.class, null);
        e2.e(bundle2, "value", Object.class, null);
        e2.e(bundle2, "trigger_event_name", String.class, null);
        e2.e(bundle2, "trigger_timeout", Long.class, 0L);
        e2.e(bundle2, "timed_out_event_name", String.class, null);
        e2.e(bundle2, "timed_out_event_params", Bundle.class, null);
        e2.e(bundle2, "triggered_event_name", String.class, null);
        e2.e(bundle2, "triggered_event_params", Bundle.class, null);
        e2.e(bundle2, "time_to_live", Long.class, 0L);
        e2.e(bundle2, "expired_event_name", String.class, null);
        e2.e(bundle2, "expired_event_params", Bundle.class, null);
        t7.y.d(bundle2.getString("name"));
        t7.y.d(bundle2.getString("origin"));
        t7.y.g(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j8);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        t4 t4Var = p1Var.D;
        q0 q0Var = p1Var.E;
        v0 v0Var2 = p1Var.A;
        p1.j(t4Var);
        if (t4Var.N0(string) != 0) {
            p1.l(v0Var2);
            v0Var2.B.b(q0Var.c(string), "Invalid conditional user property name");
            return;
        }
        p1.j(t4Var);
        if (t4Var.S(obj, string) != 0) {
            p1.l(v0Var2);
            v0Var2.B.c(q0Var.c(string), obj, "Invalid conditional user property value");
            return;
        }
        Object objT = t4Var.T(obj, string);
        if (objT == null) {
            p1.l(v0Var2);
            v0Var2.B.c(q0Var.c(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        e2.c(bundle2, objT);
        long j9 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j9 > 15552000000L || j9 < 1)) {
            p1.l(v0Var2);
            v0Var2.B.c(q0Var.c(string), Long.valueOf(j9), "Invalid conditional user property timeout");
            return;
        }
        long j10 = bundle2.getLong("time_to_live");
        if (j10 > 15552000000L || j10 < 1) {
            p1.l(v0Var2);
            v0Var2.B.c(q0Var.c(string), Long.valueOf(j10), "Invalid conditional user property time to live");
        } else {
            n1 n1Var = p1Var.B;
            p1.l(n1Var);
            n1Var.M(new p2(this, bundle2, 0));
        }
    }

    public final void R(String str, String str2, Bundle bundle) {
        p1 p1Var = (p1) this.f2053w;
        p1Var.F.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        t7.y.d(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        n1 n1Var = p1Var.B;
        p1.l(n1Var);
        n1Var.M(new p2(this, bundle2, 1));
    }

    public final String S() {
        p1 p1Var = (p1) this.f2053w;
        try {
            return e2.b(p1Var.f7692v, p1Var.K);
        } catch (IllegalStateException e7) {
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.B.b(e7, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void T(d2 d2Var, long j8, boolean z2) {
        int i = d2Var.f7441b;
        D();
        E();
        p1 p1Var = (p1) this.f2053w;
        d1 d1Var = p1Var.f7696z;
        v0 v0Var = p1Var.A;
        p1.j(d1Var);
        d2 d2VarK = d1Var.K();
        if (j8 <= this.L && d2.l(d2VarK.f7441b, i)) {
            p1.l(v0Var);
            v0Var.H.b(d2Var, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        d1 d1Var2 = p1Var.f7696z;
        p1.j(d1Var2);
        d1Var2.D();
        if (!d2.l(i, d1Var2.H().getInt("consent_source", 100))) {
            p1.l(v0Var);
            v0Var.H.b(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = d1Var2.H().edit();
        editorEdit.putString("consent_settings", d2Var.g());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        p1.l(v0Var);
        v0Var.J.b(d2Var, "Setting storage consent(FE)");
        this.L = j8;
        if (p1Var.o().N()) {
            p3 p3VarO = p1Var.o();
            p3VarO.D();
            p3VarO.E();
            p3VarO.R(new n3(p3VarO, 2));
        } else {
            p3 p3VarO2 = p1Var.o();
            p3VarO2.D();
            p3VarO2.E();
            if (p3VarO2.M()) {
                p3VarO2.R(new k3(p3VarO2, p3VarO2.T(false)));
            }
        }
        if (z2) {
            p1Var.o().H(new AtomicReference());
        }
    }

    public final void U(Boolean bool, boolean z2) {
        D();
        E();
        p1 p1Var = (p1) this.f2053w;
        v0 v0Var = p1Var.A;
        p1.l(v0Var);
        v0Var.I.b(bool, "Setting app measurement enabled (FE)");
        d1 d1Var = p1Var.f7696z;
        p1.j(d1Var);
        d1Var.D();
        SharedPreferences.Editor editorEdit = d1Var.H().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z2) {
            d1Var.D();
            SharedPreferences.Editor editorEdit2 = d1Var.H().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        n1 n1Var = p1Var.B;
        p1.l(n1Var);
        n1Var.D();
        if (p1Var.U || !(bool == null || bool.booleanValue())) {
            V();
        }
    }

    public final void V() {
        D();
        p1 p1Var = (p1) this.f2053w;
        d1 d1Var = p1Var.f7696z;
        v0 v0Var = p1Var.A;
        x7.a aVar = p1Var.F;
        p1.j(d1Var);
        String strS = d1Var.I.s();
        if (strS != null) {
            if ("unset".equals(strS)) {
                aVar.getClass();
                O(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strS) ? 0L : 1L);
                aVar.getClass();
                O(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        if (!p1Var.b() || !this.N) {
            p1.l(v0Var);
            v0Var.I.a("Updating Scion state (FE)");
            p3 p3VarO = p1Var.o();
            p3VarO.D();
            p3VarO.E();
            p3VarO.R(new k3(p3VarO, p3VarO.T(true), 3));
            return;
        }
        p1.l(v0Var);
        v0Var.I.a("Recording app launch after enabling measurement for the first time (FE)");
        P();
        x3 x3Var = p1Var.C;
        p1.k(x3Var);
        x3Var.A.Q();
        n1 n1Var = p1Var.B;
        p1.l(n1Var);
        n1Var.M(new i2(this, 1));
    }

    public final void W() {
        p1 p1Var = (p1) this.f2053w;
        if (!(p1Var.f7692v.getApplicationContext() instanceof Application) || this.f7784y == null) {
            return;
        }
        ((Application) p1Var.f7692v.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f7784y);
    }

    public final void X(Bundle bundle, int i, long j8) throws Throwable {
        Boolean bool;
        String string;
        a2 a2Var;
        p1 p1Var = (p1) this.f2053w;
        E();
        d2 d2Var = d2.f7439c;
        c2[] c2VarArr = b2.STORAGE.f7402v;
        int length = c2VarArr.length;
        int i10 = 0;
        while (true) {
            bool = null;
            if (i10 >= length) {
                string = null;
                break;
            }
            String str = c2VarArr[i10].f7426v;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if ((string.equals("granted") ? Boolean.TRUE : string.equals("denied") ? Boolean.FALSE : null) == null) {
                    break;
                }
            }
            i10++;
        }
        if (string != null) {
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.G.b(string, "Ignoring invalid consent setting");
            v0 v0Var2 = p1Var.A;
            p1.l(v0Var2);
            v0Var2.G.a("Valid consent values are 'granted', 'denied'");
        }
        n1 n1Var = p1Var.B;
        p1.l(n1Var);
        boolean zJ = n1Var.J();
        d2 d2VarB = d2.b(i, bundle);
        Iterator it = d2VarB.f7440a.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            a2Var = a2.f7373w;
            if (!zHasNext) {
                break;
            } else if (((a2) it.next()) != a2Var) {
                Z(d2VarB, zJ);
                break;
            }
        }
        p pVarC = p.c(i, bundle);
        Iterator it2 = pVarC.f7688e.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((a2) it2.next()) != a2Var) {
                Y(pVarC, zJ);
                break;
            }
        }
        if (bundle != null) {
            int iOrdinal = d2.d(bundle.getString("ad_personalization")).ordinal();
            if (iOrdinal == 2) {
                bool = Boolean.FALSE;
            } else if (iOrdinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str2 = i == -30 ? "tcf" : "app";
            if (zJ) {
                O(j8, bool.toString(), str2, "allow_personalized_ads");
            } else {
                N(str2, "allow_personalized_ads", bool.toString(), false, j8);
            }
        }
    }

    public final void Y(p pVar, boolean z2) {
        da.m0 m0Var = new da.m0(this, pVar, false, 13);
        if (z2) {
            D();
            m0Var.run();
        } else {
            n1 n1Var = ((p1) this.f2053w).B;
            p1.l(n1Var);
            n1Var.M(m0Var);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:69:0x0115
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void Z(k8.d2 r14, boolean r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.u2.Z(k8.d2, boolean):void");
    }

    public final void a0() {
        com.google.android.gms.internal.measurement.t4.a();
        p1 p1Var = (p1) this.f2053w;
        g gVar = p1Var.f7695y;
        n1 n1Var = p1Var.B;
        v0 v0Var = p1Var.A;
        if (gVar.O(null, f0.Q0)) {
            p1.l(n1Var);
            if (n1Var.J()) {
                p1.l(v0Var);
                v0Var.B.a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (oa.b.r()) {
                p1.l(v0Var);
                v0Var.B.a("Cannot get trigger URIs from main thread");
                return;
            }
            E();
            p1.l(v0Var);
            v0Var.J.a("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            p1.l(n1Var);
            n1Var.N(atomicReference, 10000L, "get trigger URIs", new o2(this, atomicReference, 5, false));
            List list = (List) atomicReference.get();
            if (list == null) {
                p1.l(v0Var);
                v0Var.D.a("Timed out waiting for get trigger URIs");
            } else {
                p1.l(n1Var);
                n1Var.M(new da.m0(15, this, list));
            }
        }
    }

    public final PriorityQueue b0() {
        if (this.I == null) {
            s2 s2Var = s2.f7761a;
            this.I = h.v.r(Comparator.comparing(s2.f7761a, f0.h.f5119w));
        }
        return this.I;
    }

    public final void c0() {
        b4 b4Var;
        D();
        if (b0().isEmpty() || this.E || (b4Var = (b4) b0().poll()) == null) {
            return;
        }
        p1 p1Var = (p1) this.f2053w;
        t4 t4Var = p1Var.D;
        p1.j(t4Var);
        k4.a aVarA0 = t4Var.a0();
        if (aVarA0 != null) {
            this.E = true;
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            t0 t0Var = v0Var.J;
            String str = b4Var.f7408v;
            t0Var.b(str, "Registering trigger URI");
            ListenableFuture listenableFutureE = aVarA0.e(Uri.parse(str));
            if (listenableFutureE == null) {
                this.E = false;
                b0().add(b4Var);
            } else {
                int i = 0;
                listenableFutureE.f(new da.m0(i, listenableFutureE, new k2(i, this, b4Var)), new a7.s(1, this));
            }
        }
    }

    public final void d0(d2 d2Var) {
        D();
        boolean z2 = (d2Var.i(c2.f7423x) && d2Var.i(c2.f7422w)) || ((p1) this.f2053w).o().M();
        p1 p1Var = (p1) this.f2053w;
        n1 n1Var = p1Var.B;
        p1.l(n1Var);
        n1Var.D();
        if (z2 != p1Var.U) {
            n1 n1Var2 = p1Var.B;
            p1.l(n1Var2);
            n1Var2.D();
            p1Var.U = z2;
            d1 d1Var = ((p1) this.f2053w).f7696z;
            p1.j(d1Var);
            d1Var.D();
            Boolean boolValueOf = d1Var.H().contains("measurement_enabled_from_api") ? Boolean.valueOf(d1Var.H().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z2 || boolValueOf == null || boolValueOf.booleanValue()) {
                U(Boolean.valueOf(z2), false);
            }
        }
    }
}
