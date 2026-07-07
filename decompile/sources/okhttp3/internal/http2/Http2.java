package okhttp3.internal.http2;

import bg.n;
import df.u;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import r4.a;
import w8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class Http2 {
    private static final String[] BINARY;
    public static final n CONNECTION_PREFACE;
    private static final String[] FLAGS;
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 32;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 32;
    private static final String[] FRAME_NAMES;
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;
    public static final Http2 INSTANCE = new Http2();
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;

    static {
        n nVar = n.A;
        CONNECTION_PREFACE = l.u("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        FRAME_NAMES = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        FLAGS = new String[64];
        String[] strArr = new String[256];
        for (int i6 = 0; i6 < 256; i6++) {
            String binaryString = Integer.toBinaryString(i6);
            k.d(binaryString, "toBinaryString(it)");
            strArr[i6] = u.E(Util.format("%8s", binaryString), ' ', '0');
        }
        BINARY = strArr;
        String[] strArr2 = FLAGS;
        strArr2[0] = HttpUrl.FRAGMENT_ENCODE_SET;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i10 = iArr[0];
        strArr2[i10 | 8] = a.o(new StringBuilder(), strArr2[i10], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr2[i11];
            int i13 = iArr[0];
            String[] strArr3 = FLAGS;
            int i14 = i13 | i12;
            strArr3[i14] = strArr3[i13] + '|' + strArr3[i12];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i13]);
            sb2.append('|');
            strArr3[i14 | 8] = a.o(sb2, strArr3[i12], "|PADDED");
        }
        int length = FLAGS.length;
        for (int i15 = 0; i15 < length; i15++) {
            String[] strArr4 = FLAGS;
            if (strArr4[i15] == null) {
                strArr4[i15] = BINARY[i15];
            }
        }
    }

    private Http2() {
    }

    public final String formatFlags(int i6, int i10) {
        String str;
        if (i10 == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (i6 != 2 && i6 != 3) {
            if (i6 != 4 && i6 != 6) {
                if (i6 != 7 && i6 != 8) {
                    String[] strArr = FLAGS;
                    if (i10 < strArr.length) {
                        str = strArr[i10];
                        k.b(str);
                    } else {
                        str = BINARY[i10];
                    }
                    if (i6 == 5 && (i10 & 4) != 0) {
                        return u.F(str, "HEADERS", "PUSH_PROMISE");
                    }
                    if (i6 == 0 && (i10 & 32) != 0) {
                        return u.F(str, "PRIORITY", "COMPRESSED");
                    }
                    return str;
                }
            } else {
                if (i10 == 1) {
                    return "ACK";
                }
                return BINARY[i10];
            }
        }
        return BINARY[i10];
    }

    public final String formattedType$okhttp(int i6) {
        String[] strArr = FRAME_NAMES;
        if (i6 < strArr.length) {
            return strArr[i6];
        }
        return Util.format("0x%02x", Integer.valueOf(i6));
    }

    public final String frameLog(boolean z10, int i6, int i10, int i11, int i12) {
        String str;
        String formattedType$okhttp = formattedType$okhttp(i11);
        String formatFlags = formatFlags(i11, i12);
        if (z10) {
            str = "<<";
        } else {
            str = ">>";
        }
        return Util.format("%s 0x%08x %5d %-13s %s", str, Integer.valueOf(i6), Integer.valueOf(i10), formattedType$okhttp, formatFlags);
    }
}
