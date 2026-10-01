package j4;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h0 implements Parcelable {
    public static final Parcelable.Creator<h0> CREATOR = new android.support.v4.media.a(23);
    public int A;
    public int B;

    /* renamed from: x, reason: collision with root package name */
    public int f7173x;

    /* renamed from: y, reason: collision with root package name */
    public int f7174y;

    /* renamed from: z, reason: collision with root package name */
    public int f7175z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f7173x);
        parcel.writeInt(this.f7175z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.f7174y);
    }
}
