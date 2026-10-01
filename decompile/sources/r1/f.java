package r1;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends Binder {

    /* renamed from: f, reason: collision with root package name */
    public static final int f11391f;

    /* renamed from: e, reason: collision with root package name */
    public final db.k0 f11392e;

    static {
        int i6;
        if (Build.VERSION.SDK_INT >= 30) {
            i6 = IBinder.getSuggestedMaxIpcSizeBytes();
        } else {
            i6 = 65536;
        }
        f11391f = i6;
    }

    public f(ArrayList arrayList) {
        this.f11392e = db.k0.k(arrayList);
    }

    public static db.k0 a(IBinder iBinder) {
        int readInt;
        if (iBinder instanceof f) {
            return ((f) iBinder).f11392e;
        }
        db.h0 j = db.k0.j();
        int i6 = 1;
        int i10 = 0;
        while (i6 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i10);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            Bundle readBundle = obtain2.readBundle();
                            readBundle.getClass();
                            j.a(readBundle);
                            i10++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i6 = readInt;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return j.g();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i10) {
        if (i6 != 1) {
            return super.onTransact(i6, parcel, parcel2, i10);
        }
        int i11 = 0;
        if (parcel2 == null) {
            return false;
        }
        db.k0 k0Var = this.f11392e;
        int size = k0Var.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < f11391f) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) k0Var.get(readInt));
            readInt++;
        }
        if (readInt < size) {
            i11 = 2;
        }
        parcel2.writeInt(i11);
        return true;
    }
}
