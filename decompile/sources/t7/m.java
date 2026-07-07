package t7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m extends u7.a {
    public static final Parcelable.Creator<m> CREATOR = new m8.c(15);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f12384v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f12385w;

    public m(int i, List list) {
        this.f12384v = i;
        this.f12385w = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        com.bumptech.glide.d.b0(parcel, 1, 4);
        parcel.writeInt(this.f12384v);
        com.bumptech.glide.d.a0(parcel, 2, this.f12385w);
        com.bumptech.glide.d.d0(parcel, iC0);
    }
}
