package o4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new m8.c(4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f9860v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9861w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9862x;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9860v);
        parcel.writeInt(this.f9861w);
        parcel.writeInt(this.f9862x ? 1 : 0);
    }
}
