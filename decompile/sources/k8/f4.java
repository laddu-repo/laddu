package k8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f4 extends u7.a {
    public static final Parcelable.Creator<f4> CREATOR = new android.support.v4.media.a(25);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f7540v;

    public f4(ArrayList arrayList) {
        this.f7540v = arrayList;
    }

    public static f4 a(b3... b3VarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(b3VarArr[0].f7407v));
        return new f4(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        List list = this.f7540v;
        if (list != null) {
            int iC02 = com.bumptech.glide.d.c0(parcel, 1);
            int size = list.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                parcel.writeInt(((Integer) list.get(i10)).intValue());
            }
            com.bumptech.glide.d.d0(parcel, iC02);
        }
        com.bumptech.glide.d.d0(parcel, iC0);
    }
}
