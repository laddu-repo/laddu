package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class h implements n, j {

    /* renamed from: x, reason: collision with root package name */
    public final String f2239x;

    /* renamed from: y, reason: collision with root package name */
    public final HashMap f2240y = new HashMap();

    public h(String str) {
        this.f2239x = str;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n a(String str) {
        HashMap hashMap = this.f2240y;
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
        HashMap hashMap = this.f2240y;
        if (nVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, nVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final boolean d(String str) {
        return this.f2240y.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean e() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        String str = this.f2239x;
        if (str == null) {
            return false;
        }
        return str.equals(hVar.f2239x);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String f() {
        return this.f2239x;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator g() {
        return new i(this.f2240y.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n h(String str, ic.s sVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new q(this.f2239x);
        }
        return r4.a.A(this, new q(str), sVar, arrayList);
    }

    public final int hashCode() {
        String str = this.f2239x;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public abstract n i(ic.s sVar, List list);

    @Override // com.google.android.gms.internal.measurement.n
    public n j() {
        return this;
    }
}
