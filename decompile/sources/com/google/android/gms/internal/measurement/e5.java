package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Locale;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class e5 extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(long j, long j10, int i6, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat("Pos: " + j + ", limit: " + j10 + ", len: " + i6), indexOutOfBoundsException);
        Locale locale = Locale.US;
    }

    public e5(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e5(java.io.File r3, java.io.File r4, java.lang.String r5) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            if (r4 == 0) goto L1c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = " -> "
            r3.<init>(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
        L1c:
            java.lang.String r3 = ": "
            java.lang.String r3 = r3.concat(r5)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "toString(...)"
            kotlin.jvm.internal.k.d(r3, r4)
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.e5.<init>(java.io.File, java.io.File, java.lang.String):void");
    }
}
