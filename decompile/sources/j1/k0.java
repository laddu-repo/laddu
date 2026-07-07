package j1;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k0 implements Parcelable {
    public static final Parcelable.Creator<k0> CREATOR = new android.support.v4.media.a(15);

    /* renamed from: x, reason: collision with root package name */
    public String f6925x;

    /* renamed from: y, reason: collision with root package name */
    public int f6926y;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f6925x);
        parcel.writeInt(this.f6926y);
    }
}
