package w4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o1 implements Parcelable {
    public static final Parcelable.Creator<o1> CREATOR = new kd.g0(23);
    public boolean A;

    /* renamed from: x, reason: collision with root package name */
    public int f13976x;

    /* renamed from: y, reason: collision with root package name */
    public int f13977y;

    /* renamed from: z, reason: collision with root package name */
    public int[] f13978z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f13976x + ", mGapDir=" + this.f13977y + ", mHasUnwantedGapAfter=" + this.A + ", mGapPerSpan=" + Arrays.toString(this.f13978z) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f13976x);
        parcel.writeInt(this.f13977y);
        parcel.writeInt(this.A ? 1 : 0);
        int[] iArr = this.f13978z;
        if (iArr != null && iArr.length > 0) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f13978z);
        } else {
            parcel.writeInt(0);
        }
    }
}
