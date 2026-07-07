package w8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends x8.a {
    public static final Parcelable.Creator<g> CREATOR = new kd.g0(29);
    public final int[] A;
    public final int B;
    public final int[] C;

    /* renamed from: x, reason: collision with root package name */
    public final m f14182x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f14183y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f14184z;

    public g(m mVar, boolean z10, boolean z11, int[] iArr, int i6, int[] iArr2) {
        this.f14182x = mVar;
        this.f14183y = z10;
        this.f14184z = z11;
        this.A = iArr;
        this.B = i6;
        this.C = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int A = a.a.A(parcel, 20293);
        a.a.v(parcel, 1, this.f14182x, i6);
        a.a.D(parcel, 2, 4);
        parcel.writeInt(this.f14183y ? 1 : 0);
        a.a.D(parcel, 3, 4);
        parcel.writeInt(this.f14184z ? 1 : 0);
        int[] iArr = this.A;
        if (iArr != null) {
            int A2 = a.a.A(parcel, 4);
            parcel.writeIntArray(iArr);
            a.a.C(parcel, A2);
        }
        a.a.D(parcel, 5, 4);
        parcel.writeInt(this.B);
        int[] iArr2 = this.C;
        if (iArr2 != null) {
            int A3 = a.a.A(parcel, 6);
            parcel.writeIntArray(iArr2);
            a.a.C(parcel, A3);
        }
        a.a.C(parcel, A);
    }
}
