package kd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import wf.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@sf.e
/* loaded from: classes.dex */
public final class l implements Parcelable {
    public final List A;
    public boolean B;

    /* renamed from: x, reason: collision with root package name */
    public final long f7876x;

    /* renamed from: y, reason: collision with root package name */
    public final String f7877y;

    /* renamed from: z, reason: collision with root package name */
    public final String f7878z;
    public static final k Companion = new Object();
    public static final Parcelable.Creator<l> CREATOR = new android.support.v4.media.a(27);
    public static final he.f[] C = {null, null, null, he.a.c(he.g.f6074y, new d.a0(10)), null};

    public /* synthetic */ l(int i6, long j, String str, String str2, List list, boolean z10) {
        if (15 != (i6 & 15)) {
            u0.h(i6, 15, j.f7868a.d());
            throw null;
        }
        this.f7876x = j;
        this.f7877y = str;
        this.f7878z = str2;
        this.A = list;
        if ((i6 & 16) == 0) {
            this.B = false;
        } else {
            this.B = z10;
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
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f7876x == lVar.f7876x && kotlin.jvm.internal.k.a(this.f7877y, lVar.f7877y) && kotlin.jvm.internal.k.a(this.f7878z, lVar.f7878z) && kotlin.jvm.internal.k.a(this.A, lVar.A)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f7876x;
        return this.A.hashCode() + h8.c.g(this.f7878z, h8.c.g(this.f7877y, ((int) (j ^ (j >>> 32))) * 31, 31), 31);
    }

    public final String toString() {
        return "Channel(id=" + this.f7876x + ", title=" + this.f7877y + ", image=" + this.f7878z + ", formats=" + this.A + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i6) {
        kotlin.jvm.internal.k.e(dest, "dest");
        dest.writeLong(this.f7876x);
        dest.writeString(this.f7877y);
        dest.writeString(this.f7878z);
        dest.writeStringList(this.A);
    }

    public l(long j, String title, String image, List formats) {
        kotlin.jvm.internal.k.e(title, "title");
        kotlin.jvm.internal.k.e(image, "image");
        kotlin.jvm.internal.k.e(formats, "formats");
        this.f7876x = j;
        this.f7877y = title;
        this.f7878z = image;
        this.A = formats;
    }
}
