package c3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import w1.t;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c extends e {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f2049x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long[] f2050y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long[] f2051z;

    public static Serializable E(int i, t tVar) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(tVar.r()));
        }
        if (i == 1) {
            return Boolean.valueOf(tVar.x() == 1);
        }
        if (i == 2) {
            return G(tVar);
        }
        if (i != 3) {
            if (i == 8) {
                return F(tVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(tVar.r()));
                tVar.K(2);
                return date;
            }
            int iB = tVar.B();
            ArrayList arrayList = new ArrayList(iB);
            for (int i10 = 0; i10 < iB; i10++) {
                Serializable serializableE = E(tVar.x(), tVar);
                if (serializableE != null) {
                    arrayList.add(serializableE);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strG = G(tVar);
            int iX = tVar.x();
            if (iX == 9) {
                return map;
            }
            Serializable serializableE2 = E(iX, tVar);
            if (serializableE2 != null) {
                map.put(strG, serializableE2);
            }
        }
    }

    public static HashMap F(t tVar) {
        int iB = tVar.B();
        HashMap map = new HashMap(iB);
        for (int i = 0; i < iB; i++) {
            String strG = G(tVar);
            Serializable serializableE = E(tVar.x(), tVar);
            if (serializableE != null) {
                map.put(strG, serializableE);
            }
        }
        return map;
    }

    public static String G(t tVar) {
        int iD = tVar.D();
        int i = tVar.f13739b;
        tVar.K(iD);
        return new String(tVar.f13738a, i, iD);
    }
}
