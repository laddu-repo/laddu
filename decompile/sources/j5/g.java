package j5;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g extends View.BaseSavedState {
    public static final Parcelable.Creator<g> CREATOR = new android.support.v4.media.a(17);
    public int A;
    public int B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f6828v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6829w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f6830x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f6831y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f6832z;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f6828v);
        parcel.writeFloat(this.f6830x);
        parcel.writeInt(this.f6831y ? 1 : 0);
        parcel.writeString(this.f6832z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
    }
}
