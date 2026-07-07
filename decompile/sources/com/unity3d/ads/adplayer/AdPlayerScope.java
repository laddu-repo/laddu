package com.unity3d.ads.adplayer;

import gf.a0;
import gf.c0;
import gf.f0;
import gf.y;
import kotlin.jvm.internal.k;
import le.h;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AdPlayerScope implements c0 {
    private final /* synthetic */ c0 $$delegate_0;
    private final y defaultDispatcher;
    private final a0 sdkErrorHandler;

    public AdPlayerScope(y defaultDispatcher, a0 sdkErrorHandler) {
        k.e(defaultDispatcher, "defaultDispatcher");
        k.e(sdkErrorHandler, "sdkErrorHandler");
        this.defaultDispatcher = defaultDispatcher;
        this.sdkErrorHandler = sdkErrorHandler;
        this.$$delegate_0 = f0.b(defaultDispatcher.plus(sdkErrorHandler));
    }

    @Override // gf.c0
    public h getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }
}
