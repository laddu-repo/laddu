package t7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements ServiceConnection {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f12311v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f12312w;

    public d0(e eVar, int i) {
        this.f12312w = eVar;
        this.f12311v = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        e eVar = this.f12312w;
        if (iBinder == null) {
            eVar.t();
            return;
        }
        synchronized (eVar.f12320h) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                eVar.i = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof u)) ? new u(iBinder) : (u) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar2 = this.f12312w;
        int i = this.f12311v;
        eVar2.getClass();
        f0 f0Var = new f0(eVar2, 0, null);
        b0 b0Var = eVar2.f;
        b0Var.sendMessage(b0Var.obtainMessage(7, i, -1, f0Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        e eVar = this.f12312w;
        synchronized (eVar.f12320h) {
            eVar.i = null;
        }
        e eVar2 = this.f12312w;
        int i = this.f12311v;
        b0 b0Var = eVar2.f;
        b0Var.sendMessage(b0Var.obtainMessage(6, i, 1));
    }
}
