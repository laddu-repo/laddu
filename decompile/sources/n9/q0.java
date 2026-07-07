package n9;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q0 extends w8.f {
    @Override // w8.f
    public final int j() {
        return 12451000;
    }

    @Override // w8.f
    public final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof h0) {
            return (h0) queryLocalInterface;
        }
        return new f0(iBinder);
    }

    @Override // w8.f
    public final String v() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // w8.f
    public final String w() {
        return "com.google.android.gms.measurement.START";
    }
}
