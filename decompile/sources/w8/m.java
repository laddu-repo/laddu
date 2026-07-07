package w8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m extends x8.a {
    public static final Parcelable.Creator<m> CREATOR = new kd.g0(27);
    public final int A;
    public final int B;

    /* renamed from: x, reason: collision with root package name */
    public final int f14211x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f14212y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f14213z;

    public m(int i6, boolean z10, boolean z11, int i10, int i11) {
        this.f14211x = i6;
        this.f14212y = z10;
        this.f14213z = z11;
        this.A = i10;
        this.B = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int A = a.a.A(parcel, 20293);
        a.a.D(parcel, 1, 4);
        parcel.writeInt(this.f14211x);
        a.a.D(parcel, 2, 4);
        parcel.writeInt(this.f14212y ? 1 : 0);
        a.a.D(parcel, 3, 4);
        parcel.writeInt(this.f14213z ? 1 : 0);
        a.a.D(parcel, 4, 4);
        parcel.writeInt(this.A);
        a.a.D(parcel, 5, 4);
        parcel.writeInt(this.B);
        a.a.C(parcel, A);
    }
}
