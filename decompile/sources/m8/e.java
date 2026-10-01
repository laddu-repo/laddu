package m8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e extends u7.a {
    public static final Parcelable.Creator<e> CREATOR = new c(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f8516v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f8517w;

    public e(String str, ArrayList arrayList) {
        this.f8516v = arrayList;
        this.f8517w = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        List<String> list = this.f8516v;
        if (list != null) {
            int iC02 = com.bumptech.glide.d.c0(parcel, 1);
            parcel.writeStringList(list);
            com.bumptech.glide.d.d0(parcel, iC02);
        }
        com.bumptech.glide.d.Y(parcel, 2, this.f8517w);
        com.bumptech.glide.d.d0(parcel, iC0);
    }
}
