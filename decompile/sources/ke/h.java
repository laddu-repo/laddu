package ke;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends p {
    public static boolean E(CharSequence charSequence, String str, boolean z2) {
        de.i.e(charSequence, "<this>");
        return J(charSequence, str, 0, z2, 2) >= 0;
    }

    public static boolean F(CharSequence charSequence, char c10) {
        de.i.e(charSequence, "<this>");
        return I(charSequence, c10, 0, 2) >= 0;
    }

    public static final int G(CharSequence charSequence) {
        de.i.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int H(CharSequence charSequence, String str, int i, boolean z2) {
        de.i.e(charSequence, "<this>");
        de.i.e(str, "string");
        if (!z2 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        he.c cVar = new he.c(i, length, 1);
        boolean z10 = charSequence instanceof String;
        int i10 = cVar.f6284x;
        int i11 = cVar.f6283w;
        int i12 = cVar.f6282v;
        if (z10 && (str instanceof String)) {
            if ((i10 <= 0 || i12 > i11) && (i10 >= 0 || i11 > i12)) {
                return -1;
            }
            int i13 = i12;
            while (true) {
                String str2 = str;
                boolean z11 = z2;
                if (p.y(0, i13, str.length(), str2, (String) charSequence, z11)) {
                    return i13;
                }
                if (i13 == i11) {
                    return -1;
                }
                i13 += i10;
                str = str2;
                z2 = z11;
            }
        } else {
            if ((i10 <= 0 || i12 > i11) && (i10 >= 0 || i11 > i12)) {
                return -1;
            }
            while (true) {
                int length3 = str.length();
                de.i.e(str, "<this>");
                de.i.e(charSequence, "other");
                boolean z12 = false;
                if (i12 >= 0 && str.length() - length3 >= 0 && i12 <= charSequence.length() - length3) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= length3) {
                            z12 = true;
                            break;
                        }
                        if (!com.bumptech.glide.d.i(str.charAt(0 + i14), charSequence.charAt(i12 + i14), z2)) {
                            break;
                        }
                        i14++;
                    }
                }
                if (z12) {
                    return i12;
                }
                if (i12 == i11) {
                    return -1;
                }
                i12 += i10;
            }
        }
    }

    public static int I(CharSequence charSequence, char c10, int i, int i10) {
        if ((i10 & 2) != 0) {
            i = 0;
        }
        de.i.e(charSequence, "<this>");
        return !(charSequence instanceof String) ? K(charSequence, new char[]{c10}, i, false) : ((String) charSequence).indexOf(c10, i);
    }

    public static /* synthetic */ int J(CharSequence charSequence, String str, int i, boolean z2, int i10) {
        if ((i10 & 2) != 0) {
            i = 0;
        }
        if ((i10 & 4) != 0) {
            z2 = false;
        }
        return H(charSequence, str, i, z2);
    }

    public static final int K(CharSequence charSequence, char[] cArr, int i, boolean z2) {
        de.i.e(charSequence, "<this>");
        if (!z2 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int iG = G(charSequence);
        if (i > iG) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c10 : cArr) {
                if (com.bumptech.glide.d.i(c10, cCharAt, z2)) {
                    return i;
                }
            }
            if (i == iG) {
                return -1;
            }
            i++;
        }
    }

    public static boolean L(String str) {
        de.i.e(str, "<this>");
        for (int i = 0; i < str.length(); i++) {
            if (!com.bumptech.glide.d.B(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int M(String str, char c10, int i, int i10) {
        if ((i10 & 2) != 0) {
            i = G(str);
        }
        de.i.e(str, "<this>");
        return str.lastIndexOf(c10, i);
    }

    public static int N(String str, String str2) {
        int iG = G(str);
        de.i.e(str, "<this>");
        return str.lastIndexOf(str2, iG);
    }

    public static String O(int i, String str) {
        CharSequence charSequenceSubSequence;
        de.i.e(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(d0.d.i(i, "Desired length ", " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i);
            int length = i - str.length();
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
            charSequenceSubSequence = sb2;
        }
        return charSequenceSubSequence.toString();
    }

    public static String P(String str, String str2) {
        if (!p.B(str, str2, false)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        de.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static List Q(String str, char[] cArr) {
        de.i.e(str, "<this>");
        if (cArr.length == 1) {
            String strValueOf = String.valueOf(cArr[0]);
            int iH = H(str, strValueOf, 0, false);
            if (iH == -1) {
                return fa.b.s(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int length = 0;
            do {
                arrayList.add(str.subSequence(length, iH).toString());
                length = strValueOf.length() + iH;
                iH = H(str, strValueOf, length, false);
            } while (iH != -1);
            arrayList.add(str.subSequence(length, str.length()).toString());
            return arrayList;
        }
        je.i iVar = new je.i(new je.d(str, new q(0, cArr)));
        ArrayList arrayList2 = new ArrayList(pd.l.C(iVar, 10));
        Iterator it = iVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList2;
            }
            he.c cVar = (he.c) bVar.next();
            de.i.e(cVar, "range");
            arrayList2.add(str.subSequence(cVar.f6282v, cVar.f6283w + 1).toString());
        }
    }

    public static String R(String str, String str2, String str3) {
        de.i.e(str2, "delimiter");
        int iJ = J(str, str2, 0, false, 6);
        if (iJ == -1) {
            return str3;
        }
        String strSubstring = str.substring(str2.length() + iJ, str.length());
        de.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String S(char c10, String str, String str2) {
        de.i.e(str, "<this>");
        de.i.e(str2, "missingDelimiterValue");
        int iM = M(str, c10, 0, 6);
        if (iM == -1) {
            return str2;
        }
        String strSubstring = str.substring(iM + 1, str.length());
        de.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String T(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(d0.d.i(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(0, i);
        de.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence U(String str) {
        de.i.e(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z2 = false;
        while (i <= length) {
            boolean zB = com.bumptech.glide.d.B(str.charAt(!z2 ? i : length));
            if (z2) {
                if (!zB) {
                    break;
                }
                length--;
            } else if (zB) {
                i++;
            } else {
                z2 = true;
            }
        }
        return str.subSequence(i, length + 1);
    }
}
