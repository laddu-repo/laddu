package t1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements Comparable, Parcelable {
    public static final Parcelable.Creator<o0> CREATOR = new i(2);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f12074v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f12075w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f12076x;

    static {
        w1.b0.H(0);
        w1.b0.H(1);
        w1.b0.H(2);
    }

    public o0() {
        this.f12074v = -1;
        this.f12075w = -1;
        this.f12076x = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o0 o0Var = (o0) obj;
        int i = this.f12074v - o0Var.f12074v;
        if (i != 0) {
            return i;
        }
        int i10 = this.f12075w - o0Var.f12075w;
        return i10 == 0 ? this.f12076x - o0Var.f12076x : i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o0.class == obj.getClass()) {
            o0 o0Var = (o0) obj;
            if (this.f12074v == o0Var.f12074v && this.f12075w == o0Var.f12075w && this.f12076x == o0Var.f12076x) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f12074v * 31) + this.f12075w) * 31) + this.f12076x;
    }

    public final String toString() {
        return this.f12074v + "." + this.f12075w + "." + this.f12076x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12074v);
        parcel.writeInt(this.f12075w);
        parcel.writeInt(this.f12076x);
    }

    public o0(Parcel parcel) {
        this.f12074v = parcel.readInt();
        this.f12075w = parcel.readInt();
        this.f12076x = parcel.readInt();
    }
}
