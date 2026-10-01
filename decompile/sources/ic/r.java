package ic;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r extends x8.a {
    public static final Parcelable.Creator<r> CREATOR = new android.support.v4.media.a(12);

    /* renamed from: x, reason: collision with root package name */
    public final Bundle f6779x;

    /* renamed from: y, reason: collision with root package name */
    public v.e f6780y;

    public r(Bundle bundle) {
        this.f6779x = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int A = a.a.A(parcel, 20293);
        a.a.t(parcel, 2, this.f6779x);
        a.a.C(parcel, A);
    }
}
