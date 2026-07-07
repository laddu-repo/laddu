package p;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k3 extends z0.b {
    public static final Parcelable.Creator<k3> CREATOR = new aa.c(4);
    public boolean A;

    /* renamed from: z, reason: collision with root package name */
    public int f10281z;

    public k3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z10;
        this.f10281z = parcel.readInt();
        if (parcel.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.A = z10;
    }

    @Override // z0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        parcel.writeInt(this.f10281z);
        parcel.writeInt(this.A ? 1 : 0);
    }
}
