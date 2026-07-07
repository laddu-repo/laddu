package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements n {

    /* renamed from: x, reason: collision with root package name */
    public final Double f2213x;

    public g(Double d10) {
        if (d10 == null) {
            this.f2213x = Double.valueOf(Double.NaN);
        } else {
            this.f2213x = d10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double b() {
        return this.f2213x;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean e() {
        Double d10 = this.f2213x;
        boolean z10 = false;
        if (!Double.isNaN(d10.doubleValue()) && d10.doubleValue() != 0.0d) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f2213x.equals(((g) obj).f2213x);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String f() {
        BigDecimal stripTrailingZeros;
        int scale;
        Double d10 = this.f2213x;
        if (Double.isNaN(d10.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d10.doubleValue())) {
            if (d10.doubleValue() > 0.0d) {
                return "Infinity";
            }
            return "-Infinity";
        }
        BigDecimal valueOf = BigDecimal.valueOf(d10.doubleValue());
        if (valueOf.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = valueOf.stripTrailingZeros();
        }
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (stripTrailingZeros.scale() > 0) {
            scale = stripTrailingZeros.precision();
        } else {
            scale = stripTrailingZeros.scale();
        }
        decimalFormat.setMinimumFractionDigits(scale - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf > 0) {
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if ((parseInt < 0 && parseInt > -7) || (parseInt >= 0 && parseInt < 21)) {
                return stripTrailingZeros.toPlainString();
            }
            return format.replace("E-", "e-").replace("E", "e+");
        }
        return format;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator g() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n h(String str, ic.s sVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new q(f());
        }
        throw new IllegalArgumentException(f() + "." + str + " is not a function.");
    }

    public final int hashCode() {
        return this.f2213x.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n j() {
        return new g(this.f2213x);
    }

    public final String toString() {
        return f();
    }
}
