package w4;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new kd.g0(22);

    /* renamed from: x, reason: collision with root package name */
    public int f13818x;

    /* renamed from: y, reason: collision with root package name */
    public int f13819y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f13820z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f13818x);
        parcel.writeInt(this.f13819y);
        parcel.writeInt(this.f13820z ? 1 : 0);
    }
}
