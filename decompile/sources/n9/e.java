package n9;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends x8.a {
    public static final Parcelable.Creator<e> CREATOR = new kd.g0(3);
    public long A;
    public boolean B;
    public String C;
    public final v D;
    public long E;
    public v F;
    public final long G;
    public final v H;

    /* renamed from: x, reason: collision with root package name */
    public String f9223x;

    /* renamed from: y, reason: collision with root package name */
    public String f9224y;

    /* renamed from: z, reason: collision with root package name */
    public g4 f9225z;

    public e(String str, String str2, g4 g4Var, long j, boolean z10, String str3, v vVar, long j10, v vVar2, long j11, v vVar3) {
        this.f9223x = str;
        this.f9224y = str2;
        this.f9225z = g4Var;
        this.A = j;
        this.B = z10;
        this.C = str3;
        this.D = vVar;
        this.E = j10;
        this.F = vVar2;
        this.G = j11;
        this.H = vVar3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int A = a.a.A(parcel, 20293);
        a.a.w(parcel, 2, this.f9223x);
        a.a.w(parcel, 3, this.f9224y);
        a.a.v(parcel, 4, this.f9225z, i6);
        long j = this.A;
        a.a.D(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z10 = this.B;
        a.a.D(parcel, 6, 4);
        parcel.writeInt(z10 ? 1 : 0);
        a.a.w(parcel, 7, this.C);
        a.a.v(parcel, 8, this.D, i6);
        long j10 = this.E;
        a.a.D(parcel, 9, 8);
        parcel.writeLong(j10);
        a.a.v(parcel, 10, this.F, i6);
        a.a.D(parcel, 11, 8);
        parcel.writeLong(this.G);
        a.a.v(parcel, 12, this.H, i6);
        a.a.C(parcel, A);
    }

    public e(e eVar) {
        w8.x.g(eVar);
        this.f9223x = eVar.f9223x;
        this.f9224y = eVar.f9224y;
        this.f9225z = eVar.f9225z;
        this.A = eVar.A;
        this.B = eVar.B;
        this.C = eVar.C;
        this.D = eVar.D;
        this.E = eVar.E;
        this.F = eVar.F;
        this.G = eVar.G;
        this.H = eVar.H;
    }
}
