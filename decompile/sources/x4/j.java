package x4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends Binder implements f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f14589e;

    public j(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f14589e = multiInstanceInvalidationService;
        attachInterface(this, f.f14567d);
    }

    public final int a(e callback, String str) {
        kotlin.jvm.internal.k.e(callback, "callback");
        int i6 = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f14589e;
        synchronized (multiInstanceInvalidationService.f1162z) {
            try {
                int i10 = multiInstanceInvalidationService.f1160x + 1;
                multiInstanceInvalidationService.f1160x = i10;
                if (multiInstanceInvalidationService.f1162z.register(callback, Integer.valueOf(i10))) {
                    multiInstanceInvalidationService.f1161y.put(Integer.valueOf(i10), str);
                    i6 = i10;
                } else {
                    multiInstanceInvalidationService.f1160x--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i6;
    }

    public final void d(e callback, int i6) {
        kotlin.jvm.internal.k.e(callback, "callback");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f14589e;
        synchronized (multiInstanceInvalidationService.f1162z) {
            multiInstanceInvalidationService.f1162z.unregister(callback);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [x4.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [x4.d, java.lang.Object] */
    @Override // android.os.Binder
    public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i10) {
        String str = f.f14567d;
        if (i6 >= 1 && i6 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i6 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        e eVar = null;
        e eVar2 = null;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    return super.onTransact(i6, parcel, parcel2, i10);
                }
                int readInt = parcel.readInt();
                String[] tables = parcel.createStringArray();
                kotlin.jvm.internal.k.e(tables, "tables");
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f14589e;
                synchronized (multiInstanceInvalidationService.f1162z) {
                    String str2 = (String) multiInstanceInvalidationService.f1161y.get(Integer.valueOf(readInt));
                    if (str2 == null) {
                        Log.w("ROOM", "Remote invalidation client ID not registered");
                    } else {
                        int beginBroadcast = multiInstanceInvalidationService.f1162z.beginBroadcast();
                        for (int i11 = 0; i11 < beginBroadcast; i11++) {
                            try {
                                Object broadcastCookie = multiInstanceInvalidationService.f1162z.getBroadcastCookie(i11);
                                kotlin.jvm.internal.k.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                                Integer num = (Integer) broadcastCookie;
                                int intValue = num.intValue();
                                String str3 = (String) multiInstanceInvalidationService.f1161y.get(num);
                                if (readInt != intValue && str2.equals(str3)) {
                                    try {
                                        ((e) multiInstanceInvalidationService.f1162z.getBroadcastItem(i11)).m(tables);
                                    } catch (RemoteException e10) {
                                        Log.w("ROOM", "Error invoking a remote callback", e10);
                                    }
                                }
                            } finally {
                                multiInstanceInvalidationService.f1162z.finishBroadcast();
                            }
                        }
                    }
                }
                return true;
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(e.f14565c);
                if (queryLocalInterface != null && (queryLocalInterface instanceof e)) {
                    eVar2 = (e) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.f14561e = readStrongBinder;
                    eVar2 = obj;
                }
            }
            d(eVar2, parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(e.f14565c);
            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof e)) {
                eVar = (e) queryLocalInterface2;
            } else {
                ?? obj2 = new Object();
                obj2.f14561e = readStrongBinder2;
                eVar = obj2;
            }
        }
        int a10 = a(eVar, parcel.readString());
        parcel2.writeNoException();
        parcel2.writeInt(a10);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
