package w8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t implements IInterface {

    /* renamed from: e, reason: collision with root package name */
    public final IBinder f14229e;

    public t(IBinder iBinder) {
        this.f14229e = iBinder;
    }

    public final void a(a0 a0Var, h hVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(a0Var);
            obtain.writeInt(1);
            f0.a(hVar, obtain, 0);
            this.f14229e.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f14229e;
    }
}
