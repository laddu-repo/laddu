package j1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new android.support.v4.media.a(13);
    public final int[] A;
    public final int B;
    public final String C;
    public final int D;
    public final int E;
    public final CharSequence F;
    public final int G;
    public final CharSequence H;
    public final ArrayList I;
    public final ArrayList J;
    public final boolean K;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f6885x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f6886y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f6887z;

    public b(a aVar) {
        int size = aVar.f6855a.size();
        this.f6885x = new int[size * 6];
        if (aVar.f6861g) {
            this.f6886y = new ArrayList(size);
            this.f6887z = new int[size];
            this.A = new int[size];
            int i6 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                w0 w0Var = (w0) aVar.f6855a.get(i10);
                int i11 = i6 + 1;
                this.f6885x[i6] = w0Var.f7005a;
                ArrayList arrayList = this.f6886y;
                y yVar = w0Var.f7006b;
                arrayList.add(yVar != null ? yVar.C : null);
                int[] iArr = this.f6885x;
                iArr[i11] = w0Var.f7007c ? 1 : 0;
                iArr[i6 + 2] = w0Var.f7008d;
                iArr[i6 + 3] = w0Var.f7009e;
                int i12 = i6 + 5;
                iArr[i6 + 4] = w0Var.f7010f;
                i6 += 6;
                iArr[i12] = w0Var.f7011g;
                this.f6887z[i10] = w0Var.f7012h.ordinal();
                this.A[i10] = w0Var.f7013i.ordinal();
            }
            this.B = aVar.f6860f;
            this.C = aVar.f6863i;
            this.D = aVar.f6872t;
            this.E = aVar.j;
            this.F = aVar.f6864k;
            this.G = aVar.f6865l;
            this.H = aVar.f6866m;
            this.I = aVar.f6867n;
            this.J = aVar.f6868o;
            this.K = aVar.f6869p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, j1.w0] */
    public final void a(a aVar) {
        int i6 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f6885x;
            boolean z10 = true;
            if (i6 < iArr.length) {
                ?? obj = new Object();
                int i11 = i6 + 1;
                obj.f7005a = iArr[i6];
                if (p0.L(2)) {
                    Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i10 + " base fragment #" + iArr[i11]);
                }
                obj.f7012h = androidx.lifecycle.x.values()[this.f6887z[i10]];
                obj.f7013i = androidx.lifecycle.x.values()[this.A[i10]];
                int i12 = i6 + 2;
                if (iArr[i11] == 0) {
                    z10 = false;
                }
                obj.f7007c = z10;
                int i13 = iArr[i12];
                obj.f7008d = i13;
                int i14 = iArr[i6 + 3];
                obj.f7009e = i14;
                int i15 = i6 + 5;
                int i16 = iArr[i6 + 4];
                obj.f7010f = i16;
                i6 += 6;
                int i17 = iArr[i15];
                obj.f7011g = i17;
                aVar.f6856b = i13;
                aVar.f6857c = i14;
                aVar.f6858d = i16;
                aVar.f6859e = i17;
                aVar.b(obj);
                i10++;
            } else {
                aVar.f6860f = this.B;
                aVar.f6863i = this.C;
                aVar.f6861g = true;
                aVar.j = this.E;
                aVar.f6864k = this.F;
                aVar.f6865l = this.G;
                aVar.f6866m = this.H;
                aVar.f6867n = this.I;
                aVar.f6868o = this.J;
                aVar.f6869p = this.K;
                return;
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeIntArray(this.f6885x);
        parcel.writeStringList(this.f6886y);
        parcel.writeIntArray(this.f6887z);
        parcel.writeIntArray(this.A);
        parcel.writeInt(this.B);
        parcel.writeString(this.C);
        parcel.writeInt(this.D);
        parcel.writeInt(this.E);
        TextUtils.writeToParcel(this.F, parcel, 0);
        parcel.writeInt(this.G);
        TextUtils.writeToParcel(this.H, parcel, 0);
        parcel.writeStringList(this.I);
        parcel.writeStringList(this.J);
        parcel.writeInt(this.K ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f6885x = parcel.createIntArray();
        this.f6886y = parcel.createStringArrayList();
        this.f6887z = parcel.createIntArray();
        this.A = parcel.createIntArray();
        this.B = parcel.readInt();
        this.C = parcel.readString();
        this.D = parcel.readInt();
        this.E = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.F = (CharSequence) creator.createFromParcel(parcel);
        this.G = parcel.readInt();
        this.H = (CharSequence) creator.createFromParcel(parcel);
        this.I = parcel.createStringArrayList();
        this.J = parcel.createStringArrayList();
        this.K = parcel.readInt() != 0;
    }
}
