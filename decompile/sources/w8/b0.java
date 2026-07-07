package w8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b0 implements ServiceConnection {

    /* renamed from: x, reason: collision with root package name */
    public final int f14150x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f14151y;

    public b0(f fVar, int i6) {
        this.f14151y = fVar;
        this.f14150x = i6;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        t tVar;
        f fVar = this.f14151y;
        if (iBinder == null) {
            f.y(fVar);
            return;
        }
        synchronized (fVar.f14167h) {
            try {
                f fVar2 = this.f14151y;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface != null && (queryLocalInterface instanceof t)) {
                    tVar = (t) queryLocalInterface;
                } else {
                    tVar = new t(iBinder);
                }
                fVar2.f14168i = tVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar3 = this.f14151y;
        int i6 = this.f14150x;
        d0 d0Var = new d0(fVar3, 0, null);
        z zVar = fVar3.f14165f;
        zVar.sendMessage(zVar.obtainMessage(7, i6, -1, d0Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        f fVar;
        synchronized (this.f14151y.f14167h) {
            fVar = this.f14151y;
            fVar.f14168i = null;
        }
        int i6 = this.f14150x;
        z zVar = fVar.f14165f;
        zVar.sendMessage(zVar.obtainMessage(6, i6, 1));
    }
}
