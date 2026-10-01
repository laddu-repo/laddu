package df;

import java.util.Comparator;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class u extends t {
    public static boolean A(String str, String str2, boolean z10) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        if (!z10) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static void B() {
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.k.d(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
    }

    public static boolean C(int i6, int i10, int i11, String str, String other, boolean z10) {
        kotlin.jvm.internal.k.e(str, "<this>");
        kotlin.jvm.internal.k.e(other, "other");
        if (!z10) {
            return str.regionMatches(i6, other, i10, i11);
        }
        return str.regionMatches(z10, i6, other, i10, i11);
    }

    public static String D(int i6, String str) {
        if (i6 >= 0) {
            if (i6 != 0) {
                int i10 = 1;
                if (i6 != 1) {
                    int length = str.length();
                    if (length != 0) {
                        if (length != 1) {
                            StringBuilder sb2 = new StringBuilder(str.length() * i6);
                            if (1 <= i6) {
                                while (true) {
                                    sb2.append((CharSequence) str);
                                    if (i10 == i6) {
                                        break;
                                    }
                                    i10++;
                                }
                            }
                            String sb3 = sb2.toString();
                            kotlin.jvm.internal.k.b(sb3);
                            return sb3;
                        }
                        char charAt = str.charAt(0);
                        char[] cArr = new char[i6];
                        for (int i11 = 0; i11 < i6; i11++) {
                            cArr[i11] = charAt;
                        }
                        return new String(cArr);
                    }
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                return str.toString();
            }
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i6 + '.').toString());
    }

    public static String E(String str, char c10, char c11) {
        kotlin.jvm.internal.k.e(str, "<this>");
        String replace = str.replace(c10, c11);
        kotlin.jvm.internal.k.d(replace, "replace(...)");
        return replace;
    }

    public static String F(String str, String str2, String newValue) {
        kotlin.jvm.internal.k.e(str, "<this>");
        kotlin.jvm.internal.k.e(newValue, "newValue");
        int N = m.N(str, str2, 0, false);
        if (N < 0) {
            return str;
        }
        int length = str2.length();
        int i6 = 1;
        if (length >= 1) {
            i6 = length;
        }
        int length2 = newValue.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            int i10 = 0;
            do {
                sb2.append((CharSequence) str, i10, N);
                sb2.append(newValue);
                i10 = N + length;
                if (N >= str.length()) {
                    break;
                }
                N = m.N(str, str2, N + i6, false);
            } while (N > 0);
            sb2.append((CharSequence) str, i10, str.length());
            String sb3 = sb2.toString();
            kotlin.jvm.internal.k.d(sb3, "toString(...)");
            return sb3;
        }
        throw new OutOfMemoryError();
    }

    public static boolean G(int i6, String str, String str2, boolean z10) {
        kotlin.jvm.internal.k.e(str, "<this>");
        if (!z10) {
            return str.startsWith(str2, i6);
        }
        return C(i6, 0, str2.length(), str, str2, z10);
    }

    public static boolean H(String str, String prefix, boolean z10) {
        kotlin.jvm.internal.k.e(str, "<this>");
        kotlin.jvm.internal.k.e(prefix, "prefix");
        if (!z10) {
            return str.startsWith(prefix);
        }
        return C(0, 0, prefix.length(), str, prefix, z10);
    }

    public static String y(char[] cArr, int i6, int i10) {
        a8.e.i(i6, i10, cArr.length);
        return new String(cArr, i6, i10 - i6);
    }

    public static boolean z(String str, String suffix, boolean z10) {
        kotlin.jvm.internal.k.e(str, "<this>");
        kotlin.jvm.internal.k.e(suffix, "suffix");
        if (!z10) {
            return str.endsWith(suffix);
        }
        return C(str.length() - suffix.length(), 0, suffix.length(), str, suffix, true);
    }
}
