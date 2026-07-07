package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class k implements n, j {

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f2315x = new HashMap();

    @Override // com.google.android.gms.internal.measurement.j
    public final n a(String str) {
        HashMap hashMap = this.f2315x;
        if (hashMap.containsKey(str)) {
            return (n) hashMap.get(str);
        }
        return n.f2352a;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double b() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final void c(String str, n nVar) {
        HashMap hashMap = this.f2315x;
        if (nVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, nVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final boolean d(String str) {
        return this.f2315x.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean e() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        return this.f2315x.equals(((k) obj).f2315x);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String f() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator g() {
        return new i(this.f2315x.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.n
    public n h(String str, ic.s sVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new q(toString());
        }
        return r4.a.A(this, new q(str), sVar, arrayList);
    }

    public final int hashCode() {
        return this.f2315x.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n j() {
        k kVar = new k();
        for (Map.Entry entry : this.f2315x.entrySet()) {
            boolean z10 = entry.getValue() instanceof j;
            HashMap hashMap = kVar.f2315x;
            if (z10) {
                hashMap.put((String) entry.getKey(), (n) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), ((n) entry.getValue()).j());
            }
        }
        return kVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        HashMap hashMap = this.f2315x;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb2.append(String.format("%s: %s,", str, hashMap.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }
}
