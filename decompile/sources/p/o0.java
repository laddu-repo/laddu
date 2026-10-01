package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o0 extends View.BaseSavedState {
    public static final Parcelable.Creator<o0> CREATOR = new kd.g0(13);

    /* renamed from: x, reason: collision with root package name */
    public boolean f10335x;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        parcel.writeByte(this.f10335x ? (byte) 1 : (byte) 0);
    }
}
