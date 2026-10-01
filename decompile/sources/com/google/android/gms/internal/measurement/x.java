package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class x implements IInterface {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2514e;

    /* renamed from: f, reason: collision with root package name */
    public final IBinder f2515f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2516g;

    public /* synthetic */ x(IBinder iBinder, String str, int i6) {
        this.f2514e = i6;
        this.f2515f = iBinder;
        this.f2516g = str;
    }

    public final Parcel J() {
        switch (this.f2514e) {
            case 0:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.f2516g);
                return obtain;
            default:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(this.f2516g);
                return obtain2;
        }
    }

    public void K(Parcel parcel, int i6) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f2515f.transact(i6, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public void L(Parcel parcel) {
        try {
            this.f2515f.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel a(Parcel parcel, int i6) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f2515f.transact(i6, parcel, obtain, 0);
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
        switch (this.f2514e) {
            case 0:
                return this.f2515f;
            default:
                return this.f2515f;
        }
    }

    public Parcel d(Parcel parcel, int i6) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f2515f.transact(i6, parcel, obtain, 0);
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
}
