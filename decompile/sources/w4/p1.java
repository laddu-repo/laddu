package w4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p1 implements Parcelable {
    public static final Parcelable.Creator<p1> CREATOR = new kd.g0(24);
    public int[] A;
    public int B;
    public int[] C;
    public ArrayList D;
    public boolean E;
    public boolean F;
    public boolean G;

    /* renamed from: x, reason: collision with root package name */
    public int f13982x;

    /* renamed from: y, reason: collision with root package name */
    public int f13983y;

    /* renamed from: z, reason: collision with root package name */
    public int f13984z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f13982x);
        parcel.writeInt(this.f13983y);
        parcel.writeInt(this.f13984z);
        if (this.f13984z > 0) {
            parcel.writeIntArray(this.A);
        }
        parcel.writeInt(this.B);
        if (this.B > 0) {
            parcel.writeIntArray(this.C);
        }
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeInt(this.F ? 1 : 0);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeList(this.D);
    }
}
