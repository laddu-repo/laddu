package t7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends f8.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f12310e;
    public final int f;

    public c0(e eVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f12310e = eVar;
        this.f = i;
    }

    @Override // f8.g
    public final boolean I(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i10 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) f8.h.a(parcel, Bundle.CREATOR);
            f8.h.c(parcel);
            y.h(this.f12310e, "onPostInitComplete can be called only once per call to getRemoteService");
            e eVar = this.f12310e;
            int i11 = this.f;
            eVar.getClass();
            e0 e0Var = new e0(eVar, i10, strongBinder, bundle);
            b0 b0Var = eVar.f;
            b0Var.sendMessage(b0Var.obtainMessage(1, i11, -1, e0Var));
            this.f12310e = null;
        } else if (i == 2) {
            parcel.readInt();
            f8.h.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i12 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            g0 g0Var = (g0) f8.h.a(parcel, g0.CREATOR);
            f8.h.c(parcel);
            e eVar2 = this.f12310e;
            y.h(eVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            y.g(g0Var);
            eVar2.f12334w = g0Var;
            Bundle bundle2 = g0Var.f12349v;
            y.h(this.f12310e, "onPostInitComplete can be called only once per call to getRemoteService");
            e eVar3 = this.f12310e;
            int i13 = this.f;
            eVar3.getClass();
            e0 e0Var2 = new e0(eVar3, i12, strongBinder2, bundle2);
            b0 b0Var2 = eVar3.f;
            b0Var2.sendMessage(b0Var2.obtainMessage(1, i13, -1, e0Var2));
            this.f12310e = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
