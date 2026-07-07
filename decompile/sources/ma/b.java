package ma;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends z0.b {
    public static final Parcelable.Creator<b> CREATOR = new aa.c(2);

    /* renamed from: z, reason: collision with root package name */
    public boolean f8728z;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f8728z = parcel.readInt() == 1;
    }

    @Override // z0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        parcel.writeInt(this.f8728z ? 1 : 0);
    }
}
