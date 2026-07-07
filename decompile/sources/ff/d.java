package ff;

import de.i;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Comparator;
import k8.c0;
import ke.h;
import vf.k;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f5397a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f5398b;

    static {
        vf.f fVar = vf.f.f13604y;
        f5398b = a.a.u(c0.r("efbbbf"), c0.r("feff"), c0.r("fffe0000"), c0.r("fffe"), c0.r("0000feff"));
    }

    public static final void a(long j8, long j9, long j10) {
        if ((j9 | j10) < 0 || j9 > j8 || j8 - j9 < j10) {
            throw new ArrayIndexOutOfBoundsException("length=" + j8 + ", offset=" + j9 + ", count=" + j9);
        }
    }

    public static final void b(Closeable closeable) {
        i.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e7) {
            throw e7;
        } catch (Exception unused) {
        }
    }

    public static final int c(int i, int i10, String str, String str2) {
        i.e(str, "<this>");
        while (i < i10) {
            if (h.F(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i10;
    }

    public static final int d(String str, char c10, int i, int i10) {
        i.e(str, "<this>");
        while (i < i10) {
            if (str.charAt(i) == c10) {
                return i;
            }
            i++;
        }
        return i10;
    }

    public static final boolean e(String[] strArr, String[] strArr2, Comparator comparator) {
        i.e(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int f(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (i.f(cCharAt, 31) <= 0 || i.f(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int g(int i, int i10, String str) {
        while (i < i10) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i10;
    }

    public static final int h(int i, int i10, String str) {
        int i11 = i10 - 1;
        if (i <= i11) {
            while (true) {
                char cCharAt = str.charAt(i11);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i11 + 1;
                }
                if (i11 == i) {
                    break;
                }
                i11--;
            }
        }
        return i;
    }

    public static final String[] i(String[] strArr, String[] strArr2, Comparator comparator) {
        i.e(strArr, "<this>");
        i.e(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean j(String str) {
        i.e(str, "name");
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int k(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    public static final int l(vf.e eVar) {
        i.e(eVar, "<this>");
        return (eVar.readByte() & 255) | ((eVar.readByte() & 255) << 16) | ((eVar.readByte() & 255) << 8);
    }

    public static final int m(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long j8 = Long.parseLong(str);
            if (j8 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j8 < 0) {
                return 0;
            }
            return (int) j8;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final String n(int i, int i10, String str) {
        int iG = g(i, i10, str);
        String strSubstring = str.substring(iG, h(iG, i10, str));
        i.d(strSubstring, "substring(...)");
        return strSubstring;
    }
}
