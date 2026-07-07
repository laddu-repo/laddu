package com.unity3d.ads.core.domain;

import gf.f0;
import gf.y;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CommonSafeCallbackInvoke implements SafeCallbackInvoke {
    private final y mainDispatcher;

    public CommonSafeCallbackInvoke(y mainDispatcher) {
        k.e(mainDispatcher, "mainDispatcher");
        this.mainDispatcher = mainDispatcher;
    }

    @Override // com.unity3d.ads.core.domain.SafeCallbackInvoke
    public void invoke(ve.a block) {
        k.e(block, "block");
        f0.w(f0.b(this.mainDispatcher), null, new CommonSafeCallbackInvoke$invoke$1(block, null), 3);
    }
}
