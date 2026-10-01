package com.unity3d.ads.beta;

import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class UnityAdsError {
    private final int code;
    private final String message;

    public UnityAdsError(int i6, String message) {
        k.e(message, "message");
        this.code = i6;
        this.message = message;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }
}
