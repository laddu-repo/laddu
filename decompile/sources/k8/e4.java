package k8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e4 extends u7.a {
    public static final Parcelable.Creator<e4> CREATOR = new android.support.v4.media.a(24);
    public final long A;
    public String B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f7474v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte[] f7475w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f7476x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Bundle f7477y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f7478z;

    public e4(long j8, byte[] bArr, String str, Bundle bundle, int i, long j9, String str2) {
        this.f7474v = j8;
        this.f7475w = bArr;
        this.f7476x = str;
        this.f7477y = bundle;
        this.f7478z = i;
        this.A = j9;
        this.B = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        com.bumptech.glide.d.b0(parcel, 1, 8);
        parcel.writeLong(this.f7474v);
        com.bumptech.glide.d.T(parcel, 2, this.f7475w);
        com.bumptech.glide.d.Y(parcel, 3, this.f7476x);
        com.bumptech.glide.d.S(parcel, 4, this.f7477y);
        com.bumptech.glide.d.b0(parcel, 5, 4);
        parcel.writeInt(this.f7478z);
        com.bumptech.glide.d.b0(parcel, 6, 8);
        parcel.writeLong(this.A);
        com.bumptech.glide.d.Y(parcel, 7, this.B);
        com.bumptech.glide.d.d0(parcel, iC0);
    }
}
