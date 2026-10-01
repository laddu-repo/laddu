package w8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n extends x8.a {
    public static final Parcelable.Creator<n> CREATOR = new kd.g0(25);

    /* renamed from: x, reason: collision with root package name */
    public final int f14214x;

    /* renamed from: y, reason: collision with root package name */
    public List f14215y;

    public n(int i6, List list) {
        this.f14214x = i6;
        this.f14215y = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int A = a.a.A(parcel, 20293);
        a.a.D(parcel, 1, 4);
        parcel.writeInt(this.f14214x);
        a.a.y(parcel, 2, this.f14215y);
        a.a.C(parcel, A);
    }
}
