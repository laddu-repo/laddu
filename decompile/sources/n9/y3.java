package n9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y3 extends x8.a {
    public static final Parcelable.Creator<y3> CREATOR = new kd.g0(10);

    /* renamed from: x, reason: collision with root package name */
    public final List f9540x;

    public y3(ArrayList arrayList) {
        this.f9540x = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int A = a.a.A(parcel, 20293);
        a.a.y(parcel, 1, this.f9540x);
        a.a.C(parcel, A);
    }
}
