package w8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c0 extends r {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f14152g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f14153h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(f fVar, int i6, IBinder iBinder, Bundle bundle) {
        super(fVar, i6, bundle);
        this.f14153h = fVar;
        this.f14152g = iBinder;
    }

    @Override // w8.r
    public final void a(t8.b bVar) {
        c cVar = this.f14153h.f14174p;
        if (cVar != null) {
            cVar.a(bVar);
        }
        System.currentTimeMillis();
    }

    @Override // w8.r
    public final boolean b() {
        IBinder iBinder = this.f14152g;
        try {
            x.g(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            f fVar = this.f14153h;
            if (!fVar.v().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + fVar.v() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface p10 = fVar.p(iBinder);
            if (p10 == null || (!f.z(fVar, 2, 4, p10) && !f.z(fVar, 3, 4, p10))) {
                return false;
            }
            fVar.f14177t = null;
            b bVar = fVar.f14173o;
            if (bVar != null) {
                bVar.onConnected();
                return true;
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
