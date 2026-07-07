package j1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q0 implements Parcelable {
    public static final Parcelable.Creator<q0> CREATOR = new android.support.v4.media.a(16);
    public int A;
    public String B;
    public ArrayList C;
    public ArrayList D;
    public ArrayList E;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f6967x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f6968y;

    /* renamed from: z, reason: collision with root package name */
    public b[] f6969z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeStringList(this.f6967x);
        parcel.writeStringList(this.f6968y);
        parcel.writeTypedArray(this.f6969z, i6);
        parcel.writeInt(this.A);
        parcel.writeString(this.B);
        parcel.writeStringList(this.C);
        parcel.writeTypedList(this.D);
        parcel.writeTypedList(this.E);
    }
}
