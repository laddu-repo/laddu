package w4;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b1 extends z0.b {
    public static final Parcelable.Creator<b1> CREATOR = new aa.c(7);

    /* renamed from: z, reason: collision with root package name */
    public Parcelable f13821z;

    public b1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f13821z = parcel.readParcelable(classLoader == null ? s0.class.getClassLoader() : classLoader);
    }

    @Override // z0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        parcel.writeParcelable(this.f13821z, 0);
    }
}
