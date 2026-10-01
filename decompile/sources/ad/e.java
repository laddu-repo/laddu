package ad;

import android.os.Parcel;
import android.os.Parcelable;
import de.i;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import pd.s;
import zc.h;
import zc.l;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable, Serializable {
    public static final d CREATOR = new d();
    public long C;
    public String I;
    public long K;
    public jd.g M;
    public int N;
    public int O;
    public long P;
    public long Q;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f483v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f487z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f484w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f485x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f486y = "";
    public h A = id.a.f6604c;
    public Map B = new LinkedHashMap();
    public long D = -1;
    public l E = id.a.f6606e;
    public zc.b F = id.a.f6605d;
    public zc.g G = id.a.f6602a;
    public long H = Calendar.getInstance().getTimeInMillis();
    public zc.a J = zc.a.f14871x;
    public boolean L = true;

    public e() {
        jd.g.CREATOR.getClass();
        this.M = jd.g.f7083w;
        this.P = -1L;
        this.Q = -1L;
    }

    public final long a() {
        return this.C;
    }

    public final long b() {
        return this.D;
    }

    public final void c(long j8) {
        this.C = j8;
    }

    public final void d(long j8) {
        this.Q = j8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(zc.b bVar) {
        i.e(bVar, "<set-?>");
        this.F = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        i.c(obj, "null cannot be cast to non-null type com.tonyodev.fetch2.database.DownloadInfo");
        e eVar = (e) obj;
        return this.f483v == eVar.f483v && i.a(this.f484w, eVar.f484w) && i.a(this.f485x, eVar.f485x) && i.a(this.f486y, eVar.f486y) && this.f487z == eVar.f487z && this.A == eVar.A && i.a(this.B, eVar.B) && this.C == eVar.C && this.D == eVar.D && this.E == eVar.E && this.F == eVar.F && this.G == eVar.G && this.H == eVar.H && i.a(this.I, eVar.I) && this.J == eVar.J && this.K == eVar.K && this.L == eVar.L && i.a(this.M, eVar.M) && this.P == eVar.P && this.Q == eVar.Q && this.N == eVar.N && this.O == eVar.O;
    }

    public final void f(long j8) {
        this.P = j8;
    }

    public final void g(String str) {
        i.e(str, "<set-?>");
        this.f486y = str;
    }

    public final void h(String str) {
        i.e(str, "<set-?>");
        this.f484w = str;
    }

    public final int hashCode() {
        int iHashCode = (this.B.hashCode() + ((this.A.hashCode() + ((d0.d.e(d0.d.e(d0.d.e(this.f483v * 31, 31, this.f484w), 31, this.f485x), 31, this.f486y) + this.f487z) * 31)) * 31)) * 31;
        long j8 = this.C;
        int i = (iHashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.D;
        int iHashCode2 = (this.G.hashCode() + ((this.F.hashCode() + ((this.E.hashCode() + ((i + ((int) (j9 ^ (j9 >>> 32)))) * 31)) * 31)) * 31)) * 31;
        long j10 = this.H;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str = this.I;
        int iHashCode3 = (this.J.hashCode() + ((i10 + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        long j11 = this.K;
        int iHashCode4 = (this.M.hashCode() + ((((iHashCode3 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.L ? 1231 : 1237)) * 31)) * 31;
        long j12 = this.P;
        int i11 = (iHashCode4 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.Q;
        return ((((i11 + ((int) ((j13 >>> 32) ^ j13))) * 31) + this.N) * 31) + this.O;
    }

    public final void i(long j8) {
        this.D = j8;
    }

    public final void j(String str) {
        i.e(str, "<set-?>");
        this.f485x = str;
    }

    public final String toString() {
        int i = this.f483v;
        String str = this.f484w;
        String str2 = this.f485x;
        String str3 = this.f486y;
        int i10 = this.f487z;
        h hVar = this.A;
        Map map = this.B;
        long j8 = this.C;
        long j9 = this.D;
        l lVar = this.E;
        zc.b bVar = this.F;
        zc.g gVar = this.G;
        long j10 = this.H;
        String str4 = this.I;
        zc.a aVar = this.J;
        long j11 = this.K;
        boolean z2 = this.L;
        jd.g gVar2 = this.M;
        int i11 = this.N;
        int i12 = this.O;
        long j12 = this.P;
        long j13 = this.Q;
        StringBuilder sb2 = new StringBuilder("DownloadInfo(id=");
        sb2.append(i);
        sb2.append(", namespace='");
        sb2.append(str);
        sb2.append("', url='");
        j4.a.s(sb2, str2, "', file='", str3, "', group=");
        sb2.append(i10);
        sb2.append(", priority=");
        sb2.append(hVar);
        sb2.append(", headers=");
        sb2.append(map);
        sb2.append(", downloaded=");
        sb2.append(j8);
        sb2.append(", total=");
        sb2.append(j9);
        sb2.append(", status=");
        sb2.append(lVar);
        sb2.append(", error=");
        sb2.append(bVar);
        sb2.append(", networkType=");
        sb2.append(gVar);
        sb2.append(", created=");
        sb2.append(j10);
        sb2.append(", tag=");
        sb2.append(str4);
        sb2.append(", enqueueAction=");
        sb2.append(aVar);
        sb2.append(", identifier=");
        sb2.append(j11);
        sb2.append(", downloadOnEnqueue=");
        sb2.append(z2);
        sb2.append(", extras=");
        sb2.append(gVar2);
        sb2.append(", autoRetryMaxAttempts=");
        sb2.append(i11);
        sb2.append(", autoRetryAttempts=");
        sb2.append(i12);
        sb2.append(", etaInMilliSeconds=");
        sb2.append(j12);
        sb2.append(", downloadedBytesPerSecond=");
        sb2.append(j13);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "dest");
        parcel.writeInt(this.f483v);
        parcel.writeString(this.f484w);
        parcel.writeString(this.f485x);
        parcel.writeString(this.f486y);
        parcel.writeInt(this.f487z);
        parcel.writeInt(this.A.f14904v);
        parcel.writeSerializable(new HashMap(this.B));
        parcel.writeLong(this.C);
        parcel.writeLong(this.D);
        parcel.writeInt(this.E.f14917v);
        parcel.writeInt(this.F.f14882v);
        parcel.writeInt(this.G.f14899v);
        parcel.writeLong(this.H);
        parcel.writeString(this.I);
        parcel.writeInt(this.J.f14874v);
        parcel.writeLong(this.K);
        parcel.writeInt(this.L ? 1 : 0);
        parcel.writeLong(this.P);
        parcel.writeLong(this.Q);
        parcel.writeSerializable(new HashMap(s.T(this.M.f7084v)));
        parcel.writeInt(this.N);
        parcel.writeInt(this.O);
    }
}
