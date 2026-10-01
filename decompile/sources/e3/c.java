package e3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import u1.t;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends e {
    public long[] A;
    public long[] B;

    /* renamed from: z, reason: collision with root package name */
    public long f4299z;

    public static Serializable e1(int i6, t tVar) {
        if (i6 != 0) {
            boolean z10 = false;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 8) {
                            if (i6 != 10) {
                                if (i6 != 11) {
                                    return null;
                                }
                                Date date = new Date((long) Double.longBitsToDouble(tVar.s()));
                                tVar.L(2);
                                return date;
                            }
                            int C = tVar.C();
                            ArrayList arrayList = new ArrayList(C);
                            for (int i10 = 0; i10 < C; i10++) {
                                Serializable e12 = e1(tVar.y(), tVar);
                                if (e12 != null) {
                                    arrayList.add(e12);
                                }
                            }
                            return arrayList;
                        }
                        return f1(tVar);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String g12 = g1(tVar);
                        int y9 = tVar.y();
                        if (y9 == 9) {
                            return hashMap;
                        }
                        Serializable e13 = e1(y9, tVar);
                        if (e13 != null) {
                            hashMap.put(g12, e13);
                        }
                    }
                } else {
                    return g1(tVar);
                }
            } else {
                if (tVar.y() == 1) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(tVar.s()));
        }
    }

    public static HashMap f1(t tVar) {
        int C = tVar.C();
        HashMap hashMap = new HashMap(C);
        for (int i6 = 0; i6 < C; i6++) {
            String g12 = g1(tVar);
            Serializable e12 = e1(tVar.y(), tVar);
            if (e12 != null) {
                hashMap.put(g12, e12);
            }
        }
        return hashMap;
    }

    public static String g1(t tVar) {
        int E = tVar.E();
        int i6 = tVar.f12812b;
        tVar.L(E);
        return new String(tVar.f12811a, i6, E);
    }
}
