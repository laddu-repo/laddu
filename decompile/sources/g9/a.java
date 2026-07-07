package g9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a extends Binder implements IInterface {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5560e = 1;

    public a(String str) {
        attachInterface(this, str);
    }

    public boolean J(int i6, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i10) {
        switch (this.f5560e) {
            case 1:
                if (i6 > 16777215) {
                    if (super.onTransact(i6, parcel, parcel2, i10)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return J(i6, parcel, parcel2);
            default:
                return super.onTransact(i6, parcel, parcel2, i10);
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
