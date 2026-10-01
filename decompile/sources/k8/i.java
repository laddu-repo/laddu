package k8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i extends u7.a {
    public static final Parcelable.Creator<i> CREATOR = new android.support.v4.media.a(20);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Bundle f7571v;

    public i(Bundle bundle) {
        this.f7571v = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        com.bumptech.glide.d.S(parcel, 1, this.f7571v);
        com.bumptech.glide.d.d0(parcel, iC0);
    }
}
