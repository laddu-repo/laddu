package okhttp3.internal;

import df.m;
import df.u;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class HostnamesKt {
    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = str.charAt(i6);
            if (k.g(charAt, 31) <= 0 || k.g(charAt, 127) >= 0 || m.P(" #%/:?@[\\]", charAt, 0, 6) != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean decodeIpv4Suffix(String str, int i6, int i10, byte[] bArr, int i11) {
        int i12 = i11;
        while (i6 < i10) {
            if (i12 == bArr.length) {
                return false;
            }
            if (i12 != i11) {
                if (str.charAt(i6) != '.') {
                    return false;
                }
                i6++;
            }
            int i13 = i6;
            int i14 = 0;
            while (i13 < i10) {
                char charAt = str.charAt(i13);
                if (k.g(charAt, 48) < 0 || k.g(charAt, 57) > 0) {
                    break;
                }
                if ((i14 == 0 && i6 != i13) || (i14 = ((i14 * 10) + charAt) - 48) > 255) {
                    return false;
                }
                i13++;
            }
            if (i13 - i6 == 0) {
                return false;
            }
            bArr[i12] = (byte) i14;
            i12++;
            i6 = i13;
        }
        if (i12 != i11 + 4) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.net.InetAddress decodeIpv6(java.lang.String r10, int r11, int r12) {
        /*
            r0 = 16
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = -1
            r4 = 0
            r5 = -1
            r6 = -1
        L9:
            if (r11 >= r12) goto L76
            if (r4 != r0) goto Lf
            goto L7a
        Lf:
            int r7 = r11 + 2
            if (r7 > r12) goto L27
            java.lang.String r8 = "::"
            boolean r8 = df.u.G(r11, r10, r8, r2)
            if (r8 == 0) goto L27
            if (r5 == r3) goto L1f
            goto L7a
        L1f:
            int r4 = r4 + 2
            r5 = r4
            if (r7 != r12) goto L25
            goto L76
        L25:
            r6 = r7
            goto L49
        L27:
            if (r4 == 0) goto L33
            java.lang.String r7 = ":"
            boolean r7 = df.u.G(r11, r10, r7, r2)
            if (r7 == 0) goto L35
            int r11 = r11 + 1
        L33:
            r6 = r11
            goto L49
        L35:
            java.lang.String r7 = "."
            boolean r11 = df.u.G(r11, r10, r7, r2)
            if (r11 == 0) goto L7a
            int r11 = r4 + (-2)
            boolean r10 = decodeIpv4Suffix(r10, r6, r12, r1, r11)
            if (r10 != 0) goto L46
            goto L7a
        L46:
            int r4 = r4 + 2
            goto L76
        L49:
            r11 = r6
            r7 = 0
        L4b:
            if (r11 >= r12) goto L5d
            char r8 = r10.charAt(r11)
            int r8 = okhttp3.internal.Util.parseHexDigit(r8)
            if (r8 == r3) goto L5d
            int r7 = r7 << 4
            int r7 = r7 + r8
            int r11 = r11 + 1
            goto L4b
        L5d:
            int r8 = r11 - r6
            if (r8 == 0) goto L7a
            r9 = 4
            if (r8 <= r9) goto L65
            goto L7a
        L65:
            int r8 = r4 + 1
            int r9 = r7 >>> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r1[r4] = r9
            int r4 = r4 + 2
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r1[r8] = r7
            goto L9
        L76:
            if (r4 == r0) goto L88
            if (r5 != r3) goto L7c
        L7a:
            r10 = 0
            return r10
        L7c:
            int r10 = r4 - r5
            int r11 = 16 - r10
            java.lang.System.arraycopy(r1, r5, r1, r11, r10)
            int r0 = r0 - r4
            int r0 = r0 + r5
            java.util.Arrays.fill(r1, r5, r0, r2)
        L88:
            java.net.InetAddress r10 = java.net.InetAddress.getByAddress(r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.HostnamesKt.decodeIpv6(java.lang.String, int, int):java.net.InetAddress");
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, bg.k] */
    private static final String inet6AddressToAscii(byte[] bArr) {
        int i6 = -1;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < bArr.length) {
            int i13 = i11;
            while (i13 < 16 && bArr[i13] == 0 && bArr[i13 + 1] == 0) {
                i13 += 2;
            }
            int i14 = i13 - i11;
            if (i14 > i12 && i14 >= 4) {
                i6 = i11;
                i12 = i14;
            }
            i11 = i13 + 2;
        }
        ?? obj = new Object();
        while (i10 < bArr.length) {
            if (i10 == i6) {
                obj.l0(58);
                i10 += i12;
                if (i10 == 16) {
                    obj.l0(58);
                }
            } else {
                if (i10 > 0) {
                    obj.l0(58);
                }
                obj.n0((Util.and(bArr[i10], 255) << 8) | Util.and(bArr[i10 + 1], 255));
                i10 += 2;
            }
        }
        return obj.h0();
    }

    public static final String toCanonicalHost(String str) {
        InetAddress decodeIpv6;
        k.e(str, "<this>");
        if (m.I(str, ":", false)) {
            if (u.H(str, "[", false) && u.z(str, "]", false)) {
                decodeIpv6 = decodeIpv6(str, 1, str.length() - 1);
            } else {
                decodeIpv6 = decodeIpv6(str, 0, str.length());
            }
            if (decodeIpv6 != null) {
                byte[] address = decodeIpv6.getAddress();
                if (address.length == 16) {
                    return inet6AddressToAscii(address);
                }
                if (address.length == 4) {
                    return decodeIpv6.getHostAddress();
                }
                throw new AssertionError(w8.k.b('\'', "Invalid IPv6 address: '", str));
            }
            return null;
        }
        try {
            String ascii = IDN.toASCII(str);
            k.d(ascii, "toASCII(host)");
            Locale US = Locale.US;
            k.d(US, "US");
            String lowerCase = ascii.toLowerCase(US);
            k.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (lowerCase.length() != 0) {
                if (!containsInvalidHostnameAsciiCodes(lowerCase)) {
                    return lowerCase;
                }
                return null;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
