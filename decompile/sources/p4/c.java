package p4;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IBinder f10288d;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f10288d;
    }

    @Override // p4.d
    public final void t(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(d.f10292b);
            parcelObtain.writeStringArray(strArr);
            this.f10288d.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
