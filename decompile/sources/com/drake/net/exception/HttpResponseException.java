package com.drake.net.exception;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.Response;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class HttpResponseException extends NetException {
    private final Response response;

    public /* synthetic */ HttpResponseException(Response response, String str, Throwable th, int i6, f fVar) {
        this(response, (i6 & 2) != 0 ? null : str, (i6 & 4) != 0 ? null : th);
    }

    public Response getResponse() {
        return this.response;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpResponseException(Response response, String str, Throwable th) {
        super(response.request(), str, th);
        k.e(response, "response");
        this.response = response;
    }
}
