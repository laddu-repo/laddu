package o4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements Parcelable {
    public static final Parcelable.Creator<f1> CREATOR = new m8.c(5);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f9714v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9715w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int[] f9716x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f9717y;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f9714v + ", mGapDir=" + this.f9715w + ", mHasUnwantedGapAfter=" + this.f9717y + ", mGapPerSpan=" + Arrays.toString(this.f9716x) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9714v);
        parcel.writeInt(this.f9715w);
        parcel.writeInt(this.f9717y ? 1 : 0);
        int[] iArr = this.f9716x;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f9716x);
        }
    }
}
