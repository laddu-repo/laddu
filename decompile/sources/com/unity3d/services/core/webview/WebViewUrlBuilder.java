package com.unity3d.services.core.webview;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import okhttp3.HttpUrl;
import w8.k;
import y.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class WebViewUrlBuilder {
    private final SDKMetricsSender _sdkMetricsSender = (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);
    private final String _urlWithQueryString;

    public WebViewUrlBuilder(String str, Configuration configuration) {
        StringBuilder b10 = e.b("?platform=android" + buildQueryParam("origin", configuration.getWebViewUrl()));
        b10.append(buildQueryParam("version", configuration.getWebViewVersion()));
        StringBuilder b11 = e.b(b10.toString());
        b11.append(buildQueryParam("isNativeCollectingMetrics", String.valueOf(configuration.areMetricsEnabledForCurrentSession())));
        this._urlWithQueryString = k.c(str, b11.toString());
    }

    private String buildQueryParam(String str, String str2) {
        if (str2 != null) {
            try {
                return "&" + str + "=" + URLEncoder.encode(str2, "UTF-8");
            } catch (UnsupportedEncodingException e10) {
                DeviceLog.exception("Unsupported charset when encoding " + str, e10);
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public String getUrlWithQueryString() {
        return this._urlWithQueryString;
    }
}
