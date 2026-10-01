package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements n {

    /* renamed from: x, reason: collision with root package name */
    public final n f2201x;

    /* renamed from: y, reason: collision with root package name */
    public final String f2202y;

    public f(String str) {
        this.f2201x = n.f2352a;
        this.f2202y = str;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double b() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean e() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f2202y.equals(fVar.f2202y) && this.f2201x.equals(fVar.f2201x)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String f() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator g() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n h(String str, ic.s sVar, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final int hashCode() {
        return this.f2201x.hashCode() + (this.f2202y.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n j() {
        return new f(this.f2202y, this.f2201x.j());
    }

    public f(String str, n nVar) {
        this.f2201x = nVar;
        this.f2202y = str;
    }
}
