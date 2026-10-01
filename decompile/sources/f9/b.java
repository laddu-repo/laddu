package f9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements d, IInterface {

    /* renamed from: e, reason: collision with root package name */
    public final IBinder f5151e;

    public b(IBinder iBinder) {
        this.f5151e = iBinder;
    }

    public final Parcel a(Parcel parcel, int i6) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f5151e.transact(i6, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5151e;
    }
}
