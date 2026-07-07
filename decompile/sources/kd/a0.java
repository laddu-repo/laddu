package kd;

import android.os.Parcel;
import android.os.Parcelable;
import okhttp3.internal.ws.WebSocketProtocol;
import wf.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@sf.e
/* loaded from: classes.dex */
public final class a0 implements Parcelable {
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final int E;
    public final String F;

    /* renamed from: x, reason: collision with root package name */
    public final String f7835x;

    /* renamed from: y, reason: collision with root package name */
    public final String f7836y;

    /* renamed from: z, reason: collision with root package name */
    public final String f7837z;
    public static final z Companion = new Object();
    public static final Parcelable.Creator<a0> CREATOR = new android.support.v4.media.a(29);

    public /* synthetic */ a0(int i6, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, String str8) {
        if (126 != (i6 & WebSocketProtocol.PAYLOAD_SHORT)) {
            u0.h(i6, WebSocketProtocol.PAYLOAD_SHORT, y.f7907a.d());
            throw null;
        }
        if ((i6 & 1) == 0) {
            this.f7835x = null;
        } else {
            this.f7835x = str;
        }
        this.f7836y = str2;
        this.f7837z = str3;
        this.A = str4;
        this.B = str5;
        this.C = str6;
        this.D = str7;
        if ((i6 & 128) == 0) {
            this.E = 0;
        } else {
            this.E = i10;
        }
        if ((i6 & 256) == 0) {
            this.F = null;
        } else {
            this.F = str8;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (kotlin.jvm.internal.k.a(this.f7835x, a0Var.f7835x) && kotlin.jvm.internal.k.a(this.f7836y, a0Var.f7836y) && kotlin.jvm.internal.k.a(this.f7837z, a0Var.f7837z) && kotlin.jvm.internal.k.a(this.A, a0Var.A) && kotlin.jvm.internal.k.a(this.B, a0Var.B) && kotlin.jvm.internal.k.a(this.C, a0Var.C) && kotlin.jvm.internal.k.a(this.D, a0Var.D) && this.E == a0Var.E && kotlin.jvm.internal.k.a(this.F, a0Var.F)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i6 = 0;
        String str = this.f7835x;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int g10 = (h8.c.g(this.D, h8.c.g(this.C, h8.c.g(this.B, h8.c.g(this.A, h8.c.g(this.f7837z, h8.c.g(this.f7836y, hashCode * 31, 31), 31), 31), 31), 31), 31) + this.E) * 31;
        String str2 = this.F;
        if (str2 != null) {
            i6 = str2.hashCode();
        }
        return g10 + i6;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LiveEvent(eventName=");
        sb2.append(this.f7835x);
        sb2.append(", teamA=");
        sb2.append(this.f7836y);
        sb2.append(", teamB=");
        r4.a.u(sb2, this.f7837z, ", teamAFlag=", this.A, ", teamBFlag=");
        r4.a.u(sb2, this.B, ", startTime=", this.C, ", endTime=");
        sb2.append(this.D);
        sb2.append(", isPinned=");
        sb2.append(this.E);
        sb2.append(", eventBanner=");
        return r4.a.o(sb2, this.F, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i6) {
        kotlin.jvm.internal.k.e(dest, "dest");
        dest.writeString(this.f7835x);
        dest.writeString(this.f7836y);
        dest.writeString(this.f7837z);
        dest.writeString(this.A);
        dest.writeString(this.B);
        dest.writeString(this.C);
        dest.writeString(this.D);
        dest.writeInt(this.E);
        dest.writeString(this.F);
    }

    public a0(String str, String teamA, String teamB, String teamAFlag, String teamBFlag, String startTime, String endTime, int i6, String str2) {
        kotlin.jvm.internal.k.e(teamA, "teamA");
        kotlin.jvm.internal.k.e(teamB, "teamB");
        kotlin.jvm.internal.k.e(teamAFlag, "teamAFlag");
        kotlin.jvm.internal.k.e(teamBFlag, "teamBFlag");
        kotlin.jvm.internal.k.e(startTime, "startTime");
        kotlin.jvm.internal.k.e(endTime, "endTime");
        this.f7835x = str;
        this.f7836y = teamA;
        this.f7837z = teamB;
        this.A = teamAFlag;
        this.B = teamBFlag;
        this.C = startTime;
        this.D = endTime;
        this.E = i6;
        this.F = str2;
    }
}
