package com.unity3d.services.core.network.mapper;

import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.request.WebRequest;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class HttpRequestToWebRequestKt {
    public static final WebRequest toWebRequest(HttpRequest httpRequest) {
        k.e(httpRequest, "<this>");
        WebRequest webRequest = new WebRequest(httpRequest.getBaseURL(), httpRequest.getMethod().toString(), httpRequest.getHeaders(), httpRequest.getConnectTimeout(), httpRequest.getReadTimeout());
        Object body = httpRequest.getBody();
        if (body instanceof String) {
            webRequest.setBody((String) httpRequest.getBody());
            return webRequest;
        }
        if (body instanceof byte[]) {
            webRequest.setBody((byte[]) httpRequest.getBody());
        }
        return webRequest;
    }
}
