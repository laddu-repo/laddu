package k8;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends t7.e {
    @Override // t7.e, r7.c
    public final int a() {
        return 12451000;
    }

    @Override // t7.e
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof i0 ? (i0) iInterfaceQueryLocalInterface : new g0(iBinder);
    }

    @Override // t7.e
    public final String n() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // t7.e
    public final String o() {
        return "com.google.android.gms.measurement.START";
    }
}
