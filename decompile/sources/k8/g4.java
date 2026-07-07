package k8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g4 extends u7.a {
    public static final Parcelable.Creator<g4> CREATOR = new android.support.v4.media.a(26);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f7552v;

    public g4(ArrayList arrayList) {
        this.f7552v = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        com.bumptech.glide.d.a0(parcel, 1, this.f7552v);
        com.bumptech.glide.d.d0(parcel, iC0);
    }
}
