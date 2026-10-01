package j4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: e, reason: collision with root package name */
    public IBinder f7164e;

    @Override // j4.f
    public final void A(k0 k0Var) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(1);
            k0Var.writeToParcel(obtain, 0);
            if (!this.f7164e.transact(3, obtain, null, 1)) {
                int i6 = k.f7181f;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // j4.f
    public final void B(String str) {
        Bundle bundle = Bundle.EMPTY;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeString(str);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.f7164e.transact(1, obtain, null, 1)) {
                int i6 = k.f7181f;
            }
            obtain.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7164e;
    }

    @Override // j4.f
    public final void c(int i6) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i6);
            if (!this.f7164e.transact(9, obtain, null, 1)) {
                int i10 = k.f7181f;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // j4.f
    public final void z(int i6) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i6);
            if (!this.f7164e.transact(12, obtain, null, 1)) {
                int i10 = k.f7181f;
            }
        } finally {
            obtain.recycle();
        }
    }
}
