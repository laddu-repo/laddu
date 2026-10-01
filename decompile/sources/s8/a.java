package s8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends x8.a {
    public static final Parcelable.Creator<a> CREATOR = new c(0);

    /* renamed from: x, reason: collision with root package name */
    public final Intent f12224x;

    public a(Intent intent) {
        this.f12224x = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int A = a.a.A(parcel, 20293);
        a.a.v(parcel, 1, this.f12224x, i6);
        a.a.C(parcel, A);
    }
}
