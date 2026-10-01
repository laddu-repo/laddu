package com.unity3d.ads.core.utils;

import com.unity3d.ads.core.data.model.exception.ExposureException;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import he.a;
import kotlin.jvm.internal.k;
import le.c;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ContinuationFromCallback extends WebViewCallback {
    private final c continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContinuationFromCallback(c continuation) {
        super(HttpUrl.FRAGMENT_ENCODE_SET, 0);
        k.e(continuation, "continuation");
        this.continuation = continuation;
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void error(Enum<?> r52, Object... params) {
        k.e(params, "params");
        this.continuation.resumeWith(a.b(new ExposureException("Invocation failed with: " + r52, params)));
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void invoke(Object... params) {
        k.e(params, "params");
        this.continuation.resumeWith(params);
    }
}
