package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new android.support.v4.media.a(4);
    public final String A;
    public final int B;
    public final int C;
    public final CharSequence D;
    public final int E;
    public final CharSequence F;
    public final ArrayList G;
    public final ArrayList H;
    public final boolean I;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int[] f975v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f976w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f977x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f978y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f979z;

    public b(a aVar) {
        int size = aVar.f955a.size();
        this.f975v = new int[size * 6];
        if (!aVar.f960g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f976w = new ArrayList(size);
        this.f977x = new int[size];
        this.f978y = new int[size];
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            y0 y0Var = (y0) aVar.f955a.get(i10);
            int i11 = i + 1;
            this.f975v[i] = y0Var.f1156a;
            ArrayList arrayList = this.f976w;
            y yVar = y0Var.f1157b;
            arrayList.add(yVar != null ? yVar.A : null);
            int[] iArr = this.f975v;
            iArr[i11] = y0Var.f1158c ? 1 : 0;
            iArr[i + 2] = y0Var.f1159d;
            iArr[i + 3] = y0Var.f1160e;
            int i12 = i + 5;
            iArr[i + 4] = y0Var.f;
            i += 6;
            iArr[i12] = y0Var.f1161g;
            this.f977x[i10] = y0Var.f1162h.ordinal();
            this.f978y[i10] = y0Var.i.ordinal();
        }
        this.f979z = aVar.f;
        this.A = aVar.f961h;
        this.B = aVar.f970r;
        this.C = aVar.i;
        this.D = aVar.f962j;
        this.E = aVar.f963k;
        this.F = aVar.f964l;
        this.G = aVar.f965m;
        this.H = aVar.f966n;
        this.I = aVar.f967o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f975v);
        parcel.writeStringList(this.f976w);
        parcel.writeIntArray(this.f977x);
        parcel.writeIntArray(this.f978y);
        parcel.writeInt(this.f979z);
        parcel.writeString(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        TextUtils.writeToParcel(this.D, parcel, 0);
        parcel.writeInt(this.E);
        TextUtils.writeToParcel(this.F, parcel, 0);
        parcel.writeStringList(this.G);
        parcel.writeStringList(this.H);
        parcel.writeInt(this.I ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f975v = parcel.createIntArray();
        this.f976w = parcel.createStringArrayList();
        this.f977x = parcel.createIntArray();
        this.f978y = parcel.createIntArray();
        this.f979z = parcel.readInt();
        this.A = parcel.readString();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.D = (CharSequence) creator.createFromParcel(parcel);
        this.E = parcel.readInt();
        this.F = (CharSequence) creator.createFromParcel(parcel);
        this.G = parcel.createStringArrayList();
        this.H = parcel.createStringArrayList();
        this.I = parcel.readInt() != 0;
    }
}
