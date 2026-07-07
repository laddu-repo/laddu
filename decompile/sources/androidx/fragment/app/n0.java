package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements Parcelable {
    public static final Parcelable.Creator<n0> CREATOR = new android.support.v4.media.a(6);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f1054v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1055w;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1054v);
        parcel.writeInt(this.f1055w);
    }
}
