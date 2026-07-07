package df;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f4122a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f4123b;

    static {
        int[] iArr = new int[256];
        int i6 = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            iArr[i10] = "0123456789abcdef".charAt(i10 & 15) | ("0123456789abcdef".charAt(i10 >> 4) << '\b');
        }
        f4122a = iArr;
        int[] iArr2 = new int[256];
        for (int i11 = 0; i11 < 256; i11++) {
            iArr2[i11] = "0123456789ABCDEF".charAt(i11 & 15) | ("0123456789ABCDEF".charAt(i11 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr3[i12] = -1;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i13)] = i14;
            i13++;
            i14++;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i15)] = i16;
            i15++;
            i16++;
        }
        long[] jArr = new long[256];
        for (int i17 = 0; i17 < 256; i17++) {
            jArr[i17] = -1;
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i18)] = i19;
            i18++;
            i19++;
        }
        int i20 = 0;
        while (i6 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i6)] = i20;
            i6++;
            i20++;
        }
        f4123b = jArr;
    }

    public static final void a(String str, int i6, int i10) {
        int i11 = i10 - i6;
        if (i11 >= 1) {
            if (i11 > 16) {
                int i12 = (i11 + i6) - 16;
                while (i6 < i12) {
                    if (str.charAt(i6) == '0') {
                        i6++;
                    } else {
                        StringBuilder n10 = h8.c.n(i6, "Expected the hexadecimal digit '0' at index ", ", but was '");
                        n10.append(str.charAt(i6));
                        n10.append("'.\nThe result won't fit the type being parsed.");
                        throw new NumberFormatException(n10.toString());
                    }
                }
                return;
            }
            return;
        }
        String substring = str.substring(i6, i10);
        kotlin.jvm.internal.k.d(substring, "substring(...)");
        throw new NumberFormatException("Expected at least 1 hexadecimal digits at index " + i6 + ", but was \"" + substring + "\" of length " + i11);
    }

    public static long b(String str, int i6, int i10) {
        f format = f.f4127d;
        kotlin.jvm.internal.k.e(format, "format");
        a8.e.i(i6, i10, str.length());
        if (format.f4130c.f4126a) {
            a(str, i6, i10);
            return c(str, i6, i10);
        }
        if (i10 - i6 > 0) {
            a(str, i6, i10);
            return c(str, i6, i10);
        }
        String substring = str.substring(i6, i10);
        kotlin.jvm.internal.k.d(substring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ".concat(substring));
    }

    public static final long c(String str, int i6, int i10) {
        long j = 0;
        while (i6 < i10) {
            long j10 = j << 4;
            char charAt = str.charAt(i6);
            if ((charAt >>> '\b') == 0) {
                long j11 = f4123b[charAt];
                if (j11 >= 0) {
                    j = j10 | j11;
                    i6++;
                }
            }
            StringBuilder n10 = h8.c.n(i6, "Expected a hexadecimal digit at index ", ", but was ");
            n10.append(str.charAt(i6));
            throw new NumberFormatException(n10.toString());
        }
        return j;
    }
}
