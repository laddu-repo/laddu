package n9;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v extends x8.a {
    public static final Parcelable.Creator<v> CREATOR = new kd.g0(6);
    public final long A;

    /* renamed from: x, reason: collision with root package name */
    public final String f9500x;

    /* renamed from: y, reason: collision with root package name */
    public final u f9501y;

    /* renamed from: z, reason: collision with root package name */
    public final String f9502z;

    public v(String str, u uVar, String str2, long j) {
        this.f9500x = str;
        this.f9501y = uVar;
        this.f9502z = str2;
        this.A = j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9501y);
        String str = this.f9502z;
        int length = String.valueOf(str).length();
        String str2 = this.f9500x;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + valueOf.length());
        r4.a.u(sb2, "origin=", str, ",name=", str2);
        return r4.a.o(sb2, ",params=", valueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        kd.g0.a(this, parcel, i6);
    }

    public v(v vVar, long j) {
        w8.x.g(vVar);
        this.f9500x = vVar.f9500x;
        this.f9501y = vVar.f9501y;
        this.f9502z = vVar.f9502z;
        this.A = j;
    }
}
