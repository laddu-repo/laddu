package za;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x extends z0.b {
    public static final Parcelable.Creator<x> CREATOR = new aa.c(11);
    public boolean A;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f15315z;

    public x(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f15315z = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f15315z) + "}";
    }

    @Override // z0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        TextUtils.writeToParcel(this.f15315z, parcel, i6);
        parcel.writeInt(this.A ? 1 : 0);
    }
}
