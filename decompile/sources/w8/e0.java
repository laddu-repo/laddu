package w8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e0 extends x8.a {
    public static final Parcelable.Creator<e0> CREATOR = new kd.g0(28);
    public g A;

    /* renamed from: x, reason: collision with root package name */
    public Bundle f14156x;

    /* renamed from: y, reason: collision with root package name */
    public t8.d[] f14157y;

    /* renamed from: z, reason: collision with root package name */
    public int f14158z;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int A = a.a.A(parcel, 20293);
        a.a.t(parcel, 1, this.f14156x);
        a.a.x(parcel, 2, this.f14157y, i6);
        int i10 = this.f14158z;
        a.a.D(parcel, 3, 4);
        parcel.writeInt(i10);
        a.a.v(parcel, 4, this.A, i6);
        a.a.C(parcel, A);
    }
}
