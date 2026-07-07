package t7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o extends u7.a {
    public static final Parcelable.Creator<o> CREATOR = new m8.c(16);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f12388v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f12389w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f12390x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f12391y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f12392z;

    public o(int i, int i10, long j8, String str, boolean z2) {
        this.f12388v = i;
        this.f12389w = str;
        this.f12390x = j8;
        this.f12391y = i10;
        this.f12392z = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        com.bumptech.glide.d.b0(parcel, 1, 4);
        parcel.writeInt(this.f12388v);
        com.bumptech.glide.d.Y(parcel, 2, this.f12389w);
        com.bumptech.glide.d.b0(parcel, 3, 8);
        parcel.writeLong(this.f12390x);
        com.bumptech.glide.d.b0(parcel, 4, 4);
        parcel.writeInt(this.f12391y);
        com.bumptech.glide.d.b0(parcel, 5, 4);
        parcel.writeInt(this.f12392z ? 1 : 0);
        com.bumptech.glide.d.d0(parcel, iC0);
    }
}
