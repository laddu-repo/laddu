package n9;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l4 extends x8.a {
    public static final Parcelable.Creator<l4> CREATOR = new kd.g0(12);
    public final String A;
    public final long B;
    public final long C;
    public final String D;
    public final boolean E;
    public final boolean F;
    public final long G;
    public final String H;
    public final long I;
    public final int J;
    public final boolean K;
    public final boolean L;
    public final Boolean M;
    public final long N;
    public final List O;
    public final String P;
    public final String Q;
    public final String R;
    public final boolean S;
    public final long T;
    public final int U;
    public final String V;
    public final int W;
    public final long X;
    public final String Y;
    public final String Z;

    /* renamed from: a0, reason: collision with root package name */
    public final long f9384a0;

    /* renamed from: b0, reason: collision with root package name */
    public final int f9385b0;

    /* renamed from: x, reason: collision with root package name */
    public final String f9386x;

    /* renamed from: y, reason: collision with root package name */
    public final String f9387y;

    /* renamed from: z, reason: collision with root package name */
    public final String f9388z;

    public l4(String str, String str2, String str3, long j, String str4, long j10, long j11, String str5, boolean z10, boolean z11, String str6, long j12, int i6, boolean z12, boolean z13, Boolean bool, long j13, List list, String str7, String str8, String str9, boolean z14, long j14, int i10, String str10, int i11, long j15, String str11, String str12, long j16, int i12) {
        w8.x.d(str);
        this.f9386x = str;
        this.f9387y = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f9388z = str3;
        this.G = j;
        this.A = str4;
        this.B = j10;
        this.C = j11;
        this.D = str5;
        this.E = z10;
        this.F = z11;
        this.H = str6;
        this.I = j12;
        this.J = i6;
        this.K = z12;
        this.L = z13;
        this.M = bool;
        this.N = j13;
        this.O = list;
        this.P = str7;
        this.Q = str8;
        this.R = str9;
        this.S = z14;
        this.T = j14;
        this.U = i10;
        this.V = str10;
        this.W = i11;
        this.X = j15;
        this.Y = str11;
        this.Z = str12;
        this.f9384a0 = j16;
        this.f9385b0 = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int A = a.a.A(parcel, 20293);
        a.a.w(parcel, 2, this.f9386x);
        a.a.w(parcel, 3, this.f9387y);
        a.a.w(parcel, 4, this.f9388z);
        a.a.w(parcel, 5, this.A);
        a.a.D(parcel, 6, 8);
        parcel.writeLong(this.B);
        a.a.D(parcel, 7, 8);
        parcel.writeLong(this.C);
        a.a.w(parcel, 8, this.D);
        a.a.D(parcel, 9, 4);
        parcel.writeInt(this.E ? 1 : 0);
        a.a.D(parcel, 10, 4);
        parcel.writeInt(this.F ? 1 : 0);
        a.a.D(parcel, 11, 8);
        parcel.writeLong(this.G);
        a.a.w(parcel, 12, this.H);
        a.a.D(parcel, 14, 8);
        parcel.writeLong(this.I);
        a.a.D(parcel, 15, 4);
        parcel.writeInt(this.J);
        a.a.D(parcel, 16, 4);
        parcel.writeInt(this.K ? 1 : 0);
        a.a.D(parcel, 18, 4);
        parcel.writeInt(this.L ? 1 : 0);
        Boolean bool = this.M;
        if (bool != null) {
            a.a.D(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        a.a.D(parcel, 22, 8);
        parcel.writeLong(this.N);
        List<String> list = this.O;
        if (list != null) {
            int A2 = a.a.A(parcel, 23);
            parcel.writeStringList(list);
            a.a.C(parcel, A2);
        }
        a.a.w(parcel, 25, this.P);
        a.a.w(parcel, 26, this.Q);
        a.a.w(parcel, 27, this.R);
        a.a.D(parcel, 28, 4);
        parcel.writeInt(this.S ? 1 : 0);
        a.a.D(parcel, 29, 8);
        parcel.writeLong(this.T);
        a.a.D(parcel, 30, 4);
        parcel.writeInt(this.U);
        a.a.w(parcel, 31, this.V);
        a.a.D(parcel, 32, 4);
        parcel.writeInt(this.W);
        a.a.D(parcel, 34, 8);
        parcel.writeLong(this.X);
        a.a.w(parcel, 35, this.Y);
        a.a.w(parcel, 36, this.Z);
        a.a.D(parcel, 37, 8);
        parcel.writeLong(this.f9384a0);
        a.a.D(parcel, 38, 4);
        parcel.writeInt(this.f9385b0);
        a.a.C(parcel, A);
    }

    public l4(String str, String str2, String str3, String str4, long j, long j10, String str5, boolean z10, boolean z11, long j11, String str6, long j12, int i6, boolean z12, boolean z13, Boolean bool, long j13, ArrayList arrayList, String str7, String str8, String str9, boolean z14, long j14, int i10, String str10, int i11, long j15, String str11, String str12, long j16, int i12) {
        this.f9386x = str;
        this.f9387y = str2;
        this.f9388z = str3;
        this.G = j11;
        this.A = str4;
        this.B = j;
        this.C = j10;
        this.D = str5;
        this.E = z10;
        this.F = z11;
        this.H = str6;
        this.I = j12;
        this.J = i6;
        this.K = z12;
        this.L = z13;
        this.M = bool;
        this.N = j13;
        this.O = arrayList;
        this.P = str7;
        this.Q = str8;
        this.R = str9;
        this.S = z14;
        this.T = j14;
        this.U = i10;
        this.V = str10;
        this.W = i11;
        this.X = j15;
        this.Y = str11;
        this.Z = str12;
        this.f9384a0 = j16;
        this.f9385b0 = i12;
    }
}
