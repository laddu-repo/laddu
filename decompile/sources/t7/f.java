package t7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f extends u7.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.c(22);
    public final int[] A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l f12338v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f12339w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f12340x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f12341y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f12342z;

    public f(l lVar, boolean z2, boolean z10, int[] iArr, int i, int[] iArr2) {
        this.f12338v = lVar;
        this.f12339w = z2;
        this.f12340x = z10;
        this.f12341y = iArr;
        this.f12342z = i;
        this.A = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        com.bumptech.glide.d.X(parcel, 1, this.f12338v, i);
        com.bumptech.glide.d.b0(parcel, 2, 4);
        parcel.writeInt(this.f12339w ? 1 : 0);
        com.bumptech.glide.d.b0(parcel, 3, 4);
        parcel.writeInt(this.f12340x ? 1 : 0);
        com.bumptech.glide.d.W(parcel, 4, this.f12341y);
        com.bumptech.glide.d.b0(parcel, 5, 4);
        parcel.writeInt(this.f12342z);
        com.bumptech.glide.d.W(parcel, 6, this.A);
        com.bumptech.glide.d.d0(parcel, iC0);
    }
}
