package n9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w3 extends x8.a {
    public static final Parcelable.Creator<w3> CREATOR = new kd.g0(8);
    public final Bundle A;
    public final int B;
    public final long C;
    public String D;

    /* renamed from: x, reason: collision with root package name */
    public final long f9517x;

    /* renamed from: y, reason: collision with root package name */
    public byte[] f9518y;

    /* renamed from: z, reason: collision with root package name */
    public final String f9519z;

    public w3(long j, byte[] bArr, String str, Bundle bundle, int i6, long j10, String str2) {
        this.f9517x = j;
        this.f9518y = bArr;
        this.f9519z = str;
        this.A = bundle;
        this.B = i6;
        this.C = j10;
        this.D = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int A = a.a.A(parcel, 20293);
        a.a.D(parcel, 1, 8);
        parcel.writeLong(this.f9517x);
        byte[] bArr = this.f9518y;
        if (bArr != null) {
            int A2 = a.a.A(parcel, 2);
            parcel.writeByteArray(bArr);
            a.a.C(parcel, A2);
        }
        a.a.w(parcel, 3, this.f9519z);
        a.a.t(parcel, 4, this.A);
        a.a.D(parcel, 5, 4);
        parcel.writeInt(this.B);
        a.a.D(parcel, 6, 8);
        parcel.writeLong(this.C);
        a.a.w(parcel, 7, this.D);
        a.a.C(parcel, A);
    }
}
