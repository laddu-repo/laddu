package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new android.support.v4.media.a(5);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f985v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f986w;

    public c(Parcel parcel) {
        this.f985v = parcel.createStringArrayList();
        this.f986w = parcel.createTypedArrayList(b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f985v);
        parcel.writeTypedList(this.f986w);
    }
}
