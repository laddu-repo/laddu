package n9;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends x8.a {
    public static final Parcelable.Creator<d> CREATOR = new kd.g0(2);

    /* renamed from: x, reason: collision with root package name */
    public final long f9205x;

    /* renamed from: y, reason: collision with root package name */
    public final int f9206y;

    /* renamed from: z, reason: collision with root package name */
    public final long f9207z;

    public d(int i6, long j, long j10) {
        this.f9205x = j;
        this.f9206y = i6;
        this.f9207z = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int A = a.a.A(parcel, 20293);
        a.a.D(parcel, 1, 8);
        parcel.writeLong(this.f9205x);
        a.a.D(parcel, 2, 4);
        parcel.writeInt(this.f9206y);
        a.a.D(parcel, 3, 8);
        parcel.writeLong(this.f9207z);
        a.a.C(parcel, A);
    }
}
