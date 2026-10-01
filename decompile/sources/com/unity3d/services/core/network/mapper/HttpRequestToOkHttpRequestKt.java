package com.unity3d.services.core.network.mapper;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.core.network.model.HttpRequest;
import df.m;
import ie.j;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class HttpRequestToOkHttpRequestKt {
    private static final RequestBody generateOkHttpBody(Object obj) {
        if (obj instanceof byte[]) {
            RequestBody create = RequestBody.create(MediaType.parse("text/plain;charset=utf-8"), (byte[]) obj);
            k.d(create, "create(MediaType.parse(\"…in;charset=utf-8\"), body)");
            return create;
        }
        if (obj instanceof String) {
            RequestBody create2 = RequestBody.create(MediaType.parse("text/plain;charset=utf-8"), (String) obj);
            k.d(create2, "create(MediaType.parse(\"…in;charset=utf-8\"), body)");
            return create2;
        }
        RequestBody create3 = RequestBody.create(MediaType.parse("text/plain;charset=utf-8"), HttpUrl.FRAGMENT_ENCODE_SET);
        k.d(create3, "create(MediaType.parse(\"…lain;charset=utf-8\"), \"\")");
        return create3;
    }

    private static final Headers generateOkHttpHeaders(HttpRequest httpRequest) {
        Headers.Builder builder = new Headers.Builder();
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            builder.add(entry.getKey(), j.L(entry.getValue(), ",", null, null, null, 62));
        }
        Headers build = builder.build();
        k.d(build, "Builder()\n    .also { he…ng(\",\")) } }\n    .build()");
        return build;
    }

    private static final RequestBody generateOkHttpProtobufBody(Object obj) {
        if (obj instanceof byte[]) {
            RequestBody create = RequestBody.create(MediaType.parse(CommonGatewayClient.HEADER_PROTOBUF), (byte[]) obj);
            k.d(create, "create(MediaType.parse(\"…ation/x-protobuf\"), body)");
            return create;
        }
        if (obj instanceof String) {
            RequestBody create2 = RequestBody.create(MediaType.parse(CommonGatewayClient.HEADER_PROTOBUF), (String) obj);
            k.d(create2, "create(MediaType.parse(\"…ation/x-protobuf\"), body)");
            return create2;
        }
        RequestBody create3 = RequestBody.create(MediaType.parse(CommonGatewayClient.HEADER_PROTOBUF), HttpUrl.FRAGMENT_ENCODE_SET);
        k.d(create3, "create(MediaType.parse(\"…ication/x-protobuf\"), \"\")");
        return create3;
    }

    public static final Request toOkHttpProtoRequest(HttpRequest httpRequest) {
        RequestBody requestBody;
        k.e(httpRequest, "<this>");
        Request.Builder url = new Request.Builder().url(m.Y(m.o0(httpRequest.getBaseURL(), '/') + '/' + m.o0(httpRequest.getPath(), '/'), "/"));
        String obj = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        if (body != null) {
            requestBody = generateOkHttpProtobufBody(body);
        } else {
            requestBody = null;
        }
        Request build = url.method(obj, requestBody).headers(generateOkHttpHeaders(httpRequest)).build();
        k.d(build, "Builder()\n    .url(\"${ba…tpHeaders())\n    .build()");
        return build;
    }

    public static final Request toOkHttpRequest(HttpRequest httpRequest) {
        RequestBody requestBody;
        k.e(httpRequest, "<this>");
        Request.Builder url = new Request.Builder().url(m.Y(m.o0(httpRequest.getBaseURL(), '/') + '/' + m.o0(httpRequest.getPath(), '/'), "/"));
        String obj = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        if (body != null) {
            requestBody = generateOkHttpBody(body);
        } else {
            requestBody = null;
        }
        Request build = url.method(obj, requestBody).headers(generateOkHttpHeaders(httpRequest)).build();
        k.d(build, "Builder()\n    .url(\"${ba…tpHeaders())\n    .build()");
        return build;
    }
}
