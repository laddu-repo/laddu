package com.unity3d.ads.adplayer;

import ne.c;
import ne.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {99}, m = "evaluateJavascript")
/* loaded from: classes.dex */
public final class AndroidWebViewContainer$evaluateJavascript$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidWebViewContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidWebViewContainer$evaluateJavascript$1(AndroidWebViewContainer androidWebViewContainer, le.c cVar) {
        super(cVar);
        this.this$0 = androidWebViewContainer;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.evaluateJavascript(null, null, this);
    }
}
