package s5;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends z0.b {
    public static final Parcelable.Creator<f> CREATOR = new aa.c(5);
    public Parcelable A;

    /* renamed from: z, reason: collision with root package name */
    public int f12196z;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? f.class.getClassLoader() : classLoader;
        this.f12196z = parcel.readInt();
        this.A = parcel.readParcelable(classLoader);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" position=");
        return r4.a.l(sb2, this.f12196z, "}");
    }

    @Override // z0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        parcel.writeInt(this.f12196z);
        parcel.writeParcelable(this.A, i6);
    }
}
