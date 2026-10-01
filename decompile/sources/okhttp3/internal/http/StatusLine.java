package okhttp3.internal.http;

import df.u;
import java.net.ProtocolException;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Response;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class StatusLine {
    public static final Companion Companion = new Companion(null);
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_MISDIRECTED_REQUEST = 421;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    public final int code;
    public final String message;
    public final Protocol protocol;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final StatusLine get(Response response) {
            k.e(response, "response");
            return new StatusLine(response.protocol(), response.code(), response.message());
        }

        public final StatusLine parse(String statusLine) {
            Protocol protocol;
            int i6;
            String str;
            k.e(statusLine, "statusLine");
            if (u.H(statusLine, "HTTP/1.", false)) {
                i6 = 9;
                if (statusLine.length() >= 9 && statusLine.charAt(8) == ' ') {
                    int charAt = statusLine.charAt(7) - '0';
                    if (charAt != 0) {
                        if (charAt == 1) {
                            protocol = Protocol.HTTP_1_1;
                        } else {
                            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                        }
                    } else {
                        protocol = Protocol.HTTP_1_0;
                    }
                } else {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
            } else if (u.H(statusLine, "ICY ", false)) {
                protocol = Protocol.HTTP_1_0;
                i6 = 4;
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int i10 = i6 + 3;
            if (statusLine.length() >= i10) {
                try {
                    String substring = statusLine.substring(i6, i10);
                    k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (statusLine.length() > i10) {
                        if (statusLine.charAt(i10) == ' ') {
                            str = statusLine.substring(i6 + 4);
                            k.d(str, "this as java.lang.String).substring(startIndex)");
                        } else {
                            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                        }
                    } else {
                        str = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    return new StatusLine(protocol, parseInt, str);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
            }
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }

        private Companion() {
        }
    }

    public StatusLine(Protocol protocol, int i6, String message) {
        k.e(protocol, "protocol");
        k.e(message, "message");
        this.protocol = protocol;
        this.code = i6;
        this.message = message;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.protocol == Protocol.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.code);
        sb2.append(' ');
        sb2.append(this.message);
        String sb3 = sb2.toString();
        k.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
