package t7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends u7.a {
    public static final Parcelable.Creator<g0> CREATOR = new m8.c(21);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Bundle f12349v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public q7.d[] f12350w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12351x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f f12352y;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        com.bumptech.glide.d.S(parcel, 1, this.f12349v);
        com.bumptech.glide.d.Z(parcel, 2, this.f12350w, i);
        int i10 = this.f12351x;
        com.bumptech.glide.d.b0(parcel, 3, 4);
        parcel.writeInt(i10);
        com.bumptech.glide.d.X(parcel, 4, this.f12352y, i);
        com.bumptech.glide.d.d0(parcel, iC0);
    }
}
