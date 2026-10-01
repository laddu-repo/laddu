package s8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12234a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f12234a) {
            case 0:
                int z10 = s1.c.z(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        s1.c.y(parcel, readInt);
                    } else {
                        intent = (Intent) s1.c.g(parcel, readInt, Intent.CREATOR);
                    }
                }
                s1.c.k(parcel, z10);
                return new a(intent);
            default:
                return new g(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        switch (this.f12234a) {
            case 0:
                return new a[i6];
            default:
                return new g[i6];
        }
    }
}
