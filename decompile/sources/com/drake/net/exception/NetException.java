package com.drake.net.exception;

import java.io.IOException;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;
import okhttp3.Request;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class NetException extends IOException {
    private String occurred;
    private final Request request;

    public /* synthetic */ NetException(Request request, String str, Throwable th, int i6, f fVar) {
        this(request, (i6 & 2) != 0 ? null : str, (i6 & 4) != 0 ? null : th);
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (getMessage() == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str = getMessage() + ' ';
        }
        sb2.append(str);
        sb2.append(getRequest().url());
        sb2.append(this.occurred);
        return sb2.toString();
    }

    public final String getOccurred() {
        return this.occurred;
    }

    public Request getRequest() {
        return this.request;
    }

    public final void setOccurred(String str) {
        k.e(str, "<set-?>");
        this.occurred = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetException(Request request, String str, Throwable th) {
        super(str, th);
        k.e(request, "request");
        this.request = request;
        this.occurred = HttpUrl.FRAGMENT_ENCODE_SET;
    }
}
