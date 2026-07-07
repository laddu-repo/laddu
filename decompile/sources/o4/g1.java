package o4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements Parcelable {
    public static final Parcelable.Creator<g1> CREATOR = new m8.c(6);
    public int[] A;
    public ArrayList B;
    public boolean C;
    public boolean D;
    public boolean E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f9728v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9729w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9730x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int[] f9731y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f9732z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9728v);
        parcel.writeInt(this.f9729w);
        parcel.writeInt(this.f9730x);
        if (this.f9730x > 0) {
            parcel.writeIntArray(this.f9731y);
        }
        parcel.writeInt(this.f9732z);
        if (this.f9732z > 0) {
            parcel.writeIntArray(this.A);
        }
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeInt(this.D ? 1 : 0);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeList(this.B);
    }
}
