package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: x, reason: collision with root package name */
    public final String f2368x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f2369y;

    public o(String str, ArrayList arrayList) {
        this.f2368x = str;
        ArrayList arrayList2 = new ArrayList();
        this.f2369y = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double b() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean e() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        String str = oVar.f2368x;
        String str2 = this.f2368x;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        return this.f2369y.equals(oVar.f2369y);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String f() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator g() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n h(String str, ic.s sVar, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final int hashCode() {
        int i6;
        String str = this.f2368x;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        return this.f2369y.hashCode() + (i6 * 31);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n j() {
        return this;
    }
}
