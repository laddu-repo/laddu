package xa;

import aa.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import v.l;
import z0.b;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new c(8);

    /* renamed from: z, reason: collision with root package name */
    public final l f14700z;

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f14700z = new l(0);
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f14700z + "}";
    }

    @Override // z0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        l lVar = this.f14700z;
        int i10 = lVar.f13174z;
        parcel.writeInt(i10);
        String[] strArr = new String[i10];
        Bundle[] bundleArr = new Bundle[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = (String) lVar.f(i11);
            bundleArr[i11] = (Bundle) lVar.i(i11);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f14700z = new l(readInt);
        for (int i6 = 0; i6 < readInt; i6++) {
            this.f14700z.put(strArr[i6], bundleArr[i6]);
        }
    }
}
