package r1;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x0 implements Comparable, Parcelable {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final Parcelable.Creator<x0> CREATOR = new k(2);

    /* renamed from: x, reason: collision with root package name */
    public final int f11741x;

    /* renamed from: y, reason: collision with root package name */
    public final int f11742y;

    /* renamed from: z, reason: collision with root package name */
    public final int f11743z;

    static {
        String str = u1.a0.f12750a;
        A = Integer.toString(0, 36);
        B = Integer.toString(1, 36);
        C = Integer.toString(2, 36);
    }

    public x0(int i6, int i10, int i11) {
        this.f11741x = i6;
        this.f11742y = i10;
        this.f11743z = i11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        x0 x0Var = (x0) obj;
        int i6 = this.f11741x - x0Var.f11741x;
        if (i6 == 0) {
            int i10 = this.f11742y - x0Var.f11742y;
            if (i10 == 0) {
                return this.f11743z - x0Var.f11743z;
            }
            return i10;
        }
        return i6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x0.class == obj.getClass()) {
            x0 x0Var = (x0) obj;
            if (this.f11741x == x0Var.f11741x && this.f11742y == x0Var.f11742y && this.f11743z == x0Var.f11743z) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f11741x * 31) + this.f11742y) * 31) + this.f11743z;
    }

    public final String toString() {
        return this.f11741x + "." + this.f11742y + "." + this.f11743z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f11741x);
        parcel.writeInt(this.f11742y);
        parcel.writeInt(this.f11743z);
    }

    public x0(Parcel parcel) {
        this.f11741x = parcel.readInt();
        this.f11742y = parcel.readInt();
        this.f11743z = parcel.readInt();
    }
}
