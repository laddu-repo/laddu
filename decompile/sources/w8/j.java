package w8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends x8.a {
    public static final Parcelable.Creator<j> CREATOR = new kd.g0(26);
    public final long A;
    public final long B;
    public final String C;
    public final String D;
    public final int E;
    public final int F;

    /* renamed from: x, reason: collision with root package name */
    public final int f14204x;

    /* renamed from: y, reason: collision with root package name */
    public final int f14205y;

    /* renamed from: z, reason: collision with root package name */
    public final int f14206z;

    public j(int i6, int i10, int i11, long j, long j10, String str, String str2, int i12, int i13) {
        this.f14204x = i6;
        this.f14205y = i10;
        this.f14206z = i11;
        this.A = j;
        this.B = j10;
        this.C = str;
        this.D = str2;
        this.E = i12;
        this.F = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int A = a.a.A(parcel, 20293);
        a.a.D(parcel, 1, 4);
        parcel.writeInt(this.f14204x);
        a.a.D(parcel, 2, 4);
        parcel.writeInt(this.f14205y);
        a.a.D(parcel, 3, 4);
        parcel.writeInt(this.f14206z);
        a.a.D(parcel, 4, 8);
        parcel.writeLong(this.A);
        a.a.D(parcel, 5, 8);
        parcel.writeLong(this.B);
        a.a.w(parcel, 6, this.C);
        a.a.w(parcel, 7, this.D);
        a.a.D(parcel, 8, 4);
        parcel.writeInt(this.E);
        a.a.D(parcel, 9, 4);
        parcel.writeInt(this.F);
        a.a.C(parcel, A);
    }
}
