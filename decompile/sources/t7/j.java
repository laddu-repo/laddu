package t7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j extends u7.a {
    public static final Parcelable.Creator<j> CREATOR = new m8.c(17);
    public final String A;
    public final String B;
    public final int C;
    public final int D;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f12362v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f12363w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f12364x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f12365y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f12366z;

    public j(int i, int i10, int i11, long j8, long j9, String str, String str2, int i12, int i13) {
        this.f12362v = i;
        this.f12363w = i10;
        this.f12364x = i11;
        this.f12365y = j8;
        this.f12366z = j9;
        this.A = str;
        this.B = str2;
        this.C = i12;
        this.D = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        com.bumptech.glide.d.b0(parcel, 1, 4);
        parcel.writeInt(this.f12362v);
        com.bumptech.glide.d.b0(parcel, 2, 4);
        parcel.writeInt(this.f12363w);
        com.bumptech.glide.d.b0(parcel, 3, 4);
        parcel.writeInt(this.f12364x);
        com.bumptech.glide.d.b0(parcel, 4, 8);
        parcel.writeLong(this.f12365y);
        com.bumptech.glide.d.b0(parcel, 5, 8);
        parcel.writeLong(this.f12366z);
        com.bumptech.glide.d.Y(parcel, 6, this.A);
        com.bumptech.glide.d.Y(parcel, 7, this.B);
        com.bumptech.glide.d.b0(parcel, 8, 4);
        parcel.writeInt(this.C);
        com.bumptech.glide.d.b0(parcel, 9, 4);
        parcel.writeInt(this.D);
        com.bumptech.glide.d.d0(parcel, iC0);
    }
}
