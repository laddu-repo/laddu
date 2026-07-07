package v7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.internal.measurement.mb;
import s7.j;
import t7.h;
import t7.n;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e extends h {
    public final n A;

    public e(Context context, Looper looper, mb mbVar, n nVar, j jVar, j jVar2) {
        super(context, looper, 270, mbVar, jVar, jVar2);
        this.A = nVar;
    }

    @Override // t7.e, r7.c
    public final int a() {
        return 203400000;
    }

    @Override // t7.e
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new c(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 1);
    }

    @Override // t7.e
    public final q7.d[] h() {
        return d8.b.f4388c;
    }

    @Override // t7.e
    public final Bundle j() {
        n nVar = this.A;
        nVar.getClass();
        Bundle bundle = new Bundle();
        String str = nVar.f12387b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // t7.e
    public final String n() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // t7.e
    public final String o() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // t7.e
    public final boolean p() {
        return true;
    }
}
