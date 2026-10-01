package x4;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: e, reason: collision with root package name */
    public IBinder f14561e;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f14561e;
    }

    @Override // x4.e
    public final void m(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(e.f14565c);
            obtain.writeStringArray(strArr);
            this.f14561e.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
