package zc;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import pd.s;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable, Serializable {
    public static final j CREATOR = new j();
    public String A;
    public a B;
    public boolean C;
    public int D;
    public jd.g E;
    public final String F;
    public final String G;
    public final int H;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f14908v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14909w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LinkedHashMap f14910x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public h f14911y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public g f14912z;

    public k(String str, String str2) {
        de.i.e(str, "url");
        de.i.e(str2, "file");
        this.f14910x = new LinkedHashMap();
        this.f14911y = id.a.f6604c;
        this.f14912z = id.a.f6602a;
        this.B = id.a.f6607g;
        this.C = true;
        jd.g.CREATOR.getClass();
        this.E = jd.g.f7083w;
        this.F = str;
        this.G = str2;
        this.H = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        de.i.c(obj, "null cannot be cast to non-null type com.tonyodev.fetch2.RequestInfo");
        k kVar = (k) obj;
        return this.f14908v == kVar.f14908v && this.f14909w == kVar.f14909w && de.i.a(this.f14910x, kVar.f14910x) && this.f14911y == kVar.f14911y && this.f14912z == kVar.f14912z && de.i.a(this.A, kVar.A) && this.B == kVar.B && this.C == kVar.C && de.i.a(this.E, kVar.E) && this.D == kVar.D;
    }

    public final int b() {
        long j8 = this.f14908v;
        int iHashCode = (this.f14912z.hashCode() + ((this.f14911y.hashCode() + ((this.f14910x.hashCode() + (((((int) (j8 ^ (j8 >>> 32))) * 31) + this.f14909w) * 31)) * 31)) * 31)) * 31;
        String str = this.A;
        return ((this.E.f7084v.hashCode() + ((((this.B.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31) + (this.C ? 1231 : 1237)) * 31)) * 31) + this.D;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.class.equals(obj != null ? obj.getClass() : null) || !a(obj)) {
            return false;
        }
        de.i.c(obj, "null cannot be cast to non-null type com.tonyodev.fetch2.Request");
        k kVar = (k) obj;
        return this.H == kVar.H && de.i.a(this.F, kVar.F) && de.i.a(this.G, kVar.G);
    }

    public final int hashCode() {
        return this.G.hashCode() + d0.d.e(((b() * 31) + this.H) * 31, 31, this.F);
    }

    public final String toString() {
        return "Request(url='" + this.F + "', file='" + this.G + "', id=" + this.H + ", groupId=" + this.f14909w + ", headers=" + this.f14910x + ", priority=" + this.f14911y + ", networkType=" + this.f14912z + ", tag=" + this.A + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        de.i.e(parcel, "parcel");
        parcel.writeString(this.F);
        parcel.writeString(this.G);
        parcel.writeLong(this.f14908v);
        parcel.writeInt(this.f14909w);
        parcel.writeSerializable(new HashMap(this.f14910x));
        parcel.writeInt(this.f14911y.f14904v);
        parcel.writeInt(this.f14912z.f14899v);
        parcel.writeString(this.A);
        parcel.writeInt(this.B.f14874v);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeSerializable(new HashMap(s.T(this.E.f7084v)));
        parcel.writeInt(this.D);
    }
}
