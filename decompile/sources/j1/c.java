package j1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new android.support.v4.media.a(14);

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f6892x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f6893y;

    public c(ArrayList arrayList, ArrayList arrayList2) {
        this.f6892x = arrayList;
        this.f6893y = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeStringList(this.f6892x);
        parcel.writeTypedList(this.f6893y);
    }

    public c(Parcel parcel) {
        this.f6892x = parcel.createStringArrayList();
        this.f6893y = parcel.createTypedArrayList(b.CREATOR);
    }
}
