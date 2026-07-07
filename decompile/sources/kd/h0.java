package kd;

import android.os.Parcel;
import android.os.Parcelable;
import wf.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@sf.e
/* loaded from: classes.dex */
public final class h0 implements Parcelable {
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final String F;
    public final String G;
    public final Integer H;
    public boolean I;

    /* renamed from: x, reason: collision with root package name */
    public final String f7857x;

    /* renamed from: y, reason: collision with root package name */
    public final String f7858y;

    /* renamed from: z, reason: collision with root package name */
    public final String f7859z;
    public static final f0 Companion = new Object();
    public static final Parcelable.Creator<h0> CREATOR = new g0(0);

    public /* synthetic */ h0(int i6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, boolean z10) {
        if (8 != (i6 & 8)) {
            u0.h(i6, 8, e0.f7848a.d());
            throw null;
        }
        if ((i6 & 1) == 0) {
            this.f7857x = null;
        } else {
            this.f7857x = str;
        }
        if ((i6 & 2) == 0) {
            this.f7858y = null;
        } else {
            this.f7858y = str2;
        }
        if ((i6 & 4) == 0) {
            this.f7859z = null;
        } else {
            this.f7859z = str3;
        }
        this.A = str4;
        if ((i6 & 16) == 0) {
            this.B = null;
        } else {
            this.B = str5;
        }
        if ((i6 & 32) == 0) {
            this.C = null;
        } else {
            this.C = str6;
        }
        if ((i6 & 64) == 0) {
            this.D = null;
        } else {
            this.D = str7;
        }
        if ((i6 & 128) == 0) {
            this.E = null;
        } else {
            this.E = str8;
        }
        if ((i6 & 256) == 0) {
            this.F = null;
        } else {
            this.F = str9;
        }
        if ((i6 & 512) == 0) {
            this.G = null;
        } else {
            this.G = str10;
        }
        if ((i6 & 1024) == 0) {
            this.H = null;
        } else {
            this.H = num;
        }
        this.I = (i6 & 2048) == 0 ? false : z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (kotlin.jvm.internal.k.a(this.f7857x, h0Var.f7857x) && kotlin.jvm.internal.k.a(this.f7858y, h0Var.f7858y) && kotlin.jvm.internal.k.a(this.f7859z, h0Var.f7859z) && kotlin.jvm.internal.k.a(this.A, h0Var.A) && kotlin.jvm.internal.k.a(this.B, h0Var.B) && kotlin.jvm.internal.k.a(this.C, h0Var.C) && kotlin.jvm.internal.k.a(this.D, h0Var.D) && kotlin.jvm.internal.k.a(this.E, h0Var.E) && kotlin.jvm.internal.k.a(this.F, h0Var.F) && kotlin.jvm.internal.k.a(this.G, h0Var.G) && kotlin.jvm.internal.k.a(this.H, h0Var.H)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int i6 = 0;
        String str = this.f7857x;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.f7858y;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.f7859z;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int g10 = h8.c.g(this.A, (i11 + hashCode3) * 31, 31);
        String str4 = this.B;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (g10 + hashCode4) * 31;
        String str5 = this.C;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str6 = this.D;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str7 = this.E;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        String str8 = this.F;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        String str9 = this.G;
        if (str9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str9.hashCode();
        }
        int i17 = (i16 + hashCode9) * 31;
        Integer num = this.H;
        if (num != null) {
            i6 = num.hashCode();
        }
        return i17 + i6;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaylistItem(name=");
        sb2.append(this.f7857x);
        sb2.append(", groupTitle=");
        sb2.append(this.f7858y);
        sb2.append(", logo=");
        r4.a.u(sb2, this.f7859z, ", link=", this.A, ", userAgent=");
        r4.a.u(sb2, this.B, ", referrer=", this.C, ", origin=");
        r4.a.u(sb2, this.D, ", cookie=", this.E, ", drmLicense=");
        r4.a.u(sb2, this.F, ", drmScheme=", this.G, ", id=");
        sb2.append(this.H);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i6) {
        kotlin.jvm.internal.k.e(dest, "dest");
        dest.writeString(this.f7857x);
        dest.writeString(this.f7858y);
        dest.writeString(this.f7859z);
        dest.writeString(this.A);
        dest.writeString(this.B);
        dest.writeString(this.C);
        dest.writeString(this.D);
        dest.writeString(this.E);
        dest.writeString(this.F);
        dest.writeString(this.G);
        Integer num = this.H;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    public h0(String str, String str2, String str3, String link, String str4, String str5, String str6, String str7, String str8, String str9, Integer num) {
        kotlin.jvm.internal.k.e(link, "link");
        this.f7857x = str;
        this.f7858y = str2;
        this.f7859z = str3;
        this.A = link;
        this.B = str4;
        this.C = str5;
        this.D = str6;
        this.E = str7;
        this.F = str8;
        this.G = str9;
        this.H = num;
    }
}
