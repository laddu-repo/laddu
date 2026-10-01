package q7;

import android.os.Parcel;
import android.os.Parcelable;
import va.t1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r extends u7.a {
    public static final Parcelable.Creator<r> CREATOR = new m8.c(10);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f10934v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f10935w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f10936x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f10937y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f10938z;

    public r(int i, int i10, long j8, String str, boolean z2) {
        this.f10934v = z2;
        this.f10935w = str;
        this.f10936x = z7.b.P(i) - 1;
        this.f10937y = t1.t(i10) - 1;
        this.f10938z = j8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        com.bumptech.glide.d.b0(parcel, 1, 4);
        parcel.writeInt(this.f10934v ? 1 : 0);
        com.bumptech.glide.d.Y(parcel, 2, this.f10935w);
        com.bumptech.glide.d.b0(parcel, 3, 4);
        parcel.writeInt(this.f10936x);
        com.bumptech.glide.d.b0(parcel, 4, 4);
        parcel.writeInt(this.f10937y);
        com.bumptech.glide.d.b0(parcel, 5, 8);
        parcel.writeLong(this.f10938z);
        com.bumptech.glide.d.d0(parcel, iC0);
    }
}
