package va;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends z0.b {
    public static final Parcelable.Creator<c> CREATOR = new aa.c(6);

    /* renamed from: z, reason: collision with root package name */
    public final int f13501z;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f13501z = parcel.readInt();
    }

    @Override // z0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        parcel.writeInt(this.f13501z);
    }

    public c(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f13501z = sideSheetBehavior.f2727h;
    }
}
