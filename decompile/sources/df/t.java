package df;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class t extends s {
    public static final void v(String str) {
        throw new NumberFormatException(w8.k.b('\'', "Invalid number format: '", str));
    }

    public static Integer w(String str) {
        boolean z10;
        int i6;
        int i10;
        kotlin.jvm.internal.k.e(str, "<this>");
        a.a.g(10);
        int length = str.length();
        if (length != 0) {
            int i11 = 0;
            char charAt = str.charAt(0);
            int i12 = -2147483647;
            if (kotlin.jvm.internal.k.g(charAt, 48) < 0) {
                i6 = 1;
                if (length != 1) {
                    if (charAt != '+') {
                        if (charAt == '-') {
                            i12 = Integer.MIN_VALUE;
                            z10 = true;
                        } else {
                            return null;
                        }
                    } else {
                        z10 = false;
                    }
                } else {
                    return null;
                }
            } else {
                z10 = false;
                i6 = 0;
            }
            int i13 = -59652323;
            while (i6 < length) {
                int digit = Character.digit((int) str.charAt(i6), 10);
                if (digit >= 0) {
                    if ((i11 < i13 && (i13 != -59652323 || i11 < (i13 = i12 / 10))) || (i10 = i11 * 10) < i12 + digit) {
                        return null;
                    }
                    i11 = i10 - digit;
                    i6++;
                } else {
                    return null;
                }
            }
            if (z10) {
                return Integer.valueOf(i11);
            }
            return Integer.valueOf(-i11);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Long x(java.lang.String r18) {
        /*
            r0 = r18
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.k.e(r0, r1)
            r1 = 10
            a.a.g(r1)
            int r2 = r0.length()
            if (r2 != 0) goto L13
            goto L67
        L13:
            r3 = 0
            char r4 = r0.charAt(r3)
            r5 = 48
            int r5 = kotlin.jvm.internal.k.g(r4, r5)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 >= 0) goto L37
            r5 = 1
            if (r2 != r5) goto L29
            goto L67
        L29:
            r8 = 43
            if (r4 == r8) goto L36
            r3 = 45
            if (r4 == r3) goto L32
            goto L67
        L32:
            r6 = -9223372036854775808
            r3 = 1
            goto L38
        L36:
            r3 = 1
        L37:
            r5 = 0
        L38:
            r8 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r10 = 0
            r12 = r8
        L40:
            if (r3 >= r2) goto L6d
            char r4 = r0.charAt(r3)
            int r4 = java.lang.Character.digit(r4, r1)
            if (r4 >= 0) goto L4d
            goto L67
        L4d:
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L5d
            int r14 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r14 != 0) goto L67
            long r12 = (long) r1
            long r12 = r6 / r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L5d
            goto L67
        L5d:
            long r14 = (long) r1
            long r10 = r10 * r14
            long r14 = (long) r4
            long r16 = r6 + r14
            int r4 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r4 >= 0) goto L69
        L67:
            r0 = 0
            return r0
        L69:
            long r10 = r10 - r14
            int r3 = r3 + 1
            goto L40
        L6d:
            if (r5 == 0) goto L74
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            return r0
        L74:
            long r0 = -r10
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: df.t.x(java.lang.String):java.lang.Long");
    }
}
