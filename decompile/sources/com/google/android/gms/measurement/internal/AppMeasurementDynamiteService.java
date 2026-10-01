package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.k0;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.internal.measurement.p0;
import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.internal.measurement.s0;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.x0;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.services.UnityAdsConstants;
import d9.a;
import d9.b;
import f6.p;
import hb.s;
import ic.i;
import j1.f0;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import n9.a2;
import n9.b0;
import n9.e2;
import n9.f2;
import n9.h2;
import n9.i2;
import n9.j;
import n9.j4;
import n9.k4;
import n9.l1;
import n9.m0;
import n9.m1;
import n9.m2;
import n9.n1;
import n9.q2;
import n9.s2;
import n9.u;
import n9.u0;
import n9.u2;
import n9.v;
import n9.w3;
import n9.x2;
import n9.y3;
import v.e;
import v.l;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends k0 {

    /* renamed from: e, reason: collision with root package name */
    public n1 f2557e;

    /* renamed from: f, reason: collision with root package name */
    public final e f2558f;

    /* JADX WARN: Type inference failed for: r0v2, types: [v.l, v.e] */
    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.f2557e = null;
        this.f2558f = new l(0);
    }

    public final void J(String str, n0 n0Var) {
        d();
        j4 j4Var = this.f2557e.F;
        n1.e(j4Var);
        j4Var.M1(str, n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void beginAdUnitExposure(String str, long j) {
        d();
        b0 b0Var = this.f2557e.K;
        n1.d(b0Var);
        b0Var.e1(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        d();
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        m2Var.r1(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void clearMeasurementEnabled(long j) {
        d();
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        m2Var.e1();
        l1 l1Var = ((n1) m2Var.f4301y).D;
        n1.g(l1Var);
        l1Var.m1(new s(m2Var, null, 16, false));
    }

    public final void d() {
        if (this.f2557e != null) {
        } else {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void endAdUnitExposure(String str, long j) {
        d();
        b0 b0Var = this.f2557e.K;
        n1.d(b0Var);
        b0Var.f1(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void generateEventId(n0 n0Var) {
        d();
        j4 j4Var = this.f2557e.F;
        n1.e(j4Var);
        long a22 = j4Var.a2();
        d();
        j4 j4Var2 = this.f2557e.F;
        n1.e(j4Var2);
        j4Var2.N1(n0Var, a22);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getAppInstanceId(n0 n0Var) {
        d();
        l1 l1Var = this.f2557e.D;
        n1.g(l1Var);
        l1Var.m1(new m1(this, n0Var, 0));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getCachedAppInstanceId(n0 n0Var) {
        d();
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        J((String) m2Var.E.get(), n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getConditionalUserProperties(String str, String str2, n0 n0Var) {
        d();
        l1 l1Var = this.f2557e.D;
        n1.g(l1Var);
        l1Var.m1(new p(this, n0Var, str, str2, 5));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getCurrentScreenClass(n0 n0Var) {
        String str;
        d();
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        x2 x2Var = ((n1) m2Var.f4301y).I;
        n1.f(x2Var);
        u2 u2Var = x2Var.A;
        if (u2Var != null) {
            str = u2Var.f9495b;
        } else {
            str = null;
        }
        J(str, n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getCurrentScreenName(n0 n0Var) {
        String str;
        d();
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        x2 x2Var = ((n1) m2Var.f4301y).I;
        n1.f(x2Var);
        u2 u2Var = x2Var.A;
        if (u2Var != null) {
            str = u2Var.f9494a;
        } else {
            str = null;
        }
        J(str, n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getGmpAppId(n0 n0Var) {
        String str;
        d();
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        n1 n1Var = (n1) m2Var.f4301y;
        try {
            str = a2.b(n1Var.f9413x, n1Var.M);
        } catch (IllegalStateException e10) {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.D.b(e10, "getGoogleAppId failed with exception");
            str = null;
        }
        J(str, n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getMaxUserProperties(String str, n0 n0Var) {
        d();
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        x.d(str);
        ((n1) m2Var.f4301y).getClass();
        d();
        j4 j4Var = this.f2557e.F;
        n1.e(j4Var);
        j4Var.O1(n0Var, 25);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getSessionId(n0 n0Var) {
        d();
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        l1 l1Var = ((n1) m2Var.f4301y).D;
        n1.g(l1Var);
        l1Var.m1(new s(m2Var, n0Var));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getTestFlag(n0 n0Var, int i6) {
        d();
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            return;
                        }
                        j4 j4Var = this.f2557e.F;
                        n1.e(j4Var);
                        m2 m2Var = this.f2557e.J;
                        n1.f(m2Var);
                        AtomicReference atomicReference = new AtomicReference();
                        l1 l1Var = ((n1) m2Var.f4301y).D;
                        n1.g(l1Var);
                        j4Var.Q1(n0Var, ((Boolean) l1Var.n1(atomicReference, 15000L, "boolean test flag value", new h2(m2Var, atomicReference, 0))).booleanValue());
                        return;
                    }
                    j4 j4Var2 = this.f2557e.F;
                    n1.e(j4Var2);
                    m2 m2Var2 = this.f2557e.J;
                    n1.f(m2Var2);
                    AtomicReference atomicReference2 = new AtomicReference();
                    l1 l1Var2 = ((n1) m2Var2.f4301y).D;
                    n1.g(l1Var2);
                    j4Var2.O1(n0Var, ((Integer) l1Var2.n1(atomicReference2, 15000L, "int test flag value", new h2(m2Var2, atomicReference2, 3))).intValue());
                    return;
                }
                j4 j4Var3 = this.f2557e.F;
                n1.e(j4Var3);
                m2 m2Var3 = this.f2557e.J;
                n1.f(m2Var3);
                AtomicReference atomicReference3 = new AtomicReference();
                l1 l1Var3 = ((n1) m2Var3.f4301y).D;
                n1.g(l1Var3);
                double doubleValue = ((Double) l1Var3.n1(atomicReference3, 15000L, "double test flag value", new h2(m2Var3, atomicReference3, 4))).doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, doubleValue);
                try {
                    n0Var.w(bundle);
                    return;
                } catch (RemoteException e10) {
                    u0 u0Var = ((n1) j4Var3.f4301y).C;
                    n1.g(u0Var);
                    u0Var.G.b(e10, "Error returning double value to wrapper");
                    return;
                }
            }
            j4 j4Var4 = this.f2557e.F;
            n1.e(j4Var4);
            m2 m2Var4 = this.f2557e.J;
            n1.f(m2Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            l1 l1Var4 = ((n1) m2Var4.f4301y).D;
            n1.g(l1Var4);
            j4Var4.N1(n0Var, ((Long) l1Var4.n1(atomicReference4, 15000L, "long test flag value", new h2(m2Var4, atomicReference4, 2))).longValue());
            return;
        }
        j4 j4Var5 = this.f2557e.F;
        n1.e(j4Var5);
        m2 m2Var5 = this.f2557e.J;
        n1.f(m2Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        l1 l1Var5 = ((n1) m2Var5.f4301y).D;
        n1.g(l1Var5);
        j4Var5.M1((String) l1Var5.n1(atomicReference5, 15000L, "String test flag value", new h2(m2Var5, atomicReference5, 1)), n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getUserProperties(String str, String str2, boolean z10, n0 n0Var) {
        d();
        l1 l1Var = this.f2557e.D;
        n1.g(l1Var);
        l1Var.m1(new f2(this, n0Var, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void initForTests(Map map) {
        d();
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void initialize(a aVar, v0 v0Var, long j) {
        n1 n1Var = this.f2557e;
        if (n1Var == null) {
            Context context = (Context) b.L(aVar);
            x.g(context);
            this.f2557e = n1.m(context, v0Var, Long.valueOf(j));
        } else {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.G.a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void isDataCollectionEnabled(n0 n0Var) {
        d();
        l1 l1Var = this.f2557e.D;
        n1.g(l1Var);
        l1Var.m1(new m1(this, n0Var, 1));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j) {
        d();
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        m2Var.i1(str, str2, bundle, z10, z11, j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void logEventAndBundle(String str, String str2, Bundle bundle, n0 n0Var, long j) {
        Bundle bundle2;
        d();
        x.d(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        v vVar = new v(str2, new u(bundle), "app", j);
        l1 l1Var = this.f2557e.D;
        n1.g(l1Var);
        l1Var.m1(new p(this, n0Var, vVar, str, 2));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void logHealthData(int i6, String str, a aVar, a aVar2, a aVar3) {
        Object L;
        Object L2;
        d();
        Object obj = null;
        if (aVar == null) {
            L = null;
        } else {
            L = b.L(aVar);
        }
        if (aVar2 == null) {
            L2 = null;
        } else {
            L2 = b.L(aVar2);
        }
        if (aVar3 != null) {
            obj = b.L(aVar3);
        }
        Object obj2 = obj;
        u0 u0Var = this.f2557e.C;
        n1.g(u0Var);
        u0Var.m1(i6, true, false, str, L, L2, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityCreated(a aVar, Bundle bundle, long j) {
        d();
        Activity activity = (Activity) b.L(aVar);
        x.g(activity);
        onActivityCreatedByScionActivityInfo(x0.a(activity), bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityCreatedByScionActivityInfo(x0 x0Var, Bundle bundle, long j) {
        d();
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        i iVar = m2Var.A;
        if (iVar != null) {
            m2 m2Var2 = this.f2557e.J;
            n1.f(m2Var2);
            m2Var2.v1();
            iVar.j(x0Var, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityDestroyed(a aVar, long j) {
        d();
        Activity activity = (Activity) b.L(aVar);
        x.g(activity);
        onActivityDestroyedByScionActivityInfo(x0.a(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityDestroyedByScionActivityInfo(x0 x0Var, long j) {
        d();
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        i iVar = m2Var.A;
        if (iVar != null) {
            m2 m2Var2 = this.f2557e.J;
            n1.f(m2Var2);
            m2Var2.v1();
            iVar.k(x0Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityPaused(a aVar, long j) {
        d();
        Activity activity = (Activity) b.L(aVar);
        x.g(activity);
        onActivityPausedByScionActivityInfo(x0.a(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityPausedByScionActivityInfo(x0 x0Var, long j) {
        d();
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        i iVar = m2Var.A;
        if (iVar != null) {
            m2 m2Var2 = this.f2557e.J;
            n1.f(m2Var2);
            m2Var2.v1();
            iVar.l(x0Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityResumed(a aVar, long j) {
        d();
        Activity activity = (Activity) b.L(aVar);
        x.g(activity);
        onActivityResumedByScionActivityInfo(x0.a(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityResumedByScionActivityInfo(x0 x0Var, long j) {
        d();
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        i iVar = m2Var.A;
        if (iVar != null) {
            m2 m2Var2 = this.f2557e.J;
            n1.f(m2Var2);
            m2Var2.v1();
            iVar.m(x0Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivitySaveInstanceState(a aVar, n0 n0Var, long j) {
        d();
        Activity activity = (Activity) b.L(aVar);
        x.g(activity);
        onActivitySaveInstanceStateByScionActivityInfo(x0.a(activity), n0Var, j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivitySaveInstanceStateByScionActivityInfo(x0 x0Var, n0 n0Var, long j) {
        d();
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        i iVar = m2Var.A;
        Bundle bundle = new Bundle();
        if (iVar != null) {
            m2 m2Var2 = this.f2557e.J;
            n1.f(m2Var2);
            m2Var2.v1();
            iVar.n(x0Var, bundle);
        }
        try {
            n0Var.w(bundle);
        } catch (RemoteException e10) {
            u0 u0Var = this.f2557e.C;
            n1.g(u0Var);
            u0Var.G.b(e10, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityStarted(a aVar, long j) {
        d();
        Activity activity = (Activity) b.L(aVar);
        x.g(activity);
        onActivityStartedByScionActivityInfo(x0.a(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityStartedByScionActivityInfo(x0 x0Var, long j) {
        d();
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        if (m2Var.A != null) {
            m2 m2Var2 = this.f2557e.J;
            n1.f(m2Var2);
            m2Var2.v1();
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityStopped(a aVar, long j) {
        d();
        Activity activity = (Activity) b.L(aVar);
        x.g(activity);
        onActivityStoppedByScionActivityInfo(x0.a(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityStoppedByScionActivityInfo(x0 x0Var, long j) {
        d();
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        if (m2Var.A != null) {
            m2 m2Var2 = this.f2557e.J;
            n1.f(m2Var2);
            m2Var2.v1();
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void performAction(Bundle bundle, n0 n0Var, long j) {
        d();
        n0Var.w(null);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void registerOnMeasurementEventListener(s0 s0Var) {
        k4 k4Var;
        d();
        e eVar = this.f2558f;
        synchronized (eVar) {
            try {
                q0 q0Var = (q0) s0Var;
                Parcel d10 = q0Var.d(q0Var.J(), 2);
                int readInt = d10.readInt();
                d10.recycle();
                k4Var = (k4) eVar.get(Integer.valueOf(readInt));
                if (k4Var == null) {
                    k4Var = new k4(this, q0Var);
                    Parcel d11 = q0Var.d(q0Var.J(), 2);
                    int readInt2 = d11.readInt();
                    d11.recycle();
                    eVar.put(Integer.valueOf(readInt2), k4Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        m2Var.e1();
        if (!m2Var.C.add(k4Var)) {
            u0 u0Var = ((n1) m2Var.f4301y).C;
            n1.g(u0Var);
            u0Var.G.a("OnEventListener already registered");
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void resetAnalyticsData(long j) {
        d();
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        m2Var.E.set(null);
        l1 l1Var = ((n1) m2Var.f4301y).D;
        n1.g(l1Var);
        l1Var.m1(new e2(m2Var, j, 1));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void retrieveAndUploadBatches(p0 p0Var) {
        s2 s2Var;
        d();
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        m2Var.e1();
        n1 n1Var = (n1) m2Var.f4301y;
        l1 l1Var = n1Var.D;
        n1.g(l1Var);
        if (!l1Var.j1()) {
            l1 l1Var2 = n1Var.D;
            n1.g(l1Var2);
            if (Thread.currentThread() == l1Var2.B) {
                u0 u0Var = n1Var.C;
                n1.g(u0Var);
                u0Var.D.a("Cannot retrieve and upload batches from analytics network thread");
                return;
            }
            if (!w8.l.w()) {
                u0 u0Var2 = n1Var.C;
                n1.g(u0Var2);
                u0Var2.L.a("[sgtm] Started client-side batch upload work.");
                boolean z10 = false;
                int i6 = 0;
                int i10 = 0;
                loop0: while (!z10) {
                    u0 u0Var3 = n1Var.C;
                    n1.g(u0Var3);
                    u0Var3.L.a("[sgtm] Getting upload batches from service (FE)");
                    AtomicReference atomicReference = new AtomicReference();
                    l1 l1Var3 = n1Var.D;
                    n1.g(l1Var3);
                    l1Var3.n1(atomicReference, 10000L, "[sgtm] Getting upload batches", new h2(m2Var, atomicReference, 6, false));
                    y3 y3Var = (y3) atomicReference.get();
                    if (y3Var == null) {
                        break;
                    }
                    List list = y3Var.f9540x;
                    if (list.isEmpty()) {
                        break;
                    }
                    u0 u0Var4 = n1Var.C;
                    n1.g(u0Var4);
                    u0Var4.L.b(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
                    i6 += list.size();
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            w3 w3Var = (w3) it.next();
                            try {
                                URL url = new URI(w3Var.f9519z).toURL();
                                AtomicReference atomicReference2 = new AtomicReference();
                                m0 l10 = ((n1) m2Var.f4301y).l();
                                l10.e1();
                                x.g(l10.E);
                                String str = l10.E;
                                n1 n1Var2 = (n1) m2Var.f4301y;
                                u0 u0Var5 = n1Var2.C;
                                n1.g(u0Var5);
                                n9.s0 s0Var = u0Var5.L;
                                Long valueOf = Long.valueOf(w3Var.f9517x);
                                s0Var.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", valueOf, w3Var.f9519z, Integer.valueOf(w3Var.f9518y.length));
                                if (!TextUtils.isEmpty(w3Var.D)) {
                                    u0 u0Var6 = n1Var2.C;
                                    n1.g(u0Var6);
                                    u0Var6.L.c(valueOf, w3Var.D, "[sgtm] Uploading data from app. row_id");
                                }
                                HashMap hashMap = new HashMap();
                                Bundle bundle = w3Var.A;
                                for (String str2 : bundle.keySet()) {
                                    String string = bundle.getString(str2);
                                    if (!TextUtils.isEmpty(string)) {
                                        hashMap.put(str2, string);
                                    }
                                }
                                q2 q2Var = n1Var2.L;
                                n1.g(q2Var);
                                byte[] bArr = w3Var.f9518y;
                                j jVar = new j(m2Var, atomicReference2, w3Var, 2);
                                q2Var.f1();
                                x.g(url);
                                x.g(bArr);
                                l1 l1Var4 = ((n1) q2Var.f4301y).D;
                                n1.g(l1Var4);
                                l1Var4.p1(new n9.x0(q2Var, str, url, bArr, hashMap, jVar));
                                try {
                                    j4 j4Var = n1Var2.F;
                                    n1.e(j4Var);
                                    n1 n1Var3 = (n1) j4Var.f4301y;
                                    n1Var3.H.getClass();
                                    long currentTimeMillis = System.currentTimeMillis() + 60000;
                                    synchronized (atomicReference2) {
                                        for (long j = 60000; atomicReference2.get() == null && j > 0; j = currentTimeMillis - System.currentTimeMillis()) {
                                            try {
                                                atomicReference2.wait(j);
                                                n1Var3.H.getClass();
                                            } catch (Throwable th) {
                                                throw th;
                                                break loop0;
                                            }
                                        }
                                    }
                                } catch (InterruptedException unused) {
                                    u0 u0Var7 = ((n1) m2Var.f4301y).C;
                                    n1.g(u0Var7);
                                    u0Var7.G.a("[sgtm] Interrupted waiting for uploading batch");
                                }
                                if (atomicReference2.get() == null) {
                                    s2Var = s2.UNKNOWN;
                                } else {
                                    s2Var = (s2) atomicReference2.get();
                                }
                            } catch (MalformedURLException | URISyntaxException e10) {
                                u0 u0Var8 = ((n1) m2Var.f4301y).C;
                                n1.g(u0Var8);
                                u0Var8.D.d("[sgtm] Bad upload url for row_id", w3Var.f9519z, Long.valueOf(w3Var.f9517x), e10);
                                s2Var = s2.FAILURE;
                            }
                            if (s2Var == s2.SUCCESS) {
                                i10++;
                            } else if (s2Var == s2.BACKOFF) {
                                z10 = true;
                                break;
                            }
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                }
                u0 u0Var9 = n1Var.C;
                n1.g(u0Var9);
                u0Var9.L.c(Integer.valueOf(i6), Integer.valueOf(i10), "[sgtm] Completed client-side batch upload work. total, success");
                try {
                    p0Var.e();
                    return;
                } catch (RemoteException e11) {
                    n1 n1Var4 = this.f2557e;
                    x.g(n1Var4);
                    u0 u0Var10 = n1Var4.C;
                    n1.g(u0Var10);
                    u0Var10.G.b(e11, "Failed to call IDynamiteUploadBatchesCallback");
                    return;
                }
            }
            u0 u0Var11 = n1Var.C;
            n1.g(u0Var11);
            u0Var11.D.a("Cannot retrieve and upload batches from main thread");
            return;
        }
        u0 u0Var12 = n1Var.C;
        n1.g(u0Var12);
        u0Var12.D.a("Cannot retrieve and upload batches from analytics worker thread");
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setConditionalUserProperty(Bundle bundle, long j) {
        d();
        if (bundle == null) {
            u0 u0Var = this.f2557e.C;
            n1.g(u0Var);
            u0Var.D.a("Conditional user property must not be null");
        } else {
            m2 m2Var = this.f2557e.J;
            n1.f(m2Var);
            m2Var.q1(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setConsentThirdParty(Bundle bundle, long j) {
        d();
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        m2Var.w1(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setCurrentScreen(a aVar, String str, String str2, long j) {
        d();
        Activity activity = (Activity) b.L(aVar);
        x.g(activity);
        setCurrentScreenByScionActivityInfo(x0.a(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r3 <= 500) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        if (r3 <= 500) goto L39;
     */
    @Override // com.google.android.gms.internal.measurement.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.x0 r6, java.lang.String r7, java.lang.String r8, long r9) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.x0, java.lang.String, java.lang.String, long):void");
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setDataCollectionEnabled(boolean z10) {
        d();
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        m2Var.e1();
        l1 l1Var = ((n1) m2Var.f4301y).D;
        n1.g(l1Var);
        l1Var.m1(new k4.b(m2Var, z10));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        d();
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle);
        }
        l1 l1Var = ((n1) m2Var.f4301y).D;
        n1.g(l1Var);
        l1Var.m1(new i2(m2Var, bundle2, 2));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setEventInterceptor(s0 s0Var) {
        boolean z10;
        d();
        f0 f0Var = new f0(this, s0Var, 18, false);
        l1 l1Var = this.f2557e.D;
        n1.g(l1Var);
        if (l1Var.j1()) {
            m2 m2Var = this.f2557e.J;
            n1.f(m2Var);
            m2Var.d1();
            m2Var.e1();
            f0 f0Var2 = m2Var.B;
            if (f0Var != f0Var2) {
                if (f0Var2 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                x.i("EventInterceptor already set.", z10);
            }
            m2Var.B = f0Var;
            return;
        }
        l1 l1Var2 = this.f2557e.D;
        n1.g(l1Var2);
        l1Var2.m1(new s(this, f0Var, 18, false));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.u0 u0Var) {
        d();
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setMeasurementEnabled(boolean z10, long j) {
        d();
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        Boolean valueOf = Boolean.valueOf(z10);
        m2Var.e1();
        l1 l1Var = ((n1) m2Var.f4301y).D;
        n1.g(l1Var);
        l1Var.m1(new s(m2Var, valueOf, 16, false));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setMinimumSessionDuration(long j) {
        d();
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setSessionTimeoutDuration(long j) {
        d();
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        l1 l1Var = ((n1) m2Var.f4301y).D;
        n1.g(l1Var);
        l1Var.m1(new e2(m2Var, j, 0));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setSgtmDebugInfo(Intent intent) {
        d();
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        n1 n1Var = (n1) m2Var.f4301y;
        Uri data = intent.getData();
        if (data == null) {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.J.a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter != null && queryParameter.equals(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION)) {
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (!TextUtils.isEmpty(queryParameter2)) {
                u0 u0Var2 = n1Var.C;
                n1.g(u0Var2);
                u0Var2.J.b(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
                n1Var.A.A = queryParameter2;
                return;
            }
            return;
        }
        u0 u0Var3 = n1Var.C;
        n1.g(u0Var3);
        u0Var3.J.a("[sgtm] Preview Mode was not enabled.");
        n1Var.A.A = null;
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setUserId(String str, long j) {
        d();
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        n1 n1Var = (n1) m2Var.f4301y;
        if (str != null && TextUtils.isEmpty(str)) {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.G.a("User ID must be non-empty or null");
        } else {
            l1 l1Var = n1Var.D;
            n1.g(l1Var);
            l1Var.m1(new s(20, m2Var, str));
            m2Var.n1(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setUserProperty(String str, String str2, a aVar, boolean z10, long j) {
        d();
        Object L = b.L(aVar);
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        m2Var.n1(str, str2, L, z10, j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void unregisterOnMeasurementEventListener(s0 s0Var) {
        q0 q0Var;
        k4 k4Var;
        d();
        e eVar = this.f2558f;
        synchronized (eVar) {
            q0Var = (q0) s0Var;
            Parcel d10 = q0Var.d(q0Var.J(), 2);
            int readInt = d10.readInt();
            d10.recycle();
            k4Var = (k4) eVar.remove(Integer.valueOf(readInt));
        }
        if (k4Var == null) {
            k4Var = new k4(this, q0Var);
        }
        m2 m2Var = this.f2557e.J;
        n1.f(m2Var);
        m2Var.e1();
        if (!m2Var.C.remove(k4Var)) {
            u0 u0Var = ((n1) m2Var.f4301y).C;
            n1.g(u0Var);
            u0Var.G.a("OnEventListener had not been registered");
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setConsent(Bundle bundle, long j) {
    }
}
