package k8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v extends u7.a {
    public static final Parcelable.Creator<v> CREATOR = new android.support.v4.media.a(22);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f7791v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final u f7792w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f7793x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f7794y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f7795z;

    public v(String str, u uVar, String str2, long j8, long j9) {
        this.f7791v = str;
        this.f7792w = uVar;
        this.f7793x = str2;
        this.f7794y = j8;
        this.f7795z = j9;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f7792w);
        String str = this.f7793x;
        int length = String.valueOf(str).length();
        String str2 = this.f7791v;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        j4.a.s(sb2, "origin=", str, ",name=", str2);
        return j4.a.n(sb2, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        android.support.v4.media.a.a(this, parcel, i);
    }

    public v(v vVar, long j8, long j9) {
        t7.y.g(vVar);
        this.f7791v = vVar.f7791v;
        this.f7792w = vVar.f7792w;
        this.f7793x = vVar.f7793x;
        this.f7794y = j8;
        this.f7795z = j9;
    }
}
