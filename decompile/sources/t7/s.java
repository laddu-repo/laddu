package t7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s extends u7.a {
    public static final Parcelable.Creator<s> CREATOR = new m8.c(19);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f12402v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final IBinder f12403w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final q7.b f12404x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f12405y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f12406z;

    public s(int i, IBinder iBinder, q7.b bVar, boolean z2, boolean z10) {
        this.f12402v = i;
        this.f12403w = iBinder;
        this.f12404x = bVar;
        this.f12405y = z2;
        this.f12406z = z10;
    }

    public final boolean equals(Object obj) {
        Object k0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (!this.f12404x.equals(sVar.f12404x)) {
            return false;
        }
        Object k0Var2 = null;
        IBinder iBinder = this.f12403w;
        if (iBinder == null) {
            k0Var = null;
        } else {
            int i = a.f12307e;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            k0Var = iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new k0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
        }
        IBinder iBinder2 = sVar.f12403w;
        if (iBinder2 != null) {
            int i10 = a.f12307e;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            k0Var2 = iInterfaceQueryLocalInterface2 instanceof i ? (i) iInterfaceQueryLocalInterface2 : new k0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 2);
        }
        return y.j(k0Var, k0Var2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        com.bumptech.glide.d.b0(parcel, 1, 4);
        parcel.writeInt(this.f12402v);
        com.bumptech.glide.d.V(parcel, 2, this.f12403w);
        com.bumptech.glide.d.X(parcel, 3, this.f12404x, i);
        com.bumptech.glide.d.b0(parcel, 4, 4);
        parcel.writeInt(this.f12405y ? 1 : 0);
        com.bumptech.glide.d.b0(parcel, 5, 4);
        parcel.writeInt(this.f12406z ? 1 : 0);
        com.bumptech.glide.d.d0(parcel, iC0);
    }
}
