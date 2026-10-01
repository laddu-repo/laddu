package c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new android.support.v4.media.a(5);

    /* renamed from: x, reason: collision with root package name */
    public b f1756x;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        synchronized (this) {
            try {
                if (this.f1756x == null) {
                    this.f1756x = new c(this);
                }
                parcel.writeStrongBinder(this.f1756x.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i6, Bundle bundle) {
    }
}
