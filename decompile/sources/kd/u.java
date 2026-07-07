package kd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import wf.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@sf.e
/* loaded from: classes.dex */
public final class u implements Parcelable {
    public final String A;
    public final List B;
    public final a0 C;

    /* renamed from: x, reason: collision with root package name */
    public final long f7900x;

    /* renamed from: y, reason: collision with root package name */
    public final String f7901y;

    /* renamed from: z, reason: collision with root package name */
    public final String f7902z;
    public static final t Companion = new Object();
    public static final Parcelable.Creator<u> CREATOR = new android.support.v4.media.a(28);
    public static final he.f[] D = {null, null, null, null, he.a.c(he.g.f6074y, new d.a0(11)), null};

    public /* synthetic */ u(int i6, long j, String str, String str2, String str3, List list, a0 a0Var) {
        if (63 != (i6 & 63)) {
            u0.h(i6, 63, s.f7899a.d());
            throw null;
        }
        this.f7900x = j;
        this.f7901y = str;
        this.f7902z = str2;
        this.A = str3;
        this.B = list;
        this.C = a0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f7900x == uVar.f7900x && kotlin.jvm.internal.k.a(this.f7901y, uVar.f7901y) && kotlin.jvm.internal.k.a(this.f7902z, uVar.f7902z) && kotlin.jvm.internal.k.a(this.A, uVar.A) && kotlin.jvm.internal.k.a(this.B, uVar.B) && kotlin.jvm.internal.k.a(this.C, uVar.C)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f7900x;
        return this.C.hashCode() + ((this.B.hashCode() + h8.c.g(this.A, h8.c.g(this.f7902z, h8.c.g(this.f7901y, ((int) (j ^ (j >>> 32))) * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventChannel(id=");
        sb2.append(this.f7900x);
        sb2.append(", title=");
        sb2.append(this.f7901y);
        r4.a.u(sb2, ", image=", this.f7902z, ", category=", this.A);
        sb2.append(", formats=");
        sb2.append(this.B);
        sb2.append(", eventInfo=");
        sb2.append(this.C);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i6) {
        kotlin.jvm.internal.k.e(dest, "dest");
        dest.writeLong(this.f7900x);
        dest.writeString(this.f7901y);
        dest.writeString(this.f7902z);
        dest.writeString(this.A);
        dest.writeStringList(this.B);
        this.C.writeToParcel(dest, i6);
    }

    public u(long j, String title, String image, String category, ArrayList formats, a0 eventInfo) {
        kotlin.jvm.internal.k.e(title, "title");
        kotlin.jvm.internal.k.e(image, "image");
        kotlin.jvm.internal.k.e(category, "category");
        kotlin.jvm.internal.k.e(formats, "formats");
        kotlin.jvm.internal.k.e(eventInfo, "eventInfo");
        this.f7900x = j;
        this.f7901y = title;
        this.f7902z = image;
        this.A = category;
        this.B = formats;
        this.C = eventInfo;
    }
}
