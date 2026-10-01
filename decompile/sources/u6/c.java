package u6;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.UnityAdsConstants;
import df.u;
import okhttp3.Headers;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c {
    public static Headers a(Headers headers, Headers headers2) {
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i6 = 0; i6 < size; i6++) {
            String name = headers.name(i6);
            String value = headers.value(i6);
            if ((!"Warning".equalsIgnoreCase(name) || !u.H(value, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION, false)) && ("Content-Length".equalsIgnoreCase(name) || "Content-Encoding".equalsIgnoreCase(name) || CommonGatewayClient.HEADER_CONTENT_TYPE.equalsIgnoreCase(name) || !b(name) || headers2.get(name) == null)) {
                builder.addUnsafeNonAscii(name, value);
            }
        }
        int size2 = headers2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            String name2 = headers2.name(i10);
            if (!"Content-Length".equalsIgnoreCase(name2) && !"Content-Encoding".equalsIgnoreCase(name2) && !CommonGatewayClient.HEADER_CONTENT_TYPE.equalsIgnoreCase(name2) && b(name2)) {
                builder.addUnsafeNonAscii(name2, headers2.value(i10));
            }
        }
        return builder.build();
    }

    public static boolean b(String str) {
        if (!"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }
}
