package k8;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.d7;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u4 implements f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7 f7789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f7790b;

    public u4(AppMeasurementDynamiteService appMeasurementDynamiteService, d7 d7Var) {
        this.f7790b = appMeasurementDynamiteService;
        this.f7789a = d7Var;
    }

    @Override // k8.f2
    public final void a(String str, String str2, Bundle bundle, long j8) {
        try {
            this.f7789a.m(str, str2, bundle, j8);
        } catch (RemoteException e7) {
            p1 p1Var = this.f7790b.f3301d;
            if (p1Var != null) {
                v0 v0Var = p1Var.A;
                p1.l(v0Var);
                v0Var.E.b(e7, "Event listener threw exception");
            }
        }
    }
}
