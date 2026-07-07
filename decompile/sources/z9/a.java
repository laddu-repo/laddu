package z9;

import aa.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import z0.b;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new c(10);
    public final int A;
    public final boolean B;
    public final boolean C;
    public final boolean D;

    /* renamed from: z, reason: collision with root package name */
    public final int f15231z;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f15231z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readInt() == 1;
        this.C = parcel.readInt() == 1;
        this.D = parcel.readInt() == 1;
    }

    @Override // z0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        parcel.writeInt(this.f15231z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeInt(this.D ? 1 : 0);
    }

    public a(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f15231z = bottomSheetBehavior.N;
        this.A = bottomSheetBehavior.f2615e;
        this.B = bottomSheetBehavior.f2609b;
        this.C = bottomSheetBehavior.I;
        this.D = bottomSheetBehavior.J;
    }
}
