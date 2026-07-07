package f0;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends z0.b {
    public static final Parcelable.Creator<g> CREATOR = new aa.c(1);

    /* renamed from: z, reason: collision with root package name */
    public SparseArray f4627z;

    public g(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f4627z = new SparseArray(readInt);
        for (int i6 = 0; i6 < readInt; i6++) {
            this.f4627z.append(iArr[i6], readParcelableArray[i6]);
        }
    }

    @Override // z0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int i10;
        super.writeToParcel(parcel, i6);
        SparseArray sparseArray = this.f4627z;
        if (sparseArray != null) {
            i10 = sparseArray.size();
        } else {
            i10 = 0;
        }
        parcel.writeInt(i10);
        int[] iArr = new int[i10];
        Parcelable[] parcelableArr = new Parcelable[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = this.f4627z.keyAt(i11);
            parcelableArr[i11] = (Parcelable) this.f4627z.valueAt(i11);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i6);
    }
}
