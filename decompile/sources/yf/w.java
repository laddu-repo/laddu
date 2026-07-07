package yf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f15105a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f15106b;

    static {
        String[] strArr = new String[93];
        for (int i6 = 0; i6 < 32; i6++) {
            strArr[i6] = "\\u" + b(i6 >> 12) + b(i6 >> 8) + b(i6 >> 4) + b(i6);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f15105a = strArr;
        byte[] bArr = new byte[93];
        for (int i10 = 0; i10 < 32; i10++) {
            bArr[i10] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f15106b = bArr;
    }

    public static final void a(StringBuilder sb2, String value) {
        kotlin.jvm.internal.k.e(value, "value");
        sb2.append('\"');
        int length = value.length();
        int i6 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = value.charAt(i10);
            String[] strArr = f15105a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb2.append((CharSequence) value, i6, i10);
                sb2.append(strArr[charAt]);
                i6 = i10 + 1;
            }
        }
        if (i6 != 0) {
            sb2.append((CharSequence) value, i6, value.length());
        } else {
            sb2.append(value);
        }
        sb2.append('\"');
    }

    public static final char b(int i6) {
        int i10;
        int i11 = i6 & 15;
        if (i11 < 10) {
            i10 = i11 + 48;
        } else {
            i10 = i11 + 87;
        }
        return (char) i10;
    }
}
