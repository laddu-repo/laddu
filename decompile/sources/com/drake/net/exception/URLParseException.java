package com.drake.net.exception;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class URLParseException extends Exception {
    private String occurred;

    public URLParseException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return super.getLocalizedMessage() + this.occurred;
    }

    public final String getOccurred() {
        return this.occurred;
    }

    public final void setOccurred(String str) {
        k.e(str, "<set-?>");
        this.occurred = str;
    }

    public /* synthetic */ URLParseException(String str, Throwable th, int i6, f fVar) {
        this((i6 & 1) != 0 ? null : str, (i6 & 2) != 0 ? null : th);
    }

    public URLParseException(String str, Throwable th) {
        super(str, th);
        this.occurred = HttpUrl.FRAGMENT_ENCODE_SET;
    }
}
