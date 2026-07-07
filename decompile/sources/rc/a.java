package rc;

import android.util.Base64;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f11358a = {'a', 'A', 'b', 'B', 'c', 'C', 'd', 'D', 'e', 'E', 'f', 'F', 'g', 'G', 'h', 'H', 'i', 'I', 'j', 'J', 'k', 'K', 'l', 'L', 'm', 'M', 'n', 'N', 'o', 'O', 'p', 'P', 'q', 'Q', 'r', 'R', 's', 'S', 't', 'T', 'u', 'U', 'v', 'V', 'w', 'W', 'x', 'X', 'y', 'Y', 'z', 'Z'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f11359b = {'f', 'F', 'g', 'G', 'j', 'J', 'k', 'K', 'a', 'A', 'p', 'P', 'b', 'B', 'm', 'M', 'o', 'O', 'z', 'Z', 'e', 'E', 'n', 'N', 'c', 'C', 'd', 'D', 'r', 'R', 'q', 'Q', 't', 'T', 'v', 'V', 'u', 'U', 'x', 'X', 'h', 'H', 'i', 'I', 'w', 'W', 'y', 'Y', 'l', 'L', 's', 'S'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f11360c = new char[128];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f11361d = new char[128];

    static {
        int i = 0;
        while (true) {
            char[] cArr = f11358a;
            if (i >= cArr.length) {
                break;
            }
            char[] cArr2 = f11360c;
            char c10 = cArr[i];
            char[] cArr3 = f11359b;
            cArr2[c10] = cArr3[i];
            f11361d[cArr3[i]] = cArr[i];
            i++;
        }
        for (int i10 = 0; i10 < 128; i10++) {
            char[] cArr4 = f11360c;
            if (cArr4[i10] == 0) {
                cArr4[i10] = (char) i10;
            }
            char[] cArr5 = f11361d;
            if (cArr5[i10] == 0) {
                cArr5[i10] = (char) i10;
            }
        }
    }

    public static String a(String str) {
        return new String(Base64.decode(new StringBuilder(new String(Base64.decode(vc.a.n(str), 0))).reverse().toString(), 0));
    }

    public static String b(String str) {
        char[] cArr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            cArr[i] = f11361d[str.charAt(i)];
        }
        return new String(cArr);
    }
}
