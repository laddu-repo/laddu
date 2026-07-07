package b8;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.j6;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l extends j6 {
    public final a8.a K(a8.b bVar, String str, int i) {
        Parcel parcelF = f();
        f8.h.b(parcelF, bVar);
        parcelF.writeString(str);
        parcelF.writeInt(i);
        Parcel parcelC = c(parcelF, 2);
        a8.a aVarJ = a8.b.J(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarJ;
    }

    public final a8.a L(a8.b bVar, String str, int i) {
        Parcel parcelF = f();
        f8.h.b(parcelF, bVar);
        parcelF.writeString(str);
        parcelF.writeInt(i);
        Parcel parcelC = c(parcelF, 4);
        a8.a aVarJ = a8.b.J(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarJ;
    }

    public final a8.a M(a8.b bVar, String str, boolean z2, long j8) {
        Parcel parcelF = f();
        f8.h.b(parcelF, bVar);
        parcelF.writeString(str);
        parcelF.writeInt(z2 ? 1 : 0);
        parcelF.writeLong(j8);
        Parcel parcelC = c(parcelF, 7);
        a8.a aVarJ = a8.b.J(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarJ;
    }

    public final a8.a N(a8.b bVar, String str, int i, a8.b bVar2) {
        Parcel parcelF = f();
        f8.h.b(parcelF, bVar);
        parcelF.writeString(str);
        parcelF.writeInt(i);
        f8.h.b(parcelF, bVar2);
        Parcel parcelC = c(parcelF, 8);
        a8.a aVarJ = a8.b.J(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarJ;
    }
}
