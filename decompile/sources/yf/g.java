package yf;

import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f15066a = new char[117];

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f15067b = new byte[WebSocketProtocol.PAYLOAD_SHORT];

    static {
        for (int i6 = 0; i6 < 32; i6++) {
        }
        a('b', 8);
        a('t', 9);
        a('n', 10);
        a('f', 12);
        a('r', 13);
        a('/', 47);
        a('\"', 34);
        a('\\', 92);
        byte[] bArr = f15067b;
        for (int i10 = 0; i10 < 33; i10++) {
            bArr[i10] = Byte.MAX_VALUE;
        }
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
    }

    public static void a(char c10, int i6) {
        if (c10 != 'u') {
            f15066a[c10] = (char) i6;
        }
    }
}
