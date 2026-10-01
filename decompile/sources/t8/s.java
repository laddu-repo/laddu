package t8;

import android.os.Parcel;
import android.os.Parcelable;
import kd.g0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s extends x8.a {
    public static final Parcelable.Creator<s> CREATOR = new g0(18);
    public final int A;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f12665x;

    /* renamed from: y, reason: collision with root package name */
    public final String f12666y;

    /* renamed from: z, reason: collision with root package name */
    public final int f12667z;

    public s(String str, int i6, int i10, boolean z10) {
        this.f12665x = z10;
        this.f12666y = str;
        this.f12667z = android.support.v4.media.session.b.x(i6) - 1;
        this.A = a8.i.t(i10) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int A = a.a.A(parcel, 20293);
        a.a.D(parcel, 1, 4);
        parcel.writeInt(this.f12665x ? 1 : 0);
        a.a.w(parcel, 2, this.f12666y);
        a.a.D(parcel, 3, 4);
        parcel.writeInt(this.f12667z);
        a.a.D(parcel, 4, 4);
        parcel.writeInt(this.A);
        a.a.C(parcel, A);
    }
}
