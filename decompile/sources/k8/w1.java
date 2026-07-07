package k8;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.z6;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w1 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7815v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f7816w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f7817x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f7818y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f7819z;

    public /* synthetic */ w1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f7815v = i;
        this.f7817x = obj;
        this.f7816w = obj2;
        this.f7818y = obj3;
        this.f7819z = obj4;
    }

    private final void a() {
        i0 i0Var;
        p3 p3Var = (p3) this.f7817x;
        AtomicReference atomicReference = (AtomicReference) this.f7816w;
        v4 v4Var = (v4) this.f7819z;
        f4 f4Var = (f4) this.f7818y;
        synchronized (atomicReference) {
            try {
                i0Var = p3Var.f7701z;
            } catch (RemoteException e7) {
                v0 v0Var = ((p1) p3Var.f2053w).A;
                p1.l(v0Var);
                v0Var.B.b(e7, "[sgtm] Failed to get upload batches; remote exception");
                atomicReference.notifyAll();
            }
            if (i0Var != null) {
                i0Var.p(v4Var, f4Var, new i3(p3Var, atomicReference));
                p3Var.Q();
            } else {
                v0 v0Var2 = ((p1) p3Var.f2053w).A;
                p1.l(v0Var2);
                v0Var2.B.a("[sgtm] Failed to get upload batches; not connected to service");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x03dc  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 1290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.w1.run():void");
    }

    public /* synthetic */ w1(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z2) {
        this.f7815v = i;
        this.f7817x = obj2;
        this.f7816w = obj3;
        this.f7818y = obj4;
        this.f7819z = obj;
    }

    public /* synthetic */ w1(x1 x1Var, Bundle bundle, String str, v4 v4Var) {
        this.f7815v = 2;
        this.f7817x = x1Var;
        this.f7818y = bundle;
        this.f7816w = str;
        this.f7819z = v4Var;
    }

    public /* synthetic */ w1(p3 p3Var, AtomicReference atomicReference, v4 v4Var, f4 f4Var) {
        this.f7815v = 7;
        this.f7817x = p3Var;
        this.f7816w = atomicReference;
        this.f7819z = v4Var;
        this.f7818y = f4Var;
    }

    public w1(AppMeasurementDynamiteService appMeasurementDynamiteService, z6 z6Var, v vVar, String str) {
        this.f7815v = 1;
        this.f7817x = z6Var;
        this.f7818y = vVar;
        this.f7816w = str;
        this.f7819z = appMeasurementDynamiteService;
    }

    public w1(u2 u2Var, AtomicReference atomicReference, String str, String str2) {
        this.f7815v = 3;
        this.f7817x = atomicReference;
        this.f7816w = str;
        this.f7818y = str2;
        Objects.requireNonNull(u2Var);
        this.f7819z = u2Var;
    }

    public w1(k4 k4Var, String str, String str2, Bundle bundle) {
        this.f7815v = 8;
        this.f7816w = str;
        this.f7817x = str2;
        this.f7818y = bundle;
        this.f7819z = k4Var;
    }
}
