package t7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l extends u7.a {
    public static final Parcelable.Creator<l> CREATOR = new m8.c(20);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f12379v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f12380w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f12381x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f12382y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f12383z;

    public l(int i, boolean z2, boolean z10, int i10, int i11) {
        this.f12379v = i;
        this.f12380w = z2;
        this.f12381x = z10;
        this.f12382y = i10;
        this.f12383z = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        com.bumptech.glide.d.b0(parcel, 1, 4);
        parcel.writeInt(this.f12379v);
        com.bumptech.glide.d.b0(parcel, 2, 4);
        parcel.writeInt(this.f12380w ? 1 : 0);
        com.bumptech.glide.d.b0(parcel, 3, 4);
        parcel.writeInt(this.f12381x ? 1 : 0);
        com.bumptech.glide.d.b0(parcel, 4, 4);
        parcel.writeInt(this.f12382y);
        com.bumptech.glide.d.b0(parcel, 5, 4);
        parcel.writeInt(this.f12383z);
        com.bumptech.glide.d.d0(parcel, iC0);
    }
}
