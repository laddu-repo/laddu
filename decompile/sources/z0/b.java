package z0;

import aa.c;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: x, reason: collision with root package name */
    public final Parcelable f15113x;

    /* renamed from: y, reason: collision with root package name */
    public static final a f15112y = new b();
    public static final Parcelable.Creator<b> CREATOR = new c(9);

    public b() {
        this.f15113x = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeParcelable(this.f15113x, i6);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f15113x = parcelable == f15112y ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f15113x = readParcelable == null ? f15112y : readParcelable;
    }
}
