package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a5 extends k {

    /* renamed from: y, reason: collision with root package name */
    public final androidx.lifecycle.j1 f2143y;

    public a5(androidx.lifecycle.j1 j1Var) {
        this.f2143y = j1Var;
    }

    @Override // com.google.android.gms.internal.measurement.k, com.google.android.gms.internal.measurement.n
    public final n h(String str, ic.s sVar, ArrayList arrayList) {
        Object obj;
        int hashCode = str.hashCode();
        androidx.lifecycle.j1 j1Var = this.f2143y;
        switch (hashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    a8.a.w("getEventName", 0, arrayList);
                    return new q(((b) j1Var.f950z).f2151a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    a8.a.w("getTimestamp", 0, arrayList);
                    return new g(Double.valueOf(((b) j1Var.f950z).f2152b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    a8.a.w("getParamValue", 1, arrayList);
                    String f3 = ((t) sVar.f6782y).c(sVar, (n) arrayList.get(0)).f();
                    HashMap hashMap = ((b) j1Var.f950z).f2153c;
                    if (hashMap.containsKey(f3)) {
                        obj = hashMap.get(f3);
                    } else {
                        obj = null;
                    }
                    return a8.b.p(obj);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    a8.a.w("getParams", 0, arrayList);
                    HashMap hashMap2 = ((b) j1Var.f950z).f2153c;
                    k kVar = new k();
                    for (String str2 : hashMap2.keySet()) {
                        kVar.c(str2, a8.b.p(hashMap2.get(str2)));
                    }
                    return kVar;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    a8.a.w("setParamValue", 2, arrayList);
                    String f10 = ((t) sVar.f6782y).c(sVar, (n) arrayList.get(0)).f();
                    n c10 = ((t) sVar.f6782y).c(sVar, (n) arrayList.get(1));
                    b bVar = (b) j1Var.f950z;
                    Object E = a8.a.E(c10);
                    HashMap hashMap3 = bVar.f2153c;
                    if (E == null) {
                        hashMap3.remove(f10);
                        return c10;
                    }
                    hashMap3.put(f10, b.b(hashMap3.get(f10), E, f10));
                    return c10;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    a8.a.w("setEventName", 1, arrayList);
                    n c11 = ((t) sVar.f6782y).c(sVar, (n) arrayList.get(0));
                    if (!n.f2352a.equals(c11) && !n.f2353b.equals(c11)) {
                        ((b) j1Var.f950z).f2151a = c11.f();
                        return new q(c11.f());
                    }
                    throw new IllegalArgumentException("Illegal event name");
                }
                break;
        }
        return super.h(str, sVar, arrayList);
    }
}
