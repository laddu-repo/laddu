package b7;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends View.BaseSavedState {
    public static final Parcelable.Creator<g> CREATOR = new android.support.v4.media.a(4);
    public boolean A;
    public String B;
    public int C;
    public int D;

    /* renamed from: x, reason: collision with root package name */
    public String f1527x;

    /* renamed from: y, reason: collision with root package name */
    public int f1528y;

    /* renamed from: z, reason: collision with root package name */
    public float f1529z;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        parcel.writeString(this.f1527x);
        parcel.writeFloat(this.f1529z);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeString(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
    }
}
