package k8;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v4 extends u7.a {
    public static final Parcelable.Creator<v4> CREATOR = new android.support.v4.media.a(28);
    public final long A;
    public final String B;
    public final boolean C;
    public final boolean D;
    public final long E;
    public final String F;
    public final long G;
    public final int H;
    public final boolean I;
    public final boolean J;
    public final Boolean K;
    public final long L;
    public final List M;
    public final String N;
    public final String O;
    public final String P;
    public final boolean Q;
    public final long R;
    public final int S;
    public final String T;
    public final int U;
    public final long V;
    public final String W;
    public final String X;
    public final long Y;
    public final int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final long f7804a0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f7805v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f7806w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f7807x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f7808y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f7809z;

    public v4(String str, String str2, String str3, long j8, String str4, long j9, long j10, String str5, boolean z2, boolean z10, String str6, long j11, int i, boolean z11, boolean z12, Boolean bool, long j12, List list, String str7, String str8, String str9, boolean z13, long j13, int i10, String str10, int i11, long j14, String str11, String str12, long j15, int i12, long j16) {
        t7.y.d(str);
        this.f7805v = str;
        this.f7806w = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f7807x = str3;
        this.E = j8;
        this.f7808y = str4;
        this.f7809z = j9;
        this.A = j10;
        this.B = str5;
        this.C = z2;
        this.D = z10;
        this.F = str6;
        this.G = j11;
        this.H = i;
        this.I = z11;
        this.J = z12;
        this.K = bool;
        this.L = j12;
        this.M = list;
        this.N = str7;
        this.O = str8;
        this.P = str9;
        this.Q = z13;
        this.R = j13;
        this.S = i10;
        this.T = str10;
        this.U = i11;
        this.V = j14;
        this.W = str11;
        this.X = str12;
        this.Y = j15;
        this.Z = i12;
        this.f7804a0 = j16;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        com.bumptech.glide.d.Y(parcel, 2, this.f7805v);
        com.bumptech.glide.d.Y(parcel, 3, this.f7806w);
        com.bumptech.glide.d.Y(parcel, 4, this.f7807x);
        com.bumptech.glide.d.Y(parcel, 5, this.f7808y);
        com.bumptech.glide.d.b0(parcel, 6, 8);
        parcel.writeLong(this.f7809z);
        com.bumptech.glide.d.b0(parcel, 7, 8);
        parcel.writeLong(this.A);
        com.bumptech.glide.d.Y(parcel, 8, this.B);
        com.bumptech.glide.d.b0(parcel, 9, 4);
        parcel.writeInt(this.C ? 1 : 0);
        com.bumptech.glide.d.b0(parcel, 10, 4);
        parcel.writeInt(this.D ? 1 : 0);
        com.bumptech.glide.d.b0(parcel, 11, 8);
        parcel.writeLong(this.E);
        com.bumptech.glide.d.Y(parcel, 12, this.F);
        com.bumptech.glide.d.b0(parcel, 14, 8);
        parcel.writeLong(this.G);
        com.bumptech.glide.d.b0(parcel, 15, 4);
        parcel.writeInt(this.H);
        com.bumptech.glide.d.b0(parcel, 16, 4);
        parcel.writeInt(this.I ? 1 : 0);
        com.bumptech.glide.d.b0(parcel, 18, 4);
        parcel.writeInt(this.J ? 1 : 0);
        Boolean bool = this.K;
        if (bool != null) {
            com.bumptech.glide.d.b0(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        com.bumptech.glide.d.b0(parcel, 22, 8);
        parcel.writeLong(this.L);
        List<String> list = this.M;
        if (list != null) {
            int iC02 = com.bumptech.glide.d.c0(parcel, 23);
            parcel.writeStringList(list);
            com.bumptech.glide.d.d0(parcel, iC02);
        }
        com.bumptech.glide.d.Y(parcel, 25, this.N);
        com.bumptech.glide.d.Y(parcel, 26, this.O);
        com.bumptech.glide.d.Y(parcel, 27, this.P);
        com.bumptech.glide.d.b0(parcel, 28, 4);
        parcel.writeInt(this.Q ? 1 : 0);
        com.bumptech.glide.d.b0(parcel, 29, 8);
        parcel.writeLong(this.R);
        com.bumptech.glide.d.b0(parcel, 30, 4);
        parcel.writeInt(this.S);
        com.bumptech.glide.d.Y(parcel, 31, this.T);
        com.bumptech.glide.d.b0(parcel, 32, 4);
        parcel.writeInt(this.U);
        com.bumptech.glide.d.b0(parcel, 34, 8);
        parcel.writeLong(this.V);
        com.bumptech.glide.d.Y(parcel, 35, this.W);
        com.bumptech.glide.d.Y(parcel, 36, this.X);
        com.bumptech.glide.d.b0(parcel, 37, 8);
        parcel.writeLong(this.Y);
        com.bumptech.glide.d.b0(parcel, 38, 4);
        parcel.writeInt(this.Z);
        com.bumptech.glide.d.b0(parcel, 39, 8);
        parcel.writeLong(this.f7804a0);
        com.bumptech.glide.d.d0(parcel, iC0);
    }

    public v4(String str, String str2, String str3, String str4, long j8, long j9, String str5, boolean z2, boolean z10, long j10, String str6, long j11, int i, boolean z11, boolean z12, Boolean bool, long j12, ArrayList arrayList, String str7, String str8, String str9, boolean z13, long j13, int i10, String str10, int i11, long j14, String str11, String str12, long j15, int i12, long j16) {
        this.f7805v = str;
        this.f7806w = str2;
        this.f7807x = str3;
        this.E = j10;
        this.f7808y = str4;
        this.f7809z = j8;
        this.A = j9;
        this.B = str5;
        this.C = z2;
        this.D = z10;
        this.F = str6;
        this.G = j11;
        this.H = i;
        this.I = z11;
        this.J = z12;
        this.K = bool;
        this.L = j12;
        this.M = arrayList;
        this.N = str7;
        this.O = str8;
        this.P = str9;
        this.Q = z13;
        this.R = j13;
        this.S = i10;
        this.T = str10;
        this.U = i11;
        this.V = j14;
        this.W = str11;
        this.X = str12;
        this.Y = j15;
        this.Z = i12;
        this.f7804a0 = j16;
    }
}
