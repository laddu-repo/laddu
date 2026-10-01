package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q implements Iterable, n {

    /* renamed from: x, reason: collision with root package name */
    public final String f2396x;

    public q(String str) {
        if (str != null) {
            this.f2396x = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double b() {
        String str = this.f2396x;
        if (!str.isEmpty()) {
            try {
                return Double.valueOf(str);
            } catch (NumberFormatException unused) {
                return Double.valueOf(Double.NaN);
            }
        }
        return Double.valueOf(0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean e() {
        return Boolean.valueOf(!this.f2396x.isEmpty());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        return this.f2396x.equals(((q) obj).f2396x);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String f() {
        return this.f2396x;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator g() {
        return new p(this, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02f3, code lost:
    
        if (r4[r1].isEmpty() == false) goto L104;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x00b8. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.n h(java.lang.String r28, ic.s r29, java.util.ArrayList r30) {
        /*
            Method dump skipped, instructions count: 1626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.q.h(java.lang.String, ic.s, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    public final int hashCode() {
        return this.f2396x.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new p(this, 1);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n j() {
        return new q(this.f2396x);
    }

    public final String toString() {
        String str = this.f2396x;
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append("\"");
        sb2.append(str);
        sb2.append("\"");
        return sb2.toString();
    }
}
