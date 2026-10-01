package com.unity3d.services.core.network.model;

import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import ie.s;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class HttpResponseKt {
    public static final boolean isSuccessful(HttpResponse httpResponse) {
        k.e(httpResponse, "<this>");
        int statusCode = httpResponse.getStatusCode();
        if (200 > statusCode || statusCode >= 300) {
            return false;
        }
        return true;
    }

    public static final HttpResponse toHttpResponse(UnityAdsNetworkException unityAdsNetworkException) {
        int i6;
        String str;
        String str2;
        k.e(unityAdsNetworkException, "<this>");
        Integer code = unityAdsNetworkException.getCode();
        if (code != null) {
            i6 = code.intValue();
        } else {
            i6 = 520;
        }
        String url = unityAdsNetworkException.getUrl();
        if (url == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str = url;
        }
        String protocol = unityAdsNetworkException.getProtocol();
        if (protocol == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str2 = protocol;
        }
        String client = unityAdsNetworkException.getClient();
        if (client == null) {
            client = "unknown";
        }
        return new HttpResponse(HttpUrl.FRAGMENT_ENCODE_SET, i6, s.f6847x, str, str2, client, 0L, 64, null);
    }
}
