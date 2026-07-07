package zc;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Map;
import pd.s;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        de.i.e(parcel, "input");
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        String string2 = parcel.readString();
        String str = string2 != null ? string2 : "";
        long j8 = parcel.readLong();
        int i = parcel.readInt();
        Serializable serializable = parcel.readSerializable();
        de.i.c(serializable, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        Map map = (Map) serializable;
        int i10 = parcel.readInt();
        h.f14900w.getClass();
        h hVarC = w.b.c(i10);
        int i11 = parcel.readInt();
        g.f14895w.getClass();
        g gVarA = w2.f.a(i11);
        String string3 = parcel.readString();
        int i12 = parcel.readInt();
        a.f14870w.getClass();
        a aVarB = w.b.b(i12);
        boolean z2 = parcel.readInt() == 1;
        Serializable serializable2 = parcel.readSerializable();
        de.i.c(serializable2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        Map map2 = (Map) serializable2;
        int i13 = parcel.readInt();
        k kVar = new k(string, str);
        kVar.f14908v = j8;
        kVar.f14909w = i;
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            de.i.e(str2, "key");
            de.i.e(str3, "value");
            kVar.f14910x.put(str2, str3);
        }
        kVar.f14911y = hVarC;
        kVar.f14912z = gVarA;
        kVar.A = string3;
        kVar.B = aVarB;
        kVar.C = z2;
        kVar.E = new jd.g(s.T(map2));
        if (i13 < 0) {
            throw new IllegalArgumentException("The maximum number of attempts has to be greater than -1");
        }
        kVar.D = i13;
        return kVar;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new k[i];
    }
}
