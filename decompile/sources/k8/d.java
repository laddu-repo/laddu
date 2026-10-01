package k8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d extends u7.a {
    public static final Parcelable.Creator<d> CREATOR = new android.support.v4.media.a(18);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f7434v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f7435w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f7436x;

    public d(int i, long j8, long j9) {
        this.f7434v = j8;
        this.f7435w = i;
        this.f7436x = j9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        com.bumptech.glide.d.b0(parcel, 1, 8);
        parcel.writeLong(this.f7434v);
        com.bumptech.glide.d.b0(parcel, 2, 4);
        parcel.writeInt(this.f7435w);
        com.bumptech.glide.d.b0(parcel, 3, 8);
        parcel.writeLong(this.f7436x);
        com.bumptech.glide.d.d0(parcel, iC0);
    }
}
