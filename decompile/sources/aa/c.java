package aa;

import android.os.Parcel;
import android.os.Parcelable;
import p.k3;
import p.x2;
import w4.b1;
import za.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f644a;

    public /* synthetic */ c(int i6) {
        this.f644a = i6;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f644a) {
            case 0:
                return new d(parcel, classLoader);
            case 1:
                return new f0.g(parcel, classLoader);
            case 2:
                return new ma.b(parcel, classLoader);
            case 3:
                return new x2(parcel, classLoader);
            case 4:
                return new k3(parcel, classLoader);
            case 5:
                return new s5.f(parcel, classLoader);
            case 6:
                return new va.c(parcel, classLoader);
            case 7:
                return new b1(parcel, classLoader);
            case 8:
                return new xa.a(parcel, classLoader);
            case 9:
                if (parcel.readParcelable(classLoader) == null) {
                    return z0.b.f15112y;
                }
                throw new IllegalStateException("superState must be null");
            case 10:
                return new z9.a(parcel, classLoader);
            default:
                return new x(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i6) {
        switch (this.f644a) {
            case 0:
                return new d[i6];
            case 1:
                return new f0.g[i6];
            case 2:
                return new ma.b[i6];
            case 3:
                return new x2[i6];
            case 4:
                return new k3[i6];
            case 5:
                return new s5.f[i6];
            case 6:
                return new va.c[i6];
            case 7:
                return new b1[i6];
            case 8:
                return new xa.a[i6];
            case 9:
                return new z0.b[i6];
            case 10:
                return new z9.a[i6];
            default:
                return new x[i6];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f644a) {
            case 0:
                return new d(parcel, null);
            case 1:
                return new f0.g(parcel, null);
            case 2:
                return new ma.b(parcel, null);
            case 3:
                return new x2(parcel, null);
            case 4:
                return new k3(parcel, null);
            case 5:
                return new s5.f(parcel, null);
            case 6:
                return new va.c(parcel, null);
            case 7:
                return new b1(parcel, null);
            case 8:
                return new xa.a(parcel, null);
            case 9:
                if (parcel.readParcelable(null) == null) {
                    return z0.b.f15112y;
                }
                throw new IllegalStateException("superState must be null");
            case 10:
                return new z9.a(parcel, null);
            default:
                return new x(parcel, null);
        }
    }
}
