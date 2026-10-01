package com.drake.net.exception;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.Request;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class NetSocketTimeoutException extends HttpFailureException {
    public /* synthetic */ NetSocketTimeoutException(Request request, String str, Throwable th, int i6, f fVar) {
        this(request, (i6 & 2) != 0 ? null : str, (i6 & 4) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetSocketTimeoutException(Request request, String str, Throwable th) {
        super(request, str, th);
        k.e(request, "request");
    }
}
