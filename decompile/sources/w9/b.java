package w9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w8.f0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new f0(1);
    public Integer A;
    public Integer B;
    public Integer C;
    public Integer D;
    public Integer E;
    public String G;
    public Locale K;
    public CharSequence L;
    public CharSequence M;
    public int N;
    public int O;
    public Integer P;
    public Integer R;
    public Integer S;
    public Integer T;
    public Integer U;
    public Integer V;
    public Integer W;
    public Integer X;
    public Integer Y;
    public Integer Z;

    /* renamed from: a0, reason: collision with root package name */
    public Boolean f14239a0;

    /* renamed from: b0, reason: collision with root package name */
    public Integer f14240b0;

    /* renamed from: x, reason: collision with root package name */
    public int f14241x;

    /* renamed from: y, reason: collision with root package name */
    public Integer f14242y;

    /* renamed from: z, reason: collision with root package name */
    public Integer f14243z;
    public int F = 255;
    public int H = -2;
    public int I = -2;
    public int J = -2;
    public Boolean Q = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        String str;
        parcel.writeInt(this.f14241x);
        parcel.writeSerializable(this.f14242y);
        parcel.writeSerializable(this.f14243z);
        parcel.writeSerializable(this.A);
        parcel.writeSerializable(this.B);
        parcel.writeSerializable(this.C);
        parcel.writeSerializable(this.D);
        parcel.writeSerializable(this.E);
        parcel.writeInt(this.F);
        parcel.writeString(this.G);
        parcel.writeInt(this.H);
        parcel.writeInt(this.I);
        parcel.writeInt(this.J);
        CharSequence charSequence = this.L;
        String str2 = null;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        parcel.writeString(str);
        CharSequence charSequence2 = this.M;
        if (charSequence2 != null) {
            str2 = charSequence2.toString();
        }
        parcel.writeString(str2);
        parcel.writeInt(this.N);
        parcel.writeSerializable(this.P);
        parcel.writeSerializable(this.R);
        parcel.writeSerializable(this.S);
        parcel.writeSerializable(this.T);
        parcel.writeSerializable(this.U);
        parcel.writeSerializable(this.V);
        parcel.writeSerializable(this.W);
        parcel.writeSerializable(this.Z);
        parcel.writeSerializable(this.X);
        parcel.writeSerializable(this.Y);
        parcel.writeSerializable(this.Q);
        parcel.writeSerializable(this.K);
        parcel.writeSerializable(this.f14239a0);
        parcel.writeSerializable(this.f14240b0);
    }
}
