package sb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o extends u7.a {
    public static final Parcelable.Creator<o> CREATOR = new m8.c(14);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Bundle f11739v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public v.e f11740w;

    public o(Bundle bundle) {
        this.f11739v = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        com.bumptech.glide.d.S(parcel, 2, this.f11739v);
        com.bumptech.glide.d.d0(parcel, iC0);
    }
}
