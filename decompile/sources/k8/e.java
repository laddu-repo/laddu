package k8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e extends u7.a {
    public static final Parcelable.Creator<e> CREATOR = new android.support.v4.media.a(19);
    public String A;
    public final v B;
    public long C;
    public v D;
    public final long E;
    public final v F;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f7448v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f7449w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public q4 f7450x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f7451y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f7452z;

    public e(String str, String str2, q4 q4Var, long j8, boolean z2, String str3, v vVar, long j9, v vVar2, long j10, v vVar3) {
        this.f7448v = str;
        this.f7449w = str2;
        this.f7450x = q4Var;
        this.f7451y = j8;
        this.f7452z = z2;
        this.A = str3;
        this.B = vVar;
        this.C = j9;
        this.D = vVar2;
        this.E = j10;
        this.F = vVar3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        com.bumptech.glide.d.Y(parcel, 2, this.f7448v);
        com.bumptech.glide.d.Y(parcel, 3, this.f7449w);
        com.bumptech.glide.d.X(parcel, 4, this.f7450x, i);
        long j8 = this.f7451y;
        com.bumptech.glide.d.b0(parcel, 5, 8);
        parcel.writeLong(j8);
        boolean z2 = this.f7452z;
        com.bumptech.glide.d.b0(parcel, 6, 4);
        parcel.writeInt(z2 ? 1 : 0);
        com.bumptech.glide.d.Y(parcel, 7, this.A);
        com.bumptech.glide.d.X(parcel, 8, this.B, i);
        long j9 = this.C;
        com.bumptech.glide.d.b0(parcel, 9, 8);
        parcel.writeLong(j9);
        com.bumptech.glide.d.X(parcel, 10, this.D, i);
        com.bumptech.glide.d.b0(parcel, 11, 8);
        parcel.writeLong(this.E);
        com.bumptech.glide.d.X(parcel, 12, this.F, i);
        com.bumptech.glide.d.d0(parcel, iC0);
    }

    public e(e eVar) {
        t7.y.g(eVar);
        this.f7448v = eVar.f7448v;
        this.f7449w = eVar.f7449w;
        this.f7450x = eVar.f7450x;
        this.f7451y = eVar.f7451y;
        this.f7452z = eVar.f7452z;
        this.A = eVar.A;
        this.B = eVar.B;
        this.C = eVar.C;
        this.D = eVar.D;
        this.E = eVar.E;
        this.F = eVar.F;
    }
}
