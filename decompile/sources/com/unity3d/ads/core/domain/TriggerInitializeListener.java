package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import gf.f0;
import gf.y;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class TriggerInitializeListener {
    private final y coroutineDispatcher;

    public TriggerInitializeListener(y coroutineDispatcher) {
        k.e(coroutineDispatcher, "coroutineDispatcher");
        this.coroutineDispatcher = coroutineDispatcher;
    }

    public final void error(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String errorMsg) {
        k.e(unityAdsInitializationError, "unityAdsInitializationError");
        k.e(errorMsg, "errorMsg");
        f0.w(f0.b(this.coroutineDispatcher), null, new TriggerInitializeListener$error$1(unityAdsInitializationError, errorMsg, null), 3);
    }

    public final void success() {
        f0.w(f0.b(this.coroutineDispatcher), null, new TriggerInitializeListener$success$1(null), 3);
    }
}
