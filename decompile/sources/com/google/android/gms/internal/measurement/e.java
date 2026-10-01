package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements n {

    /* renamed from: x, reason: collision with root package name */
    public final boolean f2191x;

    public e(Boolean bool) {
        boolean booleanValue;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        this.f2191x = booleanValue;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double b() {
        double d10;
        if (true != this.f2191x) {
            d10 = 0.0d;
        } else {
            d10 = 1.0d;
        }
        return Double.valueOf(d10);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean e() {
        return Boolean.valueOf(this.f2191x);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && this.f2191x == ((e) obj).f2191x) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String f() {
        return Boolean.toString(this.f2191x);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator g() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n h(String str, ic.s sVar, ArrayList arrayList) {
        boolean equals = "toString".equals(str);
        boolean z10 = this.f2191x;
        if (equals) {
            return new q(Boolean.toString(z10));
        }
        throw new IllegalArgumentException(Boolean.toString(z10) + "." + str + " is not a function.");
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f2191x).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n j() {
        return new e(Boolean.valueOf(this.f2191x));
    }

    public final String toString() {
        return String.valueOf(this.f2191x);
    }
}
