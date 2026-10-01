package ad;

import android.os.Parcel;
import android.os.Parcelable;
import de.i;
import java.io.Serializable;
import java.util.Map;
import zc.h;
import zc.l;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        i.e(parcel, "source");
        int i = parcel.readInt();
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        String string2 = parcel.readString();
        if (string2 == null) {
            string2 = "";
        }
        String string3 = parcel.readString();
        String str = string3 != null ? string3 : "";
        int i10 = parcel.readInt();
        int i11 = parcel.readInt();
        h.f14900w.getClass();
        h hVarC = w.b.c(i11);
        Serializable serializable = parcel.readSerializable();
        i.c(serializable, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        Map map = (Map) serializable;
        long j8 = parcel.readLong();
        long j9 = parcel.readLong();
        int i12 = parcel.readInt();
        l.f14913w.getClass();
        l lVarB = w1.i.b(i12);
        int i13 = parcel.readInt();
        zc.b.f14878w.getClass();
        zc.b bVarA = w1.i.a(i13);
        int i14 = parcel.readInt();
        zc.g.f14895w.getClass();
        zc.g gVarA = w2.f.a(i14);
        long j10 = parcel.readLong();
        String string4 = parcel.readString();
        int i15 = parcel.readInt();
        zc.a.f14870w.getClass();
        zc.a aVarB = w.b.b(i15);
        long j11 = parcel.readLong();
        boolean z2 = parcel.readInt() == 1;
        long j12 = parcel.readLong();
        long j13 = parcel.readLong();
        Serializable serializable2 = parcel.readSerializable();
        i.c(serializable2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        int i16 = parcel.readInt();
        int i17 = parcel.readInt();
        e eVar = new e();
        eVar.f483v = i;
        eVar.f484w = string;
        eVar.f485x = string2;
        eVar.f486y = str;
        eVar.f487z = i10;
        eVar.A = hVarC;
        eVar.B = map;
        eVar.C = j8;
        eVar.D = j9;
        eVar.E = lVarB;
        eVar.F = bVarA;
        eVar.G = gVarA;
        eVar.H = j10;
        eVar.I = string4;
        eVar.J = aVarB;
        eVar.K = j11;
        eVar.L = z2;
        eVar.P = j12;
        eVar.Q = j13;
        eVar.M = new jd.g((Map) serializable2);
        eVar.N = i16;
        eVar.O = i17;
        return eVar;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new e[i];
    }
}
