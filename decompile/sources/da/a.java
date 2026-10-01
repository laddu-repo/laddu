package da;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends View.BaseSavedState {
    public static final Parcelable.Creator<a> CREATOR = new android.support.v4.media.a(9);

    /* renamed from: x, reason: collision with root package name */
    public int f3977x;

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("MaterialCheckBox.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" CheckedState=");
        int i6 = this.f3977x;
        if (i6 != 1) {
            if (i6 != 2) {
                str = "unchecked";
            } else {
                str = "indeterminate";
            }
        } else {
            str = "checked";
        }
        return r4.a.o(sb2, str, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        parcel.writeValue(Integer.valueOf(this.f3977x));
    }
}
