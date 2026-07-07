package m5;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import kd.g0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k extends View.BaseSavedState {
    public static final Parcelable.Creator<k> CREATOR = new g0(1);

    /* renamed from: x, reason: collision with root package name */
    public final boolean f8639x;

    public k(Parcelable parcelable, boolean z10) {
        super(parcelable);
        this.f8639x = z10;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        parcel.writeByte(this.f8639x ? (byte) 1 : (byte) 0);
    }

    public k(Parcel parcel) {
        super(parcel);
        this.f8639x = parcel.readByte() != 0;
    }
}
