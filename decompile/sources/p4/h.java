package p4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h extends Binder implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f10307d;

    public h(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f10307d = multiInstanceInvalidationService;
        attachInterface(this, e.f10293c);
    }

    @Override // p4.e
    public final void C(int i, String[] strArr) {
        de.i.e(strArr, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f10307d;
        synchronized (multiInstanceInvalidationService.f1415x) {
            String str = (String) multiInstanceInvalidationService.f1414w.get(Integer.valueOf(i));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int iBeginBroadcast = multiInstanceInvalidationService.f1415x.beginBroadcast();
            for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
                try {
                    Object broadcastCookie = multiInstanceInvalidationService.f1415x.getBroadcastCookie(i10);
                    de.i.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    Integer num = (Integer) broadcastCookie;
                    int iIntValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.f1414w.get(num);
                    if (i != iIntValue && str.equals(str2)) {
                        try {
                            ((d) multiInstanceInvalidationService.f1415x.getBroadcastItem(i10)).t(strArr);
                        } catch (RemoteException e7) {
                            Log.w("ROOM", "Error invoking a remote callback", e7);
                        }
                    }
                } finally {
                    multiInstanceInvalidationService.f1415x.finishBroadcast();
                }
            }
        }
    }

    public final int c(d dVar, String str) {
        de.i.e(dVar, "callback");
        int i = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f10307d;
        synchronized (multiInstanceInvalidationService.f1415x) {
            try {
                int i10 = multiInstanceInvalidationService.f1413v + 1;
                multiInstanceInvalidationService.f1413v = i10;
                if (multiInstanceInvalidationService.f1415x.register(dVar, Integer.valueOf(i10))) {
                    multiInstanceInvalidationService.f1414w.put(Integer.valueOf(i10), str);
                    i = i10;
                } else {
                    multiInstanceInvalidationService.f1413v--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i10) {
        String str = e.f10293c;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        d dVar = null;
        d dVar2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(d.f10292b);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) {
                    c cVar = new c();
                    cVar.f10288d = strongBinder;
                    dVar = cVar;
                } else {
                    dVar = (d) iInterfaceQueryLocalInterface;
                }
            }
            int iC = c(dVar, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iC);
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i10);
            }
            C(parcel.readInt(), parcel.createStringArray());
            return true;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(d.f10292b);
            if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof d)) {
                c cVar2 = new c();
                cVar2.f10288d = strongBinder2;
                dVar2 = cVar2;
            } else {
                dVar2 = (d) iInterfaceQueryLocalInterface2;
            }
        }
        int i11 = parcel.readInt();
        de.i.e(dVar2, "callback");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f10307d;
        synchronized (multiInstanceInvalidationService.f1415x) {
            multiInstanceInvalidationService.f1415x.unregister(dVar2);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
