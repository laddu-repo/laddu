package n9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u extends x8.a implements Iterable {
    public static final Parcelable.Creator<u> CREATOR = new kd.g0(5);

    /* renamed from: x, reason: collision with root package name */
    public final Bundle f9492x;

    public u(Bundle bundle) {
        this.f9492x = bundle;
    }

    public final Object a(String str) {
        return this.f9492x.get(str);
    }

    public final Double b() {
        return Double.valueOf(this.f9492x.getDouble("value"));
    }

    public final String c() {
        return this.f9492x.getString(InAppPurchaseMetaData.KEY_CURRENCY);
    }

    public final Bundle d() {
        return new Bundle(this.f9492x);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new t(this);
    }

    public final String toString() {
        return this.f9492x.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int A = a.a.A(parcel, 20293);
        a.a.t(parcel, 2, d());
        a.a.C(parcel, A);
    }
}
