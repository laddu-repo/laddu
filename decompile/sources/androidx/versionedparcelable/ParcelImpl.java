package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kd.g0;
import q5.b;
import q5.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new g0(14);

    /* renamed from: x, reason: collision with root package name */
    public final c f1177x;

    public ParcelImpl(c cVar) {
        this.f1177x = cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        new b(parcel).l(this.f1177x);
    }

    public ParcelImpl(Parcel parcel) {
        this.f1177x = new b(parcel).h();
    }
}
