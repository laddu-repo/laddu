package com.unity3d.ads.core.domain.exposure;

import ne.c;
import ne.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1", f = "CommonAdViewerExposedFunctions.kt", l = {146}, m = "invoke")
/* loaded from: classes.dex */
public final class CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonAdViewerExposedFunctionsKt$setOrientation$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1(CommonAdViewerExposedFunctionsKt$setOrientation$1 commonAdViewerExposedFunctionsKt$setOrientation$1, le.c cVar) {
        super(cVar);
        this.this$0 = commonAdViewerExposedFunctionsKt$setOrientation$1;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((Object[]) null, (le.c) this);
    }
}
