package k8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b4 extends u7.a {
    public static final Parcelable.Creator<b4> CREATOR = new android.support.v4.media.a(23);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f7408v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f7409w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f7410x;

    public b4(int i, long j8, String str) {
        this.f7408v = str;
        this.f7409w = j8;
        this.f7410x = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        com.bumptech.glide.d.Y(parcel, 1, this.f7408v);
        com.bumptech.glide.d.b0(parcel, 2, 8);
        parcel.writeLong(this.f7409w);
        com.bumptech.glide.d.b0(parcel, 3, 4);
        parcel.writeInt(this.f7410x);
        com.bumptech.glide.d.d0(parcel, iC0);
    }
}
