package j4;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k extends Binder implements f {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f7181f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f7182e;

    public k() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f7182e = new WeakReference(null);
    }

    @Override // j4.f
    public final void A(k0 k0Var) {
        if (this.f7182e.get() == null) {
        } else {
            throw new ClassCastException();
        }
    }

    @Override // j4.f
    public final void B(String str) {
        if (this.f7182e.get() == null) {
        } else {
            throw new ClassCastException();
        }
    }

    @Override // j4.f
    public final void c(int i6) {
        if (this.f7182e.get() == null) {
        } else {
            throw new ClassCastException();
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i10) {
        k0 k0Var;
        if (i6 != 1598968902) {
            switch (i6) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                    B(readString);
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    throw new AssertionError();
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        k0Var = k0.CREATOR.createFromParcel(parcel);
                    } else {
                        k0Var = null;
                    }
                    A(k0Var);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        p.CREATOR.createFromParcel(parcel);
                    }
                    throw new AssertionError();
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.createTypedArrayList(y.CREATOR);
                    throw new AssertionError();
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                    }
                    throw new AssertionError();
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                    }
                    throw new AssertionError();
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        h0.CREATOR.createFromParcel(parcel);
                    }
                    throw new AssertionError();
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    c(parcel.readInt());
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    if (this.f7182e.get() != null) {
                        throw new ClassCastException();
                    }
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    z(parcel.readInt());
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (this.f7182e.get() != null) {
                        throw new ClassCastException();
                    }
                    return true;
                default:
                    return super.onTransact(i6, parcel, parcel2, i10);
            }
        }
        parcel2.getClass();
        parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
        return true;
    }

    @Override // j4.f
    public final void z(int i6) {
        if (this.f7182e.get() == null) {
        } else {
            throw new ClassCastException();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
