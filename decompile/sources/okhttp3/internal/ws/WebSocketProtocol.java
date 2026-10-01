package okhttp3.internal.ws;

import bg.i;
import bg.n;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import h8.c;
import kotlin.jvm.internal.k;
import w8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class WebSocketProtocol {
    public static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int B0_FLAG_FIN = 128;
    public static final int B0_FLAG_RSV1 = 64;
    public static final int B0_FLAG_RSV2 = 32;
    public static final int B0_FLAG_RSV3 = 16;
    public static final int B0_MASK_OPCODE = 15;
    public static final int B1_FLAG_MASK = 128;
    public static final int B1_MASK_LENGTH = 127;
    public static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    public static final long CLOSE_MESSAGE_MAX = 123;
    public static final int CLOSE_NO_STATUS_CODE = 1005;
    public static final WebSocketProtocol INSTANCE = new WebSocketProtocol();
    public static final int OPCODE_BINARY = 2;
    public static final int OPCODE_CONTINUATION = 0;
    public static final int OPCODE_CONTROL_CLOSE = 8;
    public static final int OPCODE_CONTROL_PING = 9;
    public static final int OPCODE_CONTROL_PONG = 10;
    public static final int OPCODE_FLAG_CONTROL = 8;
    public static final int OPCODE_TEXT = 1;
    public static final long PAYLOAD_BYTE_MAX = 125;
    public static final int PAYLOAD_LONG = 127;
    public static final int PAYLOAD_SHORT = 126;
    public static final long PAYLOAD_SHORT_MAX = 65535;

    private WebSocketProtocol() {
    }

    public final String acceptHeader(String key) {
        k.e(key, "key");
        n nVar = n.A;
        return l.u(key.concat(ACCEPT_MAGIC)).c(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).a();
    }

    public final String closeCodeExceptionMessage(int i6) {
        if (i6 >= 1000 && i6 < 5000) {
            if ((1004 <= i6 && i6 < 1007) || (1015 <= i6 && i6 < 3000)) {
                return c.j(i6, "Code ", " is reserved and may not be used.");
            }
            return null;
        }
        return c.i(i6, "Code must be in range [1000,5000): ");
    }

    public final void toggleMask(i cursor, byte[] key) {
        long j;
        k.e(cursor, "cursor");
        k.e(key, "key");
        int length = key.length;
        int i6 = 0;
        do {
            byte[] bArr = cursor.B;
            int i10 = cursor.C;
            int i11 = cursor.D;
            if (bArr != null) {
                while (i10 < i11) {
                    int i12 = i6 % length;
                    bArr[i10] = (byte) (bArr[i10] ^ key[i12]);
                    i10++;
                    i6 = i12 + 1;
                }
            }
            long j10 = cursor.A;
            bg.k kVar = cursor.f1720x;
            k.b(kVar);
            if (j10 != kVar.f1726y) {
                long j11 = cursor.A;
                if (j11 == -1) {
                    j = 0;
                } else {
                    j = j11 + (cursor.D - cursor.C);
                }
            } else {
                throw new IllegalStateException("no more bytes");
            }
        } while (cursor.f(j) != -1);
    }

    public final void validateCloseCode(int i6) {
        String closeCodeExceptionMessage = closeCodeExceptionMessage(i6);
        if (closeCodeExceptionMessage == null) {
            return;
        }
        k.b(closeCodeExceptionMessage);
        throw new IllegalArgumentException(closeCodeExceptionMessage.toString());
    }
}
