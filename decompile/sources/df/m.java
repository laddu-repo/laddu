package df;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m extends u {
    public static boolean I(CharSequence charSequence, CharSequence other, boolean z10) {
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        kotlin.jvm.internal.k.e(other, "other");
        if (other instanceof String) {
            if (Q(charSequence, (String) other, 0, z10, 2) >= 0) {
                return true;
            }
        } else if (O(charSequence, other, 0, charSequence.length(), z10, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean J(CharSequence charSequence, char c10) {
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        if (P(charSequence, c10, 0, 2) < 0) {
            return false;
        }
        return true;
    }

    public static String K(int i6, String str) {
        kotlin.jvm.internal.k.e(str, "<this>");
        if (i6 >= 0) {
            int length = str.length();
            if (i6 > length) {
                i6 = length;
            }
            String substring = str.substring(i6);
            kotlin.jvm.internal.k.d(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(h8.c.j(i6, "Requested character count ", " is less than zero.").toString());
    }

    public static boolean L(String str, char c10) {
        if (str.length() <= 0 || !a.a.i(str.charAt(M(str)), c10, false)) {
            return false;
        }
        return true;
    }

    public static final int M(CharSequence charSequence) {
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int N(CharSequence charSequence, String string, int i6, boolean z10) {
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        kotlin.jvm.internal.k.e(string, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i6);
        }
        return O(charSequence, string, i6, charSequence.length(), z10, false);
    }

    public static final int O(CharSequence charSequence, CharSequence charSequence2, int i6, int i10, boolean z10, boolean z11) {
        af.a aVar;
        if (!z11) {
            if (i6 < 0) {
                i6 = 0;
            }
            int length = charSequence.length();
            if (i10 > length) {
                i10 = length;
            }
            aVar = new af.a(i6, i10, 1);
        } else {
            int M = M(charSequence);
            if (i6 > M) {
                i6 = M;
            }
            if (i10 < 0) {
                i10 = 0;
            }
            aVar = new af.a(i6, i10, -1);
        }
        boolean z12 = charSequence instanceof String;
        int i11 = aVar.f711z;
        int i12 = aVar.f710y;
        int i13 = aVar.f709x;
        if (z12 && (charSequence2 instanceof String)) {
            if ((i11 > 0 && i13 <= i12) || (i11 < 0 && i12 <= i13)) {
                int i14 = i13;
                while (true) {
                    String str = (String) charSequence2;
                    boolean z13 = z10;
                    if (u.C(0, i14, str.length(), str, (String) charSequence, z13)) {
                        return i14;
                    }
                    if (i14 == i12) {
                        break;
                    }
                    i14 += i11;
                    z10 = z13;
                }
            }
        } else {
            boolean z14 = z10;
            if ((i11 > 0 && i13 <= i12) || (i11 < 0 && i12 <= i13)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z15 = z14;
                    z14 = z15;
                    if (W(charSequence4, 0, charSequence3, i13, charSequence2.length(), z15)) {
                        return i13;
                    }
                    if (i13 == i12) {
                        break;
                    }
                    i13 += i11;
                    charSequence2 = charSequence4;
                    charSequence = charSequence3;
                }
            }
        }
        return -1;
    }

    public static int P(CharSequence charSequence, char c10, int i6, int i10) {
        if ((i10 & 2) != 0) {
            i6 = 0;
        }
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        if (!(charSequence instanceof String)) {
            return R(charSequence, new char[]{c10}, i6, false);
        }
        return ((String) charSequence).indexOf(c10, i6);
    }

    public static /* synthetic */ int Q(CharSequence charSequence, String str, int i6, boolean z10, int i10) {
        if ((i10 & 2) != 0) {
            i6 = 0;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return N(charSequence, str, i6, z10);
    }

    public static final int R(CharSequence charSequence, char[] cArr, int i6, boolean z10) {
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ie.i.p0(cArr), i6);
        }
        if (i6 < 0) {
            i6 = 0;
        }
        int M = M(charSequence);
        if (i6 > M) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i6);
            for (char c10 : cArr) {
                if (a.a.i(c10, charAt, z10)) {
                    return i6;
                }
            }
            if (i6 != M) {
                i6++;
            } else {
                return -1;
            }
        }
    }

    public static boolean S(CharSequence charSequence) {
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        for (int i6 = 0; i6 < charSequence.length(); i6++) {
            if (!a.a.n(charSequence.charAt(i6))) {
                return false;
            }
        }
        return true;
    }

    public static int T(int i6, String str, String string) {
        int i10;
        if ((i6 & 2) != 0) {
            i10 = M(str);
        } else {
            i10 = 0;
        }
        kotlin.jvm.internal.k.e(str, "<this>");
        kotlin.jvm.internal.k.e(string, "string");
        return str.lastIndexOf(string, i10);
    }

    public static int U(CharSequence charSequence, char c10, int i6, int i10) {
        if ((i10 & 2) != 0) {
            i6 = M(charSequence);
        }
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        if (!(charSequence instanceof String)) {
            char[] cArr = {c10};
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(ie.i.p0(cArr), i6);
            }
            int M = M(charSequence);
            if (i6 > M) {
                i6 = M;
            }
            while (-1 < i6) {
                if (a.a.i(cArr[0], charSequence.charAt(i6), false)) {
                    return i6;
                }
                i6--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(c10, i6);
    }

    public static String V(int i6, String str) {
        CharSequence charSequence;
        kotlin.jvm.internal.k.e(str, "<this>");
        if (i6 >= 0) {
            if (i6 <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i6);
                int length = i6 - str.length();
                int i10 = 1;
                if (1 <= length) {
                    while (true) {
                        sb2.append('0');
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                    }
                }
                sb2.append((CharSequence) str);
                charSequence = sb2;
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(h8.c.j(i6, "Desired length ", " is less than zero."));
    }

    public static final boolean W(CharSequence charSequence, int i6, CharSequence other, int i10, int i11, boolean z10) {
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        kotlin.jvm.internal.k.e(other, "other");
        if (i10 < 0 || i6 < 0 || i6 > charSequence.length() - i11 || i10 > other.length() - i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!a.a.i(charSequence.charAt(i6 + i12), other.charAt(i10 + i12), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String X(String str, String str2) {
        if (u.H(str, str2, false)) {
            String substring = str.substring(str2.length());
            kotlin.jvm.internal.k.d(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static String Y(String str, String str2) {
        kotlin.jvm.internal.k.e(str, "<this>");
        if (u.z(str, str2, false)) {
            String substring = str.substring(0, str.length() - str2.length());
            kotlin.jvm.internal.k.d(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static final List Z(CharSequence charSequence, String str) {
        int N = N(charSequence, str, 0, false);
        if (N != -1) {
            ArrayList arrayList = new ArrayList(10);
            int i6 = 0;
            do {
                arrayList.add(charSequence.subSequence(i6, N).toString());
                i6 = str.length() + N;
                N = N(charSequence, str, i6, false);
            } while (N != -1);
            arrayList.add(charSequence.subSequence(i6, charSequence.length()).toString());
            return arrayList;
        }
        return a8.g.m(charSequence.toString());
    }

    public static List a0(String str, char[] cArr) {
        kotlin.jvm.internal.k.e(str, "<this>");
        if (cArr.length == 1) {
            return Z(str, String.valueOf(cArr[0]));
        }
        cf.q qVar = new cf.q(new cf.i(str, new v(cArr, 0)), 0);
        ArrayList arrayList = new ArrayList(ie.l.x(qVar, 10));
        Iterator it = qVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (bVar.hasNext()) {
                af.c range = (af.c) bVar.next();
                kotlin.jvm.internal.k.e(range, "range");
                arrayList.add(str.subSequence(range.f709x, range.f710y + 1).toString());
            } else {
                return arrayList;
            }
        }
    }

    public static List b0(String str, String[] strArr) {
        kotlin.jvm.internal.k.e(str, "<this>");
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                return Z(str, str2);
            }
        }
        cf.q qVar = new cf.q(new cf.i(str, new v(ie.i.X(strArr), 1)), 0);
        ArrayList arrayList = new ArrayList(ie.l.x(qVar, 10));
        Iterator it = qVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (bVar.hasNext()) {
                af.c range = (af.c) bVar.next();
                kotlin.jvm.internal.k.e(range, "range");
                arrayList.add(str.subSequence(range.f709x, range.f710y + 1).toString());
            } else {
                return arrayList;
            }
        }
    }

    public static boolean c0(String str, char c10) {
        if (str.length() <= 0 || !a.a.i(str.charAt(0), c10, false)) {
            return false;
        }
        return true;
    }

    public static String d0(char c10, String str, String str2) {
        int P = P(str, c10, 0, 6);
        if (P == -1) {
            return str2;
        }
        String substring = str.substring(P + 1, str.length());
        kotlin.jvm.internal.k.d(substring, "substring(...)");
        return substring;
    }

    public static String e0(String str, String delimiter, String str2) {
        kotlin.jvm.internal.k.e(delimiter, "delimiter");
        int Q = Q(str, delimiter, 0, false, 6);
        if (Q == -1) {
            return str2;
        }
        String substring = str.substring(delimiter.length() + Q, str.length());
        kotlin.jvm.internal.k.d(substring, "substring(...)");
        return substring;
    }

    public static String f0(char c10, String str, String str2) {
        int U = U(str, c10, 0, 6);
        if (U == -1) {
            return str2;
        }
        String substring = str.substring(U + 1, str.length());
        kotlin.jvm.internal.k.d(substring, "substring(...)");
        return substring;
    }

    public static String g0(String missingDelimiterValue, String str) {
        kotlin.jvm.internal.k.e(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.k.e(missingDelimiterValue, "missingDelimiterValue");
        int T = T(6, missingDelimiterValue, str);
        if (T == -1) {
            return missingDelimiterValue;
        }
        String substring = missingDelimiterValue.substring(str.length() + T, missingDelimiterValue.length());
        kotlin.jvm.internal.k.d(substring, "substring(...)");
        return substring;
    }

    public static String h0(String missingDelimiterValue, char c10) {
        kotlin.jvm.internal.k.e(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.k.e(missingDelimiterValue, "missingDelimiterValue");
        int P = P(missingDelimiterValue, c10, 0, 6);
        if (P == -1) {
            return missingDelimiterValue;
        }
        String substring = missingDelimiterValue.substring(0, P);
        kotlin.jvm.internal.k.d(substring, "substring(...)");
        return substring;
    }

    public static String i0(String missingDelimiterValue, String str) {
        kotlin.jvm.internal.k.e(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.k.e(missingDelimiterValue, "missingDelimiterValue");
        int Q = Q(missingDelimiterValue, str, 0, false, 6);
        if (Q == -1) {
            return missingDelimiterValue;
        }
        String substring = missingDelimiterValue.substring(0, Q);
        kotlin.jvm.internal.k.d(substring, "substring(...)");
        return substring;
    }

    public static String j0(String missingDelimiterValue, char c10) {
        kotlin.jvm.internal.k.e(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.k.e(missingDelimiterValue, "missingDelimiterValue");
        int U = U(missingDelimiterValue, c10, 0, 6);
        if (U == -1) {
            return missingDelimiterValue;
        }
        String substring = missingDelimiterValue.substring(0, U);
        kotlin.jvm.internal.k.d(substring, "substring(...)");
        return substring;
    }

    public static String k0(String missingDelimiterValue, String str) {
        kotlin.jvm.internal.k.e(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.k.e(missingDelimiterValue, "missingDelimiterValue");
        int T = T(6, missingDelimiterValue, str);
        if (T == -1) {
            return missingDelimiterValue;
        }
        String substring = missingDelimiterValue.substring(0, T);
        kotlin.jvm.internal.k.d(substring, "substring(...)");
        return substring;
    }

    public static String l0(int i6, String str) {
        kotlin.jvm.internal.k.e(str, "<this>");
        if (i6 >= 0) {
            int length = str.length();
            if (i6 > length) {
                i6 = length;
            }
            String substring = str.substring(0, i6);
            kotlin.jvm.internal.k.d(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(h8.c.j(i6, "Requested character count ", " is less than zero.").toString());
    }

    public static String m0(String str) {
        int length = str.length();
        int i6 = 3;
        if (3 > length) {
            i6 = length;
        }
        String substring = str.substring(length - i6);
        kotlin.jvm.internal.k.d(substring, "substring(...)");
        return substring;
    }

    public static CharSequence n0(CharSequence charSequence) {
        int i6;
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            if (!z10) {
                i6 = i10;
            } else {
                i6 = length;
            }
            boolean n10 = a.a.n(charSequence.charAt(i6));
            if (!z10) {
                if (!n10) {
                    z10 = true;
                } else {
                    i10++;
                }
            } else {
                if (!n10) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static String o0(String str, char... cArr) {
        int i6;
        kotlin.jvm.internal.k.e(str, "<this>");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            if (!z10) {
                i6 = i10;
            } else {
                i6 = length;
            }
            boolean Y = ie.i.Y(cArr, str.charAt(i6));
            if (!z10) {
                if (!Y) {
                    z10 = true;
                } else {
                    i10++;
                }
            } else {
                if (!Y) {
                    break;
                }
                length--;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }
}
