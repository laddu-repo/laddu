package n9;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t3 extends x8.a {
    public static final Parcelable.Creator<t3> CREATOR = new kd.g0(7);

    /* renamed from: x, reason: collision with root package name */
    public final String f9489x;

    /* renamed from: y, reason: collision with root package name */
    public final long f9490y;

    /* renamed from: z, reason: collision with root package name */
    public final int f9491z;

    public t3(int i6, String str, long j) {
        this.f9489x = str;
        this.f9490y = j;
        this.f9491z = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int A = a.a.A(parcel, 20293);
        a.a.w(parcel, 1, this.f9489x);
        a.a.D(parcel, 2, 8);
        parcel.writeLong(this.f9490y);
        a.a.D(parcel, 3, 4);
        parcel.writeInt(this.f9491z);
        a.a.C(parcel, A);
    }
}
