package ke;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class p extends o {
    public static boolean A(int i, String str, String str2, boolean z2) {
        de.i.e(str, "<this>");
        return !z2 ? str.startsWith(str2, i) : y(i, 0, str2.length(), str, str2, z2);
    }

    public static boolean B(String str, String str2, boolean z2) {
        de.i.e(str, "<this>");
        de.i.e(str2, "prefix");
        return !z2 ? str.startsWith(str2) : y(0, 0, str2.length(), str, str2, z2);
    }

    public static Integer C(String str) {
        boolean z2;
        int i;
        int i10;
        de.i.e(str, "<this>");
        com.bumptech.glide.d.d(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        int i12 = -2147483647;
        if (de.i.f(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z2 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i12 = Integer.MIN_VALUE;
                z2 = true;
            }
        } else {
            z2 = false;
            i = 0;
        }
        int i13 = -59652323;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i11 < i13 && (i13 != -59652323 || i11 < (i13 = i12 / 10))) || (i10 = i11 * 10) < i12 + iDigit) {
                return null;
            }
            i11 = i10 - iDigit;
            i++;
        }
        return z2 ? Integer.valueOf(i11) : Integer.valueOf(-i11);
    }

    public static Long D(String str) {
        boolean z2;
        de.i.e(str, "<this>");
        com.bumptech.glide.d.d(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        long j8 = -9223372036854775807L;
        if (de.i.f(cCharAt, 48) < 0) {
            z2 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z2 = false;
                i = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j8 = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z2 = false;
        }
        long j9 = 0;
        long j10 = -256204778801521550L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j9 < j10) {
                if (j10 != -256204778801521550L) {
                    return null;
                }
                j10 = j8 / ((long) 10);
                if (j9 < j10) {
                    return null;
                }
            }
            long j11 = j9 * ((long) 10);
            long j12 = iDigit;
            if (j11 < j8 + j12) {
                return null;
            }
            j9 = j11 - j12;
            i++;
        }
        return z2 ? Long.valueOf(j9) : Long.valueOf(-j9);
    }

    public static boolean x(String str, String str2) {
        de.i.e(str, "<this>");
        de.i.e(str2, "suffix");
        return str.endsWith(str2);
    }

    public static boolean y(int i, int i10, int i11, String str, String str2, boolean z2) {
        de.i.e(str, "<this>");
        de.i.e(str2, "other");
        return !z2 ? str.regionMatches(i, str2, i10, i11) : str.regionMatches(z2, i, str2, i10, i11);
    }

    public static String z(String str, String str2, String str3) {
        de.i.e(str, "<this>");
        int iH = h.H(str, str2, 0, false);
        if (iH < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        int i10 = 0;
        do {
            sb2.append((CharSequence) str, i10, iH);
            sb2.append(str3);
            i10 = iH + length;
            if (iH >= str.length()) {
                break;
            }
            iH = h.H(str, str2, iH + i, false);
        } while (iH > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String string = sb2.toString();
        de.i.d(string, "toString(...)");
        return string;
    }
}
