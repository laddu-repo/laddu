package u1;

import java.util.Locale;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f12764a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f12765b = {HttpUrl.FRAGMENT_ENCODE_SET, "A", "B", "C"};

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f12766c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i6, int i10, int i11) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i6), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static String b(int i6, boolean z10, int i10, int i11, int[] iArr, int i12) {
        char c10;
        String str = f12765b[i6];
        Integer valueOf = Integer.valueOf(i10);
        Integer valueOf2 = Integer.valueOf(i11);
        if (z10) {
            c10 = 'H';
        } else {
            c10 = 'L';
        }
        Object[] objArr = {str, valueOf, valueOf2, Character.valueOf(c10), Integer.valueOf(i12)};
        String str2 = a0.f12750a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i13 = 0; i13 < length; i13++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i13])));
        }
        return sb2.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair c(r1.q r33) {
        /*
            Method dump skipped, instructions count: 2152
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.d.c(r1.q):android.util.Pair");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0169, code lost:
    
        if (r12.equals("L60") == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0275  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair d(java.lang.String r11, java.lang.String[] r12, r1.h r13) {
        /*
            Method dump skipped, instructions count: 808
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.d.d(java.lang.String, java.lang.String[], r1.h):android.util.Pair");
    }
}
