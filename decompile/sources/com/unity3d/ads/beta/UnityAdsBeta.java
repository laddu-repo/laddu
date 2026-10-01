package com.unity3d.ads.beta;

import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class UnityAdsBeta {
    public static final void getToken(TokenConfiguration configuration, TokenListener listener) {
        k.e(configuration, "configuration");
        k.e(listener, "listener");
    }

    public static final String getVersion() {
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public static final void initialize(InitializationConfiguration configuration, InitializationListener listener) {
        k.e(configuration, "configuration");
        k.e(listener, "listener");
    }

    public static final boolean isInitialize() {
        return true;
    }
}
