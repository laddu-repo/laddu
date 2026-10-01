package t7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f12336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f12337h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(e eVar, int i, IBinder iBinder, Bundle bundle) {
        super(eVar, i, bundle);
        this.f12337h = eVar;
        this.f12336g = iBinder;
    }

    @Override // t7.t
    public final boolean a() {
        IBinder iBinder = this.f12336g;
        try {
            y.g(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            e eVar = this.f12337h;
            if (!eVar.n().equals(interfaceDescriptor)) {
                String strN = eVar.n();
                StringBuilder sb2 = new StringBuilder(strN.length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb2.append("service descriptor mismatch: ");
                sb2.append(strN);
                sb2.append(" vs. ");
                sb2.append(interfaceDescriptor);
                Log.w("GmsClient", sb2.toString());
                return false;
            }
            IInterface iInterfaceD = eVar.d(iBinder);
            if (iInterfaceD == null || !(eVar.s(2, 4, iInterfaceD) || eVar.s(3, 4, iInterfaceD))) {
                return false;
            }
            eVar.f12332u = null;
            b bVar = eVar.f12326o;
            if (bVar == null) {
                return true;
            }
            bVar.f();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // t7.t
    public final void b(q7.b bVar) {
        c cVar = this.f12337h.f12327p;
        if (cVar != null) {
            cVar.c(bVar);
        }
        System.currentTimeMillis();
    }
}
