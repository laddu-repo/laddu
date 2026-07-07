package j1;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t0 implements Parcelable {
    public static final Parcelable.Creator<t0> CREATOR = new android.support.v4.media.a(17);
    public final boolean A;
    public final int B;
    public final int C;
    public final String D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final int I;
    public final String J;
    public final int K;
    public final boolean L;

    /* renamed from: x, reason: collision with root package name */
    public final String f6980x;

    /* renamed from: y, reason: collision with root package name */
    public final String f6981y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f6982z;

    public t0(y yVar) {
        this.f6980x = yVar.getClass().getName();
        this.f6981y = yVar.C;
        this.f6982z = yVar.M;
        this.A = yVar.O;
        this.B = yVar.W;
        this.C = yVar.X;
        this.D = yVar.Y;
        this.E = yVar.f7019b0;
        this.F = yVar.J;
        this.G = yVar.f7018a0;
        this.H = yVar.Z;
        this.I = yVar.o0.ordinal();
        this.J = yVar.F;
        this.K = yVar.G;
        this.L = yVar.f7026i0;
    }

    public final y a(i0 i0Var) {
        y a10 = i0Var.a(this.f6980x);
        a10.C = this.f6981y;
        a10.M = this.f6982z;
        a10.O = this.A;
        a10.P = true;
        a10.W = this.B;
        a10.X = this.C;
        a10.Y = this.D;
        a10.f7019b0 = this.E;
        a10.J = this.F;
        a10.f7018a0 = this.G;
        a10.Z = this.H;
        a10.o0 = androidx.lifecycle.x.values()[this.I];
        a10.F = this.J;
        a10.G = this.K;
        a10.f7026i0 = this.L;
        return a10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f6980x);
        sb2.append(" (");
        sb2.append(this.f6981y);
        sb2.append(")}:");
        if (this.f6982z) {
            sb2.append(" fromLayout");
        }
        if (this.A) {
            sb2.append(" dynamicContainer");
        }
        int i6 = this.C;
        if (i6 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i6));
        }
        String str = this.D;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.E) {
            sb2.append(" retainInstance");
        }
        if (this.F) {
            sb2.append(" removing");
        }
        if (this.G) {
            sb2.append(" detached");
        }
        if (this.H) {
            sb2.append(" hidden");
        }
        String str2 = this.J;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.K);
        }
        if (this.L) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f6980x);
        parcel.writeString(this.f6981y);
        parcel.writeInt(this.f6982z ? 1 : 0);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeString(this.D);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeInt(this.F ? 1 : 0);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeInt(this.H ? 1 : 0);
        parcel.writeInt(this.I);
        parcel.writeString(this.J);
        parcel.writeInt(this.K);
        parcel.writeInt(this.L ? 1 : 0);
    }

    public t0(Parcel parcel) {
        this.f6980x = parcel.readString();
        this.f6981y = parcel.readString();
        this.f6982z = parcel.readInt() != 0;
        this.A = parcel.readInt() != 0;
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readString();
        this.E = parcel.readInt() != 0;
        this.F = parcel.readInt() != 0;
        this.G = parcel.readInt() != 0;
        this.H = parcel.readInt() != 0;
        this.I = parcel.readInt();
        this.J = parcel.readString();
        this.K = parcel.readInt();
        this.L = parcel.readInt() != 0;
    }
}
