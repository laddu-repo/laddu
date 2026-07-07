package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements Parcelable {
    public static final Parcelable.Creator<v0> CREATOR = new android.support.v4.media.a(8);
    public final String A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final int F;
    public final String G;
    public final int H;
    public final boolean I;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f1112v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f1113w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f1114x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f1115y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f1116z;

    public v0(y yVar) {
        this.f1112v = yVar.getClass().getName();
        this.f1113w = yVar.A;
        this.f1114x = yVar.I;
        this.f1115y = yVar.R;
        this.f1116z = yVar.S;
        this.A = yVar.T;
        this.B = yVar.W;
        this.C = yVar.H;
        this.D = yVar.V;
        this.E = yVar.U;
        this.F = yVar.f1143j0.ordinal();
        this.G = yVar.D;
        this.H = yVar.E;
        this.I = yVar.f1137d0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f1112v);
        sb2.append(" (");
        sb2.append(this.f1113w);
        sb2.append(")}:");
        if (this.f1114x) {
            sb2.append(" fromLayout");
        }
        int i = this.f1116z;
        if (i != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i));
        }
        String str = this.A;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.B) {
            sb2.append(" retainInstance");
        }
        if (this.C) {
            sb2.append(" removing");
        }
        if (this.D) {
            sb2.append(" detached");
        }
        if (this.E) {
            sb2.append(" hidden");
        }
        String str2 = this.G;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.H);
        }
        if (this.I) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1112v);
        parcel.writeString(this.f1113w);
        parcel.writeInt(this.f1114x ? 1 : 0);
        parcel.writeInt(this.f1115y);
        parcel.writeInt(this.f1116z);
        parcel.writeString(this.A);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeInt(this.D ? 1 : 0);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeInt(this.F);
        parcel.writeString(this.G);
        parcel.writeInt(this.H);
        parcel.writeInt(this.I ? 1 : 0);
    }

    public v0(Parcel parcel) {
        this.f1112v = parcel.readString();
        this.f1113w = parcel.readString();
        this.f1114x = parcel.readInt() != 0;
        this.f1115y = parcel.readInt();
        this.f1116z = parcel.readInt();
        this.A = parcel.readString();
        this.B = parcel.readInt() != 0;
        this.C = parcel.readInt() != 0;
        this.D = parcel.readInt() != 0;
        this.E = parcel.readInt() != 0;
        this.F = parcel.readInt();
        this.G = parcel.readString();
        this.H = parcel.readInt();
        this.I = parcel.readInt() != 0;
    }
}
