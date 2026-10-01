package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements Parcelable {
    public static final Parcelable.Creator<r0> CREATOR = new android.support.v4.media.a(7);
    public ArrayList A;
    public ArrayList B;
    public ArrayList C;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f1093v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f1094w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b[] f1095x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1096y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f1097z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1093v);
        parcel.writeStringList(this.f1094w);
        parcel.writeTypedArray(this.f1095x, i);
        parcel.writeInt(this.f1096y);
        parcel.writeString(this.f1097z);
        parcel.writeStringList(this.A);
        parcel.writeTypedList(this.B);
        parcel.writeTypedList(this.C);
    }
}
