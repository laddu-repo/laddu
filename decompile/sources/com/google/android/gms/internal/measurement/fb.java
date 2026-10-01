package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class fb extends w5 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a7.j f2640w;

    public fb(a7.j jVar) {
        this.f2640w = jVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.measurement.w5, com.google.android.gms.internal.measurement.z5
    public final z5 g(String str, z7 z7Var, ArrayList arrayList) {
        int iHashCode = str.hashCode();
        a7.j jVar = this.f2640w;
        switch (iHashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    jb.f("getEventName", 0, arrayList);
                    return new c6(((b) jVar.f203x).f2494a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    jb.f("getTimestamp", 0, arrayList);
                    return new m3(Double.valueOf(((b) jVar.f203x).f2495b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    jb.f("getParamValue", 1, arrayList);
                    String strE = ((f6) z7Var.f3283x).f(z7Var, (z5) arrayList.get(0)).e();
                    HashMap map = ((b) jVar.f203x).f2496c;
                    return eh.a(map.containsKey(strE) ? map.get(strE) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    jb.f("getParams", 0, arrayList);
                    HashMap map2 = ((b) jVar.f203x).f2496c;
                    w5 w5Var = new w5();
                    for (String str2 : map2.keySet()) {
                        w5Var.i(str2, eh.a(map2.get(str2)));
                    }
                    return w5Var;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    jb.f("setParamValue", 2, arrayList);
                    String strE2 = ((f6) z7Var.f3283x).f(z7Var, (z5) arrayList.get(0)).e();
                    z5 z5VarF = ((f6) z7Var.f3283x).f(z7Var, (z5) arrayList.get(1));
                    b bVar = (b) jVar.f203x;
                    Object objT = jb.t(z5VarF);
                    HashMap map3 = bVar.f2496c;
                    if (objT == null) {
                        map3.remove(strE2);
                        return z5VarF;
                    }
                    map3.put(strE2, b.b(map3.get(strE2), objT, strE2));
                    return z5VarF;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    jb.f("setEventName", 1, arrayList);
                    z5 z5VarF2 = ((f6) z7Var.f3283x).f(z7Var, (z5) arrayList.get(0));
                    if (z5.f3274a.equals(z5VarF2) || z5.f3275b.equals(z5VarF2)) {
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    ((b) jVar.f203x).f2494a = z5VarF2.e();
                    return new c6(z5VarF2.e());
                }
                break;
        }
        return super.g(str, z7Var, arrayList);
    }
}
